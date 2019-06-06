package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: gpv */
public final class gpv {

    /* renamed from: gpv$c */
    static final class c implements ajev {
        private /* synthetic */ AtomicReference a;
        private /* synthetic */ gpu b;

        c(AtomicReference atomicReference, gpu gpu) {
            this.a = atomicReference;
            this.b = gpu;
        }

        public final void run() {
            ajej ajej = (ajej) this.a.get();
            if (ajej != null) {
                this.b.a.b(ajej);
            }
        }
    }

    /* renamed from: gpv$b */
    static final class b implements ajev {
        private /* synthetic */ AtomicReference a;
        private /* synthetic */ gpu b;

        b(AtomicReference atomicReference, gpu gpu) {
            this.a = atomicReference;
            this.b = gpu;
        }

        public final void run() {
            ajej ajej = (ajej) this.a.get();
            if (ajej != null) {
                this.b.a.b(ajej);
            }
        }
    }

    /* renamed from: gpv$f */
    static final class f implements ajev {
        private /* synthetic */ AtomicReference a;
        private /* synthetic */ gpu b;

        f(AtomicReference atomicReference, gpu gpu) {
            this.a = atomicReference;
            this.b = gpu;
        }

        public final void run() {
            ajej ajej = (ajej) this.a.get();
            if (ajej != null) {
                this.b.a.b(ajej);
            }
        }
    }

    /* renamed from: gpv$a */
    public static final class a extends akcs implements akbl<Throwable, ajxw> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: gpv$d */
    public static final class d extends akcs implements akbl<T, ajxw> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return ajxw.a;
        }
    }

    /* renamed from: gpv$e */
    public static final class e extends akcs implements akbl<Throwable, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: gpv$g */
    public static final class g extends akcs implements akbk<ajxw> {
        public static final g a = new g();

        g() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ajxw.a;
        }
    }

    public static final ajej a(ajcx ajcx, akbk<ajxw> akbk, akbl<? super Throwable, ajxw> akbl, gpu gpu) {
        akcr.b(ajcx, "receiver$0");
        akcr.b(akbk, "onComplete");
        akcr.b(akbl, "onError");
        akcr.b(gpu, "userSession");
        AtomicReference atomicReference = new AtomicReference(null);
        Object a = ajcx.f(new b(atomicReference, gpu)).a((ajev) new gpw(akbk), (ajfb) new gpx(akbl));
        atomicReference.set(a);
        gpu.a.a((ajej) a);
        akcr.a(a, "this.doFinally { disposa…ssionDisposable.add(it) }");
        return a;
    }

    public static final <T> ajej a(ajdp<T> ajdp, akbl<? super T, ajxw> akbl, akbl<? super Throwable, ajxw> akbl2, gpu gpu) {
        akcr.b(ajdp, "receiver$0");
        akcr.b(akbl, "onNext");
        akcr.b(akbl2, "onError");
        akcr.b(gpu, "userSession");
        AtomicReference atomicReference = new AtomicReference(null);
        Object a = ajdp.a((ajev) new c(atomicReference, gpu)).a((ajfb) new gpx(akbl), (ajfb) new gpx(akbl2));
        atomicReference.set(a);
        gpu.a.a((ajej) a);
        akcr.a(a, "this.doFinally { disposa…ssionDisposable.add(it) }");
        return a;
    }

    public static final <T> ajej a(ajdx<T> ajdx, akbl<? super T, ajxw> akbl, akbl<? super Throwable, ajxw> akbl2, gpu gpu) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(akbl, "onNext");
        akcr.b(akbl2, "onError");
        akcr.b(gpu, "userSession");
        AtomicReference atomicReference = new AtomicReference(null);
        Object a = ajdx.b((ajev) new f(atomicReference, gpu)).a((ajfb) new gpx(akbl), (ajfb) new gpx(akbl2));
        atomicReference.set(a);
        gpu.a.a((ajej) a);
        akcr.a(a, "this.doFinally { disposa…ssionDisposable.add(it) }");
        return a;
    }
}
