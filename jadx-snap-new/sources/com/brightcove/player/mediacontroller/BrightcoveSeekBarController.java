package com.brightcove.player.mediacontroller;

import android.util.Log;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.model.CuePoint;
import com.brightcove.player.model.CuePoint.PositionType;
import com.brightcove.player.view.BaseVideoView;
import java.util.List;
import java.util.Map;

public class BrightcoveSeekBarController extends AbstractComponent {
    static final String a = "BrightcoveSeekBarController";
    boolean b;
    BrightcoveSeekBar c;
    BaseVideoView d;
    int e;
    private f f = new f();

    class f implements OnSeekBarChangeListener {
        private int a = -1;
        private int b = 10;

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            int abs = Math.abs(i - this.a);
            if (z && this.b >= abs) {
                this.a = i;
                BrightcoveSeekBarController.this.eventEmitter.emit(ShowHideController.SHOW_MEDIA_CONTROLS);
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
            BrightcoveSeekBarController brightcoveSeekBarController = BrightcoveSeekBarController.this;
            brightcoveSeekBarController.eventEmitter.emit(ShowHideController.SHOW_MEDIA_CONTROLS);
            brightcoveSeekBarController.setDragging(true);
            this.b = Math.round(((float) seekBar.getMax()) * 0.01f);
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            BrightcoveSeekBarController.a(BrightcoveSeekBarController.this);
        }
    }

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(BrightcoveSeekBarController brightcoveSeekBarController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            int integerProperty = event.getIntegerProperty(Event.PERCENT_COMPLETE);
            if (integerProperty >= 0) {
                BrightcoveSeekBarController.this.c.setSecondaryProgress((BrightcoveSeekBarController.this.c.getMax() * integerProperty) / 100);
            }
        }
    }

    class b implements EventListener {
        private b() {
        }

        /* synthetic */ b(BrightcoveSeekBarController brightcoveSeekBarController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            String type = event.getType();
            if (type == EventType.SEEKBAR_DRAGGING_PROGRESS) {
                if (!BrightcoveSeekBarController.this.b) {
                    BrightcoveSeekBarController.this.setDragging(true);
                }
                int integerProperty = event.getIntegerProperty(Event.SEEK_PROGRESS);
                BrightcoveSeekBarController.this.eventEmitter.emit(ShowHideController.SHOW_MEDIA_CONTROLS);
                BrightcoveSeekBarController.this.c.setProgress(integerProperty);
                return;
            }
            if (type == EventType.SEEKBAR_DRAGGING_STOP) {
                BrightcoveSeekBarController.a(BrightcoveSeekBarController.this);
            }
        }
    }

    class c implements EventListener {
        private c() {
        }

        /* synthetic */ c(BrightcoveSeekBarController brightcoveSeekBarController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            BrightcoveSeekBarController.a(BrightcoveSeekBarController.this, event);
        }
    }

    class d implements EventListener {
        private d() {
        }

        /* synthetic */ d(BrightcoveSeekBarController brightcoveSeekBarController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            BrightcoveSeekBarController.this.c.setVisibility(4);
        }
    }

    class e implements EventListener {
        private e() {
        }

        /* synthetic */ e(BrightcoveSeekBarController brightcoveSeekBarController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            if (BrightcoveSeekBarController.this.isDragging()) {
                Log.v(BrightcoveSeekBarController.a, "The seek bar is being dragged.  No progress updates are being applied.");
                return;
            }
            BrightcoveSeekBarController.a(BrightcoveSeekBarController.this, event);
            int integerProperty = event.getIntegerProperty(Event.PLAYHEAD_POSITION);
            if (BrightcoveSeekBarController.this.d.getVideoDisplay().isLive()) {
                integerProperty -= BrightcoveSeekBarController.this.e;
                int integerProperty2 = event.getIntegerProperty(Event.MAX_POSITION);
                if (integerProperty2 > 0 && integerProperty > integerProperty2) {
                    integerProperty = integerProperty2;
                }
            }
            BrightcoveSeekBarController.this.c.setProgress(integerProperty);
        }
    }

    class g implements EventListener {
        private g() {
        }

        /* synthetic */ g(BrightcoveSeekBarController brightcoveSeekBarController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            if (BrightcoveSeekBarController.this.isDragging()) {
                Log.v(BrightcoveSeekBarController.a, "The seek bar is being dragged.  No SEEK_TO updates are being applied.");
                return;
            }
            Map map = event.properties;
            String str = Event.ORIGINAL_SEEK_POSITION;
            int integerProperty = map.containsKey(str) ? event.getIntegerProperty(str) : event.getIntegerProperty(Event.SEEK_POSITION);
            if (integerProperty != -1) {
                BrightcoveSeekBarController.this.c.setProgress(integerProperty);
            }
        }
    }

    class h implements EventListener {
        private h() {
        }

        /* synthetic */ h(BrightcoveSeekBarController brightcoveSeekBarController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Object obj = event.properties.get(BrightcoveMediaController.MARKER_LIST);
            int i = 0;
            if (obj != null && (obj instanceof int[])) {
                Log.d(BrightcoveSeekBarController.a, String.format("tbd %s", new Object[]{obj}));
                BrightcoveSeekBarController.this.c.clearMarkers();
                int[] iArr = (int[]) obj;
                int length = iArr.length;
                while (i < length) {
                    BrightcoveSeekBarController.this.c.addMarker(iArr[i]);
                    i++;
                }
            } else if (obj == null || !(obj instanceof List)) {
                BrightcoveSeekBarController.this.c.clearMarkers();
                Log.e(BrightcoveSeekBarController.a, String.format("The markers payload {%s} type is invalid.  Should be either int[], List<Integer> or List<CuePoint>.", new Object[]{obj.getClass().getSimpleName()}));
            } else {
                List list = (List) obj;
                if (list.isEmpty()) {
                    BrightcoveSeekBarController.this.c.clearMarkers();
                }
                for (Object next : list) {
                    int position;
                    Log.d(BrightcoveSeekBarController.a, String.format("Processing a marker item of type {%s}.", new Object[]{next.getClass().getSimpleName()}));
                    if (!(next instanceof Integer)) {
                        if (!(next instanceof CuePoint)) {
                            Log.e(BrightcoveSeekBarController.a, String.format("Invalid marker type {%s} encountered.", new Object[]{next.getClass().getSimpleName()}));
                            break;
                        }
                        CuePoint cuePoint = (CuePoint) next;
                        if (cuePoint.getPositionType() == PositionType.POINT_IN_TIME) {
                            position = cuePoint.getPosition();
                            Log.d(BrightcoveSeekBarController.a, String.format("Adding a marker at position {%d}.", new Object[]{Integer.valueOf(position)}));
                        }
                    } else {
                        position = ((Integer) next).intValue();
                    }
                    BrightcoveSeekBarController.this.c.addMarker(position);
                }
            }
        }
    }

    class i implements EventListener {
        private i() {
        }

        /* synthetic */ i(BrightcoveSeekBarController brightcoveSeekBarController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            BrightcoveSeekBarController.this.c.setVisibility(0);
        }
    }

    public BrightcoveSeekBarController(BrightcoveSeekBar brightcoveSeekBar, BaseVideoView baseVideoView) {
        super(baseVideoView.getEventEmitter());
        this.c = brightcoveSeekBar;
        this.d = baseVideoView;
        this.e = 0;
        brightcoveSeekBar.setOnSeekBarChangeListener(this.f);
        addListener(BrightcoveMediaController.SET_MARKERS, new h(this, (byte) 0));
        addListener(EventType.BUFFERED_UPDATE, new a(this, (byte) 0));
        addListener(EventType.HIDE_SEEK_CONTROLS, new d(this, (byte) 0));
        addListener(EventType.SHOW_SEEK_CONTROLS, new i(this, (byte) 0));
        addListener(EventType.VIDEO_DURATION_CHANGED, new c(this, (byte) 0));
        addListener("progress", new e(this, (byte) 0));
        addListener(EventType.AD_PROGRESS, new e(this, (byte) 0));
        addListener(EventType.COMPLETED, new e(this, (byte) 0));
        addListener(EventType.SEEK_TO, new g(this, (byte) 0));
        b bVar = new b(this, (byte) 0);
        addListener(EventType.SEEKBAR_DRAGGING_PROGRESS, bVar);
        addListener(EventType.SEEKBAR_DRAGGING_STOP, bVar);
    }

    static /* synthetic */ void a(BrightcoveSeekBarController brightcoveSeekBarController) {
        brightcoveSeekBarController.d.seekTo(brightcoveSeekBarController.c.getProgress() + brightcoveSeekBarController.e);
        brightcoveSeekBarController.eventEmitter.emit(ShowHideController.SHOW_MEDIA_CONTROLS);
        brightcoveSeekBarController.setDragging(false);
    }

    static /* synthetic */ void a(BrightcoveSeekBarController brightcoveSeekBarController, Event event) {
        int integerProperty = event.getIntegerProperty("duration");
        brightcoveSeekBarController.e = 0;
        if (brightcoveSeekBarController.d.getVideoDisplay().isLive()) {
            int integerProperty2 = event.getIntegerProperty(Event.MAX_POSITION);
            int integerProperty3 = event.getIntegerProperty(Event.MIN_POSITION);
            if (integerProperty2 > 0 && integerProperty3 >= 0) {
                integerProperty = integerProperty2 - integerProperty3;
                brightcoveSeekBarController.e = integerProperty3;
            }
        }
        brightcoveSeekBarController.c.setMax(integerProperty);
    }

    public boolean isDragging() {
        return this.b;
    }

    public void setDragging(boolean z) {
        this.b = z;
    }
}
