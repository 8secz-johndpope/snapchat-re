package com.snap.messaging.chat.features.input;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import defpackage.akcr;
import defpackage.jo;
import defpackage.pxq;

public final class ChatInputLayout extends LinearLayout {
    public jo a;

    public static final class a extends SimpleOnGestureListener {
        private final float a;
        private final InputBarEditText b;
        private final pxq c;

        public a(Context context, InputBarEditText inputBarEditText, pxq pxq) {
            akcr.b(context, "context");
            akcr.b(inputBarEditText, "inputEditText");
            akcr.b(pxq, "orchestrator");
            this.b = inputBarEditText;
            this.c = pxq;
            Object obj = ViewConfiguration.get(context);
            String str = "ViewConfiguration.get(context)";
            akcr.a(obj, str);
            int scaledMaximumFlingVelocity = obj.getScaledMaximumFlingVelocity();
            Object obj2 = ViewConfiguration.get(context);
            akcr.a(obj2, str);
            int scaledMinimumFlingVelocity = obj2.getScaledMinimumFlingVelocity();
            this.a = (((float) (scaledMaximumFlingVelocity - scaledMinimumFlingVelocity)) * 0.2f) + ((float) scaledMinimumFlingVelocity);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
        public final boolean onFling(android.view.MotionEvent r6, android.view.MotionEvent r7, float r8, float r9) {
            /*
            r5 = this;
            r7 = r5.a;
            r8 = 0;
            r0 = 1;
            r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
            if (r7 <= 0) goto L_0x006a;
        L_0x0008:
            if (r6 == 0) goto L_0x005f;
        L_0x000a:
            r7 = r5.b;
            r7 = r7.getLineCount();
            r1 = r5.b;
            r1 = r1.getMaxLines();
            if (r7 <= r1) goto L_0x001a;
        L_0x0018:
            r7 = 1;
            goto L_0x001b;
        L_0x001a:
            r7 = 0;
        L_0x001b:
            if (r7 == 0) goto L_0x005f;
        L_0x001d:
            r7 = 2;
            r7 = new int[r7];
            r1 = r5.b;
            r1.getLocationOnScreen(r7);
            r1 = r7[r8];
            r2 = new akdy;
            r3 = r7[r8];
            r4 = r5.b;
            r4 = r4.getWidth();
            r3 = r3 + r4;
            r2.<init>(r1, r3);
            r2 = (defpackage.akdv) r2;
            r1 = r6.getRawX();
            r1 = defpackage.akef.a(r2, r1);
            if (r1 == 0) goto L_0x005f;
        L_0x0041:
            r1 = r7[r0];
            r2 = new akdy;
            r7 = r7[r0];
            r3 = r5.b;
            r3 = r3.getHeight();
            r7 = r7 + r3;
            r2.<init>(r1, r7);
            r2 = (defpackage.akdv) r2;
            r6 = r6.getRawY();
            r6 = defpackage.akef.a(r2, r6);
            if (r6 == 0) goto L_0x005f;
        L_0x005d:
            r6 = 1;
            goto L_0x0060;
        L_0x005f:
            r6 = 0;
        L_0x0060:
            if (r6 != 0) goto L_0x006a;
        L_0x0062:
            r6 = r5.c;
            r7 = defpackage.pzj.COLLAPSED;
        L_0x0066:
            r6.a(r7, true);
            return r0;
        L_0x006a:
            r6 = r5.a;
            r6 = -r6;
            r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1));
            if (r6 >= 0) goto L_0x0085;
        L_0x0071:
            r6 = r5.c;
            r6 = r6.d();
            r7 = defpackage.pzj.COLLAPSED;
            if (r6 != r7) goto L_0x0085;
        L_0x007b:
            r6 = r5.c;
            r6.e();
            r6 = r5.c;
            r7 = defpackage.pzj.NORMAL;
            goto L_0x0066;
        L_0x0085:
            return r8;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.chat.features.input.ChatInputLayout$a.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
        }
    }

    public ChatInputLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jo joVar = this.a;
        return (joVar != null ? joVar.a(motionEvent) : false) || super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jo joVar = this.a;
        if (joVar != null) {
            joVar.a(motionEvent);
        }
        return true;
    }
}
