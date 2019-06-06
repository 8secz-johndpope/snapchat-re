package defpackage;

import com.google.common.base.Optional;
import com.snap.ui.view.TakeSnapButton;
import defpackage.mph.a;
import defpackage.mph.b;
import defpackage.mph.b.b.d;
import defpackage.mph.b.c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: lhp */
public final class lhp implements mph {
    final ajws<a> a;
    final ajwy<iha> b;
    final ajwy<gvl> c;
    final zfw d;
    private final ajxe e;
    private final ajfb<a> f = new lhq(new b(this.a));
    private final ajxe g = ajxh.a(new c(this));

    /* renamed from: lhp$a */
    static final class a extends akcs implements akbk<addk> {
        private /* synthetic */ ajwy a;

        a(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (addk) this.a.get();
        }
    }

    /* renamed from: lhp$c */
    static final class c extends akcs implements akbk<ajdp<b>> {
        private /* synthetic */ lhp a;

        c(lhp lhp) {
            this.a = lhp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(this.a.a.u(new lhr(new akbl<a, ajdp<b>>(this.a) {
                public final String getName() {
                    return "processUri";
                }

                public final akej getOwner() {
                    return akde.a(lhp.class);
                }

                public final String getSignature() {
                    return "processUri(Lcom/snap/lenses/core/UriDataHandler$Request;)Lio/reactivex/Observable;";
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    a aVar = (a) obj;
                    akcr.b(aVar, "p1");
                    lhp lhp = (lhp) this.receiver;
                    obj = lhp.c().b().n(new k(lhp, aVar)).r(new l(lhp, aVar));
                    akcr.a(obj, "eggHunt.isGameEnabled()\n…sage}\")\n                }");
                    return obj;
                }
            }))).a().c(1);
        }
    }

    /* renamed from: lhp$b */
    static final class b extends akcq implements akbl<a, ajxw> {
        b(ajws ajws) {
            super(1, ajws);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajws.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "p1");
            ((ajws) this.receiver).a((Object) aVar);
            return ajxw.a;
        }
    }

    /* renamed from: lhp$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ lhp a;
        private /* synthetic */ a b;

        d(lhp lhp, a aVar) {
            this.a = lhp;
            this.b = aVar;
        }

        public final /* synthetic */ Object call() {
            return (addl) ((iha) this.a.b.get()).a((InputStream) new ByteArrayInputStream(this.b.c), addl.class);
        }
    }

    /* renamed from: lhp$i */
    static final class i<V> implements Callable<T> {
        private /* synthetic */ lhp a;

        i(lhp lhp) {
            this.a = lhp;
        }

        public final /* synthetic */ Object call() {
            return ((gvl) this.a.c.get()).a(new addg(abbd.LENS).b(), false);
        }
    }

    /* renamed from: lhp$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ a a;

        f(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "success");
            return bool.booleanValue() ? b.a.a(this.a) : new b.b.a(this.a, "Failed to acquire egg");
        }
    }

    /* renamed from: lhp$g */
    public static final class g<T1, T2, R> implements ajex<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            return new lho((List) t1, (addl) ((Optional) t2).orNull(), 4);
        }
    }

    /* renamed from: lhp$h */
    static final class h<T, R> implements ajfc<T, R> {
        private /* synthetic */ lhp a;
        private /* synthetic */ a b;

        h(lhp lhp, a aVar) {
            this.a = lhp;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (lho) obj;
            akcr.b(obj, "state");
            mhs.b bVar = this.b.a;
            String str = this.b.b;
            Object a = ((iha) this.a.b.get()).a(obj);
            akcr.a(a, "serializationHelperProvider.get().toJson(state)");
            return new c(bVar, str, "", a, this.b.e);
        }
    }

    /* renamed from: lhp$j */
    static final class j<T, R> implements ajfc<T, R> {
        private /* synthetic */ a a;

        j(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((gvm) obj, "it");
            return b.a.a(this.a);
        }
    }

    /* renamed from: lhp$k */
    static final class k<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ lhp a;
        private /* synthetic */ a b;

        k(lhp lhp, a aVar) {
            this.a = lhp;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            lhp lhp;
            a aVar;
            if (!bool.booleanValue()) {
                obj = ajdx.b(new b.b.b(this.b, "Game is not enabled"));
                str = "Single.just(UriDataHandl…, \"Game is not enabled\"))";
            } else if (akgb.c(this.b.b, "open_map")) {
                lhp = this.a;
                obj = ajdx.c((Callable) new i(lhp)).b((ajdw) lhp.d.l()).f(new j(this.b));
                str = "Single.fromCallable {\n  …e.emptySuccess(request) }";
            } else if (akgb.c(this.b.b, "game_state")) {
                lhp = this.a;
                aVar = this.b;
                ajdp a = ajdp.a((ajdt) lhp.c().d(), (ajdt) lhp.c().e(), (ajex) new g());
                if (a == null) {
                    akcr.a();
                }
                obj = a.c(1).a((ajdw) lhp.d.b()).p(new h(lhp, aVar)).e();
                str = "Observables.combineLates…         }.firstOrError()";
            } else if (akgb.c(this.b.b, "acquire_game_marker")) {
                lhp = this.a;
                aVar = this.b;
                obj = ajdx.c((Callable) new d(lhp, aVar)).b((ajdw) lhp.d.b()).a((ajfc) new lhr(new e(lhp.c()))).f(new f(aVar));
                str = "Single.fromCallable {\n  …      }\n                }";
            } else if (akgb.c(this.b.b, "open_leaderboard")) {
                obj = this.a.c().f().b((ajeb) ajdx.b((Object) b.a.a(this.b)));
                str = "eggHunt.openLeaderboard(…UriDataHandler.Response))";
            } else {
                obj = ajdx.b(new b.b.c(this.b, "Invalid uri"));
                str = "Single.just(UriDataHandl…(request, \"Invalid uri\"))";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: lhp$l */
    static final class l<T, R> implements ajfc<Throwable, b> {
        private /* synthetic */ lhp a;
        private /* synthetic */ a b;

        l(lhp lhp, a aVar) {
            this.a = lhp;
            this.b = aVar;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "error");
            a aVar = this.b;
            StringBuilder stringBuilder = new StringBuilder("Error processing the request ");
            stringBuilder.append(this.b.b);
            stringBuilder.append(": ");
            stringBuilder.append(th.getMessage());
            return new d(aVar, TakeSnapButton.LONG_PRESS_TIME, stringBuilder.toString());
        }
    }

    /* renamed from: lhp$e */
    static final class e extends akcq implements akbl<addl, ajdx<Boolean>> {
        e(addk addk) {
            super(1, addk);
        }

        public final String getName() {
            return "acquireEgg";
        }

        public final akej getOwner() {
            return akde.a(addk.class);
        }

        public final String getSignature() {
            return "acquireEgg(Lcom/snapchat/maps/api/egghunt/EggHuntEgg;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            addl addl = (addl) obj;
            akcr.b(addl, "p1");
            return ((addk) this.receiver).a(addl);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(lhp.class), "eggHunt", "getEggHunt()Lcom/snapchat/maps/api/egghunt/EggHunt;"), new akdc(akde.a(lhp.class), "outputs", "getOutputs()Lio/reactivex/Observable;")};
    }

    public lhp(ajwy<addk> ajwy, ajwy<iha> ajwy2, ajwy<gvl> ajwy3, zfw zfw) {
        akcr.b(ajwy, "eggHuntProvider");
        akcr.b(ajwy2, "serializationHelperProvider");
        akcr.b(ajwy3, "deepLinkDispatcherProvider");
        akcr.b(zfw, "qualifiedSchedulers");
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = zfw;
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Ur…Request>().toSerialized()");
        this.a = r;
        this.e = ajxh.a(new a(ajwy));
    }

    public final ajfb<a> a() {
        return this.f;
    }

    public final boolean a(a aVar) {
        akcr.b(aVar, "request");
        return akgb.b(aVar.b, "app://maps/game", false);
    }

    public final ajdp<b> b() {
        return (ajdp) this.g.b();
    }

    /* Access modifiers changed, original: final */
    public final addk c() {
        return (addk) this.e.b();
    }
}
