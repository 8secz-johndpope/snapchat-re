package defpackage;

import defpackage.nbe.a;
import defpackage.nbe.d;

/* renamed from: nbb */
public final class nbb extends nbe {
    private volatile Object a;
    private d b;

    /* renamed from: nbb$a */
    static final class a implements defpackage.nbe.a {
        d a;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* synthetic */ Object a() {
            if (this.a != null) {
                return new nbb(this, (byte) 0);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d.class.getCanonicalName());
            stringBuilder.append(" must be set");
            throw new IllegalStateException(stringBuilder.toString());
        }

        public final /* bridge */ /* synthetic */ defpackage.nbe.a a(d dVar) {
            this.a = (d) aiqf.a(dVar);
            return this;
        }
    }

    private nbb(a aVar) {
        this.a = new aiqe();
        this.b = aVar.a;
    }

    /* synthetic */ nbb(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    public final nbg d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = nbf.a((ajdp) aiqf.a(this.b.y(), "Cannot return null from a non-@Nullable component method"), (nbd) aiqf.a(this.b.H(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (nbg) obj;
    }
}
