package com.brightcove.player.mediacontroller;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.brightcove.player.R;
import com.brightcove.player.controller.BrightcovePlayerOptionsManager;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.mediacontroller.buttons.AudioTracksButtonController;
import com.brightcove.player.mediacontroller.buttons.ButtonController;
import com.brightcove.player.mediacontroller.buttons.CaptionsButtonController;
import com.brightcove.player.mediacontroller.buttons.FastForwardButtonController;
import com.brightcove.player.mediacontroller.buttons.FullScreenButtonController;
import com.brightcove.player.mediacontroller.buttons.LiveButtonController;
import com.brightcove.player.mediacontroller.buttons.PlayButtonController;
import com.brightcove.player.mediacontroller.buttons.PlayerOptionsButtonController;
import com.brightcove.player.mediacontroller.buttons.RemoteControlKeyState;
import com.brightcove.player.mediacontroller.buttons.RewindButtonController;
import com.brightcove.player.mediacontroller.buttons.VRButtonController;
import com.brightcove.player.model.CuePoint;
import com.brightcove.player.model.CuePoint.PositionType;
import com.brightcove.player.util.StringUtil;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class BrightcoveMediaController extends AbstractComponent implements ShowHideController {
    public static final String CONTROL_BAR_CREATED = "controlBarCreated";
    public static final int DEFAULT_TIMEOUT = 3000;
    public static final String DURATION = "duration";
    public static final String MARKER_LIST = "markerList";
    public static final String PROGRESS = "progress";
    public static final String SEEK_BAR_MAX = "seekBarMax";
    public static final String SEEK_BAR_PROGRESS = "seekBarProgress";
    public static final String SET_MARKERS = "setMarkers";
    static final String a = "BrightcoveMediaController";
    BrightcoveMediaControlRegistry b;
    BrightcoveControlBar c;
    TextView d;
    TextView e;
    BaseVideoView f;
    BrightcoveSeekBar g;
    BrightcoveSeekBarController h;
    BrightcoveShowHideController i;
    public final boolean isTvMode;
    boolean j;
    boolean k;
    private int l;
    private RemoteControlKeyState m;
    private RemoteControlKeyState n;
    private RemoteControlKeyState o;
    private RemoteControlKeyState p;
    private RemoteControlKeyState q;

    enum c {
        FADE,
        SLIDE
    }

    @SuppressLint({"ClickableViewAcessibility"})
    class m implements OnTouchListener {
        private m() {
        }

        /* synthetic */ m(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Log.d(BrightcoveMediaController.a, String.format("Processing onTouch for view: %s, with event: %s.", new Object[]{view, motionEvent}));
            if (motionEvent.getAction() == 0) {
                EventEmitter eventEmitter;
                String str;
                if (BrightcoveMediaController.this.isShowing()) {
                    Log.d(BrightcoveMediaController.a, "The control bar is showing, hide the media controls...");
                    eventEmitter = BrightcoveMediaController.this.eventEmitter;
                    str = ShowHideController.HIDE_MEDIA_CONTROLS;
                } else {
                    Log.d(BrightcoveMediaController.a, "The control bar is hidden, show the media controls...");
                    eventEmitter = BrightcoveMediaController.this.eventEmitter;
                    str = ShowHideController.SHOW_MEDIA_CONTROLS;
                }
                eventEmitter.emit(str);
            }
            return false;
        }
    }

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        public final void processEvent(Event event) {
            Log.d(BrightcoveMediaController.a, "Processing the activity created event...");
            Object obj = event.properties.get(Event.INSTANCE_STATE);
            if (obj != null && (obj instanceof Bundle)) {
                Bundle bundle = (Bundle) obj;
                if (bundle.size() > 0) {
                    BrightcoveMediaController.this.b(bundle);
                }
            }
        }
    }

    class b implements EventListener {
        private b() {
        }

        /* synthetic */ b(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        public final void processEvent(Event event) {
            BrightcoveMediaController.a(BrightcoveMediaController.this, event);
            BrightcoveMediaController.b(BrightcoveMediaController.this, event);
        }
    }

    class d implements EventListener {
        private d() {
        }

        /* synthetic */ d(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            int integerProperty = event.getIntegerProperty(Event.PERCENT_COMPLETE);
            if (integerProperty != -1 && BrightcoveMediaController.this.g != null) {
                BrightcoveMediaController.this.g.setSecondaryProgress((BrightcoveMediaController.this.g.getMax() * integerProperty) / 100);
            }
        }
    }

    class e implements EventListener {
        private e() {
        }

        /* synthetic */ e(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        public final void processEvent(Event event) {
            Log.d(BrightcoveMediaController.a, String.format("Processing a %s event...", new Object[]{event.getType()}));
            BrightcoveMediaController.this.i.removeListeners();
            if (BrightcoveMediaController.this.h != null) {
                BrightcoveMediaController.this.h.removeListeners();
            }
            for (ButtonController removeListeners : BrightcoveMediaController.this.b.getButtonControllers()) {
                removeListeners.removeListeners();
            }
            BrightcoveMediaController.a(BrightcoveMediaController.this, event);
            BrightcoveMediaController.b(BrightcoveMediaController.this, event);
            BrightcoveMediaController.this.f.removeView(BrightcoveMediaController.this.c);
            Object obj = event.properties.get(Event.INSTANCE_STATE);
            Bundle bundle = (obj == null || !(obj instanceof Bundle)) ? null : (Bundle) obj;
            BrightcoveMediaController.this.a(bundle);
        }
    }

    class f implements EventListener {
        private f() {
        }

        /* synthetic */ f(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.d(BrightcoveMediaController.a, String.format("Processing event: %1$s...", new Object[]{event.getType()}));
            BrightcoveMediaController.this.a();
            BrightcoveMediaController.this.eventEmitter.once(EventType.BUFFERED_UPDATE, new EventListener() {
                public final void processEvent(Event event) {
                    BrightcoveMediaController brightcoveMediaController;
                    int i;
                    boolean isLive = BrightcoveMediaController.this.f.getVideoDisplay().isLive();
                    boolean hasDvr = BrightcoveMediaController.this.f.getVideoDisplay().hasDvr();
                    if (!isLive || hasDvr) {
                        brightcoveMediaController = BrightcoveMediaController.this;
                        i = R.id.one_line_spacer;
                    } else {
                        BrightcoveMediaController.a(BrightcoveMediaController.this, R.id.one_line_spacer, 0);
                        BrightcoveMediaController.a(BrightcoveMediaController.this, R.id.current_time, 8);
                        brightcoveMediaController = BrightcoveMediaController.this;
                        i = R.id.seek_bar;
                    }
                    BrightcoveMediaController.a(brightcoveMediaController, i, 8);
                    if (isLive) {
                        BrightcoveMediaController.a(BrightcoveMediaController.this, R.id.live, 0);
                        BrightcoveMediaController.a(BrightcoveMediaController.this, R.id.time_separator, 8);
                        BrightcoveMediaController.a(BrightcoveMediaController.this, R.id.end_time, 8);
                    } else {
                        BrightcoveMediaController.a(BrightcoveMediaController.this, R.id.live, 8);
                        BrightcoveMediaController.a(BrightcoveMediaController.this, R.id.time_separator, 0);
                        BrightcoveMediaController.a(BrightcoveMediaController.this, R.id.end_time, 0);
                    }
                    BrightcoveMediaController brightcoveMediaController2 = BrightcoveMediaController.this;
                    View findViewById = brightcoveMediaController2.c.findViewById(PlayButtonController.DEFAULT_PLAY_BUTTON_ID);
                    if (findViewById != null) {
                        findViewById.requestFocus();
                    }
                }
            });
        }
    }

    class g implements EventListener {
        private g() {
        }

        /* synthetic */ g(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            if (event.getType() == EventType.SEEKBAR_DRAGGING_PROGRESS && BrightcoveMediaController.this.isDragging()) {
                int integerProperty = event.getIntegerProperty(Event.SEEK_PROGRESS);
                if (BrightcoveMediaController.this.d != null && integerProperty >= 0) {
                    BrightcoveMediaController.this.d.setText(StringUtil.stringForTime((long) integerProperty));
                }
            }
        }
    }

    class h implements EventListener {
        private h() {
        }

        /* synthetic */ h(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Object obj = event.properties.get(Event.CUE_POINT);
            if (obj != null && (obj instanceof CuePoint)) {
                CuePoint cuePoint = (CuePoint) obj;
                for (Integer num : BrightcoveMediaController.this.g.getMarkers()) {
                    if (cuePoint.getPositionType() == PositionType.POINT_IN_TIME && cuePoint.getPosition() == num.intValue()) {
                        BrightcoveMediaController.this.g.removeMarker(num);
                        return;
                    }
                }
            }
        }
    }

    class i implements EventListener {
        private i() {
        }

        /* synthetic */ i(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            if (BrightcoveMediaController.this.isDragging()) {
                Log.d(BrightcoveMediaController.a, "The seek bar is being dragged.  No progress updates are being applied.");
                return;
            }
            int integerProperty = event.getIntegerProperty(Event.PLAYHEAD_POSITION);
            if (BrightcoveMediaController.this.d != null) {
                BrightcoveMediaController.this.d.setText(StringUtil.stringForTime((long) integerProperty));
            }
            int integerProperty2 = event.getIntegerProperty("duration");
            if (!(BrightcoveMediaController.this.f.getVideoDisplay().isLive() || BrightcoveMediaController.this.e == null)) {
                BrightcoveMediaController.this.e.setText(StringUtil.stringForTime((long) integerProperty2));
            }
        }
    }

    class j implements EventListener {
        private j() {
        }

        /* synthetic */ j(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            if (BrightcoveMediaController.this.isDragging()) {
                Log.d(BrightcoveMediaController.a, "The seek bar is being dragged.  No SEEK_TO updates are being applied.");
                return;
            }
            Map map = event.properties;
            String str = Event.ORIGINAL_SEEK_POSITION;
            int integerProperty = map.containsKey(str) ? event.getIntegerProperty(str) : event.getIntegerProperty(Event.SEEK_POSITION);
            if (BrightcoveMediaController.this.d != null) {
                BrightcoveMediaController.this.d.setText(StringUtil.stringForTime((long) integerProperty));
            }
        }
    }

    class k implements EventListener {
        private k() {
        }

        /* synthetic */ k(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        public final void processEvent(Event event) {
            if (BrightcoveMediaController.this.j) {
                Object obj = event.properties.get(Event.CUE_POINT);
                if (!(obj instanceof CuePoint)) {
                    Log.e(BrightcoveMediaController.a, String.format("Invalid cue point {%s} found in the event payload.", new Object[]{obj.getClass()}));
                } else if (BrightcoveMediaController.this.g != null) {
                    CuePoint cuePoint = (CuePoint) obj;
                    if (cuePoint.getPositionType() == PositionType.POINT_IN_TIME) {
                        BrightcoveMediaController.this.g.addMarker(cuePoint.getPosition());
                    }
                }
            }
        }
    }

    class l implements EventListener {
        private l() {
        }

        /* synthetic */ l(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        public final void processEvent(Event event) {
            if (BrightcoveMediaController.this.j) {
                Object obj = event.properties.get(Event.CUE_POINTS);
                if (!(obj instanceof List)) {
                    Log.e(BrightcoveMediaController.a, String.format("Invalid cue point list {%s} found in the event payload.", new Object[]{obj.getClass().getSimpleName()}));
                } else if (BrightcoveMediaController.this.g != null) {
                    for (CuePoint cuePoint : (List) obj) {
                        if (cuePoint.getPositionType() == PositionType.POINT_IN_TIME) {
                            BrightcoveMediaController.this.g.addMarker(cuePoint.getPosition());
                        }
                    }
                }
            }
        }
    }

    class n implements EventListener {
        private n() {
        }

        /* synthetic */ n(BrightcoveMediaController brightcoveMediaController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            int integerProperty = event.getIntegerProperty("duration");
            if (!BrightcoveMediaController.this.f.getVideoDisplay().isLive() && BrightcoveMediaController.this.e != null) {
                BrightcoveMediaController.this.e.setText(StringUtil.stringForTime((long) integerProperty));
            }
        }
    }

    public BrightcoveMediaController(BaseVideoView baseVideoView) {
        this(baseVideoView, 0);
    }

    public BrightcoveMediaController(BaseVideoView baseVideoView, int i) {
        super(baseVideoView.getEventEmitter());
        this.j = true;
        this.isTvMode = checkTvMode(baseVideoView.getContext());
        this.f = baseVideoView;
        if (i == 0) {
            i = this.isTvMode ? R.layout.tv_media_controller : R.layout.default_media_controller;
        }
        this.l = i;
        this.b = new BrightcoveMediaControlRegistryImpl();
        this.f.setOnTouchListener(new m(this, (byte) 0));
        addListener(EventType.DID_SET_VIDEO, new f(this, (byte) 0));
        addListener(EventType.CONFIGURATION_CHANGED, new e(this, (byte) 0));
        addListener(EventType.ACTIVITY_CREATED, new a(this, (byte) 0));
        addListener(EventType.ACTIVITY_SAVE_INSTANCE_STATE, new b(this, (byte) 0));
        addListener(EventType.VIDEO_DURATION_CHANGED, new n(this, (byte) 0));
        addListener(EventType.REMOVE_CUE_POINT, new h(this, (byte) 0));
        i iVar = new i(this, (byte) 0);
        addListener("progress", iVar);
        addListener(EventType.AD_PROGRESS, iVar);
        addListener(EventType.COMPLETED, iVar);
        addListener(EventType.BUFFERED_UPDATE, new d(this, (byte) 0));
        addListener(EventType.SET_CUE_POINT, new k(this, (byte) 0));
        addListener(EventType.SET_CUE_POINTS, new l(this, (byte) 0));
        addListener(EventType.SEEK_TO, new j(this, (byte) 0));
        addListener(EventType.SEEKBAR_DRAGGING_PROGRESS, new g(this, (byte) 0));
        a(null);
        baseVideoView.setMediaController(this);
        RemoteControlKeyState remoteControlKeyState = (RemoteControlKeyState) this.b.getButtonController(PlayButtonController.DEFAULT_PLAY_BUTTON_ID);
        this.n = remoteControlKeyState;
        this.m = remoteControlKeyState;
        this.p = (RemoteControlKeyState) this.b.getButtonController(FastForwardButtonController.DEFAULT_FAST_FORWARD_BUTTON_ID);
        this.q = (RemoteControlKeyState) this.b.getButtonController(RewindButtonController.DEFAULT_REWIND_BUTTON_ID);
        AnonymousClass1 anonymousClass1 = new EventListener() {
            public final void processEvent(Event event) {
                BrightcoveMediaController brightcoveMediaController;
                boolean z;
                if (event.getType() == EventType.AD_BREAK_STARTED) {
                    brightcoveMediaController = BrightcoveMediaController.this;
                    z = true;
                } else {
                    brightcoveMediaController = BrightcoveMediaController.this;
                    z = false;
                }
                brightcoveMediaController.k = z;
            }
        };
        this.eventEmitter.on(EventType.AD_BREAK_STARTED, anonymousClass1);
        this.eventEmitter.on(EventType.AD_BREAK_COMPLETED, anonymousClass1);
        if (this.isTvMode) {
            this.eventEmitter.emit(EventType.ENTER_TV_MODE);
            this.eventEmitter.emit(EventType.ENTER_FULL_SCREEN);
        }
    }

    private View a(View view) {
        return view instanceof ViewGroup ? a(((ViewGroup) view).getFocusedChild()) : view;
    }

    private TextView a(int i, String str, Bundle bundle) {
        TextView textView = (TextView) this.c.findViewById(i);
        if (!(textView == null || bundle == null)) {
            textView.setText(bundle.containsKey(str) ? bundle.getString(str) : StringUtil.ZERO_TIME_STRING);
        }
        return textView;
    }

    private static c a(String str) {
        c cVar = c.FADE;
        try {
            cVar = c.valueOf(str.toUpperCase(Locale.US));
            return cVar;
        } catch (IllegalArgumentException unused) {
            Log.w(a, String.format("Invalid animation style: %s.", new Object[]{str}));
            return cVar;
        }
    }

    private String a(int i) {
        View findViewById = this.c.findViewById(i);
        TextView textView = (findViewById == null || !(findViewById instanceof TextView)) ? null : (TextView) findViewById;
        return textView != null ? textView.getText().toString() : "";
    }

    private void a(BrightcoveControlBar brightcoveControlBar, Bundle bundle) {
        ButtonController audioTracksButtonController;
        ButtonController buttonController;
        Context context = this.f.getContext();
        Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf");
        ButtonController buttonController2 = null;
        a(c(BrightcoveControlBar.PLAY) ? new PlayButtonController(context, this.f, brightcoveControlBar, createFromAsset) : null);
        if (c(BrightcoveControlBar.AUDIO_TRACKS)) {
            audioTracksButtonController = new AudioTracksButtonController(context, this.f, brightcoveControlBar, createFromAsset, bundle);
        } else {
            buttonController = null;
        }
        a(buttonController);
        if (c(BrightcoveControlBar.CLOSED_CAPTIONS)) {
            audioTracksButtonController = new CaptionsButtonController(context, this.f, brightcoveControlBar, createFromAsset, bundle);
        } else {
            buttonController = null;
        }
        a(buttonController);
        a(c(BrightcoveControlBar.FULL_SCREEN) ? new FullScreenButtonController(context, this.f, brightcoveControlBar, createFromAsset) : null);
        a(c(BrightcoveControlBar.LIVE) ? new LiveButtonController(context, this.f, brightcoveControlBar, createFromAsset) : null);
        a(c(BrightcoveControlBar.REWIND) ? new RewindButtonController(context, this.f, brightcoveControlBar, createFromAsset) : null);
        a(c(BrightcoveControlBar.FAST_FORWARD) ? new FastForwardButtonController(context, this.f, brightcoveControlBar, createFromAsset) : null);
        a(c(BrightcoveControlBar.PLAYER_OPTIONS) ? new PlayerOptionsButtonController(context, this.f, brightcoveControlBar, createFromAsset) : null);
        if (c(BrightcoveControlBar.VR_MODE)) {
            buttonController2 = new VRButtonController(context, this.f, brightcoveControlBar, createFromAsset);
        }
        a(buttonController2);
        View view = this.b.getView(PlayButtonController.DEFAULT_PLAY_BUTTON_ID);
        if (view != null) {
            d();
            view.requestFocus();
        }
    }

    private void a(ButtonController buttonController) {
        if (buttonController != null) {
            this.b.register(buttonController);
        }
    }

    private int b(int i) {
        ButtonController buttonController = this.b.getButtonController(i);
        String str = a;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = buttonController == null ? "null" : "is not null";
        Log.d(str, String.format("The controller with id: %x is %s.\n", objArr));
        return buttonController != null ? buttonController.getVisibilityState() : 8;
    }

    private static SparseArray<String> b() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.play, "Play");
        sparseArray.put(R.id.rewind, "Rewind");
        sparseArray.put(R.id.fast_forward, "FastForward");
        sparseArray.put(R.id.current_time, "ProgressTime");
        sparseArray.put(R.id.time_separator, "TimeSeparator");
        sparseArray.put(R.id.end_time, "DurationTime");
        sparseArray.put(R.id.seek_bar, "SeekBar");
        sparseArray.put(R.id.one_line_spacer, "OneLineSpacer");
        sparseArray.put(R.id.two_line_spacer, "TwoLineSpacer");
        sparseArray.put(R.id.live, "Live");
        sparseArray.put(R.id.audio_tracks, "Audio Tracks");
        sparseArray.put(R.id.captions, "Captions");
        sparseArray.put(R.id.full_screen, "FullScreen");
        sparseArray.put(R.id.player_options, "PlayerOptions");
        sparseArray.put(R.id.vr_mode, "VR Mode");
        return sparseArray;
    }

    static /* synthetic */ void b(BrightcoveMediaController brightcoveMediaController, Event event) {
        if (brightcoveMediaController.g != null) {
            Log.d(a, "Saving seek bar instance state...");
            Map map = event.properties;
            String str = Event.INSTANCE_STATE;
            Object obj = map.get(str);
            Bundle bundle = (obj == null || !(obj instanceof Bundle)) ? new Bundle() : (Bundle) obj;
            bundle.putInt(SEEK_BAR_MAX, brightcoveMediaController.g.getMax());
            bundle.putInt(SEEK_BAR_PROGRESS, brightcoveMediaController.g.getProgress());
            List markers = brightcoveMediaController.g.getMarkers();
            int[] iArr = new int[markers.size()];
            for (int i = 0; i < markers.size(); i++) {
                iArr[i] = ((Integer) markers.get(i)).intValue();
            }
            bundle.putIntArray(MARKER_LIST, iArr);
            event.properties.put(str, bundle);
        }
    }

    private void c() {
        this.i.setShowHideAnimationStyle(a(this.c.getStringResource(R.styleable.BrightcoveMediaController_brightcove_animation_style, ShowHideController.ANIMATION_STYLE_FADE)));
        this.i.setShowHideTimeout(this.c.getIntegerResource(R.styleable.BrightcoveMediaController_brightcove_timeout, DEFAULT_TIMEOUT));
        if (this.g != null) {
            int i = -1;
            if (this.isTvMode) {
                i = -256;
            }
            this.g.setMarkerColor(this.c.getColorResource(R.styleable.BrightcoveMediaController_brightcove_marker_color, i));
            this.g.setMarkerWidth(this.c.getFloatResource(R.styleable.BrightcoveMediaController_brightcove_marker_width, 5.0f));
        }
    }

    private void c(Bundle bundle) {
        Log.d(a, "Initializing the seek bar...");
        this.g = (BrightcoveSeekBar) this.c.findViewById(R.id.seek_bar);
        this.h = new BrightcoveSeekBarController(this.g, this.f);
        b(bundle);
    }

    private boolean c(int i) {
        return this.c.getBooleanResource(i);
    }

    public static boolean checkTvMode(Context context) {
        return context != null && ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4;
    }

    private void d() {
        this.n = this.m;
        this.o = null;
    }

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Missing block: B:23:0x0099, code skipped:
            if (r2 == false) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:37:0x00bc, code skipped:
            if (c(com.brightcove.player.mediacontroller.BrightcoveControlBar.SEEK_BAR) != false) goto L_0x0087;
     */
    /* JADX WARNING: Missing block: B:39:0x00d3, code skipped:
            if (r1 == false) goto L_0x0087;
     */
    public final void a() {
        /*
        r11 = this;
        r0 = a;
        r1 = "Setting the visibility on the player controls...";
        android.util.Log.d(r0, r1);
        r0 = r11.c;
        r1 = 4;
        r0.setVisibility(r1);
        r0 = b();
        r1 = r11.f;
        r1 = r1.getVideoDisplay();
        r1 = r1.isLive();
        r2 = r11.f;
        r2 = r2.getVideoDisplay();
        r2 = r2.hasDvr();
        r3 = a;
        r4 = 1;
        r5 = new java.lang.Object[r4];
        if (r1 == 0) goto L_0x002f;
    L_0x002c:
        r6 = "live";
        goto L_0x0031;
    L_0x002f:
        r6 = "not live";
    L_0x0031:
        r7 = 0;
        r5[r7] = r6;
        r6 = "The video is %1$s.";
        r5 = java.lang.String.format(r6, r5);
        android.util.Log.d(r3, r5);
        r3 = a;
        r5 = new java.lang.Object[r4];
        if (r2 == 0) goto L_0x0046;
    L_0x0043:
        r6 = "have";
        goto L_0x0048;
    L_0x0046:
        r6 = "not have";
    L_0x0048:
        r5[r7] = r6;
        r6 = "The video does %1$s DVR support.";
        r5 = java.lang.String.format(r6, r5);
        android.util.Log.d(r3, r5);
        r3 = 0;
    L_0x0054:
        r5 = r0.size();
        if (r3 >= r5) goto L_0x00f2;
    L_0x005a:
        r5 = r0.keyAt(r3);
        r6 = r11.c;
        r6 = r6.findViewById(r5);
        r8 = 2;
        if (r6 != 0) goto L_0x0081;
    L_0x0067:
        r6 = a;
        r8 = new java.lang.Object[r8];
        r9 = r0.get(r5);
        r8[r7] = r9;
        r5 = java.lang.Integer.valueOf(r5);
        r8[r4] = r5;
        r5 = "Null %1$s view found with resource id: %2$x.  This is probably OK.";
        r5 = java.lang.String.format(r5, r8);
        android.util.Log.w(r6, r5);
        goto L_0x00ee;
    L_0x0081:
        r9 = com.brightcove.player.R.id.two_line_spacer;
        r10 = 8;
        if (r5 != r9) goto L_0x0089;
    L_0x0087:
        r10 = 0;
        goto L_0x00d6;
    L_0x0089:
        r9 = r6 instanceof android.widget.Button;
        if (r9 == 0) goto L_0x0093;
    L_0x008d:
        r5 = r11.b(r5);
        r10 = r5;
        goto L_0x00d6;
    L_0x0093:
        r9 = com.brightcove.player.R.id.one_line_spacer;
        if (r5 != r9) goto L_0x009c;
    L_0x0097:
        if (r1 == 0) goto L_0x00d6;
    L_0x0099:
        if (r2 != 0) goto L_0x00d6;
    L_0x009b:
        goto L_0x0087;
    L_0x009c:
        r9 = com.brightcove.player.R.id.time_separator;
        if (r5 == r9) goto L_0x00d3;
    L_0x00a0:
        r9 = com.brightcove.player.R.id.end_time;
        if (r5 != r9) goto L_0x00a5;
    L_0x00a4:
        goto L_0x00d3;
    L_0x00a5:
        if (r1 == 0) goto L_0x00b2;
    L_0x00a7:
        if (r2 != 0) goto L_0x00b2;
    L_0x00a9:
        r9 = com.brightcove.player.R.id.current_time;
        if (r5 == r9) goto L_0x00d6;
    L_0x00ad:
        r9 = com.brightcove.player.R.id.seek_bar;
        if (r5 != r9) goto L_0x00b2;
    L_0x00b1:
        goto L_0x00d6;
    L_0x00b2:
        r9 = com.brightcove.player.R.id.seek_bar;
        if (r5 != r9) goto L_0x00bf;
    L_0x00b6:
        r5 = com.brightcove.player.mediacontroller.BrightcoveControlBar.SEEK_BAR;
        r5 = r11.c(r5);
        if (r5 == 0) goto L_0x00d6;
    L_0x00be:
        goto L_0x0087;
    L_0x00bf:
        r9 = a;
        r10 = new java.lang.Object[r4];
        r5 = r0.get(r5);
        r10[r7] = r5;
        r5 = "View %1$s has not been handled.  It will be visible.";
        r5 = java.lang.String.format(r5, r10);
        android.util.Log.w(r9, r5);
        goto L_0x0087;
    L_0x00d3:
        if (r1 != 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x0087;
    L_0x00d6:
        r5 = a;
        r8 = new java.lang.Object[r8];
        r8[r7] = r6;
        r9 = java.lang.Integer.valueOf(r10);
        r8[r4] = r9;
        r9 = "Setting visibility on view: (%1$s) to %2$d.";
        r8 = java.lang.String.format(r9, r8);
        android.util.Log.d(r5, r8);
        r6.setVisibility(r10);
    L_0x00ee:
        r3 = r3 + 1;
        goto L_0x0054;
    L_0x00f2:
        r0 = r11.c;
        r0.invalidate();
        r11.show();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.mediacontroller.BrightcoveMediaController.a():void");
    }

    /* Access modifiers changed, original: final */
    @TargetApi(12)
    public final void a(Bundle bundle) {
        Log.d(a, "Initializing the control bar...");
        this.b.clear();
        this.c = (BrightcoveControlBar) ((LayoutInflater) this.f.getContext().getSystemService("layout_inflater")).inflate(this.l, this.f, false);
        this.c.a(this.f);
        this.b.register(this.c);
        this.i = new BrightcoveShowHideController(this.c, this.f);
        a(this.c, bundle);
        this.d = a(R.id.current_time, "progress", bundle);
        this.e = a(R.id.end_time, "duration", bundle);
        if (c(BrightcoveControlBar.SEEK_BAR)) {
            c(bundle);
        }
        c();
        a();
        this.f.addView(this.c);
        this.eventEmitter.emit(CONTROL_BAR_CREATED);
    }

    /* Access modifiers changed, original: final */
    public final void b(Bundle bundle) {
        if (bundle != null && bundle.size() > 0 && this.g != null) {
            int i;
            String str = SEEK_BAR_MAX;
            if (bundle.containsKey(str)) {
                this.g.setMax(bundle.getInt(str));
            }
            str = SEEK_BAR_PROGRESS;
            int i2 = 0;
            if (bundle.containsKey(str)) {
                i = bundle.getInt(str);
                Log.d(a, String.format("Setting seekbar progress to %s.", new Object[]{Integer.valueOf(i)}));
                this.g.setProgress(i);
            }
            str = MARKER_LIST;
            if (bundle.containsKey(str)) {
                int[] intArray = bundle.getIntArray(str);
                i = intArray.length;
                while (i2 < i) {
                    this.g.addMarker(intArray[i2]);
                    i2++;
                }
            }
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        RemoteControlKeyState remoteControlKeyState;
        View a = a(this.c);
        if (this.b != null) {
            ButtonController buttonController = null;
            if (keyEvent.getAction() == 0) {
                if (a != null) {
                    buttonController = this.b.getButtonController(a.getId());
                }
                RemoteControlKeyState remoteControlKeyState2 = (RemoteControlKeyState) buttonController;
                remoteControlKeyState = this.o;
                if (remoteControlKeyState == null) {
                    remoteControlKeyState = this.m;
                }
                this.n = remoteControlKeyState;
                this.o = remoteControlKeyState2;
            }
        }
        remoteControlKeyState = this.n;
        if (remoteControlKeyState == null) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        boolean isShowing = isShowing();
        boolean isPlayerOptionsVisible = BrightcovePlayerOptionsManager.getInstance().isPlayerOptionsVisible();
        if (!(this.k || isPlayerOptionsVisible || keyEvent.getAction() != 1)) {
            show();
        }
        if (!(this.k || isPlayerOptionsVisible || isShowing)) {
            Object obj;
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    obj = 1;
                    break;
                default:
                    obj = null;
                    break;
            }
            if (obj != null) {
                return true;
            }
        }
        if (keyCode == 4 && isPlayerOptionsVisible) {
            if (keyEvent.getAction() == 1) {
                this.eventEmitter.emit(EventType.HIDE_PLAYER_OPTIONS);
            }
            return true;
        } else if (keyCode == 4) {
            return remoteControlKeyState.onBack(keyEvent);
        } else {
            if (keyCode == 85) {
                remoteControlKeyState = this.m;
                return remoteControlKeyState != null ? remoteControlKeyState.onPlayPause(keyEvent) : false;
            } else if (keyCode == 89) {
                remoteControlKeyState = this.q;
                return remoteControlKeyState != null ? remoteControlKeyState.onRewind(keyEvent) : false;
            } else if (keyCode != 90) {
                switch (keyCode) {
                    case 19:
                        return remoteControlKeyState.onDpadUp(keyEvent);
                    case 20:
                        return remoteControlKeyState.onDpadDown(keyEvent);
                    case 21:
                        return remoteControlKeyState.onDpadLeft(keyEvent);
                    case 22:
                        return remoteControlKeyState.onDpadRight(keyEvent);
                    case 23:
                        return remoteControlKeyState.onDpadCenter(keyEvent);
                    default:
                        return false;
                }
            } else {
                remoteControlKeyState = this.p;
                return remoteControlKeyState != null ? remoteControlKeyState.onFastForward(keyEvent) : false;
            }
        }
    }

    public BrightcoveControlBar getBrightcoveControlBar() {
        return this.c;
    }

    public BrightcoveSeekBar getBrightcoveSeekBar() {
        return this.g;
    }

    public BrightcoveMediaControlRegistry getMediaControlRegistry() {
        return this.b;
    }

    public void hide() {
        this.i.hide();
    }

    public boolean isDragging() {
        BrightcoveSeekBarController brightcoveSeekBarController = this.h;
        return brightcoveSeekBarController != null ? brightcoveSeekBarController.isDragging() : false;
    }

    public boolean isShowing() {
        return this.i.isShowing();
    }

    public void setCuePointMarkersEnabled(boolean z) {
        this.j = z;
    }

    public void setShowHideAnimationStyle(c cVar) {
        this.i.setShowHideAnimationStyle(cVar);
    }

    public void setShowHideTimeout(int i) {
        this.i.setShowHideTimeout(i);
    }

    public void show() {
        if (!this.i.isShowing()) {
            d();
        }
        this.i.show();
    }
}
