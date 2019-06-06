package defpackage;

import defpackage.mza.a;
import defpackage.mza.d;

/* renamed from: myx */
public final class myx extends mza {
    private volatile Object a;
    private d b;
    private ajdp<myw> c;

    /* renamed from: myx$a */
    static final class a implements defpackage.mza.a {
        d a;
        ajdp<myw> b;

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
                return new myx(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private myx(a aVar) {
        this.a = new aiqe();
        this.b = aVar.a;
        this.c = aVar.b;
    }

    /* synthetic */ myx(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    public final mzc d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mzb.a((ajdp) aiqf.a(this.b.y(), "Cannot return null from a non-@Nullable component method"), this.c);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mzc) obj;
    }
}
