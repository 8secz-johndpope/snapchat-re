package defpackage;

import android.location.Location;
import defpackage.mtr.b;
import defpackage.mtt.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mtn */
public final class mtn implements mtq {
    final ajdp<mmt> a;
    final mtr b;
    final mtv c;
    private final ajxe d = ajxh.a(new c(this));

    /* renamed from: mtn$c */
    static final class c extends akcs implements akbk<ajdp> {
        final /* synthetic */ mtn a;

        /* renamed from: mtn$c$a */
        static final class a<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ c a;

            a(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                Object b = mmt.i().b().b(defpackage.mmj.a.a.class);
                akcr.a(b, "ofType(R::class.java)");
                return b.u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ a a;

                    public final /* synthetic */ Object apply(Object obj) {
                        defpackage.mmj.a.a aVar = (defpackage.mmj.a.a) obj;
                        akcr.b(aVar, "it");
                        if (aVar instanceof defpackage.mmj.a.a.a) {
                            mtn mtn = this.a.a.a;
                            Object obj2 = mmt;
                            akcr.a(obj2, "lensCore");
                            defpackage.mmj.a.a.a aVar2 = (defpackage.mmj.a.a.a) aVar;
                            ajdp d = mtn.b.a(new b(aVar2.a, aVar2.b)).p(a.a).d(obj2.i().a());
                            akcr.a((Object) d, "locationRepository\n     ….geoDataProcessor.inputs)");
                            return myu.a(d);
                        } else if (aVar instanceof defpackage.mmj.a.a.b) {
                            return ajvo.a(ajot.a);
                        } else {
                            throw new ajxk();
                        }
                    }
                });
            }
        }

        /* renamed from: mtn$c$b */
        static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
            final /* synthetic */ c a;

            b(c cVar) {
                this.a = cVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                final mmt mmt = (mmt) obj;
                akcr.b(mmt, "lensCore");
                Object b = mmt.i().b().b(defpackage.mmj.a.b.class);
                akcr.a(b, "ofType(R::class.java)");
                return b.u(new ajfc<T, ajdt<? extends R>>(this) {
                    private /* synthetic */ b a;

                    public final /* synthetic */ Object apply(Object obj) {
                        akcr.b((defpackage.mmj.a.b) obj, "it");
                        mtn mtn = this.a.a.a;
                        Object obj2 = mmt;
                        akcr.a(obj2, "lensCore");
                        ajdp d = mtn.c.a().p(b.a).d(obj2.i().a());
                        akcr.a((Object) d, "weatherRepository\n      ….geoDataProcessor.inputs)");
                        return myu.a(d);
                    }
                });
            }
        }

        c(mtn mtn) {
            this.a = mtn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.b((ajdt) this.a.a.u(new a(this)), (ajdt) this.a.a.u(new b(this)));
        }
    }

    /* renamed from: mtn$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Location location = (Location) obj;
            akcr.b(location, "it");
            return new defpackage.mmj.b.a(location);
        }
    }

    /* renamed from: mtn$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            mtt mtt = (mtt) obj;
            akcr.b(mtt, "weather");
            String str = mtt.a;
            float f = mtt.b;
            float f2 = mtt.c;
            Iterable<a> iterable = mtt.d;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (a aVar : iterable) {
                arrayList.add(new defpackage.mmj.b.b.a(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e));
            }
            return new defpackage.mmj.b.b(str, f, f2, (List) arrayList);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mtn.class), "outputs", "getOutputs()Lio/reactivex/Observable;");
    }

    public mtn(ajdp<mmt> ajdp, mtr mtr, mtv mtv) {
        akcr.b(ajdp, "lensCore");
        akcr.b(mtr, "locationRepository");
        akcr.b(mtv, "weatherRepository");
        this.a = ajdp;
        this.b = mtr;
        this.c = mtv;
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp b() {
        return (ajdp) this.d.b();
    }
}
