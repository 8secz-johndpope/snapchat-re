package defpackage;

import defpackage.nal.a;
import defpackage.nal.d;

/* renamed from: nad */
public final class nad extends nal {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private d f;
    private ajdp<mmt> g;

    /* renamed from: nad$a */
    static final class a implements defpackage.nal.a {
        d a;
        ajdp<mmt> b;
        private ide c;

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
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b != null) {
                return new nad(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private nad(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = aVar.a;
        this.g = aVar.b;
    }

    /* synthetic */ nad(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private ajdp<mmt> f() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = nao.a(e());
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    private mhk g() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = nam.a();
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (mhk) obj;
    }

    private naj h() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = nap.a(g(), (miw) aiqf.a(this.f.K_(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (naj) obj;
    }

    public final nak d() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = naq.a(f(), h(), (miw) aiqf.a(this.f.K_(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (nak) obj;
    }

    public final ajva<mmt> e() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = nan.a(this.g);
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (ajva) obj;
    }
}
