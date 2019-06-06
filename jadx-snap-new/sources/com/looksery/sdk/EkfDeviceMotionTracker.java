package com.looksery.sdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import com.looksery.sdk.DeviceMotionTracker.DeviceMotionListener;
import com.looksery.sdk.domain.DeviceMotionTrackingParameters;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.ccr;
import defpackage.ccr.a;
import defpackage.ccu;
import defpackage.ccw;
import java.util.Collection;
import java.util.HashSet;

final class EkfDeviceMotionTracker implements SensorEventListener, DeviceMotionTracker {
    private final float[] mAccelerationVector = new float[3];
    private DeviceMotionListener mDeviceMotionListener;
    private final Display mDisplay;
    private float mDisplayRotation = Float.NaN;
    private final float[] mEkfToHeadTracker = new float[16];
    private volatile boolean mFirstGyroValue = true;
    private final ccw mGyroBias = new ccw();
    private final ccr mGyroBiasEstimator;
    private final float[] mInitialSystemGyroBias = new float[3];
    private final ccw mLatestAcc = new ccw();
    private final ccw mLatestGyro = new ccw();
    private final Object mListenerMutex = new Object();
    private volatile boolean mRequiresCompassAlignment = false;
    private final float[] mRotationMatrix = new float[9];
    private final SensorManager mSensorManager;
    private volatile SensorPresence mSensorPresence = SensorPresence.UNAVAILABLE;
    private final SensorThreadManager mSensorThreadManager;
    private final float[] mSensorToDisplay = new float[16];
    private final float[] mTmpHeadView = new float[16];
    private final float[] mTmpHeadView2 = new float[16];
    private final float[] mTmpHeadView3 = new float[16];
    private final ccu mTracker;
    private volatile boolean mTracking;

    private EkfDeviceMotionTracker(SensorManager sensorManager, SensorThreadManager sensorThreadManager, ccu ccu, ccr ccr, Display display) {
        this.mSensorManager = sensorManager;
        this.mSensorThreadManager = sensorThreadManager;
        this.mTracker = ccu;
        this.mDisplay = display;
        this.mGyroBiasEstimator = ccr;
    }

    private void checkDisplayRotation() {
        float displayRotation = getDisplayRotation(this.mDisplay);
        if (displayRotation != this.mDisplayRotation) {
            this.mDisplayRotation = displayRotation;
            Matrix.setRotateEulerM(this.mSensorToDisplay, 0, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, -displayRotation);
            Matrix.setRotateEulerM(this.mEkfToHeadTracker, 0, -90.0f, MapboxConstants.MINIMUM_ZOOM, displayRotation);
        }
    }

    static EkfDeviceMotionTracker create(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        return new EkfDeviceMotionTracker(sensorManager, new SensorThreadManager(sensorManager), new ccu(), new ccr(), ((WindowManager) context.getSystemService("window")).getDefaultDisplay());
    }

    private static SensorPresence findRequiredSensors(SensorManager sensorManager, Collection<Sensor> collection, boolean z) {
        Object defaultSensor = z ? sensorManager.getDefaultSensor(2) : null;
        if (z && defaultSensor == null) {
            return SensorPresence.UNAVAILABLE;
        }
        Object defaultSensor2 = (VERSION.SDK_INT < 18 || Build.MANUFACTURER.equals("HTC")) ? null : sensorManager.getDefaultSensor(16);
        if (defaultSensor2 == null) {
            defaultSensor2 = sensorManager.getDefaultSensor(4);
        }
        if (defaultSensor2 != null && Sensors.isEmulated(defaultSensor2)) {
            defaultSensor2 = null;
        }
        Sensor defaultSensor3 = sensorManager.getDefaultSensor(1);
        if (defaultSensor2 == null || defaultSensor3 == null) {
            return SensorPresence.UNAVAILABLE;
        }
        if (collection != null) {
            collection.add(defaultSensor2);
            collection.add(defaultSensor3);
            if (defaultSensor != null) {
                collection.add(defaultSensor);
            }
        }
        return defaultSensor2.getType() == 16 ? SensorPresence.BEST_CONFIG : SensorPresence.ACCEPTABLE_CONFIG;
    }

    private boolean getAccelerationVector(float[] fArr) {
        fArr[0] = (float) this.mLatestAcc.a;
        fArr[1] = (float) this.mLatestAcc.b;
        fArr[2] = (float) this.mLatestAcc.c;
        return true;
    }

    private boolean getCompassAlignedRotationMatrix(float[] fArr) {
        synchronized (this.mTracker) {
            if (this.mTracker.b()) {
                double[] dArr = this.mTracker.d().a;
                fArr[0] = (float) dArr[0];
                fArr[1] = (float) dArr[3];
                fArr[2] = (float) dArr[6];
                fArr[3] = (float) dArr[1];
                fArr[4] = (float) dArr[4];
                fArr[5] = (float) dArr[7];
                fArr[6] = (float) dArr[2];
                fArr[7] = (float) dArr[5];
                fArr[8] = (float) dArr[8];
                return true;
            }
            return false;
        }
    }

    private static float getDisplayRotation(Display display) {
        int rotation = display.getRotation();
        if (rotation == 0) {
            return MapboxConstants.MINIMUM_ZOOM;
        }
        if (rotation == 1) {
            return 90.0f;
        }
        if (rotation == 2) {
            return 180.0f;
        }
        if (rotation == 3) {
            return 270.0f;
        }
        throw new IllegalArgumentException("Unrecognized display rotation");
    }

    private boolean getHeadRotationMatrix(float[] fArr) {
        int i = 0;
        if (!getLastHeadView(this.mTmpHeadView3, 0)) {
            return false;
        }
        Matrix.rotateM(this.mTmpHeadView3, 0, -90.0f, 1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM);
        while (i < 3) {
            System.arraycopy(this.mTmpHeadView3, i << 2, fArr, i * 3, 3);
            i++;
        }
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:22:0x004b in {8, 12, 15, 19, 21} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private boolean getLastHeadView(float[] r14, int r15) {
        /*
        r13 = this;
        r0 = r15 + 16;
        r1 = r14.length;
        if (r0 > r1) goto L_0x0043;
        r0 = r13.mTracker;
        monitor-enter(r0);
        r1 = r13.mTracker;	 Catch:{ all -> 0x0040 }
        r1 = r1.b();	 Catch:{ all -> 0x0040 }
        r2 = 0;	 Catch:{ all -> 0x0040 }
        if (r1 != 0) goto L_0x0013;	 Catch:{ all -> 0x0040 }
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        return r2;	 Catch:{ all -> 0x0040 }
        r1 = r13.mTracker;	 Catch:{ all -> 0x0040 }
        r1 = r1.c();	 Catch:{ all -> 0x0040 }
        r3 = r14.length;	 Catch:{ all -> 0x0040 }
        if (r2 >= r3) goto L_0x0026;	 Catch:{ all -> 0x0040 }
        r3 = r13.mTmpHeadView;	 Catch:{ all -> 0x0040 }
        r4 = r1[r2];	 Catch:{ all -> 0x0040 }
        r4 = (float) r4;	 Catch:{ all -> 0x0040 }
        r3[r2] = r4;	 Catch:{ all -> 0x0040 }
        r2 = r2 + 1;	 Catch:{ all -> 0x0040 }
        goto L_0x0019;	 Catch:{ all -> 0x0040 }
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        r1 = r13.mTmpHeadView2;
        r2 = 0;
        r3 = r13.mSensorToDisplay;
        r4 = 0;
        r5 = r13.mTmpHeadView;
        r6 = 0;
        android.opengl.Matrix.multiplyMM(r1, r2, r3, r4, r5, r6);
        r9 = r13.mTmpHeadView2;
        r10 = 0;
        r11 = r13.mEkfToHeadTracker;
        r12 = 0;
        r7 = r14;
        r8 = r15;
        android.opengl.Matrix.multiplyMM(r7, r8, r9, r10, r11, r12);
        r14 = 1;
        return r14;
        r14 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0040 }
        throw r14;
        r14 = new java.lang.IllegalArgumentException;
        r15 = "Not enough space to write the result";
        r14.<init>(r15);
        throw r14;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.EkfDeviceMotionTracker.getLastHeadView(float[], int):boolean");
    }

    private boolean getRotationMatrix(float[] fArr) {
        return this.mRequiresCompassAlignment ? getCompassAlignedRotationMatrix(fArr) : getHeadRotationMatrix(fArr);
    }

    static boolean isSupported(Context context) {
        return (context == null || findRequiredSensors((SensorManager) context.getSystemService("sensor"), null, false) == SensorPresence.UNAVAILABLE) ? false : true;
    }

    public final SensorPresence describeSensors() {
        return this.mSensorPresence;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorEvent sensorEvent2 = sensorEvent;
        boolean z = false;
        ccu ccu;
        ccw ccw;
        ccr ccr;
        if (sensorEvent2.sensor.getType() == 1) {
            this.mLatestAcc.a((double) sensorEvent2.values[0], (double) sensorEvent2.values[1], (double) sensorEvent2.values[2]);
            ccu = this.mTracker;
            ccw = this.mLatestAcc;
            long j = sensorEvent2.timestamp;
            ccu.a(ccw);
            ccr = this.mGyroBiasEstimator;
            ccw = this.mLatestAcc;
            ccr.a.a(ccw, sensorEvent2.timestamp, 1.0d);
            ccw.a(ccw, ccr.a.a, ccr.e);
            a aVar = ccr.f;
            if (ccr.e.c() < 0.5d) {
                z = true;
            }
            aVar.a(z);
        } else if (sensorEvent2.sensor.getType() == 2) {
            ccu = this.mTracker;
            float[] fArr = sensorEvent2.values;
            long j2 = sensorEvent2.timestamp;
            ccu.a(fArr);
        } else if (sensorEvent2.sensor.getType() == 4 || sensorEvent2.sensor.getType() == 16) {
            double max;
            if (sensorEvent2.sensor.getType() == 16) {
                if (this.mFirstGyroValue && sensorEvent2.values.length == 6) {
                    this.mInitialSystemGyroBias[0] = sensorEvent2.values[3];
                    this.mInitialSystemGyroBias[1] = sensorEvent2.values[4];
                    this.mInitialSystemGyroBias[2] = sensorEvent2.values[5];
                }
                this.mLatestGyro.a((double) (sensorEvent2.values[0] - this.mInitialSystemGyroBias[0]), (double) (sensorEvent2.values[1] - this.mInitialSystemGyroBias[1]), (double) (sensorEvent2.values[2] - this.mInitialSystemGyroBias[2]));
            } else {
                this.mLatestGyro.a((double) sensorEvent2.values[0], (double) sensorEvent2.values[1], (double) sensorEvent2.values[2]);
            }
            this.mFirstGyroValue = false;
            ccr = this.mGyroBiasEstimator;
            ccw = this.mLatestGyro;
            long j3 = sensorEvent2.timestamp;
            ccr.b.a(ccw, j3, 1.0d);
            ccw.a(ccw, ccr.b.a, ccr.d);
            ccr.g.a(ccr.d.c() < 0.00800000037997961d);
            if (ccr.g.a() && ccr.f.a() && ccw.c() < 0.3499999940395355d) {
                max = Math.max(0.0d, 1.0d - (ccw.c() / 0.3499999940395355d));
                ccr.c.a(ccr.b.a, j3, max * max);
            }
            ccr = this.mGyroBiasEstimator;
            ccw = this.mGyroBias;
            if (ccr.c.b < 30) {
                ccw.a();
            } else {
                ccw.a(ccr.c.a);
                max = (double) (ccr.c.b - 30);
                Double.isNaN(max);
                ccw.a(Math.min(1.0d, max / 100.0d));
            }
            ccw ccw2 = this.mLatestGyro;
            ccw.a(ccw2, this.mGyroBias, ccw2);
            this.mTracker.a(this.mLatestGyro, sensorEvent2.timestamp);
            synchronized (this.mListenerMutex) {
                if (this.mDeviceMotionListener != null && getRotationMatrix(this.mRotationMatrix) && getAccelerationVector(this.mAccelerationVector)) {
                    this.mDeviceMotionListener.onDeviceMotion(new long[]{sensorEvent2.timestamp}, this.mRotationMatrix, this.mAccelerationVector);
                }
            }
        }
    }

    public final void reset() {
        this.mTracker.a();
        checkDisplayRotation();
    }

    public final void start(DeviceMotionListener deviceMotionListener, DeviceMotionTrackingParameters deviceMotionTrackingParameters) {
        synchronized (this.mListenerMutex) {
            this.mDeviceMotionListener = deviceMotionListener;
        }
        if (!this.mTracking) {
            boolean doesRequireCompassAlignment = deviceMotionTrackingParameters.doesRequireCompassAlignment();
            HashSet hashSet = new HashSet();
            SensorPresence findRequiredSensors = findRequiredSensors(this.mSensorManager, hashSet, doesRequireCompassAlignment);
            if (findRequiredSensors != SensorPresence.UNAVAILABLE) {
                this.mTracker.a();
                this.mGyroBiasEstimator.a();
                this.mSensorPresence = findRequiredSensors;
                this.mRequiresCompassAlignment = doesRequireCompassAlignment;
                this.mFirstGyroValue = true;
                this.mSensorThreadManager.registerListener(this);
                this.mSensorThreadManager.start(hashSet);
                this.mTracking = true;
                checkDisplayRotation();
            }
        }
    }

    public final void stop() {
        synchronized (this.mListenerMutex) {
            this.mDeviceMotionListener = null;
        }
        if (this.mTracking) {
            this.mSensorThreadManager.unregisterListener(this);
            this.mSensorThreadManager.stop();
            this.mTracking = false;
            this.mRequiresCompassAlignment = false;
            this.mSensorPresence = SensorPresence.UNAVAILABLE;
        }
    }
}
