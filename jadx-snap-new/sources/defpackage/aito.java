package defpackage;

import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

/* renamed from: aito */
final class aito implements aitx {
    private final aiua a;
    private final aitz b;
    private final airh c;
    private final aitl d;
    private final aiub e;
    private final aiqo f;
    private final aitd g = new aite(this.f);

    public aito(aiqo aiqo, aiua aiua, airh airh, aitz aitz, aitl aitl, aiub aiub) {
        this.f = aiqo;
        this.a = aiua;
        this.c = airh;
        this.b = aitz;
        this.d = aitl;
        this.e = aiub;
    }

    private static void a(JSONObject jSONObject, String str) {
        aiqr a = aiqj.a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(jSONObject.toString());
        a.a("Fabric", stringBuilder.toString());
    }

    private aity b(aitw aitw) {
        Throwable e;
        String str = "Fabric";
        aity aity = null;
        try {
            if (aitw.SKIP_CACHE_LOOKUP.equals(aitw)) {
                return null;
            }
            aiqr a;
            String str2;
            JSONObject a2 = this.d.a();
            if (a2 != null) {
                aity a3 = this.b.a(this.c, a2);
                aito.a(a2, "Loaded cached settings: ");
                long a4 = this.c.a();
                if (!aitw.IGNORE_CACHE_EXPIRATION.equals(aitw)) {
                    if ((a3.f < a4 ? 1 : null) != null) {
                        a = aiqj.a();
                        str2 = "Cached settings have expired.";
                    }
                }
                try {
                    aiqj.a().a(str, "Returning cached settings.");
                    return a3;
                } catch (Exception e2) {
                    e = e2;
                    aity = a3;
                    aiqj.a().c(str, "Failed to get cached settings", e);
                    return aity;
                }
            }
            a = aiqj.a();
            str2 = "No cached settings data found.";
            a.a(str, str2);
            return null;
        } catch (Exception e3) {
            e = e3;
        }
    }

    private String b() {
        return airf.a(airf.g(this.f.f));
    }

    public final aity a() {
        return a(aitw.USE_CACHE);
    }

    public final aity a(aitw aitw) {
        aity aity = null;
        try {
            String str = "existing_instance_identifier";
            if (!aiqj.b()) {
                if ((this.g.a().getString(str, "").equals(b()) ^ 1) == 0) {
                    aity = b(aitw);
                }
            }
            if (aity == null) {
                JSONObject a = this.e.a(this.a);
                if (a != null) {
                    aity = this.b.a(this.c, a);
                    this.d.a(aity.f, a);
                    aito.a(a, "Loaded settings: ");
                    String b = b();
                    Editor b2 = this.g.b();
                    b2.putString(str, b);
                    this.g.a(b2);
                }
            }
            return aity == null ? b(aitw.IGNORE_CACHE_EXPIRATION) : aity;
        } catch (Exception e) {
            aiqj.a().c("Fabric", "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
            return null;
        }
    }
}
