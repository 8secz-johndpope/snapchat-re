package defpackage;

import android.text.TextUtils;
import com.google.common.base.Optional;
import defpackage.wtn.b;
import defpackage.wtn.c;
import defpackage.wtn.d;
import defpackage.wtn.e;
import defpackage.wtn.f;
import defpackage.zfw.a;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: wta */
public final class wta {
    int a = 1;
    wsx b;
    String c;
    final ajei d = new ajei();
    final ajwy<wsz> e;
    final ajwy<wti> f;
    final ajwy<wtq> g;
    final ajwy<wtc> h;
    final ajwy<wqp> i;
    final ajwy<abss> j;
    private final ajxe k;
    private final ajxe l = ajxh.a(new g(this));

    /* renamed from: wta$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: wta$h */
    static final class h extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        h(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(wqv.g, "Shake2ReportSyncManager");
        }
    }

    /* renamed from: wta$g */
    static final class g extends akcs implements akbk<ajdw> {
        private /* synthetic */ wta a;

        g(wta wta) {
            this.a = wta;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return a.a((ajdw) this.a.a().b(), 1);
        }
    }

    /* renamed from: wta$j */
    static final class j implements Runnable {
        private /* synthetic */ wta a;

        j(wta wta) {
            this.a = wta;
        }

        public final void run() {
            if (this.a.a == 1 || this.a.a == 5) {
                this.a.a(2, 0);
            }
        }
    }

    /* renamed from: wta$b */
    public enum b {
        ;

        static {
            a = new int[]{1, 2, 3, 4, 5};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    /* renamed from: wta$k */
    static final class k implements Runnable {
        private /* synthetic */ wta a;
        private /* synthetic */ int b;

        k(wta wta, int i) {
            this.a = wta;
            this.b = i;
        }

        public final void run() {
            wta wta = this.a;
            int i = this.b;
            wta.a = i;
            i = wtb.a[i - 1];
            Object obj;
            ajej g;
            if (i != 1) {
                wsx wsx = null;
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            wta.b = null;
                            wta.c = null;
                        }
                        return;
                    }
                    wta.a(2, 0);
                    return;
                } else if (wta.b == null) {
                    obj = wta.j.get();
                    akcr.a(obj, "releaseManager.get()");
                    if (((abss) obj).k()) {
                        throw new IllegalStateException("Upload Ticket With Null Ticket Reference");
                    }
                    wta.a(5, 0);
                    return;
                } else {
                    wsx wsx2 = wta.b;
                    if (wsx2 != null) {
                        wsx = wsx2.b();
                    }
                    wsx wsx3;
                    if (wsx == ailz.CRASH) {
                        wsz wsz = (wsz) wta.e.get();
                        wsx3 = wta.b;
                        if (wsx3 == null) {
                            akcr.a();
                        }
                        g = wsz.a(wsx3.a(), wsy.DONE).b((ajdw) wta.a().b()).g(new l(wta));
                        akcr.a((Object) g, "shakeTicketRepository.ge…HECKING_PENDING_TICKET) }");
                        ajvv.a(g, wta.d);
                        return;
                    }
                    wsx2 = wta.b;
                    if (wsx2 == null) {
                        akcr.a();
                    }
                    if (TextUtils.equals(wsx2.a(), wta.c)) {
                        i = 0;
                    } else {
                        wtc wtc = (wtc) wta.h.get();
                        wsx3 = wta.b;
                        if (wsx3 == null) {
                            akcr.a();
                        }
                        i = wtc.a(wsx3.a());
                    }
                    if (i == 0) {
                        wti wti = (wti) wta.f.get();
                        wsx3 = wta.b;
                        if (wsx3 == null) {
                            akcr.a();
                        }
                        akcr.b(wsx3, "reportTicket");
                        wtn wtn = (wtn) wti.b.get();
                        akcr.b(wsx3, "shakeTicket");
                        Object a = ajdx.c((Callable) new b(wtn, wsx3)).a((ajfc) new c(wtn, wsx3));
                        akcr.a(a, "Single.fromCallable { ne…cket.isAnonymousTicket) }");
                        Object a2 = wsx3.a();
                        akcr.a(a2, "shakeTicket.id");
                        wtc wtc2 = wtn.d;
                        rzx rzx = wtn.e;
                        String str = "receiver$0";
                        akcr.b(a, str);
                        akcr.b(a2, "reportId");
                        akcr.b(wtc2, "throttleController");
                        String str2 = "noNetworkDetector";
                        akcr.b(rzx, str2);
                        akcr.b(a, str);
                        akcr.b(rzx, str2);
                        a = a.f(new wtl.a(rzx));
                        akcr.a(a, "map {\n        if (it.isS…de, ShakeStep.SEND)\n    }");
                        a = a.f(new wtl.b(wtc2, a2));
                        akcr.a(a, "map {\n        if (it.bac…      return@map it\n    }");
                        Object d = a.f(new d(wtn, wsx3)).c((ajfb) e.a).d((ajfb) f.a);
                        akcr.a(d, "Single.fromCallable { ne…r $it\")\n                }");
                        obj = d.a((ajfc) new wti.a(wti, wsx3)).g(wti.b.a);
                        akcr.a(obj, "uploadAirRequestNetworkC…      }\n                }");
                        g = obj.b((ajdw) wta.a().b()).e((ajfc) new m(wta)).g(new n(wta));
                        akcr.a((Object) g, "reportTicketUploader.get…HECKING_PENDING_TICKET) }");
                        ajvv.a(g, wta.d);
                        return;
                    }
                    wsx3 = wta.b;
                    if (wsx3 == null) {
                        akcr.a();
                    }
                    wta.c = wsx3.a();
                    wta.a(4, (long) i);
                    return;
                }
            }
            obj = wta.e.get();
            akcr.a(obj, "shakeTicketRepository.get()");
            g = ((wsz) obj).a().b((ajdw) wta.a().i()).g(c.a).b((ajew) new d(wta));
            akcr.a((Object) g, "shakeTicketRepository.ge…      }\n                }");
            ajvv.a(g, wta.d);
        }
    }

    /* renamed from: wta$c */
    static final class c<T, R> implements ajfc<Throwable, Optional<wsx>> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return Optional.absent();
        }
    }

    /* renamed from: wta$d */
    static final class d<T1, T2> implements ajew<Optional<wsx>, Throwable> {
        private /* synthetic */ wta a;

        d(wta wta) {
            this.a = wta;
        }

        public final /* synthetic */ void accept(Object obj, Object obj2) {
            wta wta;
            int i;
            obj = (Optional) obj;
            akcr.a(obj, "shakeTicketOptional");
            if (obj.isPresent()) {
                this.a.b = (wsx) obj.get();
                wta = this.a;
                i = 3;
            } else {
                wta = this.a;
                i = 5;
            }
            wta.a(i, 0);
        }
    }

    /* renamed from: wta$e */
    public static final class e implements Runnable {
        private /* synthetic */ wta a;

        public e(wta wta) {
            this.a = wta;
        }

        public final void run() {
            this.a.d.a();
            wta wta = this.a;
            wta.a = 1;
            wta.b = null;
            wta.c = null;
        }
    }

    /* renamed from: wta$f */
    static final class f implements ajev {
        private /* synthetic */ wta a;
        private /* synthetic */ wtf b;

        f(wta wta, wtf wtf) {
            this.a = wta;
            this.b = wtf;
        }

        public final void run() {
            wqp wqp = (wqp) this.a.i.get();
            wsx wsx = this.a.b;
            if (wsx == null) {
                akcr.a();
            }
            String a = wsx.a();
            wsx wsx2 = this.a.b;
            if (wsx2 == null) {
                akcr.a();
            }
            wqp.a(a, wsx2.c(), this.b.b, this.b.c);
        }
    }

    /* renamed from: wta$i */
    static final class i implements ajev {
        public static final i a = new i();

        i() {
        }

        public final void run() {
            ieg.a("Failed to create Jira ticket, please shake again", true, 0);
        }
    }

    /* renamed from: wta$l */
    static final class l implements ajev {
        private /* synthetic */ wta a;

        l(wta wta) {
            this.a = wta;
        }

        public final void run() {
            this.a.a(2, 0);
        }
    }

    /* renamed from: wta$m */
    static final class m<T, R> implements ajfc<wtg, ajdb> {
        private /* synthetic */ wta a;

        m(wta wta) {
            this.a = wta;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            wtg wtg = (wtg) obj;
            akcr.b(wtg, "uploadResult");
            wta wta = this.a;
            if (wta.b != null) {
                ajcx a;
                if (wtg instanceof wth) {
                    wsz wsz = (wsz) wta.e.get();
                    wsx wsx = wta.b;
                    if (wsx == null) {
                        akcr.a();
                    }
                    a = wsz.a(wsx.a(), wsy.DONE);
                    wtq wtq = (wtq) wta.g.get();
                    wsx wsx2 = wta.b;
                    if (wsx2 == null) {
                        akcr.a();
                    }
                    obj = a.b((ajdb) wtq.e(wsx2.a()));
                    str = "shakeTicketRepository.ge…able(currentTicket!!.id))";
                } else if (wtg != null) {
                    wtf wtf = (wtf) wtg;
                    wtc wtc = (wtc) wta.h.get();
                    wsx wsx3 = wta.b;
                    if (wsx3 == null) {
                        akcr.a();
                    }
                    if (wtc.a(wsx3.a(), wtf.a)) {
                        wsz wsz2 = (wsz) wta.e.get();
                        wsx3 = wta.b;
                        if (wsx3 == null) {
                            akcr.a();
                        }
                        ajcx a2 = wsz2.a(wsx3.a(), wsy.ERROR);
                        wtq wtq2 = (wtq) wta.g.get();
                        wsx wsx4 = wta.b;
                        if (wsx4 == null) {
                            akcr.a();
                        }
                        a2 = a2.b((ajdb) wtq2.e(wsx4.a()));
                        obj = ajcx.a((ajev) new f(wta, wtf));
                        akcr.a(obj, "Completable.fromAction {…ploadFailure.shakeStep) }");
                        a = a2.b((ajdb) obj);
                        Object a3 = ajcx.a((ajev) i.a);
                        akcr.a(a3, "Completable.fromAction {…e shake again\")\n        }");
                        obj = a.b((ajdb) a3);
                        str = "shakeTicketRepository.ge…wErrorToastIfNecessary())";
                    }
                } else {
                    throw new ajxt("null cannot be cast to non-null type com.snap.shake2report.data.upload.ReportTicketUploadFailure");
                }
                akcr.a(obj, str);
                return obj;
            }
            obj = ajvo.a(ajhn.a);
            str = "Completable.complete()";
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: wta$n */
    static final class n implements ajev {
        private /* synthetic */ wta a;

        n(wta wta) {
            this.a = wta;
        }

        public final void run() {
            this.a.a(2, 0);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(wta.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(wta.class), "schedulerForSync", "getSchedulerForSync()Lio/reactivex/Scheduler;")};
        a aVar = new a();
    }

    public wta(zgb zgb, ajwy<wsz> ajwy, ajwy<wti> ajwy2, ajwy<wtq> ajwy3, ajwy<wtc> ajwy4, ajwy<wqp> ajwy5, ajwy<abss> ajwy6) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy, "shakeTicketRepository");
        akcr.b(ajwy2, "reportTicketUploader");
        akcr.b(ajwy3, "fileManager");
        akcr.b(ajwy4, "throttleController");
        akcr.b(ajwy5, "blizzardAnalyticsHelper");
        akcr.b(ajwy6, "releaseManager");
        this.e = ajwy;
        this.f = ajwy2;
        this.g = ajwy3;
        this.h = ajwy4;
        this.i = ajwy5;
        this.j = ajwy6;
        this.k = ajxh.a(new h(zgb));
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.k.b();
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(int i, long j) {
        ajej a = b().a(new k(this, i), j, TimeUnit.MILLISECONDS);
        akcr.a((Object) a, "schedulerForSync.schedul…   TimeUnit.MILLISECONDS)");
        ajvv.a(a, this.d);
    }

    public final ajdw b() {
        return (ajdw) this.l.b();
    }

    public final void c() {
        a().j().a((Runnable) new j(this));
    }
}
