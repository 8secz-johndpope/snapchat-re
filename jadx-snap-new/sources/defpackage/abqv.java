package defpackage;

import android.app.Application;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.snapchat.android.framework.misc.AppContext;

@Deprecated
/* renamed from: abqv */
public final class abqv {
    private static final String a;
    private static final String b;
    private static final Supplier<String> c = Suppliers.memoize(new 1());

    /* renamed from: abqv$1 */
    static class 1 implements Supplier<String> {
        1() {
        }

        private static String a() {
            try {
                Application application = AppContext.get();
                return application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            } catch (NameNotFoundException | NullPointerException unused) {
                return "3.0.2";
            }
        }

        public final /* synthetic */ Object get() {
            return 1.a();
        }
    }

    static {
        StringBuilder stringBuilder = new StringBuilder("; Android ");
        stringBuilder.append(VERSION.RELEASE);
        String str = "#";
        stringBuilder.append(str);
        stringBuilder.append(VERSION.INCREMENTAL);
        stringBuilder.append(str);
        stringBuilder.append(VERSION.SDK_INT);
        a = stringBuilder.toString();
        stringBuilder = new StringBuilder(" (");
        stringBuilder.append(Build.MODEL);
        stringBuilder.append(a);
        stringBuilder.append("; gzip)");
        b = stringBuilder.toString();
    }

    public static String a() {
        StringBuilder stringBuilder = new StringBuilder("Snapchat/");
        stringBuilder.append(abqv.b());
        stringBuilder.append(b);
        return stringBuilder.toString();
    }

    private static String b() {
        return (String) c.get();
    }
}
