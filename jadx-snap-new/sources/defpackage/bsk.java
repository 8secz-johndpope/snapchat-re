package defpackage;

import android.os.Handler;
import android.os.Looper;
import defpackage.bsj.a;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: bsk */
public interface bsk {

    /* renamed from: bsk$a */
    public static final class a {
        public final int a;
        public final defpackage.bsj.a b;
        final CopyOnWriteArrayList<a> c;
        private final long d;

        /* renamed from: bsk$a$a */
        static final class a {
            public final Handler a;
            public final bsk b;

            public a(Handler handler, bsk bsk) {
                this.a = handler;
                this.b = bsk;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0);
        }

        private a(CopyOnWriteArrayList<a> copyOnWriteArrayList, int i, defpackage.bsj.a aVar, long j) {
            this.c = copyOnWriteArrayList;
            this.a = i;
            this.b = aVar;
            this.d = j;
        }

        private static void a(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public final long a(long j) {
            j = bkw.a(j);
            return j == -9223372036854775807L ? -9223372036854775807L : this.d + j;
        }

        public final a a(int i, defpackage.bsj.a aVar, long j) {
            return new a(this.c, i, aVar, j);
        }

        public final void a() {
            byo.b(this.b != null);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final bsk bsk = aVar.b;
                a.a(aVar.a, new Runnable() {
                    public final void run() {
                        bsk.a(a.this.a, a.this.b);
                    }
                });
            }
        }

        public final void a(int i, blg blg, int i2, Object obj, long j) {
            b(new c(1, i, blg, i2, obj, a(j), -9223372036854775807L));
        }

        public final void a(final b bVar, final c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final bsk bsk = aVar.b;
                a.a(aVar.a, new Runnable() {
                    public final void run() {
                        bsk.a(a.this.a, a.this.b, bVar, cVar);
                    }
                });
            }
        }

        public final void a(b bVar, c cVar, IOException iOException, boolean z) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final bsk bsk = aVar.b;
                final b bVar2 = bVar;
                final c cVar2 = cVar;
                final IOException iOException2 = iOException;
                final boolean z2 = z;
                a.a(aVar.a, new Runnable() {
                    public final void run() {
                        bsk.a(a.this.a, a.this.b, bVar2, cVar2, iOException2, z2);
                    }
                });
            }
        }

        public final void a(final c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final bsk bsk = aVar.b;
                a.a(aVar.a, new Runnable() {
                    public final void run() {
                        bsk.a(a.this.a, a.this.b, cVar);
                    }
                });
            }
        }

        public final void a(bxh bxh, int i, int i2, blg blg, int i3, Object obj, long j, long j2, long j3) {
            a(new b(bxh, j3, 0, 0), new c(i, i2, blg, i3, obj, a(j), a(j2)));
        }

        public final void a(bxh bxh, int i, int i2, blg blg, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            b(new b(bxh, j3, j4, j5), new c(i, i2, blg, i3, obj, a(j), a(j2)));
        }

        public final void a(bxh bxh, int i, int i2, blg blg, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            a(new b(bxh, j3, j4, j5), new c(i, i2, blg, i3, obj, a(j), a(j2)), iOException, z);
        }

        public final void a(bxh bxh, int i, long j) {
            a(bxh, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j);
        }

        public final void a(bxh bxh, int i, long j, long j2, long j3) {
            a(bxh, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public final void a(bxh bxh, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            a(bxh, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        public final void b() {
            byo.b(this.b != null);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final bsk bsk = aVar.b;
                a.a(aVar.a, new Runnable() {
                    public final void run() {
                        bsk.b(a.this.a, a.this.b);
                    }
                });
            }
        }

        public final void b(final b bVar, final c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final bsk bsk = aVar.b;
                a.a(aVar.a, new Runnable() {
                    public final void run() {
                        bsk.b(a.this.a, a.this.b, bVar, cVar);
                    }
                });
            }
        }

        public final void b(final c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final bsk bsk = aVar.b;
                a.a(aVar.a, new Runnable() {
                    public final void run() {
                        bsk.b(a.this.a, a.this.b, cVar);
                    }
                });
            }
        }

        public final void b(bxh bxh, int i, int i2, blg blg, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            c(new b(bxh, j3, j4, j5), new c(i, i2, blg, i3, obj, a(j), a(j2)));
        }

        public final void b(bxh bxh, int i, long j, long j2, long j3) {
            b(bxh, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        public final void c() {
            byo.b(this.b != null);
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final bsk bsk = aVar.b;
                a.a(aVar.a, new Runnable() {
                    public final void run() {
                        bsk.c(a.this.a, a.this.b);
                    }
                });
            }
        }

        public final void c(final b bVar, final c cVar) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                final bsk bsk = aVar.b;
                a.a(aVar.a, new Runnable() {
                    public final void run() {
                        bsk.c(a.this.a, a.this.b, bVar, cVar);
                    }
                });
            }
        }
    }

    /* renamed from: bsk$b */
    public static final class b {
        public final bxh a;
        private long b;
        private long c;
        private long d;

        public b(bxh bxh, long j, long j2, long j3) {
            this.a = bxh;
            this.b = j;
            this.c = j2;
            this.d = j3;
        }
    }

    /* renamed from: bsk$c */
    public static final class c {
        public final int a;
        public final int b;
        public final blg c;
        public final int d;
        public final Object e;
        public final long f;
        public final long g;

        public c(int i, int i2, blg blg, int i3, Object obj, long j, long j2) {
            this.a = i;
            this.b = i2;
            this.c = blg;
            this.d = i3;
            this.e = obj;
            this.f = j;
            this.g = j2;
        }
    }

    void a(int i, a aVar);

    void a(int i, a aVar, b bVar, c cVar);

    void a(int i, a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void a(int i, a aVar, c cVar);

    void b(int i, a aVar);

    void b(int i, a aVar, b bVar, c cVar);

    void b(int i, a aVar, c cVar);

    void c(int i, a aVar);

    void c(int i, a aVar, b bVar, c cVar);
}
