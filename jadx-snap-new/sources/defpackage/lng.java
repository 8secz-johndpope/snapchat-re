package defpackage;

import com.google.common.base.Supplier;
import defpackage.lni.d;

/* renamed from: lng */
public final class lng extends lni {
    private volatile Object a;
    private d b;
    private ide c;

    /* renamed from: lng$a */
    public static final class a implements defpackage.lni.a {
        d a;
        ide b;

        private a() {
        }

        public /* synthetic */ a(byte b) {
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
                return new lng(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private lng(a aVar) {
        this.a = new aiqe();
        this.b = aVar.a;
        this.c = aVar.b;
    }

    /* synthetic */ lng(a aVar, byte b) {
        this(aVar);
    }

    public final nay a() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lnj.a((Supplier) aiqf.a(this.b.a(), "Cannot return null from a non-@Nullable component method"), (Supplier) aiqf.a(this.b.c(), "Cannot return null from a non-@Nullable component method"), this.c, (zgb) aiqf.a(this.b.b(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (nay) obj;
    }
}
