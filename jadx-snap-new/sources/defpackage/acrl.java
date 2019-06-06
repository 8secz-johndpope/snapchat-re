package defpackage;

import java.util.concurrent.Callable;

/* renamed from: acrl */
public final class acrl implements nbp {
    boolean a;

    /* renamed from: acrl$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: acrl$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ ftl a;

        b(ftl ftl) {
            this.a = ftl;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(this.a.a((fth) adew.MOCK_FRIEND_LOCATIONS));
        }
    }

    /* renamed from: acrl$c */
    static final class c<T> implements ajfb<Boolean> {
        private /* synthetic */ acrl a;

        c(acrl acrl) {
            this.a = acrl;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            acrl acrl = this.a;
            akcr.a(obj, "mockLocations");
            acrl.a = obj.booleanValue();
        }
    }

    static {
        a aVar = new a();
    }

    public acrl(ajei ajei, zgb zgb, ide ide, ftl ftl) {
        akcr.b(ajei, "compositeDisposable");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        akcr.b(ftl, "configurationProvider");
        zfw a = zgb.a(ide.callsite("MushroomFriendLocationTweakProvider"));
        ajei.a(ajdp.b((ajdt) ajdp.b((Callable) new b(ftl)), (ajdt) ftl.p(adew.MOCK_FRIEND_LOCATIONS)).b((ajdw) a.b()).a((ajdw) a.l()).d((ajfb) new c(this)).l());
    }
}
