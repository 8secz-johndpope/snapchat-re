package defpackage;

import android.text.TextUtils;
import com.brightcove.player.event.EventType;
import java.util.Map;

/* renamed from: iaz */
public final class iaz implements ajfb<ahra> {
    private final ajxe a;
    private final ajxe b;
    private final ajxe c;
    private final ajxe d;

    /* renamed from: iaz$b */
    static final class b extends akcq implements akbk<hyq> {
        b(ajwy ajwy) {
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
            return (hyq) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: iaz$d */
    static final class d extends akcq implements akbk<abxu> {
        d(ajwy ajwy) {
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
            return (abxu) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: iaz$a */
    static final class a extends akcq implements akbk<hyk> {
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
            return (hyk) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: iaz$c */
    static final class c extends akcq implements akbk<hys> {
        c(ajwy ajwy) {
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
            return (hys) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(iaz.class), "fideliusManager", "getFideliusManager()Lcom/snap/fidelius/api/FideliusManager;"), new akdc(akde.a(iaz.class), "userIdProvider", "getUserIdProvider()Lcom/snapchat/android/framework/user/UserIdProvider;"), new akdc(akde.a(iaz.class), "eventLogger", "getEventLogger()Lcom/snap/fidelius/api/FideliusEventLogger;"), new akdc(akde.a(iaz.class), "metricFactory", "getMetricFactory()Lcom/snap/fidelius/api/FideliusMetricFactory;")};
    }

    public iaz(ajwy<hyq> ajwy, ajwy<abxu> ajwy2, ajwy<hyk> ajwy3, ajwy<hys> ajwy4) {
        akcr.b(ajwy, "fideliusManagerSupplier");
        akcr.b(ajwy2, "userIdProviderSupplier");
        akcr.b(ajwy3, "eventLoggerProvider");
        akcr.b(ajwy4, "metricFactoryProvider");
        this.a = ajxh.a(new b(ajwy));
        this.b = ajxh.a(new d(ajwy2));
        this.c = ajxh.a(new a(ajwy3));
        this.d = ajxh.a(new c(ajwy4));
    }

    public final /* synthetic */ void accept(Object obj) {
        ahra ahra = (ahra) obj;
        akcr.b(ahra, EventType.RESPONSE);
        Map map = ahra.a;
        if (!(map == null || map.isEmpty())) {
            hyu h = ((hyq) this.a.b()).h("fid_updates_retry");
            String a = ((abxu) this.b.b()).a();
            if (h == null || TextUtils.isEmpty(a)) {
                ((hyk) this.c.b()).a(((hys) this.d.b()).a(hyt.FIDELIUS_FATAL_ERROR).a("reason", "fid_updates_no_retry_service"));
            } else {
                h.a(map, "fid_updates", a);
            }
        }
    }
}
