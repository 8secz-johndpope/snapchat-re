package defpackage;

import defpackage.dnk.d;

/* renamed from: vrg */
public final class vrg implements ajdu<vpk, dnk> {
    final ajdu<vpk, dnk> a;

    /* renamed from: vrg$a */
    static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ vrg a;

        a(vrg vrg) {
            this.a = vrg;
        }

        /* JADX WARNING: Missing block: B:15:0x004e, code skipped:
            if (r8 == null) goto L_0x0050;
     */
        /* JADX WARNING: Missing block: B:20:0x005b, code skipped:
            if (r8 == null) goto L_0x005d;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r8) {
            /*
            r7 = this;
            r8 = (defpackage.vpk) r8;
            r0 = "it";
            defpackage.akcr.b(r8, r0);
            r0 = r8.a();
            r1 = r0.a();
            r2 = defpackage.vrh.a;
            r1 = r1.ordinal();
            r1 = r2[r1];
            r2 = 1;
            if (r1 == r2) goto L_0x0030;
        L_0x001a:
            r0 = 2;
            if (r1 != r0) goto L_0x002a;
        L_0x001d:
            r8 = defpackage.ajdp.b(r8);
            r0 = r7.a;
            r0 = r0.a;
            r8 = r8.a(r0);
            return r8;
        L_0x002a:
            r8 = new ajxk;
            r8.<init>();
            throw r8;
        L_0x0030:
            r8 = r0 instanceof defpackage.vpj.b;
            if (r8 == 0) goto L_0x0096;
        L_0x0034:
            r0 = (defpackage.vpj.b) r0;
            r8 = r0.a;
            r8 = (defpackage.vse) r8;
            r8 = defpackage.vwy.a(r8);
            if (r8 == 0) goto L_0x0080;
        L_0x0040:
            r8 = r0.a;
            r2 = r8.a;
            r3 = r0.b;
            r8 = r0.e;
            if (r8 == 0) goto L_0x0050;
        L_0x004a:
            r8 = defpackage.aayb.valueOf(r8);
            if (r8 != 0) goto L_0x0052;
        L_0x0050:
            r8 = defpackage.aayb.UNLOCK_DEEPLINK;
        L_0x0052:
            r4 = r8;
            r8 = r0.c;
            if (r8 == 0) goto L_0x005d;
        L_0x0057:
            r8 = defpackage.aayc.valueOf(r8);
            if (r8 != 0) goto L_0x005f;
        L_0x005d:
            r8 = defpackage.aayc.SNAPCODE;
        L_0x005f:
            r5 = r8;
            r8 = r0.d;
            if (r8 == 0) goto L_0x0069;
        L_0x0064:
            r8 = defpackage.aaya.valueOf(r8);
            goto L_0x006a;
        L_0x0069:
            r8 = 0;
        L_0x006a:
            r6 = r8;
            r8 = new dqf;
            r1 = r8;
            r1.<init>(r2, r3, r4, r5, r6);
            r0 = new dnk$d;
            r0.<init>(r8);
            r8 = defpackage.ajdp.b(r0);
            r0 = "Observable.just(\n       …tionType.valueOf(it) })))";
            defpackage.akcr.a(r8, r0);
            return r8;
        L_0x0080:
            r8 = new java.lang.StringBuilder;
            r1 = "Provided uuid[";
            r8.<init>(r1);
            r0 = r0.a;
            r8.append(r0);
            r0 = "] is not valid. Show error";
            r8.append(r0);
            r8 = defpackage.vrg.a();
            return r8;
        L_0x0096:
            r8 = defpackage.vrg.a();
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vrg$a.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: vrg$b */
    static final class b<T, R> implements ajfc<Throwable, ajdt<? extends dnk>> {
        private /* synthetic */ vrg a;

        b(vrg vrg) {
            this.a = vrg;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "error");
            return vrg.a();
        }
    }

    public vrg(ajdu<vpk, dnk> ajdu) {
        akcr.b(ajdu, "noPromptUnlocker");
        this.a = ajdu;
    }

    static ajdp<dnk> a() {
        Object b = ajdp.b(new d(dqf.f));
        akcr.a(b, "Observable.just(CameraPa…Card(ScanCardData.ERROR))");
        return b;
    }

    public final /* synthetic */ ajdt apply(ajdp ajdp) {
        akcr.b(ajdp, "upstream");
        Object q = ajdp.u(new a(this)).q(new b(this));
        akcr.a(q, "upstream\n            .sw… during unlock\", error) }");
        return (ajdt) q;
    }
}
