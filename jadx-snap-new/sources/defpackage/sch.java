package defpackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Queues;
import defpackage.sdl.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* renamed from: sch */
public class sch {
    final ajxe a;
    final Queue<sdr> b;
    public final ajxe c;
    final ajxe d;
    sdr e;
    ajej f;
    shy g;
    public final ajwy<scj> h;
    private final ajxe i;
    private final ajxe j;
    private final ajxe k;
    private final ajwy<sia> l;

    /* renamed from: sch$b */
    public static final class b extends akcq implements akbl<sdl, ajxw> {
        public b(sch sch) {
            super(1, sch);
        }

        public final String getName() {
            return "onPolicyChanged";
        }

        public final akej getOwner() {
            return akde.a(sch.class);
        }

        public final String getSignature() {
            return "onPolicyChanged(Lcom/snap/notification/api/InAppNotificationPolicy;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            sdl sdl = (sdl) obj;
            akcr.b(sdl, "p1");
            sch sch = (sch) this.receiver;
            Iterator it = sch.b.iterator();
            while (it.hasNext()) {
                Object obj2 = (sdr) it.next();
                if (sdl.evaluateNotification(obj2) == a.DROP) {
                    it.remove();
                    sgt b = sch.b();
                    akcr.a(obj2, "notification");
                    b.a(obj2);
                    sch.a().a(obj2);
                }
            }
            sch.a(sdl);
            return ajxw.a;
        }
    }

    /* renamed from: sch$c */
    public static final class c extends akcq implements akbl<akbl<? super sdr, ? extends Boolean>, ajxw> {
        public c(sch sch) {
            super(1, sch);
        }

        public final String getName() {
            return "clearNotificationsIf";
        }

        public final akej getOwner() {
            return akde.a(sch.class);
        }

        public final String getSignature() {
            return "clearNotificationsIf(Lkotlin/jvm/functions/Function1;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akbl akbl = (akbl) obj;
            akcr.b(akbl, "p1");
            sch sch = (sch) this.receiver;
            ajyr.a((Iterable) sch.b, akbl);
            sdr sdr = sch.e;
            if (sdr != null) {
                if (!((Boolean) akbl.invoke(sdr)).booleanValue()) {
                    sdr = null;
                }
                if (sdr != null) {
                    shy shy = sch.g;
                    if (shy != null) {
                        shy.a(true);
                    }
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: sch$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sch$e */
    static final class e extends akcs implements akbk<ajwo<sdr>> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((scv) this.a.get()).a;
        }
    }

    /* renamed from: sch$l */
    static final class l extends akcs implements akbk<ajwo<sdr>> {
        private /* synthetic */ ajwy a;

        l(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((scv) this.a.get()).c;
        }
    }

    /* renamed from: sch$j */
    static final class j extends akcs implements akbk<ajwo<sdr>> {
        private /* synthetic */ ajwy a;

        j(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((scv) this.a.get()).d;
        }
    }

    /* renamed from: sch$f */
    static final class f extends akcs implements akbk<ajdp<akbl<? super sdr, ? extends Boolean>>> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((scw) this.a.get()).a;
        }
    }

    /* renamed from: sch$k */
    static final class k extends akcs implements akbk<sgt> {
        private /* synthetic */ ajwy a;

        k(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (sgt) this.a.get();
        }
    }

    /* renamed from: sch$g */
    static final class g extends akcs implements akbk<sgv> {
        private /* synthetic */ ajwy a;

        g(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (sgv) this.a.get();
        }
    }

    /* renamed from: sch$d */
    static final class d<T> implements Predicate<T> {
        private /* synthetic */ sch a;
        private /* synthetic */ String b;

        d(sch sch, String str) {
            this.a = sch;
            this.b = str;
        }

        public final /* synthetic */ boolean apply(Object obj) {
            sdr sdr = (sdr) obj;
            if (sdr == null) {
                akcr.a();
            }
            return akcr.a(sdr.c, this.b);
        }
    }

    /* renamed from: sch$i */
    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: sch$h */
    static final class h extends akcq implements akbl<shs, ajxw> {
        h(sch sch) {
            super(1, sch);
        }

        public final String getName() {
            return "onNotificationDismissed";
        }

        public final akej getOwner() {
            return akde.a(sch.class);
        }

        public final String getSignature() {
            return "onNotificationDismissed(Lcom/snap/notification/ui/DismissedNotification;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            shs shs = (shs) obj;
            akcr.b(shs, "p1");
            sch sch = (sch) this.receiver;
            akcr.b(shs, "dismissedNotification");
            if (shs.b == shr.USER_SWIPE) {
                ((ajwo) sch.a.b()).a(shs.a);
            }
            if (shs.b == shr.USER_SWIPE || shs.b == shr.USER_CLICK) {
                sgv sgv = (sgv) sch.d.b();
                sdr sdr = shs.a;
                akcr.b(sdr, "notification");
                aazh aazh = new aazh();
                aazh.b(sdr.b.name());
                aazh.a(sdr.a);
                ((dis) sgv.a.b()).a(aazh);
            }
            sch.a().a(shs.a);
            ajej ajej = sch.f;
            if (ajej != null) {
                ajej.dispose();
            }
            sch.f = null;
            sch.e = null;
            sch.g = null;
            sch.a(((scj) sch.h.get()).a());
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(sch.class), "displayedInAppNotificationsSubject", "getDisplayedInAppNotificationsSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(sch.class), "swipeDismissedNotificationsSubject", "getSwipeDismissedNotificationsSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(sch.class), "removedNotificationsSubject", "getRemovedNotificationsSubject()Lio/reactivex/subjects/PublishSubject;"), new akdc(akde.a(sch.class), "notificationRemovalRequests", "getNotificationRemovalRequests()Lio/reactivex/Observable;"), new akdc(akde.a(sch.class), "reporter", "getReporter()Lcom/snap/notification/reporting/NotificationDroppedReporter;"), new akdc(akde.a(sch.class), "openReporter", "getOpenReporter()Lcom/snap/notification/reporting/NotificationOpenedReporter;")};
        a aVar = new a();
    }

    public sch(ajwy<sia> ajwy, ajwy<scj> ajwy2, ajwy<scv> ajwy3, ajwy<scw> ajwy4, ajwy<sgt> ajwy5, ajwy<sgv> ajwy6) {
        akcr.b(ajwy, "presenter");
        akcr.b(ajwy2, "inAppNotificationPolicyManager");
        akcr.b(ajwy3, "notificationObserverLazy");
        akcr.b(ajwy4, "notificationRemoverProvider");
        akcr.b(ajwy5, "reporterProvider");
        akcr.b(ajwy6, "openReporterProvider");
        this.l = ajwy;
        this.h = ajwy2;
        this.i = ajxh.a(new e(ajwy3));
        this.a = ajxh.a(new l(ajwy3));
        this.j = ajxh.a(new j(ajwy3));
        Object newArrayDeque = Queues.newArrayDeque();
        akcr.a(newArrayDeque, "Queues.newArrayDeque()");
        this.b = (Queue) newArrayDeque;
        this.c = ajxh.a(new f(ajwy4));
        this.k = ajxh.a(new k(ajwy5));
        this.d = ajxh.a(new g(ajwy6));
    }

    private final void a(sdr sdr) {
        shy shy = this.g;
        if (shy != null) {
            shy.a(true);
        }
        shy = ((sia) this.l.get()).a(sdr);
        d().a((Object) sdr);
        this.f = shy.a.a((ajfb) new sci(new h(this)), (ajfb) i.a);
        this.g = shy;
    }

    private final sdr b(sdl sdl) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            sdr sdr = (sdr) it.next();
            if (sdl.evaluateNotification(sdr) == a.DISPLAY) {
                it.remove();
                return sdr;
            }
        }
        return null;
    }

    private final ajwo<sdr> d() {
        return (ajwo) this.i.b();
    }

    /* Access modifiers changed, original: final */
    public final ajwo<sdr> a() {
        return (ajwo) this.j.b();
    }

    /* Access modifiers changed, original: final */
    public final void a(sdl sdl) {
        if (this.e == null) {
            this.e = b(sdl);
            sdr sdr = this.e;
            if (sdr != null) {
                a(sdr);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final sgt b() {
        return (sgt) this.k.b();
    }

    public final List<sdr> c() {
        shy shy;
        try {
            List h = ajyu.h((Collection) this.b);
            sdr sdr = this.e;
            if (sdr != null && sdr.g) {
                h.add(0, sdr);
            }
            this.e = null;
            this.b.clear();
            shy = this.g;
            if (shy != null) {
                shy.a(false);
            }
            return h;
        } catch (Throwable th) {
            this.e = null;
            this.b.clear();
            shy = this.g;
            if (shy != null) {
                shy.a(false);
            }
        }
    }
}
