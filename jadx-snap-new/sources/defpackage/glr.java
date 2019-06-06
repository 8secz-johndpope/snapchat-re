package defpackage;

import defpackage.rzf.a;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: glr */
public final class glr extends glf<glq> {
    public glr() {
        super("NetworkManagerExecuting");
    }

    /* Access modifiers changed, original: final */
    public final Map<a, List<rzf<ryz>>> a() {
        EnumMap enumMap = new EnumMap(a.class);
        for (Entry value : this.a.entrySet()) {
            rzf rzf = (rzf) value.getValue();
            a d = rzf.d();
            List list = (List) enumMap.get(d);
            if (list != null) {
                list.add(rzf);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(rzf);
                enumMap.put(d, arrayList);
            }
        }
        return enumMap;
    }

    public final /* bridge */ /* synthetic */ void a(rzf rzf) {
        super.a(rzf);
    }

    public final /* synthetic */ Object b() {
        return new glq(a());
    }

    public final /* bridge */ /* synthetic */ boolean b(rzf rzf) {
        return super.b(rzf);
    }
}
