package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableSet;
import defpackage.lrj.a;
import defpackage.lrj.b;
import defpackage.lrj.c;
import java.util.Set;

/* renamed from: lsf */
public final class lsf extends a {
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
    private c n;
    private lth o;
    private Boolean p;
    private ajdp<Double> q;
    private ajdp<lsd> r;
    private Boolean s;
    private ajdp<lrg> t;
    private ajdp<mih> u;
    private mzk v;
    private mwa w;
    private lpi x;
    private lsu y;
    private mtj z;

    /* renamed from: lsf$a */
    static final class a implements defpackage.lrj.a.a {
        c a;
        ajdp<lsd> b;
        lsu c;
        Boolean d;
        Boolean e;
        ajdp<lrg> f;
        ajdp<Double> g;
        ajdp<mih> h;
        lth i;
        lpi j;
        mzk k;
        mtj l;
        mwa m;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final defpackage.lrj.a a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lsu.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lth.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.j == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lpi.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.k == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mzk.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.l == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mtj.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.m != null) {
                return new lsf(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mwa.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.lrj.a.a c(ajdp ajdp) {
            this.g = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lrj.a.a d(ajdp ajdp) {
            this.h = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lsf(a aVar) {
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
        this.n = aVar.a;
        this.o = aVar.i;
        this.p = aVar.e;
        this.q = aVar.g;
        this.r = aVar.b;
        this.s = aVar.d;
        this.t = aVar.f;
        this.u = aVar.h;
        this.v = aVar.k;
        this.w = aVar.m;
        this.x = aVar.j;
        this.y = aVar.c;
        this.z = aVar.l;
    }

    /* synthetic */ lsf(a aVar, byte b) {
        this(aVar);
    }

    private mhi<? extends mha> A() {
        Object obj = this.l;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.l;
                if (obj2 instanceof aiqe) {
                    obj2 = lru.a(this, this.y, this.t, this.r);
                    this.l = aiqb.a(this.l, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> B() {
        Object obj = this.m;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.m;
                if (obj2 instanceof aiqe) {
                    obj2 = lrr.a(this, this.t, this.y, this.r);
                    this.m = aiqb.a(this.m, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    public static a.a g() {
        return new a();
    }

    private boolean r() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = Boolean.valueOf(b.a((miw) aiqf.a(this.n.l(), "Cannot return null from a non-@Nullable component method")));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    private lsw s() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lrt.a((miw) aiqf.a(this.n.l(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (lsw) obj;
    }

    private boolean t() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = Boolean.valueOf(b.b((miw) aiqf.a(this.n.l(), "Cannot return null from a non-@Nullable component method")));
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    private boolean u() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = Boolean.valueOf(b.a((miw) aiqf.a(this.n.l(), "Cannot return null from a non-@Nullable component method"), this.p.booleanValue()));
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    private ajdp<Boolean> v() {
        Object obj = this.h;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof aiqe) {
                    obj2 = lrv.a((miw) aiqf.a(this.n.l(), "Cannot return null from a non-@Nullable component method"));
                    this.h = aiqb.a(this.h, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    private ajdu<lsd.b, lsd.b> w() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = lro.a(r(), this.s.booleanValue(), t(), u(), v(), (mwe) aiqf.a(this.n.i(), "Cannot return null from a non-@Nullable component method"), (ajdp) aiqf.a(this.n.k(), "Cannot return null from a non-@Nullable component method"), this.t, this.u, (kqf) aiqf.a(this.n.m(), "Cannot return null from a non-@Nullable component method"), this.v);
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private mhi<? extends mha> x() {
        Object obj = this.i;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.i;
                if (obj2 instanceof aiqe) {
                    obj2 = lrs.a(this, this.y, this.r, this.z);
                    this.i = aiqb.a(this.i, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> y() {
        Object obj = this.j;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.j;
                if (obj2 instanceof aiqe) {
                    obj2 = lrq.a(this, this.y, this.r, this.t, (myv) aiqf.a(this.n.p(), "Cannot return null from a non-@Nullable component method"));
                    this.j = aiqb.a(this.j, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> z() {
        Object obj = this.k;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.k;
                if (obj2 instanceof aiqe) {
                    obj2 = lrp.a(this, this.y, this.t, this.r);
                    this.k = aiqb.a(this.k, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    public final lsa c() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lrn.a(r(), this.p.booleanValue(), (mwe) aiqf.a(this.n.i(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.n.g(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.n.h(), "Cannot return null from a non-@Nullable component method"), (ajdp) aiqf.a(this.n.k(), "Cannot return null from a non-@Nullable component method"), (ajdp) aiqf.a(this.n.j(), "Cannot return null from a non-@Nullable component method"), (kqf) aiqf.a(this.n.m(), "Cannot return null from a non-@Nullable component method"), this.q, s());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lsa) obj;
    }

    public final lrz d() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lrm.a(this.r, c(), w(), (ide) aiqf.a(this.n.g(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.n.h(), "Cannot return null from a non-@Nullable component method"), (kqf) aiqf.a(this.n.m(), "Cannot return null from a non-@Nullable component method"), this.p.booleanValue(), this.w);
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (lrz) obj;
    }

    public final ajdp<lsd> e() {
        return this.r;
    }

    public final Set<mhi<? extends mha>> f() {
        return ImmutableSet.of(lrl.a(c(), this.x), x(), y(), z(), A(), B(), new mhi[0]);
    }

    public final ide h() {
        return (ide) aiqf.a(this.n.g(), "Cannot return null from a non-@Nullable component method");
    }

    public final zgb i() {
        return (zgb) aiqf.a(this.n.h(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajdp<lqf> j() {
        return (ajdp) aiqf.a(this.n.k(), "Cannot return null from a non-@Nullable component method");
    }

    public final akbl<Context, jn> k() {
        return (akbl) aiqf.a(this.n.o(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajdp<mmt> l() {
        return (ajdp) aiqf.a(this.n.j(), "Cannot return null from a non-@Nullable component method");
    }

    public final miw m() {
        return (miw) aiqf.a(this.n.l(), "Cannot return null from a non-@Nullable component method");
    }

    public final kqf n() {
        return (kqf) aiqf.a(this.n.m(), "Cannot return null from a non-@Nullable component method");
    }

    public final mwe o() {
        return (mwe) aiqf.a(this.n.i(), "Cannot return null from a non-@Nullable component method");
    }

    public final lxh p() {
        return (lxh) aiqf.a(this.n.n(), "Cannot return null from a non-@Nullable component method");
    }

    public final lth q() {
        return this.o;
    }
}
