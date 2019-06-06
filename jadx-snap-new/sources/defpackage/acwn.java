package defpackage;

import com.snap.core.db.record.PostableStoryModel;

/* renamed from: acwn */
public final class acwn {
    public String a;
    public String b;

    public acwn(String str, String str2) {
        akcr.b(str, "mapStatusLabel");
        akcr.b(str2, PostableStoryModel.SUBTEXT);
        this.a = str;
        this.b = str2;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.acwn;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.acwn) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acwn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SingleStatusLabelWindowData(mapStatusLabel=");
        stringBuilder.append(this.a);
        stringBuilder.append(", subtext=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
