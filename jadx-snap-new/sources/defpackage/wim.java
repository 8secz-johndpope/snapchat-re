package defpackage;

import com.snapchat.android.core.security.SCPluginWrapper;
import defpackage.akhn.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: wim */
public final class wim extends saa implements akhn {
    private final gdd a;
    private final ajwy<SCPluginWrapper> b;

    public wim(gdd gdd, ajwy<SCPluginWrapper> ajwy) {
        this.a = gdd;
        this.b = ajwy;
    }

    private Map<String, String> a(String str) {
        final aedh a = this.a.a(new aedh());
        1 1 = new LinkedHashMap<String, String>() {
        };
        str = ((SCPluginWrapper) this.b.get()).a(1, str);
        if (str != null) {
            1.put("X-Snapchat-Client-Auth", str);
        }
        return 1;
    }

    public final void a(sak<sai> sak, sab sab) {
        sak sak2;
        HashMap hashMap = new HashMap(sak2.l());
        if ("user".equals((String) hashMap.remove("__authorization"))) {
            hashMap.putAll(a(sbi.b(sak2)));
            sak2 = sak2.h().d(hashMap).e();
        }
        sab.a(sak2);
    }

    public final akhv intercept(a aVar) {
        akht a = aVar.a();
        String str = "__authorization";
        if ("user".equals(a.a(str))) {
            akht.a d = a.d();
            d.b(str);
            a = gmk.a(d, a(a.a.f())).a();
        }
        return aVar.a(a);
    }
}
