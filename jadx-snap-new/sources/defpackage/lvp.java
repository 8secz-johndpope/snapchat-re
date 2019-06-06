package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableSet;
import defpackage.lvq.a;
import defpackage.lvq.d;
import java.util.Set;

/* renamed from: lvp */
public final class lvp extends lvq {
    private volatile Object a;
    private volatile Object b;
    private d c;
    private ajdp<ViewGroup> d;
    private ajdp<Boolean> e;

    /* renamed from: lvp$a */
    static final class a extends defpackage.lvq.a {
        d a;
        ajdp<ViewGroup> b;
        ajdp<Boolean> c;

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
            } else if (this.c != null) {
                return new lvp(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.lvq.a b(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private lvp(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = aVar.a;
        this.d = aVar.b;
        this.e = aVar.c;
    }

    /* synthetic */ lvp(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private mhi<? extends mha> l() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lvr.a(this.d, this, this.e);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    public final ide d() {
        return (ide) aiqf.a(this.c.h(), "Cannot return null from a non-@Nullable component method");
    }

    public final zgb e() {
        return (zgb) aiqf.a(this.c.i(), "Cannot return null from a non-@Nullable component method");
    }

    public final akbl<Context, jn> f() {
        return (akbl) aiqf.a(this.c.k(), "Cannot return null from a non-@Nullable component method");
    }

    public final mwe g() {
        return (mwe) aiqf.a(this.c.o(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajdp<mmt> h() {
        return (ajdp) aiqf.a(this.c.l(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajdp<lqf> i() {
        return (ajdp) aiqf.a(this.c.j(), "Cannot return null from a non-@Nullable component method");
    }

    public final Set<mhi<? extends mha>> j() {
        return ImmutableSet.of(l());
    }

    public final miw k() {
        return (miw) aiqf.a(this.c.m(), "Cannot return null from a non-@Nullable component method");
    }
}
