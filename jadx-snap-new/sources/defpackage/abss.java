package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.common.base.Strings;
import java.util.Locale;

/* renamed from: abss */
public final class abss {
    public static aipn<abss> c;
    public final boolean a;
    public final boolean b;
    private final abtb d;
    private final int e;
    private final String f;

    /* renamed from: abss$a */
    public enum a {
        ;

        static {
            a = new int[]{1, 2, 3, 4, 5, 6};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    /* renamed from: abss$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x001e */
        /* JADX WARNING: Failed to process nested try/catch */
        static {
            /*
            r0 = defpackage.abss.a.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = 3;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2[r1] = r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = 4;
            r2 = a;	 Catch:{ NoSuchFieldError -> 0x001e }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0023 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0023 }
        L_0x0023:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abss$1.<clinit>():void");
        }
    }

    private abss(abtb abtb, int i, boolean z, boolean z2, String str) {
        this.d = abtb;
        this.e = i;
        this.b = z;
        this.a = z2;
        this.f = str;
    }

    private abss(abtb abtb, String str) {
        String str2 = "UIAUTOMATION";
        String str3 = "MASTER";
        String str4 = "UIAUTOMATIONDEBUG";
        String str5 = "DEBUG";
        int i = (TextUtils.isEmpty(str) || str.contains(str5) || str.contains("PROFILE") || str.contains(str4)) ? 1 : str.contains("PERF") ? 2 : str.contains(str3) ? 3 : (str.contains("ALPHA") || str.contains(str2) || str.contains("WILDCARD")) ? 4 : str.contains("Beta") ? 5 : 6;
        boolean z = TextUtils.isEmpty(str) || str.contains(str3) || str.contains(str5);
        boolean z2 = !TextUtils.isEmpty(str) && (str.contains(str4) || str.contains(str2));
        this(abtb, i, z, z2, str);
    }

    public abss(Context context) {
        this(abtb.a, abss.a(context));
    }

    public static abss a() {
        return (abss) c.get();
    }

    public static String a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo.versionName != null) {
                return packageInfo.versionName.toUpperCase(Locale.US);
            }
        } catch (NameNotFoundException unused) {
        }
        return null;
    }

    public static String a(String str) {
        if (Strings.isNullOrEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(0, indexOf);
        }
        return str;
    }

    public static void a(aipn<abss> aipn) {
        c = aipn;
    }

    public static boolean j() {
        return abtb.b;
    }

    public final boolean b() {
        int i = 1.a[this.e - 1];
        return i == 1 || i == 2;
    }

    public final boolean c() {
        int i = 1.a[this.e - 1];
        return i == 1 || i == 2 || i == 3;
    }

    public final boolean d() {
        return f();
    }

    public final boolean e() {
        return this.e == 3;
    }

    public final boolean f() {
        int i = 1.a[this.e - 1];
        return i == 1 || i == 2 || i == 3 || i == 4;
    }

    public final boolean g() {
        int i = 1.a[this.e - 1];
        return i == 1 || i == 3 || i == 4 || i == 5;
    }

    public final boolean h() {
        return this.e == 2;
    }

    public final boolean i() {
        return this.a;
    }

    public final boolean k() {
        return this.b;
    }

    public final boolean l() {
        return this.b || n();
    }

    public final boolean m() {
        int i = this.e;
        return i == 4 || i == 3;
    }

    public final boolean n() {
        return this.e == 4;
    }

    public final boolean o() {
        return this.e == 5;
    }

    public final boolean p() {
        return this.b || this.a || this.e == 2;
    }

    public final String q() {
        return abss.a(this.f);
    }
}
