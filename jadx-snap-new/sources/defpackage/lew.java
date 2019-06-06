package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.lex.a;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@ftr(a = "tracking_data/*/*")
/* renamed from: lew */
public final class lew extends ggm {
    private final gee a;
    private final akbw<akbl<String, String>, String, gfl> b;
    private final Supplier<String> c;

    public lew(gee gee, akbw<akbl<String, String>, String, gfl> akbw, Supplier<String> supplier) {
        akcr.b(gee, "contentManager");
        akcr.b(akbw, "payloadProcessorFactory");
        akcr.b(supplier, "baseUrlSupplier");
        this.a = gee;
        this.b = akbw;
        this.c = supplier;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Uri uri2 = uri;
        akcr.b(uri, MessageMediaRefModel.URI);
        Set<rzg> set3 = set;
        akcr.b(set, "schedulingContexts");
        Set<? extends gdy> set4 = set2;
        akcr.b(set4, "cacheAccessControls");
        List pathSegments = uri.getPathSegments();
        Object obj = (String) pathSegments.get(1);
        Object obj2 = (String) pathSegments.get(2);
        akcr.a(obj, "name");
        akbl aVar = new a(obj);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String) this.c.get());
        stringBuilder.append('/');
        Object[] objArr = new Object[]{obj};
        Object format = String.format("static/on_demand?resource=lens/%s.zip", Arrays.copyOf(objArr, 1));
        akcr.a(format, "java.lang.String.format(this, *args)");
        stringBuilder.append(format);
        String stringBuilder2 = stringBuilder.toString();
        gee gee = this.a;
        akbw akbw = this.b;
        akcr.a(obj2, "checksum");
        gfl gfl = (gfl) akbw.invoke(aVar, obj2);
        Object e = new sbm.a(stringBuilder2, sac.POST).b(new gma(new aedh())).e();
        akcr.a(e, "SimpleRequest.Builder<An…                 .build()");
        boolean z2 = z;
        obj2 = gee.a(new gew(stringBuilder2, e, null, gfl, les.a, set3, set4, 268)).a(z);
        akcr.a(obj2, "contentManager.submit(bu…tResult(closeOnTerminate)");
        return obj2;
    }
}
