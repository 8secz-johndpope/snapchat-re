package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ffq.a;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: fhv */
public final class fhv implements gvn {
    final ajwy<eyo> a;
    private final List<String> b;
    private final ajwy<gqr> c;

    /* renamed from: fhv$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ fhv a;
        private /* synthetic */ ffq b;

        a(fhv fhv, ffq ffq) {
            this.a = fhv;
            this.b = ffq;
        }

        public final /* synthetic */ Object call() {
            ((eyo) this.a.a.get()).a(this.b);
            return ajxw.a;
        }
    }

    public fhv(ajwy<eyo> ajwy, ajwy<gqr> ajwy2) {
        akcr.b(ajwy, "cognacFragmentService");
        akcr.b(ajwy2, "exceptionTracker");
        this.a = ajwy;
        this.c = ajwy2;
        Object of = ImmutableList.of("snapchat://cognac/app.*");
        akcr.a(of, "ImmutableList.of(\n      …EP_LINK_URI_PATTERN\n    )");
        this.b = (List) of;
    }

    public final List<String> a() {
        return this.b;
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object b;
        try {
            b = ajcx.b((Callable) new a(this, a.a(uri)));
            akcr.a(b, "Completable.fromCallable…pLinkModel)\n            }");
            return b;
        } catch (Exception e) {
            ((gqr) this.c.get()).a(gqt.HIGH, e, eym.f.callsite("CognacDeepLinkHandler"));
            b = ajvo.a(ajhn.a);
            akcr.a(b, "Completable.complete()");
            return b;
        }
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
