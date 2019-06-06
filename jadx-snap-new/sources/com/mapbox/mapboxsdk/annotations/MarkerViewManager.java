package com.mapbox.mapboxsdk.annotations;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.maps.MapView.OnMapChangedListener;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.MapboxMap.MarkerViewAdapter;
import com.mapbox.mapboxsdk.maps.MapboxMap.OnMarkerViewClickListener;
import com.mapbox.mapboxsdk.utils.AnimatorUtils;
import defpackage.ja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MarkerViewManager implements OnMapChangedListener {
    private boolean enabled;
    private boolean isWaitingForRenderInvoke;
    private MapboxMap mapboxMap;
    private final List<MarkerViewAdapter> markerViewAdapters = new ArrayList();
    private final ja<OnMarkerViewAddedListener> markerViewAddedListenerMap = new ja();
    private final ViewGroup markerViewContainer;
    private final Map<MarkerView, View> markerViewMap = new HashMap();
    private final OnPreDrawListener markerViewPreDrawObserver = new OnPreDrawListener() {
        public boolean onPreDraw() {
            MarkerViewManager.this.invalidateViewMarkersInVisibleRegion();
            MarkerViewManager.this.markerViewContainer.getViewTreeObserver().removeOnPreDrawListener(MarkerViewManager.this.markerViewPreDrawObserver);
            return false;
        }
    };
    private OnMarkerViewClickListener onMarkerViewClickListener;
    private long updateTime;

    public interface OnMarkerViewAddedListener {
        void onViewAdded(MarkerView markerView);
    }

    static class ImageMarkerViewAdapter extends MarkerViewAdapter<MarkerView> {
        private LayoutInflater inflater;

        static class ViewHolder {
            ImageView imageView;

            private ViewHolder() {
            }

            /* synthetic */ ViewHolder(AnonymousClass1 anonymousClass1) {
                this();
            }
        }

        ImageMarkerViewAdapter(Context context) {
            super(context);
            this.inflater = LayoutInflater.from(context);
        }

        public View getView(MarkerView markerView, View view, ViewGroup viewGroup) {
            ViewHolder viewHolder;
            View inflate;
            if (view == null) {
                viewHolder = new ViewHolder();
                inflate = this.inflater.inflate(R.layout.mapbox_view_image_marker, viewGroup, false);
                viewHolder.imageView = (ImageView) inflate.findViewById(R.id.image);
                inflate.setTag(viewHolder);
            } else {
                inflate = view;
                viewHolder = (ViewHolder) view.getTag();
            }
            viewHolder.imageView.setImageBitmap(markerView.getIcon().getBitmap());
            viewHolder.imageView.setContentDescription(markerView.getTitle());
            return inflate;
        }
    }

    public MarkerViewManager(ViewGroup viewGroup) {
        this.markerViewContainer = viewGroup;
    }

    public void addMarkerViewAdapter(MarkerViewAdapter markerViewAdapter) {
        if (markerViewAdapter.getMarkerClass().equals(MarkerView.class)) {
            throw new RuntimeException("Providing a custom MarkerViewAdapter requires subclassing MarkerView");
        } else if (!this.markerViewAdapters.contains(markerViewAdapter)) {
            this.markerViewAdapters.add(markerViewAdapter);
            invalidateViewMarkersInVisibleRegion();
        }
    }

    public void addOnMarkerViewAddedListener(MarkerView markerView, OnMarkerViewAddedListener onMarkerViewAddedListener) {
        this.markerViewAddedListenerMap.a(markerView.getId(), (Object) onMarkerViewAddedListener);
    }

    public void animateAlpha(MarkerView markerView, float f) {
        View view = (View) this.markerViewMap.get(markerView);
        if (view != null) {
            AnimatorUtils.alpha(view, f);
        }
    }

    public void animateRotation(MarkerView markerView, float f) {
        View view = (View) this.markerViewMap.get(markerView);
        if (view != null) {
            AnimatorUtils.rotate(view, f);
        }
    }

    public void animateRotationBy(MarkerView markerView, float f) {
        View view = (View) this.markerViewMap.get(markerView);
        if (view != null) {
            view.animate().cancel();
            f -= view.getRotation();
            if (f > 180.0f) {
                f -= 360.0f;
            } else if (f < -180.0f) {
                f += 360.0f;
            }
            AnimatorUtils.rotateBy(view, f);
        }
    }

    public void animateVisible(MarkerView markerView, boolean z) {
        View view = (View) this.markerViewMap.get(markerView);
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void bind(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
    }

    public void deselect(MarkerView markerView) {
        deselect(markerView, true);
    }

    public void deselect(MarkerView markerView, boolean z) {
        View view = (View) this.markerViewMap.get(markerView);
        if (view != null) {
            for (MarkerViewAdapter markerViewAdapter : this.markerViewAdapters) {
                if (markerViewAdapter.getMarkerClass().equals(markerView.getClass())) {
                    markerViewAdapter.onDeselect(markerView, view);
                }
            }
        }
        if (z) {
            this.mapboxMap.deselectMarker(markerView);
        }
        markerView.setSelected(false);
    }

    public void ensureInfoWindowOffset(MarkerView markerView) {
        View view;
        if (this.markerViewMap.containsKey(markerView)) {
            view = (View) this.markerViewMap.get(markerView);
        } else {
            for (MarkerViewAdapter markerViewAdapter : this.markerViewAdapters) {
                if (markerViewAdapter.getMarkerClass().equals(markerView.getClass())) {
                    view = markerViewAdapter.getView(markerView, (View) markerViewAdapter.getViewReusePool().a(), this.markerViewContainer);
                    break;
                }
            }
            view = null;
        }
        if (view != null) {
            if (markerView.getWidth() == MapboxConstants.MINIMUM_ZOOM) {
                if (view.getMeasuredWidth() == 0) {
                    view.measure(0, 0);
                }
                markerView.setWidth((float) view.getMeasuredWidth());
                markerView.setHeight((float) view.getMeasuredHeight());
            }
            if (markerView.getOffsetX() == -1.0f) {
                markerView.setOffset((float) ((int) (markerView.getAnchorU() * markerView.getWidth())), (float) ((int) (markerView.getAnchorV() * markerView.getHeight())));
            }
            int measuredWidth = (int) ((((float) view.getMeasuredWidth()) * markerView.getInfoWindowAnchorU()) - markerView.getOffsetX());
            markerView.setTopOffsetPixels((int) ((((float) view.getMeasuredHeight()) * markerView.getInfoWindowAnchorV()) - markerView.getOffsetY()));
            markerView.setRightOffsetPixels(measuredWidth);
        }
    }

    public List<MarkerViewAdapter> getMarkerViewAdapters() {
        return this.markerViewAdapters;
    }

    public ViewGroup getMarkerViewContainer() {
        return this.markerViewContainer;
    }

    public View getView(MarkerView markerView) {
        return (View) this.markerViewMap.get(markerView);
    }

    public MarkerViewAdapter getViewAdapter(MarkerView markerView) {
        MarkerViewAdapter markerViewAdapter = null;
        for (MarkerViewAdapter markerViewAdapter2 : this.markerViewAdapters) {
            if (markerViewAdapter2.getMarkerClass().equals(markerView.getClass())) {
                markerViewAdapter = markerViewAdapter2;
            }
        }
        return markerViewAdapter;
    }

    public void invalidateViewMarkersInVisibleRegion() {
        if (!this.mapboxMap.isDestroyed()) {
            List<MarkerView> markerViewsInRect = this.mapboxMap.getMarkerViewsInRect(new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) this.markerViewContainer.getWidth(), (float) this.markerViewContainer.getHeight()));
            Iterator it = this.markerViewMap.keySet().iterator();
            while (it.hasNext()) {
                MarkerView markerView = (MarkerView) it.next();
                if (!markerViewsInRect.contains(markerView)) {
                    View view = (View) this.markerViewMap.get(markerView);
                    for (MarkerViewAdapter markerViewAdapter : this.markerViewAdapters) {
                        if (markerViewAdapter.getMarkerClass().equals(markerView.getClass())) {
                            markerViewAdapter.prepareViewForReuse(markerView, view);
                            markerViewAdapter.releaseView(view);
                            it.remove();
                        }
                    }
                }
            }
            for (MarkerView markerView2 : markerViewsInRect) {
                if (this.markerViewAdapters.isEmpty()) {
                    this.markerViewAdapters.add(new ImageMarkerViewAdapter(this.mapboxMap.getContext()));
                }
                if (!this.markerViewMap.containsKey(markerView2)) {
                    for (MarkerViewAdapter markerViewAdapter2 : this.markerViewAdapters) {
                        if (markerViewAdapter2.getMarkerClass().equals(markerView2.getClass())) {
                            View view2 = (View) markerViewAdapter2.getViewReusePool().a();
                            View view3 = markerViewAdapter2.getView(markerView2, view2, this.markerViewContainer);
                            if (view3 != null) {
                                view3.setRotationX(markerView2.getTilt());
                                view3.setRotation(markerView2.getRotation());
                                view3.setAlpha(markerView2.getAlpha());
                                view3.setVisibility(8);
                                if (this.mapboxMap.getSelectedMarkers().contains(markerView2) && markerViewAdapter2.onSelect(markerView2, view3, true)) {
                                    this.mapboxMap.selectMarker(markerView2);
                                }
                                markerView2.setMapboxMap(this.mapboxMap);
                                this.markerViewMap.put(markerView2, view3);
                                if (view2 == null) {
                                    view3.setVisibility(8);
                                    this.markerViewContainer.addView(view3);
                                }
                            }
                            OnMarkerViewAddedListener onMarkerViewAddedListener = (OnMarkerViewAddedListener) this.markerViewAddedListenerMap.a(markerView2.getId());
                            if (onMarkerViewAddedListener != null) {
                                onMarkerViewAddedListener.onViewAdded(markerView2);
                                this.markerViewAddedListenerMap.d(markerView2.getId());
                            }
                        }
                    }
                }
            }
            this.markerViewAddedListenerMap.b();
            updateMarkerViewsPosition();
        }
    }

    public boolean onClickMarkerView(MarkerView markerView) {
        MarkerViewAdapter viewAdapter = getViewAdapter(markerView);
        View view = getView(markerView);
        if (viewAdapter == null || view == null) {
            return true;
        }
        OnMarkerViewClickListener onMarkerViewClickListener = this.onMarkerViewClickListener;
        return onMarkerViewClickListener != null ? onMarkerViewClickListener.onMarkerClick(markerView, view, viewAdapter) : false;
    }

    public void onMapChanged(int i) {
        if (this.isWaitingForRenderInvoke && i == 10) {
            this.isWaitingForRenderInvoke = false;
            invalidateViewMarkersInVisibleRegion();
        }
    }

    public void removeMarkerView(MarkerView markerView) {
        View view = (View) this.markerViewMap.get(markerView);
        if (!(view == null || markerView == null)) {
            for (MarkerViewAdapter markerViewAdapter : this.markerViewAdapters) {
                if (markerViewAdapter.getMarkerClass().equals(markerView.getClass()) && markerViewAdapter.prepareViewForReuse(markerView, view)) {
                    markerView.setOffset(-1.0f, -1.0f);
                    markerViewAdapter.releaseView(view);
                }
            }
        }
        markerView.setMapboxMap(null);
        this.markerViewMap.remove(markerView);
    }

    public void select(MarkerView markerView) {
        select(markerView, true);
    }

    public void select(MarkerView markerView, View view, MarkerViewAdapter markerViewAdapter) {
        select(markerView, view, markerViewAdapter, true);
    }

    public void select(MarkerView markerView, View view, MarkerViewAdapter markerViewAdapter, boolean z) {
        if (view != null) {
            if (markerViewAdapter.onSelect(markerView, view, false) && z) {
                this.mapboxMap.selectMarker(markerView);
            }
            markerView.setSelected(true);
            view.bringToFront();
        }
    }

    public void select(MarkerView markerView, boolean z) {
        View view = (View) this.markerViewMap.get(markerView);
        for (MarkerViewAdapter markerViewAdapter : this.markerViewAdapters) {
            if (markerViewAdapter.getMarkerClass().equals(markerView.getClass())) {
                select(markerView, view, markerViewAdapter, z);
            }
        }
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setOnMarkerViewClickListener(OnMarkerViewClickListener onMarkerViewClickListener) {
        this.onMarkerViewClickListener = onMarkerViewClickListener;
    }

    public void setRotation(MarkerView markerView, float f) {
        View view = (View) this.markerViewMap.get(markerView);
        if (view != null) {
            view.animate().cancel();
            view.setRotation(f);
        }
    }

    public void setTilt(float f) {
        for (MarkerView markerView : this.markerViewMap.keySet()) {
            if (markerView.isFlat()) {
                View view = (View) this.markerViewMap.get(markerView);
                if (view != null) {
                    markerView.setTilt(f);
                    view.setRotationX(f);
                }
            }
        }
    }

    public void setWaitingForRenderInvoke(boolean z) {
        this.isWaitingForRenderInvoke = z;
    }

    public void update() {
        if (this.enabled) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime < this.updateTime) {
                updateMarkerViewsPosition();
            } else {
                invalidateViewMarkersInVisibleRegion();
                this.updateTime = elapsedRealtime + 250;
            }
        }
    }

    public void updateIcon(MarkerView markerView) {
        View view = (View) this.markerViewMap.get(markerView);
        if (view != null && (view instanceof ImageView)) {
            ((ImageView) view).setImageBitmap(markerView.getIcon().getBitmap());
            markerView.invalidate();
        }
    }

    public void updateMarkerViewsPosition() {
        for (MarkerView markerView : this.markerViewMap.keySet()) {
            View view = (View) this.markerViewMap.get(markerView);
            if (view != null) {
                PointF toScreenLocation = this.mapboxMap.getProjection().toScreenLocation(markerView.getPosition());
                if (markerView.getOffsetX() == -1.0f && markerView.getWidth() == MapboxConstants.MINIMUM_ZOOM && markerView.isVisible()) {
                    view.getViewTreeObserver().addOnPreDrawListener(this.markerViewPreDrawObserver);
                }
                markerView.setWidth((float) view.getWidth());
                markerView.setHeight((float) view.getHeight());
                if (markerView.getWidth() != MapboxConstants.MINIMUM_ZOOM) {
                    markerView.setOffset((float) ((int) (markerView.getAnchorU() * markerView.getWidth())), (float) ((int) (markerView.getAnchorV() * markerView.getHeight())));
                }
                view.setX(toScreenLocation.x - markerView.getOffsetX());
                view.setY(toScreenLocation.y - markerView.getOffsetY());
                if (markerView.isVisible() && view.getVisibility() == 8) {
                    animateVisible(markerView, true);
                }
            }
        }
    }
}
