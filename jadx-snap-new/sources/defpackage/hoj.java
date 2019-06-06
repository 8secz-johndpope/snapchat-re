package defpackage;

import android.net.Uri;
import android.os.PatternMatcher;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Collection;
import java.util.Set;

/* renamed from: hoj */
public final class hoj implements hol {
    private final ajxe a = ajxh.a(b.a);
    private final Set<String> b = ajzt.a((Object[]) new String[]{"snapchat://discover", "snapchat://discover/"});

    /* renamed from: hoj$b */
    static final class b extends akcs implements akbk<a> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new a();
        }
    }

    /* renamed from: hoj$a */
    public static class a {
    }

    static {
        new aken[1][0] = new akdc(akde.a(hoj.class), "patternMatcher", "getPatternMatcher()Lcom/snap/discoverfeed/shared/deeplink/DiscoverFeedDefaultNavigableProvider$SimplePatternMatcher;");
    }

    public final int a() {
        return 1;
    }

    public final boolean a(Uri uri) {
        int i;
        akcr.b(uri, MessageMediaRefModel.URI);
        Iterable<String> iterable = this.b;
        if (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty())) {
            for (String str : iterable) {
                this.a.b();
                Object uri2 = uri.toString();
                akcr.a(uri2, "uri.toString()");
                String str2 = "null cannot be cast to non-null type java.lang.String";
                if (uri2 != null) {
                    uri2 = uri2.toLowerCase();
                    String str3 = "(this as java.lang.String).toLowerCase()";
                    akcr.a(uri2, str3);
                    if (str != null) {
                        Object toLowerCase = str.toLowerCase();
                        akcr.a(toLowerCase, str3);
                        akcr.b(uri2, "match");
                        akcr.b(toLowerCase, "pattern");
                        if (new PatternMatcher(toLowerCase, 2).match(uri2)) {
                            i = 1;
                            break;
                        }
                    }
                    throw new ajxt(str2);
                }
                throw new ajxt(str2);
            }
        }
        i = 0;
        return uri.getPathSegments().isEmpty() & i;
    }

    public final ajdx<acig<zjm, zjk>> b(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object b = ajdx.b(new acio(hbn.a));
        akcr.a(b, "Single.just(PopToPageTyp…DISCOVER_FEED_PAGE_TYPE))");
        return b;
    }
}
