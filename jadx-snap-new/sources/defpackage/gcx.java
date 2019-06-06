package defpackage;

import defpackage.akhn.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: gcx */
public final class gcx extends saa implements akhn {
    final gcz a;

    /* renamed from: gcx$1 */
    class 1 extends LinkedHashMap<String, String> {
        1() {
            put("User-Agent", ((ifb) gcx.this.a.a.get()).j());
            put("Accept-Language", gcx.this.a.a());
            Object uuid = iig.a().toString();
            akcr.a(uuid, "UUIDGenerator.nonCryptoRandomUUID().toString()");
            put("X-Snapchat-UUID", uuid);
            put("Accept", "application/json");
        }
    }

    public gcx(gcz gcz) {
        this.a = gcz;
    }

    private Map<String, String> a() {
        return new 1();
    }

    public final void a(sak<sai> sak, sab sab) {
        sab.a(sbi.a((sak) sak, a()));
    }

    public final akhv intercept(a aVar) {
        return aVar.a(gmk.a(aVar.a().d(), a()).a());
    }
}
