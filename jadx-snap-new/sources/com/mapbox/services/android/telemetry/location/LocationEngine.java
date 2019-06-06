package com.mapbox.services.android.telemetry.location;

import android.location.Location;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class LocationEngine {
    private static final int TWO_MINUTES = 120000;
    protected Integer fastestInterval;
    protected Integer interval;
    public CopyOnWriteArrayList<LocationEngineListener> locationListeners = new CopyOnWriteArrayList();
    protected int priority;
    protected Float smallestDisplacement = Float.valueOf(3.0f);

    public enum Type {
        GOOGLE_PLAY_SERVICES,
        LOST,
        ANDROID,
        MOCK
    }

    public LocationEngine() {
        Integer valueOf = Integer.valueOf(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
        this.interval = valueOf;
        this.fastestInterval = valueOf;
    }

    protected static boolean isBetterLocation(Location location, Location location2) {
        if (location2 == null) {
            return true;
        }
        long time = location.getTime() - location2.getTime();
        Object obj = time > 120000 ? 1 : null;
        Object obj2 = time < -120000 ? 1 : null;
        Object obj3 = time > 0 ? 1 : null;
        if (obj != null) {
            return true;
        }
        if (obj2 != null) {
            return false;
        }
        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
        return (accuracy < 0 ? 1 : null) != null ? true : (obj3 == null || (accuracy > 0 ? 1 : null) != null) ? obj3 != null && (accuracy > Callback.DEFAULT_DRAG_ANIMATION_DURATION ? 1 : null) == null && isSameProvider(location.getProvider(), location2.getProvider()) : true;
    }

    private static boolean isSameProvider(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public abstract void activate();

    public void addLocationEngineListener(LocationEngineListener locationEngineListener) {
        if (!this.locationListeners.contains(locationEngineListener)) {
            this.locationListeners.add(locationEngineListener);
        }
    }

    public abstract void deactivate();

    public int getFastestInterval() {
        return this.fastestInterval.intValue();
    }

    public int getInterval() {
        return this.interval.intValue();
    }

    public abstract Location getLastLocation();

    public int getPriority() {
        return this.priority;
    }

    public float getSmallestDisplacement() {
        return this.smallestDisplacement.floatValue();
    }

    public abstract boolean isConnected();

    public abstract Type obtainType();

    public boolean removeLocationEngineListener(LocationEngineListener locationEngineListener) {
        return this.locationListeners.remove(locationEngineListener);
    }

    public abstract void removeLocationUpdates();

    public abstract void requestLocationUpdates();

    public void setFastestInterval(int i) {
        this.fastestInterval = Integer.valueOf(i);
    }

    public void setInterval(int i) {
        this.interval = Integer.valueOf(i);
    }

    public void setPriority(int i) {
        this.priority = i;
    }

    public void setSmallestDisplacement(float f) {
        this.smallestDisplacement = Float.valueOf(f);
    }
}
