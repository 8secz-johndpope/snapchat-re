package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: zih */
public final class zih extends ablj {
    final icv a;
    final ifb b;
    final ihh c;
    final ajwy<ida> d;
    final Set<je<String, String>> e;
    private final achb<zjm, zjk> f;
    private final ajwy<ablk> g;
    private final achk<zjm, zjk> h;
    private final ajdx<iha> i;
    private final zfw j = zgb.a(icw.a.callsite("SwipeNavLogger"));
    private final ajen k = new ajen();

    /* renamed from: zih$a */
    class a implements achk<zjm, zjk> {
        private int a;
        private long b;

        private a() {
            this.a = -1;
            this.b = -1;
        }

        /* synthetic */ a(zih zih, byte b) {
            this();
        }

        public final void a(achi<zjm, zjk> achi) {
            if (achi.l && achi.g == achj.DRAGGING) {
                zih.this.a.a();
                this.b = zih.this.c.c();
            }
        }

        public final void b(achi<zjm, zjk> achi) {
            achi<zjm, zjk> achi2 = achi;
            if (this.b != -1) {
                String b = ((zjm) achi2.e.e()).b();
                String b2 = ((zjm) achi2.f.e()).b();
                je a = je.a(b, b2);
                int contains = zih.this.e.contains(a) ^ 1;
                long c = zih.this.c.c() - this.b;
                double a2 = zih.this.a.a.a();
                int i = zih.this.a.a.d;
                zih.this.c.a();
                zih.this.a.b();
                this.a = -1;
                this.b = -1;
                if (contains != 0) {
                    zih.this.e.add(a);
                }
                ((ida) zih.this.d.get()).a(zih.this.b.j(), c, a2, (long) i, b, b2, contains, false);
            }
        }

        public final void c(achi<zjm, zjk> achi) {
            this.a = -1;
            this.b = -1;
            zih.this.a.b();
        }
    }

    public zih(achb<zjm, zjk> achb, icv icv, ifb ifb, ajdx<iha> ajdx, ihh ihh, ajwy<ida> ajwy, ajwy<ablk> ajwy2) {
        this.f = achb;
        this.a = icv;
        this.b = ifb;
        this.c = ihh;
        this.e = new HashSet();
        this.h = new a(this, (byte) 0);
        this.i = ajdx;
        this.d = ajwy;
        this.g = ajwy2;
    }

    private /* synthetic */ void a(Boolean bool) {
        if (bool.booleanValue()) {
            this.f.a(this.h);
        }
    }

    public final void e() {
        this.k.a(((ablk) this.g.get()).b(new abgc()).a(ajee.a(ajef.a)).e(new -$$Lambda$zih$q21cbE_6skYFstBda9gG_0u_Lxc(this)));
    }

    public final void f() {
        this.k.a(null);
        this.f.b(this.h);
    }
}
