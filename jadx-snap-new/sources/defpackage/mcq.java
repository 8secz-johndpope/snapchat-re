package defpackage;

import defpackage.mcx.a;
import defpackage.mcx.d;
import defpackage.mde.b;

/* renamed from: mcq */
public final class mcq extends mcx {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private ajdp<mde> e;
    private d f;
    private ajdp<mih> g;
    private ajdp<Boolean> h;
    private akbl<? super mux, Boolean> i;

    /* renamed from: mcq$a */
    static final class a extends defpackage.mcx.a {
        d a;
        ajdp<mih> b;
        ajdp<mde> c;
        akbl<? super mux, Boolean> d;
        ajdp<Boolean> e;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(d.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(akbl.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e != null) {
                return new mcq(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.mcx.a b(ajdp ajdp) {
            this.c = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.mcx.a c(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private mcq(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.c;
        this.f = aVar.a;
        this.g = aVar.b;
        this.h = aVar.e;
        this.i = aVar.d;
    }

    /* synthetic */ mcq(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private zfw e() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = mcy.a((zgb) aiqf.a(this.f.h(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.f.g(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private ajdu<b, b> f() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mdb.a((ajdp) aiqf.a(this.f.k(), "Cannot return null from a non-@Nullable component method"), this.g, this.h, e());
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private mdd g() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = mda.a((ajdp) aiqf.a(this.f.j(), "Cannot return null from a non-@Nullable component method"), (mwe) aiqf.a(this.f.i(), "Cannot return null from a non-@Nullable component method"), (kpk) aiqf.a(this.f.z(), "Cannot return null from a non-@Nullable component method"), this.i);
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (mdd) obj;
    }

    public final mdc d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mcz.a(this.e, f(), g(), e());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mdc) obj;
    }
}
