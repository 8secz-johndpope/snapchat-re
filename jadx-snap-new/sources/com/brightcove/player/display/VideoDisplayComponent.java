package com.brightcove.player.display;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.brightcove.player.analytics.Analytics;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.model.RendererConfig;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.model.Video.ProjectionFormat;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.EventUtil;
import com.brightcove.player.view.RenderView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ppy;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@ListensFor(events = {"completed", "didSetSource", "pause", "play", "prebufferNextVideo", "seekTo", "setSource", "stop", "videoDurationChanged", "willChangeVideo", "willInterruptContent", "willResumeContent", "readyToPlay", "setVolume", "didSetVideo", "on360FrameAvailable"})
@Emits(events = {"bufferedUpdate", "completed", "didInterruptContent", "didPause", "didPlay", "didResumeContent", "didSeekTo", "didSetSource", "didStop", "error", "pause", "play", "progress", "sourceNotPlayable", "stop", "videoDurationChanged", "videoSizeKnown", "willChangeVideo", "readyToPlay"})
public class VideoDisplayComponent extends AbstractComponent {
    private static final ScheduledExecutorService a = Executors.newScheduledThreadPool(1);
    static final String k = "VideoDisplayComponent";
    protected Source A;
    protected Video B;
    protected Source C;
    protected RendererConfig D;
    private j E;
    private g F;
    private OnBufferingUpdateListener G = new OnBufferingUpdateListener() {
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            HashMap hashMap = new HashMap();
            hashMap.put(Event.PERCENT_COMPLETE, Integer.valueOf(i));
            VideoDisplayComponent.this.eventEmitter.emit(EventType.BUFFERED_UPDATE, hashMap);
        }
    };
    private OnCompletionListener H = new OnCompletionListener() {
        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (!VideoDisplayComponent.this.u) {
                HashMap hashMap = new HashMap();
                if (mediaPlayer != null && VideoDisplayComponent.this.t && VideoDisplayComponent.this.v) {
                    hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(mediaPlayer.getDuration()));
                    hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
                }
                hashMap.put(Event.VIDEO, VideoDisplayComponent.this.z);
                VideoDisplayComponent.this.eventEmitter.emit(EventType.COMPLETED, hashMap);
            }
            if (VideoDisplayComponent.this.A != null && VideoDisplayComponent.this.A.getDeliveryType() == DeliveryType.HLS) {
                VideoDisplayComponent.this.d();
            }
        }
    };
    private OnSeekCompleteListener I = new OnSeekCompleteListener() {
        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            String str = VideoDisplayComponent.k;
            StringBuilder stringBuilder = new StringBuilder("onSeekComplete: fromSeekPosition = ");
            stringBuilder.append(VideoDisplayComponent.this.p);
            stringBuilder.append(", seekPosition = ");
            stringBuilder.append(VideoDisplayComponent.this.w);
            Log.v(str, stringBuilder.toString());
            if (!VideoDisplayComponent.this.v || mediaPlayer.getCurrentPosition() >= VideoDisplayComponent.this.w || VideoDisplayComponent.this.x) {
                if (VideoDisplayComponent.this.p != -1) {
                    HashMap hashMap = new HashMap();
                    if (VideoDisplayComponent.this.v) {
                        hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(mediaPlayer.getCurrentPosition()));
                    }
                    hashMap.put(Event.SEEK_POSITION, Integer.valueOf(VideoDisplayComponent.this.w));
                    hashMap.put(Event.FROM_SEEK_POSITION, Integer.valueOf(VideoDisplayComponent.this.p));
                    hashMap.put(Event.VIDEO, VideoDisplayComponent.this.z);
                    VideoDisplayComponent.this.eventEmitter.emit(EventType.DID_SEEK_TO, hashMap);
                    VideoDisplayComponent videoDisplayComponent = VideoDisplayComponent.this;
                    videoDisplayComponent.p = -1;
                    videoDisplayComponent.x = false;
                }
                return;
            }
            mediaPlayer.seekTo(VideoDisplayComponent.this.w);
            VideoDisplayComponent.this.x = true;
        }
    };
    private OnPreparedListener J = new OnPreparedListener() {
        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (!VideoDisplayComponent.this.u) {
                VideoDisplayComponent videoDisplayComponent = VideoDisplayComponent.this;
                videoDisplayComponent.t = true;
                if (videoDisplayComponent.A.getProperties().get("emittedDidSetSource") == null) {
                    EventUtil.emit(VideoDisplayComponent.this.eventEmitter, EventType.DID_SET_SOURCE, VideoDisplayComponent.this.z, VideoDisplayComponent.this.A);
                }
                VideoDisplayComponent.this.a(mediaPlayer.getVideoWidth(), mediaPlayer.getVideoHeight());
                HashMap hashMap = new HashMap();
                hashMap.put(Event.VIDEO, VideoDisplayComponent.this.z);
                hashMap.put("source", VideoDisplayComponent.this.A);
                hashMap.put("duration", Integer.valueOf(mediaPlayer.getDuration()));
                VideoDisplayComponent.this.eventEmitter.emit(EventType.VIDEO_DURATION_CHANGED, hashMap);
                VideoDisplayComponent.this.l = 3;
            }
        }
    };
    private OnVideoSizeChangedListener K = new OnVideoSizeChangedListener() {
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            if (i != 0 && i2 != 0) {
                VideoDisplayComponent.this.a(i, i2);
            }
        }
    };
    private OnErrorListener L = new OnErrorListener() {
        /* JADX WARNING: Missing block: B:3:0x0005, code skipped:
            if (r2 != 100) goto L_0x0007;
     */
        public final boolean onError(android.media.MediaPlayer r1, int r2, int r3) {
            /*
            r0 = this;
            r1 = 1;
            if (r2 == r1) goto L_0x000d;
        L_0x0003:
            r1 = 100;
            if (r2 == r1) goto L_0x0011;
        L_0x0007:
            r1 = com.brightcove.player.display.VideoDisplayComponent.this;
            com.brightcove.player.display.VideoDisplayComponent.a(r1, r2, r3);
            goto L_0x0011;
        L_0x000d:
            switch(r3) {
                case -1014: goto L_0x0011;
                case -1013: goto L_0x0011;
                case -1012: goto L_0x0011;
                default: goto L_0x0010;
            };
        L_0x0010:
            goto L_0x0007;
        L_0x0011:
            r1 = 0;
            return r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.display.VideoDisplayComponent$AnonymousClass10.onError(android.media.MediaPlayer, int, int):boolean");
        }
    };
    private OnInfoListener M = new OnInfoListener() {
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            String str;
            String str2;
            if (i == 1) {
                str = VideoDisplayComponent.k;
                str2 = "MEDIA_INFO_UNKNOWN";
            } else if (i == 3) {
                str = VideoDisplayComponent.k;
                str2 = "MEDIA_INFO_VIDEO_RENDERING_START";
            } else if (i != 900) {
                switch (i) {
                    case 700:
                        str = VideoDisplayComponent.k;
                        str2 = "MEDIA_INFO_VIDEO_TRACK_LAGGING";
                        break;
                    case 701:
                        str = VideoDisplayComponent.k;
                        str2 = "MEDIA_INFO_BUFFERING_START";
                        break;
                    case 702:
                        str = VideoDisplayComponent.k;
                        str2 = "MEDIA_INFO_BUFFERING_END";
                        break;
                    case 703:
                        str = VideoDisplayComponent.k;
                        str2 = "MEDIA_INFO_NETWORK_BANDWIDTH";
                        break;
                    default:
                        switch (i) {
                            case 800:
                                str = VideoDisplayComponent.k;
                                str2 = "MEDIA_INFO_BAD_INTERLEAVING";
                                break;
                            case 801:
                                str = VideoDisplayComponent.k;
                                str2 = "MEDIA_INFO_NOT_SEEKABLE";
                                break;
                            case 802:
                                str = VideoDisplayComponent.k;
                                str2 = "MEDIA_INFO_METADATA_UPDATE";
                                break;
                            default:
                                Log.i(VideoDisplayComponent.k, "unknown MediaPlayer info: what = ".concat(String.valueOf(i)));
                                break;
                        }
                }
            } else {
                str = VideoDisplayComponent.k;
                str2 = "MEDIA_INFO_TIMED_TEXT_ERROR";
            }
            Log.i(str, str2);
            return true;
        }
    };
    private Analytics b;
    private OnSetSourceListener c;
    private d d;
    private c e;
    private f f;
    private h g;
    private e h;
    private a i;
    private i j;
    int l = 1;
    protected boolean m;
    protected RenderView n;
    MediaPlayer o;
    protected int p = -1;
    protected Context q;
    protected ScheduledFuture<?> r;
    boolean s;
    boolean t;
    boolean u;
    protected boolean v;
    protected int w;
    protected boolean x;
    protected int y;
    protected Video z;

    public class OnSetSourceListener implements EventListener {
        protected OnSetSourceListener() {
        }

        @Default
        public void processEvent(Event event) {
            Log.v(VideoDisplayComponent.k, "OnSetSourceListener");
            VideoDisplayComponent.this.d();
            VideoDisplayComponent.this.z = (Video) event.properties.get(Event.VIDEO);
            VideoDisplayComponent.this.A = (Source) event.properties.get("source");
            if (!(VideoDisplayComponent.this.A == null || VideoDisplayComponent.this.A.getUrl() == null)) {
                if (VideoDisplayComponent.this.A.getDeliveryType() == DeliveryType.HLS || VideoDisplayComponent.this.A.getDeliveryType() == DeliveryType.WVM) {
                    VideoDisplayComponent.this.A.getProperties().put("emittedDidSetSource", Boolean.TRUE);
                    EventUtil.emit(VideoDisplayComponent.this.eventEmitter, EventType.DID_SET_SOURCE, VideoDisplayComponent.this.z, VideoDisplayComponent.this.A);
                } else {
                    VideoDisplayComponent videoDisplayComponent = VideoDisplayComponent.this;
                    videoDisplayComponent.a(videoDisplayComponent.z, VideoDisplayComponent.this.A);
                }
            }
        }
    }

    public class OnWillChangeVideoListener implements EventListener {
        protected OnWillChangeVideoListener() {
        }

        @Default
        public void processEvent(Event event) {
            VideoDisplayComponent.this.y = 0;
        }
    }

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            if (VideoDisplayComponent.this.C != null) {
                final UUID randomUUID = UUID.randomUUID();
                EventEmitter eventEmitter = VideoDisplayComponent.this.eventEmitter;
                AnonymousClass1 anonymousClass1 = new EventListener() {
                    @Default
                    public final void processEvent(Event event) {
                        Log.v(VideoDisplayComponent.k, "OnCompletedListener: WILL_CHANGE_VIDEO");
                        if (event.properties.get("uuid").equals(randomUUID)) {
                            VideoDisplayComponent.this.d();
                            String str = VideoDisplayComponent.k;
                            StringBuilder stringBuilder = new StringBuilder("OnCompletedListener: currentSource = ");
                            stringBuilder.append(VideoDisplayComponent.this.A);
                            stringBuilder.append(", nextSource = ");
                            stringBuilder.append(VideoDisplayComponent.this.C);
                            Log.v(str, stringBuilder.toString());
                            VideoDisplayComponent.this.z = VideoDisplayComponent.this.B;
                            VideoDisplayComponent.this.B = null;
                            VideoDisplayComponent.this.A = VideoDisplayComponent.this.C;
                            VideoDisplayComponent.this.C = null;
                            VideoDisplayComponent.this.eventEmitter.once(EventType.DID_SET_SOURCE, new EventListener() {
                                @Default
                                public final void processEvent(Event event) {
                                    VideoDisplayComponent.this.eventEmitter.emit(EventType.PLAY);
                                }
                            });
                            VideoDisplayComponent.this.a(VideoDisplayComponent.this.z, VideoDisplayComponent.this.A);
                        }
                    }
                };
                String str = EventType.WILL_CHANGE_VIDEO;
                eventEmitter.once(str, anonymousClass1);
                HashMap hashMap = new HashMap();
                hashMap.put(Event.CURRENT_VIDEO, VideoDisplayComponent.this.z);
                hashMap.put(Event.NEXT_VIDEO, VideoDisplayComponent.this.B);
                hashMap.put("uuid", randomUUID);
                VideoDisplayComponent.this.eventEmitter.emit(str, hashMap);
            }
        }
    }

    class b implements EventListener {
        private b() {
        }

        /* synthetic */ b(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            VideoDisplayComponent videoDisplayComponent = VideoDisplayComponent.this;
            videoDisplayComponent.m = true;
            if (videoDisplayComponent.l == 1) {
                videoDisplayComponent = VideoDisplayComponent.this;
                videoDisplayComponent.c(videoDisplayComponent.z, VideoDisplayComponent.this.A);
            }
        }
    }

    class c implements EventListener {
        private c() {
        }

        /* synthetic */ c(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(VideoDisplayComponent.k, "OnPauseListener");
            if (VideoDisplayComponent.this.o != null && VideoDisplayComponent.this.t && VideoDisplayComponent.this.v && VideoDisplayComponent.this.o.isPlaying()) {
                VideoDisplayComponent.this.o.pause();
                HashMap hashMap = new HashMap();
                hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(VideoDisplayComponent.this.o.getCurrentPosition()));
                VideoDisplayComponent.this.eventEmitter.emit(EventType.DID_PAUSE, hashMap);
            }
        }
    }

    class d implements EventListener {
        private d() {
        }

        /* synthetic */ d(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            String str = VideoDisplayComponent.k;
            StringBuilder stringBuilder = new StringBuilder("OnPlayListener: mediaPlayer = ");
            stringBuilder.append(VideoDisplayComponent.this.o);
            stringBuilder.append(", hasPrepared = ");
            stringBuilder.append(VideoDisplayComponent.this.t);
            stringBuilder.append(", hasSurface = ");
            stringBuilder.append(VideoDisplayComponent.this.v);
            Log.v(str, stringBuilder.toString());
            VideoDisplayComponent videoDisplayComponent = VideoDisplayComponent.this;
            videoDisplayComponent.s = false;
            if (videoDisplayComponent.A != null) {
                int integerProperty;
                Map map = event.properties;
                String str2 = Event.PLAYHEAD_POSITION;
                if (map.containsKey(str2)) {
                    integerProperty = event.getIntegerProperty(str2);
                } else {
                    String str3 = VideoDisplayComponent.k;
                    StringBuilder stringBuilder2 = new StringBuilder("OnPlayListener: playheadPosition = ");
                    stringBuilder2.append(VideoDisplayComponent.this.y);
                    Log.v(str3, stringBuilder2.toString());
                    integerProperty = VideoDisplayComponent.this.y;
                }
                if (VideoDisplayComponent.this.o == null) {
                    VideoDisplayComponent.this.y = 0;
                    Log.v(VideoDisplayComponent.k, "OnPlayListener: MediaPlayer was null - creating a new one.");
                    VideoDisplayComponent.this.eventEmitter.once(EventType.VIDEO_DURATION_CHANGED, new EventListener() {
                        @Default
                        public final void processEvent(Event event) {
                            VideoDisplayComponent.a(VideoDisplayComponent.this, integerProperty);
                        }
                    });
                    VideoDisplayComponent videoDisplayComponent2 = VideoDisplayComponent.this;
                    videoDisplayComponent2.a(videoDisplayComponent2.z, VideoDisplayComponent.this.A);
                    return;
                } else if (!VideoDisplayComponent.this.t) {
                    Log.v(VideoDisplayComponent.k, "OnPlayListener: MediaPlayer has not been prepared yet.");
                    VideoDisplayComponent.this.eventEmitter.once(EventType.DID_SET_SOURCE, new EventListener() {
                        @Default
                        public final void processEvent(Event event) {
                            VideoDisplayComponent.a(VideoDisplayComponent.this, integerProperty);
                        }
                    });
                    return;
                } else if (!VideoDisplayComponent.this.v) {
                    Log.v(VideoDisplayComponent.k, "OnPlayListener: Surface is not available yet.");
                    VideoDisplayComponent.this.eventEmitter.once(EventType.READY_TO_PLAY, new EventListener() {
                        @Default
                        public final void processEvent(Event event) {
                            VideoDisplayComponent.a(VideoDisplayComponent.this, integerProperty);
                        }
                    });
                    return;
                } else if (VideoDisplayComponent.this.o.isPlaying()) {
                    Log.w(VideoDisplayComponent.k, "Already playing.");
                    return;
                } else {
                    VideoDisplayComponent.a(VideoDisplayComponent.this, integerProperty);
                    return;
                }
            }
            Log.e(VideoDisplayComponent.k, "Source has not been set yet.");
        }
    }

    class e implements EventListener {
        private e() {
        }

        /* synthetic */ e(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            VideoDisplayComponent.this.B = (Video) event.properties.get(Event.VIDEO);
            VideoDisplayComponent.this.C = (Source) event.properties.get("source");
        }
    }

    class f implements EventListener {
        private f() {
        }

        /* synthetic */ f(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            String str = VideoDisplayComponent.k;
            StringBuilder stringBuilder = new StringBuilder("OnSeekListener: mediaPlayer = ");
            stringBuilder.append(VideoDisplayComponent.this.o);
            Log.v(str, stringBuilder.toString());
            Map map = event.properties;
            String str2 = Event.SEEK_POSITION;
            if (map.containsKey(str2)) {
                final int integerProperty = event.getIntegerProperty(str2);
                Log.v(VideoDisplayComponent.k, "OnSeekListener: position = ".concat(String.valueOf(integerProperty)));
                if (VideoDisplayComponent.this.o != null && VideoDisplayComponent.this.t && VideoDisplayComponent.this.v) {
                    VideoDisplayComponent videoDisplayComponent = VideoDisplayComponent.this;
                    videoDisplayComponent.p = videoDisplayComponent.y;
                    videoDisplayComponent = VideoDisplayComponent.this;
                    videoDisplayComponent.w = integerProperty;
                    videoDisplayComponent.o.seekTo(integerProperty);
                    return;
                }
                VideoDisplayComponent.this.eventEmitter.once(EventType.VIDEO_DURATION_CHANGED, new EventListener() {
                    @Default
                    public final void processEvent(Event event) {
                        VideoDisplayComponent.this.o.seekTo(integerProperty);
                    }
                });
                VideoDisplayComponent videoDisplayComponent2 = VideoDisplayComponent.this;
                videoDisplayComponent2.a(videoDisplayComponent2.z, VideoDisplayComponent.this.A);
                return;
            }
            Log.e(VideoDisplayComponent.k, "Seek event must pass the seekPosition property.");
        }
    }

    class g implements EventListener {
        private g() {
        }

        /* synthetic */ g(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            String str = VideoDisplayComponent.k;
            StringBuilder stringBuilder = new StringBuilder("OnSetVolumeListener: mediaPlayer = ");
            stringBuilder.append(VideoDisplayComponent.this.o);
            Log.v(str, stringBuilder.toString());
            Map map = event.properties;
            String str2 = Event.LEFT_VOLUME;
            if (map.containsKey(str2)) {
                map = event.properties;
                String str3 = Event.RIGHT_VOLUME;
                if (map.containsKey(str3)) {
                    float floatValue = ((Float) event.properties.get(str2)).floatValue();
                    float floatValue2 = ((Float) event.properties.get(str3)).floatValue();
                    str2 = VideoDisplayComponent.k;
                    StringBuilder stringBuilder2 = new StringBuilder("OnSetVolumeListener: leftVolume = ");
                    stringBuilder2.append(floatValue);
                    stringBuilder2.append(" rightVolume = ");
                    stringBuilder2.append(floatValue2);
                    Log.v(str2, stringBuilder2.toString());
                    if (floatValue < MapboxConstants.MINIMUM_ZOOM || floatValue > 1.0f || floatValue2 < MapboxConstants.MINIMUM_ZOOM || floatValue2 > 1.0f) {
                        str2 = VideoDisplayComponent.k;
                        stringBuilder2 = new StringBuilder("LEFT_VOLUME and RIGHT_VOLUME must be between 0.0f and 1.0f: ");
                        stringBuilder2.append(floatValue);
                        stringBuilder2.append(ppy.d);
                        stringBuilder2.append(floatValue2);
                        Log.e(str2, stringBuilder2.toString());
                        return;
                    }
                    VideoDisplayComponent.this.o.setVolume(floatValue, floatValue2);
                    return;
                }
            }
            Log.e(VideoDisplayComponent.k, "SET_VOLUME requires LEFT_VOLUME and RIGHT_VOLUME properties.");
        }
    }

    class h implements EventListener {
        private h() {
        }

        /* synthetic */ h(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            Log.v(VideoDisplayComponent.k, "OnStopListener");
            if (VideoDisplayComponent.this.o != null) {
                HashMap hashMap = new HashMap();
                hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(VideoDisplayComponent.this.o.getCurrentPosition()));
                VideoDisplayComponent.this.eventEmitter.emit(EventType.DID_STOP, hashMap);
            }
            VideoDisplayComponent.this.d();
        }
    }

    class i implements EventListener {
        private i() {
        }

        /* synthetic */ i(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            String str = VideoDisplayComponent.k;
            StringBuilder stringBuilder = new StringBuilder("OnWillInterruptContentListener: mediaPlayer = ");
            stringBuilder.append(VideoDisplayComponent.this.o);
            stringBuilder.append(", hasPrepared = ");
            stringBuilder.append(VideoDisplayComponent.this.t);
            stringBuilder.append(", hasSurface = ");
            stringBuilder.append(VideoDisplayComponent.this.v);
            stringBuilder.append(", currentSource = ");
            stringBuilder.append(VideoDisplayComponent.this.A);
            Log.v(str, stringBuilder.toString());
            if (VideoDisplayComponent.this.o != null && VideoDisplayComponent.this.t && VideoDisplayComponent.this.v && VideoDisplayComponent.this.o.isPlaying()) {
                Log.v(VideoDisplayComponent.k, "OnWillInterruptContentListener: isPlaying");
                if (VideoDisplayComponent.this.A == null || VideoDisplayComponent.this.A.getDeliveryType() == DeliveryType.HLS) {
                    int i = VideoDisplayComponent.this.y;
                    VideoDisplayComponent.this.d();
                    VideoDisplayComponent.this.y = i;
                } else {
                    VideoDisplayComponent.this.o.pause();
                }
            }
            VideoDisplayComponent.this.n.setVisibility(4);
            VideoDisplayComponent.this.eventEmitter.emit(EventType.DID_INTERRUPT_CONTENT);
        }
    }

    class j implements EventListener {
        private j() {
        }

        /* synthetic */ j(VideoDisplayComponent videoDisplayComponent, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            VideoDisplayComponent.this.n.setVisibility(0);
            event = (Event) event.properties.get(Event.ORIGINAL_EVENT);
            Log.v(VideoDisplayComponent.k, "OnWillResumeContentListener: originalEvent = ".concat(String.valueOf(event)));
            if (event != null) {
                VideoDisplayComponent.this.eventEmitter.emit(event.getType(), event.properties);
            }
            VideoDisplayComponent.this.eventEmitter.emit(EventType.DID_RESUME_CONTENT);
        }
    }

    public VideoDisplayComponent(RenderView renderView, EventEmitter eventEmitter) {
        super(eventEmitter, VideoDisplayComponent.class);
        if (renderView == null || eventEmitter == null) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.RENDER_VIEW_AND_EVENT_EMITTER_REQUIRED));
        }
        this.b = new Analytics(eventEmitter, renderView.getContext());
        this.n = renderView;
        this.q = renderView.getContext();
        if (VERSION.SDK_INT <= 10) {
            SurfaceHolder holder = this.n.getHolder();
            if (holder != null) {
                holder.setType(3);
            }
        }
        a();
    }

    @SuppressLint({"NewApi"})
    @TargetApi(14)
    private static void a(MediaPlayer mediaPlayer, Surface surface) {
        if (VERSION.SDK_INT >= 14) {
            mediaPlayer.setSurface(surface);
        }
    }

    protected static Map<String, String> b(Video video, Source source) {
        Object obj;
        String str = "headers";
        try {
            obj = (Map) video.getProperties().get(str);
        } catch (Exception e) {
            Log.e(k, "Failed to use Video headers.", e);
            obj = null;
        }
        try {
            Map map = (Map) source.getProperties().get(str);
            if (map != null) {
                if (obj != null) {
                    obj.putAll(map);
                } else {
                    obj = map;
                }
            }
        } catch (Exception e2) {
            Log.e(k, "Failed to use Source headers.", e2);
        }
        Log.v(k, "headers = ".concat(String.valueOf(obj)));
        return obj;
    }

    private void c(Video video, Source source) {
        Log.v(k, "createPlayer");
        SurfaceHolder holder = this.n.getHolder();
        try {
            this.o = new MediaPlayer();
            if (holder != null) {
                this.o.setDisplay(holder);
            } else {
                a(this.o, this.n.getSurface());
            }
            this.o.setOnPreparedListener(this.J);
            this.o.setOnVideoSizeChangedListener(this.K);
            this.o.setOnCompletionListener(this.H);
            this.o.setOnSeekCompleteListener(this.I);
            this.o.setOnBufferingUpdateListener(this.G);
            this.o.setOnErrorListener(this.L);
            this.o.setOnInfoListener(this.M);
            this.o.setScreenOnWhilePlaying(true);
            if (VERSION.SDK_INT >= 14) {
                this.o.setDataSource(this.q, Uri.parse(source.getUrl()), b(video, source));
            } else {
                if (b(video, source) != null) {
                    Log.w(k, "Headers ignored below API level 14");
                }
                this.o.setDataSource(this.q, Uri.parse(source.getUrl()));
            }
            this.o.prepareAsync();
            this.y = 0;
            this.l = 2;
        } catch (IOException e) {
            Log.e(k, "IOException trying to play video", e);
            String str = "error";
            this.eventEmitter.emit(str, Collections.singletonMap(str, e));
        }
    }

    /* Access modifiers changed, original: protected */
    public void a() {
        this.c = new OnSetSourceListener();
        this.d = new d(this, (byte) 0);
        this.e = new c(this, (byte) 0);
        this.f = new f(this, (byte) 0);
        this.g = new h(this, (byte) 0);
        this.h = new e(this, (byte) 0);
        this.i = new a(this, (byte) 0);
        this.j = new i(this, (byte) 0);
        this.E = new j(this, (byte) 0);
        this.F = new g(this, (byte) 0);
        addListener(EventType.SET_SOURCE, this.c);
        addListener(EventType.PLAY, this.d);
        addListener(EventType.SEEK_TO, this.f);
        addListener(EventType.PAUSE, this.e);
        addListener(EventType.STOP, this.g);
        addListener(EventType.PREBUFFER_NEXT_VIDEO, this.h);
        addListener(EventType.COMPLETED, this.i);
        addListener(EventType.WILL_INTERRUPT_CONTENT, this.j);
        addListener(EventType.WILL_RESUME_CONTENT, this.E);
        addListener(EventType.SET_VOLUME, this.F);
        addListener(EventType.WILL_CHANGE_VIDEO, new OnWillChangeVideoListener());
        addListener(EventType.ON_FRAME_AVAILABLE, new b(this, (byte) 0));
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, int i2) {
        String str = k;
        StringBuilder stringBuilder = new StringBuilder("emitVideoSize: ");
        stringBuilder.append(i);
        String str2 = ppy.d;
        stringBuilder.append(str2);
        stringBuilder.append(i2);
        stringBuilder.append(str2);
        stringBuilder.append(this.n.getWidth());
        stringBuilder.append(str2);
        stringBuilder.append(this.n.getHeight());
        Log.v(str, stringBuilder.toString());
        if (i > 0 && i2 > 0) {
            if (i != this.n.getVideoWidth() || i2 != this.n.getVideoHeight()) {
                this.n.setVideoSize(i, i2);
                HashMap hashMap = new HashMap();
                hashMap.put("width", Integer.valueOf(i));
                hashMap.put("height", Integer.valueOf(i2));
                this.eventEmitter.emit(EventType.VIDEO_SIZE_KNOWN, hashMap);
            }
        }
    }

    /* Access modifiers changed, original: protected */
    public void a(final Video video, final Source source) {
        String url = source.getUrl();
        if (url == null || url.trim().equals("")) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.INVALID_URL));
        }
        if (video != null) {
            this.n.setProjectionFormat(video.getProjectionFormat());
        }
        d();
        this.s = false;
        url = k;
        StringBuilder stringBuilder = new StringBuilder("openVideo: hasSurface = ");
        stringBuilder.append(this.v);
        Log.v(url, stringBuilder.toString());
        if (this.v) {
            boolean isCurrentVideo360Mode = isCurrentVideo360Mode();
            if ((isCurrentVideo360Mode && this.m) || !isCurrentVideo360Mode) {
                if (this.n.getSurface() != null) {
                    c(video, source);
                    return;
                }
                Log.e(k, "openVideo: null surface");
            }
            return;
        }
        this.eventEmitter.once(EventType.READY_TO_PLAY, new EventListener() {
            public final void processEvent(Event event) {
                VideoDisplayComponent.this.c(video, source);
            }
        });
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, Exception exception) {
        Log.e(k, str, exception);
        HashMap hashMap = new HashMap();
        hashMap.put(Event.VIDEO, this.z);
        hashMap.put("source", this.A);
        String str2 = "error";
        hashMap.put(str2, exception);
        hashMap.put(Event.ERROR_MESSAGE, str);
        this.eventEmitter.emit(str2, hashMap);
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        Log.v(k, "startUpdater");
        this.r = a.scheduleAtFixedRate(new Runnable() {
            public final void run() {
                Throwable e;
                String str;
                StringBuilder stringBuilder;
                String message;
                String str2 = "error";
                try {
                    if (VideoDisplayComponent.this.o != null && VideoDisplayComponent.this.t && VideoDisplayComponent.this.v && VideoDisplayComponent.this.o.isPlaying() && VideoDisplayComponent.this.o.getCurrentPosition() >= 0) {
                        HashMap hashMap = new HashMap(4);
                        hashMap.put(Event.VIDEO, VideoDisplayComponent.this.z);
                        hashMap.put("source", VideoDisplayComponent.this.A);
                        VideoDisplayComponent.this.y = VideoDisplayComponent.this.o.getCurrentPosition();
                        hashMap.put(Event.PLAYHEAD_POSITION, Integer.valueOf(VideoDisplayComponent.this.y));
                        hashMap.put("duration", Integer.valueOf(VideoDisplayComponent.this.o.getDuration()));
                        if (VideoDisplayComponent.this.y > 0 && !VideoDisplayComponent.this.s) {
                            VideoDisplayComponent.this.eventEmitter.emit(EventType.DID_PLAY, hashMap);
                            VideoDisplayComponent.this.s = true;
                        }
                        VideoDisplayComponent.this.eventEmitter.emit("progress", hashMap);
                    }
                } catch (IllegalStateException e2) {
                    e = e2;
                    VideoDisplayComponent.this.d();
                    str = VideoDisplayComponent.k;
                    stringBuilder = new StringBuilder("Media player position sampled when it was in an invalid state: ");
                    message = e.getMessage();
                    stringBuilder.append(message);
                    Log.e(str, stringBuilder.toString(), e);
                    VideoDisplayComponent.this.eventEmitter.emit(str2, Collections.singletonMap(str2, e));
                } catch (Exception e3) {
                    e = e3;
                    VideoDisplayComponent.this.d();
                    str = VideoDisplayComponent.k;
                    stringBuilder = new StringBuilder("Error monitoring playback progress");
                    message = e.getMessage();
                    stringBuilder.append(message);
                    Log.e(str, stringBuilder.toString(), e);
                    VideoDisplayComponent.this.eventEmitter.emit(str2, Collections.singletonMap(str2, e));
                }
            }
        }, 0, 500, TimeUnit.MILLISECONDS);
    }

    /* Access modifiers changed, original: protected */
    public void c() {
        String str = k;
        StringBuilder stringBuilder = new StringBuilder("stopUpdater: ");
        stringBuilder.append(this.r);
        Log.v(str, stringBuilder.toString());
        ScheduledFuture scheduledFuture = this.r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.r = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void d() {
        c();
        Source source = this.A;
        if (source != null) {
            source.getProperties().remove("emittedDidSetSource");
        }
        if (this.o != null) {
            Log.i(k, "Shutting down current MediaPlayer");
            this.n.release();
            this.o.release();
            this.o = null;
            this.t = false;
            this.u = false;
        }
        this.l = 1;
        this.m = false;
    }

    public Analytics getAnalytics() {
        return this.b;
    }

    public int getLiveEdge() {
        return 0;
    }

    public MediaPlayer getMediaPlayer() {
        return this.o;
    }

    public RenderView getRenderView() {
        return this.n;
    }

    public boolean hasDvr() {
        return false;
    }

    public boolean isCurrentVideo360Mode() {
        Video video = this.z;
        return (video == null || video.getProjectionFormat() == ProjectionFormat.NORMAL) ? false : true;
    }

    public boolean isLive() {
        return false;
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceCreated(null);
    }

    public void onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceDestroyed(null);
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setRendererConfig(RendererConfig rendererConfig) {
        this.D = rendererConfig;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Log.d(k, "surfaceChanged");
        if (!(this.o == null || surfaceHolder == null || isCurrentVideo360Mode())) {
            if (surfaceHolder.getSurface() != null) {
                this.o.setDisplay(surfaceHolder);
            } else {
                String message = ErrorUtil.getMessage(ErrorUtil.INVALID_SURFACE);
                Log.e(k, "surfaceChanged: ".concat(String.valueOf(message)));
                this.eventEmitter.emit("error", Collections.singletonMap(Event.ERROR_MESSAGE, message));
            }
        }
        this.v = true;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.d(k, "surfaceCreated");
        this.v = true;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.d(k, "surfaceDestroyed");
        if (this.o != null) {
            if (!Boolean.valueOf(System.getProperty("releaseWhenSurfaceDestroyed")).booleanValue()) {
                if (this.o.isPlaying()) {
                    Source source = this.A;
                    if (!(source == null || source.getDeliveryType() == DeliveryType.HLS)) {
                        this.o.pause();
                    }
                }
            }
            d();
        }
        this.v = false;
    }
}
