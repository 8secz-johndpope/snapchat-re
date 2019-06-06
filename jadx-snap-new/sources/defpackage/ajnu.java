package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ajnu */
public final class ajnu<T, U extends Collection<? super T>> extends ajnp<T, U> {
    private int b = 100;
    private int c = 100;
    private Callable<U> d;

    /* renamed from: ajnu$a */
    static final class a<T, U extends Collection<? super T>> implements ajdv<T>, ajej {
        private ajdv<? super U> a;
        private int b;
        private Callable<U> c;
        private U d;
        private int e;
        private ajej f;

        a(ajdv<? super U> ajdv, int i, Callable<U> callable) {
            this.a = ajdv;
            this.b = i;
            this.c = callable;
        }

        public final void a() {
            Object obj = this.d;
            if (obj != null) {
                this.d = null;
                if (!obj.isEmpty()) {
                    this.a.a(obj);
                }
                this.a.a();
            }
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.f, ajej)) {
                this.f = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            Object obj = this.d;
            if (obj != null) {
                obj.add(t);
                int i = this.e + 1;
                this.e = i;
                if (i >= this.b) {
                    this.a.a(obj);
                    this.e = 0;
                    b();
                }
            }
        }

        public final void a(Throwable th) {
            this.d = null;
            this.a.a(th);
        }

        /* Access modifiers changed, original: final */
        public final boolean b() {
            try {
                this.d = (Collection) ajfv.a(this.c.call(), "Empty buffer supplied");
                return true;
            } catch (Throwable th) {
                ajep.a(th);
                this.d = null;
                ajej ajej = this.f;
                if (ajej == null) {
                    ajfq.a(th, this.a);
                } else {
                    ajej.dispose();
                    this.a.a(th);
                }
                return false;
            }
        }

        public final void dispose() {
            this.f.dispose();
        }

        public final boolean isDisposed() {
            return this.f.isDisposed();
        }
    }

    /* renamed from: ajnu$b */
    static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements ajdv<T>, ajej {
        private ajdv<? super U> a;
        private int b;
        private int c;
        private Callable<U> d;
        private ajej e;
        private ArrayDeque<U> f = new ArrayDeque();
        private long g;

        b(ajdv<? super U> ajdv, int i, int i2, Callable<U> callable) {
            this.a = ajdv;
            this.b = i;
            this.c = i2;
            this.d = callable;
        }

        public final void a() {
            while (!this.f.isEmpty()) {
                this.a.a(this.f.poll());
            }
            this.a.a();
        }

        public final void a(ajej ajej) {
            if (ajfp.a(this.e, ajej)) {
                this.e = ajej;
                this.a.a((ajej) this);
            }
        }

        public final void a(T t) {
            long j = this.g;
            this.g = 1 + j;
            if (j % ((long) this.c) == 0) {
                try {
                    this.f.offer((Collection) ajfv.a(this.d.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                } catch (Throwable th) {
                    this.f.clear();
                    this.e.dispose();
                    this.a.a(th);
                    return;
                }
            }
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                Object obj = (Collection) it.next();
                obj.add(t);
                if (this.b <= obj.size()) {
                    it.remove();
                    this.a.a(obj);
                }
            }
        }

        public final void a(Throwable th) {
            this.f.clear();
            this.a.a(th);
        }

        public final void dispose() {
            this.e.dispose();
        }

        public final boolean isDisposed() {
            return this.e.isDisposed();
        }
    }

    public ajnu(ajdt<T> ajdt, Callable<U> callable) {
        super(ajdt);
        this.d = callable;
    }

    public final void a_(ajdv<? super U> ajdv) {
        int i = this.c;
        int i2 = this.b;
        if (i == i2) {
            a aVar = new a(ajdv, i2, this.d);
            if (aVar.b()) {
                this.a.a(aVar);
            }
            return;
        }
        this.a.a(new b(ajdv, this.b, this.c, this.d));
    }
}
