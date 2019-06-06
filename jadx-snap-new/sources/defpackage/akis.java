package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.util.regex.Pattern;

/* renamed from: akis */
public final class akis {
    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                break;
            }
            i++;
        }
        return i;
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static long a(akhl akhl) {
        return akis.a(akhl.a("Content-Length"));
    }

    private static long a(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    public static void a(akhf akhf, akhm akhm, akhl akhl) {
        if (akhf != akhf.a) {
            boolean isEmpty = akhe.a(akhm, akhl).isEmpty();
        }
    }

    public static boolean a(akhv akhv) {
        if (akhv.a.b.equals("HEAD")) {
            return false;
        }
        int i = akhv.c;
        if (((i >= 100 && i < Callback.DEFAULT_DRAG_ANIMATION_DURATION) || i == 204 || i == 304) && akis.a(akhv.f) == -1) {
            return "chunked".equalsIgnoreCase(akhv.b("Transfer-Encoding"));
        }
    }

    public static int b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            i = (int) parseLong;
            return i;
        } catch (NumberFormatException unused) {
        }
    }
}
