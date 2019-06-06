package defpackage;

import defpackage.lon.a;
import defpackage.lon.c;
import defpackage.mhs.b;
import java.util.Set;

/* renamed from: los */
public final class los extends lon {
    private volatile Object a;
    private c b;
    private nay c;
    private ajdp<Set<b>> d;
    private lop e;

    /* renamed from: los$a */
    static final class a implements defpackage.lon.a {
        c a;
        nay b;
        ajdp<Set<b>> c;
        lop d;

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
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(nay.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d != null) {
                return new los(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lop.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private los(a aVar) {
        this.a = new aiqe();
        this.b = aVar.a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
    }

    /* synthetic */ los(a aVar, byte b) {
        this(aVar);
    }

    public static a d() {
        return new a();
    }

    public final lor c() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = loo.a((ajdp) aiqf.a(this.b.y(), "Cannot return null from a non-@Nullable component method"), this.c, this.d, this.e);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lor) obj;
    }
}
