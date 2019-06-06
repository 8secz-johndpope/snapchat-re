package com.mapbox.mapboxsdk.maps;

import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraIdleListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveCanceledListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveListener;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnCameraMoveStartedListener;

public class CameraChangeDispatcher implements OnCameraIdleListener, OnCameraMoveCanceledListener, OnCameraMoveListener, OnCameraMoveStartedListener {
    private boolean idle = true;
    private OnCameraIdleListener onCameraIdleListener;
    private OnCameraMoveCanceledListener onCameraMoveCanceledListener;
    private OnCameraMoveListener onCameraMoveListener;
    private OnCameraMoveStartedListener onCameraMoveStartedListener;

    public void onCameraIdle() {
        if (!this.idle) {
            this.idle = true;
            OnCameraIdleListener onCameraIdleListener = this.onCameraIdleListener;
            if (onCameraIdleListener != null) {
                onCameraIdleListener.onCameraIdle();
            }
        }
    }

    public void onCameraMove() {
        OnCameraMoveListener onCameraMoveListener = this.onCameraMoveListener;
        if (onCameraMoveListener != null && !this.idle) {
            onCameraMoveListener.onCameraMove();
        }
    }

    public void onCameraMoveCanceled() {
        OnCameraMoveCanceledListener onCameraMoveCanceledListener = this.onCameraMoveCanceledListener;
        if (onCameraMoveCanceledListener != null && !this.idle) {
            onCameraMoveCanceledListener.onCameraMoveCanceled();
        }
    }

    public void onCameraMoveStarted(int i) {
        if (this.idle) {
            this.idle = false;
            OnCameraMoveStartedListener onCameraMoveStartedListener = this.onCameraMoveStartedListener;
            if (onCameraMoveStartedListener != null) {
                onCameraMoveStartedListener.onCameraMoveStarted(i);
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnCameraIdleListener(OnCameraIdleListener onCameraIdleListener) {
        this.onCameraIdleListener = onCameraIdleListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnCameraMoveCanceledListener(OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.onCameraMoveCanceledListener = onCameraMoveCanceledListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnCameraMoveListener(OnCameraMoveListener onCameraMoveListener) {
        this.onCameraMoveListener = onCameraMoveListener;
    }

    /* Access modifiers changed, original: 0000 */
    public void setOnCameraMoveStartedListener(OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.onCameraMoveStartedListener = onCameraMoveStartedListener;
    }
}
