package defpackage;

import defpackage.ilv.a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: imq */
public final class imq implements ilv, ilx {
    final ajei a = new ajei();
    boolean b;
    final ajwt<a> c;
    boolean d;
    ajej e;
    final ajdw f;
    final ajdw g;
    final ftl h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final aipn<ini> j;
    private final aipn<ilw> k;
    private final iml l;

    /* renamed from: imq$a */
    static final class a {
        final int a;
        final int b;
        final int c;
        final ArrayList<String> d;
        final long e;

        public a(int i, int i2, int i3, ArrayList<String> arrayList, long j) {
            akcr.b(arrayList, "dimensions");
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = arrayList;
            this.e = j;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if ((this.a == aVar.a ? 1 : null) != null) {
                        if ((this.b == aVar.b ? 1 : null) != null) {
                            if ((this.c == aVar.c ? 1 : null) != null && akcr.a(this.d, aVar.d)) {
                                if ((this.e == aVar.e ? 1 : null) != null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = ((((this.a * 31) + this.b) * 31) + this.c) * 31;
            ArrayList arrayList = this.d;
            i = (i + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
            long j = this.e;
            return i + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("EnqueueEvent(metricType=");
            stringBuilder.append(this.a);
            stringBuilder.append(", partitionId=");
            stringBuilder.append(this.b);
            stringBuilder.append(", metricId=");
            stringBuilder.append(this.c);
            stringBuilder.append(", dimensions=");
            stringBuilder.append(this.d);
            stringBuilder.append(", value=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: imq$d */
    static final class d implements Runnable {
        final /* synthetic */ imq a;

        /* renamed from: imq$d$1 */
        static final class 1<T> implements ajfb<a> {
            private /* synthetic */ d a;

            1(d dVar) {
                this.a = dVar;
            }

            public final /* synthetic */ void accept(Object obj) {
                obj = (a) obj;
                imq imq = this.a.a;
                akcr.a(obj, "it");
                imq.a(obj.a, obj.b, obj.c, obj.d, obj.e);
            }
        }

        d(imq imq) {
            this.a = imq;
        }

        public final void run() {
            this.a.a(inh.COUNTER.value, ink.GRAPHENE.ordinal(), iof.GRAPHENE_INITIALIZED.ordinal(), new ArrayList(), 1);
            imq imq = this.a;
            imq.b = true;
            imq.e = imq.c.a(this.a.f).f((ajfb) new 1(this));
        }
    }

    /* renamed from: imq$e */
    static final class e implements ajev {
        private /* synthetic */ imq a;

        e(imq imq) {
            this.a = imq;
        }

        public final void run() {
            imq imq = this.a;
            imq.d = true;
            imq.g.a((Runnable) new f(imq));
        }
    }

    /* renamed from: imq$g */
    static final class g implements Runnable {
        private /* synthetic */ imq a;

        g(imq imq) {
            this.a = imq;
        }

        public final void run() {
            this.a.h.a((fth) ima.GRAPHENE_CUSTOM_FLUSHING_ENABLED);
            this.a.h.w(ima.GRAPHENE_CUSTOM_FLUSHING_ENABLED);
            imq imq = this.a;
            imq.a(imq, imq.h.a((fth) ima.GRAPHENE_CUSTOM_FLUSHING_ENABLED));
        }
    }

    /* renamed from: imq$c */
    static final class c<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ imq a;

        c(imq imq) {
            this.a = imq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "flushInterval");
            return ajde.a(l.longValue(), l.longValue(), TimeUnit.SECONDS, this.a.f).f().b(this.a.h.h(ima.FLUSH_DEBOUNCE_INTERVAL), TimeUnit.SECONDS, this.a.f);
        }
    }

    /* renamed from: imq$h */
    static final class h<T> implements ajfb<Long> {
        private /* synthetic */ imq a;

        h(imq imq) {
            this.a = imq;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.c();
        }
    }

    /* renamed from: imq$i */
    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: imq$b */
    static final class b<T, R> implements ajfc<T, akuw<? extends R>> {
        private /* synthetic */ imq a;

        b(imq imq) {
            this.a = imq;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, "compactInterval");
            return ajde.a(l.longValue(), l.longValue(), TimeUnit.SECONDS, this.a.f).e().b(this.a.h.h(ima.COMPACT_DEBOUNCE_INTERVAL), TimeUnit.SECONDS, this.a.f);
        }
    }

    /* renamed from: imq$j */
    static final class j<T> implements ajfb<Long> {
        private /* synthetic */ imq a;

        j(imq imq) {
            this.a = imq;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.b();
        }
    }

    /* renamed from: imq$k */
    static final class k<T> implements ajfb<Throwable> {
        public static final k a = new k();

        k() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: imq$f */
    static final class f implements Runnable {
        private /* synthetic */ imq a;

        f(imq imq) {
            this.a = imq;
        }

        public final void run() {
            boolean a = this.a.h.a((fth) ima.GRAPHENE_CUSTOM_FLUSHING_ENABLED);
            Object obj = (a && this.a.h.a((fth) ima.GRAPHENE_CUSTOM_FLUSHING_CONTINUE_BACKGROUND_ENABLED)) ? 1 : null;
            if (obj != null) {
                imq.a(this.a, a);
            } else {
                this.a.a.a();
            }
            this.a.c();
        }
    }

    /* renamed from: imq$l */
    static final class l implements Runnable {
        private /* synthetic */ imq a;

        l(imq imq) {
            this.a = imq;
        }

        public final void run() {
            imq imq = this.a;
            imq.a(imq, imq.h.a((fth) ima.GRAPHENE_CUSTOM_FLUSHING_ENABLED));
        }
    }

    public imq(ajdw ajdw, ajdw ajdw2, aipn<ini> aipn, aipn<ilw> aipn2, ftl ftl, iml iml) {
        akcr.b(ajdw, "concurrentScheduler");
        akcr.b(ajdw2, "serialScheduler");
        akcr.b(aipn, "metricProcessor");
        akcr.b(aipn2, "grapheneFlusher");
        akcr.b(ftl, "config");
        akcr.b(iml, "asyncEnqueueResolver");
        this.f = ajdw;
        this.g = ajdw2;
        this.j = aipn;
        this.k = aipn2;
        this.h = ftl;
        this.l = iml;
        Object p = ajwt.p();
        akcr.a(p, "UnicastSubject.create<EnqueueEvent>()");
        this.c = p;
        this.d = true;
    }

    private final void a(int i, int i2, int i3, ArrayList<String> arrayList, long j, boolean z) {
        if (z || !this.b) {
            this.c.a((Object) new a(i, i2, i3, arrayList, j));
        } else {
            a(i, i2, i3, arrayList, j);
        }
    }

    public final ajej a(boolean z) {
        if (this.i.compareAndSet(false, true)) {
            this.f.a((Runnable) new d(this));
        }
        if (z) {
            this.g.a((Runnable) new l(this));
        }
        Object a = ajek.a((ajev) new e(this));
        akcr.a(a, "Disposables.fromAction{ onPause() }");
        return a;
    }

    public final void a() {
        this.d = false;
        this.g.a((Runnable) new g(this));
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, int i2, int i3, ArrayList<String> arrayList, long j) {
        if (arrayList != null) {
            try {
                ((ini) this.j.get()).a(i, i2, i3, arrayList, j);
            } catch (Throwable th) {
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final void a(ily ily, long j) {
        akcr.b(ily, "metric");
        a.a(this, ily, j);
    }

    public final void a(ilz ilz, long j) {
        akcr.b(ilz, "metric");
        a(inh.TIMER.value, ilz.a.a().ordinal(), ilz.b().ordinal(), ilz.b, j, this.l.a());
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        ((ini) this.j.get()).b();
    }

    public final void b(ily ily, long j) {
        akcr.b(ily, "metric");
        a.b(this, ily, j);
    }

    public final void b(ilz ilz, long j) {
        akcr.b(ilz, "metric");
        a(inh.HISTOGRAM.value, ilz.a.a().ordinal(), ilz.b().ordinal(), ilz.b, j, this.l.a());
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void c() {
        ((ilw) this.k.get()).a();
    }

    public final void c(ily ily, long j) {
        akcr.b(ily, "metric");
        a.c(this, ily, j);
    }

    public final void c(ilz ilz, long j) {
        akcr.b(ilz, "metric");
        a(inh.COUNTER.value, ilz.a.a().ordinal(), ilz.b().ordinal(), ilz.b, j, this.l.a());
    }
}
