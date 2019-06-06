package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import android.widget.TextView;
import com.brightcove.player.R;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.view.BaseVideoView;

public class LiveButtonController extends AbstractButtonController {
    static final String d = "LiveButtonController";
    int e;
    int f;
    boolean g;
    ColorFilter h;
    ColorFilter i;
    private TextView j;
    private int k = 0;
    private SeekBar l;

    class b implements OnClickListener {
        private b() {
        }

        /* synthetic */ b(LiveButtonController liveButtonController, byte b) {
            this();
        }

        public final void onClick(View view) {
            Log.d(LiveButtonController.d, "Returning to live video...");
            LiveButtonController.this.c.seekToLive();
            LiveButtonController.a(LiveButtonController.this, true);
            if (!LiveButtonController.this.c.isPlaying()) {
                LiveButtonController.this.c.start();
            }
        }
    }

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(LiveButtonController liveButtonController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            LiveButtonController.this.getButton().setVisibility(4);
        }
    }

    class c implements EventListener {
        private c() {
        }

        /* synthetic */ c(LiveButtonController liveButtonController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.d(LiveButtonController.d, String.format("Processing event: %s.", new Object[]{event.getType()}));
            LiveButtonController.this.c.seekToLive();
            LiveButtonController.a(LiveButtonController.this, true);
            LiveButtonController.this.removeListener(EventType.DID_PLAY);
        }
    }

    class d implements EventListener {
        private d() {
        }

        /* synthetic */ d(LiveButtonController liveButtonController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.d(LiveButtonController.d, String.format("Processing event: %s.", new Object[]{event.getType()}));
            LiveButtonController liveButtonController = LiveButtonController.this;
            Log.v(LiveButtonController.d, "removeLiveEventHandlers");
            liveButtonController.removeListener(EventType.BUFFERED_UPDATE);
            liveButtonController.removeListener(EventType.DID_PLAY);
            liveButtonController.removeListener(EventType.DID_PAUSE);
            liveButtonController.removeListener(EventType.HIDE_SEEK_CONTROLS);
            liveButtonController.removeListener("progress");
            liveButtonController.removeListener(EventType.SHOW_SEEK_CONTROLS);
            if (LiveButtonController.this.c.getVideoDisplay().isLive()) {
                LiveButtonController.a(LiveButtonController.this);
            } else {
                LiveButtonController.this.a();
            }
        }
    }

    class e implements EventListener {
        private e() {
        }

        /* synthetic */ e(LiveButtonController liveButtonController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.d(LiveButtonController.d, String.format("Processing event: %s.", new Object[]{event.getType()}));
            LiveButtonController.a(LiveButtonController.this, false);
        }
    }

    class f implements EventListener {
        private f() {
        }

        /* synthetic */ f(LiveButtonController liveButtonController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            LiveButtonController.a(LiveButtonController.this, event.getIntegerProperty(Event.PLAYHEAD_POSITION) >= LiveButtonController.this.c.getVideoDisplay().getLiveEdge());
        }
    }

    class g implements EventListener {
        private g() {
        }

        /* synthetic */ g(LiveButtonController liveButtonController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            LiveButtonController.this.getButton().setVisibility(0);
        }
    }

    public LiveButtonController(Context context, BaseVideoView baseVideoView, View view, Typeface typeface) {
        Context context2 = context;
        super(context2, baseVideoView, view, R.id.live, typeface);
        this.l = (SeekBar) view.findViewById(R.id.seek_bar);
        this.j = (TextView) view.findViewById(R.id.current_time);
        this.b.add(new ButtonState(context2, R.string.brightcove_controls_live, R.string.desc_live, null, new b(this, (byte) 0)));
        this.e = a(R.color.bmc_live, -16711936);
        this.f = a(R.color.bmc_not_live, -1);
        addListener(EventType.DID_SET_VIDEO, new d(this, (byte) 0));
        addListener(EventType.ENTER_TV_MODE, new EventListener() {
            public final void processEvent(Event event) {
                LiveButtonController liveButtonController = LiveButtonController.this;
                liveButtonController.g = true;
                liveButtonController.h = new PorterDuffColorFilter(liveButtonController.e, Mode.MULTIPLY);
                liveButtonController = LiveButtonController.this;
                liveButtonController.i = new PorterDuffColorFilter(liveButtonController.f, Mode.MULTIPLY);
            }
        });
        a();
    }

    private int a(int i, int i2) {
        try {
            return VERSION.SDK_INT < 23 ? this.c.getResources().getColor(i) : this.c.getResources().getColor(i, null);
        } catch (NotFoundException unused) {
            Log.w(d, String.format("The resource with id (%1$x) cannot be found.  Going with the default.", new Object[]{Integer.valueOf(i)}));
            return i2;
        }
    }

    static /* synthetic */ void a(LiveButtonController liveButtonController) {
        Log.v(d, "addLiveEventHandlers");
        if (!liveButtonController.c.isPlaying()) {
            liveButtonController.addOnceListener(EventType.DID_PLAY, new c(liveButtonController, (byte) 0));
        }
        liveButtonController.addListener(EventType.DID_PAUSE, new e(liveButtonController, (byte) 0));
        liveButtonController.addListener(EventType.HIDE_SEEK_CONTROLS, new a(liveButtonController, (byte) 0));
        liveButtonController.addListener("progress", new f(liveButtonController, (byte) 0));
        liveButtonController.addListener(EventType.SHOW_SEEK_CONTROLS, new g(liveButtonController, (byte) 0));
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        addOnceListener(EventType.BUFFERED_UPDATE, new EventListener() {
            public final void processEvent(Event event) {
                if (LiveButtonController.this.c.getVideoDisplay().isLive()) {
                    LiveButtonController.a(LiveButtonController.this);
                }
            }
        });
    }

    public int getManagedState() {
        return 0;
    }

    public int getVisibilityState() {
        String str = d;
        StringBuilder stringBuilder = new StringBuilder("getVisibilityState: isLive = ");
        stringBuilder.append(this.c.getVideoDisplay().isLive());
        Log.v(str, stringBuilder.toString());
        return this.c.getVideoDisplay().isLive() ? 0 : 8;
    }
}
