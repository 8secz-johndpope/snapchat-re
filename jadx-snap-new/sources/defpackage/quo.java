package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: quo */
public final class quo implements qvs {
    private final hyq a;
    private final gpb b;

    public quo(hyq hyq, gpb gpb) {
        this.a = hyq;
        this.b = gpb;
    }

    public final String a(String str, Integer num, Boolean bool, String str2, Map<String, ahqf> map, String str3) {
        icg a = icg.a(num, bool, str2, map);
        if (a != null) {
            hza f = this.a.f("snap_insert");
            if (f != null) {
                return f.a(str, a, str3, TextUtils.isEmpty(str3) ^ 1, icf.SNAP, "snap_insert", this.b.e().a.a);
            }
        }
        return str3;
    }
}
