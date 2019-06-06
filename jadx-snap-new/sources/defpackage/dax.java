package defpackage;

import android.os.Build.VERSION;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.util.regex.Pattern;

/* renamed from: dax */
public final class dax {
    static int a = -1;
    private static final Pattern b = Pattern.compile("cpu\\d+");
    private static int c = -1;

    public static int a() {
        int i = c;
        return i > 0 ? i : VERSION.SDK_INT >= 21 ? (int) Os.sysconf(OsConstants._SC_NPROCESSORS_CONF) : dax.b();
    }

    private static /* synthetic */ boolean a(File file, String str) {
        return file.isDirectory() && b.matcher(str).matches();
    }

    private static int b() {
        File file = new File("/sys/devices/system/cpu/");
        return (file.exists() && file.isDirectory()) ? file.listFiles(-$$Lambda$dax$0P8RfG83nQlzqSHOcuTQz3tMySw.INSTANCE).length : 0;
    }
}
