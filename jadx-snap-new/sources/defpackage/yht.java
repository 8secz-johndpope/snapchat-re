package defpackage;

import com.snap.core.db.column.PrivacyType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: yht */
public final class yht implements yig {
    volatile boolean a;
    private final ajxe b;
    private final zfw c;

    /* renamed from: yht$a */
    static final class a extends akcq implements akbk<ftl> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: yht$d */
    static final class d extends akcs implements akbl<Throwable, ajxw> {
        public static final d a = new d();

        d() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: yht$c */
    static final class c extends akcs implements akbl<Boolean, ajxw> {
        private /* synthetic */ yht a;

        c(yht yht) {
            this.a = yht;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (Boolean) obj;
            yht yht = this.a;
            akcr.a(obj, "it");
            yht.a = obj.booleanValue();
            return ajxw.a;
        }
    }

    /* renamed from: yht$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ yht a;

        b(yht yht) {
            this.a = yht;
        }

        public final /* synthetic */ Object apply(Object obj) {
            PrivacyType privacyType = (PrivacyType) obj;
            akcr.b(privacyType, "privacyType");
            if (privacyType != PrivacyType.CUSTOM) {
                return ajyw.a;
            }
            obj = this.a.a().o(yiz.MY_STORY_PRIVACY_CUSTOM_USER_BLACKLIST);
            akcr.a(obj, "configurationProvider.ge…CY_CUSTOM_USER_BLACKLIST)");
            Iterable<yiw> iterable = (Iterable) obj;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (yiw yiw : iterable) {
                arrayList.add(ajxs.a(yiw.a, yiw.b));
            }
            return (List) arrayList;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(yht.class), "configurationProvider", "getConfigurationProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;");
    }

    public yht(ajwy<ftl> ajwy, gpu gpu, zfw zfw) {
        akcr.b(ajwy, "_configurationProvider");
        akcr.b(gpu, "userSession");
        akcr.b(zfw, "schedulers");
        this.c = zfw;
        this.b = ajxh.a(new a(ajwy));
        ajdp b = a().p(yiz.ENABLE_PRIVATE_STORY_BUTTON_IN_SEND_TO).b((ajdw) this.c.b());
        akcr.a((Object) b, "configurationProvider\n  …schedulers.computation())");
        gpv.a(b, (akbl) new c(this), (akbl) d.a, gpu);
    }

    /* Access modifiers changed, original: final */
    public final ftl a() {
        return (ftl) this.b.b();
    }

    public final boolean b() {
        return this.a;
    }

    public final ajdp<Boolean> c() {
        Object p = a().p(yiz.GEO_STORIES_POSTABLE);
        akcr.a(p, "configurationProvider.ob…Key.GEO_STORIES_POSTABLE)");
        return p;
    }

    public final ajdp<Boolean> d() {
        Object p = a().p(yiz.FRIEND_AND_PRIVATE_STORIES_INTERWEAVE);
        akcr.a(p, "configurationProvider.observeBoolean(configKey)");
        return p;
    }

    public final ajdp<Long> e() {
        Object t = a().t(yiz.SENDTO_CUSTOM_STORIES_ABOVE_FOLD_RECENCY_HR);
        akcr.a(t, "configurationProvider.observeLong(configKey)");
        return t;
    }

    public final ajdp<Long> f() {
        Object t = a().t(yiz.SENDTO_CUSTOM_STORIES_ABOVE_FOLD_MAX_CNT);
        akcr.a(t, "configurationProvider.observeLong(configKey)");
        return t;
    }

    public final ajdx<List<ajxm<String, String>>> g() {
        Object f = a().m(yiz.MY_STORY_PRIVACY).b((ajdw) this.c.f()).f(new b(this));
        akcr.a(f, "configurationProvider.ge…      }\n                }");
        return f;
    }
}
