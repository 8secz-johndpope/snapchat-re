package defpackage;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ajpi */
public final class ajpi<T, K, V> extends ajnp<T, ajvb<K, V>> {
    private ajfc<? super T, ? extends K> b;
    private ajfc<? super T, ? extends V> c;
    private int d;
    private boolean e = false;

    /* renamed from: ajpi$a */
    public static final class a<T, K, V> extends AtomicInteger implements ajdv<T>, ajej {
        private static Object g = new Object();
        private ajdv<? super ajvb<K, V>> a;
        private ajfc<? super T, ? extends K> b;
        private ajfc<? super T, ? extends V> c;
        private int d;
        private boolean e;
        private Map<Object, b<K, V>> f;
        private ajej h;
        private AtomicBoolean i = new AtomicBoolean();

        public a(ajdv<? super ajvb<K, V>> ajdv, ajfc<? super T, ? extends K> ajfc, ajfc<? super T, ? extends V> ajfc2, int i, boolean z) {
            this.a = ajdv;
            this.b = ajfc;
            this.c = ajfc2;
            this.d = i;
            this.e = z;
            this.f = new ConcurrentHashMap();
            lazySet(1);
        }

        public final void a() {
            ArrayList<b> arrayList = new ArrayList(this.f.values());
            this.f.clear();
            for (b bVar : arrayList) {
                c cVar = bVar.a;
                cVar.b = true;
                cVar.a();
            }
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.h, ajej)) {
                this.h = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            try {
                Object apply = this.b.apply(t);
                Object obj = apply != null ? apply : g;
                b bVar = (b) this.f.get(obj);
                if (bVar == null) {
                    if (!this.i.get()) {
                        bVar = new b(apply, new c(this.d, this, apply, this.e));
                        this.f.put(obj, bVar);
                        getAndIncrement();
                        this.a.a((Object) bVar);
                    } else {
                        return;
                    }
                }
                try {
                    Object a = ajfv.a(this.c.apply(t), "The value supplied is null");
                    c cVar = bVar.a;
                    cVar.a.offer(a);
                    cVar.a();
                } catch (Throwable th) {
                    ajep.a(th);
                    this.h.dispose();
                    a(th);
                }
            } catch (Throwable th2) {
                ajep.a(th2);
                this.h.dispose();
                a(th2);
            }
        }

        public final void a(Throwable th) {
            ArrayList<b> arrayList = new ArrayList(this.f.values());
            this.f.clear();
            for (b a : arrayList) {
                a.a(th);
            }
            this.a.a(th);
        }

        public final void b(K k) {
            Object k2;
            if (k2 == null) {
                k2 = g;
            }
            this.f.remove(k2);
            if (decrementAndGet() == 0) {
                this.h.dispose();
            }
        }

        public final void dispose() {
            if (this.i.compareAndSet(false, true) && decrementAndGet() == 0) {
                this.h.dispose();
            }
        }

        public final boolean isDisposed() {
            return this.i.get();
        }
    }

    /* renamed from: ajpi$b */
    static final class b<K, T> extends ajvb<K, T> {
        final c<T, K> a;

        b(K k, c<T, K> cVar) {
            super(k);
            this.a = cVar;
        }

        public final void a(Throwable th) {
            this.a.a(th);
        }

        public final void a_(ajdv<? super T> ajdv) {
            this.a.a((ajdv) ajdv);
        }
    }

    /* renamed from: ajpi$c */
    static final class c<T, K> extends AtomicInteger implements ajdt<T>, ajej {
        final ajtb<T> a;
        volatile boolean b;
        private K c;
        private a<?, K, T> d;
        private boolean e;
        private Throwable f;
        private AtomicBoolean g = new AtomicBoolean();
        private AtomicBoolean h = new AtomicBoolean();
        private AtomicReference<ajdv<? super T>> i = new AtomicReference();

        c(int i, a<?, K, T> aVar, K k, boolean z) {
            this.a = new ajtb(i);
            this.d = aVar;
            this.c = k;
            this.e = z;
        }

        private boolean a(boolean z, boolean z2, ajdv<? super T> ajdv, boolean z3) {
            if (this.g.get()) {
                this.a.clear();
                this.d.b(this.c);
                this.i.lazySet(null);
                return true;
            }
            if (z) {
                Throwable th;
                if (!z3) {
                    th = this.f;
                    if (th != null) {
                        this.a.clear();
                        this.i.lazySet(null);
                        ajdv.a(th);
                        return true;
                    } else if (z2) {
                        this.i.lazySet(null);
                        ajdv.a();
                        return true;
                    }
                } else if (z2) {
                    th = this.f;
                    this.i.lazySet(null);
                    if (th != null) {
                        ajdv.a(th);
                    } else {
                        ajdv.a();
                    }
                    return true;
                }
            }
            return false;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            if (getAndIncrement() == 0) {
                ajtb ajtb = this.a;
                boolean z = this.e;
                ajdv ajdv = (ajdv) this.i.get();
                int i = 1;
                while (true) {
                    if (ajdv != null) {
                        while (true) {
                            boolean z2 = this.b;
                            Object poll = ajtb.poll();
                            boolean z3 = poll == null;
                            if (!a(z2, z3, ajdv, z)) {
                                if (z3) {
                                    break;
                                }
                                ajdv.a(poll);
                            } else {
                                return;
                            }
                        }
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                    if (ajdv == null) {
                        ajdv = (ajdv) this.i.get();
                    }
                }
            }
        }

        public final void a(ajdv<? super T> ajdv) {
            if (this.h.compareAndSet(false, true)) {
                ajdv.a((ajej) this);
                this.i.lazySet(ajdv);
                if (this.g.get()) {
                    this.i.lazySet(null);
                    return;
                } else {
                    a();
                    return;
                }
            }
            ajfq.a(new IllegalStateException("Only one Observer allowed!"), (ajdv) ajdv);
        }

        public final void a(Throwable th) {
            this.f = th;
            this.b = true;
            a();
        }

        public final void dispose() {
            if (this.g.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.i.lazySet(null);
                this.d.b(this.c);
            }
        }

        public final boolean isDisposed() {
            return this.g.get();
        }
    }

    public ajpi(ajdt<T> ajdt, ajfc<? super T, ? extends K> ajfc, ajfc<? super T, ? extends V> ajfc2, int i) {
        super(ajdt);
        this.b = ajfc;
        this.c = ajfc2;
        this.d = i;
    }

    public final void a_(ajdv<? super ajvb<K, V>> ajdv) {
        this.a.a(new a(ajdv, this.b, this.c, this.d, false));
    }
}
