package com.looksery.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import com.looksery.sdk.DeviceMotionTracker.DeviceMotionListener;
import com.looksery.sdk.domain.DeviceMotionTrackingParameters;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Collection;
import java.util.HashSet;

final class DefaultDeviceMotionTracker implements SensorEventListener, DeviceMotionTracker {
    private static final float[] IDENTITY_MATRIX = new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 1.0f};
    private static final int SAMPLES_TO_SKIP_ON_INIT = 10;
    private final float[] mAccelerationVector = new float[3];
    private DeviceMotionListener mDeviceMotionListener;
    private final Object mListenerMutex = new Object();
    private int mNumberOfSamplesToSkip = 10;
    private final float[] mRotationMatrix = new float[9];
    private final SensorManager mSensorManager;
    private volatile SensorPresence mSensorPresence = SensorPresence.UNAVAILABLE;
    private final SensorThreadManager mSensorThreadManager;
    private volatile boolean mTracking;

    private DefaultDeviceMotionTracker(Context context) {
        this.mSensorManager = (SensorManager) context.getSystemService("sensor");
        this.mSensorThreadManager = new SensorThreadManager(this.mSensorManager);
    }

    static DeviceMotionTracker create(Context context) {
        return new DefaultDeviceMotionTracker(context);
    }

    private static SensorPresence findRequiredSensors(SensorManager sensorManager, Collection<Sensor> collection, boolean z) {
        Object defaultSensor = (z || VERSION.SDK_INT < 18) ? null : sensorManager.getDefaultSensor(15);
        if (defaultSensor == null) {
            defaultSensor = sensorManager.getDefaultSensor(11);
        }
        if (defaultSensor != null && Sensors.isEmulated(defaultSensor)) {
            defaultSensor = null;
        }
        Object defaultSensor2 = sensorManager.getDefaultSensor(1);
        if (defaultSensor2 != null && Sensors.isEmulated(defaultSensor2)) {
            defaultSensor2 = null;
        }
        if (defaultSensor == null || defaultSensor2 == null) {
            return SensorPresence.UNAVAILABLE;
        }
        if (collection != null) {
            collection.add(defaultSensor);
            collection.add(defaultSensor2);
        }
        return z ? SensorPresence.BEST_CONFIG : defaultSensor.getType() == 15 ? SensorPresence.BEST_CONFIG : SensorPresence.ACCEPTABLE_CONFIG;
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
        int i = this.mNumberOfSamplesToSkip;
        this.mNumberOfSamplesToSkip = i - 1;
        if (i <= 0) {
            if (sensorEvent.sensor.getType() == 1) {
                this.mAccelerationVector[0] = sensorEvent.values[0];
                this.mAccelerationVector[1] = sensorEvent.values[1];
                this.mAccelerationVector[2] = sensorEvent.values[2];
            } else {
                SensorManager.getRotationMatrixFromVector(this.mRotationMatrix, sensorEvent.values);
            }
            synchronized (this.mListenerMutex) {
                if (this.mDeviceMotionListener != null) {
                    this.mDeviceMotionListener.onDeviceMotion(new long[]{sensorEvent.timestamp}, this.mRotationMatrix, this.mAccelerationVector);
                }
            }
        }
    }

    public final void reset() {
        this.mNumberOfSamplesToSkip = 10;
        float[] fArr = IDENTITY_MATRIX;
        float[] fArr2 = this.mRotationMatrix;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
    }

    @SuppressLint({"InlinedApi"})
    public final void start(DeviceMotionListener deviceMotionListener, DeviceMotionTrackingParameters deviceMotionTrackingParameters) {
        synchronized (this.mListenerMutex) {
            this.mDeviceMotionListener = deviceMotionListener;
        }
        if (!this.mTracking) {
            HashSet hashSet = new HashSet();
            SensorPresence findRequiredSensors = findRequiredSensors(this.mSensorManager, hashSet, deviceMotionTrackingParameters.doesRequireCompassAlignment());
            if (findRequiredSensors != SensorPresence.UNAVAILABLE) {
                this.mTracking = true;
                this.mSensorPresence = findRequiredSensors;
                this.mSensorThreadManager.registerListener(this);
                this.mSensorThreadManager.start(hashSet);
            }
        }
    }

    public final void stop() {
        synchronized (this.mListenerMutex) {
            this.mDeviceMotionListener = null;
        }
        if (this.mTracking) {
            this.mTracking = false;
            this.mSensorPresence = SensorPresence.UNAVAILABLE;
            this.mSensorThreadManager.unregisterListener(this);
            this.mSensorThreadManager.stop();
        }
    }
}
