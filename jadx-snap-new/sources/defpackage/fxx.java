package defpackage;

import com.snap.core.db.record.DataConsumption.Adapter;
import com.snap.core.db.record.DataConsumptionQueries;

/* renamed from: fxx */
public final class fxx extends aing implements fwr {
    final fxw a;
    final Adapter b;

    public fxx(aino aino, Adapter adapter) {
        akcr.b(aino, "driver");
        akcr.b(adapter, "DataConsumptionAdapter");
        super(aino);
        this.b = adapter;
        this.a = new fxw(this, aino);
    }

    public final /* bridge */ /* synthetic */ DataConsumptionQueries a() {
        return this.a;
    }
}
