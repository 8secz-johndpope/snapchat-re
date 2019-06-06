package defpackage;

import com.google.common.base.Supplier;
import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.iib.a;
import defpackage.miw.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: kqv */
public final class kqv implements kqu {
    final cko a;
    private kqy b;
    private final Supplier<ckx> c;
    private final miw d;
    private final Supplier<iib> e;
    private final ajei f;
    private final ajdw g;

    /* renamed from: kqv$b */
    static final class b extends akcs implements akbl<ajxr<? extends kra, ? extends String, ? extends a>, ajxw> {
        private /* synthetic */ kqv a;

        b(kqv kqv) {
            this.a = kqv;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ajxr ajxr = (ajxr) obj;
            kra kra = (kra) ajxr.a;
            Object obj2 = kra.b.c;
            if (obj2 == null) {
                obj2 = (String) ajxr.b;
            }
            aflk aflk = kra.a;
            afji afji = aflk.g.k;
            obj = ajxr.c;
            akcr.a(obj, "it.third");
            a aVar = (a) obj;
            akcr.b(aVar, "receiver$0");
            afmf afmf = new afmf();
            afmh afmh = new afmh();
            afmh.a = Integer.valueOf(aVar.h);
            afmh.b = Integer.valueOf(aVar.g);
            afmf.a = afmh;
            afji.e = afmf;
            cko cko = this.a.a;
            akcr.a(obj2, "adTrackUrl");
            cko.a(obj2, aflk);
            return ajxw.a;
        }
    }

    /* renamed from: kqv$c */
    static final class c extends akcs implements akbl<Throwable, ajxw> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: kqv$a */
    static final class a extends akcq implements akbk<kra> {
        a(kqy kqy) {
            super(0, kqy);
        }

        public final String getName() {
            return "createTrackRequest";
        }

        public final akej getOwner() {
            return akde.a(kqy.class);
        }

        public final String getSignature() {
            return "createTrackRequest()Lcom/snap/lenses/analytics/adtrack/tracker/ResolvedTrackRequest;";
        }

        public final /* synthetic */ Object invoke() {
            kqy kqy = (kqy) this.receiver;
            afji a = kqy.a();
            afjf afjf = new afjf();
            afjf.a = aflo.LENS_CAROUSEL.a();
            afjf.k = a;
            Collection arrayList = new ArrayList();
            for (Object next : kqy.d.values()) {
                if ((((krb) next).e != null ? 1 : null) != null) {
                    arrayList.add(next);
                }
            }
            Collection arrayList2 = new ArrayList();
            for (krb krb : (List) arrayList) {
                mtx mtx = krb.e;
                if (mtx != null) {
                    arrayList2.add(mtx);
                }
            }
            kqz a2 = defpackage.kqz.a.a((List) arrayList2);
            aflk aflk = new aflk();
            aflk.g = afjf;
            aflk.a = a2.a;
            aflk.d = a2.b;
            aflk.p = Long.valueOf(System.currentTimeMillis());
            return new kra(aflk, a2);
        }
    }

    public kqv(cko cko, Supplier<ckx> supplier, miw miw, Supplier<iib> supplier2, ajei ajei, ajdw ajdw) {
        akcr.b(cko, "adTrackerApi");
        akcr.b(supplier, "swipeToLensSource");
        akcr.b(miw, "configurationRepository");
        akcr.b(supplier2, "screenParameterProvider");
        akcr.b(ajei, "disposableContainer");
        akcr.b(ajdw, "io");
        this.a = cko;
        this.c = supplier;
        this.d = miw;
        this.e = supplier2;
        this.f = ajei;
        this.g = ajdw;
    }

    public final void a(String str) {
        String str2 = DiscoverStorySnapModel.LENSID;
        akcr.b(str, str2);
        kqy kqy = this.b;
        if (kqy != null) {
            akcr.b(str, str2);
            krb krb = (krb) kqy.d.get(str);
            if (krb != null) {
                krb.h = true;
                krb.i = true;
            }
        }
    }

    public final void a(kqn kqn) {
        kqy kqy = this.b;
        if (kqy != null) {
            kqy.e = kqn;
            if (kqy.e != null) {
                krb krb = kqy.b;
                if (krb != null) {
                    krb.q = kqy.e;
                }
            }
            if (kqn.q) {
                ((ckx) this.c.get()).a(kqy.a());
            } else if (kqy.d.isEmpty()) {
                this.b = null;
                return;
            } else {
                Object c = ajdx.c((Callable) new kqw(new a(kqy)));
                akcr.a(c, "fromCallable(session::createTrackRequest)");
                ajeb ajeb = (ajeb) c;
                Object e = this.d.a(b.a.a).f(mja.THIRD_PARTY_AD_TRACK_V2_URL).e();
                akcr.a(e, "configurationRepository.…CK_V2_URL).firstOrError()");
                ajeb ajeb2 = (ajeb) e;
                Object b = ((iib) this.e.get()).b();
                akcr.a(b, "screenParameterProvider.…observeScreenParameters()");
                ajeb ajeb3 = (ajeb) b;
                akcr.b(ajeb, "s1");
                akcr.b(ajeb2, "s2");
                akcr.b(ajeb3, "s3");
                c = ajdx.a(ajeb, ajeb2, ajeb3, (ajfd) ajwc.b.a);
                akcr.a(c, "Single.zip(s1, s2, s3, F…t3 -> Triple(t1,t2,t3) })");
                c = c.b(this.g).a(this.g);
                akcr.a(c, "zip(fromCallable(session…           .observeOn(io)");
                kry.a(c, new b(this), c.a, this.f);
            }
            this.b = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Missing block: B:32:0x00d2, code skipped:
            if (r0 == null) goto L_0x00d4;
     */
    public final void a(defpackage.kst r13) {
        /*
        r12 = this;
        r0 = "lensReport";
        defpackage.akcr.b(r13, r0);
        r1 = r13.a;
        r1 = r1.a;
        r1 = r1.a;
        r2 = "empty";
        r1 = defpackage.akcr.a(r1, r2);
        if (r1 == 0) goto L_0x0014;
    L_0x0013:
        return;
    L_0x0014:
        r1 = r12.b;
        if (r1 != 0) goto L_0x001f;
    L_0x0018:
        r1 = new kqy;
        r2 = r13.f;
        r1.<init>(r2);
    L_0x001f:
        defpackage.akcr.b(r13, r0);
        r2 = r13.a;
        r2 = r2.a;
        r2 = r2.a;
        r3 = "original";
        r2 = defpackage.akcr.a(r2, r3);
        r3 = 0;
        r4 = 1;
        if (r2 == 0) goto L_0x0034;
    L_0x0032:
        r2 = 1;
        goto L_0x0042;
    L_0x0034:
        r2 = r13.a;
        r2 = r2.s;
        r2 = r2.a;
        if (r2 == 0) goto L_0x0041;
    L_0x003c:
        r2 = r2.c;
        if (r2 != r4) goto L_0x0041;
    L_0x0040:
        goto L_0x0032;
    L_0x0041:
        r2 = 0;
    L_0x0042:
        if (r2 != 0) goto L_0x015f;
    L_0x0044:
        r5 = r13.c;
        r1.a = r5;
        r2 = r13.a;
        r2 = r2.a;
        r2 = r2.a;
        r5 = r1.d;
        r5 = r5.get(r2);
        r5 = (defpackage.krb) r5;
        if (r5 != 0) goto L_0x0120;
    L_0x0058:
        defpackage.akcr.b(r13, r0);
        r5 = new krb;
        r0 = r13.a;
        r0 = r0.a;
        r0 = r0.a;
        r5.<init>(r0);
        r6 = r13.d;
        r5.k = r6;
        r5.j = r3;
        r0 = r5.f;
        r6 = r13.g;
        r6 = java.lang.Long.valueOf(r6);
        r0.add(r6);
        r0 = r13.a();
        r5.h = r0;
        r0 = r13.a();
        r0 = r0 ^ r4;
        r5.i = r0;
        r6 = r13.b;
        r5.d = r6;
        r0 = r13.a;
        r0 = r0.s;
        r0 = r0.a;
        r5.e = r0;
        r0 = r13.a;
        r0 = r0.s;
        r0 = r0.b;
        r5.l = r0;
        r0 = r13.u;
        r5.m = r0;
        r6 = r13.i;
        r5.g = r6;
        r0 = r13.v;
        r5.p = r0;
        r0 = r13.w;
        r5.o = r0;
        r0 = r13.e;
        if (r0 == 0) goto L_0x00d4;
    L_0x00ac:
        r6 = "receiver$0";
        defpackage.akcr.b(r0, r6);
        r6 = defpackage.krd.a;
        r0 = r0.ordinal();
        r0 = r6[r0];
        if (r0 == r4) goto L_0x00d0;
    L_0x00bb:
        r6 = 2;
        if (r0 == r6) goto L_0x00cd;
    L_0x00be:
        r6 = 3;
        if (r0 == r6) goto L_0x00ca;
    L_0x00c1:
        r6 = 4;
        if (r0 == r6) goto L_0x00c7;
    L_0x00c4:
        r0 = defpackage.afjk.a.NO_ATTACHMENT;
        goto L_0x00d2;
    L_0x00c7:
        r0 = defpackage.afjk.a.DEEP_LINK;
        goto L_0x00d2;
    L_0x00ca:
        r0 = defpackage.afjk.a.APP_INSTALL;
        goto L_0x00d2;
    L_0x00cd:
        r0 = defpackage.afjk.a.LONGFORM_VIDEO;
        goto L_0x00d2;
    L_0x00d0:
        r0 = defpackage.afjk.a.REMOTE_WEBVIEW;
    L_0x00d2:
        if (r0 != 0) goto L_0x00d6;
    L_0x00d4:
        r0 = r5.n;
    L_0x00d6:
        r6 = "<set-?>";
        defpackage.akcr.b(r0, r6);
        r5.n = r0;
        r0 = r13.a;
        r0 = r0.a();
        if (r0 == 0) goto L_0x00f7;
    L_0x00e5:
        r0 = r13.a;
        r0 = r0.k;
        r0 = r0.a();
        r6 = "UNLOCKED";
        r0 = defpackage.akcr.a(r0, r6);
        if (r0 == 0) goto L_0x00f7;
    L_0x00f5:
        r0 = 1;
        goto L_0x00f8;
    L_0x00f7:
        r0 = 0;
    L_0x00f8:
        r5.r = r0;
        r0 = r13.A;
        if (r0 == 0) goto L_0x0111;
    L_0x00fe:
        r0 = (java.lang.Number) r0;
        r7 = r0.longValue();
        r0 = new kqx;
        r9 = r13.B;
        r10 = r13.C;
        r11 = r13.D;
        r6 = r0;
        r6.<init>(r7, r9, r10, r11);
        goto L_0x0112;
    L_0x0111:
        r0 = 0;
    L_0x0112:
        r5.s = r0;
        r0 = r13.q;
        r5.t = r0;
        r0 = r13.y;
        r5.v = r0;
        r0 = r13.r;
        r5.u = r0;
    L_0x0120:
        r0 = r5.h;
        if (r0 != 0) goto L_0x012d;
    L_0x0124:
        r0 = r13.a();
        if (r0 == 0) goto L_0x012b;
    L_0x012a:
        goto L_0x012d;
    L_0x012b:
        r0 = 0;
        goto L_0x012e;
    L_0x012d:
        r0 = 1;
    L_0x012e:
        r5.h = r0;
        r0 = r5.i;
        if (r0 != 0) goto L_0x013a;
    L_0x0134:
        r0 = r13.a();
        if (r0 != 0) goto L_0x013b;
    L_0x013a:
        r3 = 1;
    L_0x013b:
        r5.i = r3;
        r3 = r5.b;
        r6 = 1;
        r3 = r3 + r6;
        r5.b = r3;
        r3 = r1.c;
        r3 = r3 + r6;
        r1.c = r3;
        r3 = r1.c;
        r5.c = r3;
        r0 = r5.f;
        r3 = r13.g;
        r13 = java.lang.Long.valueOf(r3);
        r0.add(r13);
        r13 = r1.d;
        r13.put(r2, r5);
        r1.b = r5;
    L_0x015f:
        r12.b = r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqv.a(kst):void");
    }
}
