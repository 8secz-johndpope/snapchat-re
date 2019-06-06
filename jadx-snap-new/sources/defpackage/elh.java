package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Vibrator;
import defpackage.ele.a;
import defpackage.ele.b;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: elh */
public final class elh implements a {
    ajej a;
    final ajxe b;
    final b c;
    private final zfw d = zgb.a(dnh.f.callsite("MapTooltipPresenter"));
    private ajej e;
    private boolean f;
    private final ajdp<Point> g;
    private final ajdp<Point> h;
    private final zkq i;

    /* renamed from: elh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: elh$h */
    static final class h extends akcs implements akbk<Vibrator> {
        private /* synthetic */ Context a;

        h(Context context) {
            this.a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return abxv.a(this.a);
        }
    }

    /* renamed from: elh$f */
    static final class f<T> implements ajfb<Rect> {
        private /* synthetic */ elh a;

        f(elh elh) {
            this.a = elh;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c.a(((Rect) obj).top);
        }
    }

    /* renamed from: elh$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: elh$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ elh a;

        d(elh elh) {
            this.a = elh;
        }

        public final /* synthetic */ Object call() {
            abxv.a((Vibrator) this.a.b.b(), 50);
            return ajxw.a;
        }
    }

    /* renamed from: elh$e */
    static final class e implements Runnable {
        private /* synthetic */ elh a;

        e(elh elh) {
            this.a = elh;
        }

        public final void run() {
            this.a.c();
            this.a.a = null;
        }
    }

    /* renamed from: elh$b */
    static final class b<T> implements ajfb<Point> {
        private /* synthetic */ elh a;

        b(elh elh) {
            this.a = elh;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c();
        }
    }

    /* renamed from: elh$c */
    static final class c<T> implements ajfb<Point> {
        private /* synthetic */ elh a;

        c(elh elh) {
            this.a = elh;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(elh.class), "vibrationController", "getVibrationController()Landroid/os/Vibrator;");
        a aVar = new a();
    }

    public elh(Context context, b bVar, ajdp<Point> ajdp, ajdp<Point> ajdp2, zgb zgb, zkq zkq) {
        akcr.b(context, "context");
        akcr.b(bVar, "view");
        akcr.b(ajdp, "singleTapObservable");
        akcr.b(ajdp2, "doubleTapObservable");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zkq, "insetsDetector");
        this.c = bVar;
        this.g = ajdp;
        this.h = ajdp2;
        this.i = zkq;
        this.b = ajxh.a(new h(context));
        this.f = true;
    }

    public final ajej a() {
        Object a = this.i.a().c(1).a((ajdw) this.d.l()).a((ajfb) new f(this), (ajfb) g.a);
        akcr.a(a, "insetsDetector.windowRec…ventListener.start()\") })");
        return a;
    }

    public final void a(float f) {
        this.c.a(f);
    }

    public final void b() {
        ajej ajej = this.e;
        if (ajej != null) {
            ajej.dispose();
        }
        this.e = new ajei(this.g.f((ajfb) new b(this)), this.h.f((ajfb) new c(this)), ajdx.c((Callable) new d(this)).b((ajdw) this.d.h()).c());
        if (this.a == null) {
            this.c.e();
        }
        ajej = this.a;
        if (ajej != null) {
            ajej.dispose();
        }
        this.a = this.d.l().a(new e(this), 4000, TimeUnit.MILLISECONDS);
        this.c.a();
        this.f = true;
    }

    public final void c() {
        if (this.f) {
            this.f = false;
            ajej ajej = this.a;
            if (ajej != null) {
                ajej.dispose();
                this.a = null;
                this.c.f();
                this.c.b();
                return;
            }
            this.c.d();
            this.c.g();
        }
    }

    public final void d() {
        ajej ajej = this.a;
        if (ajej != null) {
            ajej.dispose();
            this.a = null;
        } else {
            this.c.c();
        }
        this.c.h();
        this.f = true;
    }

    public final void e() {
        ajej ajej = this.e;
        if (ajej != null) {
            ajej.dispose();
        }
        this.e = null;
        c();
    }

    public final void f() {
        this.c.f();
        this.c.b();
        this.f = false;
    }

    public final void g() {
        this.c.g();
        this.c.d();
        ajej ajej = this.e;
        if (ajej != null) {
            ajej.dispose();
        }
        this.e = null;
        this.f = false;
    }

    public final void h() {
        this.c.g();
        this.c.d();
    }
}
