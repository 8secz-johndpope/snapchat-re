package defpackage;

import java.util.List;

/* renamed from: rge */
public final class rge {
    public final iin a;
    final List<psf> b;

    public rge(iin iin) {
        akcr.b(iin, "interactionType");
        this(iin, ajyw.a);
    }

    public rge(iin iin, List<psf> list) {
        akcr.b(iin, "snapInteractionType");
        akcr.b(list, "snaps");
        this.a = iin;
        this.b = list;
        boolean a = this.a.a();
        if (ajxy.a && !a) {
            throw new AssertionError("Assertion failed");
        }
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.rge;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.rge) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rge.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        iin iin = this.a;
        int i = 0;
        int hashCode = (iin != null ? iin.hashCode() : 0) * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapSessionStorable(snapInteractionType=");
        stringBuilder.append(this.a);
        stringBuilder.append(", snaps=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
