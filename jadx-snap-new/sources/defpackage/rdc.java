package defpackage;

import android.view.View;

/* renamed from: rdc */
public final class rdc extends ajed implements zma {
    private final ajxe a;

    /* renamed from: rdc$a */
    static final class a extends akcs implements akbk<ajdp<znh<zmy>>> {
        private /* synthetic */ ajdp a;

        /* renamed from: rdc$a$1 */
        static final class 1<T, R> implements ajfc<T, R> {
            public static final 1 a = new 1();

            1() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "loading");
                if (!bool.booleanValue()) {
                    return znk.a(new rdv());
                }
                return znk.a(ajym.b((Object[]) new zmy[]{new rea(), new rdv()}));
            }
        }

        a(ajdp ajdp) {
            this.a = ajdp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.p(1.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rdc.class), "models", "getModels()Lio/reactivex/Observable;");
    }

    public rdc(ajdp<Boolean> ajdp) {
        akcr.b(ajdp, "loadingObservable");
        this.a = ajxh.a(new a(ajdp));
    }

    public final void a(View view, zmy zmy) {
    }

    public final void b(View view, zmy zmy) {
        akcr.b(view, "itemView");
    }

    public final ajdp<znh<zmy>> c() {
        Object obj = (ajdp) this.a.b();
        akcr.a(obj, "models");
        return obj;
    }

    public final void onDispose() {
    }
}
