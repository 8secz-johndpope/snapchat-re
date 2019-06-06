package defpackage;

import defpackage.dpb.b;
import java.util.concurrent.Callable;

/* renamed from: dup */
public final class dup {
    final odu a;

    /* renamed from: dup$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final odt odt = (odt) obj;
            akcr.b(odt, "mediaPackageBuilder");
            return ajdx.c((Callable) new Callable<T>() {
                public final /* bridge */ /* synthetic */ Object call() {
                    return odt;
                }
            }).b((ajev) new ajev() {
                public final void run() {
                    odt.close();
                }
            });
        }
    }

    /* renamed from: dup$b */
    static final class b implements ajev {
        private /* synthetic */ kaz a;

        b(kaz kaz) {
            this.a = kaz;
        }

        public final void run() {
            this.a.dispose();
        }
    }

    /* renamed from: dup$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ dpb a;

        c(dpb dpb) {
            this.a = dpb;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final odt odt = (odt) obj;
            akcr.b(odt, "mediaPackageBuilder");
            return ajdx.c((Callable) new Callable<T>(this) {
                private /* synthetic */ c a;

                public final /* synthetic */ Object call() {
                    odt.a().c().write(((b) this.a.a).a);
                    return odt;
                }
            }).b((ajev) new ajev() {
                public final void run() {
                    odt.close();
                }
            });
        }
    }

    public dup(odu odu) {
        akcr.b(odu, "mediaPackageManager");
        this.a = odu;
    }
}
