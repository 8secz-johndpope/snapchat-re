package defpackage;

import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.brightcove.player.event.Event;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.gem.a;
import java.util.Set;

@ftr(a = "chat_media/*/*/thumb")
/* renamed from: pvo */
public final class pvo extends ggm {
    final ajwy<pvr> a;
    final ajwy<pqr> b;
    final ajwy<pvq> c;
    final ajwy<ofa> d;
    final pqu e;
    final ajwy<odu> f;
    private final ajxe g = ajxh.a(a.a);
    private final ajxe h = ajxh.a(f.a);
    private final ajwy<gee> i;

    /* renamed from: pvo$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ pvo a;
        final /* synthetic */ ajei b;
        private /* synthetic */ Integer c;
        private /* synthetic */ Integer d;

        b(pvo pvo, Integer num, Integer num2, ajei ajei) {
            this.a = pvo;
            this.c = num;
            this.d = num2;
            this.b = ajei;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final abyi abyi = (abyi) obj;
            String str = "mediaPackage";
            akcr.b(abyi, str);
            ofa ofa = (ofa) this.a.d.get();
            idd a = ((idd) this.a.g.b());
            Integer num = this.c;
            Integer num2 = this.d;
            akcr.b(abyi, str);
            return ofa.a(a, abyi, 1, ogc.a(abyi, num, num2), this.b).e().b((ajev) new ajev(this) {
                private /* synthetic */ b a;

                public final void run() {
                    Object e = ((odu) this.a.a.f.get()).d(((idd) this.a.a.g.b()), ajyl.a(abyi)).e();
                    akcr.a(e, "mediaPackageManager.get(…             .subscribe()");
                    std.a(e, this.a.b);
                }
            });
        }
    }

    /* renamed from: pvo$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ Uri a;

        c(Uri uri) {
            this.a = uri;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: pvo$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            jwu jwu = (jwu) obj;
            akcr.b(jwu, "it");
            return jwu.a;
        }
    }

    /* renamed from: pvo$e */
    static final class e implements ajev {
        private /* synthetic */ ajei a;

        e(ajei ajei) {
            this.a = ajei;
        }

        public final void run() {
            this.a.dispose();
        }
    }

    /* renamed from: pvo$g */
    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ pvo a;
        final /* synthetic */ Uri b;
        final /* synthetic */ String c;
        final /* synthetic */ Integer d;
        final /* synthetic */ Integer e;
        private /* synthetic */ Set f;
        private /* synthetic */ boolean g;
        private /* synthetic */ Set h;

        g(pvo pvo, Uri uri, Set set, boolean z, Set set2, String str, Integer num, Integer num2) {
            this.a = pvo;
            this.b = uri;
            this.f = set;
            this.g = z;
            this.h = set2;
            this.c = str;
            this.d = num;
            this.e = num2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final pqo pqo = (pqo) obj;
            akcr.b(pqo, "info");
            return ((pqr) this.a.b.get()).a(pqo, ((pvr) this.a.a.get()).a(this.b), false, this.f, this.g, this.h, this.a.e).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ g a;

                public final /* synthetic */ Object apply(Object obj) {
                    Object obj2 = (gej) obj;
                    akcr.b(obj2, "it");
                    pvo pvo = this.a.a;
                    Uri uri = this.a.b;
                    Object obj3 = this.a.c;
                    String str = "mediaId";
                    akcr.a(obj3, str);
                    gcp gcp = pqo.b;
                    Integer num = this.a.d;
                    Integer num2 = this.a.e;
                    String str2 = MessageMediaRefModel.URI;
                    akcr.b(uri, str2);
                    akcr.b(obj3, str);
                    String str3 = "snapType";
                    akcr.b(gcp, str3);
                    String str4 = "contentResult";
                    akcr.b(obj2, str4);
                    if (gcp.a()) {
                        akcr.b(uri, str2);
                        akcr.b(obj3, str);
                        akcr.b(gcp, str3);
                        akcr.b(obj2, str4);
                        ajei ajei = new ajei();
                        pvq pvq = (pvq) pvo.c.get();
                        akcr.b(obj2, str4);
                        akcr.b(obj3, str);
                        akcr.b(gcp, str3);
                        ajdx b = pvq.a(obj2, obj3, gcp, null, null, null, new ajei()).a((ajfc) new b(pvo, num, num2, ajei)).d((ajfb) new c(uri)).f(d.a).b((ajev) new e(ajei));
                        akcr.a((Object) b, "chatMediaPackager.get().…spose()\n                }");
                        CompressFormat compressFormat = pvp.a;
                        String str5 = "media";
                        akcr.b(b, "bitmapProvider");
                        akcr.b(compressFormat, "compressionFormat");
                        akcr.b(str5, "assetName");
                        obj = gem.a(b, compressFormat).f(new a(str5));
                        str = "inputStreamFromBitmapPro…l.absent())\n            }";
                    } else {
                        obj = ajdx.b(obj2);
                        str = "Single.just(contentResult)";
                    }
                    akcr.a(obj, str);
                    return obj;
                }
            });
        }
    }

    /* renamed from: pvo$a */
    static final class a extends akcs implements akbk<idd> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return pql.j.callsite("ChatMediaFirstFrameUriHandler");
        }
    }

    /* renamed from: pvo$f */
    static final class f extends akcs implements akbk<gfl> {
        public static final f a = new f();

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return gii.a("media");
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(pvo.class), "callsite", "getCallsite()Lcom/snap/framework/attribution/AttributedCallsite;"), new akdc(akde.a(pvo.class), "namedPayloadProcessor", "getNamedPayloadProcessor()Lcom/snap/core/net/content/api/PayloadProcessor;")};
    }

    public pvo(ajwy<pvr> ajwy, ajwy<pqr> ajwy2, ajwy<pvq> ajwy3, ajwy<ofa> ajwy4, pqu pqu, ajwy<odu> ajwy5, ajwy<gee> ajwy6) {
        akcr.b(ajwy, "chatMediaUriHandler");
        akcr.b(ajwy2, "chatMediaUriHandlerHelper");
        akcr.b(ajwy3, "chatMediaPackager");
        akcr.b(ajwy4, "thumbnailGenerator");
        akcr.b(pqu, "chatSnapContentType");
        akcr.b(ajwy5, "mediaPackageManager");
        akcr.b(ajwy6, "contentManager");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
        this.e = pqu;
        this.f = ajwy5;
        this.i = ajwy6;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Uri uri2 = uri;
        akcr.b(uri2, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object obj = (String) uri.getPathSegments().get(1);
        Object obj2 = (String) uri.getPathSegments().get(2);
        String queryParameter = uri2.getQueryParameter(Event.INDEX);
        Integer d = queryParameter != null ? akga.d(queryParameter) : null;
        akcr.a(obj, "messageId");
        akcr.a(obj2, "mediaId");
        Uri a = pqq.a(obj, obj2, d);
        String queryParameter2 = uri2.getQueryParameter("width");
        Integer valueOf = queryParameter2 != null ? Integer.valueOf(Integer.parseInt(queryParameter2)) : null;
        queryParameter2 = uri2.getQueryParameter("height");
        obj = ((pvr) this.a.get()).c(a).a((ajfc) new g(this, a, set, z, set2, obj2, valueOf, queryParameter2 != null ? Integer.valueOf(Integer.parseInt(queryParameter2)) : null));
        akcr.a(obj, "chatMediaUriHandler.get(…      }\n                }");
        gee gee = (gee) this.i.get();
        Object uri3 = uri.toString();
        akcr.a(uri3, "uri.toString()");
        obj = gee.a(new gew(uri3, null, gem.c(obj), (gfl) this.h.b(), this.e, set, set2, 260)).a(z);
        akcr.a(obj, "contentManager.get().sub…tResult(closeOnTerminate)");
        return obj;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2, ajdx<gej> ajdx) {
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        Set<rzg> set3 = set;
        akcr.b(set, "schedulingContexts");
        Set<? extends gdy> set4 = set2;
        akcr.b(set4, "cacheAccessControls");
        akcr.b(ajdx, "contentResultFrom");
        gee gee = (gee) this.i.get();
        String uri3 = uri.toString();
        akcr.a((Object) uri3, "uri.toString()");
        String str = uri3;
        sak sak = null;
        Object a = gee.a(new gew(str, sak, gem.a((ajdx) ajdx), null, this.e, set3, set4, 278)).a(z);
        akcr.a(a, "contentManager.get().sub…tResult(closeOnTerminate)");
        return a;
    }
}
