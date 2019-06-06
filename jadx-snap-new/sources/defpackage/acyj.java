package defpackage;

import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: acyj */
public final class acyj {
    public final SparseArray<acyf> a = new SparseArray();
    private final Deque<acyi> b = new ArrayDeque();
    private final SparseArray<acyh> c = new SparseArray();
    private final SparseArray<acyg> d = new SparseArray();

    public final acyf a() {
        synchronized (this.d) {
            acyf acyf = (acyf) this.a.get(4000);
            if (acyf == null) {
                acyf = new acyf();
                return acyf;
            }
            this.a.remove(4000);
            acyf.a.rewind();
            return acyf;
        }
    }

    public final acyh a(int i) {
        synchronized (this.c) {
            acyh acyh = (acyh) this.c.get(i << 2);
            if (acyh == null) {
                acyh = new acyh(i);
                return acyh;
            }
            this.c.remove(i);
            acyh.a.rewind();
            return acyh;
        }
    }

    public final void a(acyg acyg) {
        synchronized (this.d) {
            this.d.put(acyg.b, acyg);
        }
    }

    public final void a(acyh acyh) {
        synchronized (this.c) {
            this.c.put(acyh.b, acyh);
        }
    }

    public final void a(acyi acyi) {
        synchronized (this.b) {
            this.b.addFirst(acyi);
        }
    }

    public final acyg b(int i) {
        synchronized (this.d) {
            acyg acyg = (acyg) this.d.get(i << 2);
            if (acyg == null) {
                acyg = new acyg(i);
                return acyg;
            }
            this.d.remove(i);
            acyg.a.rewind();
            return acyg;
        }
    }

    public final acyi b() {
        synchronized (this.b) {
            acyi acyi;
            if (this.b.isEmpty()) {
                acyi = new acyi();
                return acyi;
            }
            acyi = (acyi) this.b.removeFirst();
            acyi.a.rewind();
            return acyi;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        super.finalize();
    }
}
