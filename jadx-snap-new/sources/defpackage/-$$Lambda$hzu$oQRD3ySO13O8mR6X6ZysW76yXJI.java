package defpackage;

import com.snap.core.db.api.SqlDelightDbManager;
import defpackage.ihx.a;

/* compiled from: lambda */
/* renamed from: -$$Lambda$hzu$oQRD3ySO13O8mR6X6ZysW76yXJI */
public final /* synthetic */ class -$$Lambda$hzu$oQRD3ySO13O8mR6X6ZysW76yXJI implements a {
    private final /* synthetic */ SqlDelightDbManager f$0;

    public /* synthetic */ -$$Lambda$hzu$oQRD3ySO13O8mR6X6ZysW76yXJI(SqlDelightDbManager sqlDelightDbManager) {
        this.f$0 = sqlDelightDbManager;
    }

    public final Object initialize() {
        return this.f$0.getDbClient(new idd(hyn.a.getPage()));
    }
}
