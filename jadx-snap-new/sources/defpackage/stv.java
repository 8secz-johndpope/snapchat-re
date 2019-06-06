package defpackage;

import defpackage.ssw.a;
import java.util.List;

/* renamed from: stv */
public final class stv extends ssw<smi, smj> {
    private final sug a;

    public stv(sug sug) {
        akcr.b(sug, "featureSpecManager");
        this.a = sug;
    }

    public final ajdx<List<smj>> a(stl stl, smi smi, idk idk) {
        akcr.b(stl, "operaPresenterContext");
        akcr.b(smi, "group");
        akcr.b(idk, "pageFactory");
        sug sug = this.a;
        Object a = smi.a().a();
        akcr.a(a, "group.type.featureName");
        ssv a2 = sug.a(a);
        if (a2 != null) {
            a aVar = a2.a;
            if (aVar != null) {
                return aVar.a(stl, smi, idk);
            }
        }
        StringBuilder stringBuilder = new StringBuilder("Could not find item provider for ");
        stringBuilder.append(smi.a().a());
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
