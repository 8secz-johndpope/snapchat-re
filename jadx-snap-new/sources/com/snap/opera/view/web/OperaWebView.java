package com.snap.opera.view.web;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebViewClient;
import com.snapchat.android.framework.ui.views.ScWebView;
import defpackage.abtp;
import defpackage.tdy;
import defpackage.tdy.a;
import java.util.ArrayList;
import java.util.List;

public class OperaWebView extends ScWebView implements tdy {
    public boolean a = false;
    private long c = 0;
    private float d = -1.0f;
    private float e = -1.0f;
    private boolean f = true;
    private final List<a> g = new ArrayList();
    private float h;

    public OperaWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = (float) ((int) abtp.a(5.0f, context));
    }

    public final void a(a aVar) {
        this.g.add(aVar);
    }

    public final void a(boolean z, boolean z2) {
        this.f = z;
        if (this.f && z2) {
            this.h = 5.0f;
        }
    }

    public boolean canScrollHorizontally(int i) {
        return this.a ? true : super.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.a ? true : super.canScrollVertically(i);
    }

    public void destroy() {
        super.destroy();
    }

    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        requestDisallowInterceptTouchEvent(this.a);
        super.onOverScrolled(i, i2, z, z2);
    }

    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        for (i = this.g.size() - 1; i >= 0; i--) {
            ((a) this.g.get(i)).a(i2);
        }
    }

    /* JADX WARNING: Missing block: B:8:0x0028, code skipped:
            if (r7.getActionMasked() == 0) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:19:0x005a, code skipped:
            if (r2 != null) goto L_0x002a;
     */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        r6 = this;
        r0 = r7.getDownTime();
        r2 = r7.getActionMasked();
        r3 = 2;
        if (r2 != r3) goto L_0x001f;
    L_0x000b:
        r4 = r6.c;
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r2 == 0) goto L_0x001f;
    L_0x0011:
        r2 = r7.getX();
        r6.d = r2;
        r2 = r7.getY();
        r6.e = r2;
        r6.c = r0;
    L_0x001f:
        r0 = r6.a;
        r1 = 1;
        if (r0 == 0) goto L_0x002e;
    L_0x0024:
        r0 = r7.getActionMasked();
        if (r0 != 0) goto L_0x005d;
    L_0x002a:
        r6.requestDisallowInterceptTouchEvent(r1);
        goto L_0x005d;
    L_0x002e:
        r0 = r6.f;
        if (r0 == 0) goto L_0x005d;
    L_0x0032:
        r0 = r7.getActionMasked();
        r2 = 0;
        if (r0 != r3) goto L_0x005a;
    L_0x0039:
        r0 = r7.getX();
        r3 = r6.d;
        r0 = r0 - r3;
        r0 = java.lang.Math.abs(r0);
        r3 = r7.getY();
        r4 = r6.e;
        r3 = r3 - r4;
        r3 = java.lang.Math.abs(r3);
        r4 = r6.h;
        r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x0059;
    L_0x0055:
        r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1));
        if (r0 <= 0) goto L_0x005a;
    L_0x0059:
        r2 = 1;
    L_0x005a:
        if (r2 == 0) goto L_0x005d;
    L_0x005c:
        goto L_0x002a;
    L_0x005d:
        r7 = super.onTouchEvent(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.opera.view.web.OperaWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
    }
}
