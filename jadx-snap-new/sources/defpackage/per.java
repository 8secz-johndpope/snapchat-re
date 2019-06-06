package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: per */
public final class per implements gvn {
    final ajxe a = ajxh.a(new a(this));
    final ajwy<achb<zjm, zjk>> b;
    final ajwy<zjw> c;
    private final ajxe d = ajxh.a(new c(this));
    private final List<String> e = ajyl.a("snapchat://notification/memories/.*");

    /* renamed from: per$c */
    static final class c extends akcs implements akbk<achb<zjm, zjk>> {
        private /* synthetic */ per a;

        c(per per) {
            this.a = per;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (achb) this.a.b.get();
        }
    }

    /* renamed from: per$a */
    static final class a extends akcs implements akbk<zjw> {
        private /* synthetic */ per a;

        a(per per) {
            this.a = per;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (zjw) this.a.c.get();
        }
    }

    /* renamed from: per$b */
    static final class b<V> implements Callable<Object> {
        private /* synthetic */ per a;

        b(per per) {
            this.a = per;
        }

        public final /* synthetic */ Object call() {
            zjw.a((zjw) this.a.a.b(), ojc.a, false, null, null, 12);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(per.class), "navHost", "getNavHost()Lcom/snapchat/deck/api/NavigationHost;"), new akdc(akde.a(per.class), "deepLinkNavigator", "getDeepLinkNavigator()Lcom/snap/ui/deeplink/DeepLinkNavigator;")};
    }

    public per(ajwy<achb<zjm, zjk>> ajwy, ajwy<zjw> ajwy2) {
        akcr.b(ajwy, "navigationHostLazy");
        akcr.b(ajwy2, "deepLinkNavigatorLazy");
        this.b = ajwy;
        this.c = ajwy2;
    }

    private final achb<zjm, zjk> b() {
        return (achb) this.d.b();
    }

    public final List<String> a() {
        return this.e;
    }

    public final ajcx c(Uri uri) {
        Object obj;
        String str;
        akcr.b(uri, MessageMediaRefModel.URI);
        if (b().c) {
            Iterable<Object> g = b().g();
            if (!((g instanceof Collection) && ((Collection) g).isEmpty())) {
                for (Object obj2 : g) {
                    akcr.a(obj2, "it");
                    if (akcr.a((zjm) obj2.e(), ojc.a)) {
                        obj = 1;
                        break;
                    }
                }
            }
            obj = null;
            if (obj != null) {
                obj = ajvo.a(ajhn.a);
                str = "Completable.complete()";
                akcr.a(obj, str);
                return obj;
            }
        }
        obj = ajcx.b((Callable) new b(this));
        str = "Completable.fromCallable…edPage = false)\n        }";
        akcr.a(obj, str);
        return obj;
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
