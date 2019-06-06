package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import defpackage.kwd.a;

/* renamed from: kvy */
public final class kvy extends kwd {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private Context d;
    private Supplier<sso> e;
    private jwa f;
    private jwe g;
    private zgb h;
    private ide i;
    private Supplier<hbe> j;
    private Supplier<gvp> k;
    private Supplier<gvl> l;
    private ajdp<kqr> m;

    /* renamed from: kvy$a */
    static final class a implements defpackage.kwd.a {
        ide a;
        Context b;
        Supplier<sso> c;
        jwa d;
        jwe e;
        Supplier<gvp> f;
        Supplier<gvl> g;
        zgb h;
        Supplier<hbe> i;
        ajdp<kqr> j;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final kwd a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Context.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Supplier.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(jwa.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(jwe.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Supplier.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Supplier.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(zgb.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Supplier.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.j != null) {
                return new kvy(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.kwd.a b(Supplier supplier) {
            this.g = (Supplier) aiqf.a(supplier);
            return this;
        }

        public final /* synthetic */ defpackage.kwd.a c(Supplier supplier) {
            this.f = (Supplier) aiqf.a(supplier);
            return this;
        }

        public final /* synthetic */ defpackage.kwd.a d(Supplier supplier) {
            this.c = (Supplier) aiqf.a(supplier);
            return this;
        }
    }

    private kvy(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = aVar.b;
        this.e = aVar.c;
        this.f = aVar.d;
        this.g = aVar.e;
        this.h = aVar.h;
        this.i = aVar.a;
        this.j = aVar.i;
        this.k = aVar.f;
        this.l = aVar.g;
        this.m = aVar.j;
    }

    /* synthetic */ kvy(a aVar, byte b) {
        this(aVar);
    }

    public static a a() {
        return new a();
    }

    private zfw c() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = kwh.a(this.h, this.i);
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private kvw d() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = kwg.a(this.d, this.e, this.f, this.g, c(), this.i, this.j);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (kvw) obj;
    }

    public final lxh b() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = kwf.a(this.d, d(), this.k, this.l, this.m);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lxh) obj;
    }
}
