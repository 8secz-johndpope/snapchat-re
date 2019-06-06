package defpackage;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: dba */
public class dba extends das<dba> {
    public float a;
    public long b;
    public long c;

    private dba a(dba dba) {
        this.a = dba.a;
        this.b = dba.b;
        this.c = dba.c;
        return this;
    }

    public final /* synthetic */ das a(das das, das das2) {
        dba dba = (dba) das;
        dba dba2 = (dba) das2;
        if (dba2 == null) {
            dba2 = new dba();
        }
        if (dba == null) {
            dba2.a(this);
        } else {
            dba2.a = this.a - dba.a;
            dba2.b = this.b - dba.b;
            dba2.c = this.c - dba.c;
        }
        return dba2;
    }

    public final /* synthetic */ das b(das das, das das2) {
        dba dba = (dba) das;
        dba dba2 = (dba) das2;
        if (dba2 == null) {
            dba2 = new dba();
        }
        if (dba == null) {
            dba2.a(this);
        } else {
            dba2.a = this.a + dba.a;
            dba2.b = this.b + dba.b;
            dba2.c = this.c + dba.c;
        }
        return dba2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dba dba = (dba) obj;
            if (this.a == dba.a && this.b == dba.b && this.c == dba.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        float f = this.a;
        int floatToIntBits = (f != MapboxConstants.MINIMUM_ZOOM ? Float.floatToIntBits(f) : 0) * 31;
        long j = this.b;
        floatToIntBits = (floatToIntBits + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.c;
        return floatToIntBits + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeviceBatteryMetrics{batteryLevelPct=");
        stringBuilder.append(this.a);
        stringBuilder.append(", batteryRealtimeMs=");
        stringBuilder.append(this.b);
        stringBuilder.append(", chargingRealtimeMs=");
        stringBuilder.append(this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
