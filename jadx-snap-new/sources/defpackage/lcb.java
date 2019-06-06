package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.moc.a.a;
import defpackage.ryz.c;
import java.util.List;
import java.util.Set;

@ftr(a = "bitmoji_lens_metadata/*/*/*/*")
/* renamed from: lcb */
public final class lcb extends ggm {
    private final gee a;
    private final Supplier<String> b;

    public lcb(gee gee, Supplier<String> supplier) {
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
        String str = (String) pathSegments.get(4);
        akcr.a(obj2, "assetEnvStr");
        a valueOf = a.valueOf(obj2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String) this.b.get());
        stringBuilder.append('/');
        akcr.a(obj, "path");
        stringBuilder.append(akgc.a((String) obj, (CharSequence) "/"));
        String stringBuilder2 = stringBuilder.toString();
        gee gee = this.a;
        akcr.a(obj3, "userId");
        akcr.a((Object) str, "avatarId");
        ryz.a aVar = new ryz.a(stringBuilder2, sac.POST, c.METADATA, set);
        aedt aedt = new aedt();
        aedt.a = valueOf.name();
        aedt.b = obj3;
        Object c = aVar.a(new gma(aedt)).e();
        akcr.a(c, "NetworkRequest.Builder(u…                 .build()");
        c = gee.a(new gew(str, (sak) c, null, null, lcc.a, set3, set4, 284)).a(z);
        akcr.a(c, "contentManager.submit(\n …tResult(closeOnTerminate)");
        return c;
    }
}
