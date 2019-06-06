package com.google.android.gms.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

@zzabh
final class zzani implements SensorEventListener {
    private final SensorManager zzdmf;
    private final Object zzdmg = new Object();
    private final Display zzdmh;
    private final float[] zzdmi = new float[9];
    private final float[] zzdmj = new float[9];
    private float[] zzdmk;
    private Handler zzdml;
    private zzank zzdmm;

    zzani(Context context) {
        this.zzdmf = (SensorManager) context.getSystemService("sensor");
        this.zzdmh = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void zzg(int i, int i2) {
        float[] fArr = this.zzdmj;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != MapboxConstants.MINIMUM_ZOOM || fArr[1] != MapboxConstants.MINIMUM_ZOOM || fArr[2] != MapboxConstants.MINIMUM_ZOOM) {
            synchronized (this.zzdmg) {
                if (this.zzdmk == null) {
                    this.zzdmk = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.zzdmi, fArr);
            int rotation = this.zzdmh.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.zzdmi, 2, 129, this.zzdmj);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.zzdmi, 129, 130, this.zzdmj);
            } else if (rotation != 3) {
                System.arraycopy(this.zzdmi, 0, this.zzdmj, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.zzdmi, 130, 1, this.zzdmj);
            }
            zzg(1, 3);
            zzg(2, 6);
            zzg(5, 7);
            synchronized (this.zzdmg) {
                System.arraycopy(this.zzdmj, 0, this.zzdmk, 0, 9);
            }
            zzank zzank = this.zzdmm;
            if (zzank != null) {
                zzank.zznm();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void start() {
        if (this.zzdml == null) {
            Sensor defaultSensor = this.zzdmf.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzaky.e("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            this.zzdml = new Handler(handlerThread.getLooper());
            if (!this.zzdmf.registerListener(this, defaultSensor, 0, this.zzdml)) {
                zzaky.e("SensorManager.registerListener failed.");
                stop();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void stop() {
        if (this.zzdml != null) {
            this.zzdmf.unregisterListener(this);
            this.zzdml.post(new zzanj(this));
            this.zzdml = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void zza(zzank zzank) {
        this.zzdmm = zzank;
    }

    /* Access modifiers changed, original: final */
    public final boolean zza(float[] fArr) {
        synchronized (this.zzdmg) {
            if (this.zzdmk == null) {
                return false;
            }
            System.arraycopy(this.zzdmk, 0, fArr, 0, this.zzdmk.length);
            return true;
        }
    }
}
