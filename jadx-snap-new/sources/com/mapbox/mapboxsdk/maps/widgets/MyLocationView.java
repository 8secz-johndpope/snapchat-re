package com.mapbox.mapboxsdk.maps.widgets;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.camera.CameraPosition.Builder;
import com.mapbox.mapboxsdk.camera.CameraUpdate;
import com.mapbox.mapboxsdk.camera.CameraUpdateFactory;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.location.LocationSource;
import com.mapbox.mapboxsdk.maps.MapboxMap;
import com.mapbox.mapboxsdk.maps.Projection;
import com.mapbox.services.android.telemetry.location.LocationEngine;
import com.mapbox.services.android.telemetry.location.LocationEngineListener;
import defpackage.alsj;
import java.lang.ref.WeakReference;

public class MyLocationView extends View {
    private static final int COMPASS_UPDATE_RATE_MS = 500;
    private static final int UNDEFINED_TINT_COLOR = -1;
    private float accuracy;
    private ValueAnimator accuracyAnimator;
    private Paint accuracyPaint;
    private Rect backgroundBounds;
    private Drawable backgroundDrawable;
    private int backgroundOffsetBottom;
    private int backgroundOffsetLeft;
    private int backgroundOffsetRight;
    private int backgroundOffsetTop;
    private double bearing;
    private Camera camera;
    private CompassListener compassListener;
    private float contentPaddingX;
    private float contentPaddingY;
    private ValueAnimator directionAnimator;
    private Drawable foregroundBearingDrawable;
    private Rect foregroundBounds;
    private Drawable foregroundDrawable;
    private AnimatorUpdateListener invalidateSelfOnUpdateListener;
    private LatLng latLng;
    private Location location;
    private boolean locationChangeAnimationEnabled;
    private ValueAnimator locationChangeAnimator;
    private LocationEngine locationSource;
    private long locationUpdateTimestamp;
    private float magneticHeading;
    private MapboxMap mapboxMap;
    private Matrix matrix;
    private int myBearingTrackingMode;
    private MyLocationBehavior myLocationBehavior;
    private int myLocationTrackingMode;
    private float previousDirection;
    private float[] projectedCoordinate;
    private float projectedX;
    private float projectedY;
    private Projection projection;
    private PointF screenLocation;
    private double tilt;
    private GpsLocationListener userLocationListener;

    class CompassListener implements SensorEventListener {
        private long compassUpdateNextTimestamp = 0;
        private float[] matrix = new float[9];
        private float[] orientation = new float[3];
        private boolean reportMissingSensor = true;
        private Sensor rotationVectorSensor;
        private float[] rotationVectorValue;
        private final SensorManager sensorManager;
        private float[] truncatedRotationVectorValue = new float[4];

        CompassListener(Context context) {
            this.sensorManager = (SensorManager) context.getSystemService("sensor");
            this.rotationVectorSensor = this.sensorManager.getDefaultSensor(11);
        }

        private void rotateCamera(float f) {
            Builder builder = new Builder();
            builder.bearing((double) f);
            MyLocationView.this.mapboxMap.easeCamera(CameraUpdateFactory.newCameraPosition(builder.build()), 500, false, null);
        }

        /* Access modifiers changed, original: 0000 */
        public float[] getRotationVectorFromSensorEvent(SensorEvent sensorEvent) {
            if (sensorEvent.values.length <= 4) {
                return sensorEvent.values;
            }
            System.arraycopy(sensorEvent.values, 0, this.truncatedRotationVectorValue, 0, 4);
            return this.truncatedRotationVectorValue;
        }

        public boolean isSensorAvailable() {
            if (this.rotationVectorSensor == null && this.reportMissingSensor) {
                this.reportMissingSensor = false;
                alsj.d("Sensor.TYPE_ROTATION_VECTOR is missing from this device. Unable to use MyBearingTracking.COMPASS.", new Object[0]);
            }
            return this.rotationVectorSensor != null;
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onPause() {
            this.sensorManager.unregisterListener(this, this.rotationVectorSensor);
        }

        public void onResume() {
            this.sensorManager.registerListener(this, this.rotationVectorSensor, 1);
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.compassUpdateNextTimestamp && sensorEvent.sensor.getType() == 11) {
                MyLocationView myLocationView;
                double d;
                this.rotationVectorValue = getRotationVectorFromSensorEvent(sensorEvent);
                SensorManager.getRotationMatrixFromVector(this.matrix, this.rotationVectorValue);
                SensorManager.getOrientation(this.matrix, this.orientation);
                MyLocationView.this.magneticHeading = (float) Math.toDegrees((double) SensorManager.getOrientation(this.matrix, this.orientation)[0]);
                if (MyLocationView.this.myLocationTrackingMode == 4) {
                    rotateCamera(MyLocationView.this.magneticHeading);
                    myLocationView = MyLocationView.this;
                    d = 0.0d;
                } else {
                    myLocationView = MyLocationView.this;
                    d = (double) myLocationView.magneticHeading;
                    double access$400 = MyLocationView.this.bearing;
                    Double.isNaN(d);
                    d -= access$400;
                }
                myLocationView.setCompass(d, 500);
                this.compassUpdateNextTimestamp = elapsedRealtime + 500;
            }
        }
    }

    class MarkerCoordinateAnimatorListener implements AnimatorUpdateListener {
        private MyLocationBehavior behavior;
        private double fromLat;
        private double fromLng;
        private double toLat;
        private double toLng;

        private MarkerCoordinateAnimatorListener(MyLocationBehavior myLocationBehavior, LatLng latLng, LatLng latLng2) {
            this.behavior = myLocationBehavior;
            this.fromLat = latLng.getLatitude();
            this.fromLng = latLng.getLongitude();
            this.toLat = latLng2.getLatitude();
            this.toLng = latLng2.getLongitude();
        }

        /* synthetic */ MarkerCoordinateAnimatorListener(MyLocationView myLocationView, MyLocationBehavior myLocationBehavior, LatLng latLng, LatLng latLng2, AnonymousClass1 anonymousClass1) {
            this(myLocationBehavior, latLng, latLng2);
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            double d = this.fromLat;
            double d2 = this.toLat - d;
            double d3 = (double) animatedFraction;
            Double.isNaN(d3);
            d += d2 * d3;
            d2 = this.fromLng;
            double d4 = this.toLng - d2;
            Double.isNaN(d3);
            this.behavior.updateLatLng(d, d2 + (d4 * d3));
            MyLocationView.this.update();
        }
    }

    abstract class MyLocationBehavior {
        MyLocationBehavior() {
            if (MyLocationView.this.latLng != null) {
                MyLocationView.this.locationUpdateTimestamp = SystemClock.elapsedRealtime();
            }
        }

        public abstract void invalidate();

        /* Access modifiers changed, original: 0000 */
        public void updateAccuracy(Location location) {
            if (MyLocationView.this.accuracyAnimator != null && MyLocationView.this.accuracyAnimator.isRunning()) {
                MyLocationView myLocationView = MyLocationView.this;
                myLocationView.accuracy = ((Float) myLocationView.accuracyAnimator.getAnimatedValue()).floatValue();
                MyLocationView.this.accuracyAnimator.end();
            }
            MyLocationView.this.accuracyAnimator = ValueAnimator.ofFloat(new float[]{MyLocationView.this.accuracy, location.getAccuracy()});
            MyLocationView.this.accuracyAnimator.setDuration(750);
            MyLocationView.this.accuracyAnimator.start();
            MyLocationView.this.accuracy = location.getAccuracy();
        }

        /* Access modifiers changed, original: 0000 */
        public void updateLatLng(double d, double d2) {
            if (MyLocationView.this.latLng != null) {
                MyLocationView.this.latLng.setLatitude(d);
                MyLocationView.this.latLng.setLongitude(d2);
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void updateLatLng(Location location) {
            MyLocationView.this.location = location;
        }
    }

    class MyLocationBehaviorFactory {
        private MyLocationBehaviorFactory() {
        }

        /* synthetic */ MyLocationBehaviorFactory(MyLocationView myLocationView, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        public MyLocationBehavior getBehavioralModel(int i) {
            return i == 0 ? new MyLocationShowBehavior(MyLocationView.this, null) : new MyLocationTrackingBehavior(MyLocationView.this, null);
        }
    }

    static class GpsLocationListener implements LocationEngineListener {
        private WeakReference<LocationEngine> locationSource;
        private WeakReference<MyLocationView> userLocationView;

        GpsLocationListener(MyLocationView myLocationView, LocationEngine locationEngine) {
            this.userLocationView = new WeakReference(myLocationView);
            this.locationSource = new WeakReference(locationEngine);
        }

        public void onConnected() {
            MyLocationView myLocationView = (MyLocationView) this.userLocationView.get();
            LocationEngine locationEngine = (LocationEngine) this.locationSource.get();
            if (myLocationView != null && locationEngine != null) {
                Location lastLocation = locationEngine.getLastLocation();
                if (lastLocation != null) {
                    myLocationView.setLocation(lastLocation);
                }
                locationEngine.requestLocationUpdates();
            }
        }

        public void onLocationChanged(Location location) {
            MyLocationView myLocationView = (MyLocationView) this.userLocationView.get();
            if (myLocationView != null) {
                myLocationView.setLocation(location);
            }
        }
    }

    class MyLocationShowBehavior extends MyLocationBehavior {
        private MyLocationShowBehavior() {
            super();
        }

        /* synthetic */ MyLocationShowBehavior(MyLocationView myLocationView, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidate() {
            if (MyLocationView.this.latLng != null) {
                MyLocationView myLocationView = MyLocationView.this;
                myLocationView.screenLocation = myLocationView.projection.toScreenLocation(MyLocationView.this.latLng);
            }
            MyLocationView.this.invalidate();
        }

        /* Access modifiers changed, original: 0000 */
        public void updateLatLng(Location location) {
            ValueAnimator access$1800;
            super.updateLatLng(location);
            if (MyLocationView.this.latLng == null) {
                MyLocationView.this.latLng = new LatLng(location);
                MyLocationView.this.locationUpdateTimestamp = SystemClock.elapsedRealtime();
            }
            LatLng latLng = new LatLng(location);
            updateAccuracy(location);
            long access$900 = MyLocationView.this.locationUpdateTimestamp;
            MyLocationView.this.locationUpdateTimestamp = SystemClock.elapsedRealtime();
            access$900 = (long) (((float) (MyLocationView.this.locationUpdateTimestamp - access$900)) * 1.2f);
            if (MyLocationView.this.locationChangeAnimator != null) {
                MyLocationView.this.locationChangeAnimator.end();
                MyLocationView.this.locationChangeAnimator = null;
            }
            MyLocationView.this.locationChangeAnimator = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
            if (MyLocationView.this.locationChangeAnimationEnabled) {
                access$1800 = MyLocationView.this.locationChangeAnimator;
            } else {
                access$1800 = MyLocationView.this.locationChangeAnimator;
                access$900 = 0;
            }
            access$1800.setDuration(access$900);
            access$1800 = MyLocationView.this.locationChangeAnimator;
            MyLocationView myLocationView = MyLocationView.this;
            access$1800.addUpdateListener(new MarkerCoordinateAnimatorListener(myLocationView, this, myLocationView.latLng, latLng, null));
            MyLocationView.this.locationChangeAnimator.start();
            MyLocationView.this.latLng = latLng;
        }
    }

    class MyLocationTrackingBehavior extends MyLocationBehavior {
        private MyLocationTrackingBehavior() {
            super();
        }

        /* synthetic */ MyLocationTrackingBehavior(MyLocationView myLocationView, AnonymousClass1 anonymousClass1) {
            this();
        }

        /* Access modifiers changed, original: 0000 */
        public void invalidate() {
            int[] padding = MyLocationView.this.mapboxMap.getPadding();
            MyLocationView.this.screenLocation = new PointF(((float) (((MyLocationView.this.getWidth() + padding[0]) - padding[2]) / 2)) + MyLocationView.this.contentPaddingX, ((float) (((MyLocationView.this.getHeight() - padding[3]) + padding[1]) / 2)) + MyLocationView.this.contentPaddingY);
            MyLocationView.this.invalidate();
        }

        /* Access modifiers changed, original: 0000 */
        public void updateLatLng(Location location) {
            MapboxMap access$500;
            CameraUpdate newCameraPosition;
            super.updateLatLng(location);
            if (MyLocationView.this.latLng == null) {
                MyLocationView.this.latLng = new LatLng(location);
                MyLocationView.this.locationUpdateTimestamp = SystemClock.elapsedRealtime();
            }
            float access$900 = (float) MyLocationView.this.locationUpdateTimestamp;
            MyLocationView.this.locationUpdateTimestamp = SystemClock.elapsedRealtime();
            int access$9002 = access$900 == MapboxConstants.MINIMUM_ZOOM ? 0 : (int) ((((float) MyLocationView.this.locationUpdateTimestamp) - access$900) * 1.1f);
            MyLocationView.this.latLng = new LatLng(location);
            Builder target = new Builder().target(MyLocationView.this.latLng);
            if (MyLocationView.this.myBearingTrackingMode == 8) {
                if (location.hasBearing()) {
                    target.bearing((double) location.getBearing());
                }
                MyLocationView.this.setCompass(0.0d, 500);
            }
            updateAccuracy(location);
            if (MyLocationView.this.locationChangeAnimationEnabled) {
                access$500 = MyLocationView.this.mapboxMap;
                newCameraPosition = CameraUpdateFactory.newCameraPosition(target.build());
            } else {
                access$500 = MyLocationView.this.mapboxMap;
                newCameraPosition = CameraUpdateFactory.newCameraPosition(target.build());
                access$9002 = 0;
            }
            access$500.easeCamera(newCameraPosition, access$9002, false, null, true);
        }
    }

    public MyLocationView(Context context) {
        super(context);
        this.projectedCoordinate = new float[2];
        this.locationChangeAnimationEnabled = true;
        this.invalidateSelfOnUpdateListener = new AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                MyLocationView.this.invalidate();
            }
        };
        init(context);
    }

    public MyLocationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.projectedCoordinate = new float[2];
        this.locationChangeAnimationEnabled = true;
        this.invalidateSelfOnUpdateListener = /* anonymous class already generated */;
        init(context);
    }

    public MyLocationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.projectedCoordinate = new float[2];
        this.locationChangeAnimationEnabled = true;
        this.invalidateSelfOnUpdateListener = /* anonymous class already generated */;
        init(context);
    }

    private void applyDrawableTint(Drawable drawable, int i) {
        if (i == -1) {
            removeTintColorFilter(drawable);
        } else {
            applyTintColorFilter(drawable, i);
        }
    }

    private void applyTintColorFilter(Drawable drawable, int i) {
        if (drawable != null) {
            drawable.mutate().setColorFilter(i, Mode.SRC_IN);
        }
    }

    private float getCenterX() {
        return (((getX() + ((float) getMeasuredWidth())) / 2.0f) + this.contentPaddingX) - this.projectedX;
    }

    private float getCenterY() {
        return (((getY() + ((float) getMeasuredHeight())) / 2.0f) + this.contentPaddingY) - this.projectedY;
    }

    private void init(Context context) {
        if (!isInEditMode()) {
            setEnabled(false);
            setLayoutParams(new LayoutParams(-1, -1));
            this.matrix = new Matrix();
            this.camera = new Camera();
            this.camera.setLocation(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, -1000.0f);
            this.accuracyPaint = new Paint();
            this.myLocationBehavior = new MyLocationBehaviorFactory(this, null).getBehavioralModel(0);
            this.compassListener = new CompassListener(context);
        }
    }

    private void invalidateBounds() {
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null && this.foregroundDrawable != null && this.foregroundBearingDrawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = this.backgroundDrawable.getIntrinsicHeight();
            int i = this.backgroundOffsetLeft - this.backgroundOffsetRight;
            int i2 = this.backgroundOffsetTop - this.backgroundOffsetBottom;
            this.backgroundBounds = new Rect(((-intrinsicWidth) / 2) + i, ((-intrinsicHeight) / 2) + i2, (intrinsicWidth / 2) + i, (intrinsicHeight / 2) + i2);
            this.backgroundDrawable.setBounds(this.backgroundBounds);
            intrinsicWidth = this.foregroundDrawable.getIntrinsicWidth();
            intrinsicHeight = this.foregroundDrawable.getIntrinsicHeight();
            this.foregroundBounds = new Rect((-intrinsicWidth) / 2, (-intrinsicHeight) / 2, intrinsicWidth / 2, intrinsicHeight / 2);
            this.foregroundDrawable.setBounds(this.foregroundBounds);
            this.foregroundBearingDrawable.setBounds(this.foregroundBounds);
            invalidate();
        }
    }

    private void removeTintColorFilter(Drawable drawable) {
        if (drawable != null) {
            drawable.mutate().setColorFilter(null);
        }
    }

    private void setCompass(double d) {
        setCompass(d, 0);
    }

    private void setCompass(double d, long j) {
        float f = this.previousDirection;
        ValueAnimator valueAnimator = this.directionAnimator;
        if (valueAnimator != null) {
            f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.directionAnimator.end();
            this.directionAnimator = null;
        }
        float f2 = (float) d;
        float f3 = f - f2;
        if (f3 > 180.0f) {
            f2 += 360.0f;
        } else if (f3 < -180.0f) {
            f2 -= 360.0f;
        }
        this.previousDirection = f2;
        this.directionAnimator = ValueAnimator.ofFloat(new float[]{f, f2});
        this.directionAnimator.setDuration(j);
        this.directionAnimator.addUpdateListener(this.invalidateSelfOnUpdateListener);
        this.directionAnimator.start();
    }

    private void toggleGps(boolean z) {
        MapboxMap mapboxMap = this.mapboxMap;
        boolean z2 = mapboxMap != null && mapboxMap.getTrackingSettings().isCustomLocationSource();
        toggleGps(z, z2);
    }

    private void toggleGps(boolean z, boolean z2) {
        if (z) {
            if (this.locationSource == null) {
                if (!z2) {
                    this.locationSource = Mapbox.getLocationSource();
                } else {
                    return;
                }
            }
            if (this.userLocationListener == null) {
                this.userLocationListener = new GpsLocationListener(this, this.locationSource);
            }
            this.locationSource.addLocationEngineListener(this.userLocationListener);
            this.locationSource.setPriority(3);
            this.locationSource.activate();
            return;
        }
        LocationEngine locationEngine = this.locationSource;
        if (locationEngine != null) {
            this.location = null;
            locationEngine.removeLocationEngineListener(this.userLocationListener);
            this.locationSource.removeLocationUpdates();
            this.locationSource.deactivate();
        }
    }

    public PointF getCenter() {
        return new PointF(getCenterX(), getCenterY());
    }

    public Location getLocation() {
        return this.location;
    }

    public int getMyBearingTrackingMode() {
        return this.myBearingTrackingMode;
    }

    public int getMyLocationTrackingMode() {
        return this.myLocationTrackingMode;
    }

    public void init(LocationSource locationSource) {
        this.locationSource = locationSource;
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.locationChangeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.locationChangeAnimator = null;
        }
        valueAnimator = this.accuracyAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.accuracyAnimator = null;
        }
        valueAnimator = this.directionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.directionAnimator = null;
        }
        GpsLocationListener gpsLocationListener = this.userLocationListener;
        if (gpsLocationListener != null) {
            this.locationSource.removeLocationEngineListener(gpsLocationListener);
            this.locationSource = null;
            this.userLocationListener = null;
        }
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Location location = this.location;
        if (location != null && this.foregroundBounds != null && this.backgroundBounds != null && this.accuracyAnimator != null) {
            PointF pointF = this.screenLocation;
            if (pointF != null) {
                float floatValue = ((Float) this.accuracyAnimator.getAnimatedValue()).floatValue() / ((float) this.projection.getMetersPerPixelAtLatitude(location.getLatitude()));
                this.matrix.reset();
                float[] fArr = this.projectedCoordinate;
                fArr[0] = MapboxConstants.MINIMUM_ZOOM;
                fArr[1] = MapboxConstants.MINIMUM_ZOOM;
                this.camera.save();
                this.camera.rotate((float) this.tilt, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
                this.camera.getMatrix(this.matrix);
                if (this.myBearingTrackingMode != 0) {
                    ValueAnimator valueAnimator = this.directionAnimator;
                    if (valueAnimator != null) {
                        this.matrix.preRotate(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    }
                }
                this.matrix.preTranslate(MapboxConstants.MINIMUM_ZOOM, this.contentPaddingY);
                this.matrix.postTranslate(pointF.x, pointF.y - this.contentPaddingY);
                canvas.concat(this.matrix);
                this.matrix.mapPoints(this.projectedCoordinate);
                this.projectedX = pointF.x - this.projectedCoordinate[0];
                this.projectedY = pointF.y - this.projectedCoordinate[1];
                this.camera.restore();
                canvas.drawCircle(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, floatValue, this.accuracyPaint);
                Drawable drawable = this.backgroundDrawable;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                int i = this.myBearingTrackingMode;
                if (i == 0) {
                    if (this.foregroundDrawable == null) {
                        return;
                    }
                } else if (this.foregroundBearingDrawable != null && this.foregroundBounds != null) {
                    if (i == 8 || this.compassListener.isSensorAvailable()) {
                        this.foregroundBearingDrawable.draw(canvas);
                        return;
                    }
                } else {
                    return;
                }
                this.foregroundDrawable.draw(canvas);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.tilt = bundle.getDouble("tilt");
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* Access modifiers changed, original: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putDouble("tilt", this.tilt);
        return bundle;
    }

    public void onStart() {
        if (this.myBearingTrackingMode == 4 && this.compassListener.isSensorAvailable()) {
            this.compassListener.onResume();
        }
        if (isEnabled()) {
            toggleGps(true);
        }
    }

    public void onStop() {
        this.compassListener.onPause();
        toggleGps(false);
    }

    public final void setAccuracyAlpha(int i) {
        this.accuracyPaint.setAlpha(i);
        invalidate();
    }

    public final void setAccuracyTint(int i) {
        int alpha = this.accuracyPaint.getAlpha();
        this.accuracyPaint.setColor(i);
        this.accuracyPaint.setAlpha(alpha);
        invalidate();
    }

    public void setBearing(double d) {
        this.bearing = d;
        if (this.myLocationTrackingMode == 0) {
            int i = this.myBearingTrackingMode;
            double bearing;
            if (i == 8) {
                Location location = this.location;
                if (location != null) {
                    bearing = (double) location.getBearing();
                    Double.isNaN(bearing);
                    setCompass(bearing - d);
                }
            } else if (i == 4 && this.compassListener.isSensorAvailable()) {
                bearing = (double) this.magneticHeading;
                Double.isNaN(bearing);
                setCompass(bearing - d);
            }
        }
    }

    public void setCameraPosition(CameraPosition cameraPosition) {
        if (cameraPosition != null) {
            setBearing(cameraPosition.bearing);
            setTilt(cameraPosition.tilt);
        }
    }

    public void setContentPadding(int[] iArr) {
        this.contentPaddingX = (float) ((iArr[0] - iArr[2]) / 2);
        this.contentPaddingY = (float) ((iArr[1] - iArr[3]) / 2);
    }

    public void setEnabled(boolean z) {
        setEnabled(z, false);
    }

    public void setEnabled(boolean z, boolean z2) {
        super.setEnabled(z);
        setVisibility(z ? 0 : 4);
        toggleGps(z, z2);
    }

    public final void setForegroundDrawableTint(int i) {
        applyDrawableTint(this.foregroundDrawable, i);
        applyDrawableTint(this.foregroundBearingDrawable, i);
        invalidate();
    }

    public final void setForegroundDrawables(Drawable drawable, Drawable drawable2) {
        if (drawable != null) {
            if (drawable2 == null) {
                drawable2 = drawable.getConstantState().newDrawable();
            }
            if (this.backgroundDrawable == null) {
                this.backgroundDrawable = drawable.getConstantState().newDrawable();
            }
            if (drawable.getIntrinsicWidth() == drawable2.getIntrinsicWidth() && drawable.getIntrinsicHeight() == drawable2.getIntrinsicHeight()) {
                this.foregroundDrawable = drawable;
                this.foregroundBearingDrawable = drawable2;
                invalidateBounds();
                return;
            }
            throw new RuntimeException("The dimensions from location and bearing drawables should be match");
        }
    }

    public void setLocation(Location location) {
        if (location == null) {
            this.location = null;
            return;
        }
        this.location = location;
        this.myLocationBehavior.updateLatLng(location);
        MapboxMap mapboxMap = this.mapboxMap;
        if (mapboxMap != null && this.myBearingTrackingMode == 8 && this.myLocationTrackingMode == 0) {
            setBearing(mapboxMap.getCameraPosition().bearing);
        }
    }

    public void setLocationChangeAnimationEnabled(boolean z) {
        this.locationChangeAnimationEnabled = z;
    }

    public void setLocationSource(LocationEngine locationEngine) {
        boolean z = false;
        toggleGps(false);
        this.locationSource = locationEngine;
        this.userLocationListener = null;
        boolean isEnabled = isEnabled();
        if (locationEngine != null) {
            z = true;
        }
        setEnabled(isEnabled, z);
    }

    public void setMapboxMap(MapboxMap mapboxMap) {
        this.mapboxMap = mapboxMap;
        this.projection = mapboxMap.getProjection();
    }

    public void setMyBearingTrackingMode(int i) {
        this.myBearingTrackingMode = i;
        if (i == 4 && this.compassListener.isSensorAvailable()) {
            this.compassListener.onResume();
        } else {
            this.compassListener.onPause();
            if (this.myLocationTrackingMode == 4) {
                setCompass(0.0d);
            } else {
                this.myLocationBehavior.invalidate();
            }
        }
        invalidate();
    }

    public void setMyLocationTrackingMode(int i) {
        this.myLocationBehavior = new MyLocationBehaviorFactory(this, null).getBehavioralModel(i);
        Location location = this.location;
        if (location != null) {
            if (i == 4) {
                this.mapboxMap.easeCamera(CameraUpdateFactory.newLatLng(new LatLng(location)), 0, false, null, true);
            } else {
                this.latLng = null;
            }
            this.myLocationBehavior.updateLatLng(this.location);
        }
        this.myLocationTrackingMode = i;
        invalidate();
    }

    public final void setShadowDrawable(Drawable drawable) {
        setShadowDrawable(drawable, 0, 0, 0, 0);
    }

    public final void setShadowDrawable(Drawable drawable, int i, int i2, int i3, int i4) {
        if (drawable != null) {
            this.backgroundDrawable = drawable;
        }
        this.backgroundOffsetLeft = i;
        this.backgroundOffsetTop = i2;
        this.backgroundOffsetRight = i3;
        this.backgroundOffsetBottom = i4;
        invalidateBounds();
    }

    public final void setShadowDrawableTint(int i) {
        Drawable drawable = this.backgroundDrawable;
        if (drawable != null) {
            applyDrawableTint(drawable, i);
            invalidate();
        }
    }

    public void setTilt(double d) {
        this.tilt = d;
        if (this.myLocationTrackingMode == 4) {
            this.mapboxMap.getUiSettings().setFocalPoint(getCenter());
        }
        invalidate();
    }

    public void update() {
        if (isEnabled()) {
            this.myLocationBehavior.invalidate();
        } else {
            setVisibility(4);
        }
    }
}
