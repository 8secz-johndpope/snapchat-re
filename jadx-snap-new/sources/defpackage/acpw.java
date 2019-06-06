package defpackage;

import java.util.List;

/* renamed from: acpw */
public final class acpw {
    public final List<alhm> a;
    public final List<String> b;

    public acpw(List<alhm> list, List<String> list2) {
        akcr.b(list, "friendClusterList");
        akcr.b(list2, "markerIds");
        this.a = list;
        this.b = list2;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.acpw;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.acpw) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.b;
        r3 = r3.b;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acpw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExploreMapFriendMarkerData(friendClusterList=");
        stringBuilder.append(this.a);
        stringBuilder.append(", markerIds=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
