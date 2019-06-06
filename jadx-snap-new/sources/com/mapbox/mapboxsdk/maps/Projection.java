package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.ProjectedMeters;
import com.mapbox.mapboxsdk.geometry.VisibleRegion;
import defpackage.cgi;

public class Projection {
    private int[] contentPadding = new int[]{0, 0, 0, 0};
    private final NativeMapView nativeMapView;

    Projection(NativeMapView nativeMapView) {
        this.nativeMapView = nativeMapView;
    }

    public static VisibleRegion newSharableVisibleRegion() {
        return new VisibleRegion(new LatLng(), new LatLng(), new LatLng(), new LatLng(), LatLngBounds.from(0.0d, 0.0d, 0.0d, 0.0d));
    }

    public double calculateZoom(float f) {
        return this.nativeMapView.getZoom() + (Math.log((double) f) / Math.log(2.0d));
    }

    public cgi fromScreenLocation(float f, float f2) {
        return this.nativeMapView.latLngForPixel(f, f2);
    }

    public void fromScreenLocation(float f, float f2, LatLng latLng) {
        this.nativeMapView.latLngForPixelWith(f, f2, latLng);
    }

    /* Access modifiers changed, original: 0000 */
    public int[] getContentPadding() {
        return this.contentPadding;
    }

    /* Access modifiers changed, original: 0000 */
    public float getHeight() {
        return (float) this.nativeMapView.getHeight();
    }

    public cgi getLatLngForProjectedMeters(ProjectedMeters projectedMeters) {
        return this.nativeMapView.latLngForProjectedMeters(projectedMeters);
    }

    public double getMetersPerPixelAtLatitude(double d) {
        return this.nativeMapView.getMetersPerPixelAtLatitude(d);
    }

    public ProjectedMeters getProjectedMetersForLatLng(cgi cgi) {
        return this.nativeMapView.projectedMetersForLatLng(cgi);
    }

    public VisibleRegion getVisibleRegion() {
        float width = (float) this.nativeMapView.getWidth();
        float height = (float) this.nativeMapView.getHeight();
        cgi fromScreenLocation = fromScreenLocation(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
        cgi fromScreenLocation2 = fromScreenLocation(width, MapboxConstants.MINIMUM_ZOOM);
        cgi fromScreenLocation3 = fromScreenLocation(width, height);
        cgi fromScreenLocation4 = fromScreenLocation(MapboxConstants.MINIMUM_ZOOM, height);
        return new VisibleRegion(fromScreenLocation, fromScreenLocation2, fromScreenLocation4, fromScreenLocation3, LatLngBounds.from(fromScreenLocation2.getLatitude(), fromScreenLocation2.getLongitude(), fromScreenLocation4.getLatitude(), fromScreenLocation4.getLongitude()));
    }

    public void getVisibleRegionShared(VisibleRegion visibleRegion) {
        float width = (float) this.nativeMapView.getWidth();
        float height = (float) this.nativeMapView.getHeight();
        fromScreenLocation(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (LatLng) visibleRegion.farLeft);
        fromScreenLocation(width, MapboxConstants.MINIMUM_ZOOM, (LatLng) visibleRegion.farRight);
        fromScreenLocation(MapboxConstants.MINIMUM_ZOOM, height, (LatLng) visibleRegion.nearLeft);
        fromScreenLocation(width, height, (LatLng) visibleRegion.nearRight);
        ((LatLngBounds) visibleRegion.latLngBounds).set(visibleRegion.farRight.getLatitude(), visibleRegion.farRight.getLongitude(), visibleRegion.nearLeft.getLatitude(), visibleRegion.nearLeft.getLongitude());
    }

    /* Access modifiers changed, original: 0000 */
    public float getWidth() {
        return (float) this.nativeMapView.getWidth();
    }

    public void invalidateContentPadding(int[] iArr) {
        setContentPadding(this.contentPadding, iArr);
    }

    /* Access modifiers changed, original: 0000 */
    public void setContentPadding(int[] iArr, int[] iArr2) {
        this.contentPadding = iArr;
        this.nativeMapView.setContentPadding(new int[]{iArr[0] + iArr2[0], iArr[1] + iArr2[1], iArr[2] + iArr2[2], iArr[3] + iArr2[3]});
    }

    public PointF toScreenLocation(cgi cgi) {
        return this.nativeMapView.pixelForLatLng(cgi);
    }
}
