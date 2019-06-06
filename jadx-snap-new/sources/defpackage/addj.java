package defpackage;

import android.net.Uri;

/* renamed from: addj */
public final class addj {
    private final abbd a;

    public addj(abbd abbd) {
        this.a = abbd;
    }

    public final Uri a() {
        Object buildUpon = addc.b.buildUpon();
        akcr.a(buildUpon, "BASE_MAP_SETTINGS_URL.buildUpon()");
        buildUpon = addh.a(buildUpon, this.a).build();
        akcr.a(buildUpon, "BASE_MAP_SETTINGS_URL.bu…eType(sourceType).build()");
        return buildUpon;
    }
}
