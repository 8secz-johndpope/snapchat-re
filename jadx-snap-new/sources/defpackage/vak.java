package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.vaa.a;
import java.util.Set;

@ftr(a = "profile_saved_media/*/*/thumbnail")
/* renamed from: vak */
public final class vak extends ggm {
    final gee a;
    final pqp b;
    private final ajwy<vab> c;

    /* renamed from: vak$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: vak$b */
    static final class b<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;
        private /* synthetic */ Integer b;

        b(String str, Integer num) {
            this.a = str;
            this.b = num;
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            String str = aVar.c;
            byte[] bArr = aVar.d;
            if (bArr == null) {
                akcr.a();
            }
            return pro.a(pul.a(str, bArr), this.a, this.b);
        }
    }

    /* renamed from: vak$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ vak a;
        private /* synthetic */ Uri b;
        private /* synthetic */ Set c;
        private /* synthetic */ Set d;
        private /* synthetic */ boolean e;

        c(vak vak, Uri uri, Set set, Set set2, boolean z) {
            this.a = vak;
            this.b = uri;
            this.c = set;
            this.d = set2;
            this.e = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            prm prm = (prm) obj;
            akcr.b(prm, "it");
            gee gee = this.a.a;
            vak vak = this.a;
            Uri uri = this.b;
            Set set = this.c;
            Set set2 = this.d;
            String str = prm.k;
            if (str == null) {
                akcr.a();
            }
            Object d = new sbm.a(str, sac.GET).e();
            akcr.a(d, "SimpleRequest.Builder<An…  HttpMethod.GET).build()");
            gie a = gii.a(new ggh(prm.c, prm.d).b(), null, 2);
            Object uri2 = uri.toString();
            akcr.a(uri2, "uri.toString()");
            return gee.a(new gew(uri2, (sak) d, null, a, vak.b, set, set2, 268)).a(this.e);
        }
    }

    /* renamed from: vak$d */
    static final class d<T, R> implements ajfc<Throwable, gej> {
        private /* synthetic */ Uri a;

        d(Uri uri) {
            this.a = uri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "it");
            return ghx.a.a(th, null);
        }
    }

    static {
        a aVar = new a();
    }

    public vak(ajwy<vab> ajwy, gee gee, pqp pqp) {
        akcr.b(ajwy, "messageRepository");
        akcr.b(gee, "contentManager");
        akcr.b(pqp, "chatMediaThumbnailContentType");
        this.c = ajwy;
        this.a = gee;
        this.b = pqp;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object a = van.a(uri);
        akcr.a(a, "parseMessageID(uri)");
        Object b = van.b(uri);
        akcr.a(b, "parseMediaID(uri)");
        a = ((vab) this.c.get()).b(a).f(new b(b, van.c(uri)));
        akcr.a(a, "messageRepository.get().…aIndex)\n                }");
        Object g = a.a((ajfc) new c(this, uri, set, set2, z)).g(new d(uri));
        akcr.a(g, "getSavedMedia(parseMessa…ror(it)\n                }");
        return g;
    }
}
