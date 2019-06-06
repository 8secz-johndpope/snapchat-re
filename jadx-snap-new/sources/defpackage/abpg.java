package defpackage;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/* renamed from: abpg */
public final class abpg {
    private static final String[] a = new String[]{"B", "KB", "MB", "GB", "TB", "PB"};

    static {
        abpg abpg = new abpg();
    }

    private abpg() {
    }

    public static String a(double d) {
        return abpg.a(d, new DecimalFormat("#,##0.#"));
    }

    private static String a(double d, NumberFormat numberFormat) {
        if (d < 0.0d) {
            return "NaN";
        }
        int i = 0;
        while (d >= 1000.0d && i < 5) {
            d /= 1000.0d;
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(numberFormat.format(d));
        stringBuilder.append(' ');
        stringBuilder.append(a[i]);
        return stringBuilder.toString();
    }
}
