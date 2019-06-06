package defpackage;

import java.util.Map;

/* renamed from: gna */
public final class gna {
    public static final String j = j;
    public static final String k = k;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;
    public final boolean f;
    public final gnh g;
    public final gnm h;
    public final Map<String, String> i;

    /* renamed from: gna$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public gna(String str, boolean z, boolean z2, long j, int i, boolean z3, gnh gnh, gnm gnm) {
        akcr.b(str, "name");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = i;
        this.f = z3;
        this.g = gnh;
        this.h = gnm;
        this.i = null;
    }

    public /* synthetic */ gna(String str, boolean z, boolean z2, long j, int i, boolean z3, gnh gnh, gnm gnm, int i2) {
        int i3 = i2;
        this(str, (i3 & 2) != 0 ? true : z, (i3 & 4) != 0 ? true : z2, (i3 & 8) != 0 ? 5 : j, (i3 & 16) != 0 ? -1 : i, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? null : gnh, (i3 & 128) != 0 ? null : gnm);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gna) {
                gna gna = (gna) obj;
                if (akcr.a(this.a, gna.a)) {
                    if ((this.b == gna.b ? 1 : null) != null) {
                        if ((this.c == gna.c ? 1 : null) != null) {
                            if ((this.d == gna.d ? 1 : null) != null) {
                                if ((this.e == gna.e ? 1 : null) != null) {
                                    if (!((this.f == gna.f ? 1 : null) != null && akcr.a(this.g, gna.g) && akcr.a(this.h, gna.h) && akcr.a(null, null))) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        int i2 = this.b;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        i2 = this.c;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        long j = this.d;
        hashCode = (((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.e) * 31;
        i2 = this.f;
        if (i2 != 0) {
            i2 = 1;
        }
        hashCode = (hashCode + i2) * 31;
        gnh gnh = this.g;
        hashCode = (hashCode + (gnh != null ? gnh.hashCode() : 0)) * 31;
        gnm gnm = this.h;
        if (gnm != null) {
            i = gnm.hashCode();
        }
        return (hashCode + i) * 31;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BackgroundPrefetchConstraints(name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", wifiOnly=");
        stringBuilder.append(this.b);
        stringBuilder.append(", chargingOnly=");
        stringBuilder.append(this.c);
        stringBuilder.append(", timeoutInMinutes=");
        stringBuilder.append(this.d);
        stringBuilder.append(", numOfRetries=");
        stringBuilder.append(this.e);
        stringBuilder.append(", isRecurring=");
        stringBuilder.append(this.f);
        stringBuilder.append(", fixedTimeConstraints=");
        stringBuilder.append(this.g);
        stringBuilder.append(", lifecycleConstraints=");
        stringBuilder.append(this.h);
        stringBuilder.append(", extraProperties=");
        stringBuilder.append(null);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
