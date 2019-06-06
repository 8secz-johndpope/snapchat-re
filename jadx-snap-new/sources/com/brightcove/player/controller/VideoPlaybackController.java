package com.brightcove.player.controller;

import android.util.Log;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.model.CuePoint;
import com.brightcove.player.model.CuePoint.PositionType;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.Video;
import com.brightcove.player.model.Video.Fields;
import com.brightcove.player.util.EventUtil;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@ListensFor(events = {"completed", "cuePoint", "seekTo", "didSeekTo", "didSetSource", "play", "progress", "readyToPlay", "removeCuePoint", "setCuePoint", "setCuePoints", "setVideo", "willChangeVideo"})
@Emits(events = {"completed", "cuePoint", "didSelectSource", "didSetVideo", "play", "selectSource", "setSource", "setVideoStill"})
public class VideoPlaybackController extends AbstractComponent implements Component {
    public static final String TAG = "VideoPlaybackController";
    boolean a;
    List<Source> b;
    Map<Source, Video> c;
    List<CuePoint> d;
    int e;
    boolean f;
    protected boolean g;
    private OnPlayListener h;
    private OnSetVideoListener i;
    private OnDidSetSourceListener j;
    private OnPlayerReadyListener k;
    private a l;
    private OnVideoCompletedListener m;
    private OnSeekToListener n;
    private OnDidSeekToListener o;
    private OnRemoveCuePointListener p;
    private OnSetCuePointListener q;
    private OnSetCuePointsListener r;
    private OnWillChangeVideoListener s;

    public class OnDidSeekToListener implements EventListener {
        protected OnDidSeekToListener() {
        }

        @Default
        public void processEvent(Event event) {
            int i = VideoPlaybackController.this.e;
            VideoPlaybackController.this.e = event.getIntegerProperty(Event.SEEK_POSITION);
            VideoPlaybackController videoPlaybackController;
            if (i < VideoPlaybackController.this.e) {
                videoPlaybackController = VideoPlaybackController.this;
                VideoPlaybackController.a(videoPlaybackController, i, videoPlaybackController.e);
                return;
            }
            videoPlaybackController = VideoPlaybackController.this;
            VideoPlaybackController.a(videoPlaybackController, videoPlaybackController.e, i);
        }
    }

    public class OnDidSetSourceListener implements EventListener {
        protected OnDidSetSourceListener() {
        }

        @Default
        public void processEvent(Event event) {
            Video video = (Video) event.properties.get(Event.VIDEO);
            Source source = (Source) event.properties.get("source");
            if (video != null && source != null) {
                EventUtil.emit(VideoPlaybackController.this.eventEmitter, EventType.DID_SET_VIDEO, video);
            }
        }
    }

    public class OnPlayListener implements EventListener {
        protected OnPlayListener() {
        }

        @Default
        public void processEvent(final Event event) {
            String str = VideoPlaybackController.TAG;
            StringBuilder stringBuilder = new StringBuilder("OnPlayListener: playEvent = ");
            stringBuilder.append(event);
            stringBuilder.append(", currentTime = ");
            stringBuilder.append(VideoPlaybackController.this.e);
            Log.v(str, stringBuilder.toString());
            if (VideoPlaybackController.this.e == 0) {
                Map map = event.properties;
                String str2 = Event.SKIP_CUE_POINTS;
                if (!map.containsKey(str2)) {
                    str = VideoPlaybackController.TAG;
                    StringBuilder stringBuilder2 = new StringBuilder("cuePoints = ");
                    stringBuilder2.append(VideoPlaybackController.this.d);
                    Log.i(str, stringBuilder2.toString());
                    ArrayList arrayList = new ArrayList();
                    for (CuePoint cuePoint : VideoPlaybackController.this.d) {
                        if (cuePoint.getPositionType().equals(PositionType.BEFORE) || (cuePoint.getPositionType().equals(PositionType.POINT_IN_TIME) && cuePoint.getPosition() == 0)) {
                            arrayList.add(cuePoint);
                        }
                    }
                    if (!VideoPlaybackController.this.f && !arrayList.isEmpty()) {
                        Log.i(VideoPlaybackController.TAG, "batch = ".concat(String.valueOf(arrayList)));
                        event.preventDefault();
                        event.stopPropagation();
                        event.properties.put(str2, Boolean.TRUE);
                        final UUID randomUUID = UUID.randomUUID();
                        EventEmitter eventEmitter = VideoPlaybackController.this.eventEmitter;
                        AnonymousClass1 anonymousClass1 = new EventListener() {
                            @Default
                            public final void processEvent(Event event) {
                                if (randomUUID.equals(event.properties.get("uuid"))) {
                                    VideoPlaybackController.this.eventEmitter.emit(event.getType(), event.properties);
                                }
                            }
                        };
                        String str3 = EventType.CUE_POINT;
                        eventEmitter.once(str3, anonymousClass1);
                        HashMap hashMap = new HashMap();
                        hashMap.put(Event.CUE_POINTS, arrayList);
                        hashMap.put(Event.END_TIME, Integer.valueOf(0));
                        hashMap.put(Event.START_TIME, Integer.valueOf(0));
                        hashMap.put(Event.ORIGINAL_EVENT, event);
                        hashMap.put("uuid", randomUUID);
                        VideoPlaybackController.this.eventEmitter.emit(str3, hashMap);
                    }
                }
            }
        }
    }

    public class OnPlayerReadyListener implements EventListener {
        protected OnPlayerReadyListener() {
        }

        @Default
        public void processEvent(Event event) {
            if (!VideoPlaybackController.this.a) {
                VideoPlaybackController videoPlaybackController = VideoPlaybackController.this;
                videoPlaybackController.a = true;
                if (videoPlaybackController.b.size() > 0) {
                    while (VideoPlaybackController.this.b.size() > 0) {
                        Source source = (Source) VideoPlaybackController.this.b.remove(0);
                        EventUtil.emit(VideoPlaybackController.this.eventEmitter, EventType.SET_SOURCE, (Video) VideoPlaybackController.this.c.remove(source), source);
                    }
                }
            }
        }
    }

    public class OnRemoveCuePointListener implements EventListener {
        protected OnRemoveCuePointListener() {
        }

        @Default
        public void processEvent(Event event) {
            Object obj = event.properties.get(Event.CUE_POINT);
            if (obj == null || !(obj instanceof CuePoint)) {
                Log.e(VideoPlaybackController.TAG, "could not remove CuePoint");
                return;
            }
            VideoPlaybackController.this.d.remove((CuePoint) obj);
        }
    }

    public class OnSeekToListener implements EventListener {
        protected OnSeekToListener() {
        }

        public void processEvent(Event event) {
            if (VideoPlaybackController.this.g) {
                VideoPlaybackController.this.f = true;
            }
        }
    }

    public class OnSetCuePointListener implements EventListener {
        protected OnSetCuePointListener() {
        }

        @Default
        public void processEvent(Event event) {
            Object obj = event.properties.get(Event.CUE_POINT);
            if (obj == null || !(obj instanceof CuePoint)) {
                Log.e(VideoPlaybackController.TAG, "could not find CuePoint in given Event");
                return;
            }
            VideoPlaybackController.this.d.add((CuePoint) obj);
        }
    }

    public class OnSetCuePointsListener implements EventListener {
        protected OnSetCuePointsListener() {
        }

        @Default
        public void processEvent(Event event) {
            Object obj = event.properties.get(Event.CUE_POINTS);
            if (obj == null || !(obj instanceof List)) {
                Log.e(VideoPlaybackController.TAG, "could not find List of CuePoints in given Event");
                return;
            }
            List list = (List) obj;
            VideoPlaybackController.this.d.clear();
            VideoPlaybackController.this.d.addAll(list);
        }
    }

    public class OnSetVideoListener implements EventListener {
        protected OnSetVideoListener() {
        }

        @Default
        public void processEvent(Event event) {
            Map map = event.properties;
            String str = Event.VIDEO;
            Video video = (Video) map.get(str);
            Log.v(VideoPlaybackController.TAG, "OnSetVideoListener: ".concat(String.valueOf(video)));
            Object obj = video.getProperties().get(Fields.STILL_IMAGE_URI);
            if (obj != null && (obj instanceof URI)) {
                URI uri = (URI) obj;
                HashMap hashMap = new HashMap();
                hashMap.put(Event.VIDEO_STILL, uri);
                VideoPlaybackController.this.eventEmitter.emit(EventType.SET_VIDEO_STILL, hashMap);
            }
            List cuePoints = video.getCuePoints();
            if (cuePoints != null) {
                VideoPlaybackController.this.d.addAll(cuePoints);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, video);
            OnSourceSelectedListener onSourceSelectedListener = new OnSourceSelectedListener();
            onSourceSelectedListener.currentVideo = video;
            VideoPlaybackController.this.eventEmitter.request(EventType.SELECT_SOURCE, hashMap2, onSourceSelectedListener);
        }
    }

    public class OnSourceSelectedListener implements EventListener {
        public Video currentVideo;

        protected OnSourceSelectedListener() {
        }

        @Default
        public void processEvent(Event event) {
            Log.v(VideoPlaybackController.TAG, "OnSourceSelectedListener");
            Source source = (Source) event.properties.get("source");
            VideoPlaybackController.this.c.put(source, this.currentVideo);
            EventUtil.emit(VideoPlaybackController.this.eventEmitter, EventType.DID_SELECT_SOURCE, this.currentVideo, source);
            if (VideoPlaybackController.this.a) {
                EventUtil.emit(VideoPlaybackController.this.eventEmitter, EventType.SET_SOURCE, this.currentVideo, source);
                return;
            }
            VideoPlaybackController.this.b.add(source);
        }
    }

    public class OnVideoCompletedListener implements EventListener {
        protected OnVideoCompletedListener() {
        }

        @Default
        public void processEvent(Event event) {
            Log.v(VideoPlaybackController.TAG, "OnVideoCompletedListener: ".concat(String.valueOf(event)));
            VideoPlaybackController videoPlaybackController = VideoPlaybackController.this;
            Integer valueOf = Integer.valueOf(0);
            videoPlaybackController.e = 0;
            Map map = event.properties;
            String str = Event.SKIP_CUE_POINTS;
            if (!map.containsKey(str)) {
                ArrayList arrayList = new ArrayList();
                for (CuePoint cuePoint : VideoPlaybackController.this.d) {
                    if (cuePoint.getPositionType().equals(PositionType.AFTER)) {
                        arrayList.add(cuePoint);
                    }
                }
                if (!arrayList.isEmpty()) {
                    event.preventDefault();
                    event.stopPropagation();
                    event.properties.put(str, Boolean.TRUE);
                    HashMap hashMap = new HashMap();
                    hashMap.put(Event.CUE_POINTS, arrayList);
                    hashMap.put(Event.END_TIME, valueOf);
                    hashMap.put(Event.START_TIME, valueOf);
                    hashMap.put(Event.ORIGINAL_EVENT, event);
                    VideoPlaybackController.this.eventEmitter.emit(EventType.CUE_POINT, hashMap);
                }
            }
        }
    }

    public class OnWillChangeVideoListener implements EventListener {
        protected OnWillChangeVideoListener() {
        }

        @Default
        public void processEvent(Event event) {
            VideoPlaybackController.this.d.clear();
            VideoPlaybackController.this.e = 0;
        }
    }

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(VideoPlaybackController videoPlaybackController, byte b) {
            this();
        }

        @Default
        public final void processEvent(Event event) {
            int integerProperty = event.getIntegerProperty(Event.PLAYHEAD_POSITION);
            if (VideoPlaybackController.this.e != -1 && VideoPlaybackController.this.e < integerProperty) {
                int i = VideoPlaybackController.this.e;
                VideoPlaybackController videoPlaybackController = VideoPlaybackController.this;
                videoPlaybackController.e = integerProperty;
                VideoPlaybackController.a(videoPlaybackController, i, videoPlaybackController.e);
            }
            VideoPlaybackController.this.f = false;
        }
    }

    public VideoPlaybackController(EventEmitter eventEmitter) {
        super(eventEmitter, VideoPlaybackController.class);
        initialize();
    }

    static /* synthetic */ void a(VideoPlaybackController videoPlaybackController, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (CuePoint cuePoint : videoPlaybackController.d) {
            if (cuePoint.getPositionType() != null && cuePoint.getPositionType().equals(PositionType.POINT_IN_TIME)) {
                int position = cuePoint.getPosition();
                if (i <= position && position <= i2) {
                    arrayList.add(cuePoint);
                }
            }
        }
        if (!videoPlaybackController.f && !arrayList.isEmpty()) {
            Collections.sort(arrayList);
            HashMap hashMap = new HashMap();
            hashMap.put(Event.START_TIME, Integer.valueOf(i));
            hashMap.put(Event.END_TIME, Integer.valueOf(i2));
            hashMap.put(Event.CUE_POINTS, arrayList);
            videoPlaybackController.eventEmitter.emit(EventType.CUE_POINT, hashMap);
        }
    }

    public boolean hasPendingSourcesToLoad() {
        return this.b.size() > 0;
    }

    public void initialize() {
        Log.i(TAG, "Initializing VideoPlaybackController");
        this.a = false;
        this.b = new ArrayList();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.i = new OnSetVideoListener();
        this.k = new OnPlayerReadyListener();
        this.j = new OnDidSetSourceListener();
        this.h = new OnPlayListener();
        this.l = new a(this, (byte) 0);
        this.m = new OnVideoCompletedListener();
        this.p = new OnRemoveCuePointListener();
        this.q = new OnSetCuePointListener();
        this.r = new OnSetCuePointsListener();
        this.n = new OnSeekToListener();
        this.o = new OnDidSeekToListener();
        this.s = new OnWillChangeVideoListener();
        addListener(EventType.READY_TO_PLAY, this.k);
        addListener(EventType.SET_VIDEO, this.i);
        addListener(EventType.DID_SET_SOURCE, this.j);
        addListener(EventType.PLAY, this.h);
        addListener("progress", this.l);
        addListener(EventType.COMPLETED, this.m);
        addListener(EventType.REMOVE_CUE_POINT, this.p);
        addListener(EventType.SET_CUE_POINT, this.q);
        addListener(EventType.SET_CUE_POINTS, this.r);
        addListener(EventType.SEEK_TO, this.n);
        addListener(EventType.DID_SEEK_TO, this.o);
        addListener(EventType.WILL_CHANGE_VIDEO, this.s);
    }

    public boolean isAdsDisabled() {
        return this.g;
    }

    public void setAdsDisabled(boolean z) {
        this.g = z;
    }
}
