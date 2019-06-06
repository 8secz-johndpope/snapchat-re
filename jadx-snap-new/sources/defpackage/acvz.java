package defpackage;

import android.view.View;
import com.snap.ui.view.SnapFontTextView;

/* renamed from: acvz */
final class acvz {
    final View a;
    final SnapFontTextView b;
    final SnapFontTextView c;

    public acvz(View view, SnapFontTextView snapFontTextView, SnapFontTextView snapFontTextView2) {
        akcr.b(view, "view");
        akcr.b(snapFontTextView, "title");
        akcr.b(snapFontTextView2, "subtitle");
        this.a = view;
        this.b = snapFontTextView;
        this.c = snapFontTextView2;
    }

    /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0029;
    L_0x0002:
        r0 = r3 instanceof defpackage.acvz;
        if (r0 == 0) goto L_0x0027;
    L_0x0006:
        r3 = (defpackage.acvz) r3;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acvz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        View view = this.a;
        int i = 0;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        SnapFontTextView snapFontTextView = this.b;
        hashCode = (hashCode + (snapFontTextView != null ? snapFontTextView.hashCode() : 0)) * 31;
        snapFontTextView = this.c;
        if (snapFontTextView != null) {
            i = snapFontTextView.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LabelWindowViewHolder(view=");
        stringBuilder.append(this.a);
        stringBuilder.append(", title=");
        stringBuilder.append(this.b);
        stringBuilder.append(", subtitle=");
        stringBuilder.append(this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
