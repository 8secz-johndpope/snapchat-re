package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import defpackage.xbp.a;

/* renamed from: xbc */
public final class xbc extends xbd {
    ajwy<Context> a;
    ajwy<xfn> b;
    ajwy<xaz> c;
    ajwy<xhl> d;
    ajwy<ajdw> e;
    ajwy<xgk> f;
    ajwy<xed> g;
    ajwy<xhc> h;
    ajwy<xfu> i;
    ajwy<xbb> j;
    ajwy<xjr> k;
    ajwy<xay> l;
    ajwy<xgq> m;
    ajwy<Optional<xck>> n;
    private ajwy<xbd> o;
    private ajwy<xjn> p;
    private ajwy<xhm> q;
    private ajdw r;
    private Context s;
    private xaz t;
    private Optional<xck> u;
    private xfu v;

    /* renamed from: xbc$a */
    static final class a implements defpackage.xbd.a {
        Context a;
        ajdw b;
        Optional<xck> c;
        xaz d;
        xfu e;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final xbd a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Context.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdw.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Optional.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(xaz.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e != null) {
                return new xbc(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(xfu.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: xbc$b */
    final class b implements a {
        private b() {
        }

        /* synthetic */ b(xbc xbc, byte b) {
            this();
        }

        public final xbp a() {
            return new c(xbc.this, (byte) 0);
        }
    }

    /* renamed from: xbc$c */
    final class c extends xbp {
        private ajwy<xga> a;
        private ajwy<xfz> b;
        private ajwy<xhj> c;
        private ajwy<xgm> d;
        private ajwy<xel> e;
        private ajwy<xeh> f;
        private ajwy<xfy> g;
        private ajwy<xem> h;
        private ajwy<xgo> i;
        private ajwy<xgv> j;
        private ajwy<xdn> k;
        private ajwy<xjp> l;
        private ajwy<xjq> m;
        private ajwy<xdy> n;
        private ajwy<xgt> o;
        private ajwy<xgr> p;
        private ajwy<xdp> q;
        private ajwy<xcj> r;
        private /* synthetic */ xbc s;

        private c(xbc xbc) {
            this.s = xbc;
            this.a = aiqb.a(xbt.a);
            this.b = aiqb.a(new xbs(this.a));
            this.c = aiqg.a(xhk.a);
            this.d = aiqb.a(xbr.a);
            this.e = aiqb.a(new xce(this.s.d, this.s.f, this.s.e));
            this.h = new aiqa();
            this.f = aiqb.a(new xby(this.s.b, this.s.d, this.s.m, this.s.f, this.s.a));
            this.g = aiqb.a(new xbq(this.h, this.f, this.s.f, this.s.a, this.a, this.b, this.s.d, this.s.c, this.s.m, this.s.b, this.s.h, this.s.i));
            aiqa aiqa = (aiqa) this.h;
            this.h = aiqb.a(new xcf(this.e, this.s.d, this.s.f, this.s.m, this.s.c, this.s.b, this.s.l, this.d, this.s.a, this.g));
            ajwy ajwy = this.h;
            if (ajwy == null) {
                throw new IllegalArgumentException();
            } else if (aiqa.a == null) {
                aiqa.a = ajwy;
                this.i = aiqb.a(new xbz(this.c, this.s.m, this.d, this.s.l, this.s.b, this.s.j, this.s.f, this.s.a, this.s.d, this.s.k, this.h, this.f, this.g));
                this.j = aiqb.a(new xcg(this.c, this.s.m, this.d, this.s.l, this.s.b, this.s.j, this.s.f, this.s.a, this.s.d, this.h, this.f, this.g, this.s.n));
                this.k = aiqb.a(new xbu(this.s.j, this.s.d, this.s.m, this.s.l, this.s.g));
                this.l = aiqb.a(new xbw(this.s.f, this.h, this.f));
                this.m = aiqb.a(new xbx(this.s.f, this.s.b));
                this.n = aiqb.a(new xbv(this.s.e, this.s.d, this.s.j, this.s.f, this.h, this.s.l, this.s.c, this.s.m, this.s.b, this.c, this.s.a));
                this.o = aiqb.a(new xcc(this.s.a, this.s.f, this.s.e));
                this.p = aiqb.a(new xcb(this.s.a, this.c, this.s.f, this.s.l, this.s.b, this.s.j, this.f, this.h, this.i, this.j, this.s.d, this.s.k, this.s.h, this.k, this.b, this.s.c, this.d, this.s.m, this.o, this.n, xbf.a));
                this.q = aiqb.a(new xcd(this.s.j, this.s.f));
                this.r = aiqb.a(new xca(this.s.f, this.s.b, this.s.k, this.s.m, this.c, this.s.e, this.s.l));
            } else {
                throw new IllegalStateException();
            }
        }

        /* synthetic */ c(xbc xbc, byte b) {
            this(xbc);
        }

        public final xjp a() {
            return (xjp) this.l.get();
        }

        public final xem b() {
            return (xem) this.h.get();
        }

        public final xjq c() {
            return (xjq) this.m.get();
        }

        public final xeh d() {
            return (xeh) this.f.get();
        }

        public final xfy e() {
            return (xfy) this.g.get();
        }

        public final xdy f() {
            return (xdy) this.n.get();
        }

        public final xgr g() {
            return (xgr) this.p.get();
        }

        public final xgt h() {
            return (xgt) this.o.get();
        }

        public final xdp i() {
            return (xdp) this.q.get();
        }

        public final xcj j() {
            return (xcj) this.r.get();
        }
    }

    private xbc(a aVar) {
        this.a = aiqd.a(aVar.a);
        this.b = aiqb.a(new xbl(this.a));
        this.c = aiqd.a(aVar.d);
        this.o = aiqd.a(this);
        this.d = aiqg.a(new xbo(this.b, this.a));
        this.e = aiqd.a(aVar.b);
        this.f = aiqb.a(new xbk(this.e));
        this.g = aiqb.a(new xbe(this.f, this.d, this.b, this.a, this.e, xbm.a));
        this.h = aiqg.a(new xbh(this.a));
        this.i = aiqd.a(aVar.e);
        this.j = aiqb.a(new xbi(this.c, this.o, this.d, this.f, this.a, this.e, this.g, this.h, this.b, this.i));
        this.p = aiqb.a(new xbj(this.j, this.f, this.e));
        this.k = aiqg.a(xjs.a);
        this.q = aiqg.a(xhn.a);
        this.l = aiqb.a(new xbg(this.a, this.k, this.j, this.o, this.q, this.h));
        this.m = aiqg.a(new xbn(this.b, this.f, this.a));
        this.r = aVar.b;
        this.s = aVar.a;
        this.t = aVar.d;
        this.u = aVar.c;
        this.v = aVar.e;
        this.n = aiqd.a(aVar.c);
    }

    /* synthetic */ xbc(a aVar, byte b) {
        this(aVar);
    }

    public static xbd.a a() {
        return new a();
    }

    public final xfn b() {
        return (xfn) this.b.get();
    }

    public final xjn c() {
        return (xjn) this.p.get();
    }

    public final xay d() {
        return (xay) this.l.get();
    }

    public final xgk e() {
        return (xgk) this.f.get();
    }

    public final xhl f() {
        return (xhl) this.d.get();
    }

    public final xhc g() {
        return (xhc) this.h.get();
    }

    public final xgq h() {
        return (xgq) this.m.get();
    }

    public final ajdw i() {
        return this.r;
    }

    public final xbb j() {
        return (xbb) this.j.get();
    }

    public final xaz k() {
        return this.t;
    }

    public final a l() {
        return new b(this, (byte) 0);
    }

    public final xfu m() {
        return this.v;
    }
}
