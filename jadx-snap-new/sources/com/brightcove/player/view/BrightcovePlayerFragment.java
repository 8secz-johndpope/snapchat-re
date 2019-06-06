package com.brightcove.player.view;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.util.LifecycleUtil;

@ListensFor(events = {"fragmentSaveInstanceState"})
@TargetApi(11)
public class BrightcovePlayerFragment extends Fragment {
    public static final String TAG = "BrightcovePlayerFragment";

    public void fullScreen() {
        BaseVideoView baseVideoView = null;
        if (baseVideoView.isFullScreen()) {
            Log.e(TAG, "Event emitter is not defined or the video view is already in full screen mode.");
        } else {
            baseVideoView.getEventEmitter().emit(EventType.ENTER_FULL_SCREEN);
        }
    }

    public BaseVideoView getBaseVideoView() {
        return null;
    }

    public BrightcoveVideoView getBrightcoveVideoView() {
        return null;
    }

    public void normalScreen() {
        BaseVideoView baseVideoView = null;
        if (baseVideoView.isFullScreen()) {
            baseVideoView.getEventEmitter().emit(EventType.EXIT_FULL_SCREEN);
        } else {
            Log.e(TAG, "Event emitter is not defined or the video view is not in full screen mode!");
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Log.v(TAG, "onActivityCreated");
        super.onActivityCreated(bundle);
        LifecycleUtil lifecycleUtil = null;
        lifecycleUtil.onActivityCreated(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Log.v(TAG, "onCreateView");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        throw new IllegalStateException("brightcoveVideoView must be assigned before calling onCreateView().");
    }

    public void onDestroy() {
        Log.v(TAG, "onDestroy");
        super.onDestroy();
        LifecycleUtil lifecycleUtil = null;
        lifecycleUtil.fragmentOnDestroy();
    }

    public void onDestroyView() {
        Log.v(TAG, "onDestroyView");
        super.onDestroyView();
        LifecycleUtil lifecycleUtil = null;
        lifecycleUtil.onDestroyView();
    }

    public void onDetach() {
        Log.v(TAG, "onDetach");
        super.onDetach();
        LifecycleUtil lifecycleUtil = null;
        lifecycleUtil.onDetach();
    }

    public void onPause() {
        Log.v(TAG, "onPause");
        super.onPause();
        LifecycleUtil lifecycleUtil = null;
        lifecycleUtil.fragmentOnPause();
    }

    public void onResume() {
        Log.v(TAG, "onResume");
        super.onResume();
        BaseVideoView baseVideoView = null;
        baseVideoView.getEventEmitter().on(EventType.CHANGE_ORIENTATION, new EventListener() {
            public final void processEvent(Event event) {
                BrightcovePlayerFragment.this.getActivity().setRequestedOrientation(event.getIntegerProperty(Event.REQUESTED_ORIENTATION));
            }
        });
        baseVideoView.fragmentOnResume();
    }

    public void onSaveInstanceState(final Bundle bundle) {
        Log.v(TAG, "onSaveInstanceState");
        BaseVideoView baseVideoView = null;
        baseVideoView.getEventEmitter().on(EventType.FRAGMENT_SAVE_INSTANCE_STATE, new EventListener() {
            @Default
            public final void processEvent(Event event) {
                super.onSaveInstanceState(bundle);
            }
        });
        baseVideoView.fragmentOnSaveInstanceState(bundle);
    }

    public void onStart() {
        Log.v(TAG, "onStart");
        super.onStart();
        LifecycleUtil lifecycleUtil = null;
        lifecycleUtil.fragmentOnStart();
    }

    public void onStop() {
        Log.v(TAG, "onStop");
        super.onStop();
        LifecycleUtil lifecycleUtil = null;
        lifecycleUtil.fragmentOnStop();
    }

    @TargetApi(17)
    public void onViewStateRestored(Bundle bundle) {
        Log.v(TAG, "onViewStateRestored");
        super.onViewStateRestored(bundle);
        LifecycleUtil lifecycleUtil = null;
        lifecycleUtil.onViewStateRestored(bundle);
    }
}
