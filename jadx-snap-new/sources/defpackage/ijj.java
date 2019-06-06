package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import defpackage.gfr.a;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: ijj */
public final class ijj {

    /* renamed from: ijj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public static Uri a(abzy abzy, String str, String str2) {
        String str3 = "geofilter";
        akcr.b(abzy, str3);
        Builder appendQueryParameter = a.b().buildUpon().appendPath(str3).appendQueryParameter("url", abzy.b());
        afdr f = abzy.f();
        String str4 = null;
        appendQueryParameter = appendQueryParameter.appendQueryParameter("content_type", String.valueOf(f != null ? Integer.valueOf(f.ordinal()) : null)).appendQueryParameter("category", String.valueOf(abzy.m().ordinal()));
        String str5 = "";
        if (str == null) {
            str = str5;
        }
        Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("bitmoji_avatar_id", str);
        afdr f2 = abzy.f();
        akcr.a((Object) f2, "geofilter.unlockableContentType");
        Map c = abzy.c();
        if (f2 == afdr.BITMOJI_FILTER && c != null) {
            String str6 = (String) c.get("json");
            if (str6 != null) {
                JSONObject jSONObject = new JSONObject(str6);
                str6 = "image_id";
                if (jSONObject.has(str6) && jSONObject.get(str6) != null) {
                    str4 = jSONObject.get(str6).toString();
                }
            }
        }
        if (str4 == null) {
            str4 = str5;
        }
        Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("bitmoji_image_id", str4);
        if (str2 == null) {
            str2 = str5;
        }
        Object build = appendQueryParameter3.appendQueryParameter("friend_bitmoji_avatar_id", str2).build();
        akcr.a(build, "SnapContentBaseUriProvid…\n                .build()");
        return build;
    }
}
