package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.mapbox.services.android.telemetry.MapboxEvent;
import defpackage.gfr.a;
import java.util.Arrays;

/* renamed from: acne */
public final class acne {
    static {
        acne acne = new acne();
    }

    private acne() {
    }

    public static final Uri a(String str, String str2) {
        akcr.b(str, "assetName");
        akcr.b(str2, MapboxEvent.KEY_RESOLUTION);
        Builder appendPath = a.b().buildUpon().appendPath("Maps_EggHunt");
        Object[] objArr = new Object[]{str, str2};
        Object format = String.format("https://scm.sc-jpl.com/thumbs/hunt2/%s@%sx.png", Arrays.copyOf(objArr, 2));
        akcr.a(format, "java.lang.String.format(format, *args)");
        format = appendPath.appendQueryParameter("base_url_param", format).build();
        akcr.a(format, "SnapContentBaseUriProvid…                 .build()");
        return format;
    }
}
