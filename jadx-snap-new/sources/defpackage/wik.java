package defpackage;

import com.snapchat.android.core.security.SCPluginWrapper;
import defpackage.akhn.a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: wik */
public final class wik extends saa implements akhn {
    private final ajwy<SCPluginWrapper> a;

    public wik(ajwy<SCPluginWrapper> ajwy) {
        this.a = ajwy;
    }

    private <T> String a(T t, String str) {
        Map hashMap = new HashMap();
        if (t instanceof gjo) {
            hashMap = ((gjo) t).a();
            String str2 = "attestation";
            if (hashMap.containsKey(str2)) {
                HashMap hashMap2 = new HashMap(hashMap);
                hashMap2.remove(str2);
                hashMap = hashMap2;
            }
        }
        return ((SCPluginWrapper) this.a.get()).a(hashMap, str);
    }

    public final void a(sak sak, sab sab) {
        HashMap hashMap = new HashMap(sak.l());
        if ("content".equals((String) hashMap.remove("__authorization"))) {
            String a = a(sak.n(), sbi.b(sak));
            if (a != null) {
                hashMap.put("X-Snapchat-Client-Auth", a);
            }
            sak = sak.h().d(hashMap).e();
        }
        sab.a(sak);
    }

    public final akhv intercept(a aVar) {
        akht a = aVar.a();
        String str = "__authorization";
        if ("content".equals(a.a(str))) {
            akht.a d = a.d();
            d.b(str);
            String a2 = a(a.d, a.a.f());
            if (a2 != null) {
                d.b("X-Snapchat-Client-Auth", a2);
            }
            a = d.a();
        }
        return aVar.a(a);
    }
}
