package defpackage;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.creativekit.lib.ui.web.CreativeKitWebFragment;
import java.util.List;

/* renamed from: gty */
public final class gty implements czl, gvn {
    final aipn<zjw> a;
    private final List<String> b;

    /* renamed from: gty$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: gty$b */
    static final class b implements Runnable {
        private /* synthetic */ gty a;
        private /* synthetic */ Uri b;

        b(gty gty, Uri uri) {
            this.a = gty;
            this.b = uri;
        }

        public final void run() {
            achb achb = ((zjw) this.a.a.get()).d;
            zjm zjm = gtu.a;
            CreativeKitWebFragment creativeKitWebFragment = new CreativeKitWebFragment();
            Bundle bundle = new Bundle();
            String str = "attachmentUrl";
            bundle.putString(str, this.b.getQueryParameter(str));
            bundle.putString("deeplink_uri", this.b.toString());
            creativeKitWebFragment.setArguments(bundle);
            zjw zjw = (zjw) this.a.a.get();
            achd zjf = new zjf(zjm, creativeKitWebFragment, acgv.a().a());
            Object a = acgu.a(acis.d, (achg) gtu.a, true);
            akcr.a(a, "NavigationAction.present…                    true)");
            zjw.a(zjw, null, false, new acip(achb, zjf, a), null, 9);
        }
    }

    static {
        a aVar = new a();
    }

    public gty(aipn<zjw> aipn) {
        akcr.b(aipn, "deepLinkNavigator");
        this.a = aipn;
        Object of = ImmutableList.of("snapchat://creativekitweb/..*");
        akcr.a(of, "ImmutableList.of(\n      …creativekitweb/..*\"\n    )");
        this.b = (List) of;
    }

    public final aahz a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return aahz.CREATIVE_KIT_WEB;
    }

    public final List<String> a() {
        return this.b;
    }

    public final aahz b(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object a = ajcx.a((Runnable) new b(this, uri));
        akcr.a(a, "Completable.fromRunnable…        true)))\n        }");
        return a;
    }

    public final ajcx d(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return c(uri);
    }
}
