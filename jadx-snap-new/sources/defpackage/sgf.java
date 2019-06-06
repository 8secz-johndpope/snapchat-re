package defpackage;

import android.app.Activity;
import android.os.CancellationSignal;
import com.brightcove.player.event.Event;
import com.google.android.gms.common.GoogleApiAvailability;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity;
import defpackage.scf.d;
import defpackage.scr.b;
import defpackage.scr.c;
import defpackage.scr.e;
import defpackage.scr.f;
import defpackage.scr.g;
import defpackage.scr.h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: sgf */
public final class sgf extends zgi {
    private final Activity a;
    private final ajwy<scu> b;
    private final ajwy<scr> c;
    private final ajwy<scf> d;
    private final ajwy<sco> e;
    private final ajwy<sgp> f;
    private final ajwy<sck> g;
    private final ajwy<sgu> h;

    /* renamed from: sgf$a */
    public static final class a extends WeakReference<Activity> implements ajej {
        private final ajej a;

        /* renamed from: sgf$a$a */
        static final class a extends akcq implements akbk<ajxw> {
            a(a aVar) {
                super(0, aVar);
            }

            public final String getName() {
                return "clear";
            }

            public final akej getOwner() {
                return akde.a(a.class);
            }

            public final String getSignature() {
                return "clear()V";
            }

            public final /* synthetic */ Object invoke() {
                ((a) this.receiver).clear();
                return ajxw.a;
            }
        }

        public a(Activity activity) {
            akcr.b(activity, Event.ACTIVITY);
            super(activity);
            Object a = ajek.a((ajev) new sgh(new a(this)));
            akcr.a(a, "Disposables.fromAction(this::clear)");
            this.a = a;
        }

        public final void dispose() {
            this.a.dispose();
        }

        public final boolean isDisposed() {
            return this.a.isDisposed();
        }
    }

    /* renamed from: sgf$c */
    static final class c extends akcq implements akbk<ajxw> {
        c(scr scr) {
            super(0, scr);
        }

        public final String getName() {
            return "transferSystemNotifications";
        }

        public final akej getOwner() {
            return akde.a(scr.class);
        }

        public final String getSignature() {
            return "transferSystemNotifications()V";
        }

        public final /* synthetic */ Object invoke() {
            scr scr = (scr) this.receiver;
            ajdp.b((Iterable) ((sdb) scr.b.get()).a()).e((ajfb) new e(scr)).a((ajfl) new sct(new f(scr))).d((ajfb) g.a).b((ajdw) scr.d.b()).a((ajdw) scr.d.l()).f((ajfb) new scs(new h((sdu) scr.a.get())));
            return ajxw.a;
        }
    }

    /* renamed from: sgf$b */
    static final class b implements ajev {
        private /* synthetic */ sgf a;

        b(sgf sgf) {
            this.a = sgf;
        }

        public final void run() {
            this.a.c();
        }
    }

    /* renamed from: sgf$d */
    static final class d extends akcq implements akbk<ajxw> {
        d(scr scr) {
            super(0, scr);
        }

        public final String getName() {
            return "transferInAppNotifications";
        }

        public final akej getOwner() {
            return akde.a(scr.class);
        }

        public final String getSignature() {
            return "transferInAppNotifications()V";
        }

        public final /* synthetic */ Object invoke() {
            scr scr = (scr) this.receiver;
            ajdp.b((Iterable) ((sch) scr.c.get()).c()).a((ajfl) new sct(new b(scr))).d((ajfb) c.a).b((ajdw) scr.d.b()).a((ajdw) scr.d.l()).f((ajfb) new scs(new defpackage.scr.d((sdu) scr.a.get())));
            return ajxw.a;
        }
    }

    public sgf(Activity activity, ajwy<scu> ajwy, ajwy<scr> ajwy2, ajwy<scf> ajwy3, ajwy<sco> ajwy4, ajwy<sgp> ajwy5, ajwy<sck> ajwy6, ajwy<sgu> ajwy7, zgk<ScopedFragmentActivity.b> zgk) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ajwy, "notificationEmitter");
        akcr.b(ajwy2, "transferManager");
        akcr.b(ajwy3, "inAppNotificationBinder");
        akcr.b(ajwy4, "notificationTokenUpdater");
        akcr.b(ajwy5, "notificationAcknowledger");
        akcr.b(ajwy6, "appOpenBinder");
        akcr.b(ajwy7, "notificationLifecycleEventReporter");
        akcr.b(zgk, "taskScoper");
        super(zgk);
        this.a = activity;
        this.b = ajwy;
        this.c = ajwy2;
        this.d = ajwy3;
        this.e = ajwy4;
        this.f = ajwy5;
        this.g = ajwy6;
        this.h = ajwy7;
    }

    public final ajej a() {
        String str = Event.ACTIVITY;
        ajei ajei = new ajei();
        a aVar = new a(this.a);
        ((scu) this.b.get()).c.set(true);
        ((sgp) this.f.get()).b.set(true);
        sgu sgu = (sgu) this.h.get();
        igk.a(((seo) sgu.g.get()).b().b((ajdw) ((zfw) sgu.a.b()).f()).e((ajfb) new sgu.c(sgu)), sgu.b);
        ((sck) this.g.get()).b.a();
        scf scf = (scf) this.d.get();
        ajei ajei2 = new ajei();
        sch sch = (sch) scf.c.get();
        ajei ajei3 = new ajei();
        scj scj = (scj) sch.h.get();
        scj.b.a((achk) scj);
        ajej a = ajek.a((ajev) new scj.c(scj));
        akcr.a((Object) a, "Disposables.fromAction {…igationSubscriber(this) }");
        ajei3.a(a);
        ajei3.a(((scj) sch.h.get()).a.j(ajfu.a).f((ajfb) new sci(new sch.b(sch))));
        ajei3.a(((ajdp) sch.c.b()).f((ajfb) new sci(new sch.c(sch))));
        ajei2.a((ajej) ajei3);
        ajei2.a(((scu) scf.b.get()).b.b((ajdw) scf.a.l()).a((ajdw) scf.a.l()).e((ajfb) scf.b.a).b((ajev) scf.c.a).a((ajfb) new scg(new d((sch) scf.c.get())), (ajfb) scf.e.a));
        ajei.a((ajej) ajei2);
        sco sco = (sco) this.e.get();
        Reference reference = aVar;
        akcr.b(reference, str);
        Object instance = GoogleApiAvailability.getInstance();
        akcr.a(instance, "GoogleApiAvailability.getInstance()");
        akcr.b(reference, str);
        akcr.b(instance, "googleApi");
        ajej a2 = ajdj.b((Callable) new sco.c(reference)).b((ajfb) sco.d.a).b((ajdw) sco.a.j()).f(new scq(new sco.e(instance))).e(new sco.f(sco, reference, instance)).a((ajev) sco.g.a, (ajfb) sco.h.a);
        akcr.a((Object) a2, "Maybe.fromCallable { act…ge}\") }\n                )");
        ajei.a(a2);
        ajei.a(ajek.a((ajev) new b(this)));
        ajei.a((ajej) aVar);
        abmr.d(new sgg(new c((scr) this.c.get())));
        return ajei;
    }

    /* Access modifiers changed, original: final */
    public final CancellationSignal c() {
        ((scu) this.b.get()).c.set(false);
        ((sgp) this.f.get()).b.set(false);
        ((sgu) this.h.get()).b.dispose();
        return abmr.d(new sgg(new d((scr) this.c.get())));
    }
}
