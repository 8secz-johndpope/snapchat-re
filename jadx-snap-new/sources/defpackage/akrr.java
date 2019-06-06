package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: akrr */
public final class akrr implements Serializable {
    public static int a = 1;
    static akrr b;
    public static akrr c;
    private static akrr e;
    private static akrr f;
    private static akrr g;
    private static akrr h;
    private static akrr i;
    private static akrr j;
    public final akrg[] d;
    private final String k;
    private final int[] l;

    static {
        HashMap hashMap = new HashMap(32);
    }

    public akrr(String str, akrg[] akrgArr, int[] iArr) {
        this.k = str;
        this.d = akrgArr;
        this.l = iArr;
    }

    public static akrr a() {
        akrr akrr = e;
        if (akrr != null) {
            return akrr;
        }
        String str = "Years";
        akrr = new akrr(str, new akrg[]{akrg.d}, new int[]{0, -1, -1, -1, -1, -1, -1, -1});
        e = akrr;
        return akrr;
    }

    public static akrr b() {
        akrr akrr = f;
        if (akrr != null) {
            return akrr;
        }
        String str = "Months";
        akrr = new akrr(str, new akrg[]{akrg.e}, new int[]{-1, 0, -1, -1, -1, -1, -1, -1});
        f = akrr;
        return akrr;
    }

    public static akrr c() {
        akrr akrr = g;
        if (akrr != null) {
            return akrr;
        }
        String str = "Days";
        akrr = new akrr(str, new akrg[]{akrg.g}, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
        g = akrr;
        return akrr;
    }

    public static akrr d() {
        akrr akrr = h;
        if (akrr != null) {
            return akrr;
        }
        String str = "Hours";
        akrr = new akrr(str, new akrg[]{akrg.i}, new int[]{-1, -1, -1, -1, 0, -1, -1, -1});
        h = akrr;
        return akrr;
    }

    public static akrr e() {
        akrr akrr = i;
        if (akrr != null) {
            return akrr;
        }
        String str = "Minutes";
        akrr = new akrr(str, new akrg[]{akrg.j}, new int[]{-1, -1, -1, -1, -1, 0, -1, -1});
        i = akrr;
        return akrr;
    }

    public static akrr f() {
        akrr akrr = j;
        if (akrr != null) {
            return akrr;
        }
        String str = "Seconds";
        akrr = new akrr(str, new akrg[]{akrg.k}, new int[]{-1, -1, -1, -1, -1, -1, 0, -1});
        j = akrr;
        return akrr;
    }

    public final boolean a(int i, int[] iArr, int i2) {
        if (i2 == 0) {
            return false;
        }
        i = this.l[i];
        if (i != -1) {
            iArr[i] = aktl.a(iArr[i], i2);
            return true;
        }
        throw new UnsupportedOperationException("Field is not supported");
    }

    public final boolean a(akrg akrg) {
        return b(akrg) >= 0;
    }

    public final int b(akrg akrg) {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            if (this.d[i] == akrg) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akrr)) {
            return false;
        }
        return Arrays.equals(this.d, ((akrr) obj).d);
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            akrg[] akrgArr = this.d;
            if (i >= akrgArr.length) {
                return i2;
            }
            i2 += akrgArr[i].hashCode();
            i++;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PeriodType[");
        stringBuilder.append(this.k);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
