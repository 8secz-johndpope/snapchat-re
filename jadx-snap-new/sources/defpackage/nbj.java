package defpackage;

import android.app.Activity;
import android.content.Context;
import com.brightcove.player.event.Event;
import com.google.common.base.Optional;
import com.mapbox.services.android.telemetry.permissions.PermissionsManager;
import com.snapchat.android.R;
import defpackage.akdd.c;
import defpackage.ncb.b;
import defpackage.zgy.a;

/* renamed from: nbj */
public final class nbj implements ncd {
    private static final String q = q;
    final ajdw a;
    final zfr b;
    final zfw c;
    final Object d = new Object();
    boolean e;
    ifv f = ifv.UNKNOWN;
    final nbw g;
    final ifs h;
    final ncr i;
    final ajei j;
    final ftl k;
    final tnj l;
    final ncb m;
    private final Object n = new Object();
    private boolean o;
    private final dib p;

    /* renamed from: nbj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: nbj$e */
    static final class e<T> implements ajfl<ifx> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ifx ifx = (ifx) obj;
            akcr.b(ifx, "requestPermissionsResult");
            return ifx.b(PermissionsManager.FINE_LOCATION_PERMISSION);
        }
    }

    /* renamed from: nbj$f */
    static final class f<T> implements ajfb<ifx> {
        private /* synthetic */ nbj a;
        private /* synthetic */ Activity b;
        private /* synthetic */ ajdy c;

        f(nbj nbj, Activity activity, ajdy ajdy) {
            this.a = nbj;
            this.b = activity;
            this.c = ajdy;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (this.a.h.l() && !this.a.g.b()) {
                this.a.i.a(this.a.g, (Context) this.b);
            }
            if (!this.c.isDisposed()) {
                this.c.a(Optional.of(Boolean.TRUE));
            }
            this.a.a(true);
        }
    }

    /* renamed from: nbj$g */
    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ ajdy a;

        g(ajdy ajdy) {
            this.a = ajdy;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a((Throwable) obj);
        }
    }

    /* renamed from: nbj$h */
    static final class h<T> implements ajfb<ifx> {
        private /* synthetic */ nbj a;

        h(nbj nbj) {
            this.a = nbj;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = ((ifx) obj).c(PermissionsManager.FINE_LOCATION_PERMISSION);
            akcr.a(obj, "it.getResultState(Manife…ion.ACCESS_FINE_LOCATION)");
            this.a.l.b().a((fth) nfc.LOCATION_PERMISSION_RESULT_STATE, (Enum) obj).b();
            this.a.f = obj;
        }
    }

    /* renamed from: nbj$i */
    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: nbj$j */
    static final class j<T> implements ajea<T> {
        private /* synthetic */ nbj a;
        private /* synthetic */ Activity b;
        private /* synthetic */ boolean c;
        private /* synthetic */ ifu d;

        /* renamed from: nbj$j$a */
        static final class a<T> implements ajfl<ifx> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ boolean test(Object obj) {
                ifx ifx = (ifx) obj;
                akcr.b(ifx, "requestPermissionsResult");
                return ifx.b(PermissionsManager.FINE_LOCATION_PERMISSION);
            }
        }

        /* renamed from: nbj$j$b */
        static final class b<T> implements ajfb<ifx> {
            private /* synthetic */ ajdy a;

            b(ajdy ajdy) {
                this.a = ajdy;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = this.a;
                akcr.a(obj, Event.EMITTER);
                if (!obj.isDisposed()) {
                    this.a.a(Optional.of(Boolean.TRUE));
                }
            }
        }

        /* renamed from: nbj$j$c */
        static final class c<T> implements ajfb<Throwable> {
            private /* synthetic */ ajdy a;

            c(ajdy ajdy) {
                this.a = ajdy;
            }

            public final /* synthetic */ void accept(Object obj) {
                this.a.a((Throwable) obj);
            }
        }

        j(nbj nbj, Activity activity, boolean z, ifu ifu) {
            this.a = nbj;
            this.b = activity;
            this.c = z;
            this.d = ifu;
        }

        public final void subscribe(ajdy<Optional<Boolean>> ajdy) {
            akcr.b(ajdy, Event.EMITTER);
            if (!ajdy.isDisposed()) {
                if (this.b == null) {
                    ajdy.a(Optional.absent());
                } else if (!this.c && this.a.h.o().f()) {
                    ajdy.a(Optional.of(Boolean.FALSE));
                } else if (this.a.h.b() || !this.a.g.b()) {
                    nbj nbj = this.a;
                    Activity activity = this.b;
                    ifu ifu = this.d;
                    if (nbj.f == ifv.UNKNOWN) {
                        synchronized (nbj.d) {
                            if (!nbj.e) {
                                ajej a = nbj.k.m(nfc.LOCATION_PERMISSION_RESULT_STATE).b(nbj.a).a((ajdw) nbj.b).a((ajfb) new b(nbj, activity, ifu, ajdy), (ajfb) c.a);
                                akcr.a((Object) a, "compositeConfigurationPr…                       })");
                                ajvv.a(a, nbj.j);
                                nbj.e = true;
                            }
                        }
                        return;
                    }
                    nbj.a(activity, ifu, ajdy, nbj.f);
                } else {
                    this.a.j.a(this.a.h.a(this.b, this.d, this.a.c).b(this.a.a).a((ajdw) this.a.b).a((ajfl) a.a).a((ajfb) new b(ajdy), (ajfb) new c(ajdy)));
                }
            }
        }
    }

    /* renamed from: nbj$b */
    static final class b<T> implements ajfb<ifv> {
        private /* synthetic */ nbj a;
        private /* synthetic */ Activity b;
        private /* synthetic */ ifu c;
        private /* synthetic */ ajdy d;

        b(nbj nbj, Activity activity, ifu ifu, ajdy ajdy) {
            this.a = nbj;
            this.b = activity;
            this.c = ifu;
            this.d = ajdy;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (ifv) obj;
            nbj nbj = this.a;
            nbj.e = false;
            Activity activity = this.b;
            ifu ifu = this.c;
            ajdy ajdy = this.d;
            akcr.a(obj, "it");
            nbj.a(activity, ifu, ajdy, obj);
        }
    }

    /* renamed from: nbj$c */
    static final class c<T> implements ajfb<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: nbj$d */
    static final class d implements Runnable {
        final /* synthetic */ nbj a;
        final /* synthetic */ Activity b;
        final /* synthetic */ ifu c;
        final /* synthetic */ ajdy d;
        private /* synthetic */ c e;
        private /* synthetic */ c f;
        private /* synthetic */ c g;

        /* renamed from: nbj$d$1 */
        static final class 1 extends akcs implements akbk<ajxw> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                nbj nbj = this.a.a;
                Activity activity = this.a.b;
                ifu ifu = this.a.c;
                ajdy ajdy = this.a.d;
                nbj.h.m();
                nbj.j.a(nbj.h.b(activity, ifu).b(nbj.a).a((ajdw) nbj.b).a((ajfl) e.a).a((ajfb) new f(nbj, activity, ajdy), (ajfb) new g(ajdy)));
                return ajxw.a;
            }
        }

        /* renamed from: nbj$d$2 */
        static final class 2 extends akcs implements akbk<ajxw> {
            private /* synthetic */ d a;

            2(d dVar) {
                this.a = dVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                nbj nbj = this.a.a;
                ajdy ajdy = this.a.d;
                nbj.h.n();
                if (!ajdy.isDisposed()) {
                    ajdy.a(Optional.of(Boolean.FALSE));
                }
                nbj.a(false);
                return ajxw.a;
            }
        }

        d(nbj nbj, Activity activity, c cVar, c cVar2, c cVar3, ifu ifu, ajdy ajdy) {
            this.a = nbj;
            this.b = activity;
            this.e = cVar;
            this.f = cVar2;
            this.g = cVar3;
            this.c = ifu;
            this.d = ajdy;
        }

        public final void run() {
            ncb ncb = this.a.m;
            Activity activity = this.b;
            int i = this.e.a;
            int i2 = this.f.a;
            int i3 = this.g.a;
            akbk 1 = new 1(this);
            akbk 2 = new 2(this);
            akcr.b(activity, Event.ACTIVITY);
            akcr.b(1, "onGranted");
            akcr.b(2, "onDenied");
            a aVar = r9;
            a aVar2 = new a(activity, ncb.a, new zjm(nbz.a, "location_permissions_dialog", false, false, true, false, null, false, false, false, false, null, 4076), false, null, 16);
            zgy a = a.a(aVar.a(i).b((int) R.string.location_permissions_dialog_message).a(i2, (akbl) new ncb.a(1), true), (akbl) new b(2), false, Integer.valueOf(i3), null, null, 26).a();
            ncb.a.a((achd) a, a.a, null);
        }
    }

    static {
        a aVar = new a();
    }

    public nbj(nbw nbw, ifs ifs, dib dib, ncr ncr, ajei ajei, zgb zgb, ide ide, ftl ftl, tnj tnj, ncb ncb) {
        akcr.b(nbw, "locationConfigurationProvider");
        akcr.b(ifs, "permissionHelper");
        akcr.b(dib, "blizzardEventLogger");
        akcr.b(ncr, "locationEnabler");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        akcr.b(ftl, "compositeConfigurationProvider");
        akcr.b(tnj, "preferences");
        akcr.b(ncb, "locationPermissionDialog");
        this.g = nbw;
        this.h = ifs;
        this.p = dib;
        this.i = ncr;
        this.j = ajei;
        this.k = ftl;
        this.l = tnj;
        this.m = ncb;
        this.a = zgb.a(ide.callsite(q)).b();
        this.b = zgb.a(ide.callsite(q)).l();
        this.c = zgb.a(ide.callsite(q));
    }

    public final ajdx<Optional<Boolean>> a(Activity activity, ifu ifu, boolean z) {
        akcr.b(ifu, "requestEvent");
        synchronized (this.n) {
            if (!this.o) {
                ajej a = this.h.h().b(this.a).a((ajfb) new h(this), (ajfb) i.a);
                akcr.a((Object) a, "permissionHelper.observe…                       })");
                ajvv.a(a, this.j);
                this.o = true;
            }
        }
        Object a2 = ajdx.a((ajea) new j(this, activity, z, ifu));
        akcr.a(a2, "Single.create { emitter …)\n            }\n        }");
        return a2;
    }

    /* Access modifiers changed, original: final */
    public final void a(Activity activity, ifu ifu, ajdy<Optional<Boolean>> ajdy, ifv ifv) {
        c cVar = new c();
        cVar.a = R.string.location_permissions_dialog_title;
        c cVar2 = new c();
        cVar2.a = R.string.allow;
        c cVar3 = new c();
        cVar3.a = R.string.dont_allow;
        if (ifv == ifv.ALREADY_DENIED_PERMANENTLY || ifv == ifv.JUST_DENIED_PERMANENTLY) {
            cVar.a = R.string.location_permissions_dialog_title_enable;
            cVar2.a = R.string.open_settings;
            cVar3.a = R.string.not_now;
        }
        ajej a = this.b.a((Runnable) new d(this, activity, cVar, cVar2, cVar3, ifu, ajdy));
        akcr.a((Object) a, "mainThread.scheduleDirec…\n            })\n        }");
        ajvv.a(a, this.j);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        aaue aaue = new aaue();
        aaue.a(aauf.APP_LOCATION);
        aaue.a(z ? aaud.GRANTED : aaud.DENIED);
        aaue.a(Boolean.valueOf(z));
        this.p.a((aajt) aaue);
    }

    public final boolean a() {
        return (this.h.l() && this.g.b()) ? false : true;
    }
}
