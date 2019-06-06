package defpackage;

import java.util.Objects;

/* renamed from: dbf */
public class dbf extends das<dbf> {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;

    private dbf a(dbf dbf) {
        this.a = dbf.a;
        this.b = dbf.b;
        this.c = dbf.c;
        this.d = dbf.d;
        this.e = dbf.e;
        this.f = dbf.f;
        this.g = dbf.g;
        this.h = dbf.h;
        return this;
    }

    public final /* synthetic */ das a(das das, das das2) {
        dbf dbf = (dbf) das;
        dbf dbf2 = (dbf) das2;
        if (dbf2 == null) {
            dbf2 = new dbf();
        }
        if (dbf == null) {
            dbf2.a(this);
        } else {
            dbf2.a = this.a - dbf.a;
            dbf2.b = this.b - dbf.b;
            dbf2.c = this.c - dbf.c;
            dbf2.d = this.d - dbf.d;
            dbf2.e = this.e - dbf.e;
            dbf2.f = this.f - dbf.f;
            dbf2.g = this.g - dbf.g;
            dbf2.h = this.h - dbf.h;
        }
        return dbf2;
    }

    public final /* synthetic */ das b(das das, das das2) {
        dbf dbf = (dbf) das;
        dbf dbf2 = (dbf) das2;
        if (dbf2 == null) {
            dbf2 = new dbf();
        }
        if (dbf == null) {
            dbf2.a(this);
        } else {
            dbf2.a = this.a + dbf.a;
            dbf2.b = this.b + dbf.b;
            dbf2.c = this.c + dbf.c;
            dbf2.d = this.d + dbf.d;
            dbf2.e = this.e + dbf.e;
            dbf2.f = this.f + dbf.f;
            dbf2.g = this.g + dbf.g;
            dbf2.h = this.h + dbf.h;
        }
        return dbf2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dbf dbf = (dbf) obj;
            return this.a == dbf.a && this.b == dbf.b && this.c == dbf.c && this.d == dbf.d && this.e == dbf.e && this.f == dbf.f && this.g == dbf.g && this.h == dbf.h;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkMetrics{mobileBytesTx=");
        stringBuilder.append(this.a);
        stringBuilder.append(", mobileBytesRx=");
        stringBuilder.append(this.b);
        stringBuilder.append(", wifiBytesTx=");
        stringBuilder.append(this.c);
        stringBuilder.append(", wifiBytesRx=");
        stringBuilder.append(this.d);
        stringBuilder.append("mobilePacketsTx=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mobilePacketsRx=");
        stringBuilder.append(this.f);
        stringBuilder.append(", wifiPacketsTx=");
        stringBuilder.append(this.g);
        stringBuilder.append(", wifiPacketsRx=");
        stringBuilder.append(this.h);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
