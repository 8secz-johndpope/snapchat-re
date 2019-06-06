package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.vaa.a;
import java.util.Set;

@ftr(a = "profile_saved_media/*/*")
/* renamed from: vam */
public final class vam extends ggm {
    final ajwy<pqr> a;
    final pqu b;
    private final ajwy<vab> c;

    /* renamed from: vam$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: vam$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ vam a;
        private /* synthetic */ String b;
        private /* synthetic */ String c;
        private /* synthetic */ Integer d;
        private /* synthetic */ Set e;
        private /* synthetic */ boolean f;
        private /* synthetic */ Set g;

        b(vam vam, String str, String str2, Integer num, Set set, boolean z, Set set2) {
            this.a = vam;
            this.b = str;
            this.c = str2;
            this.d = num;
            this.e = set;
            this.f = z;
            this.g = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            a aVar = (a) obj;
            akcr.b(aVar, "it");
            pqr pqr = (pqr) this.a.a.get();
            Object obj2 = this.b;
            String str = "messageId";
            akcr.a(obj2, str);
            Object obj3 = this.c;
            String str2 = "mediaId";
            akcr.a(obj3, str2);
            Integer num = this.d;
            String str3 = aVar.c;
            byte[] bArr = aVar.d;
            if (bArr == null) {
                akcr.a();
            }
            prm a = pro.a(pul.a(str3, bArr), obj3, num);
            pqo pqo = new pqo(obj2, obj3, gcp.a.a(a.b), aVar.a, aVar.b, a.c, a.d, a.g);
            pqr pqr2 = (pqr) this.a.a.get();
            Object obj4 = this.b;
            akcr.a(obj4, str);
            Object obj5 = this.c;
            akcr.a(obj5, str2);
            return pqr.a(pqo, pqr2.a(obj4, obj5), false, this.e, this.f, this.g, this.a.b);
        }
    }

    /* renamed from: vam$c */
    static final class c<T, R> implements ajfc<Throwable, gej> {
        private /* synthetic */ Uri a;

        c(Uri uri) {
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

    public vam(ajwy<vab> ajwy, ajwy<pqr> ajwy2, pqu pqu) {
        akcr.b(ajwy, "messageRepository");
        akcr.b(ajwy2, "chatMediaUriHandlerHelper");
        akcr.b(pqu, "chatSnapContentType");
        this.c = ajwy;
        this.a = ajwy2;
        this.b = pqu;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object a = van.a(uri);
        String b = van.b(uri);
        Integer c = van.c(uri);
        vab vab = (vab) this.c.get();
        akcr.a(a, "messageId");
        Object g = vab.b(a).a((ajfc) new b(this, a, b, c, set, z, set2)).g(new c(uri));
        akcr.a(g, "messageRepository.get().…ror(it)\n                }");
        return g;
    }
}
