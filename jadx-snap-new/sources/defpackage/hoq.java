package defpackage;

import android.net.Uri;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snap.discoverfeed.shared.deeplink.SnapDeepLinkHttpInterface;
import org.json.JSONObject;

/* renamed from: hoq */
public final class hoq {
    final ajxe a;
    final aipn<whj> b;
    final aipn<SnapDeepLinkHttpInterface> c;

    /* renamed from: hoq$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: hoq$e */
    static final class e extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        e(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(hbn.f, "SnapDeepLinkClient");
        }
    }

    /* renamed from: hoq$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hoq a;
        private /* synthetic */ String b;

        c(hoq hoq, String str) {
            this.a = hoq;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SnapDeepLinkHttpInterface snapDeepLinkHttpInterface = (SnapDeepLinkHttpInterface) obj;
            akcr.b(snapDeepLinkHttpInterface, "httpInterface");
            aedh aedh = new aedh();
            String str = this.b;
            Object a = ((whj) this.a.b.get()).a(aedh);
            akcr.a(a, "requestAuthorization.get…cAuthPayload(authPayload)");
            return snapDeepLinkHttpInterface.resolveDeepLink(str, a);
        }
    }

    /* renamed from: hoq$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akhw akhw = (akhw) obj;
            akcr.b(akhw, Tags.BODY);
            return Uri.parse(new JSONObject(akhw.g()).getString("deep_link"));
        }
    }

    /* renamed from: hoq$b */
    static final class b extends akcq implements akbk<SnapDeepLinkHttpInterface> {
        b(aipn aipn) {
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
            return (SnapDeepLinkHttpInterface) ((aipn) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(hoq.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
    }

    public hoq(zgb zgb, aipn<whj> aipn, aipn<SnapDeepLinkHttpInterface> aipn2) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "requestAuthorization");
        akcr.b(aipn2, "httpInterface");
        this.b = aipn;
        this.c = aipn2;
        this.a = ajxh.a(new e(zgb));
    }
}
