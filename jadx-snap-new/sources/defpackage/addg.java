package defpackage;

import android.net.Uri;

/* renamed from: addg */
public final class addg {
    public final abbd a;

    private /* synthetic */ addg() {
        this(abbd.EXTERNAL);
    }

    public addg(abbd abbd) {
        this.a = abbd;
    }

    public final adde a(String str) {
        return new adde(str, this.a);
    }

    public final addj a() {
        return new addj(this.a);
    }

    public final addd b(String str) {
        return new addd(str, this.a);
    }

    public final Uri b() {
        Object buildUpon = addc.a.buildUpon();
        akcr.a(buildUpon, "MapDeepLinkConstants.BASE_MAP_URI.buildUpon()");
        buildUpon = addh.a(buildUpon, this.a).build();
        akcr.a(buildUpon, "MapDeepLinkConstants.BAS…eType(sourceType).build()");
        return buildUpon;
    }
}
