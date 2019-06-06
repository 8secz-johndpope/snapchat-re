package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: bw */
public class bw {
    private HashSet<bw> a = new HashSet(2);
    public int f = 0;

    public void a() {
    }

    public final void a(bw bwVar) {
        this.a.add(bwVar);
    }

    public void b() {
        this.f = 0;
        this.a.clear();
    }

    public final void c() {
        this.f = 0;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bw) it.next()).c();
        }
    }

    public final void d() {
        this.f = 1;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bw) it.next()).a();
        }
    }

    public final boolean e() {
        return this.f == 1;
    }
}
