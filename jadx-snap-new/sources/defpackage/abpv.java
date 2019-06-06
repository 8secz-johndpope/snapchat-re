package defpackage;

import android.net.Uri;

/* renamed from: abpv */
public interface abpv {
    public static final abpv a = new 1();

    /* renamed from: abpv$1 */
    static class 1 implements abpv {
        1() {
        }

        public final Uri a(String str) {
            return Uri.parse(str);
        }
    }

    Uri a(String str);
}
