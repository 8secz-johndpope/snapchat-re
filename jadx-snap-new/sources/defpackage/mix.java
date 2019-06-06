package defpackage;

import com.snap.framework.developer.BuildConfigInfo;
import defpackage.miu.a;
import defpackage.miu.b;

/* renamed from: mix */
public final class mix extends a {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private BuildConfigInfo f;
    private miw g;

    /* renamed from: mix$a */
    static final class a implements defpackage.miu.a.a {
        miw a;
        BuildConfigInfo b;
        private b c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final defpackage.miu.a a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(b.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b != null) {
                return new mix(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(BuildConfigInfo.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private mix(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = aVar.b;
        this.g = aVar.a;
    }

    /* synthetic */ mix(a aVar, byte b) {
        this(aVar);
    }

    public final hww a() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = new mjb();
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (hww) obj;
    }

    public final wnh b() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = new mjd();
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (wnh) obj;
    }

    public final hxn c() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = new mjc();
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (hxn) obj;
    }

    public final miw d() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = miv.a(this.g);
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (miw) obj;
    }
}
