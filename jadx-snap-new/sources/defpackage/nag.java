package defpackage;

import com.brightcove.player.media.CuePointFields;
import defpackage.mmi.c;
import defpackage.nak.a;

/* renamed from: nag */
public final class nag implements nak {
    final ajdp<Boolean> a;
    final ajdp<mmt> b;
    final naj c;
    private final ajxe d = ajxh.a(new b(this));

    /* renamed from: nag$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Long l = (Long) obj;
            akcr.b(l, CuePointFields.TIME);
            return Boolean.valueOf(l.longValue() > 0);
        }
    }

    /* renamed from: nag$b */
    static final class b extends akcs implements akbk<ajdp<a>> {
        final /* synthetic */ nag a;

        /* renamed from: nag$b$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            public static final b a = new b();

            /* renamed from: nag$b$b$a */
            public static final class a<T> implements ajfl<Object> {
                public static final a a = new a();

                public final boolean test(Object obj) {
                    akcr.b(obj, "it");
                    return obj instanceof defpackage.mmi.c.a.a;
                }
            }

            b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                mmt mmt = (mmt) obj;
                akcr.b(mmt, "it");
                obj = mmt.a().b().a((ajfl) a.a).a(c.a.a.class);
                akcr.a(obj, "this.filter { it is R }.cast(R::class.java)");
                return obj;
            }
        }

        /* renamed from: nag$b$c */
        static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            c(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b((defpackage.mmi.c.a.a) obj, "it");
                return this.a.a.c.b().a((ajdt) ajvo.a(ajot.a));
            }
        }

        /* renamed from: nag$b$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            private /* synthetic */ b a;

            /* renamed from: nag$b$a$1 */
            static final class 1<T, R> implements ajfc<T, R> {
                public static final 1 a = new 1();

                1() {
                }

                public final /* synthetic */ Object apply(Object obj) {
                    Boolean bool = (Boolean) obj;
                    akcr.b(bool, "isActive");
                    return new defpackage.nak.a.a(bool.booleanValue());
                }
            }

            a(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "isEnabled");
                return bool.booleanValue() ? this.a.a.c.a().i().p(1.a) : nah.a;
            }
        }

        b(nag nag) {
            this.a = nag;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ajdp u = this.a.b.u(b.a).u(new c(this));
            Object u2 = this.a.a.u(new a(this));
            akcr.a(u2, "isEnabled\n              …      }\n                }");
            return ajpy.k(ajdp.b((ajdt) u2, (ajdt) u)).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(nag.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public nag(ajdp<mmt> ajdp, naj naj, ajdp<Long> ajdp2) {
        akcr.b(ajdp, "lensCore");
        akcr.b(naj, "lensUsageRepository");
        akcr.b(ajdp2, "lastUsageTimestamp");
        this.b = ajdp;
        this.c = naj;
        Object p = ajdp2.p(a.a);
        akcr.a(p, "lastUsageTimestamp\n     ….map { time -> time > 0 }");
        this.a = p;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp<a> b() {
        return (ajdp) this.d.b();
    }
}
