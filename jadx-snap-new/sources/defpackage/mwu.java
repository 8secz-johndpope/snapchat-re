package defpackage;

import defpackage.mww.a;
import defpackage.mww.d;

/* renamed from: mwu */
public final class mwu extends mww {
    private volatile Object a;
    private d b;

    /* renamed from: mwu$a */
    static final class a implements defpackage.mww.a {
        d a;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object a() {
            if (this.a != null) {
                return new mwu(this, (byte) 0);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        public final /* bridge */ /* synthetic */ defpackage.mww.a a(d dVar) {
            this.a = (d) aiqf.a(dVar);
            return this;
        }
    }

    private mwu(a aVar) {
        this.a = new aiqe();
        this.b = aVar.a;
    }

    /* synthetic */ mwu(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    public final mwz d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mwx.a((ajdp) aiqf.a(this.b.y(), "Cannot return null from a non-@Nullable component method"), (mwe) aiqf.a(this.b.J(), "Cannot return null from a non-@Nullable component method"), (mwy) aiqf.a(this.b.G(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mwz) obj;
    }
}
