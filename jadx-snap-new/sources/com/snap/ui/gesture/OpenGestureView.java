package com.snap.ui.gesture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewGroup;
import com.snapchat.android.framework.ui.views.openlayout.OpenLayout;
import defpackage.abvp;
import defpackage.zkl;
import java.util.LinkedHashSet;

public class OpenGestureView extends OpenLayout {
    final zkl a = new zkl();
    final LinkedHashSet<GestureDetector> b = new LinkedHashSet();
    final LinkedHashSet<ScaleGestureDetector> c = new LinkedHashSet();
    private final abvp d = new abvp() {
        public final boolean a(MotionEvent motionEvent) {
            return false;
        }

        public final boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
            return false;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:58:0x0166 in {9, 10, 11, 19, 24, 27, 28, 29, 36, 39, 40, 41, 44, 45, 46, 50, 54, 55, 57} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final boolean b(android.view.ViewGroup r9, android.view.MotionEvent r10) {
            /*
            r8 = this;
            r9 = com.snap.ui.gesture.OpenGestureView.this;
            r9 = r9.a;
            if (r10 == 0) goto L_0x015e;
            r0 = r10.getX();
            r1 = r9.j;
            r0 = r0 - r1;
            r1 = r10.getY();
            r2 = r9.i;
            r1 = r1 - r2;
            r2 = java.lang.System.currentTimeMillis();
            r4 = r9.h;
            r2 = r2 - r4;
            r4 = r9.n;
            r5 = r9.g;
            r4.removeCallbacks(r5);
            r4 = 0;
            r9.g = r4;
            r5 = r10.getAction();
            r6 = 0;
            r7 = 1;
            if (r5 == 0) goto L_0x00de;
            if (r5 == r7) goto L_0x00ad;
            r2 = 2;
            if (r5 == r2) goto L_0x0057;
            r0 = 3;
            if (r5 == r0) goto L_0x0037;
            goto L_0x0121;
            r0 = r9.n;
            r1 = r9.f;
            r0.removeCallbacks(r1);
            r9.f = r4;
            r0 = r9.n;
            r1 = r9.e;
            r0.removeCallbacks(r1);
            r9.e = r4;
            r0 = r9.n;
            r1 = r9.g;
            r0.removeCallbacks(r1);
            r9.g = r4;
            r9.a();
            goto L_0x0121;
            r0 = java.lang.Math.abs(r0);
            r2 = r9.c;
            r2 = (float) r2;
            r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
            if (r0 > 0) goto L_0x0075;
            r0 = java.lang.Math.abs(r1);
            r1 = r9.c;
            r1 = (float) r1;
            r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
            if (r0 > 0) goto L_0x0075;
            r0 = r9.k;
            if (r0 != 0) goto L_0x0075;
            r0 = r9.l;
            if (r0 == 0) goto L_0x0121;
            r0 = r9.f;
            if (r0 != 0) goto L_0x007f;
            r0 = r9.l;
            if (r0 != 0) goto L_0x007f;
            r9.k = r7;
            r0 = r9.n;
            r1 = r9.e;
            r0.removeCallbacks(r1);
            r9.e = r4;
            r0 = r9.n;
            r1 = r9.f;
            r0.removeCallbacks(r1);
            r9.f = r4;
            r0 = r9.n;
            r1 = r9.g;
            r0.removeCallbacks(r1);
            r9.g = r4;
            r9.l = r7;
            r0 = r9.k;
            if (r0 == 0) goto L_0x00a8;
            r9.m = r6;
            r0 = defpackage.zkl.a.b;
            r9.a(r0);
            goto L_0x0121;
            r9.m = r6;
            r0 = defpackage.zkl.a.c;
            goto L_0x00a4;
            r0 = r9.b;
            r0 = (long) r0;
            r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
            if (r4 > 0) goto L_0x0052;
            r0 = r9.l;
            if (r0 != 0) goto L_0x0052;
            r0 = r9.k;
            if (r0 == 0) goto L_0x00bd;
            goto L_0x0052;
            r0 = r9.m;
            if (r0 != 0) goto L_0x00c4;
            r0 = defpackage.zkl.a.f;
            goto L_0x00cb;
            r1 = defpackage.zkl.a.g;
            r0 = r0 + r7;
            r0 = r1.a(r0);
            r9.a(r0);
            r0 = new zkl$3;
            r0.<init>(r10);
            r9.e = r0;
            r0 = r9.n;
            r1 = r9.e;
            r4 = r9.b;
            r4 = (long) r4;
            r4 = r4 - r2;
            goto L_0x0119;
            r9.k = r6;
            r9.l = r6;
            r0 = r9.e;
            if (r0 == 0) goto L_0x00f4;
            r0 = r9.m;
            r0 = r0 + r7;
            r9.m = r0;
            r0 = r9.n;
            r1 = r9.e;
            r0.removeCallbacks(r1);
            r9.e = r4;
            r0 = r9.n;
            r1 = r9.f;
            r0.removeCallbacks(r1);
            r0 = new zkl$1;
            r0.<init>(r10);
            r9.f = r0;
            r0 = r9.n;
            r1 = r9.f;
            r4 = r9.a;
            r4 = (long) r4;
            r0.postDelayed(r1, r4);
            r0 = new zkl$2;
            r0.<init>(r10);
            r9.g = r0;
            r0 = r9.n;
            r1 = r9.g;
            r4 = r9.d;
            r0.postDelayed(r1, r4);
            r0 = r9.h;
            r0 = r0 + r2;
            r9.h = r0;
            r0 = r10.getX();
            r9.j = r0;
            r0 = r10.getY();
            r9.i = r0;
            r9 = com.snap.ui.gesture.OpenGestureView.this;
            r9 = r9.b;
            r9 = r9.iterator();
            r0 = r9.hasNext();
            if (r0 == 0) goto L_0x0145;
            r0 = r9.next();
            r0 = (android.view.GestureDetector) r0;
            r0.onTouchEvent(r10);
            goto L_0x0135;
            r9 = com.snap.ui.gesture.OpenGestureView.this;
            r9 = r9.c;
            r9 = r9.iterator();
            r0 = r9.hasNext();
            if (r0 == 0) goto L_0x015d;
            r0 = r9.next();
            r0 = (android.view.ScaleGestureDetector) r0;
            r0.onTouchEvent(r10);
            goto L_0x014d;
            return r7;
            r9 = new java.lang.IllegalArgumentException;
            r10 = "motionEvent == null";
            r9.<init>(r10);
            throw r9;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.gesture.OpenGestureView$AnonymousClass1.b(android.view.ViewGroup, android.view.MotionEvent):boolean");
        }
    };

    public OpenGestureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(this.d);
    }
}
