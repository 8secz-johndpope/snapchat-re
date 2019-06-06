package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Surface;
import com.brightcove.player.event.EventType;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;
import com.snap.ui.view.surfaceview.SurfaceViewManager;
import com.snap.ui.view.surfaceview.SurfaceViewManager.SurfaceViewRequest;
import defpackage.abta.b;
import defpackage.acaz.c;
import defpackage.tpl.b.e;
import defpackage.txl.d;
import defpackage.zfw.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: txi */
public final class txi implements SurfaceViewRequest {
    volatile boolean A;
    volatile Surface B;
    public volatile c C;
    public double D;
    boolean E;
    acae F;
    final Map<acae, kaz<jwj>> G;
    abta<d> H;
    final ajxe I;
    final ajxe J;
    final ajxe K;
    final toc L;
    final SurfaceViewManager M;
    final jwe N;
    final twz O;
    final ajwy<acba> P;
    final ajwy<acaw> Q;
    final ajwy<adkk> R;
    final ftl S;
    final ofq T;
    final adim U;
    final ajwo<tvz> V;
    private final ajxe W;
    private final ajxe X;
    private final ajxe Y;
    private final ajxe Z;
    final ajxe a = ajxh.a(new e(this));
    private ajwl<aesf> aa;
    private final ajxe ab;
    private final ajxe ac;
    private final ajxe ad;
    private volatile toy ae;
    private final ajxe af;
    private final ajxe ag;
    private final ajxe ah;
    private final ajxe ai;
    private final ajxe aj;
    private final ajxe ak;
    private final ajxe al;
    private final zgb am;
    public ajei b;
    final ajei c;
    final ajei d;
    int e;
    int f;
    Context g;
    akbl<? super Throwable, ajxw> h;
    txo i;
    public volatile acay j;
    volatile adkk k;
    public ajwl<Boolean> l;
    public ajwl<Boolean> m;
    ajwl<c> n;
    final ajxe o;
    public final ajws<txd> p;
    volatile toy q;
    tpl r;
    tpj s;
    List<abyi> t;
    String u;
    String v;
    boolean w;
    public ofs x;
    final ajxe y;
    CountDownLatch z;

    /* renamed from: txi$b */
    public static final class b {
        final adiv a;
        final adie b;
        final adfh c;

        public b(adiv adiv, adie adie, adfh adfh) {
            this.a = adiv;
            this.b = adie;
            this.c = adfh;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof defpackage.txi.b;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (defpackage.txi.b) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.txi$b.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            adiv adiv = this.a;
            int i = 0;
            int hashCode = (adiv != null ? adiv.hashCode() : 0) * 31;
            adie adie = this.b;
            hashCode = (hashCode + (adie != null ? adie.hashCode() : 0)) * 31;
            adfh adfh = this.c;
            if (adfh != null) {
                i = adfh.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("PlayerConfiguration(renderPass=");
            stringBuilder.append(this.a);
            stringBuilder.append(", inputMatrix=");
            stringBuilder.append(this.b);
            stringBuilder.append(", audioFrameProcessingPass=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: txi$e */
    static final class e extends akcs implements akbk<idd> {
        private /* synthetic */ txi a;

        e(txi txi) {
            this.a = txi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.L.callsite("PreviewMediaPlayer");
        }
    }

    /* renamed from: txi$ao */
    static final class ao extends akcs implements akbk<txs> {
        private /* synthetic */ ajwy a;

        ao(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (txs) this.a.get();
        }
    }

    /* renamed from: txi$y */
    static final class y extends akcs implements akbk<vjn> {
        private /* synthetic */ ajwy a;

        y(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (vjn) this.a.get();
        }
    }

    /* renamed from: txi$j */
    static final class j extends akcs implements akbk<DisplayMetrics> {
        private /* synthetic */ ajwy a;

        j(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DisplayMetrics) this.a.get();
        }
    }

    /* renamed from: txi$ah */
    static final class ah extends akcs implements akbk<AtomicBoolean> {
        public static final ah a = new ah();

        ah() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new AtomicBoolean(false);
        }
    }

    /* renamed from: txi$l */
    static final class l extends akcs implements akbk<AtomicBoolean> {
        public static final l a = new l();

        l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new AtomicBoolean(false);
        }
    }

    /* renamed from: txi$an */
    static final class an extends akcs implements akbk<ajwl<kaz<jwj>>> {
        public static final an a = new an();

        an() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: txi$ae */
    static final class ae extends akcs implements akbk<txq> {
        public static final ae a = new ae();

        ae() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new txq();
        }
    }

    /* renamed from: txi$k */
    static final class k extends akcs implements akbk<txq> {
        public static final k a = new k();

        k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new txq();
        }
    }

    /* renamed from: txi$ap */
    static final class ap extends akcs implements akbk<ajwl<Float>> {
        public static final ap a = new ap();

        ap() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ajwl();
        }
    }

    /* renamed from: txi$x */
    static final class x extends akcs implements akbk<c> {
        public static final x a = new x();

        /* renamed from: txi$x$1 */
        static final class 1 implements c {
            public static final 1 a = new 1();

            1() {
            }

            public final boolean a(acaz acaz, abyh abyh) {
                return false;
            }
        }

        x() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return 1.a;
        }
    }

    /* renamed from: txi$1 */
    static final class 1<T> implements ajfb<iia> {
        private /* synthetic */ txi a;

        1(txi txi) {
            this.a = txi;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (iia) obj;
            txi txi = this.a;
            akcr.a(obj, MapboxEvent.KEY_RESOLUTION);
            txi.e = obj.a();
            this.a.f = obj.b();
        }
    }

    /* renamed from: txi$ag */
    static final class ag extends akcs implements akbk<zfw> {
        private /* synthetic */ txi a;

        ag(txi txi) {
            this.a = txi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(this.a.L.callsite("PreviewMediaPlayer"));
        }
    }

    /* renamed from: txi$f */
    static final class f extends akcs implements akbk<jwc> {
        private /* synthetic */ txi a;

        f(txi txi) {
            this.a = txi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.N.a();
        }
    }

    /* renamed from: txi$w */
    static final class w extends akcs implements akbk<txb> {
        private /* synthetic */ ajwy a;

        w(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (txb) this.a.get();
        }
    }

    /* renamed from: txi$au */
    static final class au extends akcs implements akbk<oft> {
        private /* synthetic */ txi a;

        au(txi txi) {
            this.a = txi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((vjn) this.a.X.b()).a(this.a.e, this.a.f);
        }
    }

    /* renamed from: txi$ad */
    static final class ad extends akcs implements akbk<oft> {
        private /* synthetic */ txi a;

        ad(txi txi) {
            this.a = txi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((vjn) this.a.X.b()).a(this.a.e, this.a.f);
        }
    }

    /* renamed from: txi$af */
    static final class af extends akcs implements akbk<abtl> {
        private /* synthetic */ txi a;

        af(txi txi) {
            this.a = txi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abtl abtl = new abtl(this.a.b().widthPixels, this.a.b().heightPixels);
            int i = 1;
            while (true) {
                int i2 = i + 1;
                int i3 = i2 * 4;
                if (abtl.d() % i3 == 0 && abtl.e() % i3 == 0 && abtl.d() / i2 >= 360) {
                    i = i2;
                }
            }
            return new abtl(this.a.b().widthPixels / i, this.a.b().heightPixels / i);
        }
    }

    /* renamed from: txi$aw */
    static final class aw extends akcs implements akbk<ajdw> {
        private /* synthetic */ txi a;

        aw(txi txi) {
            this.a = txi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return a.a((ajdw) this.a.c().b(), 1);
        }
    }

    /* renamed from: txi$bb */
    static final class bb extends akcs implements akbk<d> {
        private /* synthetic */ txi a;

        bb(txi txi) {
            this.a = txi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new d();
        }
    }

    /* renamed from: txi$m */
    static final class m extends akcs implements akbk<a> {
        private /* synthetic */ txi a;

        m(txi txi) {
            this.a = txi;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a();
        }
    }

    /* renamed from: txi$n */
    static final class n implements b.a {
        private /* synthetic */ txi a;

        n(txi txi) {
            this.a = txi;
        }

        public final void register(ajej ajej) {
            this.a.d.a(ajej);
        }
    }

    /* renamed from: txi$o */
    static final class o<T> implements ajfb<abyi> {
        final /* synthetic */ txi a;
        private /* synthetic */ txo b;

        o(txi txi, txo txo) {
            this.a = txi;
            this.b = txo;
        }

        public final /* synthetic */ void accept(Object obj) {
            final abyi abyi = (abyi) obj;
            this.b.a("start", new akbk<ajxw>(this) {
                private /* synthetic */ o a;

                public final /* synthetic */ Object invoke() {
                    txi txi = this.a.a;
                    Object obj = abyi;
                    akcr.a(obj, "it");
                    txi.b.dispose();
                    txi.b = new ajei();
                    txi.b.a(ajdp.a((ajdt) txi.m, (ajdt) txi.l, (ajex) aq.a).f((ajfb) new ar(txi)));
                    txi.A = true;
                    txi.M.checkOut(txi);
                    txi.z = new CountDownLatch(1);
                    txi.b.a(txi.n.f((ajfb) new as(txi)));
                    ajei ajei = txi.b;
                    obj = txi.O.a(obj).a(txi.l()).a((ajfc) new h(txi, obj)).a((ajfc) new i(txi));
                    akcr.a(obj, "previewMediaReaderManage…source)\n                }");
                    ajfb atVar = new at(txi);
                    akbl akbl = txi.h;
                    if (akbl == null) {
                        akcr.a("errorHandler");
                    }
                    if (akbl != null) {
                        akbl = new txk(akbl);
                    }
                    ajei.a(obj.a(atVar, (ajfb) akbl));
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: txi$p */
    static final class p implements Runnable {
        private /* synthetic */ txi a;
        private /* synthetic */ txo b;

        /* renamed from: txi$p$1 */
        static final class 1 extends akcs implements akbk<ajxw> {
            private /* synthetic */ p a;

            1(p pVar) {
                this.a = pVar;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return ajxw.a;
            }
        }

        p(txi txi, txo txo) {
            this.a = txi;
            this.b = txo;
        }

        public final void run() {
            this.b.a("on_pending", new 1(this));
        }
    }

    /* renamed from: txi$q */
    static final class q implements Runnable {
        private /* synthetic */ txi a;
        private /* synthetic */ txo b;

        /* renamed from: txi$q$1 */
        static final class 1 extends akcs implements akbk<ajxw> {
            private /* synthetic */ q a;

            1(q qVar) {
                this.a = qVar;
                super(0);
            }

            public final /* bridge */ /* synthetic */ Object invoke() {
                return ajxw.a;
            }
        }

        q(txi txi, txo txo) {
            this.a = txi;
            this.b = txo;
        }

        public final void run() {
            this.b.a("on_ready", new 1(this));
        }
    }

    /* renamed from: txi$r */
    static final class r implements Runnable {
        final /* synthetic */ txi a;
        private /* synthetic */ txo b;

        /* renamed from: txi$r$1 */
        static final class 1 extends akcs implements akbk<ajxw> {
            private /* synthetic */ r a;

            1(r rVar) {
                this.a = rVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                txi txi = this.a.a;
                in.a("StartPlayer");
                acay acay = txi.j;
                if (acay != null) {
                    acay.a(txi.B);
                    acay.a();
                }
                adkk adkk = txi.k;
                if (adkk != null) {
                    if (!adkk.a()) {
                        Surface surface = txi.B;
                        if (surface != null) {
                            adkk.a(surface);
                            adkk.b();
                        }
                    }
                    adkk.c();
                }
                in.a();
                return ajxw.a;
            }
        }

        r(txi txi, txo txo) {
            this.a = txi;
            this.b = txo;
        }

        public final void run() {
            this.b.a(EventType.PLAY, new 1(this));
        }
    }

    /* renamed from: txi$s */
    static final class s implements Runnable {
        final /* synthetic */ txi a;
        private /* synthetic */ txo b;

        /* renamed from: txi$s$1 */
        static final class 1 extends akcs implements akbk<ajxw> {
            private /* synthetic */ s a;

            1(s sVar) {
                this.a = sVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                txi txi = this.a.a;
                acay acay = txi.j;
                if (acay != null) {
                    acay.b();
                }
                adkk adkk = txi.k;
                if (adkk != null) {
                    adkk.b(false);
                }
                return ajxw.a;
            }
        }

        s(txi txi, txo txo) {
            this.a = txi;
            this.b = txo;
        }

        public final void run() {
            this.b.a(EventType.PAUSE, new 1(this));
        }
    }

    /* renamed from: txi$t */
    static final class t<T> implements ajfb<Boolean> {
        final /* synthetic */ txi a;
        private /* synthetic */ txo b;

        t(txi txi, txo txo) {
            this.a = txi;
            this.b = txo;
        }

        public final /* synthetic */ void accept(Object obj) {
            final Boolean bool = (Boolean) obj;
            this.b.a(EventType.STOP, new akbk<ajxw>(this) {
                private /* synthetic */ t a;

                public final /* synthetic */ Object invoke() {
                    txi txi = this.a.a;
                    Object obj = bool;
                    akcr.a(obj, "it");
                    boolean booleanValue = obj.booleanValue();
                    acay acay = txi.j;
                    if (acay != null) {
                        acay.c(booleanValue);
                    }
                    acay = txi.j;
                    if (acay != null) {
                        acay.d();
                    }
                    txi.j = null;
                    adkk adkk = txi.k;
                    if (adkk != null) {
                        adkk.b(booleanValue);
                    }
                    adkk adkk2 = txi.k;
                    if (adkk2 != null) {
                        adkk2.c(true);
                    }
                    txi.k = null;
                    if (txi.A) {
                        CountDownLatch countDownLatch = txi.z;
                        if (countDownLatch == null) {
                            akcr.a("surfaceReleaseLatch");
                        }
                        countDownLatch.countDown();
                        txi.M.checkIn(txi);
                        txi.a(null);
                    }
                    txi.b.dispose();
                    txi.l.a();
                    obj = new ajwl();
                    String str = "BehaviorSubject.create()";
                    akcr.a(obj, str);
                    txi.l = obj;
                    txi.m.a();
                    obj = new ajwl();
                    akcr.a(obj, str);
                    txi.m = obj;
                    txi.n.a();
                    obj = new ajwl();
                    akcr.a(obj, str);
                    txi.n = obj;
                    txi.a(null);
                    txi.q = null;
                    txi.e().set(false);
                    return ajxw.a;
                }
            });
        }
    }

    /* renamed from: txi$u */
    static final class u implements Runnable {
        final /* synthetic */ txi a;
        private /* synthetic */ txo b;

        /* renamed from: txi$u$1 */
        static final class 1 extends akcs implements akbk<ajxw> {
            private /* synthetic */ u a;

            1(u uVar) {
                this.a = uVar;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                txi txi = this.a.a;
                txi.d.dispose();
                txi.p.a((Object) txd.SHUT_DOWN);
                return ajxw.a;
            }
        }

        u(txi txi, txo txo) {
            this.a = txi;
            this.b = txo;
        }

        public final void run() {
            this.b.a("release", new 1(this));
        }
    }

    /* renamed from: txi$v */
    static final class v implements Runnable {
        private /* synthetic */ txi a;

        v(txi txi) {
            this.a = txi;
        }

        public final void run() {
            ((vjn) this.a.X.b());
            this.a.b();
            this.a.i();
        }
    }

    /* renamed from: txi$a */
    final class a implements adkk.b {
        public final void a() {
            ((AtomicBoolean) txi.this.ad.b()).set(true);
            txi.this.p.a((Object) txd.START);
            txi.this.p.a((Object) txd.FIRST_FRAME);
            txi.a(txi.this);
        }

        public final void a(defpackage.adkk.a.a aVar) {
            akcr.b(aVar, "error");
        }

        public final void b() {
            txi.a(txi.this);
        }

        public final void c() {
        }
    }

    /* renamed from: txi$av */
    static final class av implements Runnable {
        private /* synthetic */ txi a;
        private /* synthetic */ absz.a b;
        private /* synthetic */ Object c;

        av(txi txi, absz.a aVar, Object obj) {
            this.a = txi;
            this.b = aVar;
            this.c = obj;
        }

        public final void run() {
            txi.e(this.a).a(this.b, this.c);
        }
    }

    /* renamed from: txi$aq */
    static final class aq<T1, T2, R> implements ajex<Boolean, Boolean, Boolean> {
        public static final aq a = new aq();

        aq() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            boolean z = ((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue();
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: txi$ar */
    static final class ar<T> implements ajfb<Boolean> {
        private /* synthetic */ txi a;

        ar(txi txi) {
            this.a = txi;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "ready");
            if (obj.booleanValue()) {
                this.a.a((absz.a) txl.a.PREPARE_COMPLETE, absy.VOID);
            }
        }
    }

    /* renamed from: txi$as */
    static final class as<T> implements ajfb<c> {
        private /* synthetic */ txi a;

        as(txi txi) {
            this.a = txi;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (c) obj;
            txi txi = this.a;
            String str = "source";
            akcr.a(obj, str);
            Object obj2 = obj.a.a;
            String str2 = "this.mediaType";
            akcr.a(obj2, str2);
            String str3 = "errorHandler";
            akbl akbl;
            if (!abyp.c(obj2.intValue())) {
                Object obj3 = obj.a.a;
                akcr.a(obj3, str2);
                if (!abyp.a(obj3.intValue())) {
                    throw new RuntimeException("bad snap type");
                } else if (txi.j == null) {
                    if (txi.w) {
                        obj3 = txi.Q.get();
                        ((acaw) obj3).u();
                    } else {
                        obj3 = txi.P.get();
                    }
                    obj3 = (acay) obj3;
                    obj3.a(true);
                    obj3.b(true);
                    obj3.a((c) txi.I.b());
                    obj3.y();
                    obj3.a((adkn) (d) txi.J.b());
                    toy toy = txi.q;
                    if (toy != null && toy.c > 1) {
                        obj3.a(toy.c);
                    }
                    akcr.a(obj3, "player");
                    txi.j = obj3;
                    ajei ajei = txi.b;
                    obj = txi.b(obj, null).c((ajfb) new am(txi, obj)).e();
                    akcr.a(obj, "createConfigurationFromS…         .ignoreElement()");
                    ajev aaVar = new aa(txi);
                    akbl akbl2 = txi.h;
                    if (akbl2 == null) {
                        akcr.a(str3);
                    }
                    if (akbl2 != null) {
                        akbl2 = new txk(akbl2);
                    }
                    ajei.a(obj.a(aaVar, (ajfb) akbl2));
                    ajei ajei2 = txi.b;
                    ajdj d = txi.p.a((ajfl) ab.a).d();
                    ajfb acVar = new ac(txi);
                    akbl = txi.h;
                    if (akbl == null) {
                        akcr.a(str3);
                    }
                    if (akbl != null) {
                        akbl = new txk(akbl);
                    }
                    ajei2.a(d.a(acVar, (ajfb) akbl));
                } else {
                    throw new IllegalStateException("Can't set new video source until the player is released.");
                }
            } else if (txi.k == null) {
                obj2 = txi.R.get();
                adkk adkk = (adkk) obj2;
                adkk.a(false);
                adkk.a((adkk.b) (a) txi.K.b());
                akcr.a(obj2, "imagePlayerProvider.get(…aybackListener)\n        }");
                txi.k = adkk;
                ajei ajei3 = txi.b;
                akcr.b(obj, str);
                obj = ajdx.b(obj).a((ajfc) new aj(txi)).a((ajfc) new ak(txi, obj)).f(new al(txi)).e();
                akcr.a(obj, "Single.just(source)\n    …        }.ignoreElement()");
                ajev zVar = new z(txi);
                akbl = txi.h;
                if (akbl == null) {
                    akcr.a(str3);
                }
                if (akbl != null) {
                    akbl = new txk(akbl);
                }
                ajei3.a(obj.a(zVar, (ajfb) akbl));
            } else {
                throw new IllegalStateException("Can't set new image source until the player is released.");
            }
        }
    }

    /* renamed from: txi$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ txi a;
        private /* synthetic */ abyi b;

        /* renamed from: txi$h$1 */
        static final class 1<T> implements ajfb<ajej> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: txi$h$2 */
        static final class 2<T> implements ajfb<odx> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        h(txi txi, abyi abyi) {
            this.a = txi;
            this.b = abyi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (odx) obj;
            akcr.b(obj, "reader");
            Object obj2 = this.b.e.a;
            akcr.a(obj2, "mediaPackage.media.mediaType");
            return abyp.a(obj2.intValue()) ? this.a.O.b(this.b).a(obj).b((ajfb) 1.a).c((ajfb) 2.a) : ajvo.a(ajhn.a).a(obj);
        }
    }

    /* renamed from: txi$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ txi a;

        i(txi txi) {
            this.a = txi;
        }

        private ajdx<c> a(odx odx) {
            abyc abyc;
            akcr.b(odx, "reader");
            aeew aeew = odx.b().e;
            kaz a = kaz.a(odx.h(), "PreviewMediaPlayer");
            tpl.b bVar = null;
            Uri e = odx.h() == null ? odx.e() : null;
            aeew aeew2 = odx.b().e;
            tpl f = txi.f(this.a);
            if (f != null) {
                bVar = f.b;
            }
            akcr.b(aeew2, "receiver$0");
            Object a2 = aesf.a(aeew2.a);
            akcr.a(a2, "MediaType.fromValue(this.mediaType)");
            switch (txn.a[a2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    abyc = abyc.LAGUNA;
                    break;
                case 6:
                case 7:
                case 8:
                    abyc = abyc.NEWPORT;
                    break;
                case 9:
                case 10:
                    abyc = abyc.MALIBU;
                    break;
                case 11:
                    abyc = abyc.SCREAMING_MANTIS;
                    break;
                default:
                    if (!((bVar instanceof e) || (bVar instanceof tpl.b.a) || (bVar instanceof tpl.b.c))) {
                        if (!(bVar instanceof tpl.b.b)) {
                            abyc = abyc.CENTER_CROP;
                            break;
                        }
                    }
                    abyc = abyc.CENTER_INSIDE;
                    break;
            }
            return ajdx.b((Object) new c(aeew, a, e, abyc, acae.UNFILTERED));
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((odx) obj);
        }
    }

    /* renamed from: txi$at */
    static final class at<T> implements ajfb<c> {
        private /* synthetic */ txi a;

        at(txi txi) {
            this.a = txi;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a((c) obj);
        }
    }

    /* renamed from: txi$c */
    public static final class c implements ajej {
        public final aeew a;
        final kaz<jwj> b;
        final Uri c;
        final abyc d;
        final acae e;
        private final acaj f = null;

        public c(aeew aeew, kaz<jwj> kaz, Uri uri, abyc abyc, acae acae) {
            akcr.b(aeew, "media");
            akcr.b(abyc, "snapScaleType");
            akcr.b(acae, "visualFilter");
            this.a = aeew;
            this.b = kaz;
            this.c = uri;
            this.d = abyc;
            this.e = acae;
        }

        public final void dispose() {
            kaz kaz = this.b;
            if (kaz != null) {
                kaz.dispose();
            }
        }

        /* JADX WARNING: Missing block: B:14:0x003f, code skipped:
            if (defpackage.akcr.a(null, null) != false) goto L_0x0044;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0044;
        L_0x0002:
            r0 = r3 instanceof defpackage.txi.c;
            if (r0 == 0) goto L_0x0042;
        L_0x0006:
            r3 = (defpackage.txi.c) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0042;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0042;
        L_0x001c:
            r0 = r2.c;
            r1 = r3.c;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0042;
        L_0x0026:
            r0 = r2.d;
            r1 = r3.d;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0042;
        L_0x0030:
            r0 = r2.e;
            r3 = r3.e;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0042;
        L_0x003a:
            r3 = 0;
            r3 = defpackage.akcr.a(r3, r3);
            if (r3 == 0) goto L_0x0042;
        L_0x0041:
            goto L_0x0044;
        L_0x0042:
            r3 = 0;
            return r3;
        L_0x0044:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.txi$c.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            aeew aeew = this.a;
            int i = 0;
            int hashCode = (aeew != null ? aeew.hashCode() : 0) * 31;
            kaz kaz = this.b;
            hashCode = (hashCode + (kaz != null ? kaz.hashCode() : 0)) * 31;
            Uri uri = this.c;
            hashCode = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
            abyc abyc = this.d;
            hashCode = (hashCode + (abyc != null ? abyc.hashCode() : 0)) * 31;
            acae acae = this.e;
            if (acae != null) {
                i = acae.hashCode();
            }
            return (hashCode + i) * 31;
        }

        public final boolean isDisposed() {
            kaz kaz = this.b;
            return kaz != null ? kaz.isDisposed() : true;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Source(media=");
            stringBuilder.append(this.a);
            stringBuilder.append(", cachedBitmap=");
            stringBuilder.append(this.b);
            stringBuilder.append(", uri=");
            stringBuilder.append(this.c);
            stringBuilder.append(", snapScaleType=");
            stringBuilder.append(this.d);
            stringBuilder.append(", visualFilter=");
            stringBuilder.append(this.e);
            stringBuilder.append(", transform=");
            stringBuilder.append(null);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: txi$aj */
    static final class aj<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ txi a;

        aj(txi txi) {
            this.a = txi;
        }

        /* JADX WARNING: Missing block: B:7:0x0023, code skipped:
            if (r0 == null) goto L_0x0025;
     */
        /* JADX WARNING: Missing block: B:9:0x002b, code skipped:
            if (r0 == null) goto L_0x002d;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
            /*
            r5 = this;
            r6 = (defpackage.txi.c) r6;
            r0 = "imageSource";
            defpackage.akcr.b(r6, r0);
            r0 = r6.b;
            if (r0 == 0) goto L_0x002d;
        L_0x000b:
            r1 = "PreviewMediaPlayer";
            r0 = defpackage.kaz.a(r0, r1);
            if (r0 == 0) goto L_0x0025;
        L_0x0013:
            r1 = r5.a;
            r1 = r1.b;
            r2 = r0;
            r2 = (defpackage.ajej) r2;
            r1.a(r2);
            if (r0 == 0) goto L_0x0025;
        L_0x001f:
            r0 = defpackage.ajdx.b(r0);
            if (r0 != 0) goto L_0x002b;
        L_0x0025:
            r0 = defpackage.ajsn.a;
            r0 = defpackage.ajvo.a(r0);
        L_0x002b:
            if (r0 != 0) goto L_0x0078;
        L_0x002d:
            r0 = r6.c;
            if (r0 == 0) goto L_0x0077;
        L_0x0031:
            r0 = r5.a;
            r0 = r0.o;
            r0 = r0.b();
            r0 = (defpackage.jwc) r0;
            r6 = r6.c;
            r1 = r5.a;
            r1 = r1.a;
            r1 = r1.b();
            r1 = (defpackage.idd) r1;
            r2 = new jxa$a;
            r2.<init>();
            r3 = r5.a;
            r3 = defpackage.txi.h(r3);
            r3 = r3.getResources();
            r4 = "context.resources";
            defpackage.akcr.a(r3, r4);
            r3 = r3.getDisplayMetrics();
            r4 = r3.widthPixels;
            r3 = r3.heightPixels;
            r2.a(r4, r3);
            r3 = r5.a;
            r3 = r3.b;
            r2 = r2.a(r3);
            r2 = r2.b();
            r0 = r0.a(r6, r1, r2);
            goto L_0x0078;
        L_0x0077:
            r0 = 0;
        L_0x0078:
            if (r0 != 0) goto L_0x009a;
        L_0x007a:
            r6 = r5.a;
            r6 = r6.b;
            r6 = r6.isDisposed();
            if (r6 == 0) goto L_0x0090;
        L_0x0084:
            r6 = defpackage.ajsn.a;
            r6 = defpackage.ajvo.a(r6);
            r0 = "Single.never()";
            defpackage.akcr.a(r6, r0);
            return r6;
        L_0x0090:
            r6 = new java.lang.IllegalArgumentException;
            r0 = "Invalid source.";
            r6.<init>(r0);
            r6 = (java.lang.Throwable) r6;
            throw r6;
        L_0x009a:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.txi$aj.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: txi$ak */
    static final class ak<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ txi a;
        private /* synthetic */ c b;

        ak(txi txi, c cVar) {
            this.a = txi;
            this.b = cVar;
        }

        private ajdx<b> a(kaz<jwj> kaz) {
            akcr.b(kaz, "it");
            String str = "PreviewMediaPlayer";
            Object a = kaz.a((kaz) kaz, str);
            if (a != null) {
                try {
                    akcr.a(a, "refCountedDisposableBitmap");
                    Bitmap a2 = jwz.a(a);
                    Object a3;
                    if (this.a.b.isDisposed()) {
                        a3 = a.a(str);
                        this.a.b.a((ajej) a3);
                        this.a.g().a(a3);
                        a.dispose();
                    } else {
                        this.a.b.a((ajej) a);
                        adkk adkk = this.a.k;
                        if (adkk != null) {
                            adkk.a(a2);
                        }
                        a3 = a.a(str);
                        this.a.b.a((ajej) a3);
                        this.a.g().a(a3);
                        a.dispose();
                    }
                } finally {
                    a.dispose();
                }
            }
            return this.a.b(this.b, kaz);
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((kaz) obj);
        }
    }

    /* renamed from: txi$al */
    static final class al<T, R> implements ajfc<T, R> {
        private /* synthetic */ txi a;

        al(txi txi) {
            this.a = txi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "config");
            adkk adkk = this.a.k;
            if (adkk == null) {
                return null;
            }
            adiv adiv = bVar.a;
            if (adiv != null) {
                adkk.a(adiv);
            }
            adie adie = bVar.b;
            if (adie != null) {
                adkk.a(adie);
            }
            Surface surface = this.a.B;
            if (surface != null) {
                adkk.a(surface);
                adkk.b();
            }
            return adkk;
        }
    }

    /* renamed from: txi$z */
    static final class z implements ajev {
        private /* synthetic */ txi a;

        z(txi txi) {
            this.a = txi;
        }

        public final void run() {
            txi.g(this.a);
        }
    }

    /* renamed from: txi$g */
    static final class g<V> implements Callable<T> {
        final /* synthetic */ txi a;
        private /* synthetic */ c b;
        private /* synthetic */ kaz c;

        /* renamed from: txi$g$1 */
        static final class 1<T> implements ajfb<Float> {
            private /* synthetic */ g a;

            1(g gVar) {
                this.a = gVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (Float) obj;
                ofs d = txi.d(this.a.a);
                akcr.a(obj, "it");
                d.b(obj.floatValue());
            }
        }

        g(txi txi, c cVar, kaz kaz) {
            this.a = txi;
            this.b = cVar;
            this.c = kaz;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:87:0x0344 in {2, 10, 13, 16, 19, 20, 25, 26, 30, 31, 32, 33, 34, 37, 38, 41, 42, 43, 46, 51, 52, 65, 67, 70, 73, 74, 77, 80, 82, 84, 86} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        private defpackage.txi.b a() {
            /*
            r14 = this;
            r0 = "createConfigurationFromSource";
            defpackage.in.a(r0);
            r0 = r14.a;
            r0 = r0.F;
            if (r0 != 0) goto L_0x000f;
            r0 = r14.b;
            r0 = r0.e;
            r1 = r14.a;
            r2 = ((defpackage.vjn) r1.X.b());
            r3 = r14.b;
            r3 = r3.a;
            r3 = r3.a;
            r4 = "this.mediaType";
            defpackage.akcr.a(r3, r4);
            r3 = r3.intValue();
            r3 = defpackage.abyp.c(r3);
            r0 = r2.a(r0, r3);
            r1.x = r0;
            r0 = r14.a;
            r0 = r0.G;
            r0 = r0.entrySet();
            r0 = (java.lang.Iterable) r0;
            r0 = defpackage.ajyu.m(r0);
            r0 = r0.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x007b;
            r1 = r0.next();
            r1 = (java.util.Map.Entry) r1;
            r2 = r1.getValue();
            r2 = (defpackage.kaz) r2;
            r3 = "PreviewMediaPlayer";
            r2 = defpackage.kaz.a(r2, r3);
            if (r2 == 0) goto L_0x0040;
            r3 = r14.a;	 Catch:{ all -> 0x0076 }
            r3 = defpackage.txi.d(r3);	 Catch:{ all -> 0x0076 }
            r1 = r1.getKey();	 Catch:{ all -> 0x0076 }
            r1 = (defpackage.acae) r1;	 Catch:{ all -> 0x0076 }
            r5 = "bitmapRef";	 Catch:{ all -> 0x0076 }
            defpackage.akcr.a(r2, r5);	 Catch:{ all -> 0x0076 }
            r5 = defpackage.jwz.a(r2);	 Catch:{ all -> 0x0076 }
            r3.a(r1, r5);	 Catch:{ all -> 0x0076 }
            r2.dispose();
            goto L_0x0040;
            r0 = move-exception;
            r2.dispose();
            throw r0;
            r0 = r14.b;
            r0 = r0.a;
            r0 = r0.a;
            defpackage.akcr.a(r0, r4);
            r0 = r0.intValue();
            r0 = defpackage.abyp.i(r0);
            if (r0 == 0) goto L_0x00ab;
            r0 = r14.a;
            r0 = r0.m();
            r1 = new txi$g$1;
            r1.<init>(r14);
            r1 = (defpackage.ajfb) r1;
            r0 = r0.f(r1);
            r1 = "specRotationSubject.subs…er.setRotationAngle(it) }";
            defpackage.akcr.a(r0, r1);
            r1 = r14.a;
            r1 = r1.b;
            defpackage.ajvv.a(r0, r1);
            r0 = r14.b;
            r1 = r14.c;
            r0 = defpackage.txi.a(r0, r1);
            r1 = r14.b;
            r1 = r1.a;
            r1 = r1.b;
            r2 = 0;
            if (r1 == 0) goto L_0x00c1;
            r1 = r1.intValue();
            goto L_0x00c2;
            r1 = 0;
            r3 = r1 % 90;
            if (r3 != 0) goto L_0x0332;
            r1 = r1 % 180;
            if (r1 != 0) goto L_0x00cb;
            goto L_0x00d9;
            r1 = new abtl;
            r3 = r0.c();
            r0 = r0.b();
            r1.<init>(r3, r0);
            r0 = r1;
            r1 = r14.a;
            r1 = r1.M;
            r1 = r1.getSurfaceViewResolution();
            r3 = "surfaceViewManager.surfaceViewResolution";
            defpackage.akcr.a(r1, r3);
            r5 = r1.b();
            r1 = r14.a;
            r1 = r1.M;
            r1 = r1.getSurfaceViewResolution();
            defpackage.akcr.a(r1, r3);
            r6 = r1.c();
            r1 = r14.b;
            r1 = r1.d;
            r3 = defpackage.txj.a;
            r1 = r1.ordinal();
            r1 = r3[r1];
            r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            switch(r1) {
                case 1: goto L_0x0184;
                case 2: goto L_0x0146;
                case 3: goto L_0x0135;
                case 4: goto L_0x0135;
                case 5: goto L_0x0121;
                case 6: goto L_0x0110;
                default: goto L_0x010a;
            };
            r0 = new ajxk;
            r0.<init>();
            throw r0;
            r0 = new adie;
            r0.<init>();
            r1 = r14.a;
            r1 = defpackage.txi.d(r1);
            r3 = (float) r5;
            r5 = (float) r6;
            r6 = 1065792571; // 0x3f86b43b float:1.0523752 double:5.26571495E-315;
            goto L_0x0131;
            r0 = new adie;
            r0.<init>();
            r1 = r14.a;
            r1 = defpackage.txi.d(r1);
            r3 = (float) r5;
            r5 = (float) r6;
            r6 = 1065794722; // 0x3f86bca2 float:1.0526316 double:5.265725577E-315;
            r1.a(r3, r5, r6);
            goto L_0x0198;
            r0 = new adie;
            r0.<init>();
            r1 = r14.a;
            r1 = defpackage.txi.d(r1);
            r5 = (float) r5;
            r6 = (float) r6;
            r1.a(r5, r6, r3);
            goto L_0x0198;
            r1 = r14.b;
            r1 = r1.a;
            r1 = r1.d;
            if (r1 == 0) goto L_0x0153;
            r1 = r1.floatValue();
            goto L_0x0155;
            r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
            r5 = r14.b;
            r5 = r5.a;
            r5 = r5.e;
            if (r5 == 0) goto L_0x0161;
            r3 = r5.floatValue();
            r5 = r0.b();
            r5 = (float) r5;
            r5 = r5 * r1;
            r1 = r0.c();
            r1 = (float) r1;
            r1 = r1 * r3;
            r6 = (int) r5;
            r7 = (int) r1;
            r8 = r0.b();
            r9 = r0.c();
            r0 = r14.b;
            r10 = r0.a;
            r0 = r14.b;
            r11 = r0.d;
            r0 = defpackage.txm.a(r6, r7, r8, r9, r10, r11);
            goto L_0x0198;
            r7 = r0.b();
            r8 = r0.c();
            r0 = r14.b;
            r9 = r0.a;
            r0 = r14.b;
            r10 = r0.d;
            r0 = defpackage.txm.a(r5, r6, r7, r8, r9, r10);
            r1 = new java.util.ArrayList;
            r1.<init>();
            r3 = r14.b;
            r3 = r3.a;
            r3 = r3.a;
            r5 = "source.media.mediaType";
            defpackage.akcr.a(r3, r5);
            r3 = r3.intValue();
            r3 = defpackage.abyp.j(r3);
            if (r3 == 0) goto L_0x01de;
            r3 = r14.a;
            r3 = r3.T;
            r5 = r14.b;
            r5 = r5.c;
            r5 = java.lang.String.valueOf(r5);
            r6 = r14.a;
            r6 = r6.v;
            r7 = r14.b;
            r7 = r7.a;
            r7 = r7.a;
            defpackage.akcr.a(r7, r4);
            r4 = r7.intValue();
            r4 = defpackage.abyp.c(r4);
            r4 = java.lang.Boolean.valueOf(r4);
            r3 = r3.a(r5, r6, r4);
            r1.add(r3);
            r3 = r14.a;
            r3 = defpackage.txi.i(r3);
            r3 = r3.d;
            r3 = r3.b();
            r3 = (java.lang.Boolean) r3;
            r3 = r3.booleanValue();
            if (r3 == 0) goto L_0x020f;
            r3 = r14.b;
            r3 = r3.c;
            if (r3 == 0) goto L_0x0208;
            r4 = r14.a;
            r4 = r4.V;
            r5 = new tvz;
            r6 = r14.a;
            r6 = r6.v;
            r5.<init>(r3, r6);
            r4.a(r5);
            r3 = r14.a;
            r3 = r3.U;
            r1.add(r3);
            r3 = r14.a;
            r3 = defpackage.txi.f(r3);
            r4 = 1;
            if (r3 == 0) goto L_0x0269;
            r3 = defpackage.tpn.a(r3);
            if (r3 != 0) goto L_0x0269;
            r3 = r14.a;
            r3 = defpackage.txi.f(r3);
            if (r3 == 0) goto L_0x0269;
            r3 = defpackage.tpn.b(r3);
            if (r3 != r4) goto L_0x0269;
            r3 = r14.a;
            r3 = r3.S;
            r5 = defpackage.tum.SNAP_CROP_ENABLED;
            r5 = (defpackage.fth) r5;
            r3 = r3.a(r5);
            if (r3 == 0) goto L_0x0269;
            r3 = r14.a;
            r3 = r3.f();
            r3 = r3.a();
            r5 = r14.a;
            r5 = defpackage.txi.d(r5);
            r6 = r14.a;
            r6 = r6.e;
            r6 = (float) r6;
            r7 = r14.a;
            r7 = r7.f;
            r7 = (float) r7;
            r6 = r6 / r7;
            if (r3 == 0) goto L_0x0261;
            r7 = r3;
            r7 = (defpackage.adix) r7;
            r5.a(r6, r7, r0);
            r1.add(r3);
            goto L_0x0269;
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type com.snapchat.mediaengine.passes.TransformRenderPass";
            r0.<init>(r1);
            throw r0;
            r3 = r14.a;
            r3 = defpackage.txi.i(r3);
            r3 = r3.c;
            r3 = r3.b();
            r3 = (java.lang.Boolean) r3;
            r3 = r3.booleanValue();
            if (r3 == 0) goto L_0x028e;
            r3 = r14.a;
            r3 = r3.y;
            r3 = r3.b();
            r3 = (defpackage.oft) r3;
            r3 = r3.a();
            r1.add(r3);
            r3 = new adiu;
            r5 = r14.a;
            r5 = defpackage.txi.d(r5);
            r5 = r5.a();
            r6 = r14.a;
            r6 = defpackage.txi.d(r6);
            r6 = r6.a();
            r7 = r14.a;
            r7 = r7.j();
            r7 = (defpackage.adiu.b) r7;
            r3.<init>(r5, r6, r7);
            r5 = new adiu;
            r6 = new adii;
            r6.<init>();
            r9 = r6;
            r9 = (defpackage.adiv) r9;
            r10 = r3;
            r10 = (defpackage.adiv) r10;
            r3 = r14.a;
            r3 = r3.h();
            r11 = r3;
            r11 = (defpackage.adiu.b) r11;
            r3 = r14.a;
            r3 = r3.i();
            r12 = r3.b();
            r3 = r14.a;
            r3 = r3.i();
            r13 = r3.c();
            r8 = r5;
            r8.<init>(r9, r10, r11, r12, r13);
            r1.add(r5);
            r3 = r1.isEmpty();
            if (r3 == 0) goto L_0x02ee;
            r1 = new adii;
            r1.<init>();
            r1 = (defpackage.adiv) r1;
            goto L_0x0319;
            r3 = r1.size();
            if (r3 != r4) goto L_0x02fe;
            r1 = r1.get(r2);
            r2 = "renderPassList[0]";
            defpackage.akcr.a(r1, r2);
            goto L_0x02eb;
            r1 = (java.util.Collection) r1;
            r2 = new defpackage.adiv[r2];
            r1 = r1.toArray(r2);
            if (r1 == 0) goto L_0x032a;
            r1 = (defpackage.adiv[]) r1;
            r2 = r1.length;
            r1 = java.util.Arrays.copyOf(r1, r2);
            r1 = (defpackage.adiv[]) r1;
            r2 = new adiq;
            r2.<init>(r1);
            r1 = r2;
            r1 = (defpackage.adiv) r1;
            defpackage.in.a();
            r2 = new txi$b;
            r3 = r14.a;
            r3 = r3.a();
            r3 = (defpackage.adfh) r3;
            r2.<init>(r1, r0, r3);
            return r2;
            r0 = new ajxt;
            r1 = "null cannot be cast to non-null type kotlin.Array<T>";
            r0.<init>(r1);
            throw r0;
            r0 = new java.lang.IllegalStateException;
            r1 = java.lang.String.valueOf(r1);
            r2 = "illegal input playback rotation ";
            r1 = r2.concat(r1);
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.txi$g.a():txi$b");
        }

        public final /* synthetic */ Object call() {
            return a();
        }
    }

    /* renamed from: txi$az */
    public static final class az<T1, T2, R> implements ajex<Boolean, Boolean, Boolean> {
        public static final az a = new az();

        az() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            boolean z = ((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue();
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: txi$ba */
    public static final class ba<T> implements ajfb<Boolean> {
        private /* synthetic */ txi a;
        private /* synthetic */ acae b;
        private /* synthetic */ acae c;
        private /* synthetic */ float d;

        public ba(txi txi, acae acae, acae acae2, float f) {
            this.a = txi;
            this.b = acae;
            this.c = acae2;
            this.d = f;
        }

        public final /* synthetic */ void accept(Object obj) {
            txi txi = this.a;
            txi.F = this.b;
            txi.d(txi).a(this.b, this.c);
            txi.d(this.a).a(this.d);
        }
    }

    /* renamed from: txi$ai */
    static final class ai<V> implements Callable<T> {
        private /* synthetic */ txi a;
        private /* synthetic */ toy b;

        ai(txi txi, toy toy) {
            this.a = txi;
            this.b = toy;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x007b in {2, 9, 11} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object call() {
            /*
            r4 = this;
            r0 = r4.a;
            r0 = r0.t;
            if (r0 != 0) goto L_0x000b;
            r1 = "playList";
            defpackage.akcr.a(r1);
            r0 = (java.lang.Iterable) r0;
            r0 = r0.iterator();
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x0071;
            r1 = r0.next();
            r1 = (defpackage.abyi) r1;
            r2 = r1.b;
            r3 = r4.b;
            r3 = r3.b;
            r2 = defpackage.akcr.a(r2, r3);
            if (r2 == 0) goto L_0x0011;
            r0 = r4.a;
            r0 = defpackage.txi.e(r0);
            r2 = defpackage.txl.b.STOP;
            r2 = (defpackage.absz.a) r2;
            r3 = java.lang.Boolean.FALSE;
            r0.a(r2, r3);
            r0 = r4.a;
            r0 = r0.e();
            r2 = 1;
            r0.set(r2);
            r0 = r4.a;
            r2 = r4.b;
            r0.q = r2;
            r0 = r0.p;
            r2 = defpackage.txd.SEEK_STARTED;
            r0.a(r2);
            r0 = r4.a;
            r0 = defpackage.txi.e(r0);
            r2 = defpackage.txl.c.START;
            r2 = (defpackage.absz.a) r2;
            r0.a(r2, r1);
            r0 = r4.a;
            r0 = defpackage.txi.e(r0);
            r1 = defpackage.txl.a.PLAY;
            r1 = (defpackage.absz.a) r1;
            r2 = defpackage.absy.VOID;
            r0 = r0.a(r1, r2);
            r0 = java.lang.Boolean.valueOf(r0);
            return r0;
            r0 = new java.util.NoSuchElementException;
            r1 = "Collection contains no element matching the predicate.";
            r0.<init>(r1);
            r0 = (java.lang.Throwable) r0;
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.txi$ai.call():java.lang.Object");
        }
    }

    /* renamed from: txi$aa */
    static final class aa implements ajev {
        private /* synthetic */ txi a;

        aa(txi txi) {
            this.a = txi;
        }

        public final void run() {
            txi.g(this.a);
        }
    }

    /* renamed from: txi$ab */
    static final class ab<T> implements ajfl<txd> {
        public static final ab a = new ab();

        ab() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            txd txd = (txd) obj;
            akcr.b(txd, "it");
            return txd == txd.START;
        }
    }

    /* renamed from: txi$ac */
    static final class ac<T> implements ajfb<txd> {
        private /* synthetic */ txi a;

        ac(txi txi) {
            this.a = txi;
        }

        public final /* synthetic */ void accept(Object obj) {
            acay acay = this.a.j;
            if (acay != null) {
                acay.a(this.a.D);
            }
            txi txi = this.a;
            txi.a(txi.E);
        }
    }

    /* renamed from: txi$am */
    static final class am<T> implements ajfb<b> {
        final /* synthetic */ txi a;
        private /* synthetic */ c b;

        /* renamed from: txi$am$a */
        static final class a<T> implements ajfb<adgw> {
            private /* synthetic */ am a;
            private /* synthetic */ b b;

            a(am amVar, b bVar) {
                this.a = amVar;
                this.b = bVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (adgw) obj;
                toz d = this.a.a.d();
                akcr.a(obj, "it");
                d.a(obj);
            }
        }

        am(txi txi, c cVar) {
            this.a = txi;
            this.b = cVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            b bVar = (b) obj;
            if (!this.a.b.isDisposed()) {
                acay acay = this.a.j;
                if (acay != null) {
                    adiv adiv = bVar.a;
                    if (adiv != null) {
                        acay.a(adiv);
                    }
                    adie adie = bVar.b;
                    if (adie != null) {
                        acay.a(adie);
                    }
                    adfh adfh = bVar.c;
                    if (adfh != null) {
                        acay.a(adfh);
                    }
                    acay.a(txi.h(this.a), this.b.c, null);
                    acay.c();
                    this.a.b.a(acay.x().f((ajfb) new a(this, bVar)));
                }
            }
        }
    }

    /* renamed from: txi$ax */
    public static final class ax<T1, T2, R> implements ajex<Boolean, Boolean, Boolean> {
        public static final ax a = new ax();

        ax() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            boolean z = ((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue();
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: txi$ay */
    public static final class ay<T> implements ajfb<Boolean> {
        private /* synthetic */ txi a;
        private /* synthetic */ kaz b;
        private /* synthetic */ acae c;

        public ay(txi txi, kaz kaz, acae acae) {
            this.a = txi;
            this.b = kaz;
            this.c = acae;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = kaz.a(this.b, "PreviewMediaPlayer");
            if (obj != null) {
                this.a.c.a((ajej) obj);
                Map map = this.a.G;
                acae acae = this.c;
                akcr.a(obj, "this");
                map.put(acae, obj);
                if (obj != null) {
                    Bitmap a = jwz.a(obj);
                    if (a != null) {
                        txi.d(this.a).a(this.c, a);
                    }
                }
            }
        }
    }

    /* renamed from: txi$d */
    final class d implements adkn {
        public final void a() {
            if (((AtomicBoolean) txi.this.ad.b()).compareAndSet(false, true)) {
                txi.this.p.a((Object) txd.FIRST_FRAME);
            }
        }

        public final void b() {
            txi.this.p.a((Object) txd.START);
        }

        public final void c() {
            txi.this.p.a((Object) txd.STOP);
        }

        public final void d() {
            if (txi.this.w) {
                txi.this.p.a((Object) txd.RESTART);
            }
        }

        public final void e() {
            txi.this.p.a((Object) txd.FRAME_DRAWN);
            txi.a(txi.this);
        }

        public final void f() {
            txi.this.p.a((Object) txd.FRAME_DROPPED);
        }

        public final void g() {
            txi.this.p.a((Object) txd.SHUT_DOWN);
        }

        public final void h() {
            txi.this.e().set(true);
            txi.this.p.a((Object) txd.SEEK_STARTED);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(txi.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(txi.class), "soundToolsProcessingCore", "getSoundToolsProcessingCore()Lcom/snap/preview/player/audio/SoundToolsProcessingCore;"), new akdc(akde.a(txi.class), "mediaRenderingController", "getMediaRenderingController()Lcom/snap/rendering/api/MediaRenderingController;"), new akdc(akde.a(txi.class), "displayMetrics", "getDisplayMetrics()Landroid/util/DisplayMetrics;"), new akdc(akde.a(txi.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(txi.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(txi.class), "mediaPlayerCapabilities", "getMediaPlayerCapabilities()Lcom/snap/preview/api/MediaPlayerCapabilities;"), new akdc(akde.a(txi.class), "seekRequested", "getSeekRequested()Ljava/util/concurrent/atomic/AtomicBoolean;"), new akdc(akde.a(txi.class), "firstFrameRendered", "getFirstFrameRendered()Ljava/util/concurrent/atomic/AtomicBoolean;"), new akdc(akde.a(txi.class), "transformRenderPassController", "getTransformRenderPassController()Lcom/snap/media/api/renderpass/TransformRenderPassController;"), new akdc(akde.a(txi.class), "previewTransitionRenderPassController", "getPreviewTransitionRenderPassController$preview_core_release()Lcom/snap/media/api/renderpass/TransformRenderPassController;"), new akdc(akde.a(txi.class), "skyFilterBaseBitmapSubject", "getSkyFilterBaseBitmapSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(txi.class), "rawFrames", "getRawFrames()Lcom/snap/preview/player/ReadPixelsObservable;"), new akdc(akde.a(txi.class), "readRawFrameResolution", "getReadRawFrameResolution()Lcom/snapchat/android/framework/ui/Resolution;"), new akdc(akde.a(txi.class), "filteredFrames", "getFilteredFrames()Lcom/snap/preview/player/ReadPixelsObservable;"), new akdc(akde.a(txi.class), "transitionSchedulers", "getTransitionSchedulers()Lio/reactivex/Scheduler;"), new akdc(akde.a(txi.class), "specRotationSubject", "getSpecRotationSubject()Lio/reactivex/subjects/BehaviorSubject;"), new akdc(akde.a(txi.class), "mediaPlayerOnErrorListener", "getMediaPlayerOnErrorListener()Lcom/snapchat/android/media/player/video/MediaPlayerInterface$OnErrorListener;"), new akdc(akde.a(txi.class), "videoPlaybackListener", "getVideoPlaybackListener()Lcom/snap/preview/player/PreviewMediaPlayer$VideoPlaybackListener;"), new akdc(akde.a(txi.class), "imagePlaybackListener", "getImagePlaybackListener()Lcom/snap/preview/player/PreviewMediaPlayer$ImagePlaybackListener;")};
    }

    public txi(toc toc, zgb zgb, SurfaceViewManager surfaceViewManager, jwe jwe, twz twz, ajwy<acba> ajwy, ajwy<acaw> ajwy2, ajwy<adkk> ajwy3, ftl ftl, ofq ofq, adim adim, ajwo<tvz> ajwo, tvq tvq, ajwy<DisplayMetrics> ajwy4, ajwy<vjn> ajwy5, ajwy<txs> ajwy6, ajwy<txb> ajwy7) {
        toc toc2 = toc;
        zgb zgb2 = zgb;
        SurfaceViewManager surfaceViewManager2 = surfaceViewManager;
        jwe jwe2 = jwe;
        twz twz2 = twz;
        ajwy<acba> ajwy8 = ajwy;
        ajwy<acaw> ajwy9 = ajwy2;
        ajwy<adkk> ajwy10 = ajwy3;
        ftl ftl2 = ftl;
        ofq ofq2 = ofq;
        adim adim2 = adim;
        ajwo<tvz> ajwo2 = ajwo;
        tvq tvq2 = tvq;
        ajwy<DisplayMetrics> ajwy11 = ajwy4;
        ajwy<vjn> ajwy12 = ajwy5;
        ajwy<txs> ajwy13 = ajwy6;
        akcr.b(toc2, "previewFeature");
        akcr.b(zgb2, "schedulersProvider");
        akcr.b(surfaceViewManager2, "surfaceViewManager");
        akcr.b(jwe2, "bitmapLoaderFactory");
        akcr.b(twz2, "previewMediaReaderManager");
        akcr.b(ajwy8, "scMediaPlayerProvider");
        akcr.b(ajwy9, "advancedScMediaPlayerProvider");
        akcr.b(ajwy10, "imagePlayerProvider");
        akcr.b(ftl2, "configProvider");
        akcr.b(ofq2, "renderPassFactory");
        akcr.b(adim2, "lensCoreRenderPass");
        akcr.b(ajwo2, "snapInfoSubject");
        akcr.b(tvq2, "editsContainerConfigProvider");
        akcr.b(ajwy11, "displayMetricsProvider");
        akcr.b(ajwy12, "mediaRenderingControllerProvider");
        akcr.b(ajwy6, "soundToolsProcessingCoreProvider");
        akcr.b(ajwy7, "mediaPlayerCapabilitiesProvider");
        ajwy<txs> ajwy14 = ajwy6;
        this.L = toc2;
        this.am = zgb2;
        this.M = surfaceViewManager2;
        this.N = jwe2;
        this.O = twz2;
        this.P = ajwy8;
        this.Q = ajwy9;
        this.R = ajwy10;
        this.S = ftl2;
        this.T = ofq2;
        this.U = adim2;
        this.V = ajwo2;
        this.W = ajxh.a(new ao(ajwy14));
        this.X = ajxh.a(new y(ajwy12));
        this.Y = ajxh.a(new j(ajwy11));
        this.b = new ajei();
        this.c = new ajei();
        this.d = new ajei();
        this.e = b().widthPixels;
        this.f = b().heightPixels;
        ajej e = tvq.b.e((ajfb) new 1(this));
        akcr.a((Object) e, "editsContainerConfigProv…solution.height\n        }");
        ajvv.a(e, this.d);
        this.Z = ajxh.a(new ag(this));
        Object ajwl = new ajwl();
        String str = "BehaviorSubject.create<Boolean>()";
        akcr.a(ajwl, str);
        this.l = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, str);
        this.m = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<Source>()");
        this.n = ajwl;
        ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<MediaType>()");
        this.aa = ajwl;
        this.o = ajxh.a(new f(this));
        ajwl = new ajwo();
        akcr.a(ajwl, "PublishSubject.create<PlaybackState>()");
        this.p = (ajws) ajwl;
        this.ab = ajxh.a(new w(ajwy7));
        this.ac = ajxh.a(ah.a);
        this.ad = ajxh.a(l.a);
        String str2 = MultiSnapThumbnailView.THUMBNAIL_INVALID_KEY;
        this.u = str2;
        this.v = str2;
        this.af = ajxh.a(new au(this));
        this.y = ajxh.a(new ad(this));
        this.ag = ajxh.a(an.a);
        this.ah = ajxh.a(ae.a);
        this.ai = ajxh.a(new af(this));
        this.aj = ajxh.a(k.a);
        this.A = true;
        this.D = 1.0d;
        this.E = true;
        this.G = new ConcurrentHashMap();
        this.ak = ajxh.a(new aw(this));
        this.al = ajxh.a(ap.a);
        this.I = ajxh.a(x.a);
        this.J = ajxh.a(new bb(this));
        this.K = ajxh.a(new m(this));
    }

    static abtl a(c cVar, kaz<jwj> kaz) {
        if (kaz != null) {
            abtl abtl;
            kaz a = kaz.a((kaz) kaz, "PreviewMediaPlayer");
            if (a != null) {
                try {
                    int width = jwz.a(kaz).getWidth();
                    Integer num = cVar.a.q;
                    if (num != null) {
                        if (width == num.intValue()) {
                            jwz.a(kaz).getHeight();
                            Integer num2 = cVar.a.p;
                            if (num2 != null) {
                                num2.intValue();
                            }
                        }
                    }
                    abtl = new abtl(jwz.a(kaz).getWidth(), jwz.a(kaz).getHeight());
                } finally {
                    a.dispose();
                }
            } else {
                abtl = null;
            }
            if (abtl != null) {
                return abtl;
            }
        }
        Object obj = cVar.a.q;
        akcr.a(obj, "source.media.width");
        int intValue = obj.intValue();
        Object obj2 = cVar.a.p;
        akcr.a(obj2, "source.media.height");
        return new abtl(intValue, obj2.intValue());
    }

    private final void a(toy toy, aesf aesf) {
        if (!akcr.a(this.v, toy.a)) {
            b(toy);
        } else if (abyp.a(aesf)) {
            acay acay = this.j;
            if (acay != null) {
                acay.a(toy.c);
            }
        } else {
            e().set(true);
            adkk adkk = this.k;
            if (adkk != null) {
                adkk.a((long) toy.c);
            }
        }
    }

    private final void b(toy toy) {
        this.b.a(ajdx.c((Callable) new ai(this, toy)).b(l()).c());
    }

    public static final /* synthetic */ ofs d(txi txi) {
        ofs ofs = txi.x;
        if (ofs == null) {
            akcr.a("splitRenderPassController");
        }
        return ofs;
    }

    public static final /* synthetic */ abta e(txi txi) {
        abta abta = txi.H;
        if (abta == null) {
            akcr.a("stateMachine");
        }
        return abta;
    }

    public static final /* synthetic */ tpl f(txi txi) {
        tpl tpl = txi.r;
        if (tpl == null) {
            akcr.a("previewStartUpConfig");
        }
        return tpl;
    }

    public static final /* synthetic */ void g(txi txi) {
        txi.p.a((Object) txd.MEDIA_READY);
        txi.m.a(Boolean.TRUE);
    }

    public static final /* synthetic */ Context h(txi txi) {
        Context context = txi.g;
        if (context == null) {
            akcr.a("context");
        }
        return context;
    }

    public static final /* synthetic */ tpj i(txi txi) {
        tpj tpj = txi.s;
        if (tpj == null) {
            akcr.a("previewPreloadedConfigs");
        }
        return tpj;
    }

    private final int q() {
        acay acay = this.j;
        return acay != null ? acay.k() : 0;
    }

    private final int r() {
        adkk adkk = this.k;
        return adkk != null ? (int) adkk.d() : 0;
    }

    public final txs a() {
        return (txs) this.W.b();
    }

    public final void a(double d) {
        this.D = d;
        acay acay = this.j;
        if (acay != null) {
            acay.a(d);
        }
    }

    /* Access modifiers changed, original: final */
    public final <T> void a(absz.a<d, T> aVar, T t) {
        l().a((Runnable) new av(this, aVar, t));
    }

    /* Access modifiers changed, original: final */
    public final void a(Surface surface) {
        this.B = surface;
        if (surface != null) {
            this.l.a(Boolean.TRUE);
        }
    }

    public final void a(toy toy) {
        akcr.b(toy, "position");
        if (!(akcr.a(this.q, (Object) toy) || akcr.a(k(), (Object) toy))) {
            aesf aesf = (aesf) this.aa.p();
            if (aesf != null) {
                if (this.q == null) {
                    this.q = toy;
                    akcr.a((Object) aesf, "it");
                    a(toy, aesf);
                    return;
                }
                this.ae = toy;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0043  */
    public final void a(defpackage.txi.c r4) {
        /*
        r3 = this;
        r0 = r3.C;
        r1 = 0;
        if (r0 == 0) goto L_0x0008;
    L_0x0005:
        r0 = r0.c;
        goto L_0x0009;
    L_0x0008:
        r0 = r1;
    L_0x0009:
        if (r4 == 0) goto L_0x000e;
    L_0x000b:
        r2 = r4.c;
        goto L_0x000f;
    L_0x000e:
        r2 = r1;
    L_0x000f:
        r0 = defpackage.akcr.a(r0, r2);
        if (r0 == 0) goto L_0x0049;
    L_0x0015:
        r0 = r3.C;
        if (r0 == 0) goto L_0x002a;
    L_0x0019:
        r0 = r0.b;
        if (r0 == 0) goto L_0x002a;
    L_0x001d:
        r0 = r0.a();
        r0 = (defpackage.jwj) r0;
        if (r0 == 0) goto L_0x002a;
    L_0x0025:
        r0 = r0.a();
        goto L_0x002b;
    L_0x002a:
        r0 = r1;
    L_0x002b:
        if (r4 == 0) goto L_0x003d;
    L_0x002d:
        r2 = r4.b;
        if (r2 == 0) goto L_0x003d;
    L_0x0031:
        r2 = r2.a();
        r2 = (defpackage.jwj) r2;
        if (r2 == 0) goto L_0x003d;
    L_0x0039:
        r1 = r2.a();
    L_0x003d:
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0049;
    L_0x0043:
        if (r4 == 0) goto L_0x0048;
    L_0x0045:
        r4.dispose();
    L_0x0048:
        return;
    L_0x0049:
        r0 = r3.C;
        if (r0 == 0) goto L_0x0050;
    L_0x004d:
        r0.dispose();
    L_0x0050:
        r3.C = r4;
        if (r4 == 0) goto L_0x0064;
    L_0x0054:
        r0 = r3.aa;
        r1 = r4.a;
        r1 = r1.a();
        r0.a(r1);
        r0 = r3.n;
        r0.a(r4);
    L_0x0064:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.txi.a(txi$c):void");
    }

    public final void a(boolean z) {
        acay acay;
        float f;
        this.E = z;
        if (z) {
            acay = this.j;
            if (acay != null) {
                f = 1.0f;
            }
        }
        acay = this.j;
        if (acay != null) {
            f = MapboxConstants.MINIMUM_ZOOM;
        } else {
            return;
        }
        acay.a(f, f);
    }

    public final ajdx<b> b(c cVar, kaz<jwj> kaz) {
        akcr.b(cVar, "source");
        Object c = ajdx.c((Callable) new g(this, cVar, kaz));
        akcr.a(c, "Single.fromCallable {\n  …ProcessingCore)\n        }");
        return c;
    }

    /* Access modifiers changed, original: final */
    public final DisplayMetrics b() {
        return (DisplayMetrics) this.Y.b();
    }

    public final zfw c() {
        return (zfw) this.Z.b();
    }

    public final toz d() {
        return (toz) this.ab.b();
    }

    /* Access modifiers changed, original: final */
    public final AtomicBoolean e() {
        return (AtomicBoolean) this.ac.b();
    }

    public final oft f() {
        return (oft) this.af.b();
    }

    public final ajwl<kaz<jwj>> g() {
        return (ajwl) this.ag.b();
    }

    public final String getTag() {
        return toString();
    }

    public final txq h() {
        return (txq) this.ah.b();
    }

    public final abtl i() {
        return (abtl) this.ai.b();
    }

    public final txq j() {
        return (txq) this.aj.b();
    }

    public final toy k() {
        return this.k != null ? new toy(this.v, this.u, r()) : new toy(this.v, this.u, q());
    }

    /* Access modifiers changed, original: final */
    public final ajdw l() {
        return (ajdw) this.ak.b();
    }

    public final ajwl<Float> m() {
        return (ajwl) this.al.b();
    }

    public final void n() {
        a((absz.a) txl.a.PLAY, absy.VOID);
    }

    public final void o() {
        a((absz.a) txl.a.PAUSE, absy.VOID);
    }

    public final void onRequestIgnored() {
        this.A = false;
    }

    public final void onSurfaceChanged(Surface surface, abtl abtl) {
        akcr.b(surface, "surface");
        if (abtl != null) {
            adkk adkk = this.k;
            if (adkk != null) {
                adkk.a(abtl.b(), abtl.c());
            }
        }
    }

    public final void onSurfaceGoingToRevoke(boolean z) {
        a((absz.a) txl.b.STOP, Boolean.FALSE);
        if (z) {
            try {
                CountDownLatch countDownLatch = this.z;
                if (countDownLatch == null) {
                    akcr.a("surfaceReleaseLatch");
                }
                countDownLatch.await(3000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void onSurfaceReady(Surface surface, abtl abtl) {
        akcr.b(surface, "surface");
        a(surface);
        this.p.a((Object) txd.SURFACE_READY);
    }

    public final ajdp<aesf> p() {
        Object f = this.aa.f();
        akcr.a(f, "onSourceMediaTypeChanged.hide()");
        return f;
    }
}
