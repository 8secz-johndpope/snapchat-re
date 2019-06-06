package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;

/* renamed from: qvy */
public final class qvy implements gvn {
    final zjw a;
    private final List<String> b;

    /* renamed from: qvy$a */
    static final class a implements Runnable {
        private /* synthetic */ qvy a;

        a(qvy qvy) {
            this.a = qvy;
        }

        public final void run() {
            qvy qvy = this.a;
            zjw.a(qvy.a, qxo.a, true, null, null, 12);
        }
    }

    public qvy(zjw zjw) {
        akcr.b(zjw, "deepLinkNavigator");
        this.a = zjw;
        Object of = ImmutableList.of("snapchat://notification/friendsfeed/.*");
        akcr.a(of, "ImmutableList.of(Messagi…NDS_FEED_BASE_URI + \".*\")");
        this.b = (List) of;
    }

    public final List<String> a() {
        return this.b;
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object a = ajcx.a((Runnable) new a(this));
        akcr.a(a, "Completable.fromRunnable…FEED_PAGE_TYPE)\n        }");
        return a;
    }

    public final ajcx d(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }
}
