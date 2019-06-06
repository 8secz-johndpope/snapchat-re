package defpackage;

import android.net.Uri;
import com.google.common.base.Suppliers;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.core.db.record.StorySyncStateModel;
import java.io.ByteArrayInputStream;
import java.util.Set;

@ftr(a = "metadata/*/package/*")
/* renamed from: ogf */
public final class ogf extends ghz {
    final ajdx<iha> a;
    private final ogs b;

    /* renamed from: ogf$a */
    static final class a extends akcs implements akbw<idd, odx, odp> {
        private /* synthetic */ ogf a;

        a(ogf ogf) {
            this.a = ogf;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            odx odx = (odx) obj2;
            akcr.b((idd) obj, "caller");
            akcr.b(odx, "mediaPackageReader");
            return new odp(StorySyncStateModel.METADATA, Suppliers.ofInstance(new ByteArrayInputStream(((iha) this.a.a.b()).a(odx.b().e))), null, null, 12);
        }
    }

    public ogf(odu odu, ajdx<iha> ajdx) {
        akcr.b(odu, "mediaPackageManager");
        akcr.b(ajdx, "serializationHelper");
        this.a = ajdx;
        this.b = new ogs(odu, new a(this));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        return gem.a(this.b.a(uri, set), z);
    }
}
