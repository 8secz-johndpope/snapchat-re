package defpackage;

import defpackage.actg.a;
import defpackage.actg.g;
import defpackage.actg.h;
import defpackage.yoj.c;
import java.util.List;
import java.util.Set;

/* renamed from: acsc */
public final class acsc implements acrx {
    boolean a;
    private ajej b;
    private Long c;
    private final acsw d;
    private final actg e;

    /* renamed from: acsc$c */
    static final class c<T> implements ajfb<actc> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: acsc$a */
    static final class a extends akcq implements akbl<actc, ajxw> {
        a(acsc acsc) {
            super(1, acsc);
        }

        public final String getName() {
            return "onOperaEvent";
        }

        public final akej getOwner() {
            return akde.a(acsc.class);
        }

        public final String getSignature() {
            return "onOperaEvent(Lcom/snapchat/map/feature/playback/opera/MapOperaEvent;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            actc actc = (actc) obj;
            akcr.b(actc, "p1");
            acsc acsc = (acsc) this.receiver;
            if (actc == actc.LAUNCHED) {
                z = true;
            } else {
                if (actc == actc.CLOSED) {
                    z = false;
                }
                return ajxw.a;
            }
            acsc.a = z;
            return ajxw.a;
        }
    }

    /* renamed from: acsc$b */
    static final class b extends akcq implements akbk<ajxw> {
        b(acsc acsc) {
            super(0, acsc);
        }

        public final String getName() {
            return "resetState";
        }

        public final akej getOwner() {
            return akde.a(acsc.class);
        }

        public final String getSignature() {
            return "resetState()V";
        }

        public final /* synthetic */ Object invoke() {
            ((acsc) this.receiver).b();
            return ajxw.a;
        }
    }

    /* renamed from: acsc$d */
    static final class d extends akcq implements akbl<Throwable, ajxw> {
        d(acsw acsw) {
            super(1, acsw);
        }

        public final String getName() {
            return "onLaunchError";
        }

        public final akej getOwner() {
            return akde.a(acsw.class);
        }

        public final String getSignature() {
            return "onLaunchError(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            ((acsw) this.receiver).a(th);
            return ajxw.a;
        }
    }

    public acsc(acsw acsw, actg actg) {
        akcr.b(acsw, "mapPlaybackUtils");
        akcr.b(actg, "launcher");
        this.d = acsw;
        this.e = actg;
    }

    public final void a(a aVar, long j) {
        a aVar2 = aVar;
        String str = "config";
        akcr.b(aVar2, str);
        Long l = this.c;
        if (l == null || l.longValue() != j) {
            this.c = Long.valueOf(j);
            actg actg = this.e;
            c cVar = new c(j, null, null, 14);
            cVar.a = true;
            List a = ajyl.a(cVar);
            akcr.b(aVar2, str);
            akcr.b(a, "operaPlaylistGroups");
            long b = actg.a().b();
            long c = actg.a().c();
            slg slg = new slg(actg.g, new slh());
            slg.a(sqx.CIRCLE);
            ssi[] ssiArr = new ssi[2];
            ssiArr[0] = ((yhl) actg.l.get()).a(((ihh) actg.f.b()).a(), aahb.NYC, (fvk) actg.d.b());
            Object a2 = actg.a();
            akcr.a(a2, "playbackPerformanceAnalytics");
            ssi[] ssiArr2 = ssiArr;
            ssiArr2[1] = new sks(a2, aaug.TAP, b, c, new acsm(aajz.USER_STORY));
            ssi.a aVar3 = new ssi.a(ssiArr2);
            ajei ajei = new ajei();
            Set b2 = ajzt.b(new actf(aVar2.a, actg.j, actg.k), new actl(new actd()), new gzc(actg.i));
            ynp ynp = (ynp) actg.e.b();
            a2 = szw.a(kla.a.a, ajzl.a(ajxs.a("dummy_story_id", aVar2.b)));
            akcr.a(a2, "Params.of(\n             …TORY_ID to friendUserID))");
            b2.addAll(ynp.a(a2));
            sti.a aVar4 = new sti.a(b2, slg, actg.a, (jwa) actg.b.b(), (jwc) actg.c.b(), adcw.a());
            aVar4.e = true;
            aVar4.c = aVar2.c;
            aVar4.b = new skv(actg.g, adcw.a(), aVar4.t, aVar4.u);
            aVar4.h = 60000;
            aVar4.i = true;
            aVar4.p = aahb.NYC;
            Object a3 = ((sso) actg.h.get()).a(a, aVar4.a(), 0, (ssi) aVar3, new stl()).a((ajdt) ajdp.a((ajdr) r5)).d((ajfb) g.a).a((ajev) new h(ajei));
            akcr.a(a3, "operaLauncher.get().laun…spose()\n                }");
            acsc acsc = this;
            this.b = a3.d((ajfb) new acse(new a(acsc))).a((ajev) new acsd(new b(acsc))).a((ajfb) c.a, (ajfb) new acse(new d(this.d)));
        }
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean a(Long l) {
        boolean z = false;
        if (this.a || akcr.a((Object) l, this.c)) {
            return false;
        }
        ajej ajej = this.b;
        if (!(ajej == null || ajej.isDisposed())) {
            z = true;
        }
        b();
        return z;
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        ajej ajej = this.b;
        if (ajej != null) {
            ajej.dispose();
        }
        this.b = null;
        this.c = null;
        this.a = false;
    }
}
