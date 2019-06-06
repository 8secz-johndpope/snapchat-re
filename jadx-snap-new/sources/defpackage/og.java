package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: og */
public final class og {
    public final b a;
    public final a b = new a();
    public final List<View> c = new ArrayList();

    /* renamed from: og$b */
    public interface b {
        int a();

        int a(View view);

        void a(int i);

        void a(View view, int i);

        void a(View view, int i, LayoutParams layoutParams);

        ViewHolder b(View view);

        View b(int i);

        void b();

        void c(int i);

        void c(View view);

        void d(View view);
    }

    /* renamed from: og$a */
    public static class a {
        public long a = 0;
        public a b;

        a() {
        }

        private void a() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public final void a(int i) {
            a aVar = this;
            while (i >= 64) {
                aVar.a();
                aVar = aVar.b;
                i -= 64;
            }
            aVar.a |= 1 << i;
        }

        /* Access modifiers changed, original: final */
        public final void a(int i, boolean z) {
            boolean z2 = z;
            a aVar = this;
            while (true) {
                if (i >= 64) {
                    aVar.a();
                    aVar = aVar.b;
                    i -= 64;
                } else {
                    boolean z3 = (aVar.a & Long.MIN_VALUE) != 0;
                    long j = (1 << i) - 1;
                    long j2 = aVar.a;
                    aVar.a = ((j2 & (j ^ -1)) << 1) | (j2 & j);
                    if (z2) {
                        aVar.a(i);
                    } else {
                        aVar.b(i);
                    }
                    if (z3 || aVar.b != null) {
                        aVar.a();
                        aVar = aVar.b;
                        z2 = z3;
                        i = 0;
                    } else {
                        return;
                    }
                }
            }
        }

        public final void b(int i) {
            a aVar = this;
            while (i >= 64) {
                aVar = aVar.b;
                if (aVar != null) {
                    i -= 64;
                } else {
                    return;
                }
            }
            aVar.a &= (1 << i) ^ -1;
        }

        public final boolean c(int i) {
            a aVar = this;
            while (i >= 64) {
                aVar.a();
                aVar = aVar.b;
                i -= 64;
            }
            return (aVar.a & (1 << i)) != 0;
        }

        public final boolean d(int i) {
            a aVar = this;
            while (i >= 64) {
                aVar.a();
                aVar = aVar.b;
                i -= 64;
            }
            long j = 1 << i;
            boolean z = (aVar.a & j) != 0;
            aVar.a &= j ^ -1;
            j--;
            long j2 = aVar.a;
            aVar.a = Long.rotateRight(j2 & (j ^ -1), 1) | (j2 & j);
            a aVar2 = aVar.b;
            if (aVar2 != null) {
                if (aVar2.c(0)) {
                    aVar.a(63);
                }
                aVar.b.d(0);
            }
            return z;
        }

        /* Access modifiers changed, original: final */
        public final int e(int i) {
            a aVar = this.b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.a) : Long.bitCount(this.a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.a & ((1 << i) - 1)) : aVar.e(i - 64) + Long.bitCount(this.a);
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.b.toString());
            stringBuilder.append("xx");
            stringBuilder.append(Long.toBinaryString(this.a));
            return stringBuilder.toString();
        }
    }

    public og(b bVar) {
        this.a = bVar;
    }

    private int e(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.a.a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.b.e(i2));
            if (e == 0) {
                while (this.b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    public final int a() {
        return this.a.a() - this.c.size();
    }

    public final void a(int i) {
        i = e(i);
        View b = this.a.b(i);
        if (b != null) {
            if (this.b.d(i)) {
                b(b);
            }
            this.a.a(i);
        }
    }

    public final void a(View view) {
        this.c.add(view);
        this.a.c(view);
    }

    public final void a(View view, int i, LayoutParams layoutParams, boolean z) {
        i = i < 0 ? this.a.a() : e(i);
        this.b.a(i, z);
        if (z) {
            a(view);
        }
        this.a.a(view, i, layoutParams);
    }

    public final void a(View view, int i, boolean z) {
        i = i < 0 ? this.a.a() : e(i);
        this.b.a(i, z);
        if (z) {
            a(view);
        }
        this.a.a(view, i);
    }

    public final int b() {
        return this.a.a();
    }

    public final View b(int i) {
        return this.a.b(e(i));
    }

    public final boolean b(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        this.a.d(view);
        return true;
    }

    public final int c(View view) {
        int a = this.a.a(view);
        return (a == -1 || this.b.c(a)) ? -1 : a - this.b.e(a);
    }

    public final View c(int i) {
        return this.a.b(i);
    }

    public final void d(int i) {
        i = e(i);
        this.b.d(i);
        this.a.c(i);
    }

    public final boolean d(View view) {
        return this.c.contains(view);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b.toString());
        stringBuilder.append(", hidden list:");
        stringBuilder.append(this.c.size());
        return stringBuilder.toString();
    }
}
