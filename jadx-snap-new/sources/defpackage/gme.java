package defpackage;

import com.google.protobuf.nano.MessageNano;
import defpackage.sak.a;
import java.util.Map;

/* renamed from: gme */
public final class gme extends rzy<sai> {
    private final gjn<Object> a;
    private final gjl<Object> b;
    private final gkb<MessageNano> c = new gkb();

    public gme(iha iha, gdd gdd) {
        akcr.b(iha, "serializationHelper");
        akcr.b(gdd, "payloadSigner");
        this.a = new gjn(iha, gdd, "json");
        this.b = new gjl(iha, gdd);
    }

    public final <T> sak<sai> a(sak<T> sak) {
        sak<sai> sak2;
        akcr.b(sak2, "request");
        Object n = sak2.n();
        if (!(n == null || (n instanceof sai))) {
            a h;
            gmd gmd;
            gjn gjn;
            Object l = sak2.l();
            akcr.a(l, "request.headers");
            if (n instanceof gmb) {
                h = sak2.h();
                gmd = (gmb) n;
                gjn = this.a;
            } else if (n instanceof gma) {
                h = sak2.h();
                gma gmd2 = (gma) n;
                gjn = this.b;
            } else if (n instanceof gmc) {
                h = sak2.h();
                n = gmf.a((MessageNano) ((gmc) n).a, this.c);
                h = h.b(n);
                return h.e();
            } else if (n instanceof glz) {
                h = sak2.h().b(gmf.a((MessageNano) ((glz) n).a, this.c));
                Map d = ajzm.d(l);
                d.put("__authorization", "user");
                h = h.d(d);
                return h.e();
            } else {
                sak2 = null;
            }
            n = gmk.a((akhu) gjn.a(gmd2.a)).a;
            h = h.b(n);
            return h.e();
        }
        return sak2;
    }
}
