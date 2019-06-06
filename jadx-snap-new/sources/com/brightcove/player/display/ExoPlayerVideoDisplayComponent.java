package com.brightcove.player.display;

import android.annotation.SuppressLint;
import android.content.pm.PackageManager.NameNotFoundException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.brightcove.player.analytics.Analytics.Fields;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.display.VideoDisplayComponent.OnWillChangeVideoListener;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.render.AbstractRendererBuilder;
import com.brightcove.player.render.DashRendererBuilder;
import com.brightcove.player.render.ExtractorRendererBuilder;
import com.brightcove.player.render.HLSRendererBuilder;
import com.brightcove.player.util.EventUtil;
import com.brightcove.player.util.NumberUtil;
import com.brightcove.player.view.RenderView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.bbs;
import defpackage.bbx;
import defpackage.bby;
import defpackage.bbz;
import defpackage.bci;
import defpackage.bcp;
import defpackage.bcq;
import defpackage.bcs;
import defpackage.bdd;
import defpackage.bhf;
import defpackage.bhx;
import defpackage.bic;
import defpackage.bih;
import defpackage.bjj;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@ListensFor(events = {"selectAudioTrack", "selectClosedCaptionTrack", "on360FrameAvailable"})
@Emits(events = {"addAnalyticsBaseParams", "analyticsVideoEngagement", "audioTracks", "bufferingCompleted", "bufferingStarted", "caption", "captionsLanguages", "toggleClosedCaptions", "playWhenReadyCommitted", "renditionChanged"})
@SuppressLint({"ViewConstructor"})
public class ExoPlayerVideoDisplayComponent extends VideoDisplayComponent implements defpackage.bby.b, defpackage.bcd.a, defpackage.bch.a, defpackage.bcz.a, defpackage.bdk.a, defpackage.bel.a, defpackage.bhf.b, defpackage.bhm.a, defpackage.bht.a<List<bhx>>, bih, defpackage.bjj.a {
    public static final String BUFFERED_POSITION = "bufferedPosition";
    public static final int DISABLED_TRACK = -1;
    private static final ScheduledExecutorService E = Executors.newScheduledThreadPool(1);
    public static final String EXOPLAYER_FORMAT = "exoplayerFormat";
    private static ResourceBundle F = null;
    public static final String IN_MANIFEST_CC_URI_STR = "brightcove://in-manifest";
    public static final String PLAY_WHEN_READY_COMMITTED = "playWhenReadyCommitted";
    public static final int RENDERER_COUNT = 4;
    public static final String RENDITION_CHANGED = "renditionChanged";
    public static final int TYPE_AUDIO = 1;
    public static final int TYPE_METADATA = 3;
    public static final int TYPE_TEXT = 2;
    public static final int TYPE_VIDEO = 0;
    static final String a = "ExoPlayerVideoDisplayComponent";
    private Handler G;
    private RendererBuilder H;
    private k I;
    private InternalErrorListener J;
    private Id3MetadataListener K;
    private InfoListener L;
    private CaptionListener M;
    private bcq N;
    private bdd O;
    private bjj P;
    private int Q;
    private int[] R;
    private bbs S;
    private int T;
    private boolean U;
    private int V;
    private boolean W;
    private long X;
    private long Y;
    private int Z;
    private int aa;
    private bhf ab;
    private final Runnable ac;
    int[] b;
    bcq[] c;
    bby d;
    bcq e;
    int f;
    boolean g;
    boolean h;
    long i;
    long j;

    /* renamed from: com.brightcove.player.display.ExoPlayerVideoDisplayComponent$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[DeliveryType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.brightcove.player.media.DeliveryType.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.brightcove.player.media.DeliveryType.DASH;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.brightcove.player.media.DeliveryType.HLS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.brightcove.player.media.DeliveryType.MP4;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.display.ExoPlayerVideoDisplayComponent$AnonymousClass3.<clinit>():void");
        }
    }

    public interface CaptionListener {
        void onCues(List<bic> list);
    }

    public interface Id3MetadataListener {
        void onId3Metadata(List<bhx> list);
    }

    public interface InfoListener {
        void onAudioFormatEnabled(bdd bdd, int i, long j);

        void onAvailableRangeChanged(bcp bcp);

        void onBandwidthSample(int i, long j, long j2);

        void onDecoderInitialized(String str, long j, long j2);

        void onDroppedFrames(int i, long j);

        void onLoadCompleted(int i, long j, int i2, int i3, bdd bdd, long j2, long j3, long j4, long j5);

        void onLoadStarted(int i, long j, int i2, int i3, bdd bdd, long j2, long j3);

        void onVideoFormatEnabled(bdd bdd, int i, long j);
    }

    public interface InternalErrorListener {
        void onAudioTrackInitializationError(defpackage.bct.d dVar);

        void onAudioTrackUnderrun(int i, long j, long j2);

        void onAudioTrackWriteError(defpackage.bct.e eVar);

        void onCryptoError(CryptoException cryptoException);

        void onDecoderInitializationError(defpackage.bcf.a aVar);

        void onDrmSessionManagerError(Exception exception);

        void onLoadError(int i, IOException iOException);

        void onRendererInitializationError(Exception exception);
    }

    public interface RendererBuilder {
        void buildRenderers(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, RendererBuilderCallback rendererBuilderCallback);

        void cancel();
    }

    public interface RendererBuilderCallback {
        void onRenderers(bcq[] bcqArr, bjj bjj);

        void onRenderersError(Exception exception);
    }

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnCompletedListener:");
            if (ExoPlayerVideoDisplayComponent.this.d != null) {
                ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                exoPlayerVideoDisplayComponent.y = 0;
                exoPlayerVideoDisplayComponent.d.a(0);
                ExoPlayerVideoDisplayComponent.this.i();
            }
            if (ExoPlayerVideoDisplayComponent.this.C != null) {
                final UUID randomUUID = UUID.randomUUID();
                EventEmitter eventEmitter = ExoPlayerVideoDisplayComponent.this.eventEmitter;
                AnonymousClass1 anonymousClass1 = new EventListener() {
                    @Default
                    public final void processEvent(Event event) {
                        Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnCompletedListener: WILL_CHANGE_VIDEO");
                        if (randomUUID.equals(event.properties.get("uuid"))) {
                            ExoPlayerVideoDisplayComponent.this.d();
                            String str = ExoPlayerVideoDisplayComponent.a;
                            StringBuilder stringBuilder = new StringBuilder("ExoPlayerOnCompletedListener: currentSource = ");
                            stringBuilder.append(ExoPlayerVideoDisplayComponent.this.A);
                            stringBuilder.append(", nextSource = ");
                            stringBuilder.append(ExoPlayerVideoDisplayComponent.this.C);
                            Log.v(str, stringBuilder.toString());
                            ExoPlayerVideoDisplayComponent.this.z = ExoPlayerVideoDisplayComponent.this.B;
                            ExoPlayerVideoDisplayComponent.this.B = null;
                            ExoPlayerVideoDisplayComponent.this.A = ExoPlayerVideoDisplayComponent.this.C;
                            ExoPlayerVideoDisplayComponent.this.C = null;
                            ExoPlayerVideoDisplayComponent.this.eventEmitter.once(EventType.DID_SET_SOURCE, new EventListener() {
                                @Default
                                public final void processEvent(Event event) {
                                    ExoPlayerVideoDisplayComponent.this.eventEmitter.emit(EventType.PLAY);
                                }
                            });
                            ExoPlayerVideoDisplayComponent.this.a(ExoPlayerVideoDisplayComponent.this.z, ExoPlayerVideoDisplayComponent.this.A);
                        }
                    }
                };
                String str = EventType.WILL_CHANGE_VIDEO;
                eventEmitter.once(str, anonymousClass1);
                HashMap hashMap = new HashMap();
                hashMap.put(Event.CURRENT_VIDEO, ExoPlayerVideoDisplayComponent.this.z);
                hashMap.put(Event.NEXT_VIDEO, ExoPlayerVideoDisplayComponent.this.B);
                hashMap.put("uuid", randomUUID);
                ExoPlayerVideoDisplayComponent.this.eventEmitter.emit(str, hashMap);
            }
        }
    }

    class b implements EventListener {
        private b() {
        }

        /* synthetic */ b(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnPauseListener");
            if (ExoPlayerVideoDisplayComponent.this.d != null) {
                ExoPlayerVideoDisplayComponent.this.i();
            }
        }
    }

    class c implements EventListener {
        private c() {
        }

        /* synthetic */ c(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnPlayListener:");
            ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
            exoPlayerVideoDisplayComponent.h = false;
            if (exoPlayerVideoDisplayComponent.A != null) {
                int integerProperty;
                Map map = event.properties;
                String str = Event.PLAYHEAD_POSITION;
                if (map.containsKey(str)) {
                    integerProperty = event.getIntegerProperty(str);
                } else {
                    String str2 = ExoPlayerVideoDisplayComponent.a;
                    StringBuilder stringBuilder = new StringBuilder("ExoPlayerOnPlayListener: playheadPosition = ");
                    stringBuilder.append(ExoPlayerVideoDisplayComponent.this.y);
                    Log.v(str2, stringBuilder.toString());
                    integerProperty = ExoPlayerVideoDisplayComponent.this.y;
                }
                if (ExoPlayerVideoDisplayComponent.this.d != null) {
                    ExoPlayerVideoDisplayComponent.this.a((long) integerProperty);
                    return;
                }
                ExoPlayerVideoDisplayComponent.this.eventEmitter.once(EventType.DID_SET_SOURCE, new EventListener() {
                    @Default
                    public final void processEvent(Event event) {
                        if (ExoPlayerVideoDisplayComponent.this.d != null) {
                            ExoPlayerVideoDisplayComponent.this.a((long) integerProperty);
                        }
                    }
                });
                ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent2 = ExoPlayerVideoDisplayComponent.this;
                exoPlayerVideoDisplayComponent2.a(exoPlayerVideoDisplayComponent2.z, ExoPlayerVideoDisplayComponent.this.A);
                return;
            }
            Log.e(ExoPlayerVideoDisplayComponent.a, "Source has not been set yet.");
        }
    }

    class d implements EventListener {
        private d() {
        }

        /* synthetic */ d(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnPrebufferNextVideoListener:");
            ExoPlayerVideoDisplayComponent.this.B = (Video) event.properties.get(Event.VIDEO);
            ExoPlayerVideoDisplayComponent.this.C = (Source) event.properties.get("source");
        }
    }

    class e implements EventListener {
        private e() {
        }

        /* synthetic */ e(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnSeekListener");
            Map map = event.properties;
            String str = Event.SEEK_POSITION;
            if (map.containsKey(str)) {
                final int integerProperty = event.getIntegerProperty(str);
                if (ExoPlayerVideoDisplayComponent.this.d == null) {
                    ExoPlayerVideoDisplayComponent.this.eventEmitter.once(EventType.DID_SET_SOURCE, new EventListener() {
                        @Default
                        public final void processEvent(Event event) {
                            if (ExoPlayerVideoDisplayComponent.this.d != null) {
                                ExoPlayerVideoDisplayComponent.this.w = integerProperty;
                                ExoPlayerVideoDisplayComponent.this.p = ExoPlayerVideoDisplayComponent.this.y;
                                ExoPlayerVideoDisplayComponent.this.d.a((long) integerProperty);
                            }
                        }
                    });
                    ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                    exoPlayerVideoDisplayComponent.a(exoPlayerVideoDisplayComponent.z, ExoPlayerVideoDisplayComponent.this.A);
                    return;
                } else if (integerProperty != -1) {
                    ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent2 = ExoPlayerVideoDisplayComponent.this;
                    exoPlayerVideoDisplayComponent2.w = integerProperty;
                    exoPlayerVideoDisplayComponent2.p = exoPlayerVideoDisplayComponent2.y;
                    ExoPlayerVideoDisplayComponent.this.d.a((long) integerProperty);
                    return;
                } else {
                    Log.e(ExoPlayerVideoDisplayComponent.a, "Invalid seek position: ".concat(String.valueOf(integerProperty)));
                    return;
                }
            }
            Log.e(ExoPlayerVideoDisplayComponent.a, "Seek event must pass the seekPosition property.");
        }
    }

    class f implements EventListener {
        private f() {
        }

        /* synthetic */ f(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnSetSourceListener");
            ExoPlayerVideoDisplayComponent.this.d();
            ExoPlayerVideoDisplayComponent.this.z = (Video) event.properties.get(Event.VIDEO);
            ExoPlayerVideoDisplayComponent.this.A = (Source) event.properties.get("source");
            if (ExoPlayerVideoDisplayComponent.this.A != null && ExoPlayerVideoDisplayComponent.this.A.getUrl() != null) {
                ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                exoPlayerVideoDisplayComponent.a(exoPlayerVideoDisplayComponent.z, ExoPlayerVideoDisplayComponent.this.A);
            }
        }
    }

    class g implements EventListener {
        private g() {
        }

        /* synthetic */ g(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnSetVolumeListener:");
            float floatValue = ((Float) event.properties.get(Event.VOLUME)).floatValue();
            if (floatValue < MapboxConstants.MINIMUM_ZOOM || floatValue > 1.0f) {
                Log.e(ExoPlayerVideoDisplayComponent.a, "The volume setting is out of the legal range. (0.0f-1.0f)");
            }
            if (ExoPlayerVideoDisplayComponent.this.d != null) {
                ExoPlayerVideoDisplayComponent.this.d.a(ExoPlayerVideoDisplayComponent.this.e, Float.valueOf(floatValue));
            }
        }
    }

    class h implements EventListener {
        private h() {
        }

        /* synthetic */ h(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnStopListener:");
            if (ExoPlayerVideoDisplayComponent.this.d != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(Event.PLAYHEAD_POSITION, Long.valueOf(ExoPlayerVideoDisplayComponent.this.d.g()));
                ExoPlayerVideoDisplayComponent.this.eventEmitter.emit(EventType.DID_STOP, hashMap);
            }
            ExoPlayerVideoDisplayComponent.this.d();
        }
    }

    class i implements EventListener {
        private i() {
        }

        /* synthetic */ i(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            String str = ExoPlayerVideoDisplayComponent.a;
            StringBuilder stringBuilder = new StringBuilder("ExoPlayerOnWillInterruptContentListener: hasSurface = ");
            stringBuilder.append(ExoPlayerVideoDisplayComponent.this.v);
            stringBuilder.append(", playheadPosition = ");
            stringBuilder.append(ExoPlayerVideoDisplayComponent.this.y);
            Log.v(str, stringBuilder.toString());
            if (ExoPlayerVideoDisplayComponent.this.d != null) {
                ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                exoPlayerVideoDisplayComponent.b[0] = exoPlayerVideoDisplayComponent.d.b(0);
                exoPlayerVideoDisplayComponent.b[1] = exoPlayerVideoDisplayComponent.d.b(1);
                exoPlayerVideoDisplayComponent.b[2] = exoPlayerVideoDisplayComponent.d.b(2);
                exoPlayerVideoDisplayComponent.b[3] = exoPlayerVideoDisplayComponent.d.b(3);
                exoPlayerVideoDisplayComponent.d.b(0, -1);
                exoPlayerVideoDisplayComponent.d.b(1, -1);
                exoPlayerVideoDisplayComponent.d.b(2, -1);
                exoPlayerVideoDisplayComponent.d.b(3, -1);
                ExoPlayerVideoDisplayComponent.this.d.b(ExoPlayerVideoDisplayComponent.this);
                ExoPlayerVideoDisplayComponent.this.d.a(false);
                exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                exoPlayerVideoDisplayComponent.g = false;
                exoPlayerVideoDisplayComponent.c();
            }
            if (ExoPlayerVideoDisplayComponent.this.n != null) {
                ExoPlayerVideoDisplayComponent.this.n.setVisibility(4);
            }
            ExoPlayerVideoDisplayComponent.this.eventEmitter.emit(EventType.DID_INTERRUPT_CONTENT);
        }
    }

    class j implements EventListener {
        private j() {
        }

        /* synthetic */ j(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(ExoPlayerVideoDisplayComponent.a, "ExoPlayerOnWillResumeContentListener:");
            if (ExoPlayerVideoDisplayComponent.this.d != null) {
                ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                exoPlayerVideoDisplayComponent.d.b(0, exoPlayerVideoDisplayComponent.b[0]);
                exoPlayerVideoDisplayComponent.d.b(1, exoPlayerVideoDisplayComponent.b[1]);
                exoPlayerVideoDisplayComponent.d.b(2, exoPlayerVideoDisplayComponent.b[2]);
                exoPlayerVideoDisplayComponent.d.b(3, exoPlayerVideoDisplayComponent.b[3]);
                for (int i = 0; i < exoPlayerVideoDisplayComponent.b.length; i++) {
                    exoPlayerVideoDisplayComponent.b[i] = -1;
                }
            }
            if (ExoPlayerVideoDisplayComponent.this.n != null) {
                ExoPlayerVideoDisplayComponent.this.n.setVisibility(0);
            }
            event = (Event) event.properties.get(Event.ORIGINAL_EVENT);
            if (event != null) {
                ExoPlayerVideoDisplayComponent.this.eventEmitter.emit(event.getType(), event.properties);
            }
            ExoPlayerVideoDisplayComponent.this.eventEmitter.emit(EventType.DID_RESUME_CONTENT);
        }
    }

    class k implements RendererBuilderCallback {
        boolean a;

        private k() {
        }

        /* synthetic */ k(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        public final void onRenderers(bcq[] bcqArr, bjj bjj) {
            if (!this.a) {
                ExoPlayerVideoDisplayComponent.a(ExoPlayerVideoDisplayComponent.this, bcqArr, bjj);
            }
        }

        public final void onRenderersError(Exception exception) {
            if (!this.a) {
                ExoPlayerVideoDisplayComponent.a(ExoPlayerVideoDisplayComponent.this, exception);
            }
            HashMap hashMap = new HashMap();
            hashMap.put(Event.VIDEO, ExoPlayerVideoDisplayComponent.this.getCurrentVideo());
            hashMap.put("source", ExoPlayerVideoDisplayComponent.this.getCurrentSource());
            hashMap.put("error", exception);
            hashMap.put(Event.ERROR_MESSAGE, exception.getLocalizedMessage());
            ExoPlayerVideoDisplayComponent.this.eventEmitter.emit(EventType.SOURCE_NOT_PLAYABLE, hashMap);
        }
    }

    class l implements EventListener {
        private l() {
        }

        /* synthetic */ l(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
            exoPlayerVideoDisplayComponent.m = true;
            if (exoPlayerVideoDisplayComponent.f == 3) {
                exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                exoPlayerVideoDisplayComponent.a(exoPlayerVideoDisplayComponent.c);
            }
        }
    }

    class m implements EventListener {
        private m() {
        }

        /* synthetic */ m(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            String str = (String) event.properties.get(Event.SELECTED_TRACK);
            Log.v(ExoPlayerVideoDisplayComponent.a, "OnSelectAudioListener: track = ".concat(String.valueOf(str)));
            if (str == null || ExoPlayerVideoDisplayComponent.this.d == null) {
                ExoPlayerVideoDisplayComponent.this.d.b(1, -1);
                return;
            }
            int i;
            ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
            if (exoPlayerVideoDisplayComponent.d != null) {
                i = 0;
                while (i < exoPlayerVideoDisplayComponent.d.a(1)) {
                    if (exoPlayerVideoDisplayComponent.d.a(1, i).a.equals(str)) {
                        break;
                    }
                    i++;
                }
            }
            i = -1;
            if (i != -1) {
                ExoPlayerVideoDisplayComponent.this.d.b(1, i);
            }
        }
    }

    class n implements EventListener {
        private n() {
        }

        /* synthetic */ n(ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Object obj = event.properties.get(Event.CAPTION_FORMAT);
            Object obj2 = event.properties.get(Event.CAPTION_URI);
            if ((obj instanceof BrightcoveCaptionFormat) && (obj2 instanceof Uri)) {
                BrightcoveCaptionFormat brightcoveCaptionFormat = (BrightcoveCaptionFormat) obj;
                if (obj2.toString().startsWith(ExoPlayerVideoDisplayComponent.IN_MANIFEST_CC_URI_STR)) {
                    ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                    List e = exoPlayerVideoDisplayComponent.e();
                    if (!(e == null || e.isEmpty())) {
                        for (int i = 0; i < e.size(); i++) {
                            bci bci = (bci) e.get(i);
                            if (bci.u.equals(brightcoveCaptionFormat.language()) && bci.b.equals(brightcoveCaptionFormat.type())) {
                                exoPlayerVideoDisplayComponent.d.b(2, i);
                                return;
                            }
                        }
                    }
                    return;
                }
                ExoPlayerVideoDisplayComponent.this.d.b(2, -1);
            }
        }
    }

    static {
        try {
            F = ResourceBundle.getBundle("BrightcoveExoPlayerMessages");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ExoPlayerVideoDisplayComponent(RenderView renderView, EventEmitter eventEmitter) {
        super(renderView, eventEmitter);
        this.b = new int[4];
        this.T = -1;
        this.X = 5000;
        this.Y = 20000;
        this.Z = 2500;
        this.aa = 5000;
        this.ac = new Runnable() {
            public final void run() {
                if (ExoPlayerVideoDisplayComponent.this.g && ExoPlayerVideoDisplayComponent.this.d != null && ExoPlayerVideoDisplayComponent.this.d.b() == 4) {
                    ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                    exoPlayerVideoDisplayComponent.y = NumberUtil.safeLongToInt(exoPlayerVideoDisplayComponent.d.g());
                    if (ExoPlayerVideoDisplayComponent.this.y >= 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put(Event.VIDEO, ExoPlayerVideoDisplayComponent.this.z);
                        hashMap.put("source", ExoPlayerVideoDisplayComponent.this.A);
                        hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(ExoPlayerVideoDisplayComponent.this.y));
                        hashMap.put("duration", Integer.valueOf(ExoPlayerVideoDisplayComponent.this.f()));
                        if (ExoPlayerVideoDisplayComponent.this.isLive()) {
                            hashMap.put(Event.MIN_POSITION, Integer.valueOf(NumberUtil.safeLongToInt(ExoPlayerVideoDisplayComponent.this.i)));
                            hashMap.put(Event.MAX_POSITION, Integer.valueOf(NumberUtil.safeLongToInt(ExoPlayerVideoDisplayComponent.this.j)));
                        }
                        hashMap.put(Event.FORWARD_BUFFER_SECONDS, Long.valueOf(ExoPlayerVideoDisplayComponent.this.d.h() / 1000));
                        if (ExoPlayerVideoDisplayComponent.this.h) {
                            ExoPlayerVideoDisplayComponent.this.eventEmitter.emit("progress", hashMap);
                            return;
                        }
                        ExoPlayerVideoDisplayComponent.this.eventEmitter.emit(EventType.DID_PLAY, hashMap);
                        exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                        exoPlayerVideoDisplayComponent.h = true;
                        exoPlayerVideoDisplayComponent.b();
                    }
                }
            }
        };
        this.eventEmitter = RegisteringEventEmitter.build(super.getEventEmitter(), getClass());
        eventEmitter.on(EventType.DID_SET_ANALYTICS_BASE_PARAMS, new EventListener() {
            public final void processEvent(Event event) {
                Map map = event.properties;
                String str = Fields.BASE_PARAMS;
                String str2 = "feature";
                String str3 = (String) ((Map) map.get(str)).get(str2);
                String str4 = "exoplayer";
                if (str3 == null || !str3.equals(str4)) {
                    ExoPlayerVideoDisplayComponent exoPlayerVideoDisplayComponent = ExoPlayerVideoDisplayComponent.this;
                    HashMap hashMap = new HashMap();
                    hashMap.put(str2, str4);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(str, hashMap);
                    exoPlayerVideoDisplayComponent.eventEmitter.emit(EventType.ADD_ANALYTICS_BASE_PARAMS, hashMap2);
                }
            }
        });
        addListener(EventType.SELECT_AUDIO_TRACK, new m(this, (byte) 0));
        addListener(EventType.SELECT_CLOSED_CAPTION_TRACK, new n(this, (byte) 0));
        this.G = new Handler();
        if (CookieHandler.getDefault() == null) {
            CookieHandler.setDefault(new CookieManager(null, CookiePolicy.ACCEPT_ALL));
        }
    }

    private void a(long j) {
        this.d.a((defpackage.bby.b) this);
        if (this.p != -1) {
            String str = a;
            StringBuilder stringBuilder = new StringBuilder("play: fromSeekPosition = ");
            stringBuilder.append(this.p);
            Log.v(str, stringBuilder.toString());
        } else if (j >= 0 && Math.abs(j - ((long) this.y)) > 1000) {
            this.d.a(j);
        }
        this.d.a(true);
        this.g = true;
        b();
    }

    private void a(bcp bcp) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onAvailableRangeChanged: startTime = ");
        stringBuilder.append(bcp.a()[0]);
        stringBuilder.append(", endTime = ");
        stringBuilder.append(bcp.a()[1]);
        Log.v(str, stringBuilder.toString());
        if (bcp.a()[1] > this.j) {
            this.i = bcp.a()[0];
            this.j = bcp.a()[1];
            j();
        }
    }

    /* JADX WARNING: Missing block: B:11:0x0049, code skipped:
            if ((r1 instanceof defpackage.bcf) != false) goto L_0x0040;
     */
    static /* synthetic */ void a(com.brightcove.player.display.ExoPlayerVideoDisplayComponent r4, defpackage.bcq[] r5, defpackage.bjj r6) {
        /*
        r0 = a;
        r1 = new java.lang.StringBuilder;
        r2 = "onRenderers: renderers = ";
        r1.<init>(r2);
        r1.append(r5);
        r2 = ", bandwidthMeter = ";
        r1.append(r2);
        r1.append(r6);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
        r0 = 0;
        r4.I = r0;
        r1 = 0;
        r2 = 0;
    L_0x0020:
        r3 = 4;
        if (r2 >= r3) goto L_0x0031;
    L_0x0023:
        r3 = r5[r2];
        if (r3 != 0) goto L_0x002e;
    L_0x0027:
        r3 = new bbw;
        r3.<init>();
        r5[r2] = r3;
    L_0x002e:
        r2 = r2 + 1;
        goto L_0x0020;
    L_0x0031:
        r1 = r5[r1];
        r4.N = r1;
        r1 = 1;
        r1 = r5[r1];
        r4.e = r1;
        r1 = r4.N;
        r2 = r1 instanceof defpackage.bcf;
        if (r2 == 0) goto L_0x0045;
    L_0x0040:
        r1 = (defpackage.bcf) r1;
        r0 = r1.b;
        goto L_0x004c;
    L_0x0045:
        r1 = r4.e;
        r2 = r1 instanceof defpackage.bcf;
        if (r2 == 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0040;
    L_0x004c:
        r4.S = r0;
        r4.P = r6;
        r6 = 3;
        r4.f = r6;
        r6 = r4.isCurrentVideo360Mode();
        if (r6 == 0) goto L_0x0061;
    L_0x0059:
        r6 = r4.m;
        if (r6 == 0) goto L_0x005e;
    L_0x005d:
        goto L_0x0061;
    L_0x005e:
        r4.c = r5;
        return;
    L_0x0061:
        r4.a(r5);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.display.ExoPlayerVideoDisplayComponent.a(com.brightcove.player.display.ExoPlayerVideoDisplayComponent, bcq[], bjj):void");
    }

    private void a(boolean z) {
        if (this.N != null) {
            Object obj = null;
            if (this.v) {
                obj = this.n.getSurface();
            }
            Log.v(a, "pushSurface: surface = ".concat(String.valueOf(obj)));
            if (z) {
                this.d.b(this.N, obj);
            } else {
                this.d.a(this.N, obj);
            }
        }
    }

    private void a(bcq[] bcqArr) {
        if (bcqArr != null) {
            a(false);
            this.d.a(bcqArr);
            EventUtil.emit(this.eventEmitter, EventType.DID_SET_SOURCE, this.z, this.A);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00aa  */
    private void b(boolean r11) {
        /*
        r10 = this;
        r0 = r10.W;
        if (r0 != 0) goto L_0x00ec;
    L_0x0004:
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = r10.e();
        if (r1 != 0) goto L_0x0010;
    L_0x000f:
        return;
    L_0x0010:
        r2 = r10.z;
        r2 = r2.getProperties();
        r3 = "captionSources";
        r2 = r2.get(r3);
        r2 = (java.util.List) r2;
        if (r2 != 0) goto L_0x002e;
    L_0x0020:
        r2 = new java.util.ArrayList;
        r2.<init>();
        r4 = r10.z;
        r4 = r4.getProperties();
        r4.put(r3, r2);
    L_0x002e:
        r3 = new java.util.ArrayList;
        r3.<init>();
        r4 = "brightcove://in-manifest";
        r4 = android.net.Uri.parse(r4);
        r1 = r1.iterator();
    L_0x003d:
        r5 = r1.hasNext();
        if (r5 == 0) goto L_0x00ce;
    L_0x0043:
        r5 = r1.next();
        r5 = (defpackage.bci) r5;
        r6 = r5.u;
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 != 0) goto L_0x005f;
    L_0x0051:
        r6 = r5.u;
        r7 = "und";
        r6 = r7.equals(r6);
        if (r6 == 0) goto L_0x005c;
    L_0x005b:
        goto L_0x005f;
    L_0x005c:
        r6 = r5.u;
        goto L_0x0061;
    L_0x005f:
        r6 = "";
    L_0x0061:
        r5 = r5.b;
        if (r6 == 0) goto L_0x007c;
    L_0x0065:
        r7 = r6.isEmpty();
        if (r7 == 0) goto L_0x006c;
    L_0x006b:
        goto L_0x007c;
    L_0x006c:
        r7 = r10.d;
        r8 = 2;
        r9 = -1;
        r7.b(r8, r9);
        r5 = com.brightcove.player.captioning.BrightcoveCaptionFormat.createCaptionFormat(r5, r6);
        r5 = android.util.Pair.create(r4, r5);
        goto L_0x00a0;
    L_0x007c:
        if (r11 == 0) goto L_0x003d;
    L_0x007e:
        if (r5 == 0) goto L_0x003d;
    L_0x0080:
        r6 = "608";
        r6 = r5.contains(r6);
        if (r6 == 0) goto L_0x003d;
    L_0x0088:
        r6 = F;
        r7 = "unknownCC";
        r6 = r6.getString(r7);
        r8 = F;
        r7 = r8.getString(r7);
        r5 = com.brightcove.player.captioning.BrightcoveCaptionFormat.createCaptionFormat(r5, r7);
        r7 = android.net.Uri.EMPTY;
        r5 = android.util.Pair.create(r7, r5);
    L_0x00a0:
        r7 = r5.second;
        r7 = (com.brightcove.player.captioning.BrightcoveCaptionFormat) r7;
        r7 = com.brightcove.player.captioning.BrightcoveCaptionFormat.findMatchingLanguageIgnoreMimeType(r2, r7);
        if (r7 != 0) goto L_0x00ac;
    L_0x00aa:
        r8 = 0;
        goto L_0x00b0;
    L_0x00ac:
        r8 = r7.second;
        r8 = (com.brightcove.player.captioning.BrightcoveCaptionFormat) r8;
    L_0x00b0:
        if (r8 == 0) goto L_0x00c6;
    L_0x00b2:
        if (r8 == 0) goto L_0x003d;
    L_0x00b4:
        r8 = r8.hasInBandMetadataTrackDispatchType();
        if (r8 != 0) goto L_0x003d;
    L_0x00ba:
        r7 = r7.first;
        r7 = (android.net.Uri) r7;
        r8 = r5.first;
        r7 = r7.equals(r8);
        if (r7 != 0) goto L_0x003d;
    L_0x00c6:
        r2.add(r5);
        r3.add(r6);
        goto L_0x003d;
    L_0x00ce:
        r11 = r3.isEmpty();
        r1 = 1;
        if (r11 != 0) goto L_0x00e4;
    L_0x00d5:
        r11 = "languages";
        r0.put(r11, r3);
        r11 = r10.eventEmitter;
        r2 = "captionsLanguages";
        r11.emit(r2, r0);
        r10.W = r1;
        return;
    L_0x00e4:
        r11 = r2.isEmpty();
        if (r11 != 0) goto L_0x00ec;
    L_0x00ea:
        r10.W = r1;
    L_0x00ec:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.display.ExoPlayerVideoDisplayComponent.b(boolean):void");
    }

    private RendererBuilder g() {
        String str;
        AbstractRendererBuilder hLSRendererBuilder;
        try {
            str = this.q.getPackageManager().getPackageInfo(this.q.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            str = "?";
        }
        StringBuilder stringBuilder = new StringBuilder("BrightcoveExoPlayer/");
        stringBuilder.append(str);
        stringBuilder.append(" (Linux;Android ");
        stringBuilder.append(VERSION.RELEASE);
        stringBuilder.append(") ExoPlayerLib/1.5.13");
        String stringBuilder2 = stringBuilder.toString();
        DeliveryType deliveryType = this.A.getDeliveryType();
        int i = AnonymousClass3.a[deliveryType.ordinal()];
        if (i == 1) {
            AbstractRendererBuilder dashRendererBuilder = new DashRendererBuilder(this.q, stringBuilder2, this.A.getUrl(), VideoDisplayComponent.b(this.z, this.A), new WidevineMediaDrmCallback(this.z.getProperties(), this.A.getProperties()));
        } else if (i == 2) {
            hLSRendererBuilder = new HLSRendererBuilder(this.q, stringBuilder2, this.A.getUrl(), VideoDisplayComponent.b(this.z, this.A));
        } else if (i == 3) {
            hLSRendererBuilder = new ExtractorRendererBuilder(this.q, stringBuilder2, Uri.parse(this.A.getUrl()), VideoDisplayComponent.b(this.z, this.A));
        } else {
            throw new IllegalStateException("Unsupported type: ".concat(String.valueOf(deliveryType)));
        }
        hLSRendererBuilder.setRendererConfig(this.D);
        return hLSRendererBuilder;
    }

    private void h() {
        boolean c = this.d.c();
        int playerState = getPlayerState();
        if (!(this.U == c && this.V == playerState)) {
            if (!(playerState == 1 || playerState == 2)) {
                String str = Event.VIDEO;
                HashMap hashMap;
                if (playerState == 3) {
                    this.T = playerState;
                    hashMap = new HashMap();
                    hashMap.put(str, this.z);
                    this.eventEmitter.emit(EventType.BUFFERING_STARTED, hashMap);
                } else if (playerState == 4) {
                    this.y = NumberUtil.safeLongToInt(this.d.g());
                    if (this.T == 4 && !c) {
                        i();
                    } else if (this.T == 4 && c) {
                        a((long) this.y);
                    } else if (this.T == 3) {
                        hashMap = new HashMap();
                        hashMap.put(str, this.z);
                        this.eventEmitter.emit(EventType.BUFFERING_COMPLETED, hashMap);
                    }
                    b(false);
                } else if (playerState == 5) {
                    if (c) {
                        hashMap = new HashMap();
                        hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(NumberUtil.safeLongToInt(this.d.g())));
                        hashMap.put(str, this.z);
                        hashMap.put("duration", Integer.valueOf(f()));
                        this.eventEmitter.emit(EventType.COMPLETED, hashMap);
                    }
                }
            }
            this.T = playerState;
        }
        this.U = c;
        this.V = playerState;
    }

    private void i() {
        this.d.b((defpackage.bby.b) this);
        this.d.a(false);
        this.g = false;
        c();
        HashMap hashMap = new HashMap();
        hashMap.put(Event.PLAYHEAD_POSITION, Long.valueOf(this.d.g()));
        this.eventEmitter.emit(EventType.DID_PAUSE, hashMap);
    }

    private void j() {
        if (this.d != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(Event.VIDEO, getCurrentVideo());
            hashMap.put("source", getCurrentSource());
            hashMap.put("duration", Integer.valueOf(f()));
            hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(NumberUtil.safeLongToInt(this.d.g())));
            if (isLive()) {
                hashMap.put(Event.MIN_POSITION, Integer.valueOf(NumberUtil.safeLongToInt(this.i)));
                hashMap.put(Event.MAX_POSITION, Integer.valueOf(NumberUtil.safeLongToInt(this.j)));
            }
            this.eventEmitter.emit(EventType.VIDEO_DURATION_CHANGED, hashMap);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        addListener(EventType.PLAY, new c(this, (byte) 0));
        addListener(EventType.SEEK_TO, new e(this, (byte) 0));
        addListener(EventType.PAUSE, new b(this, (byte) 0));
        addListener(EventType.SET_SOURCE, new f(this, (byte) 0));
        addListener(EventType.STOP, new h(this, (byte) 0));
        addListener(EventType.PREBUFFER_NEXT_VIDEO, new d(this, (byte) 0));
        addListener(EventType.COMPLETED, new a(this, (byte) 0));
        addListener(EventType.WILL_INTERRUPT_CONTENT, new i(this, (byte) 0));
        addListener(EventType.WILL_RESUME_CONTENT, new j(this, (byte) 0));
        addListener(EventType.SET_VOLUME, new g(this, (byte) 0));
        addListener(EventType.WILL_CHANGE_VIDEO, new OnWillChangeVideoListener());
        addListener(EventType.ON_FRAME_AVAILABLE, new l(this, (byte) 0));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(Video video, Source source) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("openVideo: ");
        stringBuilder.append(source.getUrl());
        Log.v(str, stringBuilder.toString());
        d();
        str = a;
        stringBuilder = new StringBuilder("createPlayer: ");
        stringBuilder.append(source.getUrl());
        Log.v(str, stringBuilder.toString());
        getRenderView().setProjectionFormat(video.getProjectionFormat());
        this.H = g();
        this.R = new int[4];
        this.d = new bbz(this.Z, this.aa);
        if (this.f == 3) {
            this.d.d();
        }
        this.H.cancel();
        this.O = null;
        this.N = null;
        this.ab = null;
        this.f = 2;
        this.I = new k(this, (byte) 0);
        this.H.buildRenderers(this, this.I);
        h();
        this.y = 0;
        this.i = -1;
        this.j = -1;
        this.h = false;
        this.W = false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        c();
        this.r = E.scheduleAtFixedRate(this.ac, 0, this.h ? 500 : 50, TimeUnit.MILLISECONDS);
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        if (this.r != null) {
            String str = a;
            StringBuilder stringBuilder = new StringBuilder("stopUpdater: ");
            stringBuilder.append(this.r);
            Log.v(str, stringBuilder.toString());
            this.r.cancel(false);
            this.r = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("destroyPlayer: exoPlayer = ");
        stringBuilder.append(this.d);
        Log.v(str, stringBuilder.toString());
        if (this.d != null) {
            c();
            k kVar = this.I;
            if (kVar != null) {
                kVar.a = true;
                this.I = null;
            }
            this.ab = null;
            this.y = NumberUtil.safeLongToInt(this.d.g());
            for (int i = 0; i < 4; i++) {
                this.d.b(i, -1);
            }
            this.n.release();
            this.d.e();
            this.d = null;
            RendererBuilder rendererBuilder = this.H;
            if (rendererBuilder != null) {
                rendererBuilder.cancel();
            }
            this.f = 1;
            this.p = -1;
            this.c = null;
            this.m = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final List<bci> e() {
        bby bby = this.d;
        if (bby == null) {
            return null;
        }
        int a = bby.a(2);
        if (a == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < a; i++) {
            arrayList.add(this.d.a(2, i));
        }
        return arrayList;
    }

    /* Access modifiers changed, original: final */
    public final int f() {
        if (isLive()) {
            return -1;
        }
        int safeLongToInt = NumberUtil.safeLongToInt(this.d.f());
        return safeLongToInt < 0 ? NumberUtil.safeLongToInt(this.j) : safeLongToInt;
    }

    public bjj getBandwidthMeter() {
        return this.P;
    }

    public bbs getCodecCounters() {
        return this.S;
    }

    public Source getCurrentSource() {
        return this.A;
    }

    public Video getCurrentVideo() {
        return this.z;
    }

    public bby getExoPlayer() {
        return this.d;
    }

    public int getLiveEdge() {
        return NumberUtil.safeLongToInt(this.j);
    }

    public Handler getMainHandler() {
        return this.G;
    }

    public long getMaxBufferDurationToSwitchDown() {
        return this.Y;
    }

    public MediaPlayer getMediaPlayer() {
        throw new UnsupportedOperationException();
    }

    public long getMinBufferDurationToSwitchUp() {
        return this.X;
    }

    public int getMinBufferMs() {
        return this.Z;
    }

    public int getMinRebufferMs() {
        return this.aa;
    }

    public int getPeakBitrate() {
        return this.Q;
    }

    public Looper getPlaybackLooper() {
        return this.d.a();
    }

    public int getPlayerState() {
        int i = this.f;
        return (i == 2 || (i == 3 && i == 1)) ? 2 : this.d.b();
    }

    public bdd getVideoFormat() {
        return this.O;
    }

    public boolean hasDvr() {
        return isLive();
    }

    public boolean isLive() {
        bhf bhf = this.ab;
        return bhf != null ? bhf.h : false;
    }

    public void onAudioCapabilitiesChanged(bcs bcs) {
        Log.v(a, "onAudioCapabilitiesChanged:");
    }

    public void onAudioTrackInitializationError(defpackage.bct.d dVar) {
        a("onAudioTrackInitializationError", (Exception) dVar);
        InternalErrorListener internalErrorListener = this.J;
        if (internalErrorListener != null) {
            internalErrorListener.onAudioTrackInitializationError(dVar);
        }
    }

    public void onAudioTrackUnderrun(int i, long j, long j2) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onAudioTrackUnderrun: bufferSize = ");
        stringBuilder.append(i);
        stringBuilder.append(", bufferSizeMs = ");
        stringBuilder.append(j);
        stringBuilder.append(", elapsedSinceLastFeedMs = ");
        stringBuilder.append(j2);
        Log.e(str, stringBuilder.toString());
        InternalErrorListener internalErrorListener = this.J;
        if (internalErrorListener != null) {
            internalErrorListener.onAudioTrackUnderrun(i, j, j2);
        }
    }

    public void onAudioTrackWriteError(defpackage.bct.e eVar) {
        a("onAudioTrackWriteError", (Exception) eVar);
    }

    public void onAvailableRangeChanged(int i, bcp bcp) {
        a(bcp);
    }

    public void onAvailableRangeChanged(bcp bcp) {
        a(bcp);
    }

    public void onBandwidthSample(int i, long j, long j2) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onBandwidthSample: elapsedMs: ");
        stringBuilder.append(i);
        stringBuilder.append(", bytes: ");
        stringBuilder.append(j);
        stringBuilder.append(", bitrateEstimate: ");
        stringBuilder.append(j2);
        Log.v(str, stringBuilder.toString());
        InfoListener infoListener = this.L;
        if (infoListener != null) {
            infoListener.onBandwidthSample(i, j, j2);
        }
    }

    public void onCryptoError(CryptoException cryptoException) {
        a("onCryptoError", (Exception) cryptoException);
        InternalErrorListener internalErrorListener = this.J;
        if (internalErrorListener != null) {
            internalErrorListener.onCryptoError(cryptoException);
        }
    }

    public void onCues(List<bic> list) {
        Log.v(a, "onCues: ".concat(String.valueOf(list)));
        if (!(this.M == null || this.d.b(2) == -1)) {
            this.M.onCues(list);
        }
        b(true);
        if (list != null && !list.isEmpty()) {
            for (bic bic : list) {
                HashMap hashMap = new HashMap();
                hashMap.put("text", bic.a.toString());
                hashMap.put(Event.ALIGNMENT, bic.b);
                hashMap.put("line", Float.valueOf(bic.c));
                hashMap.put(Event.LINE_TYPE, Integer.valueOf(bic.d));
                hashMap.put(Event.LINE_ANCHOR, Integer.valueOf(bic.e));
                hashMap.put("position", Float.valueOf(bic.f));
                hashMap.put(Event.POSITION_ANCHOR, Integer.valueOf(bic.g));
                hashMap.put(Event.SIZE, Float.valueOf(bic.h));
                this.eventEmitter.emit(EventType.CAPTION, hashMap);
            }
        }
    }

    public void onDecoderInitializationError(defpackage.bcf.a aVar) {
        a("onDecoderInitializationError", (Exception) aVar);
        InternalErrorListener internalErrorListener = this.J;
        if (internalErrorListener != null) {
            internalErrorListener.onDecoderInitializationError(aVar);
        }
    }

    public void onDecoderInitialized(String str, long j, long j2) {
        InfoListener infoListener = this.L;
        if (infoListener != null) {
            infoListener.onDecoderInitialized(str, j, j2);
        }
    }

    public void onDownstreamFormatChanged(int i, bdd bdd, int i2, long j) {
        String num = bdd == null ? "null" : Integer.toString(bdd.d);
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onDownstreamFormatChanged: sourceId: ");
        stringBuilder.append(i);
        stringBuilder.append(", bitrate: ");
        stringBuilder.append(num);
        stringBuilder.append(", trigger: ");
        stringBuilder.append(i2);
        stringBuilder.append(", mediaTimeMs: ");
        stringBuilder.append(j);
        Log.v(str, stringBuilder.toString());
        HashMap hashMap = new HashMap();
        hashMap.put(Event.VIDEO, getCurrentVideo());
        hashMap.put("source", getCurrentSource());
        hashMap.put(EXOPLAYER_FORMAT, bdd);
        this.eventEmitter.emit(RENDITION_CHANGED, hashMap);
        hashMap = new HashMap();
        hashMap.put(Event.RENDITION_URL, bdd.b);
        hashMap.put(Event.RENDITION_INDICATED_BPS, Integer.valueOf(bdd.d));
        hashMap.put(Event.RENDITION_MIME_TYPE, bdd.c);
        hashMap.put(Event.RENDITION_HEIGHT, Integer.valueOf(bdd.f));
        hashMap.put(Event.RENDITION_WIDTH, Integer.valueOf(bdd.e));
        this.eventEmitter.emit(EventType.ANALYTICS_VIDEO_ENGAGEMENT, hashMap);
        InfoListener infoListener = this.L;
        if (infoListener != null) {
            if (i == 0) {
                this.O = bdd;
                infoListener.onVideoFormatEnabled(bdd, i2, j);
                return;
            }
            if (i == 1) {
                infoListener.onAudioFormatEnabled(bdd, i2, j);
            }
        }
    }

    public void onDrawnToSurface(Surface surface) {
        Log.v(a, "onDrawnToSurface: ".concat(String.valueOf(surface)));
    }

    public void onDrmKeysLoaded() {
    }

    public void onDrmSessionManagerError(Exception exception) {
        a("onDrmSessionManagerError", exception);
        InternalErrorListener internalErrorListener = this.J;
        if (internalErrorListener != null) {
            internalErrorListener.onDrmSessionManagerError(exception);
        }
    }

    public void onDroppedFrames(int i, long j) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onDroppedFrames: count: ");
        stringBuilder.append(i);
        stringBuilder.append(", elapsed: ");
        stringBuilder.append(j);
        Log.v(str, stringBuilder.toString());
        InfoListener infoListener = this.L;
        if (infoListener != null) {
            infoListener.onDroppedFrames(i, j);
        }
    }

    public void onLoadCanceled(int i, long j) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onLoadCanceled: sourceId: ");
        stringBuilder.append(i);
        stringBuilder.append(", bytesLoaded: ");
        stringBuilder.append(j);
        Log.v(str, stringBuilder.toString());
    }

    public void onLoadCompleted(int i, long j, int i2, int i3, bdd bdd, long j2, long j3, long j4, long j5) {
        int i4;
        long j6 = j;
        int i5 = i2;
        bdd bdd2 = bdd;
        String num = bdd2 == null ? "null" : Integer.toString(bdd2.d);
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onLoadCompleted: sourceId: ");
        stringBuilder.append(i);
        stringBuilder.append(", bytesLoaded: ");
        stringBuilder.append(j6);
        stringBuilder.append(", type: ");
        stringBuilder.append(i5);
        stringBuilder.append(", bitrate: ");
        stringBuilder.append(num);
        stringBuilder.append(", startTime: ");
        stringBuilder.append(j2);
        stringBuilder.append(", endTime: ");
        stringBuilder.append(j3);
        Log.v(str, stringBuilder.toString());
        InfoListener infoListener = this.L;
        if (infoListener != null) {
            i4 = i5;
            infoListener.onLoadCompleted(i, j, i2, i3, bdd, j2, j3, j4, j5);
        } else {
            i4 = i5;
        }
        if (i4 == 1) {
            if (this.d != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(BUFFERED_POSITION, Long.valueOf(this.d.h()));
                hashMap.put(Event.PERCENT_COMPLETE, Integer.valueOf(this.d.i()));
                this.eventEmitter.emit(EventType.BUFFERED_UPDATE, hashMap);
                long j7 = (j << 3) / ((j5 < 1000 ? 1000 : j5) / 1000);
                HashMap hashMap2 = new HashMap();
                hashMap2.put(Event.FORWARD_BUFFER_SECONDS, Long.valueOf(this.d.h() / 1000));
                hashMap2.put(Event.MEASURED_BPS, Long.valueOf(j7));
                this.eventEmitter.emit(EventType.ANALYTICS_VIDEO_ENGAGEMENT, hashMap2);
                return;
            }
            return;
        }
    }

    public void onLoadError(int i, IOException iOException) {
        a("onLoadError: sourceId: ".concat(String.valueOf(i)), (Exception) iOException);
        InternalErrorListener internalErrorListener = this.J;
        if (internalErrorListener != null) {
            internalErrorListener.onLoadError(i, iOException);
        }
    }

    public void onLoadStarted(int i, long j, int i2, int i3, bdd bdd, long j2, long j3) {
        bdd bdd2 = bdd;
        String num = bdd2 == null ? "null" : Integer.toString(bdd2.d);
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onLoadStarted: sourceId: ");
        int i4 = i;
        stringBuilder.append(i);
        stringBuilder.append(", length: ");
        stringBuilder.append(j);
        stringBuilder.append(", type: ");
        stringBuilder.append(i2);
        stringBuilder.append(", trigger: ");
        stringBuilder.append(i3);
        stringBuilder.append(", bitrate: ");
        stringBuilder.append(num);
        stringBuilder.append(", mediaStartTimeMs: ");
        stringBuilder.append(j2);
        stringBuilder.append(", mediaEndTimeMs: ");
        stringBuilder.append(j3);
        Log.v(str, stringBuilder.toString());
        InfoListener infoListener = this.L;
        if (infoListener != null) {
            infoListener.onLoadStarted(i, j, i2, i3, bdd, j2, j3);
        }
    }

    public void onMediaPlaylistLoadCompleted(byte[] bArr) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onMediaPlaylistLoadCompleted: length = ");
        stringBuilder.append(bArr == null ? 0 : bArr.length);
        Log.v(str, stringBuilder.toString());
    }

    public void onMetadata(List<bhx> list) {
        if (this.K != null && this.d.b(3) != -1) {
            this.K.onId3Metadata(list);
        }
    }

    public void onPlayWhenReadyCommitted() {
        Log.v(a, "onPlayWhenReadyCommitted()");
        HashMap hashMap = new HashMap();
        hashMap.put(Event.VIDEO, getCurrentVideo());
        hashMap.put("source", getCurrentSource());
        this.eventEmitter.emit(PLAY_WHEN_READY_COMMITTED, hashMap);
    }

    public void onPlayerError(bbx bbx) {
        a("onPlayerError", (Exception) bbx);
        this.f = 1;
        String str = "error";
        this.eventEmitter.emit(str, Collections.singletonMap(str, bbx));
    }

    public void onPlayerStateChanged(boolean z, int i) {
        if (this.p != -1 && i == 4) {
            HashMap hashMap = new HashMap();
            hashMap.put(Event.VIDEO, this.z);
            hashMap.put("source", this.A);
            hashMap.put(Event.PLAYHEAD_POSITION, Long.valueOf(this.d.g()));
            hashMap.put(Event.SEEK_POSITION, Integer.valueOf(this.w));
            hashMap.put(Event.FROM_SEEK_POSITION, Integer.valueOf(this.p));
            this.eventEmitter.emit(EventType.DID_SEEK_TO, hashMap);
            this.p = -1;
        }
        h();
    }

    public void onUpstreamDiscarded(int i, long j, long j2) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onUpstreamDiscarded: sourceId: ");
        stringBuilder.append(i);
        stringBuilder.append(", mediaStartTimeMs: ");
        stringBuilder.append(j);
        stringBuilder.append(", mediaEndTimeMs: ");
        stringBuilder.append(j2);
        Log.v(str, stringBuilder.toString());
    }

    public void onVideoSizeChanged(int i, int i2, int i3, float f) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("onVideoSizeChanged: width: ");
        stringBuilder.append(i);
        stringBuilder.append(", height: ");
        stringBuilder.append(i2);
        stringBuilder.append(", unappliedRotationDegrees = ");
        stringBuilder.append(i3);
        stringBuilder.append(", pixelWidthHeightRatio = ");
        stringBuilder.append(f);
        stringBuilder.append(" render view width = ");
        stringBuilder.append(this.n.getWidth());
        stringBuilder.append(", render view height = ");
        stringBuilder.append(this.n.getHeight());
        Log.v(str, stringBuilder.toString());
        if (i > 0 && i2 > 0 && !(i == this.n.getVideoWidth() && i2 == this.n.getVideoHeight())) {
            this.n.setVideoSize(i, i2);
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.valueOf(i));
            hashMap.put("height", Integer.valueOf(i2));
            this.eventEmitter.emit(EventType.VIDEO_SIZE_KNOWN, hashMap);
        }
        if (this.A != null && this.A.getDeliveryType().equals(DeliveryType.MP4)) {
            j();
        }
    }

    public void setBandwidthMeter(bjj bjj) {
        this.P = bjj;
    }

    public void setCaptionListener(CaptionListener captionListener) {
        this.M = captionListener;
    }

    public void setDebugListener(InfoListener infoListener) {
        this.L = infoListener;
    }

    public void setHlsChunkSource(bhf bhf) {
        this.ab = bhf;
    }

    public void setInternalErrorListener(InternalErrorListener internalErrorListener) {
        this.J = internalErrorListener;
    }

    public void setMaxBufferDurationToSwitchDown(long j) {
        this.Y = j;
    }

    public void setMetadataListener(Id3MetadataListener id3MetadataListener) {
        this.K = id3MetadataListener;
    }

    public void setMinBufferDurationToSwitchUp(long j) {
        this.X = j;
    }

    public void setMinBufferMs(int i) {
        this.Z = i;
    }

    public void setMinRebufferMs(int i) {
        this.aa = i;
    }

    public void setPeakBitrate(int i) {
        this.Q = i;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        String str = a;
        StringBuilder stringBuilder = new StringBuilder("surfaceChanged: w = ");
        stringBuilder.append(i2);
        stringBuilder.append(", h = ");
        stringBuilder.append(i3);
        Log.d(str, stringBuilder.toString());
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.d(a, "surfaceCreated");
        this.v = true;
        if (this.d != null) {
            a(false);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.d(a, "surfaceDestroyed");
        this.v = false;
        if (this.d != null) {
            a(true);
            i();
        }
    }
}
