package defpackage;

import android.os.Build.VERSION;
import java.util.Objects;

/* renamed from: jd */
public final class jd {
    public static boolean a(Object obj, Object obj2) {
        return VERSION.SDK_INT >= 19 ? Objects.equals(obj, obj2) : obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
