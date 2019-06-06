package defpackage;

import android.net.Uri;
import com.google.common.base.Suppliers;
import com.snap.core.db.record.MessageMediaRefModel;
import java.io.FileInputStream;
import java.util.Set;

@ftr(a = "edits/*/package/*")
/* renamed from: ogi */
public final class ogi extends ghz {
    private final ogs a;

    /* renamed from: ogi$a */
    static final class a extends akcs implements akbw<idd, odx, odp> {
        private /* synthetic */ ogi a;

        a(ogi ogi) {
            this.a = ogi;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            odx odx = (odx) obj2;
            akcr.b((idd) obj, "caller");
            akcr.b(odx, "mediaPackageReader");
            FileInputStream d = odx.d();
            return new odp("edits", d != null ? Suppliers.ofInstance(d) : null, null, null, 12);
        }
    }

    public ogi(odu odu) {
        akcr.b(odu, "mediaPackageManager");
        this.a = new ogs(odu, new a(this));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return gem.a(this.a.a(uri, set), z);
    }
}
