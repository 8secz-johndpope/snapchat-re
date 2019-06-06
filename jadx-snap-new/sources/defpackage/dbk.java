package defpackage;

/* renamed from: dbk */
public class dbk extends das<dbk> {
    public long a;
    public long b;
    public int c;
    public long d;
    public int e;
    public String f;

    private dbk a(dbk dbk) {
        this.a = dbk.a;
        this.b = dbk.b;
        this.c = dbk.c;
        this.d = dbk.d;
        this.e = dbk.e;
        this.f = dbk.f;
        return this;
    }

    public final /* synthetic */ das a(das das, das das2) {
        dbk dbk = (dbk) das;
        dbk dbk2 = (dbk) das2;
        if (dbk2 == null) {
            dbk2 = new dbk();
        }
        if (dbk == null) {
            dbk2.a(this);
        } else {
            dbk2.a = this.a - dbk.a;
            dbk2.b = this.b - dbk.b;
            dbk2.c = this.c - dbk.c;
            dbk2.d = this.d - dbk.d;
            dbk2.e = this.e - dbk.e;
            dbk2.f = this.f;
        }
        return dbk2;
    }

    public final /* synthetic */ das b(das das, das das2) {
        dbk dbk = (dbk) das;
        dbk dbk2 = (dbk) das2;
        if (dbk2 == null) {
            dbk2 = new dbk();
        }
        if (dbk == null) {
            dbk2.a(this);
        } else {
            dbk2.a = this.a + dbk.a;
            dbk2.b = this.b + dbk.b;
            dbk2.c = this.c + dbk.c;
            dbk2.d = this.d + dbk.d;
            dbk2.e = this.e + dbk.e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f);
            stringBuilder.append(dbk.f);
            dbk2.f = stringBuilder.toString();
        }
        return dbk2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dbk dbk = (dbk) obj;
            return this.a == dbk.a && this.b == dbk.b && this.c == dbk.c && this.d == dbk.d && this.e == dbk.e;
        }
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        i = (((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.c) * 31;
        j2 = this.d;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.e;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("RadioStateMetrics{mobileLowPowerActiveS=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mobileHighPowerActiveS=");
        stringBuilder.append(this.b);
        stringBuilder.append(", mobileRadioWakeupCount=");
        stringBuilder.append(this.c);
        stringBuilder.append(", wifiActiveS=");
        stringBuilder.append(this.d);
        stringBuilder.append(", wifiRadioWakeupCount=");
        stringBuilder.append(this.e);
        stringBuilder.append(", requestToWakeupScore=");
        stringBuilder.append(this.f);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
