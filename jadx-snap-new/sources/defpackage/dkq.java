package defpackage;

import com.google.common.base.Optional;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import java.util.concurrent.Callable;

/* renamed from: dkq */
public final class dkq extends zgi {
    final aipn<djd> a;
    private final aipn<did> b;
    private final aipn<dje> c;
    private final aipn<ajdw> d;

    /* renamed from: dkq$a */
    static final class a extends akcq implements akbk<did> {
        a(aipn aipn) {
            super(0, aipn);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(aipn.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (did) ((aipn) this.receiver).get();
        }
    }

    /* renamed from: dkq$b */
    static final class b<T> implements ajfb<did> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ((did) obj).a();
        }
    }

    /* renamed from: dkq$c */
    static final class c<T> implements ajfb<Optional<zym>> {
        private /* synthetic */ dkq a;

        c(dkq dkq) {
            this.a = dkq;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Optional) obj;
            djd djd = (djd) this.a.a.get();
            String str = "newConfig";
            akcr.a(obj, str);
            akcr.b(obj, str);
            zym b = djd.a.b();
            Object b2 = b.b();
            if (obj.isPresent()) {
                b2 = ((zym) obj.get()).b();
            }
            if (b != null && !b.b().equals(b2)) {
                aaai aaai = new aaai();
                aaai.a(b.b());
                aaai.b(b2);
                djd.b.a((aajt) aaai);
            }
        }
    }

    public dkq(zgk<b> zgk, aipn<did> aipn, aipn<dje> aipn2, aipn<djd> aipn3, aipn<ajdw> aipn4) {
        akcr.b(zgk, "taskScoper");
        akcr.b(aipn, "blizzardInitializer");
        akcr.b(aipn2, "configProvider");
        akcr.b(aipn3, "configChangeReporter");
        akcr.b(aipn4, "scheduler");
        super(zgk);
        this.b = aipn;
        this.c = aipn2;
        this.a = aipn3;
        this.d = aipn4;
    }

    public final ajej b() {
        ajei ajei = new ajei();
        ajej e = ajdx.c((Callable) new dkr(new a(this.b))).b((ajdw) this.d.get()).e((ajfb) b.a);
        akcr.a((Object) e, "Single.fromCallable(bliz…r -> initializer.init() }");
        ajvv.a(e, ajei);
        e = ((dje) this.c.get()).d().b((ajdw) this.d.get()).f((ajfb) new c(this));
        akcr.a((Object) e, "configProvider.get().get…get().report(newConfig) }");
        ajvv.a(e, ajei);
        return ajei;
    }
}
