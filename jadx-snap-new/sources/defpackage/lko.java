package defpackage;

import com.snap.core.db.api.SnapDb;
import defpackage.lkp.a;
import defpackage.lkp.d;

/* renamed from: lko */
public final class lko extends lkp {
    private volatile Object a;
    private volatile Object b;
    private d c;
    private ide d;

    /* renamed from: lko$a */
    static final class a extends defpackage.lkp.a {
        d a;
        ide b;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final lkp a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(d.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b != null) {
                return new lko(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private lko(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = aVar.a;
        this.d = aVar.b;
    }

    /* synthetic */ lko(a aVar, byte b) {
        this(aVar);
    }

    public static a a() {
        return new a();
    }

    private zfw c() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lkq.a((zgb) aiqf.a(this.c.b(), "Cannot return null from a non-@Nullable component method"), this.d);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final mnr b() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lkr.a((SnapDb) aiqf.a(this.c.a(), "Cannot return null from a non-@Nullable component method"), c(), this.d);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mnr) obj;
    }
}
