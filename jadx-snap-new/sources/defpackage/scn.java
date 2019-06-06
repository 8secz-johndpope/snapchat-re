package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;

/* renamed from: scn */
public final class scn implements gvn {
    final achb<zjm, zjk> a;
    final ajwy<shb> b;
    private final List<String> c;

    /* renamed from: scn$a */
    static final class a implements Runnable {
        private /* synthetic */ scn a;

        a(scn scn) {
            this.a = scn;
        }

        public final void run() {
            Object obj = (shb) this.a.b.get();
            achb achb = this.a.a;
            akcr.a(obj, "pageController");
            achb.a((achd) obj, obj.p, null);
        }
    }

    public scn(achb<zjm, zjk> achb, ajwy<shb> ajwy) {
        akcr.b(achb, "navigationHost");
        akcr.b(ajwy, "pageControllerProvider");
        this.a = achb;
        this.b = ajwy;
        Object of = ImmutableList.of("snapchat://notification/setting/");
        akcr.a(of, "ImmutableList.of(NOTIFICATION_SETTING_URI)");
        this.c = (List) of;
    }

    public final List<String> a() {
        return this.c;
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object a = ajcx.a((Runnable) new a(this));
        akcr.a(a, "Completable.fromRunnable…vigationAction)\n        }");
        return a;
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
