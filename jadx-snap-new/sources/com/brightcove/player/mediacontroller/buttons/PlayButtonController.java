package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import com.brightcove.player.R;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.mediacontroller.BrightcoveControlBar;
import com.brightcove.player.view.BaseVideoView;
import java.util.Map;

public class PlayButtonController extends AbstractButtonController {
    static final String d = "PlayButtonController";

    class a implements OnClickListener {
        private a() {
        }

        /* synthetic */ a(PlayButtonController playButtonController, byte b) {
            this();
        }

        public final void onClick(View view) {
            Log.d(PlayButtonController.d, "Resuming play...");
            PlayButtonController.this.c.start();
        }
    }

    class b implements EventListener {
        private b() {
        }

        /* synthetic */ b(PlayButtonController playButtonController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.d(PlayButtonController.d, String.format("Process event: %s.", new Object[]{event.getType()}));
            PlayButtonController.this.syncStates();
        }
    }

    public PlayButtonController(Context context, BaseVideoView baseVideoView, BrightcoveControlBar brightcoveControlBar, Typeface typeface) {
        Context context2 = context;
        super(context2, baseVideoView, brightcoveControlBar, R.id.play, typeface);
        OnClickListener aVar = new a(this, (byte) 0);
        Drawable image = brightcoveControlBar.getImage(BrightcoveControlBar.PLAY_IMAGE);
        Drawable image2 = brightcoveControlBar.getImage(BrightcoveControlBar.PAUSE_IMAGE);
        this.b.add(new ButtonState(context, R.string.brightcove_controls_play, R.string.desc_play, image, aVar));
        this.b.add(new ButtonState(context2, R.string.brightcove_controls_pause, R.string.desc_pause, image2, EventType.PAUSE));
        b bVar = new b(this, (byte) 0);
        addListener(EventType.DID_PLAY, bVar);
        addListener(EventType.DID_PAUSE, bVar);
        addListener(EventType.DID_SET_VIDEO, bVar);
        addListener(EventType.STOP, bVar);
        addListener(EventType.ACTIVITY_RESUMED, bVar);
        addListener(EventType.COMPLETED, bVar);
        syncStates();
    }

    public int getManagedState() {
        return this.c.isPlaying() ? 1 : 0;
    }

    public Map<String, Object> getProperties() {
        this.a.clear();
        this.a.put(Event.PLAYHEAD_POSITION, Integer.valueOf(this.c.getCurrentPosition()));
        return this.a;
    }

    public boolean onPlayPause(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1) {
            return false;
        }
        EventEmitter eventEmitter;
        String str;
        if (this.c.isPlaying()) {
            eventEmitter = this.eventEmitter;
            str = EventType.PAUSE;
        } else {
            eventEmitter = this.eventEmitter;
            str = EventType.PLAY;
        }
        eventEmitter.emit(str);
        return true;
    }
}
