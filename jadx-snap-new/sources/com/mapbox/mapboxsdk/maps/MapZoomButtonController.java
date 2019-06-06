package com.mapbox.mapboxsdk.maps;

import android.view.View;
import android.widget.ZoomButtonsController;
import android.widget.ZoomButtonsController.OnZoomListener;

final class MapZoomButtonController extends ZoomButtonsController {
    private UiSettings uiSettings;

    MapZoomButtonController(View view, UiSettings uiSettings, OnZoomListener onZoomListener) {
        super(view);
        this.uiSettings = uiSettings;
        setZoomSpeed(300);
        setOnZoomListener(onZoomListener);
    }

    public final void setVisible(boolean z) {
        if (this.uiSettings.isZoomControlsEnabled()) {
            super.setVisible(z);
        }
    }
}
