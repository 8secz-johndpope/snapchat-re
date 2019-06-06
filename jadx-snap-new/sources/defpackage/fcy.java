package defpackage;

import android.net.Uri;
import com.snap.cognac.network.TokenShopHttpInterface;
import defpackage.sbm.a;
import java.util.Set;

@ftr(a = "cognac/*/*")
/* renamed from: fcy */
public class fcy extends ggm {
    private final gee a;
    private final fcv b;

    public fcy(fcv fcv, gee gee) {
        this.a = gee;
        this.b = fcv;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        String str = (String) uri.getPathSegments().get(1);
        String str2 = (String) uri.getPathSegments().get(2);
        gee gee = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(str2.replace("/", ""));
        return gee.a(new gew(stringBuilder.toString(), new a(TokenShopHttpInterface.TPS_BASE_URL.concat(String.valueOf(str2)), sac.GET).e(), null, null, gii.a, this.b, set, set2, null)).a(z);
    }
}
