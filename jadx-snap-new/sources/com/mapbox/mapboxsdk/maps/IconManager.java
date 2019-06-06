package com.mapbox.mapboxsdk.maps;

import android.graphics.Bitmap;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.annotations.Icon;
import com.mapbox.mapboxsdk.annotations.IconFactory;
import com.mapbox.mapboxsdk.annotations.Marker;
import com.mapbox.mapboxsdk.annotations.MarkerView;
import com.mapbox.mapboxsdk.exceptions.IconBitmapChangedException;
import java.util.ArrayList;
import java.util.List;

public class IconManager {
    private int highestIconHeight;
    private int highestIconWidth;
    private List<Icon> icons = new ArrayList();
    private NativeMapView nativeMapView;

    public IconManager(NativeMapView nativeMapView) {
        this.nativeMapView = nativeMapView;
        loadIcon(IconFactory.recreate(IconFactory.ICON_MARKERVIEW_ID, IconFactory.ICON_MARKERVIEW_BITMAP));
    }

    private void addIcon(Icon icon) {
        addIcon(icon, true);
    }

    private void addIcon(Icon icon, boolean z) {
        if (this.icons.contains(icon)) {
            validateIconChanged(icon);
        } else {
            this.icons.add(icon);
            if (z) {
                loadIcon(icon);
            }
        }
    }

    private Icon loadDefaultIconForMarker(Marker marker) {
        Icon defaultMarker = IconFactory.getInstance(Mapbox.getApplicationContext()).defaultMarker();
        Bitmap bitmap = defaultMarker.getBitmap();
        updateHighestIconSize(bitmap.getWidth(), bitmap.getHeight() / 2);
        marker.setIcon(defaultMarker);
        return defaultMarker;
    }

    private void loadIcon(Icon icon) {
        Bitmap bitmap = icon.getBitmap();
        this.nativeMapView.addAnnotationIcon(icon.getId(), bitmap.getWidth(), bitmap.getHeight(), icon.getScale(), icon.toBytes());
    }

    private void setTopOffsetPixels(Marker marker, MapboxMap mapboxMap, Icon icon) {
        Marker marker2 = marker.getId() != -1 ? (Marker) mapboxMap.getAnnotation(marker.getId()) : null;
        if (marker2 == null || marker2.getIcon() == null || marker2.getIcon() != marker.getIcon()) {
            marker.setTopOffsetPixels(getTopOffsetPixelsForIcon(icon));
        }
    }

    private void updateHighestIconSize(int i, int i2) {
        if (i > this.highestIconWidth) {
            this.highestIconWidth = i;
        }
        if (i2 > this.highestIconHeight) {
            this.highestIconHeight = i2;
        }
    }

    private void updateHighestIconSize(Bitmap bitmap) {
        updateHighestIconSize(bitmap.getWidth(), bitmap.getHeight());
    }

    private void updateHighestIconSize(Icon icon) {
        updateHighestIconSize(icon.getBitmap());
    }

    private void validateIconChanged(Icon icon) {
        List list = this.icons;
        if (!((Icon) list.get(list.indexOf(icon))).getBitmap().sameAs(icon.getBitmap())) {
            throw new IconBitmapChangedException();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void ensureIconLoaded(Marker marker, MapboxMap mapboxMap) {
        Icon icon = marker.getIcon();
        if (icon == null) {
            icon = loadDefaultIconForMarker(marker);
        }
        addIcon(icon);
        setTopOffsetPixels(marker, mapboxMap, icon);
    }

    /* Access modifiers changed, original: 0000 */
    public int getHighestIconHeight() {
        return this.highestIconHeight;
    }

    /* Access modifiers changed, original: 0000 */
    public int getHighestIconWidth() {
        return this.highestIconWidth;
    }

    /* Access modifiers changed, original: 0000 */
    public int getTopOffsetPixelsForIcon(Icon icon) {
        double topOffsetPixelsForAnnotationSymbol = this.nativeMapView.getTopOffsetPixelsForAnnotationSymbol(icon.getId());
        double pixelRatio = (double) this.nativeMapView.getPixelRatio();
        Double.isNaN(pixelRatio);
        return (int) (topOffsetPixelsForAnnotationSymbol * pixelRatio);
    }

    /* Access modifiers changed, original: 0000 */
    public Icon loadIconForMarker(Marker marker) {
        Icon icon = marker.getIcon();
        if (icon == null) {
            icon = loadDefaultIconForMarker(marker);
        } else {
            updateHighestIconSize(icon);
        }
        addIcon(icon);
        return icon;
    }

    /* Access modifiers changed, original: 0000 */
    public void loadIconForMarkerView(MarkerView markerView) {
        Icon icon = markerView.getIcon();
        updateHighestIconSize(icon.getBitmap());
        addIcon(icon, false);
    }

    /* Access modifiers changed, original: 0000 */
    public void reloadIcons() {
        for (Icon loadIcon : this.icons) {
            loadIcon(loadIcon);
        }
    }
}
