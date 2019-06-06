package defpackage;

import android.content.Context;
import com.google.common.base.Supplier;
import com.google.gson.Gson;
import defpackage.mvc.a;
import defpackage.mvc.d;
import java.io.File;
import java.util.Collection;
import java.util.Set;

/* renamed from: mug */
public final class mug extends mvc {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private volatile Object f;
    private volatile Object g;
    private volatile Object h;
    private volatile Object i;
    private volatile Object j;
    private volatile Object k;
    private volatile Object l;
    private volatile Object m;
    private d n;
    private Gson o;
    private Collection<? extends akca<? super Context, ? super zfw, ? super Gson, ? extends mwe>> p;
    private Boolean q;
    private mxa r;
    private mwp s;
    private mok<? super moc> t;
    private Boolean u;
    private mof v;

    /* renamed from: mug$a */
    static final class a extends defpackage.mvc.a {
        d a;
        Collection<? extends akca<? super Context, ? super zfw, ? super Gson, ? extends mwe>> b;
        mxa c;
        mok<? super moc> d;
        mof e;
        mwp f;
        Boolean g;
        Gson h;
        Boolean i;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final mvc a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(d.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Collection.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mok.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mof.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.f == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(mwp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.g == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.i != null) {
                return new mug(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.mvc.a b() {
            this.i = (Boolean) aiqf.a(Boolean.FALSE);
            return this;
        }
    }

    private mug(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = new aiqe();
        this.g = new aiqe();
        this.h = new aiqe();
        this.i = new aiqe();
        this.j = new aiqe();
        this.k = new aiqe();
        this.l = new aiqe();
        this.m = new aiqe();
        this.n = aVar.a;
        this.o = aVar.h;
        this.p = aVar.b;
        this.q = aVar.g;
        this.r = aVar.c;
        this.s = aVar.f;
        this.t = aVar.d;
        this.u = aVar.i;
        this.v = aVar.e;
    }

    /* synthetic */ mug(a aVar, byte b) {
        this(aVar);
    }

    public static a a() {
        return new a();
    }

    private Gson g() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = mve.a(this.o);
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (Gson) obj;
    }

    private Set<mwe> h() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mvo.a((Context) aiqf.a(this.n.c(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.n.a(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.n.b(), "Cannot return null from a non-@Nullable component method"), g(), this.p);
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (Set) obj;
    }

    private Supplier<File> i() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = mvf.a((Context) aiqf.a(this.n.c(), "Cannot return null from a non-@Nullable component method"));
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (Supplier) obj;
    }

    private mvr j() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = mvg.a(i());
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (mvr) obj;
    }

    private mxa k() {
        Object obj = this.h;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof aiqe) {
                    obj2 = mvq.a(this.r);
                    this.h = aiqb.a(this.h, obj2);
                }
            }
            obj = obj2;
        }
        return (mxa) obj;
    }

    private mwc l() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = mvn.a(j(), k(), (ide) aiqf.a(this.n.a(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.n.b(), "Cannot return null from a non-@Nullable component method"), (kqf) aiqf.a(this.n.d(), "Cannot return null from a non-@Nullable component method"), this.s);
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (mwc) obj;
    }

    private ajws<muo> m() {
        Object obj = this.j;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.j;
                if (obj2 instanceof aiqe) {
                    obj2 = mvl.a();
                    this.j = aiqb.a(this.j, obj2);
                }
            }
            obj = obj2;
        }
        return (ajws) obj;
    }

    private ajdp<muo> n() {
        Object obj = this.i;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.i;
                if (obj2 instanceof aiqe) {
                    obj2 = mvk.a(m());
                    this.i = aiqb.a(this.i, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    public final mwe b() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mvp.a(c(), h(), (ide) aiqf.a(this.n.a(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.n.b(), "Cannot return null from a non-@Nullable component method"), this.q.booleanValue());
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mwe) obj;
    }

    public final mvv c() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = mvi.a((ide) aiqf.a(this.n.a(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.n.b(), "Cannot return null from a non-@Nullable component method"), j(), l(), this.t, n(), this.u.booleanValue());
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (mvv) obj;
    }

    public final ajfb<muo> d() {
        Object obj = this.k;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.k;
                if (obj2 instanceof aiqe) {
                    obj2 = mvj.a(m());
                    this.k = aiqb.a(this.k, obj2);
                }
            }
            obj = obj2;
        }
        return (ajfb) obj;
    }

    public final mwa e() {
        Object obj = this.l;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.l;
                if (obj2 instanceof aiqe) {
                    obj2 = mvm.a(this.t, (ide) aiqf.a(this.n.a(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.n.b(), "Cannot return null from a non-@Nullable component method"));
                    this.l = aiqb.a(this.l, obj2);
                }
            }
            obj = obj2;
        }
        return (mwa) obj;
    }

    public final mvu f() {
        Object obj = this.m;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.m;
                if (obj2 instanceof aiqe) {
                    obj2 = mvh.a(this.v, (Supplier) aiqf.a(this.n.e(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.n.a(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.n.b(), "Cannot return null from a non-@Nullable component method"));
                    this.m = aiqb.a(this.m, obj2);
                }
            }
            obj = obj2;
        }
        return (mvu) obj;
    }
}
