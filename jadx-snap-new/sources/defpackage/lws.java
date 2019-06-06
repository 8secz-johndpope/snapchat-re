package defpackage;

import defpackage.lwq.a;
import defpackage.lwq.c;

/* renamed from: lws */
public final class lws extends lwq {
    private volatile Object a;
    private c b;
    private ajfb<lwo> c;

    /* renamed from: lws$a */
    static final class a implements defpackage.lwq.a {
        c a;
        ajfb<lwo> b;

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
                return new lws(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajfb.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private lws(a aVar) {
        this.a = new aiqe();
        this.b = aVar.a;
        this.c = aVar.b;
    }

    /* synthetic */ lws(a aVar, byte b) {
        this(aVar);
    }

    public static a d() {
        return new a();
    }

    public final lwt c() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lwp.a((ajdp) aiqf.a(this.b.y(), "Cannot return null from a non-@Nullable component method"), this.c);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lwt) obj;
    }
}
