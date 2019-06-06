package defpackage;

import android.net.Uri;
import com.snap.core.db.record.DdmlDataModel;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

/* renamed from: yjd */
public abstract class yjd extends ggm {
    final String a;
    final gee b;
    final geo c;
    final yjn d;

    /* renamed from: yjd$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ yjd a;
        final /* synthetic */ Set b;
        final /* synthetic */ Set c;
        private /* synthetic */ Uri d;
        private /* synthetic */ boolean e;

        a(yjd yjd, Uri uri, Set set, Set set2, boolean z) {
            this.a = yjd;
            this.d = uri;
            this.b = set;
            this.c = set2;
            this.e = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final gfe gfe = (gfe) obj;
            akcr.b(gfe, DdmlDataModel.RECORD);
            Object a = yjd.a(gfe);
            for (yjj yjj : yjj.values()) {
                if (akcr.a(yjj.value, a)) {
                    break;
                }
            }
            yjj yjj2 = null;
            if (yjj2 == null) {
                yjj2 = yjj.UNKNOWN;
            }
            ggh ggh = new ggh(gfe.d, gfe.e);
            Uri uri = this.d;
            akcr.b(uri, MessageMediaRefModel.URI);
            String queryParameter = uri.getQueryParameter("re_encrypt");
            boolean z = true;
            if (!((queryParameter != null ? Boolean.parseBoolean(queryParameter) : true) && ggh.a())) {
                z = false;
            }
            gie a2 = gii.a(ggh.b(), z ? ggh.c() : gij.a);
            agbn agbn = new agbn();
            agbn.a = gfe.a;
            agbn.b = yje.a(gfe.b);
            final String uri2 = this.d.toString();
            akcr.a((Object) uri2, "uri.toString()");
            String str = "SimpleRequest.Builder<An…                 .build()";
            Set set;
            gfl gfl;
            Set set2;
            gew gew;
            if (yjj2 != yjj.UNKNOWN || gfe.c == null) {
                yjd yjd = this.a;
                set = this.b;
                gfl = a2;
                set2 = this.c;
                Object e = new defpackage.sbm.a(yjd.a, sac.POST).b(new gma(agbn)).e();
                akcr.a(e, str);
                gew = new gew(uri2, e, null, gfl, yjd.c, set, set2, 268);
            } else {
                yjd yjd2 = this.a;
                String str2 = gfe.c;
                if (str2 == null) {
                    akcr.a();
                }
                set = this.b;
                gfl = a2;
                set2 = this.c;
                Object d = new defpackage.sbm.a(str2, sac.GET).e();
                akcr.a(d, str);
                gew = new gew(uri2, (sak) d, null, gfl, yjd2.c, set, set2, 268);
            }
            ajdx a3 = this.a.b.a(r2).a(false).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ a a;

                public final /* synthetic */ Object apply(Object obj) {
                    Object obj2 = (gej) obj;
                    akcr.b(obj2, "storyResult");
                    yjd yjd = this.a.a;
                    String str = uri2;
                    boolean z = z;
                    Object obj3 = gfe;
                    akcr.a(obj3, DdmlDataModel.RECORD);
                    Set set = this.a.b;
                    Set set2 = this.a.c;
                    if (z || !obj2.a() || yjd.d == null) {
                        obj = ajdx.b(obj2);
                        akcr.a(obj, "Single.just(storyResult)");
                        return obj;
                    }
                    yjn yjn = yjd.d;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(yjd.c.a());
                    stringBuilder.append('_');
                    stringBuilder.append(str);
                    return yjn.a(stringBuilder.toString(), obj2, obj3.b.a(), set, set2);
                }
            });
            akcr.a((Object) a3, "contentManager.submit(co…                        }");
            return gem.a(a3, this.e);
        }
    }

    public /* synthetic */ yjd(gee gee, geo geo, Uri uri) {
        this(gee, geo, uri, null);
    }

    public yjd(gee gee, geo geo, Uri uri, yjn yjn) {
        akcr.b(gee, "contentManager");
        akcr.b(geo, "contentType");
        akcr.b(uri, "baseUrl");
        this.b = gee;
        this.c = geo;
        this.d = yjn;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(uri);
        stringBuilder.append("/bq/auth_story_blob");
        this.a = stringBuilder.toString();
    }

    static String a(gfe gfe) {
        try {
            return Uri.parse(gfe.c).getQueryParameter("t");
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract ajdx<gfe> a(Uri uri);

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object a = a(uri).a((ajfc) new a(this, uri, set, set2, z));
        akcr.a(a, "lookupMedia(uri)\n       …minate)\n                }");
        return a;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2, ajdx<gej> ajdx) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        akcr.b(ajdx, "contentResultFrom");
        Object uri2 = uri.toString();
        akcr.a(uri2, "uri.toString()");
        Object a = this.b.a(new gew(uri2, null, gem.c(ajdx), null, this.c, set, set2, 276)).a(z);
        akcr.a(a, "contentManager.submit(De…tResult(closeOnTerminate)");
        return a;
    }
}
