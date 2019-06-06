package defpackage;

import android.app.Activity;
import android.view.View;
import com.brightcove.player.event.Event;
import defpackage.agzc.a;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: jtb */
public final class jtb extends ajed implements zma {
    boolean a = true;
    final ajei b = new ajei();
    final iqm c;
    final zke d;
    private ajdp<znh<zmy>> e;
    private final iqs f;
    private final zfw g;
    private final ifs h;
    private final Activity i;
    private final gpb j;

    /* renamed from: jtb$a */
    static final class a<T> implements ajfb<agze> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: jtb$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: jtb$c */
    static final class c<T> implements ajfl<ifx> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            ifx ifx = (ifx) obj;
            akcr.b(ifx, "it");
            return ifx.a(ifu.IN_APP_FIND_FRIENDS);
        }
    }

    /* renamed from: jtb$d */
    static final class d<T> implements ajfb<ajxm<? extends ifx, ? extends abkq>> {
        private /* synthetic */ jtb a;

        d(jtb jtb) {
            this.a = jtb;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            ifx ifx = (ifx) ajxm.a;
            abkq abkq = (abkq) ajxm.b;
            if (ifx.b("android.permission.READ_CONTACTS")) {
                zke zke = this.a.d;
                String str = abkq.b;
                if (str == null) {
                    str = "";
                }
                zke.a(new jsy(str));
            }
        }
    }

    /* renamed from: jtb$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ jtb a;

        e(jtb jtb) {
            this.a = jtb;
        }

        /* JADX WARNING: Missing block: B:10:0x0033, code skipped:
            if (r5 != null) goto L_0x0037;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r5) {
            /*
            r4 = this;
            r5 = (defpackage.ajxm) r5;
            r0 = "<name for destructuring parameter 0>";
            defpackage.akcr.b(r5, r0);
            r5 = r5.a;
            r5 = (defpackage.ifx) r5;
            r0 = r4.a;
            r0 = r0.a;
            r1 = 1;
            r2 = 0;
            if (r0 == 0) goto L_0x0036;
        L_0x0013:
            r0 = r4.a;
            r0 = r0.c;
            r0 = r0.d();
            if (r0 == 0) goto L_0x0036;
        L_0x001d:
            r0 = "permissionsResult";
            defpackage.akcr.a(r5, r0);
            r0 = r5.a;
            r3 = defpackage.ifu.IN_APP_FIND_FRIENDS;
            if (r0 != r3) goto L_0x0032;
        L_0x0028:
            r0 = "android.permission.READ_CONTACTS";
            r5 = r5.a(r0);
            if (r5 == 0) goto L_0x0032;
        L_0x0030:
            r5 = 1;
            goto L_0x0033;
        L_0x0032:
            r5 = 0;
        L_0x0033:
            if (r5 == 0) goto L_0x0036;
        L_0x0035:
            goto L_0x0037;
        L_0x0036:
            r1 = 0;
        L_0x0037:
            r5 = java.lang.Boolean.valueOf(r1);
            r5 = defpackage.ajdx.b(r5);
            return r5;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jtb$e.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: jtb$f */
    static final class f<T> implements ajfb<Boolean> {
        private /* synthetic */ jtb a;

        f(jtb jtb) {
            this.a = jtb;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                jtb jtb = this.a;
                jtb.a = false;
                jtb.b.a(jtb.c.a(a.UNSET, false, null, true).a((ajfb) a.a, (ajfb) b.a));
                this.a.d.a(new jsz());
            }
        }
    }

    /* renamed from: jtb$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public jtb(iqs iqs, zfw zfw, ifs ifs, iqm iqm, Activity activity, zke zke, gpb gpb) {
        akcr.b(iqs, "friendActionDispatcher");
        akcr.b(zfw, "schedulers");
        akcr.b(ifs, "permissionHelper");
        akcr.b(iqm, "contactApi");
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(zke, "eventDispatcher");
        akcr.b(gpb, "userAuthStore");
        this.f = iqs;
        this.g = zfw;
        this.h = ifs;
        this.c = iqm;
        this.i = activity;
        this.d = zke;
        this.j = gpb;
        Object b = ajdp.b(znk.a(new jte()));
        akcr.a(b, "Observable.just(Seekable…riendsSplashViewModel()))");
        this.e = b;
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
    }

    public final ajdp<znh<zmy>> c() {
        return this.e;
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onContinueButtonClickedEvent(jsx jsx) {
        akcr.b(jsx, "event");
        ajei ajei = this.b;
        Object a = this.h.b(this.i, ifu.IN_APP_FIND_FRIENDS).a((ajfl) c.a);
        akcr.a(a, "permissionHelper\n       …RIENDS)\n                }");
        Object c = this.j.c();
        akcr.a(c, "userAuthStore.observeUserSession()");
        ajei.a(ajwb.b(a, (ajdt) c).e().c((ajfb) new d(this)).a((ajfc) new e(this)).b((ajdw) this.g.h()).a((ajdw) this.g.l()).a((ajfb) new f(this), (ajfb) g.a));
    }

    public final void onDispose() {
        this.b.dispose();
    }
}
