package com.looksery.sdk;

import android.content.Context;
import android.hardware.GeomagneticField;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import defpackage.ccs;

final class DefaultDeviceCompassTracker implements SensorEventListener, DeviceCompassTracker {
    private static final double ACCELERATION_G_THRESHOLD_MPS2 = 6.0d;
    private static final double ORIENTATION_CUTOFF_FREQUENCY = 0.25d;
    private final float[] mAccelerometer = new float[3];
    private volatile double mAzimuth = Double.NaN;
    private volatile double mBearing = Double.NaN;
    private final DeviceLocationProvider mDeviceLocationProvider;
    private volatile int mLastReportedAccuracy = -1;
    private final float[] mMagneticField = new float[3];
    private final float[] mMatrixR = new float[9];
    private final float[] mMatrixRout = new float[9];
    private final float[] mOrientation = new float[3];
    private final ccs mOrientationFilter = new ccs(ORIENTATION_CUTOFF_FREQUENCY);
    private final SensorManager mSensorManager;

    private DefaultDeviceCompassTracker(SensorManager sensorManager, DeviceLocationProvider deviceLocationProvider) {
        this.mSensorManager = sensorManager;
        this.mDeviceLocationProvider = deviceLocationProvider;
    }

    static DeviceCompassTracker create(Context context, DeviceLocationProvider deviceLocationProvider) {
        return create((SensorManager) context.getSystemService("sensor"), deviceLocationProvider);
    }

    static DeviceCompassTracker create(SensorManager sensorManager, DeviceLocationProvider deviceLocationProvider) {
        return new DefaultDeviceCompassTracker(sensorManager, deviceLocationProvider);
    }

    private double getBearingForLocation(Location location, double d) {
        double declination = (double) getGeomagneticField(location).getDeclination();
        Double.isNaN(declination);
        return d + declination;
    }

    private GeomagneticField getGeomagneticField(Location location) {
        return new GeomagneticField((float) location.getLatitude(), (float) location.getLongitude(), (float) location.getAltitude(), System.currentTimeMillis());
    }

    static boolean isSupported(Context context) {
        if (context == null) {
            return false;
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        return (sensorManager.getDefaultSensor(1) == null || sensorManager.getDefaultSensor(2) == null) ? false : true;
    }

    public final double getBearing() {
        return (this.mBearing + 360.0d) % 360.0d;
    }

    public final int getLastReportedAccuracy() {
        return this.mLastReportedAccuracy;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
        if (sensor.getType() == 2) {
            this.mLastReportedAccuracy = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c8  */
    public final void onSensorChanged(android.hardware.SensorEvent r14) {
        /*
        r13 = this;
        r0 = r14.sensor;
        r0 = r0.getType();
        r1 = 2;
        r2 = 1;
        r3 = 0;
        if (r0 == r2) goto L_0x0014;
    L_0x000b:
        if (r0 == r1) goto L_0x000e;
    L_0x000d:
        goto L_0x001c;
    L_0x000e:
        r0 = r14.values;
        r4 = r13.mMagneticField;
        r5 = r4.length;
        goto L_0x0019;
    L_0x0014:
        r0 = r14.values;
        r4 = r13.mAccelerometer;
        r5 = r4.length;
    L_0x0019:
        java.lang.System.arraycopy(r0, r3, r4, r3, r5);
    L_0x001c:
        r0 = r13.mMatrixR;
        r4 = 0;
        r5 = r13.mAccelerometer;
        r6 = r13.mMagneticField;
        r0 = android.hardware.SensorManager.getRotationMatrix(r0, r4, r5, r6);
        if (r0 == 0) goto L_0x00c0;
    L_0x0029:
        r0 = r13.mAccelerometer;
        r4 = r0[r2];
        r4 = (double) r4;
        r6 = 3;
        r7 = 4618441417868443648; // 0x4018000000000000 float:0.0 double:6.0;
        r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r9 <= 0) goto L_0x003d;
    L_0x0035:
        r0 = r13.mMatrixR;
        r1 = r13.mMatrixRout;
        android.hardware.SensorManager.remapCoordinateSystem(r0, r2, r6, r1);
        goto L_0x0076;
    L_0x003d:
        r4 = r0[r2];
        r4 = (double) r4;
        r9 = 131; // 0x83 float:1.84E-43 double:6.47E-322;
        r10 = -4604930618986332160; // 0xc018000000000000 float:0.0 double:-6.0;
        r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r12 >= 0) goto L_0x0050;
    L_0x0048:
        r0 = r13.mMatrixR;
        r1 = r13.mMatrixRout;
        android.hardware.SensorManager.remapCoordinateSystem(r0, r2, r9, r1);
        goto L_0x0076;
    L_0x0050:
        r2 = r0[r3];
        r4 = (double) r2;
        r2 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r2 <= 0) goto L_0x005f;
    L_0x0057:
        r0 = r13.mMatrixR;
        r2 = r13.mMatrixRout;
        android.hardware.SensorManager.remapCoordinateSystem(r0, r6, r1, r2);
        goto L_0x0076;
    L_0x005f:
        r0 = r0[r3];
        r4 = (double) r0;
        r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1));
        if (r0 >= 0) goto L_0x006e;
    L_0x0066:
        r0 = r13.mMatrixR;
        r2 = r13.mMatrixRout;
        android.hardware.SensorManager.remapCoordinateSystem(r0, r9, r1, r2);
        goto L_0x0076;
    L_0x006e:
        r0 = r13.mMatrixR;
        r1 = r13.mMatrixRout;
        r2 = r1.length;
        java.lang.System.arraycopy(r0, r3, r1, r3, r2);
    L_0x0076:
        r0 = r13.mMatrixRout;
        r1 = r13.mOrientation;
        android.hardware.SensorManager.getOrientation(r0, r1);
        r0 = r13.mOrientation;
        r0 = r0[r3];
        r0 = (double) r0;
        r2 = r13.mOrientationFilter;
        r2 = r2.b;
        if (r2 <= 0) goto L_0x008f;
    L_0x0088:
        r2 = r13.mOrientationFilter;
        r2 = r2.a;
        r2 = r2.a;
        goto L_0x0090;
    L_0x008f:
        r2 = r0;
    L_0x0090:
        java.lang.Double.isNaN(r0);
        r2 = r2 - r0;
        r4 = 4618760256179416344; // 0x401921fb54442d18 float:3.37028055E12 double:6.283185307179586;
        r2 = r2 / r4;
        r2 = java.lang.Math.round(r2);
        r2 = (double) r2;
        java.lang.Double.isNaN(r2);
        r2 = r2 * r4;
        java.lang.Double.isNaN(r0);
        r0 = r0 + r2;
        r6 = r13.mOrientationFilter;
        r7 = new ccw;
        r7.<init>(r0);
        r8 = r14.timestamp;
        r10 = 4607182418800017408; // 0x3ff0000000000000 float:0.0 double:1.0;
        r6.a(r7, r8, r10);
        r14 = r13.mOrientationFilter;
        r14 = r14.a;
        r0 = r14.a;
        r0 = r0 % r4;
        r0 = r0 + r4;
        r0 = r0 % r4;
        r13.mAzimuth = r0;
    L_0x00c0:
        r0 = r13.mAzimuth;
        r14 = java.lang.Double.isNaN(r0);
        if (r14 != 0) goto L_0x00df;
    L_0x00c8:
        r14 = r13.mDeviceLocationProvider;
        r14 = r14.getLocation();
        r0 = r13.mAzimuth;
        r0 = java.lang.Math.toDegrees(r0);
        if (r14 != 0) goto L_0x00d9;
    L_0x00d6:
        r13.mBearing = r0;
        return;
    L_0x00d9:
        r0 = r13.getBearingForLocation(r14, r0);
        r13.mBearing = r0;
    L_0x00df:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.DefaultDeviceCompassTracker.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public final void start() {
        Sensor defaultSensor = this.mSensorManager.getDefaultSensor(1);
        if (defaultSensor != null) {
            Sensor defaultSensor2 = this.mSensorManager.getDefaultSensor(2);
            if (defaultSensor2 != null) {
                this.mSensorManager.registerListener(this, defaultSensor, 3);
                this.mSensorManager.registerListener(this, defaultSensor2, 3);
            }
        }
    }

    public final void stop() {
        this.mSensorManager.unregisterListener(this);
    }
}
