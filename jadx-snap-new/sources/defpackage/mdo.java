package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.common.collect.ImmutableSet;
import defpackage.mdu.a;
import defpackage.mdu.d;
import java.util.Set;

/* renamed from: mdo */
public final class mdo extends mdu {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private volatile Object f;
    private volatile Object g;
    private volatile Object h;
    private d i;
    private ajfb<lqo> j;
    private ajdp<ViewGroup> k;
    private Boolean l;
    private ajdp<ViewStub> m;
    private ajdp<View> n;
    private ajdp<ajxw> o;
    private ajdp<Boolean> p;
    private lpi q;
    private ajfb<lwo> r;
    private ajdp<View> s;

    /* renamed from: mdo$a */
    static final class a extends defpackage.mdu.a {
        d a;
        ajdp<ViewGroup> b;
        Boolean c;
        ajdp<View> d;
        ajdp<ViewStub> e;
        ajdp<View> f;
        ajdp<ajxw> g;
        ajdp<Boolean> h;
        lpi i;
        ajfb<lqo> j;
        ajfb<lwo> k;

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
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.h == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.i == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lpi.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.j == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajfb.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.k != null) {
                return new mdo(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajfb.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.mdu.a c(ajdp ajdp) {
            this.f = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.mdu.a d(ajdp ajdp) {
            this.e = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.mdu.a e(ajdp ajdp) {
            this.d = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.mdu.a f(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private mdo(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = new aiqe();
        this.g = new aiqe();
        this.h = new aiqe();
        this.i = aVar.a;
        this.j = aVar.j;
        this.k = aVar.b;
        this.l = aVar.c;
        this.m = aVar.e;
        this.n = aVar.d;
        this.o = aVar.g;
        this.p = aVar.h;
        this.q = aVar.i;
        this.r = aVar.k;
        this.s = aVar.f;
    }

    /* synthetic */ mdo(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private mhi<? extends mha> l() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = mdv.a((ajdp) aiqf.a(this.i.j(), "Cannot return null from a non-@Nullable component method"), this.j, i(), (zgb) aiqf.a(this.i.h(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.i.g(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> m() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = mdy.a(this, this.k);
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> n() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = mea.a(this, this.l.booleanValue(), this.m, this.n, this.o, this.p);
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> o() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = mdx.a(this, this.q);
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> p() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = mdw.a(this, this.r);
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private mhi<? extends mha> q() {
        Object obj = this.h;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof aiqe) {
                    obj2 = mdz.a(this, this.s, this.l.booleanValue());
                    this.h = aiqb.a(this.h, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    public final ajdp<mmt> d() {
        return (ajdp) aiqf.a(this.i.j(), "Cannot return null from a non-@Nullable component method");
    }

    public final ide e() {
        return (ide) aiqf.a(this.i.g(), "Cannot return null from a non-@Nullable component method");
    }

    public final zgb f() {
        return (zgb) aiqf.a(this.i.h(), "Cannot return null from a non-@Nullable component method");
    }

    public final akbl<Context, jn> g() {
        return (akbl) aiqf.a(this.i.o(), "Cannot return null from a non-@Nullable component method");
    }

    public final kqf h() {
        return (kqf) aiqf.a(this.i.m(), "Cannot return null from a non-@Nullable component method");
    }

    public final mec i() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = meb.a((ajdp) aiqf.a(this.i.j(), "Cannot return null from a non-@Nullable component method"), (ajdp) aiqf.a(this.i.k(), "Cannot return null from a non-@Nullable component method"));
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mec) obj;
    }

    public final miw j() {
        return (miw) aiqf.a(this.i.l(), "Cannot return null from a non-@Nullable component method");
    }

    public final Set<mhi<? extends mha>> k() {
        return ImmutableSet.of(l(), m(), n(), o(), p(), q(), new mhi[0]);
    }
}
