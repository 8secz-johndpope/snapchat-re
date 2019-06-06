package com.brightcove.player.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import com.brightcove.player.analytics.Analytics;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.controller.BrightcoveAudioTracksController;
import com.brightcove.player.controller.BrightcoveClosedCaptioningController;
import com.brightcove.player.controller.DefaultSourceSelectionController;
import com.brightcove.player.controller.FullScreenController;
import com.brightcove.player.controller.MediaControlsVisibilityManager;
import com.brightcove.player.controller.VideoPlaybackController;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.display.VideoStillDisplayComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventEmitterImpl;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.management.BrightcovePluginManager;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.model.Video.Fields;
import com.brightcove.player.util.EventUtil;
import com.brightcove.player.util.LayoutUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@ListensFor(events = {"activityCreated", "activitySaveInstanceState", "activityStarted", "adProgress", "bufferedUpdate", "captionsLanguages", "completed", "didLoadClosedCaptions", "didPause", "didPlay", "didSeekTo", "didSetSource", "didSetVideo", "didStop", "hideSeekControls", "progress", "seekTo", "showSeekControls", "sourceNotPlayable", "videoDurationChanged", "willChangeVideo", "willInterruptContent", "willResumeContent"})
@Emits(events = {"didChangeList", "didSelectSource", "error", "pause", "play", "prebufferNextVideo", "readyToPlay", "seekTo", "selectSource", "setSource", "setVideo", "stop", "willChangeVideo", "on360FrameAvailable", "projectionFormatChanged"})
public abstract class BaseVideoView extends FrameLayout implements MediaPlayerControl, Component {
    static final String a = "BaseVideoView";
    private FullScreenController A;
    private List<OnVideoViewSizeChangedListener> B;
    protected EventEmitter b;
    protected VideoDisplayComponent c;
    protected int d;
    protected int e;
    int f;
    boolean g;
    boolean h;
    boolean i;
    ArrayList<Video> j;
    Map<Video, Source> k;
    int l;
    c m;
    OnCompletionListener n;
    protected OnPreparedListener o;
    BrightcoveClosedCaptioningView p;
    BrightcoveClosedCaptioningController q;
    MediaControlsVisibilityManager r;
    private VideoPlaybackController s;
    private DefaultSourceSelectionController t;
    private VideoStillDisplayComponent u;
    private BrightcovePluginManager v;
    private OnInfoListener w;
    private ImageView x;
    private Map<String, Integer> y;
    private BrightcoveAudioTracksController z;

    public interface OnVideoViewSizeChangedListener {
        void onVideoViewSizeChange(int i, int i2, int i3, int i4);
    }

    interface c {
        MediaController a();

        BrightcoveMediaController b();

        void c();

        void d();

        void e();

        void f();
    }

    public class OnProgressListener implements EventListener {
        protected OnProgressListener() {
        }

        @Default
        public void processEvent(Event event) {
            if (BaseVideoView.this.isPlaying()) {
                int integerProperty = event.getIntegerProperty("duration");
                if (integerProperty >= 0 && integerProperty != BaseVideoView.this.d) {
                    Log.v(BaseVideoView.a, String.format("Changing duration to %d.", new Object[]{Integer.valueOf(integerProperty)}));
                    BaseVideoView baseVideoView = BaseVideoView.this;
                    baseVideoView.d = integerProperty;
                    if (baseVideoView.m instanceof b) {
                        BaseVideoView.this.Y_();
                    }
                }
                int integerProperty2 = event.getIntegerProperty(Event.PLAYHEAD_POSITION);
                if (integerProperty2 >= 0 && integerProperty2 != BaseVideoView.this.e) {
                    Log.v(BaseVideoView.a, String.format("Changing playheadPosition to %d.", new Object[]{Integer.valueOf(integerProperty2)}));
                    BaseVideoView.this.e = integerProperty2;
                }
            }
        }
    }

    class a implements c {
        private BrightcoveMediaController a;

        public a(BrightcoveMediaController brightcoveMediaController) {
            this.a = brightcoveMediaController;
        }

        public final MediaController a() {
            return null;
        }

        public final BrightcoveMediaController b() {
            return this.a;
        }

        public final void c() {
            this.a.hide();
        }

        public final void d() {
            this.a.show();
        }

        public final void e() {
            if (this.a.isShowing()) {
                this.a.hide();
            } else {
                this.a.show();
            }
        }

        public final void f() {
        }
    }

    class b implements c {
        private MediaController a;
        private boolean b;

        public b(MediaController mediaController) {
            this.a = mediaController;
            Log.v(BaseVideoView.a, "attachMediaController...");
            MediaController mediaController2 = this.a;
            if (mediaController2 != null) {
                mediaController2.setMediaPlayer(BaseVideoView.this);
                this.a.setAnchorView(BaseVideoView.this.getParent() instanceof View ? (View) BaseVideoView.this.getParent() : BaseVideoView.this);
                if (BaseVideoView.this.V_()) {
                    this.a.setEnabled(true);
                    BaseVideoView.this.r.setVisibilityState();
                    d();
                    if (BaseVideoView.this.e > 0) {
                        Log.v(BaseVideoView.a, "MediaController is quietly jumping to where we left off.");
                    }
                }
            }
        }

        public final MediaController a() {
            return this.a;
        }

        public final BrightcoveMediaController b() {
            return null;
        }

        public final void c() {
            if (BaseVideoView.this.c()) {
                MediaController mediaController = this.a;
                if (mediaController != null) {
                    mediaController.hide();
                    this.b = false;
                }
            }
        }

        public final void d() {
            if (BaseVideoView.this.c()) {
                MediaController mediaController = this.a;
                if (mediaController != null) {
                    mediaController.show();
                    this.b = true;
                }
            }
        }

        public final void e() {
            if (this.a != null && BaseVideoView.this.c()) {
                if (this.a.isShowing()) {
                    this.a.hide();
                    return;
                }
                this.a.show();
            }
        }

        public final void f() {
            MediaController mediaController = this.a;
            if (mediaController != null) {
                mediaController.setMediaPlayer(BaseVideoView.this);
            }
        }
    }

    class d implements c {
        public final MediaController a() {
            return null;
        }

        public final BrightcoveMediaController b() {
            return null;
        }

        public final void c() {
        }

        public final void d() {
        }

        public final void e() {
        }

        public final void f() {
        }
    }

    public BaseVideoView(Context context) {
        super(context);
        this.j = new ArrayList();
        this.k = new HashMap();
        this.l = -1;
        this.y = new HashMap();
        a(context);
    }

    public BaseVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new ArrayList();
        this.k = new HashMap();
        this.l = -1;
        this.y = new HashMap();
        a(context);
    }

    private void a(final int i) {
        if (i == -1) {
            this.h = false;
            if (this.l == -1) {
                return;
            }
        }
        this.h = false;
        final int nextId = Event.getNextId();
        EventEmitter eventEmitter = this.b;
        AnonymousClass8 anonymousClass8 = new EventListener() {
            @Default
            public final void processEvent(Event event) {
                if (event.getId() == nextId) {
                    BaseVideoView.this.X_();
                    BaseVideoView.this.l = i;
                    Video video = (Video) event.properties.get(Event.NEXT_VIDEO);
                    if (video != null) {
                        if (BaseVideoView.this.m == null) {
                            BaseVideoView baseVideoView = BaseVideoView.this;
                            baseVideoView.m = new a(new BrightcoveMediaController(baseVideoView));
                        }
                        EventUtil.emit(BaseVideoView.this.b, EventType.SET_VIDEO, video);
                        return;
                    }
                    BaseVideoView.this.b.emit(EventType.SET_SOURCE);
                    return;
                }
                if (event.getId() < nextId) {
                    BaseVideoView.this.b.once(EventType.WILL_CHANGE_VIDEO, this);
                }
            }
        };
        String str = EventType.WILL_CHANGE_VIDEO;
        eventEmitter.once(str, anonymousClass8);
        HashMap hashMap = new HashMap();
        hashMap.put(Event.INDEX, Integer.valueOf(this.l));
        hashMap.put(Event.CURRENT_VIDEO, getCurrentVideo());
        Object obj = null;
        if (i >= 0 && i < this.j.size()) {
            obj = (Video) this.j.get(i);
        }
        hashMap.put(Event.NEXT_VIDEO, obj);
        hashMap.put("id", Integer.valueOf(nextId));
        this.b.emit(str, hashMap);
    }

    private void a(int i, int i2) {
        int i3 = this.l;
        if (i3 == -1 || i3 == i) {
            a(i);
        } else if (i < i3) {
            this.l = i3 + i2;
        } else {
            if (i3 >= 0 && i3 + 1 == i && this.g) {
                g();
            }
        }
    }

    static void a(Video video, Pair<Uri, BrightcoveCaptionFormat> pair) {
        Map properties = video.getProperties();
        String str = Fields.CAPTION_SOURCES;
        List list = (List) properties.get(str);
        if (list == null) {
            list = new ArrayList();
            video.getProperties().put(str, list);
        }
        list.add(pair);
    }

    private void f() {
        HashMap hashMap = new HashMap();
        hashMap.put(Event.LIST, this.j);
        this.b.emit(EventType.DID_CHANGE_LIST, hashMap);
    }

    private void g() {
        boolean h = h();
        String str = EventType.PREBUFFER_NEXT_VIDEO;
        if (h) {
            final Video video = (Video) this.j.get(this.l + 1);
            Source source = (Source) this.k.get(video);
            if (source != null) {
                EventUtil.emit(this.b, str, video, source);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(Event.VIDEO, video);
            this.b.request(EventType.SELECT_SOURCE, hashMap, new EventListener() {
                public final void processEvent(Event event) {
                    Source source = (Source) event.properties.get("source");
                    BaseVideoView.this.k.put(video, source);
                    EventUtil.emit(BaseVideoView.this.b, EventType.DID_SELECT_SOURCE, video, source);
                    EventUtil.emit(BaseVideoView.this.b, EventType.PREBUFFER_NEXT_VIDEO, video, source);
                }
            });
            return;
        }
        this.b.emit(str);
    }

    private boolean h() {
        return this.j.size() > 1 && this.l + 1 < this.j.size();
    }

    /* Access modifiers changed, original: protected */
    public boolean V_() {
        return this.c.getMediaPlayer() != null;
    }

    /* Access modifiers changed, original: protected */
    public void W_() {
        OnPreparedListener onPreparedListener = this.o;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared(this.c.getMediaPlayer());
        }
        if (this.w != null) {
            this.c.getMediaPlayer().setOnInfoListener(this.w);
        }
    }

    /* Access modifiers changed, original: protected */
    public void X_() {
        this.f = 0;
        this.e = 0;
        this.d = -1;
        a(false);
    }

    /* Access modifiers changed, original: final */
    public final void Y_() {
        if (this.m == null) {
            this.m = new a(new BrightcoveMediaController(this));
        }
        this.m.d();
    }

    public abstract VideoDisplayComponent a(EventEmitter eventEmitter);

    /* Access modifiers changed, original: protected */
    public void a(Context context) {
        Log.i(a, "init");
        X_();
        this.e = -1;
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.x = new ImageView(context);
        addView(this.x);
    }

    /* Access modifiers changed, original: protected */
    public void a(LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
        layoutParams2.gravity = 17;
        this.x.setLayoutParams(layoutParams2);
        BrightcoveClosedCaptioningView brightcoveClosedCaptioningView = this.p;
        if (brightcoveClosedCaptioningView != null) {
            brightcoveClosedCaptioningView.setLayoutParams(layoutParams2);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.g = z;
        c cVar = this.m;
        if (cVar != null) {
            cVar.f();
        }
        setKeepScreenOn(this.g);
    }

    public void add(int i, Video video) {
        this.j.add(i, video);
        f();
        a(i, 1);
    }

    public void add(Video video) {
        add(this.j.size(), video);
    }

    public void addAll(int i, Collection<Video> collection) {
        this.j.addAll(i, collection);
        f();
        a(i, collection.size());
    }

    public void addAll(Collection<Video> collection) {
        addAll(this.j.size(), collection);
    }

    public void addListener(String str, EventListener eventListener) {
        this.y.put(str, Integer.valueOf(this.b.on(str, eventListener)));
    }

    public void addOnVideoViewSizeChangedListener(OnVideoViewSizeChangedListener onVideoViewSizeChangedListener) {
        if (this.B == null) {
            this.B = new ArrayList();
        }
        this.B.add(onVideoViewSizeChangedListener);
    }

    @TargetApi(16)
    public void addSubtitleSource(Uri uri, BrightcoveCaptionFormat brightcoveCaptionFormat) {
        Video currentVideo = getCurrentVideo();
        final Pair create = Pair.create(uri, brightcoveCaptionFormat);
        if (currentVideo != null) {
            a(currentVideo, create);
            return;
        }
        this.b.once(EventType.WILL_CHANGE_VIDEO, new EventListener() {
            public final void processEvent(Event event) {
                Video video = (Video) event.properties.get(Event.NEXT_VIDEO);
                if (video != null) {
                    BaseVideoView.a(video, create);
                }
            }
        });
    }

    /* Access modifiers changed, original: protected */
    public DefaultSourceSelectionController b(EventEmitter eventEmitter) {
        return new DefaultSourceSelectionController(eventEmitter);
    }

    public abstract boolean c();

    public boolean canPause() {
        return true;
    }

    public boolean canSeekBackward() {
        return true;
    }

    public boolean canSeekForward() {
        return true;
    }

    public void clear() {
        Object obj = this.j.size() > 0 ? 1 : null;
        this.j.clear();
        this.k.clear();
        a(-1);
        if (obj != null) {
            f();
        }
    }

    public void clearOnCompletionListener() {
        this.n = null;
    }

    public void clearOnPreparedListener() {
        this.o = null;
    }

    public void disableClosedCaptioningRendering() {
        Log.v(a, "Disabling Closed Captioning View.");
        BrightcoveClosedCaptioningView brightcoveClosedCaptioningView = this.p;
        if (brightcoveClosedCaptioningView != null) {
            brightcoveClosedCaptioningView.clear();
            removeView(this.p);
            this.p = null;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        BrightcoveMediaController brightcoveMediaController = getBrightcoveMediaController();
        boolean dispatchKeyEvent = brightcoveMediaController != null ? brightcoveMediaController.dispatchKeyEvent(keyEvent) : false;
        return dispatchKeyEvent ? dispatchKeyEvent : super.dispatchKeyEvent(keyEvent);
    }

    public void finishInitialization() {
        if (this.b == null) {
            setEventEmitter(new EventEmitterImpl());
        }
        this.r = new MediaControlsVisibilityManager(this);
        this.r.initListeners(this.b);
        this.A = new FullScreenController(this);
    }

    public Video get(int i) {
        return (Video) this.j.get(i);
    }

    public Analytics getAnalytics() {
        VideoDisplayComponent videoDisplayComponent = this.c;
        return videoDisplayComponent != null ? videoDisplayComponent.getAnalytics() : null;
    }

    public int getAudioSessionId() {
        return 0;
    }

    public BrightcoveAudioTracksController getAudioTracksController() {
        return this.z;
    }

    public BrightcoveMediaController getBrightcoveMediaController() {
        c cVar = this.m;
        return cVar != null ? cVar.b() : null;
    }

    public int getBufferPercentage() {
        return this.f;
    }

    public BrightcoveClosedCaptioningController getClosedCaptioningController() {
        return this.q;
    }

    public BrightcoveClosedCaptioningView getClosedCaptioningView() {
        return this.p;
    }

    public int getCurrentIndex() {
        return this.l;
    }

    public int getCurrentPosition() {
        return this.e;
    }

    public Video getCurrentVideo() {
        int i = this.l;
        return (i < 0 || i >= this.j.size()) ? null : (Video) this.j.get(this.l);
    }

    public int getDuration() {
        return this.d;
    }

    public EventEmitter getEventEmitter() {
        EventEmitter eventEmitter = this.b;
        return eventEmitter == null ? null : ((RegisteringEventEmitter) eventEmitter).getRootEmitter();
    }

    public List<Video> getList() {
        return Collections.unmodifiableList(this.j);
    }

    public int getMeasuredVideoHeight() {
        return getRenderView().getMeasuredVideoHeight();
    }

    public int getMeasuredVideoWidth() {
        return getRenderView().getMeasuredVideoWidth();
    }

    public MediaController getMediaController() {
        c cVar = this.m;
        return cVar != null ? cVar.a() : null;
    }

    public VideoPlaybackController getPlaybackController() {
        return this.s;
    }

    public abstract RenderView getRenderView();

    public DefaultSourceSelectionController getSourceController() {
        return this.t;
    }

    public ImageView getStillView() {
        return this.x;
    }

    public VideoDisplayComponent getVideoDisplay() {
        return this.c;
    }

    public abstract int getVideoHeight();

    public VideoStillDisplayComponent getVideoStillDisplay() {
        return this.u;
    }

    public abstract int getVideoWidth();

    public boolean isFullScreen() {
        return this.A.isFullScreen();
    }

    public boolean isHlsRecommended() {
        return false;
    }

    public boolean isPlaying() {
        return this.g;
    }

    public void onControllerHide() {
        Log.i(a, "onControllerHide");
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        finishInitialization();
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onLayout: changed = ");
        stringBuilder.append(z);
        stringBuilder.append(", left = ");
        stringBuilder.append(i);
        stringBuilder.append(", top = ");
        stringBuilder.append(i2);
        stringBuilder.append(", right = ");
        stringBuilder.append(i3);
        stringBuilder.append(", bottom = ");
        stringBuilder.append(i4);
        Log.v(str, stringBuilder.toString());
        super.onLayout(z, i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onMeasure: width = ");
        stringBuilder.append(size);
        stringBuilder.append(", height = ");
        stringBuilder.append(size2);
        stringBuilder.append(", videoWidth = ");
        stringBuilder.append(getVideoWidth());
        stringBuilder.append(", videoHeight = ");
        stringBuilder.append(getVideoHeight());
        stringBuilder.append(", widthMode = ");
        stringBuilder.append(LayoutUtil.getSpecMode(mode));
        stringBuilder.append(", heightMode = ");
        stringBuilder.append(LayoutUtil.getSpecMode(mode2));
        Log.v(str, stringBuilder.toString());
        super.onMeasure(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onSizeChanged: width = ");
        stringBuilder.append(i);
        stringBuilder.append(", height = ");
        stringBuilder.append(i2);
        stringBuilder.append(", oldw = ");
        stringBuilder.append(i3);
        stringBuilder.append(", oldh = ");
        stringBuilder.append(i4);
        Log.v(str, stringBuilder.toString());
        super.onSizeChanged(i, i2, i3, i4);
        List<OnVideoViewSizeChangedListener> list = this.B;
        if (list != null) {
            for (OnVideoViewSizeChangedListener onVideoViewSizeChange : list) {
                onVideoViewSizeChange.onVideoViewSizeChange(i, i2, i3, i4);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        Log.i(a, "onTouchEvent");
        c cVar = this.m;
        if (cVar == null) {
            Y_();
        } else {
            cVar.e();
        }
        return false;
    }

    public void pause() {
        HashMap hashMap = new HashMap();
        hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(this.e));
        this.b.emit(EventType.PAUSE, hashMap);
    }

    /* JADX WARNING: Missing block: B:13:0x003b, code skipped:
            if (r3 < r2.j.size()) goto L_0x001f;
     */
    public void remove(int r3) {
        /*
        r2 = this;
        r0 = r2.j;
        r0 = r0.remove(r3);
        r0 = (com.brightcove.player.model.Video) r0;
        r1 = r2.k;
        r1.remove(r0);
        r0 = r2.l;
        if (r0 <= r3) goto L_0x0016;
    L_0x0011:
        r0 = r0 + -1;
        r2.l = r0;
        goto L_0x0049;
    L_0x0016:
        r0 = r2.j;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x0023;
    L_0x001e:
        r3 = -1;
    L_0x001f:
        r2.a(r3);
        goto L_0x0049;
    L_0x0023:
        r0 = r2.l;
        if (r0 != r3) goto L_0x003e;
    L_0x0027:
        r0 = r2.j;
        r0 = r0.size();
        if (r3 != r0) goto L_0x0035;
    L_0x002f:
        r3 = r3 + -1;
        r2.setCurrentIndex(r3);
        goto L_0x0049;
    L_0x0035:
        r0 = r2.j;
        r0 = r0.size();
        if (r3 >= r0) goto L_0x0049;
    L_0x003d:
        goto L_0x001f;
    L_0x003e:
        r0 = r0 + 1;
        if (r0 != r3) goto L_0x0049;
    L_0x0042:
        r3 = r2.g;
        if (r3 == 0) goto L_0x0049;
    L_0x0046:
        r2.g();
    L_0x0049:
        r2.f();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.view.BaseVideoView.remove(int):void");
    }

    public void removeListener(String str) {
        this.b.off(str, ((Integer) this.y.get(str)).intValue());
    }

    public void removeListeners() {
        for (String str : this.y.keySet()) {
            this.b.off(str, ((Integer) this.y.get(str)).intValue());
        }
        this.y.clear();
    }

    public void removeOnVideoViewSizeChangedListener(OnVideoViewSizeChangedListener onVideoViewSizeChangedListener) {
        List list = this.B;
        if (list != null) {
            list.remove(onVideoViewSizeChangedListener);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).requestLayout();
        }
    }

    public void seekTo(int i) {
        Log.d(a, "Seeking to ".concat(String.valueOf(i)));
        HashMap hashMap = new HashMap();
        hashMap.put(Event.SEEK_POSITION, Integer.valueOf(i));
        this.e = i;
        this.b.emit(EventType.SEEK_TO, hashMap);
    }

    public void seekToLive() {
    }

    public void setClosedCaptioningEnabled(boolean z) {
        this.q.saveClosedCaptioningState(z);
    }

    public void setCurrentIndex(int i) {
        if (i != this.l) {
            if (i < 0 || i >= this.j.size()) {
                throw new IndexOutOfBoundsException();
            }
            a(i);
        }
    }

    public void setEventEmitter(EventEmitter eventEmitter) {
        this.b = RegisteringEventEmitter.build(eventEmitter, getClass());
        this.s = new VideoPlaybackController(eventEmitter);
        this.t = b(eventEmitter);
        this.u = new VideoStillDisplayComponent(this.x, eventEmitter);
        this.v = new BrightcovePluginManager(eventEmitter);
        this.q = new BrightcoveClosedCaptioningController(this, getContext());
        this.c = a(eventEmitter);
        this.z = new BrightcoveAudioTracksController(this, getContext());
        addListener(EventType.SOURCE_NOT_PLAYABLE, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                BaseVideoView.this.b.emit(EventType.STOP);
            }
        });
        addListener(EventType.VIDEO_DURATION_CHANGED, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                int integerProperty = event.getIntegerProperty("duration");
                if (integerProperty > 0) {
                    Log.v(BaseVideoView.a, String.format("videoDurationChanged: changing duration to %d.", new Object[]{Integer.valueOf(integerProperty)}));
                    BaseVideoView baseVideoView = BaseVideoView.this;
                    baseVideoView.d = integerProperty;
                    baseVideoView.Y_();
                }
            }
        });
        OnProgressListener onProgressListener = new OnProgressListener();
        addListener("progress", onProgressListener);
        addListener(EventType.AD_PROGRESS, onProgressListener);
        addListener(EventType.DID_SET_SOURCE, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                BaseVideoView baseVideoView;
                BaseVideoView.this.W_();
                Video video = (Video) event.properties.get(Event.VIDEO);
                if (!(video == null || video.equals(BaseVideoView.this.getCurrentVideo()) || BaseVideoView.this.j.indexOf(video) < 0)) {
                    baseVideoView = BaseVideoView.this;
                    baseVideoView.l++;
                }
                baseVideoView = BaseVideoView.this;
                baseVideoView.h = true;
                if (baseVideoView.i) {
                    baseVideoView = BaseVideoView.this;
                    baseVideoView.i = false;
                    baseVideoView.b.emit(EventType.PLAY);
                }
                BaseVideoView.this.Y_();
            }
        });
        addListener(EventType.DID_SET_VIDEO, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                Video video = (Video) event.properties.get(Event.VIDEO);
                BaseVideoView baseVideoView = BaseVideoView.this;
                Log.v(BaseVideoView.a, "setupClosedCaptioningRendering");
                if (baseVideoView.q != null) {
                    if (baseVideoView.q.checkIfCaptionsExist(video)) {
                        baseVideoView.setupClosedCaptioningRendering();
                        return;
                    }
                    baseVideoView.disableClosedCaptioningRendering();
                }
            }
        });
        addListener(EventType.COMPLETED, new EventListener() {
            public final void processEvent(Event event) {
                if (BaseVideoView.this.n != null) {
                    BaseVideoView.this.n.onCompletion(null);
                }
                BaseVideoView baseVideoView = BaseVideoView.this;
                baseVideoView.e = 0;
                baseVideoView.a(false);
            }
        });
        addListener(EventType.BUFFERED_UPDATE, new EventListener() {
            public final void processEvent(Event event) {
                BaseVideoView.this.f = event.getIntegerProperty(Event.PERCENT_COMPLETE);
            }
        });
        addListener(EventType.SEEK_TO, new EventListener() {
            public final void processEvent(Event event) {
                int integerProperty = event.getIntegerProperty(Event.SEEK_POSITION);
                if (integerProperty >= 0) {
                    BaseVideoView.this.e = integerProperty;
                }
            }
        });
        addListener(EventType.DID_SEEK_TO, new EventListener() {
            public final void processEvent(Event event) {
                int integerProperty = event.getIntegerProperty(Event.PLAYHEAD_POSITION);
                if (integerProperty >= 0) {
                    BaseVideoView.this.e = integerProperty;
                }
            }
        });
        addListener(EventType.DID_PLAY, new EventListener() {
            public final void processEvent(Event event) {
                BaseVideoView.this.a(true);
                BaseVideoView.this.Y_();
                BaseVideoView.this.g();
            }
        });
        addListener(EventType.DID_STOP, new EventListener() {
            public final void processEvent(Event event) {
                BaseVideoView.this.X_();
            }
        });
        addListener(EventType.DID_PAUSE, new EventListener() {
            public final void processEvent(Event event) {
                BaseVideoView.this.a(false);
            }
        });
        addListener(EventType.WILL_INTERRUPT_CONTENT, new EventListener() {
            public final void processEvent(Event event) {
                BaseVideoView baseVideoView = BaseVideoView.this;
                baseVideoView.g = false;
                if (baseVideoView.m != null) {
                    BaseVideoView.this.m.c();
                    BaseVideoView.this.b.once("progress", new EventListener() {
                        public final void processEvent(Event event) {
                            BaseVideoView.this.Y_();
                        }
                    });
                }
            }
        });
        addListener(EventType.WILL_RESUME_CONTENT, new EventListener() {
            public final void processEvent(Event event) {
                BaseVideoView.this.g = true;
            }
        });
        addListener(EventType.DID_LOAD_CLOSED_CAPTIONS, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                if (BaseVideoView.this.p == null) {
                    return;
                }
                BaseVideoView baseVideoView;
                if (event.properties.containsKey(Event.TTML_DOCUMENT) || event.properties.containsKey(Event.WEBVTT_DOCUMENT)) {
                    if (BaseVideoView.this.p.getParent() == null) {
                        baseVideoView = BaseVideoView.this;
                        baseVideoView.addView(baseVideoView.p);
                    }
                } else if (BaseVideoView.this.p.getParent() != null) {
                    baseVideoView = BaseVideoView.this;
                    baseVideoView.removeView(baseVideoView.p);
                }
            }
        });
        addListener(EventType.CAPTIONS_LANGUAGES, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                List list = (List) event.properties.get(Event.LANGUAGES);
                if (list == null || list.isEmpty()) {
                    BaseVideoView.this.disableClosedCaptioningRendering();
                } else {
                    BaseVideoView.this.setupClosedCaptioningRendering();
                }
            }
        });
    }

    public void setLayoutParams(LayoutParams layoutParams) {
        Log.v(a, "setLayoutParams: ".concat(String.valueOf(layoutParams)));
        super.setLayoutParams(layoutParams);
        if (layoutParams != null) {
            a(layoutParams);
        }
    }

    public void setMediaController(MediaController mediaController) {
        this.m = mediaController != null ? new b(mediaController) : new d();
    }

    public void setMediaController(BrightcoveMediaController brightcoveMediaController) {
        this.m = brightcoveMediaController != null ? new a(brightcoveMediaController) : new d();
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.n = onCompletionListener;
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.w = onInfoListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.o = onPreparedListener;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    @android.annotation.TargetApi(16)
    public void setSubtitleLocale(java.lang.String r5) {
        /*
        r4 = this;
        r0 = r4.getCurrentVideo();
        r0 = r0.getProperties();
        r1 = "captionSources";
        r0 = r0.get(r1);
        r0 = (java.util.List) r0;
        if (r0 == 0) goto L_0x0062;
    L_0x0012:
        r0 = r0.iterator();
    L_0x0016:
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x0062;
    L_0x001c:
        r1 = r0.next();
        r1 = (android.util.Pair) r1;
        r2 = r1.first;
        r2 = (android.net.Uri) r2;
        r3 = android.net.Uri.EMPTY;
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0016;
    L_0x002e:
        r2 = r1.second;
        r2 = (com.brightcove.player.captioning.BrightcoveCaptionFormat) r2;
        r2 = r2.language();
        r2 = r2.equals(r5);
        if (r2 == 0) goto L_0x0016;
    L_0x003c:
        r0 = r4.q;
        r0.setLocaleCode(r5);
        r0 = 1;
        r2 = r4.q;
        r2 = r2.getLoadCaptionsService();
        if (r2 == 0) goto L_0x005a;
    L_0x004a:
        r3 = r1.first;
        r3 = (android.net.Uri) r3;
        r1 = r1.second;
        r1 = (com.brightcove.player.captioning.BrightcoveCaptionFormat) r1;
        r1 = r1.type();
        r2.loadCaptions(r3, r1);
        goto L_0x0063;
    L_0x005a:
        r1 = a;
        r2 = "setSubtitleLocale: LoadCaptionsService is null";
        android.util.Log.e(r1, r2);
        goto L_0x0063;
    L_0x0062:
        r0 = 0;
    L_0x0063:
        if (r0 != 0) goto L_0x007d;
    L_0x0065:
        r0 = a;
        r1 = new java.lang.StringBuilder;
        r2 = "setSubtitleLocale: subtitle for locale,";
        r1.<init>(r2);
        r1.append(r5);
        r5 = ", not found.";
        r1.append(r5);
        r5 = r1.toString();
        android.util.Log.e(r0, r5);
    L_0x007d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.view.BaseVideoView.setSubtitleLocale(java.lang.String):void");
    }

    public Video setVideoPath(String str) {
        if (h()) {
            this.b.emit(EventType.PREBUFFER_NEXT_VIDEO);
        }
        this.j.clear();
        this.k.clear();
        Video createVideo = Video.createVideo(str);
        add(createVideo);
        return createVideo;
    }

    public Video setVideoPath(String str, Map<String, String> map) {
        if (h()) {
            this.b.emit(EventType.PREBUFFER_NEXT_VIDEO);
        }
        this.j.clear();
        this.k.clear();
        Video createVideo = Video.createVideo(str);
        ArrayList arrayList = new ArrayList();
        createVideo.getProperties().put(Fields.CAPTION_SOURCES, arrayList);
        for (Entry entry : map.entrySet()) {
            if (!(entry == null || entry.toString().isEmpty())) {
                arrayList.add(Pair.create(Uri.parse((String) entry.getValue()), BrightcoveCaptionFormat.createCaptionFormat("text/unknown", (String) entry.getKey())));
            }
        }
        add(createVideo);
        return createVideo;
    }

    public Video setVideoURI(Uri uri) {
        return setVideoPath(uri.toString());
    }

    public void setupClosedCaptioningRendering() {
        Log.v(a, "Setting up the Closed Captioning View.");
        if (this.p == null) {
            this.p = new BrightcoveClosedCaptioningView(getContext());
            this.p.initialize(this.b, this);
            addView(this.p);
        }
    }

    public void start() {
        if (this.h) {
            this.i = false;
            this.b.emit(EventType.PLAY);
        } else if (this.j.isEmpty()) {
            Log.e(a, "No video to play.");
        } else {
            this.i = true;
        }
    }

    public void stopPlayback() {
        HashMap hashMap = new HashMap();
        hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(this.e));
        this.b.emit(EventType.STOP, hashMap);
    }
}
