package defpackage;

import defpackage.mqt.a;

/* renamed from: liw */
public final class liw implements ajdu<a, a> {
    final kqf a;

    /* renamed from: liw$a */
    static final class a<T> implements ajfb<defpackage.mqt.a> {
        private /* synthetic */ liw a;

        a(liw liw) {
            this.a = liw;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0029  */
        public final /* synthetic */ void accept(java.lang.Object r2) {
            /*
            r1 = this;
            r2 = (defpackage.mqt.a) r2;
            r0 = r2 instanceof defpackage.mqt.a.d;
            if (r0 == 0) goto L_0x000b;
        L_0x0006:
            r2 = defpackage.kqe.c.f.b;
        L_0x0008:
            r2 = (defpackage.kqe.c) r2;
            goto L_0x0027;
        L_0x000b:
            r0 = r2 instanceof defpackage.mqt.a.e;
            if (r0 == 0) goto L_0x0012;
        L_0x000f:
            r2 = defpackage.kqe.c.h.b;
            goto L_0x0008;
        L_0x0012:
            r0 = r2 instanceof defpackage.mqt.a.c;
            if (r0 != 0) goto L_0x0024;
        L_0x0016:
            r0 = r2 instanceof defpackage.mqt.a.b;
            if (r0 == 0) goto L_0x001b;
        L_0x001a:
            goto L_0x0024;
        L_0x001b:
            r2 = r2 instanceof defpackage.mqt.a.a;
            if (r2 == 0) goto L_0x0022;
        L_0x001f:
            r2 = defpackage.kqe.c.a.b;
            goto L_0x0008;
        L_0x0022:
            r2 = 0;
            goto L_0x0027;
        L_0x0024:
            r2 = defpackage.kqe.c.b.b;
            goto L_0x0008;
        L_0x0027:
            if (r2 == 0) goto L_0x0032;
        L_0x0029:
            r0 = r1.a;
            r0 = r0.a;
            r2 = (defpackage.kqe) r2;
            r0.a(r2);
        L_0x0032:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.liw$a.accept(java.lang.Object):void");
        }
    }

    public liw(kqf kqf) {
        akcr.b(kqf, "analyticsEventHandler");
        this.a = kqf;
    }

    public final ajdt<a> apply(ajdp<a> ajdp) {
        akcr.b(ajdp, "upstream");
        Object d = ajdp.d((ajfb) new a(this));
        akcr.a(d, "upstream.doOnNext { even…er.handle(it) }\n        }");
        return (ajdt) d;
    }
}
