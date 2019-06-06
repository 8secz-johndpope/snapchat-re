package defpackage;

import defpackage.mzi.a;
import defpackage.mzi.c;
import defpackage.mzi.d;

/* renamed from: mzg */
public final class mzg extends mzi {
    private volatile Object a;
    private c b;
    private d c;
    private mzk d;

    /* renamed from: mzg$a */
    static final class a implements defpackage.mzi.a {
        c a;
        d b;
        mzk c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object a() {
            if (this.a == null) {
                this.a = new c();
            }
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(d.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c != null) {
                return new mzg(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mzk.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private mzg(a aVar) {
        this.a = new aiqe();
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
    }

    /* synthetic */ mzg(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    public final mzm d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mzj.a((ajdp) aiqf.a(this.c.y(), "Cannot return null from a non-@Nullable component method"), this.d);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mzm) obj;
    }
}
