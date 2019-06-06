package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;

/* renamed from: dfc */
public final class dfc implements czl, gvn {
    final aipn<zjw> a;
    final aipn<dgp> b;
    private final List<String> c;

    /* renamed from: dfc$a */
    static final class a implements Runnable {
        private /* synthetic */ dfc a;
        private /* synthetic */ Uri b;

        a(dfc dfc, Uri uri) {
            this.a = dfc;
            this.b = uri;
        }

        public final void run() {
            zjf zjf = new zjf(ddg.a, ((dgp) this.a.b.get()).a(this.b), acgv.a().a(ddg.c).a());
            zjw zjw = (zjw) this.a.a.get();
            zjm zjm = dnh.a;
            achb achb = ((zjw) this.a.a.get()).d;
            achd achd = zjf;
            Object d = ddg.b.g().b((achg) ddg.a).d();
            akcr.a(d, "BitmojiFeature.BITMOJI_S…                 .build()");
            zjw.a(zjw, zjm, true, new acip(achb, achd, d), null, 8);
        }
    }

    public dfc(aipn<zjw> aipn, aipn<dgp> aipn2) {
        akcr.b(aipn, "deepLinkNavigator");
        akcr.b(aipn2, "bitmojiFragmentFactory");
        this.a = aipn;
        this.b = aipn2;
        Object of = ImmutableList.of("snapchat://bitmoji/oauth2/..*");
        akcr.a(of, "ImmutableList.of(\"snapchat://bitmoji/oauth2/..*\")");
        this.c = (List) of;
    }

    public final aahz a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return aahz.BITMOJI;
    }

    public final List<String> a() {
        return this.c;
    }

    public final aahz b(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object a = ajcx.a((Runnable) new a(this, uri));
        akcr.a(a, "Completable.fromRunnable…     .build()))\n        }");
        return a;
    }

    public final ajcx d(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return c(uri);
    }
}
