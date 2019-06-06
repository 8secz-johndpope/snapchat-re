package defpackage;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: abte */
public final class abte {
    static {
        Pattern.compile("0x");
    }

    public static int a(int i, int i2) {
        return Color.argb(i, Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public static int a(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public static String a(int i) {
        return String.format("%06X", new Object[]{Integer.valueOf(i & 16777215)});
    }

    public static int b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (str.charAt(0) != '#') {
            str = "#".concat(String.valueOf(str));
        }
        return abte.a(str, i);
    }
}
