package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.lfu.a;
import defpackage.lkw.c;
import java.util.Set;

/* renamed from: lku */
public final class lku extends lkw {
    private Supplier<iha> A;
    private Supplier<kpc> B;
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private volatile ajwy<lfu> f;
    private volatile Object g;
    private volatile Object h;
    private volatile Object i;
    private volatile Object j;
    private volatile Object k;
    private volatile Object l;
    private volatile Object m;
    private volatile Object n;
    private volatile ajwy<lbp> o;
    private volatile Object p;
    private volatile Object q;
    private a r;
    private Boolean s;
    private lnr t;
    private Set<akbl<mmt, mph>> u;
    private adim v;
    private ide w;
    private c x;
    private Context y;
    private lbp.a z;

    /* renamed from: lku$a */
    static final class a implements defpackage.lkw.a {
        c a;
        adim b;
        ide c;
        Boolean d;
        defpackage.lfu.a e;
        lnr f;
        Set<akbl<mmt, mph>> g;
        Context h;
        Supplier<iha> i;
        Supplier<kpc> j;
        private ajdp<tvz> k;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* bridge */ /* synthetic */ defpackage.lkw.a a() {
            this.d = (Boolean) aiqf.a(Boolean.TRUE);
            return this;
        }

        public final /* synthetic */ defpackage.lkw.a b(Supplier supplier) {
            this.i = (Supplier) aiqf.a(supplier);
            return this;
        }

        public final /* synthetic */ tvy b() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(adim.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.k == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lnr.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Set.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Context.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Supplier.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.j != null) {
                return new lku(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Supplier.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    /* renamed from: lku$b */
    final class b<T> implements ajwy<T> {
        private final int a;

        b(int i) {
            this.a = i;
        }

        public final T get() {
            int i = this.a;
            if (i == 0) {
                return lku.this.c();
            }
            if (i == 1) {
                return lku.this.d();
            }
            throw new AssertionError(i);
        }
    }

    private lku(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.g = new aiqe();
        this.h = new aiqe();
        this.i = new aiqe();
        this.j = new aiqe();
        this.k = new aiqe();
        this.l = new aiqe();
        this.m = new aiqe();
        this.n = new aiqe();
        this.p = new aiqe();
        this.q = new aiqe();
        this.r = aVar.e;
        this.s = aVar.d;
        this.t = aVar.f;
        this.u = aVar.g;
        this.v = aVar.b;
        this.w = aVar.c;
        this.x = aVar.a;
        this.y = aVar.h;
        this.z = null;
        this.A = aVar.i;
        this.B = aVar.j;
    }

    /* synthetic */ lku(a aVar, byte b) {
        this(aVar);
    }

    public static lkw.a b() {
        return new a();
    }

    private ajwy<lfu> h() {
        ajwy ajwy = this.f;
        if (ajwy == null) {
            ajwy = new b(0);
            this.f = ajwy;
        }
        return ajwy;
    }

    private mxa i() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = lli.a(h());
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (mxa) obj;
    }

    private mof j() {
        Object obj = this.h;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof aiqe) {
                    obj2 = llj.a(h());
                    this.h = aiqb.a(this.h, obj2);
                }
            }
            obj = obj2;
        }
        return (mof) obj;
    }

    private mok<moc> k() {
        Object obj = this.i;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.i;
                if (obj2 instanceof aiqe) {
                    obj2 = llk.a(h());
                    this.i = aiqb.a(this.i, obj2);
                }
            }
            obj = obj2;
        }
        return (mok) obj;
    }

    private mjo l() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lla.a(this, i(), j(), this.s.booleanValue(), k(), this.t, this.u);
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (mjo) obj;
    }

    private Supplier<mmf> m() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = llb.a(l());
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (Supplier) obj;
    }

    private lkf n() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = llf.a(m());
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (lkf) obj;
    }

    private mwe o() {
        Object obj = this.l;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.l;
                if (obj2 instanceof aiqe) {
                    obj2 = llg.a(h());
                    this.l = aiqb.a(this.l, obj2);
                }
            }
            obj = obj2;
        }
        return (mwe) obj;
    }

    private myh p() {
        Object obj = this.k;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.k;
                if (obj2 instanceof aiqe) {
                    obj2 = lky.a(o(), this);
                    this.k = aiqb.a(this.k, obj2);
                }
            }
            obj = obj2;
        }
        return (myh) obj;
    }

    public final ide I() {
        Object obj = this.m;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.m;
                if (obj2 instanceof aiqe) {
                    obj2 = llh.a(this.w, (ide) aiqf.a(this.x.b(), "Cannot return null from a non-@Nullable component method"));
                    this.m = aiqb.a(this.m, obj2);
                }
            }
            obj = obj2;
        }
        return (ide) obj;
    }

    public final miw K_() {
        Object obj = this.n;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.n;
                if (obj2 instanceof aiqe) {
                    ajwy ajwy = this.o;
                    if (ajwy == null) {
                        ajwy = new b(1);
                        this.o = ajwy;
                    }
                    obj2 = lkz.a(ajwy);
                    this.n = aiqb.a(this.n, obj2);
                }
            }
            obj = obj2;
        }
        return (miw) obj;
    }

    /* Access modifiers changed, original: final */
    public final lfu c() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = lkx.a.a(this.r, I());
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (lfu) obj;
    }

    /* Access modifiers changed, original: final */
    public final lbp d() {
        Object obj = this.p;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.p;
                if (obj2 instanceof aiqe) {
                    akcr.b(I(), "attributedFeature");
                    this.p = aiqb.a(this.p, null);
                    obj2 = null;
                }
            }
            obj = obj2;
        }
        return (lbp) obj;
    }

    public final toe e() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = llc.a(n(), this.v);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (toe) obj;
    }

    public final twa f() {
        Object obj = this.j;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.j;
                if (obj2 instanceof aiqe) {
                    obj2 = lld.a(p());
                    this.j = aiqb.a(this.j, obj2);
                }
            }
            obj = obj2;
        }
        return (twa) obj;
    }

    public final ajdp<mmt> g() {
        Object obj = this.q;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.q;
                if (obj2 instanceof aiqe) {
                    obj2 = lle.a(n());
                    this.q = aiqb.a(this.q, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    public final zgb u() {
        return (zgb) aiqf.a(this.x.a(), "Cannot return null from a non-@Nullable component method");
    }

    public final Context v() {
        return this.y;
    }

    public final Supplier<iha> w() {
        return this.A;
    }

    public final Supplier<kpc> x() {
        return this.B;
    }
}
