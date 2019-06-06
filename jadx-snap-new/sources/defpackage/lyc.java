package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableSet;
import defpackage.lyl.a;
import defpackage.lyl.d;
import defpackage.lyx.b;
import java.util.Set;

/* renamed from: lyc */
public final class lyc extends lyl {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private volatile Object f;
    private volatile Object g;
    private d h;
    private ajdp<ViewGroup> i;
    private ajdp<mih> j;
    private ajdp<Boolean> k;

    /* renamed from: lyc$a */
    static final class a extends defpackage.lyl.a {
        d a;
        ajdp<Boolean> b;
        ajdp<ViewGroup> c;
        ajdp<mih> d;

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
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d != null) {
                return new lyc(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.lyl.a b(ajdp ajdp) {
            this.c = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.lyl.a c(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lyc(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = new aiqe();
        this.g = new aiqe();
        this.h = aVar.a;
        this.i = aVar.c;
        this.j = aVar.d;
        this.k = aVar.b;
    }

    /* synthetic */ lyc(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private zfw l() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = lyq.a((zgb) aiqf.a(this.h.h(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.h.g(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private ajdp<lyx> m() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lyn.a(this.i, l(), (akbl) aiqf.a(this.h.o(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    private ajdp<Boolean> n() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = lyo.a(j());
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    private ajdu<b, b> o() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = lyt.a(this.j, this.k, n(), (ajdp) aiqf.a(this.h.k(), "Cannot return null from a non-@Nullable component method"), l(), (miw) aiqf.a(this.h.l(), "Cannot return null from a non-@Nullable component method"));
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private mhi<? extends mha> p() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = lyr.a(this.i, this.j, this.k, this);
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    public final ide d() {
        return (ide) aiqf.a(this.h.g(), "Cannot return null from a non-@Nullable component method");
    }

    public final zgb e() {
        return (zgb) aiqf.a(this.h.h(), "Cannot return null from a non-@Nullable component method");
    }

    public final akbl<Context, jn> f() {
        return (akbl) aiqf.a(this.h.o(), "Cannot return null from a non-@Nullable component method");
    }

    public final miw g() {
        return (miw) aiqf.a(this.h.l(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajdp<lqf> h() {
        return (ajdp) aiqf.a(this.h.k(), "Cannot return null from a non-@Nullable component method");
    }

    public final lyv i() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = lyp.a(m(), j(), o(), l());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (lyv) obj;
    }

    public final lyw j() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = lys.a((mqt) aiqf.a(this.h.A(), "Cannot return null from a non-@Nullable component method"));
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (lyw) obj;
    }

    public final Set<mhi<? extends mha>> k() {
        return ImmutableSet.of(p());
    }
}
