package defpackage;

import defpackage.lwe.a;
import defpackage.lwe.c;

/* renamed from: lwl */
public final class lwl extends lwe {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private ajdp<lwk> d;
    private c e;

    /* renamed from: lwl$a */
    static final class a extends defpackage.lwe.a {
        c b;
        ajdp<lwk> c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c != null) {
                return new lwl(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private lwl(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = aVar.c;
        this.e = aVar.b;
    }

    /* synthetic */ lwl(a aVar, byte b) {
        this(aVar);
    }

    public static a d() {
        return new a();
    }

    private lwj e() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lwh.a((ajdp) aiqf.a(this.e.j(), "Cannot return null from a non-@Nullable component method"), (mwe) aiqf.a(this.e.i(), "Cannot return null from a non-@Nullable component method"), (miw) aiqf.a(this.e.l(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (lwj) obj;
    }

    private zfw f() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lwg.a((zgb) aiqf.a(this.e.h(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.e.g(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final lwi c() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lwf.a(this.d, e(), f());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lwi) obj;
    }
}
