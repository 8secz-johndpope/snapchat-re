package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.loginkit.lib.ui.auth.LoginKitOAuthFlowFragment;
import defpackage.gvl.a;
import java.util.List;

/* renamed from: nhh */
public final class nhh implements czl, gvn {
    final aipn<zjw> a;
    private final List<String> b;
    private final Context c;

    /* renamed from: nhh$a */
    static final class a implements Runnable {
        private /* synthetic */ nhh a;
        private /* synthetic */ Uri b;

        a(nhh nhh, Uri uri) {
            this.a = nhh;
            this.b = uri;
        }

        public final void run() {
            zjm zjm = ngn.a;
            LoginKitOAuthFlowFragment loginKitOAuthFlowFragment = new LoginKitOAuthFlowFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("OAUTH2_URI", this.b);
            loginKitOAuthFlowFragment.setArguments(bundle);
            zjf zjf = new zjf(zjm, loginKitOAuthFlowFragment, acgv.a().a());
            zjw zjw = (zjw) this.a.a.get();
            achb achb = ((zjw) this.a.a.get()).d;
            achd achd = zjf;
            Object d = ngn.c.g().b((achg) ngn.a).d();
            akcr.a(d, "LoginKitFeature.PRESENT_…                 .build()");
            zjw.a(zjw, null, true, new acip(achb, achd, d), null, 9);
        }
    }

    public nhh(Context context, aipn<zjw> aipn) {
        akcr.b(context, "context");
        akcr.b(aipn, "deepLinkNavigator");
        this.c = context;
        this.a = aipn;
        Object of = ImmutableList.of("snapchat://oauth2..*");
        akcr.a(of, "ImmutableList.of(\"snapchat://oauth2..*\")");
        this.b = (List) of;
    }

    public final aahz a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return aahz.SNAP_CONNECT_LOGIN;
    }

    public final List<String> a() {
        return this.b;
    }

    public final aahz b(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Context context = this.c;
        if (!(context instanceof Activity) || context == null) {
            return null;
        }
        Object intent = ((Activity) context).getIntent();
        akcr.a(intent, "intent");
        if (a.c(intent)) {
            return a(uri);
        }
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
