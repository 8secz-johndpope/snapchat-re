package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* renamed from: aimu */
public final class aimu implements SensorEventListener {
    public int a = 13;
    private final d b = new d();
    private final a c;
    private SensorManager d;
    private Sensor e;

    /* renamed from: aimu$a */
    public interface a {
        void a();
    }

    /* renamed from: aimu$b */
    static class b {
        long a;
        boolean b;
        b c;

        b() {
        }
    }

    /* renamed from: aimu$c */
    static class c {
        b a;

        c() {
        }

        /* Access modifiers changed, original: final */
        public final void a(b bVar) {
            bVar.c = this.a;
            this.a = bVar;
        }
    }

    /* renamed from: aimu$d */
    static class d {
        final c a = new c();
        b b;
        b c;
        int d;
        int e;

        d() {
        }
    }

    public aimu(a aVar) {
        this.c = aVar;
    }

    public final void a() {
        Sensor sensor = this.e;
        if (sensor != null) {
            this.d.unregisterListener(this, sensor);
            this.d = null;
            this.e = null;
        }
    }

    public final boolean a(SensorManager sensorManager) {
        if (this.e != null) {
            return true;
        }
        this.e = sensorManager.getDefaultSensor(1);
        Sensor sensor = this.e;
        if (sensor != null) {
            this.d = sensorManager;
            sensorManager.registerListener(this, sensor, 0);
        }
        return this.e != null;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        SensorEvent sensorEvent2 = sensorEvent;
        float f = sensorEvent2.values[0];
        int i = 1;
        float f2 = sensorEvent2.values[1];
        float f3 = sensorEvent2.values[2];
        double d = (double) (((f * f) + (f2 * f2)) + (f3 * f3));
        int i2 = this.a;
        boolean z = d > ((double) (i2 * i2));
        long j = sensorEvent2.timestamp;
        d dVar = this.b;
        long j2 = j - 500000000;
        while (dVar.d >= 4 && dVar.b != null && j2 - dVar.b.a > 0) {
            b bVar = dVar.b;
            if (bVar.b) {
                dVar.e--;
            }
            dVar.d--;
            dVar.b = bVar.c;
            if (dVar.b == null) {
                dVar.c = null;
            }
            dVar.a.a(bVar);
        }
        c cVar = dVar.a;
        b bVar2 = cVar.a;
        if (bVar2 == null) {
            bVar2 = new b();
        } else {
            cVar.a = bVar2.c;
        }
        bVar2.a = j;
        bVar2.b = z;
        bVar2.c = null;
        if (dVar.c != null) {
            dVar.c.c = bVar2;
        }
        dVar.c = bVar2;
        if (dVar.b == null) {
            dVar.b = bVar2;
        }
        dVar.d++;
        if (z) {
            dVar.e++;
        }
        dVar = this.b;
        if (dVar.c == null || dVar.b == null || dVar.c.a - dVar.b.a < 250000000 || dVar.e < (dVar.d >> 1) + (dVar.d >> 2)) {
            i = 0;
        }
        if (i != 0) {
            dVar = this.b;
            while (dVar.b != null) {
                b bVar3 = dVar.b;
                dVar.b = bVar3.c;
                dVar.a.a(bVar3);
            }
            dVar.c = null;
            dVar.d = 0;
            dVar.e = 0;
            this.c.a();
        }
    }
}
