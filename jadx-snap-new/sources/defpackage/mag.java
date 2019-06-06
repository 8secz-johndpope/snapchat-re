package defpackage;

import com.google.common.base.Supplier;
import defpackage.mal.a;
import defpackage.mal.c;

/* renamed from: mag */
public final class mag extends a {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private c e;
    private String f;

    /* renamed from: mag$a */
    static final class a implements defpackage.mal.a.a {
        c a;
        String b;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final defpackage.mal.a a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b != null) {
                return new mag(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(String.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private mag(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = aVar.a;
        this.f = aVar.b;
    }

    /* synthetic */ mag(a aVar, byte b) {
        this(aVar);
    }

    public static a.a c() {
        return new a();
    }

    private map g() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = new mak((ajdp) aiqf.a(this.e.j(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (map) obj;
    }

    private man h() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = new mah();
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (man) obj;
    }

    public final zfw d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mam.a((zgb) aiqf.a(this.e.h(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.e.g(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final mao e() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = new mai(g(), h(), (Supplier) aiqf.a(this.e.y(), "Cannot return null from a non-@Nullable component method"), this.f);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mao) obj;
    }

    public final miw f() {
        return (miw) aiqf.a(this.e.l(), "Cannot return null from a non-@Nullable component method");
    }
}
