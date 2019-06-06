package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajiy */
public final class ajiy<T> extends ajde<T> {
    private ajdg<T> b;
    private ajcw c;

    /* renamed from: ajiy$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[ajcw.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.ajcw.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.ajcw.MISSING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.ajcw.ERROR;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.ajcw.DROP;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.ajcw.LATEST;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ajiy$1.<clinit>():void");
        }
    }

    /* renamed from: ajiy$a */
    static abstract class a<T> extends AtomicLong implements ajdf<T>, akuy {
        final akux<? super T> a;
        final ajft b = new ajft();

        a(akux<? super T> akux) {
            this.a = akux;
        }

        public void a() {
            d();
        }

        public final void a(long j) {
            if (ajui.b(j)) {
                ajum.a((AtomicLong) this, j);
                f();
            }
        }

        public final void a(ajej ajej) {
            ajfp.a(this.b, ajej);
        }

        public final void a(ajfa ajfa) {
            a(new ajfn(ajfa));
        }

        public final void a(Throwable th) {
            if (!b(th)) {
                ajvo.a(th);
            }
        }

        public final void b() {
            this.b.dispose();
            e();
        }

        public boolean b(Throwable th) {
            return c(th);
        }

        public final boolean c() {
            return this.b.isDisposed();
        }

        /* Access modifiers changed, original: protected|final */
        public final boolean c(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (this.b.isDisposed()) {
                return false;
            }
            try {
                this.a.a(th);
                return true;
            } finally {
                this.b.dispose();
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void d() {
            if (!this.b.isDisposed()) {
                try {
                    this.a.a();
                } finally {
                    this.b.dispose();
                }
            }
        }

        /* Access modifiers changed, original: 0000 */
        public void e() {
        }

        /* Access modifiers changed, original: 0000 */
        public void f() {
        }

        public String toString() {
            return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
        }
    }

    /* renamed from: ajiy$b */
    static final class b<T> extends a<T> {
        private ajtb<T> c;
        private Throwable d;
        private volatile boolean e;
        private AtomicInteger f = new AtomicInteger();

        b(akux<? super T> akux, int i) {
            super(akux);
            this.c = new ajtb(i);
        }

        private void g() {
            if (this.f.getAndIncrement() == 0) {
                akux akux = this.a;
                ajtb ajtb = this.c;
                int i = 1;
                do {
                    Throwable th;
                    long j = get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.b.isDisposed()) {
                            ajtb.clear();
                            return;
                        }
                        boolean z = this.e;
                        Object poll = ajtb.poll();
                        Object obj = poll == null ? 1 : null;
                        if (!z || obj == null) {
                            if (obj != null) {
                                break;
                            }
                            akux.a(poll);
                            j2++;
                        } else {
                            th = this.d;
                            if (th != null) {
                                c(th);
                                return;
                            } else {
                                d();
                                return;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (this.b.isDisposed()) {
                            ajtb.clear();
                            return;
                        }
                        boolean z2 = this.e;
                        boolean isEmpty = ajtb.isEmpty();
                        if (z2 && isEmpty) {
                            th = this.d;
                            if (th != null) {
                                c(th);
                                return;
                            } else {
                                d();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        ajum.c(this, j2);
                    }
                    i = this.f.addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void a() {
            this.e = true;
            g();
        }

        public final void a(T t) {
            if (!(this.e || this.b.isDisposed())) {
                if (t == null) {
                    a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.c.offer(t);
                    g();
                }
            }
        }

        public final boolean b(Throwable th) {
            if (this.e || this.b.isDisposed()) {
                return false;
            }
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            this.d = th;
            this.e = true;
            g();
            return true;
        }

        /* Access modifiers changed, original: final */
        public final void e() {
            if (this.f.getAndIncrement() == 0) {
                this.c.clear();
            }
        }

        /* Access modifiers changed, original: final */
        public final void f() {
            g();
        }
    }

    /* renamed from: ajiy$e */
    static final class e<T> extends a<T> {
        private AtomicReference<T> c = new AtomicReference();
        private Throwable d;
        private volatile boolean e;
        private AtomicInteger f = new AtomicInteger();

        e(akux<? super T> akux) {
            super(akux);
        }

        private void g() {
            if (this.f.getAndIncrement() == 0) {
                akux akux = this.a;
                AtomicReference atomicReference = this.c;
                int i = 1;
                do {
                    Object obj;
                    Throwable th;
                    long j = get();
                    long j2 = 0;
                    while (true) {
                        obj = null;
                        if (j2 == j) {
                            break;
                        } else if (this.b.isDisposed()) {
                            atomicReference.lazySet(null);
                            return;
                        } else {
                            boolean z = this.e;
                            Object andSet = atomicReference.getAndSet(null);
                            Object obj2 = andSet == null ? 1 : null;
                            if (!z || obj2 == null) {
                                if (obj2 != null) {
                                    break;
                                }
                                akux.a(andSet);
                                j2++;
                            } else {
                                th = this.d;
                                if (th != null) {
                                    c(th);
                                    return;
                                } else {
                                    d();
                                    return;
                                }
                            }
                        }
                    }
                    if (j2 == j) {
                        if (this.b.isDisposed()) {
                            atomicReference.lazySet(null);
                            return;
                        }
                        boolean z2 = this.e;
                        if (atomicReference.get() == null) {
                            obj = 1;
                        }
                        if (z2 && obj != null) {
                            th = this.d;
                            if (th != null) {
                                c(th);
                                return;
                            } else {
                                d();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        ajum.c(this, j2);
                    }
                    i = this.f.addAndGet(-i);
                } while (i != 0);
            }
        }

        public final void a() {
            this.e = true;
            g();
        }

        public final void a(T t) {
            if (!(this.e || this.b.isDisposed())) {
                if (t == null) {
                    a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else {
                    this.c.set(t);
                    g();
                }
            }
        }

        public final boolean b(Throwable th) {
            if (this.e || this.b.isDisposed()) {
                return false;
            }
            if (th == null) {
                a((Throwable) new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
            this.d = th;
            this.e = true;
            g();
            return true;
        }

        /* Access modifiers changed, original: final */
        public final void e() {
            if (this.f.getAndIncrement() == 0) {
                this.c.lazySet(null);
            }
        }

        /* Access modifiers changed, original: final */
        public final void f() {
            g();
        }
    }

    /* renamed from: ajiy$f */
    static final class f<T> extends a<T> {
        f(akux<? super T> akux) {
            super(akux);
        }

        public final void a(T t) {
            if (!this.b.isDisposed()) {
                if (t != null) {
                    this.a.a((Object) t);
                    long j;
                    do {
                        j = get();
                        if (j == 0) {
                            break;
                        }
                    } while (!compareAndSet(j, j - 1));
                    return;
                }
                a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            }
        }
    }

    /* renamed from: ajiy$g */
    static abstract class g<T> extends a<T> {
        g(akux<? super T> akux) {
            super(akux);
        }

        public final void a(T t) {
            if (!this.b.isDisposed()) {
                if (t == null) {
                    a((Throwable) new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                } else if (get() != 0) {
                    this.a.a((Object) t);
                    ajum.c(this, 1);
                } else {
                    g();
                }
            }
        }

        public abstract void g();
    }

    /* renamed from: ajiy$c */
    static final class c<T> extends g<T> {
        c(akux<? super T> akux) {
            super(akux);
        }

        /* Access modifiers changed, original: final */
        public final void g() {
        }
    }

    /* renamed from: ajiy$d */
    static final class d<T> extends g<T> {
        d(akux<? super T> akux) {
            super(akux);
        }

        /* Access modifiers changed, original: final */
        public final void g() {
            a((Throwable) new ajeq("create: could not emit value due to lack of requests"));
        }
    }

    public ajiy(ajdg<T> ajdg, ajcw ajcw) {
        this.b = ajdg;
        this.c = ajcw;
    }

    public final void a_(akux<? super T> akux) {
        int i = 1.a[this.c.ordinal()];
        akuy bVar = i != 1 ? i != 2 ? i != 3 ? i != 4 ? new b(akux, ajde.a) : new e(akux) : new c(akux) : new d(akux) : new f(akux);
        akux.a(bVar);
        try {
            this.b.subscribe(bVar);
        } catch (Throwable th) {
            ajep.a(th);
            bVar.a(th);
        }
    }
}
