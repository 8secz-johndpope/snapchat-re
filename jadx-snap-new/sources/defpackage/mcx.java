package defpackage;

import android.content.Context;
import defpackage.mde.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mcx */
public abstract class mcx implements mha {

    /* renamed from: mcx$d */
    public interface d {
        ide g();

        zgb h();

        mwe i();

        ajdp<mmt> j();

        ajdp<lqf> k();

        akbl<Context, jn> o();

        kpk z();
    }

    /* renamed from: mcx$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: mcx$a */
    public static abstract class a implements mhi<mcx> {
        public d f;

        public abstract a a(ajdp<Boolean> ajdp);

        public abstract a a(akbl<? super mux, Boolean> akbl);

        public abstract a a(d dVar);

        public abstract a b(ajdp<mde> ajdp);

        public abstract a c(ajdp<mih> ajdp);
    }

    /* renamed from: mcx$c */
    public static final class c {

        /* renamed from: mcx$c$a */
        public static final class a implements mwe {
            final /* synthetic */ akbl a;
            private /* synthetic */ mwe b;
            private /* synthetic */ mwe c;
            private /* synthetic */ ajdp d;
            private /* synthetic */ kpk e;

            /* renamed from: mcx$c$a$1 */
            public static final class 1<T, R> implements ajfc<T, R> {
                private /* synthetic */ a a;

                public 1(a aVar) {
                    this.a = aVar;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    List list = (List) obj;
                    akcr.b(list, "lenses");
                    if (list.isEmpty()) {
                        return list;
                    }
                    if (list.size() == 1) {
                        return (((Boolean) this.a.a.invoke((mux) ajyu.f(list))).booleanValue() ^ 1) != 0 ? list : ajyw.a;
                    } else {
                        Collection arrayList = new ArrayList();
                        for (Object next : list) {
                            if ((((Boolean) this.a.a.invoke((mux) next)).booleanValue() ^ 1) != 0) {
                                arrayList.add(next);
                            }
                        }
                        return (List) arrayList;
                    }
                }
            }

            public a(mwe mwe, akbl akbl, mwe mwe2, ajdp ajdp, kpk kpk) {
                this.b = mwe;
                this.a = akbl;
                this.c = mwe2;
                this.d = ajdp;
                this.e = kpk;
            }

            public final ajde<List<mux>> a(defpackage.mwe.a aVar) {
                akcr.b(aVar, "queryCriteria");
                Object d = this.b.a(aVar).d((ajfc) new 1(this));
                akcr.a(d, "lensRepository.query(que…dicate)\n                }");
                return d;
            }
        }

        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final ajdu<b, b> a(ajdp<lqf> ajdp, ajdp<mih> ajdp2, ajdp<Boolean> ajdp3, zfw zfw) {
            akcr.b(ajdp, "cameraLifecycle");
            akcr.b(ajdp2, "windowRect");
            akcr.b(ajdp3, "hideWhen");
            akcr.b(zfw, "qualifiedSchedulers");
            return mic.a(new mcu(ajdp, zfw), new mcw(zfw), new mcv(ajdp3), mic.a((ajdp) ajdp2));
        }

        public static final mdc a(ajdp<mde> ajdp, ajdu<b, b> ajdu, mdd mdd, zfw zfw) {
            akcr.b(ajdp, "viewProvider");
            akcr.b(ajdu, "viewModelTransformer");
            akcr.b(mdd, "slugUseCase");
            akcr.b(zfw, "qualifiedSchedulers");
            return new mcr(ajdp, ajdu, mdd, zfw);
        }

        public static final mdd a(ajdp<mmt> ajdp, mwe mwe, kpk kpk, akbl<? super mux, Boolean> akbl) {
            akcr.b(ajdp, "lensCore");
            akcr.b(mwe, "lensRepository");
            akcr.b(kpk, "adInfoLauncher");
            if (akbl != null) {
                try {
                    mwe = new a(mwe, akbl, mwe, ajdp, kpk);
                } catch (Throwable th) {
                }
            }
            return new mcs(ajdp, mwe, kpk);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("SponsoredSlug"));
        }
    }

    static {
        b bVar = new b();
    }

    public final ajej a() {
        Object l = b().l();
        akcr.a(l, "observe().subscribe()");
        return l;
    }

    public final ajdp<Object> b() {
        return d().b();
    }

    public abstract mdc d();
}
