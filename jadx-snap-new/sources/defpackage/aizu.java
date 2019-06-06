package defpackage;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: aizu */
class aizu {
    final aizo a;
    final ajah b;
    int c = 65535;
    final a d = new a(0);

    /* renamed from: aizu$a */
    final class a {
        final Queue<a> a;
        final int b;
        int c;
        int d;
        int e;
        aizn f;

        /* renamed from: aizu$a$a */
        final class a {
            private static /* synthetic */ boolean d = (aizu.class.desiredAssertionStatus() ^ 1);
            private akkd a;
            private boolean b;
            private boolean c;

            a(akkd akkd, boolean z) {
                this.a = akkd;
                this.b = z;
            }

            /* Access modifiers changed, original: final */
            public final int a() {
                return (int) this.a.b;
            }

            /* Access modifiers changed, original: final */
            public final a a(int i) {
                if (d || i < a()) {
                    i = Math.min(i, (int) this.a.b);
                    akkd akkd = new akkd();
                    akkd.a_(this.a, (long) i);
                    a aVar = new a(akkd, false);
                    if (this.c) {
                        a aVar2 = a.this;
                        aVar2.c -= i;
                    }
                    return aVar;
                }
                throw new AssertionError("Attempting to split a frame for the full size.");
            }

            /* Access modifiers changed, original: final */
            public final void b() {
                if (!this.c) {
                    this.c = true;
                    a.this.a.offer(this);
                    a aVar = a.this;
                    aVar.c += a();
                }
            }

            /* Access modifiers changed, original: final */
            public final void c() {
                do {
                    int a = a();
                    int min = Math.min(a, aizu.this.b.c());
                    if (min == a) {
                        int i = -a;
                        aizu.this.d.b(i);
                        a.this.b(i);
                        try {
                            aizu.this.b.a(this.b, a.this.b, this.a, a);
                            a.this.f.i.a(a);
                            if (this.c) {
                                a aVar = a.this;
                                aVar.c -= a;
                                a.this.a.remove(this);
                            }
                            return;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    a(min).c();
                } while (a() > 0);
            }
        }

        a(int i) {
            this.d = aizu.this.c;
            this.b = i;
            this.a = new ArrayDeque(2);
        }

        a(aizu aizu, aizn aizn) {
            this(aizn.h);
            this.f = aizn;
        }

        private int d() {
            return Math.max(0, Math.min(this.d, this.c));
        }

        private a e() {
            return (a) this.a.peek();
        }

        /* Access modifiers changed, original: final */
        public final int a() {
            return d() - this.e;
        }

        /* Access modifiers changed, original: final */
        public final int a(int i, b bVar) {
            int min = Math.min(i, b());
            int i2 = 0;
            while (c()) {
                a e = e();
                if (min < e.a()) {
                    if (min <= 0) {
                        break;
                    }
                    a a = e.a(min);
                    bVar.a();
                    i2 += a.a();
                    a.c();
                } else {
                    bVar.a();
                    i2 += e.a();
                    e.c();
                }
                min = Math.min(i - i2, b());
            }
            return i2;
        }

        /* Access modifiers changed, original: final */
        public final a a(akkd akkd, boolean z) {
            return new a(akkd, z);
        }

        /* Access modifiers changed, original: final */
        public final void a(int i) {
            this.e += i;
        }

        /* Access modifiers changed, original: final */
        public final int b() {
            return Math.min(this.d, aizu.this.d.d);
        }

        /* Access modifiers changed, original: final */
        public final int b(int i) {
            if (i <= 0 || Integer.MAX_VALUE - i >= this.d) {
                this.d += i;
                return this.d;
            }
            StringBuilder stringBuilder = new StringBuilder("Window size overflow for stream: ");
            stringBuilder.append(this.b);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        /* Access modifiers changed, original: final */
        public final boolean c() {
            return !this.a.isEmpty();
        }
    }

    /* renamed from: aizu$b */
    static final class b {
        private int a;

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            this.a++;
        }

        /* Access modifiers changed, original: final */
        public final boolean b() {
            return this.a > 0;
        }
    }

    aizu(aizo aizo, ajah ajah) {
        this.a = (aizo) Preconditions.checkNotNull(aizo, "transport");
        this.b = (ajah) Preconditions.checkNotNull(ajah, "frameWriter");
    }

    private a a(aizn aizn) {
        a aVar = (a) aizn.g;
        if (aVar != null) {
            return aVar;
        }
        aVar = new a(this, aizn);
        aizn.g = aVar;
        return aVar;
    }

    /* Access modifiers changed, original: final */
    public final int a(aizn aizn, int i) {
        if (aizn == null) {
            int b = this.d.b(i);
            b();
            return b;
        }
        a a = a(aizn);
        i = a.b(i);
        b bVar = new b();
        a.a(a.b(), bVar);
        if (bVar.b()) {
            a();
        }
        return i;
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        try {
            this.b.b();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, int i, akkd akkd, boolean z2) {
        Preconditions.checkNotNull(akkd, "source");
        aizn b = this.a.b(i);
        if (b != null) {
            a a = a(b);
            int b2 = a.b();
            boolean c = a.c();
            a a2 = a.a(akkd, z);
            if (c || b2 < a2.a()) {
                a2.b();
                if (c || b2 <= 0) {
                    if (z2) {
                        a();
                    }
                    return;
                }
                a2.a(b2).c();
                if (z2) {
                    a();
                }
                return;
            }
            a2.c();
            if (z2) {
                a();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        b bVar;
        int ceil;
        aizn[] d = this.a.d();
        int i = this.d.d;
        int length = d.length;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                bVar = new b();
            } else {
                ceil = (int) Math.ceil((double) (((float) i) / ((float) length)));
                int i3 = 0;
                while (i2 < length && i > 0) {
                    aizn aizn = d[i2];
                    a a = a(aizn);
                    int min = Math.min(i, Math.min(a.a(), ceil));
                    if (min > 0) {
                        a.a(min);
                        i -= min;
                    }
                    if (a.a() > 0) {
                        int i4 = i3 + 1;
                        d[i3] = aizn;
                        i3 = i4;
                    }
                    i2++;
                }
                length = i3;
            }
        }
        bVar = new b();
        for (aizn a2 : this.a.d()) {
            a a3 = a(a2);
            a3.a(a3.e, bVar);
            a3.e = 0;
        }
        if (bVar.b()) {
            a();
        }
    }
}
