package com.brightcove.player.video360;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.WindowManager;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Arrays;
import net.sqlcipher.database.SQLiteDatabase;

public class RotationMonitor {
    float[] a;
    float[] b;
    float[] c;
    private final SensorManager d;
    private final WindowManager e;
    private float f;
    private float g;
    private float h;
    private int i;
    private boolean j;
    private Listener k;
    private final SensorEventListener l = new SensorEventListener() {
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr;
            if (sensorEvent.sensor.getType() == 11) {
                fArr = new float[16];
                SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
                RotationMonitor.a(RotationMonitor.this, fArr);
                return;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 1) {
                RotationMonitor.this.a = Arrays.copyOf(sensorEvent.values, sensorEvent.values.length);
            } else if (type == 2) {
                RotationMonitor.this.c = Arrays.copyOf(sensorEvent.values, sensorEvent.values.length);
            } else if (type == 9) {
                RotationMonitor.this.b = Arrays.copyOf(sensorEvent.values, sensorEvent.values.length);
            } else {
                return;
            }
            float[] fArr2 = RotationMonitor.this.b != null ? RotationMonitor.this.b : RotationMonitor.this.a;
            if (!(fArr2 == null || RotationMonitor.this.c == null)) {
                fArr = new float[16];
                SensorManager.getRotationMatrix(fArr, null, fArr2, RotationMonitor.this.c);
                RotationMonitor.a(RotationMonitor.this, fArr);
            }
        }
    };

    public interface Listener {
        void onChanged(int i, float f, float f2, float f3, float f4, float f5, float f6);

        void onDetected(int i, float f, float f2, float f3);
    }

    static {
        RotationMonitor.class.getSimpleName();
    }

    public RotationMonitor(Context context) {
        this.d = (SensorManager) context.getSystemService("sensor");
        this.e = (WindowManager) context.getSystemService("window");
        this.i = getRotation();
    }

    private Sensor a(int i) {
        Sensor defaultSensor = this.d.getDefaultSensor(i);
        if (defaultSensor != null) {
            this.d.registerListener(this.l, defaultSensor, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH);
        }
        return defaultSensor;
    }

    static /* synthetic */ void a(RotationMonitor rotationMonitor, float[] fArr) {
        float f;
        float f2;
        float f3;
        int rotation = rotationMonitor.getRotation();
        int i = 130;
        int i2 = 129;
        if (rotation == 1) {
            i = 129;
            i2 = 130;
        } else if (rotation != 2) {
            if (rotation != 3) {
                i = 2;
                i2 = 1;
            } else {
                i = 1;
                i2 = 2;
            }
        }
        float[] fArr2 = new float[16];
        SensorManager.remapCoordinateSystem(fArr, i, i2, fArr2);
        fArr = SensorManager.getOrientation(fArr2, new float[3]);
        float toDegrees = (float) Math.toDegrees((double) fArr[0]);
        float toDegrees2 = (float) Math.toDegrees((double) fArr[1]);
        float toDegrees3 = (float) Math.toDegrees((double) fArr[2]);
        int rotation2 = rotationMonitor.getRotation();
        if (rotationMonitor.j && rotation2 == rotationMonitor.i) {
            f = toDegrees - rotationMonitor.f;
            f2 = toDegrees2 - rotationMonitor.g;
            f3 = Math.signum(toDegrees3) == Math.signum(rotationMonitor.h) ? toDegrees3 - rotationMonitor.h : rotationMonitor.h + toDegrees3;
        } else {
            rotationMonitor.f = toDegrees;
            rotationMonitor.g = toDegrees2;
            rotationMonitor.h = toDegrees3;
            rotationMonitor.j = true;
            rotationMonitor.i = rotation2;
            Listener listener = rotationMonitor.getListener();
            if (listener != null) {
                listener.onDetected(rotation2, toDegrees, toDegrees2, toDegrees3);
            }
            f = MapboxConstants.MINIMUM_ZOOM;
            f2 = MapboxConstants.MINIMUM_ZOOM;
            f3 = MapboxConstants.MINIMUM_ZOOM;
        }
        if (Math.sqrt((double) (((f2 * f2) + (f3 * f3)) + (f * f))) > 1.0d) {
            rotationMonitor.f = toDegrees;
            rotationMonitor.g = toDegrees2;
            rotationMonitor.h = toDegrees3;
            Listener listener2 = rotationMonitor.getListener();
            if (listener2 != null) {
                listener2.onChanged(rotation2, toDegrees, toDegrees2, toDegrees3, f, f2, f3);
            }
        }
    }

    public synchronized Listener getListener() {
        return this.k;
    }

    public int getRotation() {
        return this.e.getDefaultDisplay().getRotation();
    }

    public synchronized void setListener(Listener listener) {
        this.k = listener;
    }

    public void startTracking() {
        if (a(11) == null) {
            a(1);
            a(4);
            a(2);
        }
    }

    public void stopTracking() {
        this.d.unregisterListener(this.l);
        this.j = false;
    }
}
