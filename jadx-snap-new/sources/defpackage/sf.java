package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: sf */
public final class sf {
    private static final String a = pq.a("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = "enabled";
        String str2 = "disabled";
        String str3;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            pq a = pq.a();
            String str4 = a;
            str3 = "%s %s";
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z ? str : str2;
            a.a(str4, String.format(str3, objArr), new Throwable[0]);
        } catch (Exception e) {
            pq a2 = pq.a();
            str3 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str = str2;
            }
            objArr2[1] = str;
            a2.a(str3, String.format("%s could not be %s", objArr2), e);
        }
    }
}
