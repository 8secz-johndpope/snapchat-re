package defpackage;

import java.io.Closeable;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: czr */
public final class czr {
    static final Closeable a = a.a;
    public static final b b = new b();

    /* renamed from: czr$a */
    static final class a implements Closeable {
        public static final a a = new a();

        a() {
        }

        public final void close() {
        }
    }

    /* renamed from: czr$b */
    public static final class b implements czq<Object> {
        b() {
        }

        public final Closeable a(czo<Object> czo) {
            akcr.b(czo, "audioProcessor");
            return czr.a;
        }
    }

    /* renamed from: czr$c */
    public static final class c<T> implements czo<T>, czq<T> {
        final CopyOnWriteArraySet<czo<T>> a = new CopyOnWriteArraySet();
        Closeable b = czr.a;
        private final czq<T> c;

        /* renamed from: czr$c$a */
        static final class a implements Closeable {
            private /* synthetic */ c a;
            private /* synthetic */ czo b;

            a(c cVar, czo czo) {
                this.a = cVar;
                this.b = czo;
            }

            public final void close() {
                synchronized (this.a.a) {
                    if (this.a.a.remove(this.b) && this.a.a.size() == 0) {
                        this.a.b.close();
                        this.a.b = czr.a;
                    }
                }
            }
        }

        public c(czq<T> czq) {
            akcr.b(czq, "audioSource");
            this.c = czq;
        }

        public final Closeable a(czo<T> czo) {
            akcr.b(czo, "audioProcessor");
            synchronized (this.a) {
                if (this.a.add(czo) && this.a.size() == 1) {
                    this.b = this.c.a(this);
                }
            }
            return new a(this, czo);
        }

        public final void a(T t, int i, czn<T> czn) {
            akcr.b(t, "audioData");
            akcr.b(czn, "audioFormat");
            for (czo a : this.a) {
                a.a(t, i, czn);
            }
        }
    }

    static {
        czr czr = new czr();
    }

    private czr() {
    }
}
