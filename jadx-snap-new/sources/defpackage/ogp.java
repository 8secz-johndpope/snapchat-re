package defpackage;

import android.net.Uri;
import com.google.common.base.Suppliers;
import com.snap.core.db.record.MessageMediaRefModel;
import java.io.FileInputStream;
import java.util.Set;

@ftr(a = "overlay/*/package/*")
/* renamed from: ogp */
public final class ogp extends ghz {
    private final ogs a = new ogs(this.b, new a(this));
    private final odu b;

    /* renamed from: ogp$a */
    static final class a extends akcs implements akbw<idd, odx, odp> {
        private /* synthetic */ ogp a;

        a(ogp ogp) {
            this.a = ogp;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            odx odx = (odx) obj2;
            akcr.b((idd) obj, "page");
            akcr.b(odx, "mediaPackageReader");
            FileInputStream l = odx.l();
            return new odp("overlay", l != null ? Suppliers.ofInstance(l) : null, null, null, 12);
        }
    }

    public ogp(odu odu) {
        akcr.b(odu, "mediaPackageManager");
        this.b = odu;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return gem.a(this.a.a(uri, set), z);
    }
}
