package defpackage;

import defpackage.gdx.c;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ggu */
public final class ggu {

    /* renamed from: ggu$a */
    public static final class a implements gea {
        private /* synthetic */ gea a;
        private /* synthetic */ long b;

        a(gea gea, long j) {
            this.a = gea;
            this.b = j;
        }

        public final ygh a() {
            return this.a.a();
        }

        public final ygk b() {
            return this.a.b();
        }

        public final c c() {
            return this.a.c();
        }

        public final boolean d() {
            return this.a.d();
        }

        public final long e() {
            return this.b;
        }

        public final long f() {
            return this.a.f();
        }
    }

    public static final boolean a(geg geg) {
        akcr.b(geg, "request");
        return (geg.d() == null && geg.b() == null && geg.c() == null) || geg.h().contains(gdy.READ_CACHE_ONLY);
    }

    static final boolean b(geg geg) {
        return (geg.b() == null && geg.c() == null) ? false : true;
    }

    private static final boolean b(Set<? extends ajdy<gej>> set, ajdy<gej> ajdy, gej gej) {
        int size = set.size();
        Iterator it = set.iterator();
        int i = 0;
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                ajym.a();
            }
            next = (ajdy) next;
            boolean a = akcr.a((Object) ajdy, next);
            if (!((i == size + -1 ? 1 : null) == null && gej.a())) {
                z = false;
            }
            Object d = z ? gej.d() : gej;
            akcr.a(d, "if (needToCopy) contentR…sult() else contentResult");
            if (a) {
                gff f = d.f();
                gff gff = r9;
                gff gff2 = new gff(f.a, false, f.c, f.d, f.e, f.f, f.g, f.h);
                d = new gif(d, gff);
            }
            next.a(d);
            i = i2;
        }
        return size > 0;
    }
}
