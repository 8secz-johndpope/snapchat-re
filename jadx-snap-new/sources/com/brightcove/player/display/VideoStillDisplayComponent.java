package com.brightcove.player.display;

import android.annotation.SuppressLint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.ImageView;
import com.brightcove.player.display.tasks.LoadImageTask;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.util.ErrorUtil;
import java.net.URI;

@ListensFor(events = {"activityStopped", "cuePoint", "didSeekTo", "progress", "fragmentStopped", "setVideoStill", "willInterruptContent"})
@Emits(events = {})
public class VideoStillDisplayComponent extends AbstractComponent implements Component {
    public static final String TAG = "VideoStillDisplayComponent";
    ImageView a;
    LoadImageTask b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(VideoStillDisplayComponent videoStillDisplayComponent, byte b) {
            this();
        }

        public final void processEvent(Event event) {
            Log.v(VideoStillDisplayComponent.TAG, "OnHideListener");
            VideoStillDisplayComponent.this.a.setVisibility(4);
            if (VideoStillDisplayComponent.this.b != null) {
                VideoStillDisplayComponent.this.b.cancel(true);
                VideoStillDisplayComponent.this.b = null;
            }
            VideoStillDisplayComponent.a(VideoStillDisplayComponent.this);
            VideoStillDisplayComponent.this.eventEmitter.off(EventType.CUE_POINT, VideoStillDisplayComponent.this.c);
            VideoStillDisplayComponent.this.eventEmitter.off("progress", VideoStillDisplayComponent.this.d);
            VideoStillDisplayComponent.this.eventEmitter.off(EventType.DID_SEEK_TO, VideoStillDisplayComponent.this.e);
            VideoStillDisplayComponent.this.eventEmitter.off(EventType.WILL_INTERRUPT_CONTENT, VideoStillDisplayComponent.this.f);
            VideoStillDisplayComponent.this.eventEmitter.off(EventType.ACTIVITY_STOPPED, VideoStillDisplayComponent.this.g);
            VideoStillDisplayComponent.this.eventEmitter.off(EventType.FRAGMENT_STOPPED, VideoStillDisplayComponent.this.h);
        }
    }

    class b implements EventListener {
        private b() {
        }

        /* synthetic */ b(VideoStillDisplayComponent videoStillDisplayComponent, byte b) {
            this();
        }

        @SuppressLint({"NewApi"})
        @Default
        public final void processEvent(Event event) {
            Log.v(VideoStillDisplayComponent.TAG, "OnSetVideoStill");
            VideoStillDisplayComponent.a(VideoStillDisplayComponent.this);
            a aVar = new a(VideoStillDisplayComponent.this, (byte) 0);
            VideoStillDisplayComponent videoStillDisplayComponent = VideoStillDisplayComponent.this;
            videoStillDisplayComponent.c = videoStillDisplayComponent.eventEmitter.once(EventType.CUE_POINT, aVar);
            videoStillDisplayComponent = VideoStillDisplayComponent.this;
            videoStillDisplayComponent.d = videoStillDisplayComponent.eventEmitter.once("progress", aVar);
            videoStillDisplayComponent = VideoStillDisplayComponent.this;
            videoStillDisplayComponent.e = videoStillDisplayComponent.eventEmitter.once(EventType.DID_SEEK_TO, aVar);
            videoStillDisplayComponent = VideoStillDisplayComponent.this;
            videoStillDisplayComponent.f = videoStillDisplayComponent.eventEmitter.once(EventType.WILL_INTERRUPT_CONTENT, aVar);
            videoStillDisplayComponent = VideoStillDisplayComponent.this;
            videoStillDisplayComponent.g = videoStillDisplayComponent.eventEmitter.once(EventType.ACTIVITY_STOPPED, aVar);
            videoStillDisplayComponent = VideoStillDisplayComponent.this;
            videoStillDisplayComponent.h = videoStillDisplayComponent.eventEmitter.once(EventType.FRAGMENT_STOPPED, aVar);
            URI uri = (URI) event.properties.get(Event.VIDEO_STILL);
            VideoStillDisplayComponent videoStillDisplayComponent2 = VideoStillDisplayComponent.this;
            videoStillDisplayComponent2.b = new LoadImageTask(videoStillDisplayComponent2.a, VideoStillDisplayComponent.this.eventEmitter);
            VideoStillDisplayComponent.this.b.setSuccessEventType(EventType.DID_SET_VIDEO_STILL);
            if (VERSION.SDK_INT >= 11) {
                VideoStillDisplayComponent.this.b.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new URI[]{uri});
                return;
            }
            VideoStillDisplayComponent.this.b.execute(new URI[]{uri});
        }
    }

    public VideoStillDisplayComponent(ImageView imageView, EventEmitter eventEmitter) {
        super(eventEmitter, VideoStillDisplayComponent.class);
        if (imageView != null) {
            this.a = imageView;
            addListener(EventType.SET_VIDEO_STILL, new b(this, (byte) 0));
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.IMAGE_VIEW_REQUIRED));
    }

    static /* synthetic */ void a(VideoStillDisplayComponent videoStillDisplayComponent) {
        Drawable drawable = videoStillDisplayComponent.a.getDrawable();
        if (drawable != null && (drawable instanceof BitmapDrawable)) {
            ((BitmapDrawable) drawable).getBitmap().recycle();
        }
    }
}
