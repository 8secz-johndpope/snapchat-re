package com.brightcove.player.util;

import android.app.Activity;
import android.app.Fragment;
import android.content.res.Configuration;
import android.os.Bundle;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.view.BaseVideoView;
import java.util.HashMap;

@ListensFor(events = {"activityDestroyed", "fragmentDestroyedView"})
@Emits(events = {"activityCreated", "activityDestroyed", "activityPaused", "activityRestarted", "activityResumed", "activitySaveInstanceState", "activityStarted", "activityStopped", "configurationChanged", "fragmentActivityCreated", "fragmentCreatedView", "fragmentDestroyed", "fragmentDestroyedView", "fragmentDetached", "fragmentPaused", "fragmentResumed", "fragmentSaveInstanceState", "fragmentStarted", "fragmentStopped", "fragmentViewStateRestored"})
public class LifecycleUtil extends AbstractComponent {
    public static final String POSITION = "position";
    public static final String TAG = "LifecycleUtil";
    public static final String VIDEO_HEIGHT = "height";
    public static final String VIDEO_WIDTH = "width";
    public static final String WAS_PLAYING = "wasPlaying";
    private int a;
    private boolean b;
    public BaseVideoView baseVideoView;
    private int c;
    private int d;

    public LifecycleUtil(BaseVideoView baseVideoView) {
        super(baseVideoView.getEventEmitter(), LifecycleUtil.class);
        this.baseVideoView = baseVideoView;
    }

    private void a(Bundle bundle) {
        bundle.putInt("position", this.a);
        bundle.putBoolean(WAS_PLAYING, this.b);
    }

    private void b() {
        if (this.baseVideoView.getCurrentIndex() != -1) {
            a();
            return;
        }
        this.baseVideoView.getEventEmitter().once(EventType.VIDEO_DURATION_CHANGED, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                LifecycleUtil.this.a();
            }
        });
    }

    private void c() {
        boolean z;
        if (this.baseVideoView.isPlaying()) {
            this.baseVideoView.pause();
            z = true;
        } else {
            z = false;
        }
        this.b = z;
        this.a = this.baseVideoView.getCurrentPosition();
        this.c = this.baseVideoView.getVideoWidth();
        this.d = this.baseVideoView.getVideoHeight();
    }

    private void d() {
        if (this.b) {
            if (this.baseVideoView.getCurrentIndex() != -1) {
                this.baseVideoView.start();
                return;
            }
            this.baseVideoView.getEventEmitter().once(EventType.VIDEO_DURATION_CHANGED, new EventListener() {
                @Default
                public final void processEvent(Event event) {
                    LifecycleUtil.this.baseVideoView.start();
                }
            });
        }
    }

    private void e() {
        this.baseVideoView.getEventEmitter().on(EventType.ACTIVITY_DESTROYED, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                LifecycleUtil.this.baseVideoView.getEventEmitter().off();
            }
        });
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        int i = this.a;
        if (i > 0) {
            this.baseVideoView.seekTo(i);
            this.a = -1;
        }
        if (this.c > 0 && this.d > 0) {
            this.baseVideoView.getRenderView().setVideoSize(this.c, this.d);
            this.c = -1;
            this.d = -1;
        }
    }

    public void activityOnDestroy() {
        e();
        this.baseVideoView.getEventEmitter().emit(EventType.ACTIVITY_DESTROYED);
    }

    public void activityOnPause() {
        c();
        this.baseVideoView.getEventEmitter().emit(EventType.ACTIVITY_PAUSED);
    }

    public void activityOnResume() {
        d();
        this.baseVideoView.getEventEmitter().emit(EventType.ACTIVITY_RESUMED);
    }

    public void activityOnSaveInstanceState(Bundle bundle) {
        a(bundle);
        HashMap hashMap = new HashMap();
        hashMap.put(Event.INSTANCE_STATE, bundle);
        this.baseVideoView.getEventEmitter().emit(EventType.ACTIVITY_SAVE_INSTANCE_STATE, hashMap);
    }

    public void activityOnStart() {
        b();
        this.baseVideoView.getEventEmitter().emit(EventType.ACTIVITY_STARTED);
    }

    public void activityOnStop() {
        this.baseVideoView.stopPlayback();
        this.baseVideoView.getEventEmitter().emit(EventType.ACTIVITY_STOPPED);
    }

    public void fragmentOnDestroy() {
        e();
        this.baseVideoView.getEventEmitter().emit(EventType.FRAGMENT_DESTROYED);
    }

    public void fragmentOnPause() {
        c();
        this.baseVideoView.getEventEmitter().emit(EventType.FRAGMENT_PAUSED);
    }

    public void fragmentOnResume() {
        d();
        this.eventEmitter.emit(EventType.FRAGMENT_RESUMED);
    }

    public void fragmentOnSaveInstanceState(Bundle bundle) {
        a(bundle);
        HashMap hashMap = new HashMap();
        hashMap.put(Event.INSTANCE_STATE, bundle);
        this.baseVideoView.getEventEmitter().emit(EventType.FRAGMENT_SAVE_INSTANCE_STATE, hashMap);
    }

    public void fragmentOnStart() {
        b();
        this.baseVideoView.getEventEmitter().emit(EventType.FRAGMENT_STARTED);
    }

    public void fragmentOnStop() {
        this.baseVideoView.stopPlayback();
        this.eventEmitter.emit(EventType.FRAGMENT_STOPPED);
    }

    public void onActivityCreated(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            hashMap.put(Event.INSTANCE_STATE, bundle);
        }
        this.baseVideoView.getEventEmitter().emit(EventType.FRAGMENT_ACTIVITY_CREATED, hashMap);
    }

    public void onConfigurationChanged(Configuration configuration) {
        HashMap hashMap = new HashMap();
        hashMap.put(Event.CONFIGURATION, configuration);
        this.baseVideoView.getEventEmitter().emit(EventType.CONFIGURATION_CHANGED, hashMap);
    }

    public void onCreate(Bundle bundle, Activity activity) {
        if (bundle != null) {
            this.a = bundle.getInt("position");
            this.b = bundle.getBoolean(WAS_PLAYING);
            this.c = bundle.getInt("width");
            this.d = bundle.getInt("height");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Event.ACTIVITY, activity);
        if (bundle != null) {
            hashMap.put(Event.INSTANCE_STATE, bundle);
        }
        this.baseVideoView.getEventEmitter().emit(EventType.ACTIVITY_CREATED, hashMap);
    }

    public void onCreateView(Bundle bundle, Object obj) {
        if (bundle != null) {
            this.a = bundle.getInt("position");
            this.b = bundle.getBoolean(WAS_PLAYING);
            this.c = bundle.getInt("width");
            this.d = bundle.getInt("height");
        }
        HashMap hashMap = new HashMap();
        hashMap.put(obj instanceof Fragment ? Event.FRAGMENT : Event.SUPPORT_FRAGMENT, obj);
        if (bundle != null) {
            hashMap.put(Event.INSTANCE_STATE, bundle);
        }
        this.baseVideoView.getEventEmitter().emit(EventType.FRAGMENT_CREATED_VIEW, hashMap);
    }

    public void onDestroyView() {
        this.eventEmitter.emit(EventType.FRAGMENT_DESTROYED_VIEW);
    }

    public void onDetach() {
        this.eventEmitter.emit(EventType.FRAGMENT_DETACHED);
    }

    public void onRestart() {
        this.baseVideoView.getEventEmitter().emit(EventType.ACTIVITY_RESTARTED);
    }

    public void onViewStateRestored(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            hashMap.put(Event.INSTANCE_STATE, bundle);
        }
        this.eventEmitter.emit(EventType.FRAGMENT_VIEW_STATE_RESTORED, hashMap);
    }
}
