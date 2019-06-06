package defpackage;

import com.google.common.base.Suppliers;
import com.snap.fidelius.deps.FideliusHttpInterface;
import java.util.Map;

/* renamed from: ibi */
public final class ibi implements hyw {
    private hyp a = null;
    private hzc b = null;
    private hza c = null;
    private hyx d = null;
    private hyy e = null;
    private hyu f = null;
    private hyv g = null;
    private final ajwy<iba> h;
    private final ajwy<ian> i;
    private final ajwy<hyk> j;
    private final ajwy<hys> k;
    private final ajwy<zgb> l;
    private final ajwy<hyo> m;
    private final ajwy<hym> n;
    private final ajwy<abxu> o;
    private final ajwy<icp> p;
    private final ajwy<icm> q;
    private final ajwy<ico> r;
    private final ajwy<iam> s;
    private final ajwy<FideliusHttpInterface> t;
    private final ajei u;

    public ibi(ajwy<ian> ajwy, ajwy<hyk> ajwy2, ajwy<hys> ajwy3, ajwy<iba> ajwy4, ajwy<zgb> ajwy5, ajwy<hyo> ajwy6, ajwy<hym> ajwy7, ajwy<abxu> ajwy8, ajwy<icp> ajwy9, ajwy<icm> ajwy10, ajwy<ico> ajwy11, ajwy<iam> ajwy12, ajwy<FideliusHttpInterface> ajwy13, ajei ajei) {
        this.i = ajwy;
        this.j = ajwy2;
        this.k = ajwy3;
        this.h = ajwy4;
        this.l = ajwy5;
        this.m = ajwy6;
        this.n = ajwy7;
        this.o = ajwy8;
        this.p = ajwy9;
        this.q = ajwy10;
        this.r = ajwy11;
        this.s = ajwy12;
        this.t = ajwy13;
        this.u = ajei;
    }

    private /* synthetic */ byte[] d() {
        return ((iba) this.h.get()).c();
    }

    private /* synthetic */ byte[] e() {
        return ((iba) this.h.get()).c();
    }

    private /* synthetic */ byte[] f() {
        return ((iba) this.h.get()).b();
    }

    private void g(String str) {
        ((hyk) this.j.get()).k(str);
    }

    private /* synthetic */ byte[] g() {
        return ((iba) this.h.get()).c();
    }

    private /* synthetic */ byte[] h() {
        return ((iba) this.h.get()).b();
    }

    private /* synthetic */ byte[] i() {
        return ((iba) this.h.get()).c();
    }

    public final synchronized hzc a(String str) {
        if (this.b == null && ((abxu) this.o.get()).a() != null) {
            g(str);
        }
        return this.b;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a() {
        if (this.b == null) {
            this.b = new ibn(new ibs(this.i, this.j, this.k), new -$$Lambda$ibi$GZvEKqsBEUXe2-SAE1lB22D6Qkg(this), new -$$Lambda$ibi$OxRqkKEAtK16fGYbQghQRVerKCA(this));
        }
        if (this.c == null) {
            this.c = new ibm(new ibr(this.i, this, this.j, this.k), new -$$Lambda$ibi$060tsKTGOFLxLcLuICY9QUisYXI(this), new -$$Lambda$ibi$O2t6YIUbVaBpr-r2c7VMJ1GpD1U(this));
        }
        if (this.e == null) {
            this.e = new ibk(this, this.j, this.k, new -$$Lambda$ibi$eU8PE3r1_gChYJWeddPe4g4y-ho(this));
        }
        if (this.f == null) {
            this.f = new ibh(this.q, this.r, this, this.j, this.k, this.s);
        }
        if (this.g == null) {
            this.g = new ibe(this.p, this.j);
        }
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void a(ibb ibb, Map<String, ahql> map) {
        ajwy ajwy = this.j;
        hys hys = (hys) this.k.get();
        ian ian = (ian) this.i.get();
        this.l.get();
        this.a = new ibf(ajwy, ibb, hys, ian, (hyo) this.m.get(), (hym) this.n.get(), (FideliusHttpInterface) this.t.get(), this.u);
        ajwy ajwy2 = this.i;
        ajwy ajwy3 = this.j;
        ajwy ajwy4 = this.k;
        this.l.get();
        this.b = new ibn(new ibu(ibb, ajwy2, ajwy3, ajwy4), Suppliers.ofInstance(ibb.a.b), Suppliers.ofInstance(ibb.a.c));
        ajwy3 = this.i;
        ajwy ajwy5 = this.j;
        ajwy ajwy6 = this.k;
        this.l.get();
        this.c = new ibm(new ibt(ibb, ajwy3, this, ajwy5, ajwy6), Suppliers.ofInstance(ibb.a.b), Suppliers.ofInstance(ibb.a.c));
        this.e = new ibk(this, this.j, this.k, Suppliers.ofInstance(ibb.a.b));
        ajwy = this.j;
        this.l.get();
        this.d = new ibj(ibb, ajwy);
        if (!(map == null || this.a == null)) {
            this.a.a((Map) map, "client_init");
        }
    }

    public final synchronized hyx b(String str) {
        if (this.d == null && ((abxu) this.o.get()).a() != null) {
            g(str);
        }
        return this.d;
    }

    /* Access modifiers changed, original: final|declared_synchronized */
    public final synchronized void b() {
        this.a = null;
        this.b = null;
        this.d = null;
        this.c = null;
        this.f = null;
        this.g = null;
        this.e = null;
    }

    public final synchronized hyv c(String str) {
        if (this.g == null && ((abxu) this.o.get()).a() != null) {
            g(str);
        }
        return this.g;
    }

    public final synchronized hyy c() {
        if (this.e == null && ((abxu) this.o.get()).a() != null) {
            this.e = new ibk(this, this.j, this.k, new -$$Lambda$ibi$dKoYq6WK_WnPl914Flw3i49Di5U(this));
        }
        return this.e;
    }

    public final synchronized hyp d(String str) {
        if (this.a == null && ((abxu) this.o.get()).a() != null) {
            g(str);
        }
        return this.a;
    }

    public final synchronized hza e(String str) {
        if (this.c == null && ((abxu) this.o.get()).a() != null) {
            g(str);
        }
        return this.c;
    }

    public final synchronized hyu f(String str) {
        if (this.f == null && ((abxu) this.o.get()).a() != null) {
            g(str);
        }
        return this.f;
    }
}
