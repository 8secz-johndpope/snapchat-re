package com.brightcove.player.view;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventLogger;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.util.LifecycleUtil;

@ListensFor(events = {"activitySaveInstanceState"})
public class BrightcovePlayer extends Activity implements Component {
    public static final String TAG = "BrightcovePlayer";
    private BaseVideoView a;
    private LifecycleUtil b;
    private EventLogger c;
    private Bundle d;

    private void a(View view) {
        if (this.a == null) {
            b(view);
            BaseVideoView baseVideoView = this.a;
            if (baseVideoView != null) {
                this.b = new LifecycleUtil(baseVideoView);
                this.b.onCreate(this.d, this);
                this.c = new EventLogger(this.a.getEventEmitter(), true, getClass().getSimpleName());
            } else {
                throw new IllegalStateException("A BaseVideoView must be wired up to the layout.");
            }
        }
        this.d = null;
    }

    private void b(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof BaseVideoView) {
                    this.a = (BaseVideoView) childAt;
                    return;
                } else {
                    b(childAt);
                    i++;
                }
            }
        }
    }

    public void fullScreen() {
        if (this.a.isFullScreen()) {
            Log.e(TAG, "The video view is already in full screen mode.");
        } else {
            this.a.getEventEmitter().emit(EventType.ENTER_FULL_SCREEN);
        }
    }

    public BaseVideoView getBaseVideoView() {
        return this.a;
    }

    public BrightcoveVideoView getBrightcoveVideoView() {
        BaseVideoView baseVideoView = this.a;
        return baseVideoView instanceof BrightcoveVideoView ? (BrightcoveVideoView) baseVideoView : null;
    }

    public EventLogger getEventLogger() {
        return this.c;
    }

    public void normalScreen() {
        if (this.a.isFullScreen()) {
            this.a.getEventEmitter().emit(EventType.EXIT_FULL_SCREEN);
        } else {
            Log.e(TAG, "The video view is not in full screen mode!");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.b.onConfigurationChanged(configuration);
        super.onConfigurationChanged(configuration);
    }

    /* Access modifiers changed, original: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a != null) {
            LifecycleUtil lifecycleUtil = this.b;
            if (lifecycleUtil == null || lifecycleUtil.baseVideoView != this.a) {
                this.b = new LifecycleUtil(this.a);
                this.b.onCreate(bundle, this);
                this.c = new EventLogger(this.a.getEventEmitter(), true, getClass().getSimpleName());
                return;
            }
        }
        this.d = bundle;
    }

    /* Access modifiers changed, original: protected */
    public void onDestroy() {
        Log.v(TAG, "onDestroy");
        super.onDestroy();
        this.b.activityOnDestroy();
    }

    /* Access modifiers changed, original: protected */
    public void onPause() {
        Log.v(TAG, "onPause");
        super.onPause();
        this.b.activityOnPause();
    }

    /* Access modifiers changed, original: protected */
    public void onRestart() {
        Log.v(TAG, "onRestart");
        super.onRestart();
        this.b.onRestart();
    }

    /* Access modifiers changed, original: protected */
    public void onResume() {
        Log.v(TAG, "onResume");
        super.onResume();
        this.a.getEventEmitter().on(EventType.CHANGE_ORIENTATION, new EventListener() {
            public final void processEvent(Event event) {
                BrightcovePlayer.this.setRequestedOrientation(event.getIntegerProperty(Event.REQUESTED_ORIENTATION));
            }
        });
        this.b.activityOnResume();
    }

    /* Access modifiers changed, original: protected */
    public void onSaveInstanceState(final Bundle bundle) {
        this.a.getEventEmitter().on(EventType.ACTIVITY_SAVE_INSTANCE_STATE, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                super.onSaveInstanceState(bundle);
            }
        });
        this.b.activityOnSaveInstanceState(bundle);
    }

    /* Access modifiers changed, original: protected */
    public void onStart() {
        Log.v(TAG, "onStart");
        super.onStart();
        this.b.activityOnStart();
    }

    /* Access modifiers changed, original: protected */
    public void onStop() {
        Log.v(TAG, "onStop");
        super.onStop();
        this.b.activityOnStop();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        a(findViewById(16908290));
    }

    public void setContentView(View view) {
        super.setContentView(view);
        a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a(view);
    }

    public void showClosedCaptioningDialog() {
        this.a.getClosedCaptioningController().showCaptionsDialog();
    }
}
