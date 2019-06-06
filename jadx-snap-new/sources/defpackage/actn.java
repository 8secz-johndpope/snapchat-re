package defpackage;

import java.util.Map;

/* renamed from: actn */
public final class actn {
    final Map<String, actm> a;
    final Map<String, actm> b;

    public actn(Map<String, actm> map, Map<String, actm> map2) {
        akcr.b(map, "userIdToFriendMap");
        akcr.b(map2, "usernameToFriendMap");
        this.a = map;
        this.b = map2;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.actn;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.actn) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Map map = this.a;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map map2 = this.b;
        if (map2 != null) {
            i = map2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LocationSharingFriendMap(userIdToFriendMap=");
        stringBuilder.append(this.a);
        stringBuilder.append(", usernameToFriendMap=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
