package defpackage;

import defpackage.myh.a;
import defpackage.myh.c;

/* renamed from: mym */
public final class mym extends myh {
    private volatile Object a;
    private volatile Object b;
    private c c;
    private mwe d;

    /* renamed from: mym$a */
    static final class a extends defpackage.myh.a {
        c a;
        mwe b;

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
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b != null) {
                return new mym(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mwe.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private mym(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = aVar.a;
        this.d = aVar.b;
    }

    /* synthetic */ mym(a aVar, byte b) {
        this(aVar);
    }

    public static a b() {
        return new a();
    }

    private mwe c() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = myj.a(this.d);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mwe) obj;
    }

    public final myl a() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = myk.a((ajdp) aiqf.a(this.c.g(), "Cannot return null from a non-@Nullable component method"), c());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (myl) obj;
    }
}
