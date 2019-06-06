package defpackage;

import com.snap.core.db.column.PrivacyType;
import java.util.List;

/* renamed from: ymj */
public final class ymj {
    final PrivacyType a;
    final List<yiw> b;

    public ymj(PrivacyType privacyType, List<yiw> list) {
        akcr.b(privacyType, "privacyType");
        akcr.b(list, "friendsBlacklist");
        this.a = privacyType;
        this.b = list;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.ymj;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.ymj) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ymj.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        PrivacyType privacyType = this.a;
        int i = 0;
        int hashCode = (privacyType != null ? privacyType.hashCode() : 0) * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MyStoryPrivacySettingsMetadata(privacyType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", friendsBlacklist=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
