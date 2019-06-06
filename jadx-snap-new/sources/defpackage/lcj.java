package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import defpackage.ldu.a;
import defpackage.ldu.c;
import defpackage.miq.d;

/* renamed from: lcj */
public final class lcj extends ldu {
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
    private volatile Object n;
    private volatile Object o;
    private c p;
    private ide q;
    private lcq r;

    /* renamed from: lcj$a */
    static final class a implements defpackage.ldu.a {
        c a;
        ide b;
        lcq c;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final ldu a() {
            String str = " must be set";
            StringBuilder stringBuilder;
            if (this.a == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(c.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.b == null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(ide.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (this.c != null) {
                return new lcj(this, (byte) 0);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(lcq.class.getCanonicalName());
                stringBuilder.append(str);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    private lcj(a aVar) {
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
        this.n = new aiqe();
        this.o = new aiqe();
        this.p = aVar.a;
        this.q = aVar.b;
        this.r = aVar.c;
    }

    /* synthetic */ lcj(a aVar, byte b) {
        this(aVar);
    }

    public static a a() {
        return new a();
    }

    private akbl<d.a, Uri> f() {
        Object obj = this.b;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.b;
                if (obj2 instanceof aiqe) {
                    obj2 = lea.a();
                    this.b = aiqb.a(this.b, obj2);
                }
            }
            obj = obj2;
        }
        return (akbl) obj;
    }

    private zfw g() {
        Object obj = this.d;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.d;
                if (obj2 instanceof aiqe) {
                    obj2 = leh.a((zgb) aiqf.a(this.p.a(), "Cannot return null from a non-@Nullable component method"), this.q);
                    this.d = aiqb.a(this.d, obj2);
                }
            }
            obj = obj2;
        }
        return (zfw) obj;
    }

    private akbl<moc, ajdw> h() {
        Object obj = this.e;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.e;
                if (obj2 instanceof aiqe) {
                    obj2 = lei.a(g());
                    this.e = aiqb.a(this.e, obj2);
                }
            }
            obj = obj2;
        }
        return (akbl) obj;
    }

    private lci i() {
        Object obj = this.g;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.g;
                if (obj2 instanceof aiqe) {
                    obj2 = leb.a();
                    this.g = aiqb.a(this.g, obj2);
                }
            }
            obj = obj2;
        }
        return (lci) obj;
    }

    private lci j() {
        Object obj = this.h;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.h;
                if (obj2 instanceof aiqe) {
                    obj2 = lec.a();
                    this.h = aiqb.a(this.h, obj2);
                }
            }
            obj = obj2;
        }
        return (lci) obj;
    }

    private lci k() {
        Object obj = this.i;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.i;
                if (obj2 instanceof aiqe) {
                    obj2 = ldz.a();
                    this.i = aiqb.a(this.i, obj2);
                }
            }
            obj = obj2;
        }
        return (lci) obj;
    }

    private lci l() {
        Object obj = this.j;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.j;
                if (obj2 instanceof aiqe) {
                    obj2 = lej.a();
                    this.j = aiqb.a(this.j, obj2);
                }
            }
            obj = obj2;
        }
        return (lci) obj;
    }

    private lci m() {
        Object obj = this.k;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.k;
                if (obj2 instanceof aiqe) {
                    obj2 = lee.a();
                    this.k = aiqb.a(this.k, obj2);
                }
            }
            obj = obj2;
        }
        return (lci) obj;
    }

    private lci n() {
        Object obj = this.l;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.l;
                if (obj2 instanceof aiqe) {
                    obj2 = lek.a(this.r);
                    this.l = aiqb.a(this.l, obj2);
                }
            }
            obj = obj2;
        }
        return (lci) obj;
    }

    private lci o() {
        Object obj = this.m;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.m;
                if (obj2 instanceof aiqe) {
                    obj2 = ldx.a();
                    this.m = aiqb.a(this.m, obj2);
                }
            }
            obj = obj2;
        }
        return (lci) obj;
    }

    private lci p() {
        Object obj = this.n;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.n;
                if (obj2 instanceof aiqe) {
                    obj2 = ldw.a();
                    this.n = aiqb.a(this.n, obj2);
                }
            }
            obj = obj2;
        }
        return (lci) obj;
    }

    public final mof b() {
        Object obj = this.a;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.a;
                if (obj2 instanceof aiqe) {
                    obj2 = leg.a((Supplier) aiqf.a(this.p.c(), "Cannot return null from a non-@Nullable component method"), (zgb) aiqf.a(this.p.a(), "Cannot return null from a non-@Nullable component method"), f(), this.q);
                    this.a = aiqb.a(this.a, obj2);
                }
            }
            obj = obj2;
        }
        return (mof) obj;
    }

    public final mok<moc> c() {
        Object obj = this.c;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.c;
                if (obj2 instanceof aiqe) {
                    obj2 = led.a(g(), this.q, d(), (Supplier) aiqf.a(this.p.c(), "Cannot return null from a non-@Nullable component method"), h(), (sah) aiqf.a(this.p.d(), "Cannot return null from a non-@Nullable component method"), e());
                    this.c = aiqb.a(this.c, obj2);
                }
            }
            obj = obj2;
        }
        return (mok) obj;
    }

    public final lci d() {
        Object obj = this.f;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.f;
                if (obj2 instanceof aiqe) {
                    obj2 = ldy.a(ImmutableMap.builderWithExpectedSize(8).put("lens_content", i()).put("lens_overlay_image", j()).put("lens_icon", k()).put("tracking_data", l()).put("lens_remote_assets", m()).put("user_generated_assets", n()).put("bitmoji_lens_metadata", o()).put("bitmoji_lens_avatar_asset", p()).build());
                    this.f = aiqb.a(this.f, obj2);
                }
            }
            obj = obj2;
        }
        return (lci) obj;
    }

    public final akbw<gfu, ide, leq> e() {
        Object obj = this.o;
        if (obj instanceof aiqe) {
            Object obj2;
            synchronized (obj) {
                obj2 = this.o;
                if (obj2 instanceof aiqe) {
                    obj2 = lef.a(this.p.b(), d(), (zgb) aiqf.a(this.p.a(), "Cannot return null from a non-@Nullable component method"));
                    this.o = aiqb.a(this.o, obj2);
                }
            }
            obj = obj2;
        }
        return (akbw) obj;
    }
}
