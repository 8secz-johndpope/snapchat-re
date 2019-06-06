package defpackage;

import com.brightcove.player.event.EventType;
import defpackage.zpq.c;
import defpackage.zri.aj;
import defpackage.zri.ak;
import defpackage.zri.al;
import defpackage.zsk.a;
import java.util.Iterator;

/* renamed from: zrh */
public final class zrh implements c {
    private final ajxe a;
    private final zri b;

    /* renamed from: zrh$d */
    static final class d extends akcs implements akbl<aenr, Boolean> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            aenr aenr = (aenr) obj;
            akcr.b(aenr, "it");
            return Boolean.valueOf(aenr.o != null);
        }
    }

    /* renamed from: zrh$a */
    static final class a extends akcq implements akbk<zre> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (zre) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: zrh$c */
    static final class c implements ajev {
        public static final c a = new c();

        c() {
        }

        public final void run() {
        }
    }

    /* renamed from: zrh$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: zrh$e */
    static final class e implements ajev {
        public static final e a = new e();

        e() {
        }

        public final void run() {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zrh.class), "configUpdater", "getConfigUpdater()Lcom/snap/unlockables/lib/config/UnlockablesConfigUpdater;");
    }

    public zrh(zri zri, ajwy<zre> ajwy) {
        akcr.b(zri, "unlockablesRepository");
        akcr.b(ajwy, "unlockablesConfigUpdater");
        this.b = zri;
        this.a = ajxh.a(new a(ajwy));
    }

    private static ajcx a(ajcx ajcx) {
        Object a = ajcx.a((ajfb) b.a).a(ajfu.g);
        akcr.a(a, "this\n            .doOnEr…      }.onErrorComplete()");
        return a;
    }

    private final zre a() {
        return (zre) this.a.b();
    }

    public final ajcx a(a aVar) {
        Object obj;
        akcr.b(aVar, "locIndependentNetData");
        Iterator it = akfh.a(ajyu.v(aVar.b), (akbl) d.a).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            Comparable comparable = ((aenr) next).o;
            while (it.hasNext()) {
                Object next2 = it.next();
                Comparable comparable2 = ((aenr) next2).o;
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            }
            obj = next;
        } else {
            obj = null;
        }
        aenr aenr = (aenr) obj;
        long a = aenr != null ? zsp.a(aenr, aVar.e) : -1;
        zri zri = this.b;
        akcr.b(aVar, EventType.RESPONSE);
        Object a2 = zri.c.a((ajdw) zri.c().b()).f(new aj(zri, aVar)).e((ajfc) new ak(zri)).a((ajfb) al.a);
        akcr.a(a2, "serializationHelperSingl…lockables failed: $it\") }");
        obj = a().a().b().a((fth) zpt.UNLOCK_LENS_EXPIRATION_TIMESTAMP_MILLIS, Long.valueOf(a)).c();
        akcr.a(obj, "preferences\n            …       .applyWithResult()");
        ajcx b = a2.b((ajdb) obj.a(ajfu.g)).b((ajev) c.a);
        akcr.a((Object) b, "unlockablesRepository.wr…lly.\" )\n                }");
        return zrh.a(b);
    }

    /* JADX WARNING: Missing block: B:11:0x0134, code skipped:
            if (r9 == null) goto L_0x0136;
     */
    public final defpackage.ajcx a(defpackage.zsu r9) {
        /*
        r8 = this;
        r0 = "netData";
        defpackage.akcr.b(r9, r0);
        r0 = 2;
        r0 = new defpackage.ajdb[r0];
        r1 = r8.b;
        r2 = "response";
        defpackage.akcr.b(r9, r2);
        r2 = r1.f;
        r3 = defpackage.zpt.UNLOCKABLES_PROCESS_GTQ_CHECKSUM_RESPONSE;
        r3 = (defpackage.fth) r3;
        r2 = r2.b(r3);
        r3 = new zri$aa;
        r3.<init>(r1, r9);
        r3 = (defpackage.ajfc) r3;
        r2 = r2.e(r3);
        r3 = defpackage.zri.ab.a;
        r3 = (defpackage.ajfb) r3;
        r2 = r2.a(r3);
        r3 = defpackage.ajfu.g;
        r2 = r2.a(r3);
        r3 = "configProvider.getBoolea…       .onErrorComplete()";
        defpackage.akcr.a(r2, r3);
        r3 = new zri$i;
        r4 = "UnlockablesRepository.GetAll";
        r3.<init>(r4);
        r3 = (java.util.concurrent.Callable) r3;
        r3 = defpackage.ajdp.b(r3);
        r5 = new zri$j;
        r5.<init>(r4, r1);
        r5 = (defpackage.ajfc) r5;
        r3 = r3.u(r5);
        r4 = "Observable.fromCallable …ame end\")\n        }\n    }";
        defpackage.akcr.a(r3, r4);
        r4 = 1;
        r3 = r3.c(r4);
        r4 = r1.c();
        r4 = r4.b();
        r4 = (defpackage.ajdw) r4;
        r3 = r3.a(r4);
        r4 = new zri$b;
        r4.<init>(r1, r9);
        r4 = (defpackage.ajfc) r4;
        r3 = r3.p(r4);
        r4 = new zri$c;
        r4.<init>(r1);
        r4 = (defpackage.ajfc) r4;
        r5 = 0;
        r3 = r3.a(r4, r5);
        r4 = defpackage.zri.d.a;
        r4 = (defpackage.ajfb) r4;
        r3 = r3.a(r4);
        r4 = defpackage.ajfu.g;
        r3 = r3.a(r4);
        r4 = "getAllUnlockables()\n    …       .onErrorComplete()";
        defpackage.akcr.a(r3, r4);
        r3 = (defpackage.ajdb) r3;
        r2 = r2.c(r3);
        r3 = new zri$ad;
        r3.<init>(r1, r9);
        r3 = (java.util.concurrent.Callable) r3;
        r3 = defpackage.ajdp.b(r3);
        r4 = new zri$ae;
        r4.<init>(r1);
        r4 = (defpackage.ajfc) r4;
        r1 = r3.a(r4, r5);
        r3 = defpackage.zri.af.a;
        r3 = (defpackage.ajfb) r3;
        r1 = r1.a(r3);
        r3 = defpackage.ajfu.g;
        r1 = r1.a(r3);
        r3 = "Observable.fromCallable …       .onErrorComplete()";
        defpackage.akcr.a(r1, r3);
        r1 = (defpackage.ajdb) r1;
        r1 = r2.c(r1);
        r2 = defpackage.ajfu.g;
        r1 = r1.a(r2);
        r2 = "updateAllExpirationTimes…       .onErrorComplete()";
        defpackage.akcr.a(r1, r2);
        r2 = defpackage.zrh.e.a;
        r2 = (defpackage.ajev) r2;
        r1 = r1.b(r2);
        r2 = "unlockablesRepository\n  …ssfully.\" )\n            }";
        defpackage.akcr.a(r1, r2);
        r1 = defpackage.zrh.a(r1);
        r1 = (defpackage.ajdb) r1;
        r0[r5] = r1;
        r9 = r9.d;
        r1 = 1;
        if (r9 == 0) goto L_0x0136;
    L_0x00ec:
        r2 = r9.a;
        if (r2 != 0) goto L_0x00f4;
    L_0x00f0:
        r2 = r9.b;
        if (r2 == 0) goto L_0x00f5;
    L_0x00f4:
        r5 = 1;
    L_0x00f5:
        if (r5 == 0) goto L_0x00f8;
    L_0x00f7:
        goto L_0x00f9;
    L_0x00f8:
        r9 = 0;
    L_0x00f9:
        if (r9 == 0) goto L_0x0136;
    L_0x00fb:
        r2 = r8.a();
        r3 = "opportunityRequestIds";
        defpackage.akcr.b(r9, r3);
        r3 = r2.a();
        r3 = r3.b();
        r4 = defpackage.zpt.OPPORTUNITY_ID;
        r4 = (defpackage.fth) r4;
        r5 = new ajwj;
        r9 = defpackage.afjw.a(r9);
        r2 = r2.b();
        r6 = r2.a();
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r5.<init>(r9, r6, r2);
        r9 = r3.b(r4, r5);
        r9 = r9.c();
        r2 = "preferences\n            …      ).applyWithResult()";
        defpackage.akcr.a(r9, r2);
        r9 = defpackage.zrh.a(r9);
        if (r9 != 0) goto L_0x0141;
    L_0x0136:
        r9 = defpackage.ajhn.a;
        r9 = defpackage.ajvo.a(r9);
        r2 = "Completable.complete()";
        defpackage.akcr.a(r9, r2);
    L_0x0141:
        r9 = (defpackage.ajdb) r9;
        r0[r1] = r9;
        r9 = defpackage.ajcx.c(r0);
        r0 = "Completable\n            …ig(netData)\n            )";
        defpackage.akcr.a(r9, r0);
        r9 = defpackage.zrh.a(r9);
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zrh.a(zsu):ajcx");
    }
}
