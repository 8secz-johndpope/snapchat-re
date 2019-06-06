package com.snap.ui.view.multisnap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import defpackage.akbl;
import defpackage.akcr;

public final class TrimmingHandleImageView extends ImageView {
    private akbl<? super MotionEvent, Boolean> shouldDispatchTouchEvent;

    public TrimmingHandleImageView(Context context) {
        akcr.b(context, "context");
        super(context);
    }

    public TrimmingHandleImageView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    public TrimmingHandleImageView(Context context, AttributeSet attributeSet, int i) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }

    /* JADX WARNING: Missing block: B:8:0x0020, code skipped:
            if (((java.lang.Boolean) r0.invoke(r2)).booleanValue() != false) goto L_0x0022;
     */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r2) {
        /*
        r1 = this;
        r0 = "event";
        defpackage.akcr.b(r2, r0);
        r0 = r1.shouldDispatchTouchEvent;
        if (r0 == 0) goto L_0x0022;
    L_0x0009:
        r0 = r2.getActionMasked();
        if (r0 != 0) goto L_0x0022;
    L_0x000f:
        r0 = r1.shouldDispatchTouchEvent;
        if (r0 != 0) goto L_0x0016;
    L_0x0013:
        defpackage.akcr.a();
    L_0x0016:
        r0 = r0.invoke(r2);
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x002a;
    L_0x0022:
        r2 = super.dispatchTouchEvent(r2);
        if (r2 == 0) goto L_0x002a;
    L_0x0028:
        r2 = 1;
        return r2;
    L_0x002a:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.multisnap.TrimmingHandleImageView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final akbl<MotionEvent, Boolean> getShouldDispatchTouchEvent() {
        return this.shouldDispatchTouchEvent;
    }

    public final void setShouldDispatchTouchEvent(akbl<? super MotionEvent, Boolean> akbl) {
        this.shouldDispatchTouchEvent = akbl;
    }
}
