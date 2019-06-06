package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StickerMessageModel;
import defpackage.ggh.b;
import defpackage.sbm.a;
import java.net.URLEncoder;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "custom_sticker")
/* renamed from: xsp */
public final class xsp extends ggm {
    public final xsm a;
    public final gee b;
    private final ajxe c;
    private final ajxe d;

    /* renamed from: xsp$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xsp$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final iha iha = (iha) obj;
            akcr.b(iha, "it");
            return ajdx.c((Callable) new Callable<T>(this) {
                private /* synthetic */ c a;

                public final /* synthetic */ Object call() {
                    return (xxt) iha.a(this.a.a, xxt.class);
                }
            });
        }
    }

    /* renamed from: xsp$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            xxt xxt = (xxt) obj;
            akcr.b(xxt, "it");
            return new ggh(xxt.d, xxt.e);
        }
    }

    /* renamed from: xsp$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ xsp a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ Set d;
        private /* synthetic */ Set e;
        private /* synthetic */ boolean f;

        e(xsp xsp, String str, String str2, Set set, Set set2, boolean z) {
            this.a = xsp;
            this.b = str;
            this.c = str2;
            this.d = set;
            this.e = set2;
            this.f = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ggh ggh = (ggh) obj;
            akcr.b(ggh, "it");
            gee gee = this.a.b;
            String valueOf = String.valueOf(this.b.hashCode());
            Object e = new a(this.c, sac.POST).b(new gma(new aedh())).e();
            akcr.a(e, "SimpleRequest.Builder<An…                 .build()");
            abmv abmv = ggh.a;
            return gee.a(new gew(valueOf, e, null, gii.b(null, abmv != null ? new b(abmv) : gij.a, 1), this.a.a, this.d, this.e, 268)).a(this.f);
        }
    }

    /* renamed from: xsp$b */
    static final class b extends akcs implements akbk<String> {
        private /* synthetic */ aipn a;

        b(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((Uri) this.a.get()).toString();
        }
    }

    /* renamed from: xsp$f */
    static final class f extends akcq implements akbk<ajdx<iha>> {
        f(aipn aipn) {
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
            return (ajdx) ((aipn) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xsp.class), "baseUrl", "getBaseUrl()Ljava/lang/String;"), new akdc(akde.a(xsp.class), "serialHelper", "getSerialHelper()Lio/reactivex/Single;")};
        a aVar = new a();
    }

    public xsp(xsm xsm, gee gee, aipn<ajdx<iha>> aipn, aipn<Uri> aipn2) {
        akcr.b(xsm, "customStickerContentType");
        akcr.b(gee, "contentManager");
        akcr.b(aipn, "serializationHelper");
        akcr.b(aipn2, "baseUri");
        this.a = xsm;
        this.b = gee;
        this.c = ajxh.a(new b(aipn2));
        this.d = ajxh.a(new f(aipn));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String queryParameter = uri.getQueryParameter(StickerMessageModel.STICKERID);
        if (queryParameter != null) {
            StringBuilder stringBuilder = new StringBuilder("{\"custom_sticker_id_list\":[\"");
            stringBuilder.append(queryParameter);
            stringBuilder.append("\"]}");
            String str = URLEncoder.encode(stringBuilder.toString(), "UTF-8").toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append((String) this.c.b());
            stringBuilder2.append("/stickers/get_custom_sticker_image?sticker_ids=");
            stringBuilder2.append(str);
            String stringBuilder3 = stringBuilder2.toString();
            String queryParameter2 = uri.getQueryParameter("custom_sticker_data");
            if (queryParameter2 != null) {
                Object a = ((ajdx) this.d.b()).a((ajfc) new c(queryParameter2)).f(d.a).a((ajfc) new e(this, queryParameter, stringBuilder3, set, set2, z));
                akcr.a(a, "serialHelper.flatMap {\n …oseOnTerminate)\n        }");
                return a;
            }
            throw new IllegalArgumentException("Custom sticker data can't be null");
        }
        throw new IllegalArgumentException("Custom sticker id is null");
    }
}
