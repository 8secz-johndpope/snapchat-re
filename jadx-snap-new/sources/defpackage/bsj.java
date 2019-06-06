package defpackage;

import android.os.Handler;

/* renamed from: bsj */
public interface bsj {

    /* renamed from: bsj$b */
    public interface b {
        void a(bsj bsj, bly bly, Object obj);
    }

    /* renamed from: bsj$a */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final long d;

        public a(int i) {
            this(i, -1);
        }

        public a(int i, int i2, int i3, long j) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = j;
        }

        public a(int i, long j) {
            this(i, -1, -1, j);
        }

        public final a a(int i) {
            if (this.a == i) {
                return this;
            }
            return new a(i, this.b, this.c, this.d);
        }

        public final boolean a() {
            return this.b != -1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
            }
        }

        public final int hashCode() {
            return ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d);
        }
    }

    bsi a(a aVar, bwy bwy);

    void a(Handler handler, bsk bsk);

    void a(blb blb, boolean z, b bVar);

    void a(bsi bsi);

    void a(b bVar);

    void a(bsk bsk);

    void b();
}
