package androidx.work;

import defpackage.po;
import defpackage.po.a;
import defpackage.pp;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OverwritingInputMerger extends pp {
    public final po a(List<po> list) {
        a aVar = new a();
        Map hashMap = new HashMap();
        for (po poVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(poVar.b));
        }
        aVar.a(hashMap);
        return aVar.a();
    }
}
