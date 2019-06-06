package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import defpackage.kqe.ak;
import defpackage.lpj.a;
import defpackage.lpj.d;
import java.util.List;
import java.util.Set;

/* renamed from: lqj */
public final class lqj extends lpj {
    private ajdp<Boolean> A;
    private ajdp<ViewGroup> B;
    private lth C;
    private lpi D;
    private ajdp<Double> E;
    private ajdp<mih> F;
    private ajdp<ajxw> G;
    private ajdp<ViewStub> H;
    private ajdp<View> I;
    private ajfb<lqo> J;
    private ajfb<lwo> K;
    private mzk L;
    private mtj M;
    private mwa N;
    private ajdp<View> O;
    private Boolean P;
    private akbl<? super mji, ? extends ajcx> Q;
    private mvu R;
    private String S;
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private volatile Object f;
    private volatile Object g;
    private volatile Object h;
    private volatile Object i;
    private volatile Object j;
    private volatile Object k;
    private volatile Object l;
    private volatile Object m;
    private volatile Object n;
    private volatile Object o;
    private volatile Object p;
    private volatile Object q;
    private volatile Object r;
    private d s;
    private akbl<Context, jn> t;
    private ajfb<ajxr<mhs, List<mhs>, ak>> u;
    private lqh v;
    private lqp w;
    private Boolean x;
    private ajdp<Boolean> y;
    private Boolean z;

    /* renamed from: lqj$a */
    static final class a extends defpackage.lpj.a {
        lpi A;
        akbl<? super mji, ? extends ajcx> B;
        mzk C;
        mwa D;
        mvu E;
        mtj F;
        d g;
        akbl<Context, jn> h;
        ajdp<ViewGroup> i;
        ajdp<View> j;
        lqp k;
        Boolean l;
        Boolean m;
        Boolean n;
        ajdp<Boolean> o;
        ajdp<Boolean> p;
        ajdp<Double> q;
        ajdp<mih> r;
        ajfb<ajxr<mhs, List<mhs>, ak>> s;
        ajdp<ViewStub> t;
        ajdp<View> u;
        ajdp<ajxw> v;
        String w;
        ajfb<lqo> x;
        ajfb<lwo> y;
        lth z;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final lpj a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(d.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(akbl.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.j == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.k == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lqp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.l == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.m == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.n == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.o == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.p == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.q == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.r == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.s == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajfb.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.t == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.u == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.v == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.w == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(String.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.x == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajfb.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.y == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajfb.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.z == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lth.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.A == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lpi.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.B == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(akbl.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.C == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mzk.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.D == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mwa.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.E == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mvu.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.F != null) {
                return new lqj(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mtj.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.lpj.a d(ajdp ajdp) {
            this.o = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lpj.a e(ajdp ajdp) {
            this.p = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lpj.a f(ajdp ajdp) {
            this.q = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lpj.a g(ajdp ajdp) {
            this.r = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lpj.a h(ajdp ajdp) {
            this.t = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lpj.a i(ajdp ajdp) {
            this.u = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lpj.a j(ajdp ajdp) {
            this.v = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lqj(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = new aiqe();
        this.g = new aiqe();
        this.h = new aiqe();
        this.i = new aiqe();
        this.j = new aiqe();
        this.k = new aiqe();
        this.l = new aiqe();
        this.m = new aiqe();
        this.n = new aiqe();
        this.o = new aiqe();
        this.p = new aiqe();
        this.q = new aiqe();
        this.r = new aiqe();
        this.s = aVar.g;
        this.t = aVar.h;
        this.u = aVar.s;
        this.v = null;
        this.w = aVar.k;
        this.x = aVar.l;
        this.y = aVar.o;
        this.z = aVar.m;
        this.A = aVar.p;
        this.B = aVar.i;
        this.C = aVar.z;
        this.D = aVar.A;
        this.E = aVar.q;
        this.F = aVar.r;
        this.G = aVar.v;
        this.H = aVar.t;
        this.I = aVar.u;
        this.J = aVar.x;
        this.K = aVar.y;
        this.L = aVar.C;
        this.M = aVar.F;
        this.N = aVar.D;
        this.O = aVar.j;
        this.P = aVar.n;
        this.Q = aVar.B;
        this.R = aVar.E;
        this.S = aVar.w;
    }

    /* synthetic */ lqj(a aVar, byte b) {
        this(aVar);
    }

    private ajws<lqo> B() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = lpt.a();
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (ajws) obj;
    }

    private ajfb<lqo> C() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lpr.a(this.J, B());
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (ajfb) obj;
    }

    private mhi<? extends mha> D() {
        Throwable th;
        mhi mhi;
        mhi mhi2 = this.c;
        if (mhi2 instanceof aiqe) {
            synchronized (mhi2) {
                Object obj;
                try {
                    mhi mhi3 = this.c;
                    if (mhi3 instanceof aiqe) {
                        zfw d = d();
                        lqp lqp = this.w;
                        boolean booleanValue = this.x.booleanValue();
                        ajdp ajdp = this.y;
                        boolean booleanValue2 = this.z.booleanValue();
                        ajdp ajdp2 = this.A;
                        ajdp ajdp3 = this.B;
                        lth lth = this.C;
                        lpi lpi = this.D;
                        ajdp ajdp4 = (ajdp) aiqf.a(this.s.z(), "Cannot return null from a non-@Nullable component method");
                        ajdp ajdp5 = this.E;
                        ajdp ajdp6 = this.F;
                        ajdp ajdp7 = this.G;
                        ajdp ajdp8 = this.H;
                        ajdp ajdp9 = ajdp7;
                        ajdp7 = this.I;
                        ajdp ajdp10 = ajdp8;
                        obj = mhi2;
                        try {
                            mhi3 = lpo.a(this, d, lqp, booleanValue, ajdp, booleanValue2, ajdp2, ajdp3, lth, lpi, ajdp4, ajdp5, ajdp6, ajdp9, ajdp10, ajdp7, C(), this.K, this.L, this.M, this.N);
                            this.c = aiqb.a(this.c, mhi3);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                    obj = mhi2;
                    mhi2 = mhi3;
                    mhi = mhi2;
                } catch (Throwable th3) {
                    th = th3;
                    obj = mhi2;
                    throw th;
                }
            }
        }
        mhi = mhi2;
        return mhi;
    }

    private mhi<? extends mha> E() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = lqc.a(this, this.w, this.F, this.B, this.O);
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> F() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = lpx.a(this, this.w, this.F, this.B, this.P.booleanValue(), this.A);
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> G() {
        Object obj = this.h;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof aiqe) {
                    obj2 = lpv.a(this, this.w, this.B);
                    this.h = aiqb.a(this.h, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> H() {
        Object obj = this.i;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.i;
                if (obj2 instanceof aiqe) {
                    obj2 = lpm.a(this, this.Q, this.x.booleanValue());
                    this.i = aiqb.a(this.i, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private ajdp<lqo> I() {
        Object obj = this.k;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.k;
                if (obj2 instanceof aiqe) {
                    obj2 = lps.a(B());
                    this.k = aiqb.a(this.k, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    private mhi<? extends mha> J() {
        Object obj = this.j;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.j;
                if (obj2 instanceof aiqe) {
                    obj2 = lpp.a(this, this.w, this.F, this.B, I());
                    this.j = aiqb.a(this.j, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> K() {
        Object obj = this.l;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.l;
                if (obj2 instanceof aiqe) {
                    obj2 = lpu.a(this, this.w, this.B, this.E, (mwe) aiqf.a(this.s.J(), "Cannot return null from a non-@Nullable component method"), this.R);
                    this.l = aiqb.a(this.l, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> L() {
        Object obj = this.m;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.m;
                if (obj2 instanceof aiqe) {
                    obj2 = lpw.a(this, this.S);
                    this.m = aiqb.a(this.m, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> M() {
        Object obj = this.n;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.n;
                if (obj2 instanceof aiqe) {
                    obj2 = lqa.a(this, this.w, this.F, this.z.booleanValue(), this.A, this.B);
                    this.n = aiqb.a(this.n, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> N() {
        Object obj = this.o;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.o;
                if (obj2 instanceof aiqe) {
                    obj2 = lqb.a(this, this.w, this.B);
                    this.o = aiqb.a(this.o, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> O() {
        Object obj = this.p;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.p;
                if (obj2 instanceof aiqe) {
                    obj2 = lqd.a(this, this.w, this.B);
                    this.p = aiqb.a(this.p, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> P() {
        Object obj = this.q;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.q;
                if (obj2 instanceof aiqe) {
                    obj2 = lpq.a(this, this.w, this.B);
                    this.q = aiqb.a(this.q, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> Q() {
        Object obj = this.r;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.r;
                if (obj2 instanceof aiqe) {
                    obj2 = lpy.a(this, this.F, this.w, this.B, I(), this.A);
                    this.r = aiqb.a(this.r, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    public static a f() {
        return new a();
    }

    public final mqt A() {
        return (mqt) aiqf.a(this.s.C(), "Cannot return null from a non-@Nullable component method");
    }

    public final lqh c() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lpn.a(null, (ajdp) aiqf.a(this.s.y(), "Cannot return null from a non-@Nullable component method"), (mwe) aiqf.a(this.s.J(), "Cannot return null from a non-@Nullable component method"), (miw) aiqf.a(this.s.K_(), "Cannot return null from a non-@Nullable component method"), (kqf) aiqf.a(this.s.A(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.s.u(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.s.I(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lqh) obj;
    }

    public final zfw d() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lpz.a((zgb) aiqf.a(this.s.u(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.s.I(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final Set<mhi<? extends mha>> e() {
        return ImmutableSet.of(D(), E(), F(), G(), H(), J(), K(), L(), M(), N(), O(), P(), Q());
    }

    public final ide g() {
        return (ide) aiqf.a(this.s.I(), "Cannot return null from a non-@Nullable component method");
    }

    public final zgb h() {
        return (zgb) aiqf.a(this.s.u(), "Cannot return null from a non-@Nullable component method");
    }

    public final mwe i() {
        return (mwe) aiqf.a(this.s.J(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajdp<mmt> j() {
        return (ajdp) aiqf.a(this.s.y(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajdp<lqf> k() {
        return (ajdp) aiqf.a(this.s.z(), "Cannot return null from a non-@Nullable component method");
    }

    public final miw l() {
        return (miw) aiqf.a(this.s.K_(), "Cannot return null from a non-@Nullable component method");
    }

    public final kqf m() {
        return (kqf) aiqf.a(this.s.A(), "Cannot return null from a non-@Nullable component method");
    }

    public final lxh n() {
        return (lxh) aiqf.a(this.s.B(), "Cannot return null from a non-@Nullable component method");
    }

    public final akbl<Context, jn> o() {
        return this.t;
    }

    public final myv p() {
        return (myv) aiqf.a(this.s.D(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajfb<ajxr<mhs, List<mhs>, ak>> q() {
        return this.u;
    }

    public final ide r() {
        return (ide) aiqf.a(this.s.I(), "Cannot return null from a non-@Nullable component method");
    }

    public final zgb s() {
        return (zgb) aiqf.a(this.s.u(), "Cannot return null from a non-@Nullable component method");
    }

    public final akbl<Context, jn> t() {
        return this.t;
    }

    public final ajdp<mmt> u() {
        return (ajdp) aiqf.a(this.s.y(), "Cannot return null from a non-@Nullable component method");
    }

    public final mwe v() {
        return (mwe) aiqf.a(this.s.J(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajdp<lqf> w() {
        return (ajdp) aiqf.a(this.s.z(), "Cannot return null from a non-@Nullable component method");
    }

    public final miw x() {
        return (miw) aiqf.a(this.s.K_(), "Cannot return null from a non-@Nullable component method");
    }

    public final Supplier<iha> y() {
        return (Supplier) aiqf.a(this.s.w(), "Cannot return null from a non-@Nullable component method");
    }

    public final kpk z() {
        return (kpk) aiqf.a(this.s.E(), "Cannot return null from a non-@Nullable component method");
    }
}
