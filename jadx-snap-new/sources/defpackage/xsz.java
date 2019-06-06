package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StickerMessageModel;
import defpackage.sbm.a;
import java.util.Set;

@ftr(a = "sticker/snapsticker")
/* renamed from: xsz */
public final class xsz extends ggm {
    static final String c = c;
    private static final String e = e;
    final xsy a;
    final gee b;
    private final ajwy<ftl> d;

    /* renamed from: xsz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: xsz$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            StringBuilder stringBuilder;
            String str = (String) obj;
            akcr.b(str, "url");
            if (akgb.c(str, "/")) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append('/');
            }
            stringBuilder.append(xsz.c);
            return stringBuilder.toString();
        }
    }

    /* renamed from: xsz$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ xsz a;
        final /* synthetic */ String b;
        final /* synthetic */ Set c;
        final /* synthetic */ boolean d;
        final /* synthetic */ Set e;
        private /* synthetic */ String f;

        c(xsz xsz, String str, String str2, Set set, boolean z, Set set2) {
            this.a = xsz;
            this.f = str;
            this.b = str2;
            this.c = set;
            this.d = z;
            this.e = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            akcr.b(str, "url");
            xsz xsz = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.f);
            stringBuilder.append('/');
            stringBuilder.append(this.b);
            String stringBuilder2 = stringBuilder.toString();
            Set set = this.c;
            Object a = xsz.b.a(new gew(stringBuilder2, null, null, null, xsz.a, set, ajzs.a(gdy.READ_CACHE_ONLY), 284)).a(this.d);
            akcr.a(a, "contentManager.submit(\n …tResult(closeOnTerminate)");
            return a.a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ c a;

                public final /* synthetic */ Object apply(Object obj) {
                    String str;
                    obj = (gej) obj;
                    akcr.b(obj, "it");
                    if (obj.a()) {
                        obj = ajdx.b(obj);
                        str = "Single.just(it)";
                    } else {
                        xsz xsz = this.a.a;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(this.a.b);
                        String stringBuilder2 = stringBuilder.toString();
                        Set set = this.a.c;
                        Set set2 = this.a.e;
                        obj = xsz.b.a(new gew(stringBuilder2, new a(stringBuilder2, sac.GET).e(), null, gii.a(null, null, 3), xsz.a, set, set2, 268)).a(this.a.d);
                        str = "contentManager.submit(De…tResult(closeOnTerminate)";
                    }
                    akcr.a(obj, str);
                    return obj;
                }
            });
        }
    }

    static {
        a aVar = new a();
    }

    public xsz(xsy xsy, gee gee, ajwy<ftl> ajwy) {
        akcr.b(xsy, "snapStickerContentType");
        akcr.b(gee, "contentManager");
        akcr.b(ajwy, "configurationProvider");
        this.a = xsy;
        this.b = gee;
        this.d = ajwy;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        String str;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String queryParameter = uri.getQueryParameter(StickerMessageModel.PACKID);
        String queryParameter2 = uri.getQueryParameter(StickerMessageModel.STICKERID);
        CharSequence charSequence = queryParameter;
        Object obj = null;
        Object obj2 = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj2 == null) {
            charSequence = queryParameter2;
            if (charSequence == null || charSequence.length() == 0) {
                obj = 1;
            }
            if (obj == null) {
                obj2 = ((ftl) this.d.get()).u(xsj.STICKER_CDN_BASE_URL).p(b.a).d(e);
                akcr.a(obj2, "configurationProvider.ge…     }.first(DEFAULT_URL)");
                obj2 = obj2.a((ajfc) new c(this, queryParameter, queryParameter2, set, z, set2));
                str = "getStickerCdnUrl().flatM…          }\n            }";
                akcr.a(obj2, str);
                return obj2;
            }
        }
        StringBuilder stringBuilder = new StringBuilder("missing pack or sticker ids : ");
        stringBuilder.append(queryParameter);
        stringBuilder.append(ppy.d);
        stringBuilder.append(queryParameter2);
        obj2 = ajdx.b((Throwable) new IllegalStateException(stringBuilder.toString()));
        str = "Single.error(IllegalStat… : $packId, $stickerId\"))";
        akcr.a(obj2, str);
        return obj2;
    }
}
