package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: akqg */
public final class akqg {
    private static final Object a = new Object();
    private static int b = 0;

    public static String a(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        stringBuilder.append('/');
        stringBuilder.append(akqg.b(context));
        stringBuilder.append(" (Linux; U; Android ");
        stringBuilder.append(VERSION.RELEASE);
        String str = "; ";
        stringBuilder.append(str);
        stringBuilder.append(Locale.getDefault().toString());
        String str2 = Build.MODEL;
        if (str2.length() > 0) {
            stringBuilder.append(str);
            stringBuilder.append(str2);
        }
        str = Build.ID;
        if (str.length() > 0) {
            stringBuilder.append("; Build/");
            stringBuilder.append(str);
        }
        stringBuilder.append(";");
        akqg.a(stringBuilder);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static void a(StringBuilder stringBuilder) {
        stringBuilder.append(" Cronet/");
        stringBuilder.append("69.0.3497.100");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0019 */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|6|7|8|9|10|11) */
    private static int b(android.content.Context r3) {
        /*
        r0 = a;
        monitor-enter(r0);
        r1 = b;	 Catch:{ all -> 0x0025 }
        if (r1 != 0) goto L_0x0021;
    L_0x0007:
        r1 = r3.getPackageManager();	 Catch:{ all -> 0x0025 }
        r3 = r3.getPackageName();	 Catch:{ all -> 0x0025 }
        r2 = 0;
        r3 = r1.getPackageInfo(r3, r2);	 Catch:{ NameNotFoundException -> 0x0019 }
        r3 = r3.versionCode;	 Catch:{ NameNotFoundException -> 0x0019 }
        b = r3;	 Catch:{ NameNotFoundException -> 0x0019 }
        goto L_0x0021;
    L_0x0019:
        r3 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0025 }
        r1 = "Cannot determine package version";
        r3.<init>(r1);	 Catch:{ all -> 0x0025 }
        throw r3;	 Catch:{ all -> 0x0025 }
    L_0x0021:
        r3 = b;	 Catch:{ all -> 0x0025 }
        monitor-exit(r0);	 Catch:{ all -> 0x0025 }
        return r3;
    L_0x0025:
        r3 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0025 }
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akqg.b(android.content.Context):int");
    }
}
