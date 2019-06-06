package defpackage;

import defpackage.mto.a;
import defpackage.mto.d;

/* renamed from: mtm */
public final class mtm extends mto {
    private volatile Object a;
    private d b;
    private mtr c;
    private mtv d;

    /* renamed from: mtm$a */
    static final class a implements defpackage.mto.a {
        d a;
        mtr b;
        mtv c;

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
                stringBuilder.append(mtr.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c != null) {
                return new mtm(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mtv.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private mtm(a aVar) {
        this.a = new aiqe();
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
    }

    /* synthetic */ mtm(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    public final mtq d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mtp.a((ajdp) aiqf.a(this.b.y(), "Cannot return null from a non-@Nullable component method"), this.c, this.d);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mtq) obj;
    }
}
