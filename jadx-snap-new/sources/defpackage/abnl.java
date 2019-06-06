package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;

/* renamed from: abnl */
public final class abnl {
    public static final boolean a = (VERSION.SDK_INT >= 21);
    public static final boolean b = (VERSION.SDK_INT >= 21);
    public static final boolean c = (VERSION.SDK_INT >= 21);
    public static final boolean d = (VERSION.SDK_INT >= 21);
    public static final boolean e = (VERSION.SDK_INT >= 21);
    public static final boolean f = (VERSION.SDK_INT >= 26);
    public static final boolean g = (VERSION.SDK_INT >= 21);
    public static final boolean h = (VERSION.SDK_INT >= 21);
    public static final boolean i = (VERSION.SDK_INT >= 23);
    public static final boolean j = (VERSION.SDK_INT == 23);
    public static final boolean k = (VERSION.SDK_INT >= 24);
    public static final boolean l = (VERSION.SDK_INT >= 23);
    public static final boolean m = (VERSION.SDK_INT >= 23);
    public static final boolean n = (VERSION.SDK_INT >= 21);
    public static final boolean o = (VERSION.SDK_INT == 19);
    public static final boolean p = (VERSION.SDK_INT == 28);
    public static final boolean q = (VERSION.SDK_INT >= 21);
    public static final boolean r = (VERSION.SDK_INT >= 21);
    public static final boolean s;

    static {
        boolean z = true;
        Build.MODEL.equals("Nexus 4");
        if (Build.DEVICE.startsWith("zero") && !Build.MODEL.contains("SM-G920")) {
            Build.MODEL.contains("SM-G925");
        }
        if (Build.DEVICE.startsWith("zen")) {
            Build.MODEL.contains("SM-G928");
        }
        if (Build.DEVICE.startsWith("tr") && !Build.MODEL.contains("SM-N910")) {
            Build.MODEL.contains("SM-N916");
        }
        String str = "x86";
        if (!(Build.CPU_ABI.startsWith(str) || Build.CPU_ABI2.startsWith(str))) {
            String str2 = "";
            if (!str.equals(abnl.a("ro.product.cpu.abi", str2))) {
                str.equals(abnl.a("ro.product.cpu.abi2", str2));
            }
        }
        if (VERSION.SDK_INT < 21) {
            z = false;
        }
        s = z;
    }

    private static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return str2;
        }
    }
}
