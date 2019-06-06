package defpackage;

import com.snap.core.model.StorySnapRecipient;
import java.util.List;

/* renamed from: tqe */
public final class tqe {
    public final ajdx<List<abyi>> a;
    public final List<StorySnapRecipient> b;
    public final aail c;
    private final aann d;

    public tqe(ajdx<List<abyi>> ajdx, List<StorySnapRecipient> list, aail aail, aann aann) {
        akcr.b(ajdx, "previewData");
        akcr.b(list, "storyRecipients");
        akcr.b(aail, "directSnapPreviewEvent");
        akcr.b(aann, "geofilterDirectSnapPreviewEvent");
        this.a = ajdx;
        this.b = list;
        this.c = aail;
        this.d = aann;
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (defpackage.akcr.a(r2.d, r3.d) != false) goto L_0x0033;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof defpackage.tqe;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (defpackage.tqe) r3;
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
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.d;
        r3 = r3.d;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tqe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ajdx ajdx = this.a;
        int i = 0;
        int hashCode = (ajdx != null ? ajdx.hashCode() : 0) * 31;
        List list = this.b;
        hashCode = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        aail aail = this.c;
        hashCode = (hashCode + (aail != null ? aail.hashCode() : 0)) * 31;
        aann aann = this.d;
        if (aann != null) {
            i = aann.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreviewPostEvent(previewData=");
        stringBuilder.append(this.a);
        stringBuilder.append(", storyRecipients=");
        stringBuilder.append(this.b);
        stringBuilder.append(", directSnapPreviewEvent=");
        stringBuilder.append(this.c);
        stringBuilder.append(", geofilterDirectSnapPreviewEvent=");
        stringBuilder.append(this.d);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
