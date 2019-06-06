package defpackage;

import java.util.Map;

/* renamed from: ixw */
public final class ixw {
    final Map<Long, String> a;

    public ixw(Map<Long, String> map) {
        akcr.b(map, "friendKeyToUsernameMap");
        this.a = map;
    }

    /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.ixw) r2).a) != false) goto L_0x0015;
     */
    public final boolean equals(java.lang.Object r2) {
        /*
        r1 = this;
        if (r1 == r2) goto L_0x0015;
    L_0x0002:
        r0 = r2 instanceof defpackage.ixw;
        if (r0 == 0) goto L_0x0013;
    L_0x0006:
        r2 = (defpackage.ixw) r2;
        r0 = r1.a;
        r2 = r2.a;
        r2 = defpackage.akcr.a(r0, r2);
        if (r2 == 0) goto L_0x0013;
    L_0x0012:
        goto L_0x0015;
    L_0x0013:
        r2 = 0;
        return r2;
    L_0x0015:
        r2 = 1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixw.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Map map = this.a;
        return map != null ? map.hashCode() : 0;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MultiAddFriendData(friendKeyToUsernameMap=");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
