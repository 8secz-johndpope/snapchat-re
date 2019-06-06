package defpackage;

import defpackage.mge.a;
import defpackage.mge.d;

/* renamed from: mfv */
public final class mfv extends mge {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private ajdp<mgk> d;
    private d e;

    /* renamed from: mfv$a */
    static final class a extends defpackage.mge.a {
        d a;
        ajdp<mgk> b;

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
            } else if (this.b != null) {
                return new mfv(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private mfv(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = aVar.b;
        this.e = aVar.a;
    }

    /* synthetic */ mfv(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private mgj e() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mgh.a((ajdp) aiqf.a(this.e.j(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mgj) obj;
    }

    private zfw f() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = mgg.a((zgb) aiqf.a(this.e.h(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.e.g(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final mgi d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mgf.a(this.d, e(), f());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mgi) obj;
    }
}
