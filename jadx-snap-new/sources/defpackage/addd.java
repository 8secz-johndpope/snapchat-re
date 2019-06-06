package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;

/* renamed from: addd */
public final class addd {
    private final String a;
    private final abbd b;

    public addd(String str, abbd abbd) {
        this.a = str;
        this.b = abbd;
    }

    public final Uri a() {
        Object buildUpon = addc.e.buildUpon();
        akcr.a(buildUpon, "MapDeepLinkConstants.BAS…P_EXPLORE_URL.buildUpon()");
        Builder a = addh.a(buildUpon, this.b);
        String str = this.a;
        if (str != null) {
            a.appendQueryParameter("userid", str);
        }
        buildUpon = a.build();
        akcr.a(buildUpon, "uri.build()");
        return buildUpon;
    }
}
