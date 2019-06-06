package defpackage;

import android.text.TextUtils;
import com.google.common.base.Preconditions;
import java.util.Locale;
import java.util.UUID;

/* renamed from: xhm */
public final class xhm {
    public static String a() {
        return xhm.c(UUID.randomUUID().toString());
    }

    public static String a(String str) {
        str = xhm.c(str);
        return TextUtils.isEmpty(str) ? null : str.substring(0, 16);
    }

    public static String b(String str) {
        str = xhm.c(str);
        return TextUtils.isEmpty(str) ? null : str.substring(16, 32);
    }

    private static String c(String str) {
        boolean z = true;
        Preconditions.checkArgument(TextUtils.isEmpty(str) ^ 1, "getDashlessUuidString must take in non-empty string");
        Object toUpperCase = str.replaceAll("-", "").toUpperCase(Locale.ENGLISH);
        if (toUpperCase.length() != 32) {
            z = false;
        }
        Preconditions.checkArgument(z, "getDashlessUuidString must return UUID of correct length dashlessUuidString=%s", toUpperCase);
        return toUpperCase;
    }
}
