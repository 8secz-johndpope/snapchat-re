package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: aiza */
public final class aiza {
    public static final aiza a = new aiza(new aivz[0]);
    private final aivz[] b;
    private final AtomicBoolean c = new AtomicBoolean(false);

    public aiza(aivz[] aivzArr) {
        this.b = aivzArr;
    }

    public final void a() {
        for (aivz a : this.b) {
            a.a();
        }
    }

    public final void a(int i, long j) {
        for (aivz a : this.b) {
            a.a(i, j);
        }
    }

    public final void a(int i, long j, long j2) {
        for (aivz a : this.b) {
            a.a(i, j, j2);
        }
    }

    public final void a(long j) {
        for (aivz b : this.b) {
            b.b(j);
        }
    }

    public final void a(aivw aivw) {
        int i = 0;
        if (this.c.compareAndSet(false, true)) {
            aivz[] aivzArr = this.b;
            int length = aivzArr.length;
            while (i < length) {
                aivzArr[i].a(aivw);
                i++;
            }
        }
    }

    public final void b() {
        for (aivz b : this.b) {
            b.b();
        }
    }

    public final void b(long j) {
        for (aivz a : this.b) {
            a.a(j);
        }
    }

    public final void c(long j) {
        for (aivz d : this.b) {
            d.d(j);
        }
    }

    public final void d(long j) {
        for (aivz c : this.b) {
            c.c(j);
        }
    }
}
