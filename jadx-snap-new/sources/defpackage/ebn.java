package defpackage;

import android.graphics.Point;

/* renamed from: ebn */
public final class ebn {
    public final a a;
    public final Point b;

    /* renamed from: ebn$a */
    public enum a {
        START,
        MOVE,
        STOP
    }

    public ebn(a aVar, Point point) {
        akcr.b(aVar, "status");
        akcr.b(point, "position");
        this.a = aVar;
        this.b = point;
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof defpackage.ebn;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (defpackage.ebn) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        a aVar = this.a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        Point point = this.b;
        if (point != null) {
            i = point.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LongPressUpdate(status=");
        stringBuilder.append(this.a);
        stringBuilder.append(", position=");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
