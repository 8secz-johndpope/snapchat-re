package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: kph */
public final class kph implements kpi {
    private koy a;
    private final Comparator<kor> b;

    public kph(Comparator<kor> comparator, koy koy) {
        this.b = comparator;
        this.a = koy;
    }

    public final List<kor> a(Map<String, List<kor>> map) {
        ArrayList arrayList = new ArrayList();
        for (Entry value : map.entrySet()) {
            List list = (List) value.getValue();
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        Collections.sort(arrayList, this.b);
        return this.a.c(arrayList);
    }
}
