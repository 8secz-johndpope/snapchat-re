package defpackage;

import android.net.Uri;

/* renamed from: adde */
public final class adde {
    private final String a;
    private final abbd b;

    public adde(String str, abbd abbd) {
        this.a = str;
        this.b = abbd;
    }

    public final Uri a() {
        if (this.a != null) {
            Object appendQueryParameter = addc.c.buildUpon().appendQueryParameter("userid", this.a);
            akcr.a(appendQueryParameter, "MapDeepLinkConstants.BAS….PARAM_USER_ID, friendId)");
            Uri build = addh.a(appendQueryParameter, this.b).build();
            if (build != null) {
                return build;
            }
        }
        return addc.a;
    }
}
