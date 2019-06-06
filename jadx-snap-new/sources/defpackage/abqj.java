package defpackage;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* renamed from: abqj */
public final class abqj {
    private static final NumberFormat a = new DecimalFormat("###,###,###");

    static {
        DecimalFormat decimalFormat = new DecimalFormat("0.000");
    }

    public static String a(int i) {
        return a.format((long) i);
    }

    public static String a(long j) {
        return a.format(j);
    }
}
