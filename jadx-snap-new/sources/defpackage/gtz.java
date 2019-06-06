package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.creativekit.lib.ui.loading.CreativeKitLiteLoadingFragment;
import com.snap.creativekit.lib.ui.loading.CreativeKitLoadingFragment;
import com.snap.ui.deck.MainPageFragment;
import java.util.List;

/* renamed from: gtz */
public final class gtz implements czl, gvn {
    final aipn<zjw> a;
    private final List<String> b;
    private final Context c;

    /* renamed from: gtz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: gtz$b */
    static final class b implements Runnable {
        private /* synthetic */ gtz a;
        private /* synthetic */ Uri b;
        private /* synthetic */ Intent c;

        b(gtz gtz, Uri uri, Intent intent) {
            this.a = gtz;
            this.b = uri;
            this.c = intent;
        }

        public final void run() {
            achb achb = ((zjw) this.a.a.get()).d;
            zjm zjm = gts.a;
            MainPageFragment creativeKitLiteLoadingFragment = akcr.a(this.b.getHost(), (Object) "creativekit") ? new CreativeKitLiteLoadingFragment() : new CreativeKitLoadingFragment();
            Object obj = this.c;
            String str = "intent";
            akcr.a(obj, str);
            Bundle bundle = new Bundle(obj.getExtras());
            bundle.putString("deeplink_uri", this.b.toString());
            obj = this.c;
            akcr.a(obj, str);
            bundle.putString(ohk.e, obj.getType());
            obj = this.c;
            akcr.a(obj, str);
            bundle.putString("intent_action", obj.getAction());
            creativeKitLiteLoadingFragment.setArguments(bundle);
            zjw zjw = (zjw) this.a.a.get();
            achd zjf = new zjf(zjm, creativeKitLiteLoadingFragment, acgv.a().a());
            Object a = acgu.a(acis.d, (achg) gts.a, true);
            akcr.a(a, "NavigationAction.present…                    true)");
            zjw.a(zjw, null, false, new acip(achb, zjf, a), null, 9);
        }
    }

    static {
        a aVar = new a();
    }

    public gtz(Context context, aipn<zjw> aipn) {
        akcr.b(context, "context");
        akcr.b(aipn, "deepLinkNavigator");
        this.c = context;
        this.a = aipn;
        Object of = ImmutableList.of("snapchat://camera..*", "snapchat://preview..*", "snapchat://creativekit/..*");
        akcr.a(of, "ImmutableList.of(\n      …pchat://creativekit/..*\")");
        this.b = (List) of;
    }

    private final ajcx e(Uri uri) {
        Object a;
        String str;
        Context context = this.c;
        if (context instanceof Activity) {
            Object intent = ((Activity) context).getIntent();
            akcr.a(intent, "intent");
            if (akcr.a(intent.getData(), (Object) uri) && akcr.a(intent.getPackage(), this.c.getPackageName())) {
                a = ajcx.a((Runnable) new b(this, uri, intent));
                str = "Completable.fromRunnable…true)))\n                }";
                akcr.a(a, str);
                return a;
            }
        }
        a = ajvo.a(ajhn.a);
        str = "Completable.complete()";
        akcr.a(a, str);
        return a;
    }

    public final aahz a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -1367751899) {
                if (hashCode != -358261561) {
                    if (hashCode == -318184504 && host.equals("preview")) {
                        return aahz.SNAP_KIT_CREATIVE_KIT_PREVIEW;
                    }
                } else if (host.equals("creativekit")) {
                    return aahz.CREATIVE_KIT_LITE;
                }
            } else if (host.equals("camera")) {
                return aahz.SNAP_KIT_CREATIVE_KIT_CAMERA;
            }
        }
        return null;
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
        return e(uri);
    }

    public final ajcx d(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return e(uri);
    }
}
