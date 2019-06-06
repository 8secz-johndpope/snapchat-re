package defpackage;

import defpackage.vpl.b;

/* renamed from: vqa */
public final class vqa implements ajdo<ajxm<? extends vpj, ? extends b>, b> {
    final vpn a;

    /* renamed from: vqa$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ vqa a;

        a(vqa vqa) {
            this.a = vqa;
        }

        /* JADX WARNING: Missing block: B:7:0x0035, code skipped:
            if (r2 == null) goto L_0x0037;
     */
        /* JADX WARNING: Missing block: B:12:0x0044, code skipped:
            if (r2 == null) goto L_0x0046;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r11) {
            /*
            r10 = this;
            r11 = (defpackage.ajxm) r11;
            r0 = "<name for destructuring parameter 0>";
            defpackage.akcr.b(r11, r0);
            r0 = r11.a;
            r0 = (defpackage.vpj) r0;
            r11 = r11.b;
            r11 = (defpackage.vpl.b) r11;
            r1 = r0 instanceof defpackage.vpj.b;
            if (r1 == 0) goto L_0x0061;
        L_0x0013:
            r1 = r11 instanceof defpackage.vpl.b.a.a;
            if (r1 == 0) goto L_0x0061;
        L_0x0017:
            r1 = r10.a;
            r1 = r1.a;
            r2 = r11;
            r2 = (defpackage.vpl.b.a.a) r2;
            r4 = r2.a;
            r5 = r2.b;
            r2 = r0;
            r2 = (defpackage.vpj.b) r2;
            r2 = r2.a;
            r6 = defpackage.vse.a.a(r2);
            r2 = r0.d();
            if (r2 == 0) goto L_0x0037;
        L_0x0031:
            r2 = defpackage.aayb.valueOf(r2);
            if (r2 != 0) goto L_0x0039;
        L_0x0037:
            r2 = defpackage.aayb.UNLOCK_DEEPLINK;
        L_0x0039:
            r7 = r2;
            r2 = r0.c();
            if (r2 == 0) goto L_0x0046;
        L_0x0040:
            r2 = defpackage.aaya.valueOf(r2);
            if (r2 != 0) goto L_0x0048;
        L_0x0046:
            r2 = defpackage.aaya.UNLOCK_LENS;
        L_0x0048:
            r8 = r2;
            r0 = r0.b();
            if (r0 == 0) goto L_0x0054;
        L_0x004f:
            r0 = defpackage.aayc.valueOf(r0);
            goto L_0x0055;
        L_0x0054:
            r0 = 0;
        L_0x0055:
            r9 = r0;
            r0 = new vpm$a;
            r3 = r0;
            r3.<init>(r4, r5, r6, r7, r8, r9);
            r0 = (defpackage.vpm) r0;
            r1.a(r0);
        L_0x0061:
            return r11;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.vqa$a.apply(java.lang.Object):java.lang.Object");
        }
    }

    public vqa(vpn vpn) {
        akcr.b(vpn, "analyticsEventHandler");
        this.a = vpn;
    }

    public final ajdn<b> a(ajdj<ajxm<vpj, b>> ajdj) {
        akcr.b(ajdj, "upstream");
        Object f = ajdj.f(new a(this));
        akcr.a(f, "upstream.map { (request,…         result\n        }");
        return (ajdn) f;
    }
}
