package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.mjo.a;
import defpackage.mjo.d;
import java.util.Set;

/* renamed from: mkb */
public final class mkb extends mjo {
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
    private d k;
    private mot l;
    private mof m;
    private Boolean n;
    private Boolean o;
    private mng p;
    private mns q;
    private lnr r;
    private Set<? extends akbl<? super mmt, ? extends mph>> s;
    private mio t;
    private mmh u;
    private Boolean v;
    private Boolean w;
    private mok<? super moc> x;
    private mxa y;

    /* renamed from: mkb$a */
    static final class a extends defpackage.mjo.a {
        d a;
        mof b;
        mxa c;
        Boolean d;
        Boolean e;
        mok<? super moc> f;
        mng g;
        mns h;
        Set<? extends akbl<? super mmt, ? extends mph>> i;
        lnr j;
        mio k;
        mmh l;
        Boolean m;
        Boolean n;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* bridge */ /* synthetic */ defpackage.mjo.a a() {
            this.m = (Boolean) aiqf.a(Boolean.TRUE);
            return this;
        }

        public final /* synthetic */ defpackage.mjo.a b() {
            this.n = (Boolean) aiqf.a(Boolean.TRUE);
            return this;
        }

        public final /* synthetic */ defpackage.mjo.a b(boolean z) {
            this.e = (Boolean) aiqf.a(Boolean.valueOf(z));
            return this;
        }

        public final mjo c() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(d.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mof.class.getCanonicalName());
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
                stringBuilder.append(mok.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mng.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Set.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.j == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lnr.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.k == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mio.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.l == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mmh.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.m == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.n != null) {
                return new mkb(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private mkb(a aVar) {
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
        this.k = aVar.a;
        this.l = null;
        this.m = aVar.b;
        this.n = aVar.d;
        this.o = aVar.e;
        this.p = aVar.g;
        this.q = aVar.h;
        this.r = aVar.j;
        this.s = aVar.i;
        this.t = aVar.k;
        this.u = aVar.l;
        this.v = aVar.m;
        this.w = aVar.n;
        this.x = aVar.f;
        this.y = aVar.c;
    }

    /* synthetic */ mkb(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private zfw d() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mju.a((zgb) aiqf.a(this.k.u(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.k.I(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private mka e() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = mjs.a(this.m, d());
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (mka) obj;
    }

    private mpc f() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = mjw.a((Context) aiqf.a(this.k.v(), "Cannot return null from a non-@Nullable component method"));
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (mpc) obj;
    }

    private mob g() {
        Object obj = this.i;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.i;
                if (obj2 instanceof aiqe) {
                    obj2 = mjq.a((miw) aiqf.a(this.k.K_(), "Cannot return null from a non-@Nullable component method"));
                    this.i = aiqb.a(this.i, obj2);
                }
            }
            obj = obj2;
        }
        return (mob) obj;
    }

    private mpd h() {
        Object obj = this.h;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof aiqe) {
                    obj2 = mjx.a(g(), d());
                    this.h = aiqb.a(this.h, obj2);
                }
            }
            obj = obj2;
        }
        return (mpd) obj;
    }

    private mxa i() {
        Object obj = this.j;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.j;
                if (obj2 instanceof aiqe) {
                    obj2 = mjv.a(this.y);
                    this.j = aiqb.a(this.j, obj2);
                }
            }
            obj = obj2;
        }
        return (mxa) obj;
    }

    private mpf j() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = mjy.a(this.x, f(), (miw) aiqf.a(this.k.K_(), "Cannot return null from a non-@Nullable component method"), h(), g(), i(), d());
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (mpf) obj;
    }

    public final mni a() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mjr.a(d());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mni) obj;
    }

    public final Supplier<mmf> b() {
        Object obj;
        Object obj2 = this.d;
        if (obj2 instanceof aiqe) {
            synchronized (obj2) {
                obj = this.d;
                if (obj instanceof aiqe) {
                    Context context = (Context) aiqf.a(this.k.v(), "Cannot return null from a non-@Nullable component method");
                    zfw d = d();
                    Supplier supplier = (Supplier) aiqf.a(this.k.w(), "Cannot return null from a non-@Nullable component method");
                    miw miw = (miw) aiqf.a(this.k.K_(), "Cannot return null from a non-@Nullable component method");
                    mka e = e();
                    mpf j = j();
                    boolean booleanValue = this.n.booleanValue();
                    boolean booleanValue2 = this.o.booleanValue();
                    mng mng = this.p;
                    mns mns = this.q;
                    lnr lnr = this.r;
                    Set set = this.s;
                    mio mio = this.t;
                    mio mio2 = mio;
                    mio mio3 = mio2;
                    obj = mjt.a(context, null, d, supplier, miw, e, j, booleanValue, booleanValue2, mng, mns, lnr, set, mio3, this.u, (Supplier) aiqf.a(this.k.x(), "Cannot return null from a non-@Nullable component method"), this.v.booleanValue(), this.w.booleanValue());
                    this.d = aiqb.a(this.d, obj);
                }
            }
        } else {
            obj = obj2;
        }
        return (Supplier) obj;
    }
}
