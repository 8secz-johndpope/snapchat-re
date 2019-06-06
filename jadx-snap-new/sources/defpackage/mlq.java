package defpackage;

import com.brightcove.player.event.Event;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.domain.LSCoreManagerOutputType;
import com.looksery.sdk.domain.RecordingState;
import defpackage.akdd.e;
import defpackage.mor.b;
import defpackage.mov.a;
import defpackage.mov.c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: mlq */
public final class mlq implements mov {
    final mkx a;
    final mor b;
    final akbl<abpq, ajxw> c;
    private final ajxe d;
    private final ajxe e;
    private final ajxe f;

    /* renamed from: mlq$b */
    static final class b extends akcs implements akbk<mid<? super a, Integer>> {
        final /* synthetic */ mlq a;

        /* renamed from: mlq$b$a */
        public static final class a implements mid<defpackage.mov.a, Integer> {
            public final CopyOnWriteArrayList<defpackage.min.a> a;
            public final zfw b;
            final /* synthetic */ mkx c;
            private mhk d;
            private /* synthetic */ boolean e = false;
            private /* synthetic */ String f;
            private /* synthetic */ boolean g;
            private /* synthetic */ Object h;
            private /* synthetic */ b i;
            private /* synthetic */ e j;
            private /* synthetic */ e k;

            /* renamed from: mlq$b$a$2 */
            public static final class 2<T> implements ajdr<T> {
                final /* synthetic */ a a;

                public 2(a aVar) {
                    this.a = aVar;
                }

                public final void subscribe(ajdq<defpackage.min.a> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    final defpackage.min.a aVar = new defpackage.min.a();
                    if (!ajdq.isDisposed()) {
                        ajdq.a(ajek.a((ajev) new ajev(this) {
                            private /* synthetic */ 2 a;

                            public final void run() {
                                this.a.a.a.remove(aVar);
                            }
                        }));
                        this.a.a.add(aVar);
                    }
                    if (!ajdq.isDisposed()) {
                        ajdq.a((Object) aVar);
                    }
                }
            }

            public a(mkx mkx, String str, Object obj, b bVar, e eVar, e eVar2) {
                this.c = mkx;
                this.f = str;
                this.g = true;
                this.h = obj;
                this.i = bVar;
                this.j = eVar;
                this.k = eVar2;
                this.a = new CopyOnWriteArrayList();
                this.d = mkx.c;
                this.b = mkx.d;
            }

            public final ajdp<min> a(final long j, final TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                Object u = ajdp.a((ajdr) new 2(this)).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        final defpackage.min.a aVar = (defpackage.min.a) obj;
                        akcr.b(aVar, "accumulator");
                        long j = j;
                        return ajdp.a(j, j, timeUnit, (ajdw) this.a.b.b()).p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((Long) obj, "it");
                                return aVar.invoke();
                            }
                        });
                    }
                });
                akcr.a(u, "Observable.create<Statis…tor() }\n                }");
                return u;
            }

            public final Integer a(defpackage.mov.a aVar) {
                Integer valueOf;
                int i = 1;
                int isEmpty = this.a.isEmpty() ^ 1;
                long a = isEmpty != 0 ? this.d.a(TimeUnit.MILLISECONDS) : 0;
                mkx mkx = this.c;
                boolean z = this.g;
                if ((mkx.isDisposed() ^ 1) != 0) {
                    mpn mpn = (mpn) mkx.a.b();
                    if (!z || mpn.a()) {
                        RecordingState recordingState;
                        LSCoreManagerWrapper lSCoreManagerWrapper = mpn.b;
                        if (z) {
                            mkx.a(lSCoreManagerWrapper);
                        }
                        defpackage.mov.a aVar2 = aVar;
                        int i2 = mlr.a[aVar2.n().ordinal()];
                        if (i2 == 1) {
                            recordingState = RecordingState.PREVIEW;
                        } else if (i2 == 2) {
                            recordingState = RecordingState.VIDEO;
                        } else if (i2 == 3) {
                            recordingState = RecordingState.PHOTO;
                        } else {
                            throw new ajxk();
                        }
                        lSCoreManagerWrapper.setRecordingState(recordingState);
                        lSCoreManagerWrapper.setFrontCameraEnabled(aVar2.m());
                        if (!(aVar2.f() == ((defpackage.mov.a) this.j.a).f() && aVar2.g() == ((defpackage.mov.a) this.j.a).g())) {
                            this.i.a.c.invoke(new abpq(aVar2.f(), aVar2.g()));
                            lSCoreManagerWrapper.setInputImageSize(aVar2.f(), aVar2.g());
                            this.k.a = (abpq) this.i.a.b.invoke(new abpq(aVar2.f(), aVar2.g()));
                        }
                        if (!(aVar2.h() == ((defpackage.mov.a) this.j.a).h() && aVar2.i() == ((defpackage.mov.a) this.j.a).i())) {
                            lSCoreManagerWrapper.setScreenSize(aVar2.h(), aVar2.i());
                        }
                        if (!(aVar2.j() == ((defpackage.mov.a) this.j.a).j() && aVar2.k() == ((defpackage.mov.a) this.j.a).k() && aVar2.l() == ((defpackage.mov.a) this.j.a).l())) {
                            lSCoreManagerWrapper.setCameraParams(aVar2.j(), aVar2.k(), aVar2.l());
                        }
                        e eVar = this.j;
                        ((defpackage.mov.a) eVar.a).o();
                        akcr.b(aVar2, "receiver$0");
                        eVar.a = mox.a(aVar2.a(), aVar2.b(), aVar2.c(), aVar2.d(), aVar2.e(), aVar2.f(), aVar2.g(), aVar2.h(), aVar2.i(), aVar2.j(), aVar2.k(), aVar2.l(), aVar2.m(), aVar2.n());
                        if (!lSCoreManagerWrapper.hasComplexEffect() || ((abpq) this.k.a).a() <= 0 || ((abpq) this.k.a).b() <= 0) {
                            i = 0;
                        }
                        int a2 = i != 0 ? ((abpq) this.k.a).a() : aVar2.f();
                        int b = i != 0 ? ((abpq) this.k.a).b() : aVar2.g();
                        this.i.a.a.n().a();
                        valueOf = Integer.valueOf(lSCoreManagerWrapper.processFrameToTexture(aVar2.a(), aVar2.b(), aVar2.c(), aVar2.d(), aVar2.e(), a2, b));
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Called on a thread with id [");
                        Object currentThread = Thread.currentThread();
                        akcr.a(currentThread, "currentThread()");
                        stringBuilder.append(currentThread.getId());
                        stringBuilder.append("] while expecting id [");
                        stringBuilder.append(mpn.a);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                    valueOf = this.h;
                }
                if (isEmpty != 0) {
                    long a3 = this.d.a(TimeUnit.MILLISECONDS) - a;
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((defpackage.min.a) it.next()).a((double) a3);
                    }
                }
                return valueOf;
            }

            public final ajdx<Integer> b(final defpackage.mov.a aVar) {
                Object b;
                String str;
                if (this.c.isDisposed()) {
                    b = ajdx.b(this.h);
                    str = "Single.just(defaultValue)";
                } else {
                    b = ajdx.a((ajea) new ajea<T>(this) {
                        final /* synthetic */ a a;

                        public final void subscribe(final ajdy<Integer> ajdy) {
                            akcr.b(ajdy, Event.EMITTER);
                            if (!ajdy.isDisposed()) {
                                ajdy.a(this.a.c.a((akbl) new akbl<LSCoreManagerWrapper, ajxw>(this) {
                                    private /* synthetic */ 1 a;

                                    public final /* synthetic */ Object invoke(Object obj) {
                                        akcr.b((LSCoreManagerWrapper) obj, "receiver$0");
                                        obj = ajdy;
                                        akcr.a(obj, Event.EMITTER);
                                        if (!obj.isDisposed()) {
                                            ajdy.a(this.a.a.a(aVar));
                                        }
                                        return ajxw.a;
                                    }
                                }));
                            }
                        }
                    });
                    str = "Single.create { emitter … })\n                    }";
                }
                akcr.a(b, str);
                return b;
            }

            public final ajdp<R> c(defpackage.mov.a aVar) {
                return defpackage.mid.a.a(this, aVar);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Operation[name: ");
                stringBuilder.append(this.f);
                stringBuilder.append(", defaultValue: ");
                stringBuilder.append(this.h);
                stringBuilder.append(", trace: false]");
                return stringBuilder.toString();
            }
        }

        b(mlq mlq) {
            this.a = mlq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            e eVar = new e();
            eVar.a = new mne();
            e eVar2 = new e();
            eVar2.a = new abpq(0, 0);
            return new a(this.a.a, "DefaultTextureProcessor#process", Integer.valueOf(0), this, eVar, eVar2);
        }
    }

    /* renamed from: mlq$c */
    static final class c extends akcs implements akbk<mid<? super ajxm<? extends Integer, ? extends Boolean>, Integer>> {
        private /* synthetic */ mlq a;

        /* renamed from: mlq$c$a */
        public static final class a implements mid<ajxm<? extends Integer, ? extends Boolean>, Integer> {
            public final CopyOnWriteArrayList<defpackage.min.a> a;
            public final zfw b;
            final /* synthetic */ mkx c;
            private mhk d;
            private /* synthetic */ boolean e = false;
            private /* synthetic */ String f;
            private /* synthetic */ boolean g;
            private /* synthetic */ Object h;

            /* renamed from: mlq$c$a$2 */
            public static final class 2<T> implements ajdr<T> {
                final /* synthetic */ a a;

                public 2(a aVar) {
                    this.a = aVar;
                }

                public final void subscribe(ajdq<defpackage.min.a> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    final defpackage.min.a aVar = new defpackage.min.a();
                    if (!ajdq.isDisposed()) {
                        ajdq.a(ajek.a((ajev) new ajev(this) {
                            private /* synthetic */ 2 a;

                            public final void run() {
                                this.a.a.a.remove(aVar);
                            }
                        }));
                        this.a.a.add(aVar);
                    }
                    if (!ajdq.isDisposed()) {
                        ajdq.a((Object) aVar);
                    }
                }
            }

            public a(mkx mkx, String str, Object obj) {
                this.c = mkx;
                this.f = str;
                this.g = true;
                this.h = obj;
                this.a = new CopyOnWriteArrayList();
                this.d = mkx.c;
                this.b = mkx.d;
            }

            public final ajdp<min> a(final long j, final TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                Object u = ajdp.a((ajdr) new 2(this)).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        final defpackage.min.a aVar = (defpackage.min.a) obj;
                        akcr.b(aVar, "accumulator");
                        long j = j;
                        return ajdp.a(j, j, timeUnit, (ajdw) this.a.b.b()).p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((Long) obj, "it");
                                return aVar.invoke();
                            }
                        });
                    }
                });
                akcr.a(u, "Observable.create<Statis…tor() }\n                }");
                return u;
            }

            public final Integer a(ajxm<? extends Integer, ? extends Boolean> ajxm) {
                Integer valueOf;
                int isEmpty = this.a.isEmpty() ^ 1;
                long a = isEmpty != 0 ? this.d.a(TimeUnit.MILLISECONDS) : 0;
                mkx mkx = this.c;
                boolean z = this.g;
                if ((mkx.isDisposed() ^ 1) != 0) {
                    mpn mpn = (mpn) mkx.a.b();
                    if (!z || mpn.a()) {
                        LSCoreManagerWrapper lSCoreManagerWrapper = mpn.b;
                        if (z) {
                            mkx.a(lSCoreManagerWrapper);
                        }
                        ajxm ajxm2 = ajxm;
                        valueOf = Integer.valueOf(lSCoreManagerWrapper.getResultTexture(LSCoreManagerOutputType.values()[((Number) ajxm2.a).intValue()], ((Boolean) ajxm2.b).booleanValue()));
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Called on a thread with id [");
                        Object currentThread = Thread.currentThread();
                        akcr.a(currentThread, "currentThread()");
                        stringBuilder.append(currentThread.getId());
                        stringBuilder.append("] while expecting id [");
                        stringBuilder.append(mpn.a);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                valueOf = null;
                if (valueOf == null) {
                    valueOf = this.h;
                }
                if (isEmpty != 0) {
                    long a2 = this.d.a(TimeUnit.MILLISECONDS) - a;
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((defpackage.min.a) it.next()).a((double) a2);
                    }
                }
                return valueOf;
            }

            public final ajdx<Integer> b(final ajxm<? extends Integer, ? extends Boolean> ajxm) {
                Object b;
                String str;
                if (this.c.isDisposed()) {
                    b = ajdx.b(this.h);
                    str = "Single.just(defaultValue)";
                } else {
                    b = ajdx.a((ajea) new ajea<T>(this) {
                        final /* synthetic */ a a;

                        public final void subscribe(final ajdy<Integer> ajdy) {
                            akcr.b(ajdy, Event.EMITTER);
                            if (!ajdy.isDisposed()) {
                                ajdy.a(this.a.c.a((akbl) new akbl<LSCoreManagerWrapper, ajxw>(this) {
                                    private /* synthetic */ 1 a;

                                    public final /* synthetic */ Object invoke(Object obj) {
                                        akcr.b((LSCoreManagerWrapper) obj, "receiver$0");
                                        obj = ajdy;
                                        akcr.a(obj, Event.EMITTER);
                                        if (!obj.isDisposed()) {
                                            ajdy.a(this.a.a.a(ajxm));
                                        }
                                        return ajxw.a;
                                    }
                                }));
                            }
                        }
                    });
                    str = "Single.create { emitter … })\n                    }";
                }
                akcr.a(b, str);
                return b;
            }

            public final ajdp<R> c(ajxm<? extends Integer, ? extends Boolean> ajxm) {
                return defpackage.mid.a.a(this, ajxm);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Operation[name: ");
                stringBuilder.append(this.f);
                stringBuilder.append(", defaultValue: ");
                stringBuilder.append(this.h);
                stringBuilder.append(", trace: false]");
                return stringBuilder.toString();
            }
        }

        c(mlq mlq) {
            this.a = mlq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(this.a.a, "DefaultTextureProcessor#resultTexture", Integer.valueOf(0));
        }
    }

    /* renamed from: mlq$a */
    static final class a extends akcs implements akbk<mid<? super c, ajxw>> {
        private /* synthetic */ mlq a;

        /* renamed from: mlq$a$a */
        public static final class a implements mid<c, ajxw> {
            public final CopyOnWriteArrayList<defpackage.min.a> a;
            public final zfw b;
            final /* synthetic */ mkx c;
            private mhk d;
            private /* synthetic */ boolean e = false;
            private /* synthetic */ String f;
            private /* synthetic */ boolean g;
            private /* synthetic */ Object h;

            /* renamed from: mlq$a$a$2 */
            public static final class 2<T> implements ajdr<T> {
                final /* synthetic */ a a;

                public 2(a aVar) {
                    this.a = aVar;
                }

                public final void subscribe(ajdq<defpackage.min.a> ajdq) {
                    akcr.b(ajdq, Event.EMITTER);
                    final defpackage.min.a aVar = new defpackage.min.a();
                    if (!ajdq.isDisposed()) {
                        ajdq.a(ajek.a((ajev) new ajev(this) {
                            private /* synthetic */ 2 a;

                            public final void run() {
                                this.a.a.a.remove(aVar);
                            }
                        }));
                        this.a.a.add(aVar);
                    }
                    if (!ajdq.isDisposed()) {
                        ajdq.a((Object) aVar);
                    }
                }
            }

            public a(mkx mkx, String str, Object obj) {
                this.c = mkx;
                this.f = str;
                this.g = true;
                this.h = obj;
                this.a = new CopyOnWriteArrayList();
                this.d = mkx.c;
                this.b = mkx.d;
            }

            public final ajdp<min> a(final long j, final TimeUnit timeUnit) {
                akcr.b(timeUnit, "timeUnit");
                Object u = ajdp.a((ajdr) new 2(this)).u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        final defpackage.min.a aVar = (defpackage.min.a) obj;
                        akcr.b(aVar, "accumulator");
                        long j = j;
                        return ajdp.a(j, j, timeUnit, (ajdw) this.a.b.b()).p(new ajfc<T, R>() {
                            public final /* synthetic */ Object apply(Object obj) {
                                akcr.b((Long) obj, "it");
                                return aVar.invoke();
                            }
                        });
                    }
                });
                akcr.a(u, "Observable.create<Statis…tor() }\n                }");
                return u;
            }

            public final ajxw a(c cVar) {
                ajxw ajxw;
                int isEmpty = this.a.isEmpty() ^ 1;
                long a = isEmpty != 0 ? this.d.a(TimeUnit.MILLISECONDS) : 0;
                mkx mkx = this.c;
                boolean z = this.g;
                if ((mkx.isDisposed() ^ 1) != 0) {
                    mpn mpn = (mpn) mkx.a.b();
                    if (!z || mpn.a()) {
                        LSCoreManagerWrapper lSCoreManagerWrapper = mpn.b;
                        if (z) {
                            mkx.a(lSCoreManagerWrapper);
                        }
                        cVar = cVar;
                        lSCoreManagerWrapper.fillResultTextureTransformationMatrix(LSCoreManagerOutputType.values()[cVar.a()], cVar.b(), cVar.c(), cVar.d());
                        ajxw = ajxw.a;
                    } else {
                        StringBuilder stringBuilder = new StringBuilder("Called on a thread with id [");
                        Object currentThread = Thread.currentThread();
                        akcr.a(currentThread, "currentThread()");
                        stringBuilder.append(currentThread.getId());
                        stringBuilder.append("] while expecting id [");
                        stringBuilder.append(mpn.a);
                        stringBuilder.append(']');
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                }
                ajxw = null;
                if (ajxw == null) {
                    ajxw = this.h;
                }
                if (isEmpty != 0) {
                    long a2 = this.d.a(TimeUnit.MILLISECONDS) - a;
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        ((defpackage.min.a) it.next()).a((double) a2);
                    }
                }
                return ajxw;
            }

            public final ajdx<ajxw> b(final c cVar) {
                Object b;
                String str;
                if (this.c.isDisposed()) {
                    b = ajdx.b(this.h);
                    str = "Single.just(defaultValue)";
                } else {
                    b = ajdx.a((ajea) new ajea<T>(this) {
                        final /* synthetic */ a a;

                        public final void subscribe(final ajdy<ajxw> ajdy) {
                            akcr.b(ajdy, Event.EMITTER);
                            if (!ajdy.isDisposed()) {
                                ajdy.a(this.a.c.a((akbl) new akbl<LSCoreManagerWrapper, ajxw>(this) {
                                    private /* synthetic */ 1 a;

                                    public final /* synthetic */ Object invoke(Object obj) {
                                        akcr.b((LSCoreManagerWrapper) obj, "receiver$0");
                                        obj = ajdy;
                                        akcr.a(obj, Event.EMITTER);
                                        if (!obj.isDisposed()) {
                                            ajdy.a(this.a.a.a(cVar));
                                        }
                                        return ajxw.a;
                                    }
                                }));
                            }
                        }
                    });
                    str = "Single.create { emitter … })\n                    }";
                }
                akcr.a(b, str);
                return b;
            }

            public final ajdp<R> c(c cVar) {
                return defpackage.mid.a.a(this, cVar);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Operation[name: ");
                stringBuilder.append(this.f);
                stringBuilder.append(", defaultValue: ");
                stringBuilder.append(this.h);
                stringBuilder.append(", trace: false]");
                return stringBuilder.toString();
            }
        }

        a(mlq mlq) {
            this.a = mlq;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a(this.a.a, "DefaultTextureProcessor#fillResultTextureTransform", ajxw.a);
        }
    }

    /* renamed from: mlq$1 */
    static final class 1 extends akcs implements akbl<abpq, ajxw> {
        public static final 1 a = new 1();

        1() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((abpq) obj, "it");
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mlq.class), "process", "getProcess()Lcom/snap/lenses/common/Operation;"), new akdc(akde.a(mlq.class), "resultTexture", "getResultTexture()Lcom/snap/lenses/common/Operation;"), new akdc(akde.a(mlq.class), "fillResultTextureTransformationMatrix", "getFillResultTextureTransformationMatrix()Lcom/snap/lenses/common/Operation;")};
    }

    public /* synthetic */ mlq(mkx mkx) {
        this(mkx, b.a, 1.a);
    }

    public mlq(mkx mkx, mor mor, akbl<? super abpq, ajxw> akbl) {
        akcr.b(mkx, "lensCore");
        akcr.b(mor, "sizeMapper");
        akcr.b(akbl, "sizeReceiver");
        this.a = mkx;
        this.b = mor;
        this.c = akbl;
        this.d = ajxh.a(ajxj.PUBLICATION, new b(this));
        this.e = ajxh.a(ajxj.PUBLICATION, new c(this));
        this.f = ajxh.a(ajxj.PUBLICATION, new a(this));
    }

    public final mid<a, Integer> a() {
        return (mid) this.d.b();
    }

    public final mid<ajxm<Integer, Boolean>, Integer> b() {
        return (mid) this.e.b();
    }

    public final mid<c, ajxw> c() {
        return (mid) this.f.b();
    }
}
