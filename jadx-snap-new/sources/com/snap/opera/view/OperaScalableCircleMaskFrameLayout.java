package com.snap.opera.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.abux;
import defpackage.akcr;
import defpackage.iia;
import defpackage.sje;

public class OperaScalableCircleMaskFrameLayout extends abux {
    public iia a;
    private sje i;
    private String j;

    public OperaScalableCircleMaskFrameLayout(Context context) {
        akcr.b(context, "context");
        super(context);
    }

    public OperaScalableCircleMaskFrameLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet, (byte) 0);
    }

    public final void a(sje sje, String str) {
        akcr.b(sje, "tracker");
        akcr.b(str, "tag");
        this.i = sje;
        this.j = str;
    }

    /* JADX WARNING: Missing block: B:13:0x00ae, code skipped:
            if (r0 == null) goto L_0x00b0;
     */
    public void dispatchDraw(android.graphics.Canvas r6) {
        /*
        r5 = this;
        super.dispatchDraw(r6);	 Catch:{ Throwable -> 0x0004 }
        return;
    L_0x0004:
        r6 = move-exception;
        r0 = r5.i;
        if (r0 == 0) goto L_0x00b0;
    L_0x0009:
        r1 = new java.lang.StringBuilder;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r5.j;
        r2.append(r3);
        r3 = "; ";
        r2.append(r3);
        r4 = r5.b;
        r2.append(r4);
        r2.append(r3);
        r4 = r5.c;
        r4 = java.lang.Math.round(r4);
        r2.append(r4);
        r2.append(r3);
        r4 = r5.d;
        r4 = java.lang.Math.round(r4);
        r2.append(r4);
        r2.append(r3);
        r4 = r5.e;
        r2.append(r4);
        r4 = 59;
        r2.append(r4);
        r4 = 32;
        r2.append(r4);
        r4 = r5.f;
        r4 = java.lang.Math.round(r4);
        r2.append(r4);
        r2.append(r3);
        r3 = r5.g;
        r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2);
        r2 = r5.h;
        r3 = " ";
        if (r2 == 0) goto L_0x007f;
    L_0x0067:
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r2 = r2.a();
        r4.append(r2);
        r2 = 46;
        r4.append(r2);
        r2 = r4.toString();
        r1.append(r2);
    L_0x007f:
        r2 = r5.a;
        if (r2 == 0) goto L_0x00a2;
    L_0x0083:
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = r2.a();
        r4.append(r3);
        r3 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r4.append(r3);
        r2 = r2.b();
        r4.append(r2);
        r2 = r4.toString();
        r1.append(r2);
    L_0x00a2:
        r1 = r1.toString();
        r2 = "resString.toString()";
        defpackage.akcr.a(r1, r2);
        r0.report(r6, r1);
        if (r0 != 0) goto L_0x00ba;
    L_0x00b0:
        r6 = defpackage.abss.a();
        r6 = r6.l();
        if (r6 != 0) goto L_0x00bb;
    L_0x00ba:
        return;
    L_0x00bb:
        r6 = new java.lang.RuntimeException;
        r0 = "ExceptionTracker was not initialized in Opera, please shake";
        r6.<init>(r0);
        r6 = (java.lang.Throwable) r6;
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.opera.view.OperaScalableCircleMaskFrameLayout.dispatchDraw(android.graphics.Canvas):void");
    }
}
