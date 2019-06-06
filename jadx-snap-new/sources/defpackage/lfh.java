package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.google.gson.Gson;
import com.snap.lenses.app.data.LensesHttpInterface;
import com.snap.lenses.app.data.SocialUnlockHttpInterface;
import defpackage.lbp.a;
import defpackage.lfu.c;
import java.util.Set;
import java.util.TimeZone;

/* renamed from: lfh */
public final class lfh extends lfu {
    private volatile ajwy<mwe> A;
    private volatile Object B;
    private volatile Object C;
    private volatile Object D;
    private volatile Object E;
    private volatile Object F;
    private volatile Object G;
    private volatile Object H;
    private volatile Object I;
    private c J;
    private a K;
    private ide L;
    private kqf M;
    private Supplier<gfu> N;
    private lff O;
    private Set<? extends mwe> P;
    private zpo Q;
    private mzn R;
    private kxt S;
    private ckx T;
    private gnk U;
    private lcq V;
    private volatile Object a;
    private volatile ajwy<lbp> b;
    private volatile Object c;
    private volatile Object d;
    private volatile ajwy<mvc> e;
    private volatile Object f;
    private volatile Object g;
    private volatile Object h;
    private volatile Object i;
    private volatile ajwy<LensesHttpInterface> j;
    private volatile Object k;
    private volatile Object l;
    private volatile Object m;
    private volatile Object n;
    private volatile Object o;
    private volatile Object p;
    private volatile Object q;
    private volatile Object r;
    private volatile Object s;
    private volatile Object t;
    private volatile Object u;
    private volatile ajwy<SocialUnlockHttpInterface> v;
    private volatile Object w;
    private volatile Object x;
    private volatile Object y;
    private volatile Object z;

    /* renamed from: lfh$a */
    static final class a extends defpackage.lfu.a {
        c a;
        ide b;
        defpackage.lbp.a c;
        lcq d;
        kqf e;
        zpo f;
        lff g;
        Supplier<gfu> h;
        mzn i;
        gnk j;
        ckx k;
        kxt l;
        Set<? extends mwe> m;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final lfu a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(defpackage.lbp.a.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lcq.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Supplier.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.j == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(gnk.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.l == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(kxt.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.m != null) {
                return new lfh(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Set.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: lfh$b */
    final class b<T> implements ajwy<T> {
        private final int a;

        b(int i) {
            this.a = i;
        }

        public final T get() {
            int i = this.a;
            if (i == 0) {
                return lfh.this.f();
            }
            if (i == 1) {
                return lfh.this.h();
            }
            if (i == 2) {
                return lfh.this.g();
            }
            if (i == 3) {
                return lfh.this.i();
            }
            if (i == 4) {
                return lfh.this.j();
            }
            throw new AssertionError(i);
        }
    }

    private lfh(a aVar) {
        this.a = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.f = new aiqe();
        this.g = new aiqe();
        this.h = new aiqe();
        this.i = new aiqe();
        this.k = new aiqe();
        this.l = new aiqe();
        this.m = new aiqe();
        this.n = new aiqe();
        this.o = new aiqe();
        this.p = new aiqe();
        this.q = new aiqe();
        this.r = new aiqe();
        this.s = new aiqe();
        this.t = new aiqe();
        this.u = new aiqe();
        this.w = new aiqe();
        this.x = new aiqe();
        this.y = new aiqe();
        this.z = new aiqe();
        this.B = new aiqe();
        this.C = new aiqe();
        this.D = new aiqe();
        this.E = new aiqe();
        this.F = new aiqe();
        this.G = new aiqe();
        this.H = new aiqe();
        this.I = new aiqe();
        this.J = aVar.a;
        this.K = aVar.c;
        this.L = aVar.b;
        this.M = aVar.e;
        this.N = aVar.h;
        this.O = aVar.g;
        this.P = aVar.m;
        this.Q = aVar.f;
        this.R = aVar.i;
        this.S = aVar.l;
        this.T = aVar.k;
        this.U = aVar.j;
        this.V = aVar.d;
    }

    /* synthetic */ lfh(a aVar, byte b) {
        this(aVar);
    }

    private long A() {
        Object obj = this.p;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.p;
                if (obj2 instanceof aiqe) {
                    obj2 = Long.valueOf(2);
                    this.p = aiqb.a(this.p, obj2);
                }
            }
            obj = obj2;
        }
        return ((Long) obj).longValue();
    }

    private ajdi<aeqv, aeqv> B() {
        Object obj = this.q;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.q;
                if (obj2 instanceof aiqe) {
                    obj2 = lgo.a((Context) aiqf.a(this.J.b(), "Cannot return null from a non-@Nullable component method"), x(), this.L, (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"), (Supplier) aiqf.a(this.J.g(), "Cannot return null from a non-@Nullable component method"), L());
                    this.q = aiqb.a(this.q, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdi) obj;
    }

    private lfq C() {
        Object obj = this.r;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.r;
                if (obj2 instanceof aiqe) {
                    obj2 = lfz.a((gqr) aiqf.a(this.J.e(), "Cannot return null from a non-@Nullable component method"), (Context) aiqf.a(this.J.b(), "Cannot return null from a non-@Nullable component method"), (Supplier) aiqf.a(this.J.f(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"), this.L);
                    this.r = aiqb.a(this.r, obj2);
                }
            }
            obj = obj2;
        }
        return (lfq) obj;
    }

    private lgx D() {
        Object obj = this.h;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof aiqe) {
                    obj2 = lgk.a(v(), w(), x(), y(), z(), A(), B(), C(), this.L, (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"));
                    this.h = aiqb.a(this.h, obj2);
                }
            }
            obj = obj2;
        }
        return (lgx) obj;
    }

    private lfp E() {
        Object obj = this.s;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.s;
                if (obj2 instanceof aiqe) {
                    obj2 = lfv.a(this.Q, L(), y(), z(), A(), C(), this.L, (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"));
                    this.s = aiqb.a(this.s, obj2);
                }
            }
            obj = obj2;
        }
        return (lfp) obj;
    }

    private lhg F() {
        Object obj = this.t;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.t;
                if (obj2 instanceof aiqe) {
                    obj2 = lfv.b(this.Q, L(), y(), z(), A(), C(), this.L, (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"));
                    this.t = aiqb.a(this.t, obj2);
                }
            }
            obj = obj2;
        }
        return (lhg) obj;
    }

    private ajwy<mvc> G() {
        ajwy ajwy = this.e;
        if (ajwy == null) {
            ajwy = new b(1);
            this.e = ajwy;
        }
        return ajwy;
    }

    private ajwy<SocialUnlockHttpInterface> H() {
        ajwy ajwy = this.v;
        if (ajwy == null) {
            ajwy = new b(3);
            this.v = ajwy;
        }
        return ajwy;
    }

    private mxp I() {
        Object obj = this.z;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.z;
                if (obj2 instanceof aiqe) {
                    obj2 = lgf.a(this.U, r(), this.N, (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"), this.L);
                    this.z = aiqb.a(this.z, obj2);
                }
            }
            obj = obj2;
        }
        return (mxp) obj;
    }

    private lgx J() {
        Object obj = this.C;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.C;
                if (obj2 instanceof aiqe) {
                    obj2 = lgn.a(v(), w(), x(), y(), z(), A(), B(), C(), this.L, (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"));
                    this.C = aiqb.a(this.C, obj2);
                }
            }
            obj = obj2;
        }
        return (lgx) obj;
    }

    private lfp K() {
        Object obj = this.D;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.D;
                if (obj2 instanceof aiqe) {
                    obj2 = lfv.a(this.Q, L(), y(), z(), C(), A(), (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"), this.L);
                    this.D = aiqb.a(this.D, obj2);
                }
            }
            obj = obj2;
        }
        return (lfp) obj;
    }

    private miw L() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    ajwy ajwy = this.b;
                    if (ajwy == null) {
                        ajwy = new b(0);
                        this.b = ajwy;
                    }
                    obj2 = lfx.a(ajwy);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (miw) obj;
    }

    public static lfu.a e() {
        return new a();
    }

    private Gson u() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = lga.a();
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (Gson) obj;
    }

    private lgx.c v() {
        Object obj = this.i;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.i;
                if (obj2 instanceof aiqe) {
                    ajwy ajwy = this.j;
                    if (ajwy == null) {
                        ajwy = new b(2);
                        this.j = ajwy;
                    }
                    obj2 = lgp.a(aiqb.b(ajwy), L());
                    this.i = aiqb.a(this.i, obj2);
                }
            }
            obj = obj2;
        }
        return (lgx.c) obj;
    }

    private TimeZone w() {
        Object obj = this.l;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.l;
                if (obj2 instanceof aiqe) {
                    obj2 = lgv.a();
                    this.l = aiqb.a(this.l, obj2);
                }
            }
            obj = obj2;
        }
        return (TimeZone) obj;
    }

    private mhk x() {
        Object obj = this.m;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.m;
                if (obj2 instanceof aiqe) {
                    obj2 = lfw.a();
                    this.m = aiqb.a(this.m, obj2);
                }
            }
            obj = obj2;
        }
        return (mhk) obj;
    }

    private ajdp<Boolean> y() {
        Object obj = this.n;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.n;
                if (obj2 instanceof aiqe) {
                    obj2 = lgt.a(L());
                    this.n = aiqb.a(this.n, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    private ajdp<Boolean> z() {
        Object obj = this.o;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.o;
                if (obj2 instanceof aiqe) {
                    obj2 = lgq.a(L());
                    this.o = aiqb.a(this.o, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    public final zgb a() {
        return (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method");
    }

    public final kqf b() {
        return this.M;
    }

    public final Supplier<gfu> c() {
        return this.N;
    }

    public final sah d() {
        return (sah) aiqf.a(this.J.h(), "Cannot return null from a non-@Nullable component method");
    }

    /* Access modifiers changed, original: final */
    public final lbp f() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lgi.a(this.K, this.L);
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (lbp) obj;
    }

    /* Access modifiers changed, original: final */
    public final LensesHttpInterface g() {
        Object obj = this.k;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.k;
                if (obj2 instanceof aiqe) {
                    obj2 = lgj.a((mxa) aiqf.a(this.J.c(), "Cannot return null from a non-@Nullable component method"));
                    this.k = aiqb.a(this.k, obj2);
                }
            }
            obj = obj2;
        }
        return (LensesHttpInterface) obj;
    }

    /* Access modifiers changed, original: final */
    public final mvc h() {
        Object obj;
        Throwable th;
        Object obj2 = this.f;
        if (obj2 instanceof aiqe) {
            synchronized (obj2) {
                try {
                    obj = this.f;
                    if (obj instanceof aiqe) {
                        Context context = (Context) aiqf.a(this.J.b(), "Cannot return null from a non-@Nullable component method");
                        Gson u = u();
                        mxa mxa = (mxa) aiqf.a(this.J.c(), "Cannot return null from a non-@Nullable component method");
                        mwp mwp = (mwp) aiqf.a(this.J.d(), "Cannot return null from a non-@Nullable component method");
                        ldu r = r();
                        lff lff = this.O;
                        kqf kqf = this.M;
                        Set set = this.P;
                        lgx D = D();
                        lfp E = E();
                        lhg F = F();
                        mzn mzn = this.R;
                        ide ide = this.L;
                        zgb zgb = (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method");
                        obj = lgb.a(context, u, mxa, mwp, r, lff, kqf, set, D, E, F, mzn, ide, zgb, L(), (Supplier) aiqf.a(this.J.g(), "Cannot return null from a non-@Nullable component method"));
                        this.f = aiqb.a(this.f, obj);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        obj = obj2;
        return (mvc) obj;
    }

    /* Access modifiers changed, original: final */
    public final SocialUnlockHttpInterface i() {
        Object obj = this.w;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.w;
                if (obj2 instanceof aiqe) {
                    obj2 = lgr.a((mxa) aiqf.a(this.J.c(), "Cannot return null from a non-@Nullable component method"));
                    this.w = aiqb.a(this.w, obj2);
                }
            }
            obj = obj2;
        }
        return (SocialUnlockHttpInterface) obj;
    }

    /* Access modifiers changed, original: final */
    public final mwe j() {
        Object obj = this.B;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.B;
                if (obj2 instanceof aiqe) {
                    obj2 = lgm.a(D(), J(), K(), E(), F(), (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"), this.L);
                    this.B = aiqb.a(this.B, obj2);
                }
            }
            obj = obj2;
        }
        return (mwe) obj;
    }

    public final mxa k() {
        return (mxa) aiqf.a(this.J.c(), "Cannot return null from a non-@Nullable component method");
    }

    public final mwe l() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lgg.a(G(), this.L, (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"));
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (mwe) obj;
    }

    public final mwe m() {
        Object obj = this.u;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.u;
                if (obj2 instanceof aiqe) {
                    obj2 = lgs.a(H(), C(), (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"), this.L, G(), l(), this.S);
                    this.u = aiqb.a(this.u, obj2);
                }
            }
            obj = obj2;
        }
        return (mwe) obj;
    }

    public final mwe n() {
        Object obj = this.x;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.x;
                if (obj2 instanceof aiqe) {
                    obj2 = lgu.a(this.T, C(), G(), this.L, (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"));
                    this.x = aiqb.a(this.x, obj2);
                }
            }
            obj = obj2;
        }
        return (mwe) obj;
    }

    public final mxs.a o() {
        Object obj = this.y;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.y;
                if (obj2 instanceof aiqe) {
                    mxp I = I();
                    ajwy ajwy = this.A;
                    if (ajwy == null) {
                        ajwy = new b(4);
                        this.A = ajwy;
                    }
                    obj2 = lgl.a(I, ajwy, (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"));
                    this.y = aiqb.a(this.y, obj2);
                }
            }
            obj = obj2;
        }
        return (mxs.a) obj;
    }

    public final ajfb<muo> p() {
        Object obj = this.E;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.E;
                if (obj2 instanceof aiqe) {
                    obj2 = lfy.a(G());
                    this.E = aiqb.a(this.E, obj2);
                }
            }
            obj = obj2;
        }
        return (ajfb) obj;
    }

    public final lfs q() {
        Object obj = this.F;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.F;
                if (obj2 instanceof aiqe) {
                    obj2 = lgh.a(H(), C(), (zgb) aiqf.a(this.J.a(), "Cannot return null from a non-@Nullable component method"), this.L);
                    this.F = aiqb.a(this.F, obj2);
                }
            }
            obj = obj2;
        }
        return (lfs) obj;
    }

    public final ldu r() {
        Object obj = this.G;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.G;
                if (obj2 instanceof aiqe) {
                    obj2 = lgd.a(this, this.V, this.L);
                    this.G = aiqb.a(this.G, obj2);
                }
            }
            obj = obj2;
        }
        return (ldu) obj;
    }

    public final mwa s() {
        Object obj = this.H;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.H;
                if (obj2 instanceof aiqe) {
                    obj2 = lge.a(G());
                    this.H = aiqb.a(this.H, obj2);
                }
            }
            obj = obj2;
        }
        return (mwa) obj;
    }

    public final mvu t() {
        Object obj = this.I;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.I;
                if (obj2 instanceof aiqe) {
                    obj2 = lgc.a(G());
                    this.I = aiqb.a(this.I, obj2);
                }
            }
            obj = obj2;
        }
        return (mvu) obj;
    }
}
