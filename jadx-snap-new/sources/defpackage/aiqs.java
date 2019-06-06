package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import defpackage.aitv.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: aiqs */
final class aiqs extends aiqo<Boolean> {
    private final aisx a = new aisu();
    private PackageManager b;
    private String c;
    private PackageInfo j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private final Future<Map<String, aiqq>> p;
    private final Collection<aiqo> q;

    public aiqs(Future<Map<String, aiqq>> future, Collection<aiqo> collection) {
        this.p = future;
        this.q = collection;
    }

    private aiti a(aits aits, Collection<aiqq> collection) {
        Context context = this.f;
        aird aird = new aird();
        return new aiti(aird.a(context), this.h.d, this.l, this.k, airf.a(airf.g(context)), this.n, airi.a(this.m).id, this.o, "0", aits, collection);
    }

    private static Map<String, aiqq> a(Map<String, aiqq> map, Collection<aiqo> collection) {
        for (aiqo aiqo : collection) {
            if (!map.containsKey(aiqo.b())) {
                map.put(aiqo.b(), new aiqq(aiqo.b(), aiqo.a(), "binary"));
            }
        }
        return map;
    }

    private Boolean e() {
        String str = "Fabric";
        String e = airf.e(this.f);
        aity f = f();
        boolean z = false;
        if (f != null) {
            try {
                aitv aitv;
                Map a = aiqs.a(this.p != null ? (Map) this.p.get() : new HashMap(), this.q);
                aitj aitj = f.a;
                Collection values = a.values();
                if ("new".equals(aitj.a)) {
                    if (new aitm(this, g(), aitj.b, this.a).a(a(aits.a(this.f, e), values))) {
                        aitv = a.a;
                    } else {
                        aiqj.a().c(str, "Failed to create app with Crashlytics service.", null);
                    }
                } else if ("configured".equals(aitj.a)) {
                    aitv = a.a;
                } else {
                    if (aitj.e) {
                        aiqj.a().a(str, "Server says an update is required - forcing a full App update.");
                        new aiuc(this, g(), aitj.b, this.a).a(a(aits.a(this.f, e), values));
                    }
                    z = true;
                }
                z = aitv.c();
            } catch (Exception e2) {
                aiqj.a().c(str, "Error performing auto configuration.", e2);
            }
        }
        return Boolean.valueOf(z);
    }

    private aity f() {
        try {
            a.a.a(this, this.h, this.a, this.k, this.l, g()).b();
            return a.a.a();
        } catch (Exception e) {
            aiqj.a().c("Fabric", "Error dealing with settings", e);
            return null;
        }
    }

    private String g() {
        return airf.d(this.f, "com.crashlytics.ApiEndpoint");
    }

    public final String a() {
        return "1.4.3.25";
    }

    public final String b() {
        return "io.fabric.sdk.android:fabric";
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object d() {
        return e();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d_() {
        try {
            this.m = this.h.d();
            this.b = this.f.getPackageManager();
            this.c = this.f.getPackageName();
            this.j = this.b.getPackageInfo(this.c, 0);
            this.k = Integer.toString(this.j.versionCode);
            this.l = this.j.versionName == null ? "0.0" : this.j.versionName;
            this.n = this.b.getApplicationLabel(this.f.getApplicationInfo()).toString();
            this.o = Integer.toString(this.f.getApplicationInfo().targetSdkVersion);
            return true;
        } catch (NameNotFoundException e) {
            aiqj.a().c("Fabric", "Failed init", e);
            return false;
        }
    }
}
