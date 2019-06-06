package defpackage;

import defpackage.gfp.a;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* renamed from: rsp */
public final class rsp implements gfq {
    final ajwy<evg> a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: rsp$a */
    static final class a extends akcs implements akbk<HashSet<String>> {
        private /* synthetic */ rsp a;

        a(rsp rsp) {
            this.a = rsp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajyu.j(akgc.b((CharSequence) ((evg) this.a.a.get()).g(fxm.MDP_CONTENT_DISK_CONFIGURATION_ENABLED, new acce()), new char[]{','}));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rsp.class), "enabledTypes", "getEnabledTypes()Ljava/util/HashSet;");
    }

    public rsp(ajwy<evg> ajwy) {
        akcr.b(ajwy, "cof");
        this.a = ajwy;
    }

    public final gfp a(gfp gfp) {
        akcr.b(gfp, "contentType");
        if (!((HashSet) this.b.b()).contains(gfp.d)) {
            return gfp;
        }
        acce acce = new acce();
        accd accd = new accd();
        accd.a(gfp.f.legacyMushroomContentType);
        acce.b = accd;
        long f = ((evg) this.a.get()).f(fxm.MDP_CONTENT_DISK_MAX_SIZE_MB, acce);
        long f2 = ((evg) this.a.get()).f(fxm.MDP_CONTENT_DISK_DEFAULT_TTL_DAY, acce);
        long f3 = ((evg) this.a.get()).f(fxm.MDP_CONTENT_DISK_REFRESH_TTL_DAY, acce);
        Object obj = 1;
        Object obj2 = f >= 0 ? 1 : null;
        Object obj3 = f2 >= 0 ? 1 : null;
        if (f3 < 0) {
            obj = null;
        }
        if (obj2 == null && obj3 == null && obj == null) {
            return gfp;
        }
        a aVar = new a(gfp);
        if (obj2 != null) {
            aVar.a = (f << 10) << 10;
        }
        if (obj3 != null) {
            aVar.b = TimeUnit.DAYS.toMillis(f2);
        }
        if (obj != null) {
            aVar.c = TimeUnit.DAYS.toMillis(f3);
        }
        return aVar.a();
    }
}
