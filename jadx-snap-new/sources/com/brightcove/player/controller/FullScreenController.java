package com.brightcove.player.controller;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.view.BaseVideoView;
import org.opencv.imgproc.Imgproc;

public final class FullScreenController {
    static final String a = "FullScreenController";
    Window b;
    BaseVideoView c;
    EventEmitter d;
    boolean e = false;
    Integer f;
    Integer g;
    private ActionBar h;

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(FullScreenController fullScreenController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            FullScreenController.a(FullScreenController.this, false);
            LayoutParams attributes = FullScreenController.this.b.getAttributes();
            attributes.flags |= Imgproc.INTER_TAB_SIZE2;
            FullScreenController.this.b.setAttributes(attributes);
            ViewGroup.LayoutParams layoutParams = FullScreenController.this.c.getLayoutParams();
            FullScreenController.this.f = Integer.valueOf(layoutParams.width);
            FullScreenController.this.g = Integer.valueOf(layoutParams.height);
            Log.v(FullScreenController.a, String.format("Saving normal screen size: %dx%d.", new Object[]{FullScreenController.this.f, FullScreenController.this.g}));
            layoutParams.width = -1;
            layoutParams.height = -1;
            FullScreenController.this.c.setLayoutParams(layoutParams);
            FullScreenController.this.d.emit(EventType.DID_ENTER_FULL_SCREEN);
        }
    }

    class b implements EventListener {
        private b() {
        }

        /* synthetic */ b(FullScreenController fullScreenController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            if (FullScreenController.this.c.getRenderView().isVrMode()) {
                Log.d(FullScreenController.a, "Cannot exit fullscreen mode, when VR mode is active!");
                return;
            }
            String str = FullScreenController.a;
            StringBuilder stringBuilder = new StringBuilder("Back to normal screen: ");
            stringBuilder.append(FullScreenController.this.f);
            stringBuilder.append("x");
            stringBuilder.append(FullScreenController.this.g);
            Log.v(str, stringBuilder.toString());
            if (!(FullScreenController.this.f == null || FullScreenController.this.g == null)) {
                FullScreenController.a(FullScreenController.this, true);
                LayoutParams attributes = FullScreenController.this.b.getAttributes();
                attributes.flags ^= Imgproc.INTER_TAB_SIZE2;
                FullScreenController.this.b.setAttributes(attributes);
                ViewGroup.LayoutParams layoutParams = FullScreenController.this.c.getLayoutParams();
                layoutParams.width = FullScreenController.this.f.intValue();
                layoutParams.height = FullScreenController.this.g.intValue();
                FullScreenController.this.c.setLayoutParams(layoutParams);
                FullScreenController fullScreenController = FullScreenController.this;
                fullScreenController.f = null;
                fullScreenController.g = null;
            }
            FullScreenController.this.d.emit(EventType.DID_EXIT_FULL_SCREEN);
        }
    }

    @TargetApi(11)
    public FullScreenController(BaseVideoView baseVideoView) {
        this.c = baseVideoView;
        this.d = baseVideoView.getEventEmitter();
        Context context = baseVideoView.getContext();
        ActionBar actionBar = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || this.d == null) {
            String str = a;
            EventEmitter eventEmitter = this.d;
            StringBuilder stringBuilder = new StringBuilder("Aborting because ");
            String str2 = (activity != null || eventEmitter == null) ? (activity == null || eventEmitter != null) ? "both the video view context is invalid (not an Activity) and the event emitter is invalid, it is null" : "the event emitter is invalid, it is null" : "the video view context is invalid (not an Activity)";
            stringBuilder.append(str2);
            stringBuilder.append(".");
            Log.wtf(str, stringBuilder.toString());
            return;
        }
        if ((VERSION.SDK_INT >= 11 ? 1 : null) != null) {
            actionBar = activity.getActionBar();
        }
        this.h = actionBar;
        this.b = activity.getWindow();
        this.d.on(EventType.ENTER_FULL_SCREEN, new a(this, (byte) 0));
        this.d.on(EventType.EXIT_FULL_SCREEN, new b(this, (byte) 0));
        this.d.on(EventType.DID_ENTER_FULL_SCREEN, new EventListener() {
            public final void processEvent(Event event) {
                FullScreenController.this.e = true;
            }
        });
        this.d.on(EventType.DID_EXIT_FULL_SCREEN, new EventListener() {
            public final void processEvent(Event event) {
                FullScreenController.this.e = false;
            }
        });
    }

    static /* synthetic */ void a(FullScreenController fullScreenController, boolean z) {
        ActionBar actionBar = fullScreenController.h;
        if (actionBar != null) {
            if (z) {
                actionBar.show();
                return;
            }
            actionBar.hide();
        }
    }

    public final boolean isFullScreen() {
        return this.e;
    }
}
