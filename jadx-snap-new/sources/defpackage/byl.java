package defpackage;

import defpackage.bxx.a;
import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: byl */
public final class byl implements byc, Comparator<byd> {
    private final long a = 52428800;
    private final TreeSet<byd> b = new TreeSet(this);
    private long c;

    private void b(bxx bxx, long j) {
        while (this.c + j > 52428800 && !this.b.isEmpty()) {
            try {
                bxx.b((byd) this.b.first());
            } catch (a unused) {
            }
        }
    }

    public final void a(bxx bxx, long j) {
        b(bxx, j);
    }

    public final void a(bxx bxx, byd byd) {
        this.b.add(byd);
        this.c += byd.c;
        b(bxx, 0);
    }

    public final void a(bxx bxx, byd byd, byd byd2) {
        a(byd);
        a(bxx, byd2);
    }

    public final void a(byd byd) {
        this.b.remove(byd);
        this.c -= byd.c;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        byd byd = (byd) obj;
        byd byd2 = (byd) obj2;
        return byd.f - byd2.f == 0 ? byd.compareTo(byd2) : byd.f < byd2.f ? -1 : 1;
    }
}
