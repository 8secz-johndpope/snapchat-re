package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.moc.a.a;
import defpackage.ryz.c;
import java.util.List;
import java.util.Set;

@ftr(a = "bitmoji_lens_avatar_asset/*/*/*/*/*")
/* renamed from: lbz */
public final class lbz extends ggm {
    private final gee a;
    private final Supplier<String> b;

    public lbz(gee gee, Supplier<String> supplier) {
        akcr.b(gee, "contentManager");
        akcr.b(supplier, "baseUrlSupplier");
        this.a = gee;
        this.b = supplier;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Set<rzg> set3 = set;
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        Set<? extends gdy> set4 = set2;
        akcr.b(set4, "cacheAccessControls");
        List pathSegments = uri.getPathSegments();
        Object obj = (String) pathSegments.get(1);
        Object obj2 = (String) pathSegments.get(2);
        Object obj3 = (String) pathSegments.get(3);
        Object obj4 = (String) pathSegments.get(4);
        Object obj5 = (String) pathSegments.get(5);
        akcr.a(obj2, "assetEnvStr");
        a valueOf = a.valueOf(obj2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String) this.b.get());
        stringBuilder.append('/');
        akcr.a(obj, "path");
        stringBuilder.append(akgc.a((String) obj, (CharSequence) "/"));
        String stringBuilder2 = stringBuilder.toString();
        gee gee = this.a;
        akcr.a(obj4, "userId");
        akcr.a(obj5, "avatarId");
        akcr.a(obj3, "assetGroupId");
        stringBuilder = new StringBuilder();
        stringBuilder.append(obj5);
        stringBuilder.append('-');
        stringBuilder.append(obj3);
        String stringBuilder3 = stringBuilder.toString();
        ryz.a aVar = new ryz.a(stringBuilder2, sac.POST, c.METADATA, set);
        aedp aedp = new aedp();
        aedp.b = valueOf.name();
        aedp.c = obj4;
        aedp.a = obj3;
        obj5 = aVar.a(new gma(aedp)).e();
        akcr.a(obj5, "NetworkRequest.Builder(u…                 .build()");
        obj5 = gee.a(new gew(stringBuilder3, (sak) obj5, null, null, lbx.a, set3, set4, 284)).a(z);
        akcr.a(obj5, "contentManager.submit(\n …tResult(closeOnTerminate)");
        return obj5;
    }
}
