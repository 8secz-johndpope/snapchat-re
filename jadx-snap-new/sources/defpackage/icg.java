package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: icg */
public final class icg {
    public final int a;
    public final boolean b;
    public final String c;
    public final Map<String, ahqf> d;

    private icg(int i, boolean z, String str, Map<String, ahqf> map) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = map;
    }

    public static icg a(Integer num, Boolean bool, String str, Map<String, ahqf> map) {
        return (num == null || bool == null || TextUtils.isEmpty(str) || map == null) ? null : new icg(num.intValue(), bool.booleanValue(), str, map);
    }
}
