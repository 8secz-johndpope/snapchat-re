package defpackage;

import defpackage.nar.a;
import defpackage.nar.d;

/* renamed from: nae */
public final class nae extends nar {
    private volatile Object a;
    private volatile Object b;
    private nay c;
    private d d;

    /* renamed from: nae$a */
    static final class a implements defpackage.nar.a {
        d a;
        nay b;

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
                return new nae(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(nay.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private nae(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = aVar.b;
        this.d = aVar.a;
    }

    /* synthetic */ nae(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private nba e() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = nat.a(this.c);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (nba) obj;
    }

    public final nav d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = nas.a(e(), (ajdp) aiqf.a(this.d.y(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (nav) obj;
    }
}
