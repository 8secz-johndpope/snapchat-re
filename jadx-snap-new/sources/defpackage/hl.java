package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.util.Log;
import defpackage.hg.b;

/* renamed from: hl */
public final class hl {
    public static final a a;
    public static final jb<String, Typeface> b = new jb(16);

    /* renamed from: hl$a */
    public interface a {
        Typeface a(Context context, Resources resources, int i, String str, int i2);

        Typeface a(Context context, b bVar, Resources resources, int i);

        Typeface a(Context context, ip.b[] bVarArr, int i);
    }

    static {
        a hoVar;
        if (VERSION.SDK_INT >= 26) {
            hoVar = new ho();
        } else {
            if (VERSION.SDK_INT >= 24) {
                if (hn.a == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if ((hn.a != null ? 1 : null) != null) {
                    hoVar = new hn();
                }
            }
            hoVar = VERSION.SDK_INT >= 21 ? new hm() : new hp();
        }
        a = hoVar;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = a.a(context, resources, i, str, i2);
        if (a != null) {
            b.a(hl.a(resources, i, i2), a);
        }
        return a;
    }

    public static String a(Resources resources, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(i));
        String str = "-";
        stringBuilder.append(str);
        stringBuilder.append(i);
        stringBuilder.append(str);
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}
