package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableSet;
import defpackage.may.a;
import defpackage.may.d;
import defpackage.mbh.b;
import java.util.Set;

/* renamed from: mas */
public final class mas extends may {
    private volatile Object a;
    private volatile Object b;
    private volatile Object c;
    private volatile Object d;
    private volatile Object e;
    private volatile Object f;
    private d g;
    private ajdp<ViewGroup> h;
    private ajdp<mih> i;
    private ajdp<Boolean> j;
    private Boolean k;

    /* renamed from: mas$a */
    static final class a extends defpackage.may.a {
        d a;
        ajdp<ViewGroup> b;
        ajdp<mih> c;
        Boolean d;
        ajdp<Boolean> e;

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
            } else if (this.d == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(Boolean.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.e != null) {
                return new mas(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ajdp.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }

        public final /* synthetic */ defpackage.may.a b(ajdp ajdp) {
            this.c = (ajdp) aiqf.a(ajdp);
            return this;
        }

        public final /* synthetic */ defpackage.may.a c(ajdp ajdp) {
            this.b = (ajdp) aiqf.a(ajdp);
            return this;
        }
    }

    private mas(a aVar) {
        this.a = new aiqe();
        this.b = new aiqe();
        this.c = new aiqe();
        this.d = new aiqe();
        this.e = new aiqe();
        this.f = new aiqe();
        this.g = aVar.a;
        this.h = aVar.b;
        this.i = aVar.c;
        this.j = aVar.e;
        this.k = aVar.d;
    }

    /* synthetic */ mas(a aVar, byte b) {
        this(aVar);
    }

    public static a c() {
        return new a();
    }

    private ajdp<mbh> l() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = mbd.a(this.h, o(), (akbl) aiqf.a(this.g.o(), "Cannot return null from a non-@Nullable component method"));
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdp) obj;
    }

    private ajdu<b, b> m() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = mbe.a((ajdp) aiqf.a(this.g.k(), "Cannot return null from a non-@Nullable component method"), this.i, this.j);
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (ajdu) obj;
    }

    private mhi<? extends mha> n() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = maz.a(this, this.i, this.h, this.k.booleanValue());
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (mhi) obj;
    }

    private zfw o() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = mbb.a((zgb) aiqf.a(this.g.h(), "Cannot return null from a non-@Nullable component method"), (ide) aiqf.a(this.g.g(), "Cannot return null from a non-@Nullable component method"));
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    public final ide d() {
        return (ide) aiqf.a(this.g.g(), "Cannot return null from a non-@Nullable component method");
    }

    public final zgb e() {
        return (zgb) aiqf.a(this.g.h(), "Cannot return null from a non-@Nullable component method");
    }

    public final akbl<Context, jn> f() {
        return (akbl) aiqf.a(this.g.o(), "Cannot return null from a non-@Nullable component method");
    }

    public final miw g() {
        return (miw) aiqf.a(this.g.l(), "Cannot return null from a non-@Nullable component method");
    }

    public final ajdp<lqf> h() {
        return (ajdp) aiqf.a(this.g.k(), "Cannot return null from a non-@Nullable component method");
    }

    public final mbg i() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = mbc.a();
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mbg) obj;
    }

    public final mbf j() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = mba.a(l(), i(), m(), o(), (kqf) aiqf.a(this.g.m(), "Cannot return null from a non-@Nullable component method"));
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (mbf) obj;
    }

    public final Set<mhi<? extends mha>> k() {
        return ImmutableSet.of(n());
    }
}
