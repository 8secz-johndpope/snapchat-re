package defpackage;

import java.util.List;

/* renamed from: tqg */
public final class tqg {
    public final ajdx<List<abyi>> a;
    public final aail b;
    public final abll c;
    private final aann d;

    public tqg(ajdx<List<abyi>> ajdx, aail aail, aann aann, abll abll) {
        akcr.b(ajdx, "previewData");
        akcr.b(aail, "directSnapPreviewEvent");
        akcr.b(aann, "geofilterDirectSnapPreviewEvent");
        akcr.b(abll, "timer");
        this.a = ajdx;
        this.b = aail;
        this.d = aann;
        this.c = abll;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof defpackage.tqg;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (defpackage.tqg) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.c;
        r3 = r3.c;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ajdx ajdx = this.a;
        int i = 0;
        int hashCode = (ajdx != null ? ajdx.hashCode() : 0) * 31;
        aail aail = this.b;
        hashCode = (hashCode + (aail != null ? aail.hashCode() : 0)) * 31;
        aann aann = this.d;
        hashCode = (hashCode + (aann != null ? aann.hashCode() : 0)) * 31;
        abll abll = this.c;
        if (abll != null) {
            i = abll.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreviewSendEvent(previewData=");
        stringBuilder.append(this.a);
        stringBuilder.append(", directSnapPreviewEvent=");
        stringBuilder.append(this.b);
        stringBuilder.append(", geofilterDirectSnapPreviewEvent=");
        stringBuilder.append(this.d);
        stringBuilder.append(", timer=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
