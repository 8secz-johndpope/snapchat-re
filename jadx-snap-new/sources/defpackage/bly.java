package defpackage;

import android.util.Pair;

/* renamed from: bly */
public abstract class bly {
    public static final bly a = new 1();

    /* renamed from: bly$1 */
    static class 1 extends bly {
        1() {
        }

        public final int a(Object obj) {
            return -1;
        }

        public final a a(int i, a aVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        public final b a(int i, b bVar, boolean z, long j) {
            throw new IndexOutOfBoundsException();
        }

        public final int b() {
            return 0;
        }

        public final int c() {
            return 0;
        }
    }

    /* renamed from: bly$b */
    public static final class b {
        public boolean a;
        public int b;
        public int c;
        public long d;
        public long e;
        public long f;
        private Object g;
        private long h;
        private long i;
        private boolean j;

        public final b a(Object obj, long j, long j2, boolean z, boolean z2, long j3, long j4, int i, long j5) {
            this.g = obj;
            this.h = j;
            this.i = j2;
            this.j = z;
            this.a = z2;
            this.d = j3;
            this.e = j4;
            this.b = 0;
            this.c = i;
            this.f = j5;
            return this;
        }
    }

    /* renamed from: bly$a */
    public static final class a {
        public Object a;
        public int b;
        public long c;
        long d;
        private Object e;
        private bsu f;

        public final int a(long j) {
            return this.f.a(j);
        }

        public final long a(int i) {
            return this.f.b[i];
        }

        public final a a(Object obj, Object obj2, long j, long j2) {
            bsu bsu = bsu.a;
            this.e = obj;
            this.a = obj2;
            this.b = 0;
            this.c = j;
            this.d = j2;
            this.f = bsu;
            return this;
        }

        public final int b(int i) {
            return this.f.c[i].a(-1);
        }

        public final int b(long j) {
            return this.f.b(j);
        }
    }

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            return i == a(z) ? -1 : i + 1;
        } else {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == a(z) ? b(z) : i + 1;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final int a(int i, a aVar, b bVar, int i2, boolean z) {
        int i3 = a(i, aVar, false).b;
        if (a(i3, bVar).c != i) {
            return i + 1;
        }
        i = a(i3, i2, z);
        return i == -1 ? -1 : a(i, bVar).b;
    }

    public abstract int a(Object obj);

    public int a(boolean z) {
        return a() ? -1 : b() - 1;
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i, long j) {
        return a(bVar, aVar, i, j, 0);
    }

    public final Pair<Integer, Long> a(b bVar, a aVar, int i, long j, long j2) {
        byo.a(i, b());
        a(i, bVar, false, j2);
        if (j == -9223372036854775807L) {
            j = bVar.d;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        i = bVar.b;
        long j3 = bVar.f + j;
        while (true) {
            long j4 = a(i, aVar, false).c;
            if (j4 != -9223372036854775807L && j3 >= j4 && i < bVar.c) {
                j3 -= j4;
                i++;
            }
        }
        return Pair.create(Integer.valueOf(i), Long.valueOf(j3));
    }

    public abstract a a(int i, a aVar, boolean z);

    public final b a(int i, b bVar) {
        return a(i, bVar, false, 0);
    }

    public abstract b a(int i, b bVar, boolean z, long j);

    public final boolean a() {
        return b() == 0;
    }

    public abstract int b();

    public int b(boolean z) {
        return a() ? -1 : 0;
    }

    public final boolean b(int i, a aVar, b bVar, int i2, boolean z) {
        return a(i, aVar, bVar, i2, z) == -1;
    }

    public abstract int c();
}
