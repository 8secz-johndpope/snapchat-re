package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: dwa */
public final class dwa implements dvv {
    private final int a;
    private final Queue<Integer> b = new ArrayDeque();
    private int c = 0;

    public dwa(int i) {
        this.a = i;
    }

    public final void a(boolean z) {
        if (this.b.size() >= this.a) {
            this.c -= ((Integer) this.b.poll()).intValue();
        }
        this.b.offer(Integer.valueOf(z));
        this.c += z;
    }

    public final boolean a() {
        return this.c >= this.a;
    }
}
