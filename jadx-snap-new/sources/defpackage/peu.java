package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ghx.a;
import java.util.List;
import java.util.Set;

@ftr(a = "memories_grid")
/* renamed from: peu */
public final class peu extends ggm {
    final ovh a;
    final pfi b;
    private final owf c;

    /* renamed from: peu$a */
    static final class a<T, R> implements ajfc<T, R> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return (String) ajyu.f(list);
        }
    }

    /* renamed from: peu$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ peu a;
        private /* synthetic */ Uri b;
        private /* synthetic */ Set c;
        private /* synthetic */ boolean d;
        private /* synthetic */ Set e;

        b(peu peu, Uri uri, Set set, boolean z, Set set2) {
            this.a = peu;
            this.b = uri;
            this.c = set;
            this.d = z;
            this.e = set2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "firstSnapId");
            return this.a.b.a(this.b, this.a.a.a(str), this.c, this.d, this.e);
        }
    }

    public peu(owf owf, ovh ovh, pfi pfi) {
        akcr.b(owf, "entryRepository");
        akcr.b(ovh, "downloadRepository");
        akcr.b(pfi, "memoriesThumbnailUriHandler");
        this.c = owf;
        this.a = ovh;
        this.b = pfi;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Object b;
        String str;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String queryParameter = uri.getQueryParameter("ID");
        if (queryParameter == null) {
            b = ajdx.b(a.a((Throwable) new IllegalArgumentException("missing ID param"), null));
            str = "Single.just(FailedConten…ion(\"missing ID param\")))";
        } else {
            b = this.c.c(queryParameter).f(a.a).d((ajfc) new b(this, uri, set, z, set2)).a((ajeb) ajdx.b(a.a((Throwable) new IllegalStateException("Missing first Snap ID for ".concat(String.valueOf(uri))), null)));
            str = "entryRepository.getSnapI…uri\")))\n                )";
        }
        akcr.a(b, str);
        return b;
    }
}
