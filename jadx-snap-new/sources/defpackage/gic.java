package defpackage;

import defpackage.gel.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: gic */
public final class gic implements gih {
    private final String a = "type";
    private final ajwy<ilv> b;

    public gic(ajwy<ilv> ajwy) {
        akcr.b(ajwy, "graphene");
        this.b = ajwy;
    }

    public final void a(List<a> list, gih.a aVar) {
        iot iot;
        akcr.b(list, "openFdAttributions");
        String str = "event";
        akcr.b(aVar, str);
        akcr.b(aVar, str);
        int i = gid.a[aVar.ordinal()];
        if (i == 1) {
            iot = iot.CONTENT_RESULT_BACKGROUND_LEAK;
        } else if (i == 2) {
            iot = iot.CONTENT_RESULT_TOO_MANY;
        } else {
            throw new ajxk();
        }
        ily ily = iot;
        HashMap hashMap = new HashMap();
        for (a aVar2 : list) {
            Object obj = (Integer) hashMap.get(aVar2.a);
            if (obj == null) {
                obj = Integer.valueOf(0);
            }
            akcr.a(obj, "map.get(it.attribution) ?: 0");
            hashMap.put(aVar2.a, Integer.valueOf(obj.intValue() + aVar2.b));
        }
        for (Entry entry : hashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            long intValue = (long) ((Number) entry.getValue()).intValue();
            ((ilv) this.b.get()).b(ily.a(this.a, str2), intValue);
            ((ilv) this.b.get()).c(ily.a(this.a, str2), intValue);
        }
    }
}
