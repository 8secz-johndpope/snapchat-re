package defpackage;

import com.snap.core.net.content.impl.ContentManagerEvents.OnBoltRequestStart;
import com.snap.core.net.content.impl.ContentManagerEvents.OnCacheEnd;
import com.snap.core.net.content.impl.ContentManagerEvents.OnNetworkRequestStart;
import com.snap.core.net.content.impl.ContentManagerEvents.OnRequestComplete;

/* renamed from: gkq */
public final class gkq implements ifj {
    final ilv a;
    final gkr b;

    /* renamed from: gkq$e */
    static final class e extends akcq implements akbl<iff<OnRequestComplete>, ajxw> {
        e(gkq gkq) {
            super(1, gkq);
        }

        public final String getName() {
            return "onRequestComplete";
        }

        public final akej getOwner() {
            return akde.a(gkq.class);
        }

        public final String getSignature() {
            return "onRequestComplete(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            gkv.a(iff, (akbk) new d((gkq) this.receiver, iff));
            return ajxw.a;
        }
    }

    /* renamed from: gkq$f */
    static final class f extends akcq implements akbl<iff<OnCacheEnd>, ajxw> {
        f(gkq gkq) {
            super(1, gkq);
        }

        public final String getName() {
            return "onCacheEnd";
        }

        public final akej getOwner() {
            return akde.a(gkq.class);
        }

        public final String getSignature() {
            return "onCacheEnd(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            gkv.a(iff, (akbk) new b((gkq) this.receiver, iff));
            return ajxw.a;
        }
    }

    /* renamed from: gkq$g */
    static final class g extends akcq implements akbl<iff<OnBoltRequestStart>, ajxw> {
        g(gkq gkq) {
            super(1, gkq);
        }

        public final String getName() {
            return "onBoltRequestStart";
        }

        public final akej getOwner() {
            return akde.a(gkq.class);
        }

        public final String getSignature() {
            return "onBoltRequestStart(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            gkv.a(iff, (akbk) new a((gkq) this.receiver, iff));
            return ajxw.a;
        }
    }

    /* renamed from: gkq$h */
    static final class h extends akcq implements akbl<iff<OnNetworkRequestStart>, ajxw> {
        h(gkq gkq) {
            super(1, gkq);
        }

        public final String getName() {
            return "onNetworkRequestStart";
        }

        public final akej getOwner() {
            return akde.a(gkq.class);
        }

        public final String getSignature() {
            return "onNetworkRequestStart(Lcom/snap/framework/network/event/NetEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            gkv.a(iff, (akbk) new c((gkq) this.receiver, iff));
            return ajxw.a;
        }
    }

    /* renamed from: gkq$b */
    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ gkq a;
        private /* synthetic */ iff b;

        b(gkq gkq, iff iff) {
            this.a = gkq;
            this.b = iff;
            super(0);
        }

        /* JADX WARNING: Missing block: B:14:0x0060, code skipped:
            if (r0 != null) goto L_0x0062;
     */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
            r6 = this;
            r0 = r6.b;
            r0 = r0.a;
            r0 = (com.snap.core.net.content.impl.ContentManagerEvents.OnCacheEnd) r0;
            r0 = r0.b;
            r1 = r6.b;
            r1 = r1.a;
            r1 = (com.snap.core.net.content.impl.ContentManagerEvents.OnCacheEnd) r1;
            r1 = r1.a;
            r2 = r6.a;
            r3 = "contentRequest";
            if (r0 == 0) goto L_0x0039;
        L_0x0016:
            r4 = r0.f();
            if (r4 == 0) goto L_0x0039;
        L_0x001c:
            r4 = r4.e;
            if (r4 == 0) goto L_0x0039;
        L_0x0020:
            r4 = r4.c;
            r5 = 1;
            if (r4 != r5) goto L_0x0039;
        L_0x0025:
            r2 = r2.a;
            defpackage.akcr.b(r1, r3);
            r3 = defpackage.inu.CACHE_HIT_LATENCY;
            r3 = (defpackage.ily) r3;
            r1 = defpackage.gkr.b(r3, r1);
            r0 = r0.f();
            r0 = r0.e;
            goto L_0x0062;
        L_0x0039:
            r4 = r2.a;
            defpackage.akcr.b(r1, r3);
            r5 = defpackage.inu.CACHE_MISS_COUNT;
            r5 = (defpackage.ily) r5;
            r5 = defpackage.gkr.b(r5, r1);
            r4.c(r5, 1);
            r2 = r2.a;
            defpackage.akcr.b(r1, r3);
            r3 = defpackage.inu.CACHE_MISS_LATENCY;
            r3 = (defpackage.ily) r3;
            r1 = defpackage.gkr.b(r3, r1);
            if (r0 == 0) goto L_0x0065;
        L_0x0058:
            r0 = r0.f();
            if (r0 == 0) goto L_0x0065;
        L_0x005e:
            r0 = r0.e;
            if (r0 == 0) goto L_0x0065;
        L_0x0062:
            r3 = r0.b;
            goto L_0x0067;
        L_0x0065:
            r3 = -1;
        L_0x0067:
            r2.a(r1, r3);
            r0 = defpackage.ajxw.a;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gkq$b.invoke():java.lang.Object");
        }
    }

    /* renamed from: gkq$c */
    static final class c extends akcs implements akbk<ajxw> {
        private /* synthetic */ gkq a;
        private /* synthetic */ iff b;

        c(gkq gkq, iff iff) {
            this.a = gkq;
            this.b = iff;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ilv ilv = this.a.a;
            gkr gkr = this.a.b;
            geg geg = ((OnNetworkRequestStart) this.b.a).a;
            akcr.b(geg, "contentRequest");
            ilv.c(gkr.a((ily) inu.TOTAL_NETWORK_REQUEST_COUNT, geg), 1);
            return ajxw.a;
        }
    }

    /* renamed from: gkq$d */
    static final class d extends akcs implements akbk<ajxw> {
        private /* synthetic */ gkq a;
        private /* synthetic */ iff b;

        d(gkq gkq, iff iff) {
            this.a = gkq;
            this.b = iff;
            super(0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00d7  */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
            r12 = this;
            r0 = r12.b;
            r0 = r0.a;
            r0 = (com.snap.core.net.content.impl.ContentManagerEvents.OnRequestComplete) r0;
            r0 = r0.b;
            r1 = r12.b;
            r1 = r1.a;
            r1 = (com.snap.core.net.content.impl.ContentManagerEvents.OnRequestComplete) r1;
            r1 = r1.a;
            r2 = r12.a;
            r3 = r2.a;
            r4 = r2.b;
            r5 = "contentRequest";
            defpackage.akcr.b(r1, r5);
            r6 = defpackage.inu.TOTAL_REQUEST_COUNT;
            r6 = (defpackage.ily) r6;
            r4 = r4.a(r6, r1);
            r3.c(r4, 1);
            r3 = r2.a;
            r4 = r2.b;
            defpackage.akcr.b(r1, r5);
            r6 = defpackage.inu.TOTAL_LATENCY;
            r6 = (defpackage.ily) r6;
            r4 = r4.a(r6, r1);
            r6 = r0.f();
            r6 = r6.c;
            r3.b(r4, r6);
            r3 = r0.a();
            r4 = "result.failureReason";
            if (r3 == 0) goto L_0x008a;
        L_0x0046:
            r3 = r0.f();
            r3 = r3.a;
            r6 = defpackage.gfc.CACHE;
            if (r3 == r6) goto L_0x00bc;
        L_0x0050:
            r3 = r2.a;
            defpackage.akcr.b(r1, r5);
            r6 = defpackage.inu.NUMBER_OF_ASSETS;
            r6 = (defpackage.ily) r6;
            r6 = defpackage.gkr.c(r6, r1);
            r7 = r0.f();
            r7 = r7.g;
            r8 = -1;
            if (r7 == 0) goto L_0x006b;
        L_0x0067:
            r7 = r7.a;
            r10 = (long) r7;
            goto L_0x006c;
        L_0x006b:
            r10 = r8;
        L_0x006c:
            r3.b(r6, r10);
            r2 = r2.a;
            defpackage.akcr.b(r1, r5);
            r3 = defpackage.inu.TOTAL_ASSET_BYTES;
            r3 = (defpackage.ily) r3;
            r3 = defpackage.gkr.c(r3, r1);
            r6 = r0.f();
            r6 = r6.g;
            if (r6 == 0) goto L_0x0086;
        L_0x0084:
            r8 = r6.b;
        L_0x0086:
            r2.b(r3, r8);
            goto L_0x00bc;
        L_0x008a:
            r3 = r2.a;
            r6 = r2.b;
            defpackage.akcr.b(r1, r5);
            r7 = defpackage.inu.FAILED_REQUEST_COUNT;
            r7 = (defpackage.ily) r7;
            r6 = r6.a(r7, r1);
            r3.c(r6, 1);
            r3 = r0.e();
            defpackage.akcr.a(r3, r4);
            r3 = r3.a();
            r6 = -2;
            if (r3 != r6) goto L_0x00bc;
        L_0x00aa:
            r3 = r2.a;
            r2 = r2.b;
            defpackage.akcr.b(r1, r5);
            r6 = defpackage.inu.CANCELLED_REQUEST_COUNT;
            r6 = (defpackage.ily) r6;
            r2 = r2.a(r6, r1);
            r3.c(r2, 1);
        L_0x00bc:
            r2 = r0.a();
            r3 = 1;
            r6 = 0;
            if (r2 != 0) goto L_0x00d4;
        L_0x00c4:
            r2 = r0.e();
            defpackage.akcr.a(r2, r4);
            r2 = r2.a();
            r4 = -5;
            if (r2 != r4) goto L_0x00d4;
        L_0x00d2:
            r2 = 1;
            goto L_0x00d5;
        L_0x00d4:
            r2 = 0;
        L_0x00d5:
            if (r2 == 0) goto L_0x00ed;
        L_0x00d7:
            r0 = r12.a;
            r2 = r0.a;
            r0 = r0.b;
            defpackage.akcr.b(r1, r5);
            r3 = defpackage.inu.REJECTED_PREFETCH_COUNT;
            r3 = (defpackage.ily) r3;
            r0 = r0.a(r3, r1);
            r2.c(r0, 1);
            goto L_0x019e;
        L_0x00ed:
            r2 = defpackage.gkq.a(r1, r0);
            if (r2 == 0) goto L_0x0152;
        L_0x00f3:
            r2 = r12.a;
            r3 = r0.f();
            r3 = r3.h;
            if (r3 == 0) goto L_0x019e;
        L_0x00fd:
            r4 = r3.c;
            if (r4 == 0) goto L_0x012d;
        L_0x0101:
            r4 = r2.a;
            r6 = r2.b;
            defpackage.akcr.b(r1, r5);
            r7 = defpackage.inu.BOLT_WRAPPER_READ_LATENCY;
            r7 = (defpackage.ily) r7;
            r6 = r6.a(r7, r1);
            r7 = r3.a;
            r4.a(r6, r7);
            r4 = r2.a;
            r6 = r2.b;
            defpackage.akcr.b(r1, r5);
            r5 = defpackage.inu.BOLT_RESOLVE_LATENCY;
            r5 = (defpackage.ily) r5;
            r5 = r6.a(r5, r1);
            r6 = r3.b;
            r4.a(r5, r6);
        L_0x0129:
            r2.b(r1, r0);
            goto L_0x019e;
        L_0x012d:
            r0 = r3.d;
            r3 = -6;
            if (r0 != r3) goto L_0x0145;
        L_0x0132:
            r0 = r2.a;
            r2 = r2.b;
            defpackage.akcr.b(r1, r5);
            r3 = defpackage.inu.FAILED_BOLT_RESOLVE_COUNT;
        L_0x013b:
            r3 = (defpackage.ily) r3;
            r1 = r2.a(r3, r1);
        L_0x0141:
            r0.c(r1, 1);
            goto L_0x019e;
        L_0x0145:
            r3 = -7;
            if (r0 != r3) goto L_0x019e;
        L_0x0148:
            r0 = r2.a;
            r2 = r2.b;
            defpackage.akcr.b(r1, r5);
            r3 = defpackage.inu.BOLT_RESOLVE_TIMEOUT_COUNT;
            goto L_0x013b;
        L_0x0152:
            r2 = defpackage.gkq.a(r1, r0);
            if (r2 != 0) goto L_0x0164;
        L_0x0158:
            r2 = r0.f();
            r2 = r2.a;
            r4 = defpackage.gfc.NETWORK;
            if (r2 != r4) goto L_0x0164;
        L_0x0162:
            r2 = 1;
            goto L_0x0165;
        L_0x0164:
            r2 = 0;
        L_0x0165:
            if (r2 == 0) goto L_0x016a;
        L_0x0167:
            r2 = r12.a;
            goto L_0x0129;
        L_0x016a:
            r2 = r0.f();
            r2 = r2.a;
            r4 = defpackage.gfc.IMPORT;
            if (r2 != r4) goto L_0x0175;
        L_0x0174:
            goto L_0x0176;
        L_0x0175:
            r3 = 0;
        L_0x0176:
            if (r3 == 0) goto L_0x019e;
        L_0x0178:
            r2 = r12.a;
            r3 = r2.a;
            defpackage.akcr.b(r1, r5);
            r4 = defpackage.inu.TOTAL_IMPORT_REQUEST_COUNT;
            r4 = (defpackage.ily) r4;
            r4 = defpackage.gkr.b(r4, r1);
            r3.c(r4, 1);
            r0 = r0.a();
            if (r0 != 0) goto L_0x019e;
        L_0x0190:
            r0 = r2.a;
            defpackage.akcr.b(r1, r5);
            r2 = defpackage.inu.FAILED_IMPORT_REQUEST_COUNT;
            r2 = (defpackage.ily) r2;
            r1 = defpackage.gkr.b(r2, r1);
            goto L_0x0141;
        L_0x019e:
            r0 = defpackage.ajxw.a;
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gkq$d.invoke():java.lang.Object");
        }
    }

    /* renamed from: gkq$a */
    static final class a extends akcs implements akbk<ajxw> {
        private /* synthetic */ gkq a;
        private /* synthetic */ iff b;

        a(gkq gkq, iff iff) {
            this.a = gkq;
            this.b = iff;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ilv ilv = this.a.a;
            gkr gkr = this.a.b;
            geg geg = ((OnBoltRequestStart) this.b.a).a;
            akcr.b(geg, "contentRequest");
            ilv.c(gkr.a((ily) inu.TOTAL_BOLT_REQUEST_COUNT, geg), 1);
            return ajxw.a;
        }
    }

    public gkq(ilv ilv, gkr gkr) {
        akcr.b(ilv, "graphene");
        akcr.b(gkr, "contentManagerMetricsTracker");
        this.a = ilv;
        this.b = gkr;
    }

    static boolean a(geg geg, gej gej) {
        return geg.c() != null && geg.b() == null && gej.f().a == gfc.NETWORK;
    }

    public final void a(ifg ifg) {
        akcr.b(ifg, "eventBus");
        gkq gkq = this;
        ifh.a(ifg, OnRequestComplete.class, new e(gkq));
        ifh.a(ifg, OnCacheEnd.class, new f(gkq));
        ifh.a(ifg, OnBoltRequestStart.class, new g(gkq));
        ifh.a(ifg, OnNetworkRequestStart.class, new h(gkq));
    }

    /* Access modifiers changed, original: final */
    public final void b(geg geg, gej gej) {
        ilv ilv = this.a;
        gkr gkr = this.b;
        String str = "contentRequest";
        akcr.b(geg, str);
        ilz a = gkr.a((ily) inu.NETWORK_QUEUING_LATENCY, geg);
        gfj gfj = gej.f().d;
        long j = -1;
        ilv.a(a, gfj != null ? gfj.c : -1);
        if (gej.a()) {
            ilv = this.a;
            gkr = this.b;
            akcr.b(geg, str);
            a = gkr.a((ily) inu.NETWORK_LATENCY, geg);
            gfj = gej.f().d;
            ilv.a(a, gfj != null ? gfj.d : -1);
            ilv = this.a;
            gkr = this.b;
            akcr.b(geg, str);
            a = gkr.a((ily) inu.NETWORK_TOTAL_LATENCY, geg);
            gfj = gej.f().d;
            ilv.a(a, gfj != null ? gfj.b : -1);
            ilv = this.a;
            gkr = this.b;
            akcr.b(geg, str);
            a = gkr.a((ily) inu.NETWORK_PROCESS_LATENCY, geg);
            gfj = gej.f().d;
            ilv.a(a, gfj != null ? gfj.f : -1);
            ilv = this.a;
            gkr = this.b;
            akcr.b(geg, str);
            ilz a2 = gkr.a((ily) inu.NETWORK_RESPONSE_SIZE, geg);
            gfj gfj2 = gej.f().d;
            if (gfj2 != null) {
                j = (long) gfj2.e;
            }
            ilv.b(a2, j);
            return;
        }
        ilv ilv2 = this.a;
        gkr gkr2 = this.b;
        akcr.b(geg, str);
        ilv2.c(gkr2.a((ily) inu.FAILED_NETWORK_REQUEST_COUNT, geg), 1);
    }
}
