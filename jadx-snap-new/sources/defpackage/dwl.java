package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.snapchat.android.framework.misc.AppContext;

/* renamed from: dwl */
public final class dwl {
    boolean a = false;
    final dvq b;
    final dvv c;
    private Sensor d;
    private final SensorManager e;
    private final SensorEventListener f = new 1();

    /* renamed from: dwl$1 */
    class 1 implements SensorEventListener {
        1() {
        }

        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public final void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor != null && sensorEvent.sensor.getType() == 5 && sensorEvent.values != null && sensorEvent.values.length > 0) {
                dvv dvv = dwl.this.c;
                boolean z = false;
                if (((double) sensorEvent.values[0]) < 5.0d) {
                    z = true;
                }
                dvv.a(z);
                boolean a = dwl.this.c.a();
                if (dwl.this.a != a) {
                    dwl dwl = dwl.this;
                    dwl.a = a;
                    dwl.b.a(dwl.this.a);
                }
            }
        }
    }

    protected dwl(dvq dvq, dpf dpf) {
        this.c = new dwa(dpf.y());
        this.b = dvq;
        this.e = (SensorManager) AppContext.get().getSystemService("sensor");
        SensorManager sensorManager = this.e;
        if (sensorManager != null) {
            this.d = sensorManager.getDefaultSensor(5);
            if (a()) {
                try {
                    this.e.registerListener(this.f, this.d, 3);
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return this.d != null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.e.unregisterListener(this.f);
    }
}
