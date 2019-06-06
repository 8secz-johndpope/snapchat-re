package com.brightcove.player.controller;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;
import java.util.Map;

public class MediaControlsVisibilityManager {
    static final String a = "MediaControlsVisibilityManager";
    final Map<String, Integer> b = new HashMap();
    private BaseVideoView c;

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(MediaControlsVisibilityManager mediaControlsVisibilityManager, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Object obj = event.properties.get(Event.SEEK_CONTROLS_VISIBILITY);
            if (obj != null && (obj instanceof Map)) {
                Map map = (Map) obj;
                MediaControlsVisibilityManager.this.b.clear();
                MediaControlsVisibilityManager.this.b.putAll(map);
                MediaControlsVisibilityManager.this.setVisibilityState();
            }
        }
    }

    class b implements EventListener {
        private b() {
        }

        /* synthetic */ b(MediaControlsVisibilityManager mediaControlsVisibilityManager, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(MediaControlsVisibilityManager.a, "Handling an ACTIVITY_CREATED event to (possibly) restore the media controls visibility state...");
            Object obj = event.properties.get(Event.INSTANCE_STATE);
            Bundle bundle = null;
            Bundle bundle2 = (obj == null || !(obj instanceof Bundle)) ? null : (Bundle) obj;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("mediaControlsVisibilityState");
            }
            if (bundle != null) {
                MediaControlsVisibilityManager mediaControlsVisibilityManager = MediaControlsVisibilityManager.this;
                Log.v(MediaControlsVisibilityManager.a, "Restoring media controls visibility state...");
                mediaControlsVisibilityManager.b.clear();
                for (String str : bundle.keySet()) {
                    int i = bundle.getInt(str);
                    if (i == 0) {
                        Log.w(MediaControlsVisibilityManager.a, String.format("Invalid visibility state (0) detected using key: %s.", new Object[]{str}));
                    } else {
                        mediaControlsVisibilityManager.b.put(str, Integer.valueOf(i));
                    }
                }
                return;
            }
            Log.v(MediaControlsVisibilityManager.a, "No saved visibility state bundle found.  Restoration aborted.");
        }
    }

    class c implements EventListener {
        private c() {
        }

        /* synthetic */ c(MediaControlsVisibilityManager mediaControlsVisibilityManager, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(MediaControlsVisibilityManager.a, "Handling an ACTIVITY_SAVE_INSTANCE_STATE event to save the media controls visibility state...");
            Object obj = event.properties.get(Event.INSTANCE_STATE);
            Bundle bundle = (obj == null || !(obj instanceof Bundle)) ? null : (Bundle) obj;
            if (bundle != null && MediaControlsVisibilityManager.this.b.size() > 0) {
                MediaControlsVisibilityManager mediaControlsVisibilityManager = MediaControlsVisibilityManager.this;
                Log.v(MediaControlsVisibilityManager.a, "Saving media controls visibility state...");
                Bundle bundle2 = new Bundle();
                bundle.putBundle("mediaControlsVisibilityState", bundle2);
                for (String str : mediaControlsVisibilityManager.b.keySet()) {
                    bundle2.putInt(str, ((Integer) mediaControlsVisibilityManager.b.get(str)).intValue());
                }
            }
        }
    }

    public MediaControlsVisibilityManager(BaseVideoView baseVideoView) {
        this.c = baseVideoView;
    }

    public void initListeners(EventEmitter eventEmitter) {
        a aVar = new a(this, (byte) 0);
        eventEmitter.on(EventType.HIDE_SEEK_CONTROLS, aVar);
        eventEmitter.on(EventType.SHOW_SEEK_CONTROLS, aVar);
        eventEmitter.on(EventType.ACTIVITY_CREATED, new b(this, (byte) 0));
        eventEmitter.on(EventType.ACTIVITY_SAVE_INSTANCE_STATE, new c(this, (byte) 0));
    }

    public void setVisibilityState() {
        Resources system = Resources.getSystem();
        MediaController mediaController = this.c.getMediaController();
        if (mediaController == null) {
            Log.e(a, "The visibility state cannot be restored!  No media controller exists.");
            return;
        }
        Log.v(a, "Updating the media controls visibility state...");
        for (String str : this.b.keySet()) {
            View findViewById = mediaController.findViewById(system.getIdentifier(str, "id", "android"));
            if (findViewById != null) {
                findViewById.setVisibility(((Integer) this.b.get(str)).intValue());
            } else {
                String str2 = a;
                StringBuilder stringBuilder = new StringBuilder("View/button: ");
                stringBuilder.append(str);
                stringBuilder.append(" does not exist!");
                Log.w(str2, stringBuilder.toString());
            }
        }
        mediaController.show();
    }
}
