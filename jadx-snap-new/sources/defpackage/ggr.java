package defpackage;

import com.google.common.base.Optional;
import java.util.Collection;
import java.util.List;

/* renamed from: ggr */
public final class ggr implements ifj {
    final Optional<ajwy<rym>> a;
    private final ajxe b;

    /* renamed from: ggr$e */
    static final class e extends akcq implements akbl<iff<gdl>, ajcx> {
        e(ggr ggr) {
            super(1, ggr);
        }

        public final String getName() {
            return "onAppBackground";
        }

        public final akej getOwner() {
            return akde.a(ggr.class);
        }

        public final String getSignature() {
            return "onAppBackground(Lcom/snap/framework/network/event/NetEvent;)Lio/reactivex/Completable;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "p1");
            ggr ggr = (ggr) this.receiver;
            ajwy ajwy = (ajwy) ggr.a.orNull();
            if (ajwy != null) {
                rym rym = (rym) ajwy.get();
                if (rym != null) {
                    obj = ((gdl) iff.a).a == gdj.BACKGROUND ? ggr.a().a().d((ajfb) new d(rym)).a((ajfc) new c(ggr, iff), false) : ajvo.a(ajhn.a);
                    if (obj != null) {
                        return obj;
                    }
                }
            }
            obj = ajvo.a(ajhn.a);
            akcr.a(obj, "Completable.complete()");
            return obj;
        }
    }

    /* renamed from: ggr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ggr$b */
    static final class b extends akcs implements akbk<ger> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ger) this.a.get();
        }
    }

    /* renamed from: ggr$d */
    static final class d<T> implements ajfb<List<? extends String>> {
        private /* synthetic */ rym a;

        d(rym rym) {
            this.a = rym;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            akcr.a(obj, "it");
            if ((((Collection) obj).isEmpty() ^ 1) != 0) {
                rym rym = this.a;
                aaxt aaxt = new aaxt();
                aaxt.a(ajyu.a((Iterable) obj, (CharSequence) ppy.b, null, null, 0, null, null, 62));
                rym.log(aaxt);
            }
        }
    }

    /* renamed from: ggr$c */
    static final class c<T, R> implements ajfc<List<? extends String>, ajdb> {
        private /* synthetic */ ggr a;
        private /* synthetic */ iff b;

        c(ggr ggr, iff iff) {
            this.a = ggr;
            this.b = iff;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((List) obj, "it");
            return this.a.a().b();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ggr.class), "aggregator", "getAggregator()Lcom/snap/core/net/content/api/DataConsumptionAggregator;");
        a aVar = new a();
    }

    public ggr(Optional<ajwy<rym>> optional, ajwy<ger> ajwy) {
        akcr.b(optional, "eventLogger");
        akcr.b(ajwy, "dataConsumptionAggregator");
        this.a = optional;
        this.b = ajxh.a(new b(ajwy));
    }

    /* Access modifiers changed, original: final */
    public final ger a() {
        return (ger) this.b.b();
    }

    public final void a(ifg ifg) {
        akcr.b(ifg, "netEventBus");
        ifg.a(gdl.class, (akbl) new e(this));
    }
}
