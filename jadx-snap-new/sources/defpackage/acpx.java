package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: acpx */
public final class acpx {
    public final Map<String, alhq> a;
    public final List<ales> b;
    public final List<acvh> c;

    public acpx(Map<String, alhq> map, List<ales> list, List<? extends acvh> list2) {
        akcr.b(map, "usersToEndLocationMap");
        akcr.b(list, "locations");
        akcr.b(list2, "pathSet");
        this.a = map;
        this.b = list;
        this.c = list2;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.acpx;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.acpx) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x001c:
        r0 = r2.c;
        r3 = r3.c;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0027;
    L_0x0026:
        goto L_0x0029;
    L_0x0027:
        r3 = 0;
        return r3;
    L_0x0029:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acpx.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Map map = this.a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        List list = this.b;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExploreMapStateData(usersToEndLocationMap=");
        stringBuilder.append(this.a);
        stringBuilder.append(", locations=");
        stringBuilder.append(this.b);
        stringBuilder.append(", pathSet=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
