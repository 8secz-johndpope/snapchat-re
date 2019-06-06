package com.snap.composer.views.touches;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.snap.composer.logger.Logger;
import defpackage.ajxm;
import defpackage.akco;
import defpackage.akcr;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class TouchDispatcher {
    public static final Companion Companion = new Companion();
    private static boolean f;
    private final List<ComposerGestureRecognizer> a = new ArrayList();
    private final List<View> b = new ArrayList();
    private Set<View> c = new LinkedHashSet();
    private List<ComposerGestureRecognizer> d = new ArrayList();
    private final Logger e;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final boolean getDebugTouchEvents() {
            return TouchDispatcher.f;
        }

        public final boolean hitTest(View view, MotionEvent motionEvent, int[] iArr, Rect rect) {
            akcr.b(view, "view");
            akcr.b(motionEvent, "event");
            akcr.b(iArr, "outLocation");
            akcr.b(rect, "rect");
            view.getLocationOnScreen(iArr);
            rect.left = iArr[0];
            rect.top = iArr[1];
            rect.right = iArr[0] + view.getWidth();
            rect.bottom = iArr[1] + view.getHeight();
            return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }

        public final void setDebugTouchEvents(boolean z) {
            TouchDispatcher.f = z;
        }
    }

    public TouchDispatcher(Logger logger) {
        this.e = logger;
    }

    private static float a(ajxm<Float, Float> ajxm, ajxm<Float, Float> ajxm2, ajxm<Float, Float> ajxm3) {
        return Math.abs((((((Number) ajxm.a).floatValue() * (((Number) ajxm2.b).floatValue() - ((Number) ajxm3.b).floatValue())) + (((Number) ajxm2.a).floatValue() * (((Number) ajxm3.b).floatValue() - ((Number) ajxm.b).floatValue()))) + (((Number) ajxm3.a).floatValue() * (((Number) ajxm.b).floatValue() - ((Number) ajxm2.b).floatValue()))) / 2.0f);
    }

    private final void a() {
        this.b.clear();
        this.c.clear();
        b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0144  */
    /* JADX WARNING: Missing block: B:19:0x0061, code skipped:
            if (r8 > ((float) r19.getHeight())) goto L_0x0140;
     */
    /* JADX WARNING: Missing block: B:25:0x013a, code skipped:
            if ((((a(r5, r11, r13) + a(r11, r6, r13)) + a(r6, r7, r13)) + a(r7, r5, r13)) > (((r3 * r19.getScaleX()) * r9) * r19.getScaleY())) goto L_0x013f;
     */
    private final boolean a(android.view.View r19, android.view.MotionEvent r20) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r2 = r20;
        r3 = r19.isEnabled();
        r4 = " with touch ";
        r6 = 0;
        if (r3 == 0) goto L_0x0249;
    L_0x000f:
        r3 = r19.getAlpha();
        r7 = 0;
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x0249;
    L_0x0018:
        r3 = r19.getVisibility();
        r8 = 4;
        if (r3 == r8) goto L_0x0249;
    L_0x001f:
        r3 = r19.getScaleX();
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r10 = 1;
        r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r3 != 0) goto L_0x0065;
    L_0x002a:
        r3 = r19.getScaleY();
        r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r3 != 0) goto L_0x0065;
    L_0x0032:
        r3 = r19.getRotation();
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x0065;
    L_0x003b:
        r3 = r20.getX();
        r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r8 >= 0) goto L_0x0045;
    L_0x0043:
        goto L_0x0140;
    L_0x0045:
        r8 = r20.getY();
        r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1));
        if (r9 >= 0) goto L_0x004f;
    L_0x004d:
        goto L_0x0140;
    L_0x004f:
        r9 = r19.getWidth();
        r9 = (float) r9;
        r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r3 <= 0) goto L_0x005a;
    L_0x0058:
        goto L_0x0140;
    L_0x005a:
        r3 = r19.getHeight();
        r3 = (float) r3;
        r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x013d;
    L_0x0063:
        goto L_0x0140;
    L_0x0065:
        r3 = r19.getScaleX();
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x013f;
    L_0x006d:
        r3 = r19.getScaleY();
        r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1));
        if (r3 != 0) goto L_0x0077;
    L_0x0075:
        goto L_0x013f;
    L_0x0077:
        r3 = r19.getWidth();
        r3 = (float) r3;
        r9 = r19.getHeight();
        r9 = (float) r9;
        r11 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r12 = r3 / r11;
        r11 = r9 / r11;
        r13 = new ajxm;
        r14 = r20.getX();
        r14 = r14 - r12;
        r14 = java.lang.Float.valueOf(r14);
        r15 = r20.getY();
        r15 = r15 - r11;
        r15 = java.lang.Float.valueOf(r15);
        r13.<init>(r14, r15);
        r14 = 8;
        r14 = new float[r14];
        r15 = -r12;
        r14[r6] = r15;
        r7 = -r11;
        r14[r10] = r7;
        r16 = 2;
        r14[r16] = r12;
        r17 = 3;
        r14[r17] = r7;
        r14[r8] = r15;
        r7 = 5;
        r14[r7] = r11;
        r15 = 6;
        r14[r15] = r12;
        r12 = 7;
        r14[r12] = r11;
        r11 = new android.graphics.Matrix;
        r11.<init>();
        r5 = r19.getScaleX();
        r12 = r19.getScaleY();
        r11.postScale(r5, r12);
        r5 = r19.getRotation();
        r11.postRotate(r5);
        r11.mapPoints(r14);
        r5 = new ajxm;
        r11 = r14[r6];
        r11 = java.lang.Float.valueOf(r11);
        r12 = r14[r10];
        r12 = java.lang.Float.valueOf(r12);
        r5.<init>(r11, r12);
        r11 = new ajxm;
        r12 = r14[r16];
        r12 = java.lang.Float.valueOf(r12);
        r16 = r14[r17];
        r6 = java.lang.Float.valueOf(r16);
        r11.<init>(r12, r6);
        r6 = new ajxm;
        r8 = r14[r8];
        r8 = java.lang.Float.valueOf(r8);
        r7 = r14[r7];
        r7 = java.lang.Float.valueOf(r7);
        r6.<init>(r8, r7);
        r7 = new ajxm;
        r8 = r14[r15];
        r8 = java.lang.Float.valueOf(r8);
        r12 = 7;
        r12 = r14[r12];
        r12 = java.lang.Float.valueOf(r12);
        r7.<init>(r8, r12);
        r8 = a(r5, r11, r13);
        r11 = a(r11, r6, r13);
        r8 = r8 + r11;
        r6 = a(r6, r7, r13);
        r8 = r8 + r6;
        r5 = a(r7, r5, r13);
        r8 = r8 + r5;
        r5 = r19.getScaleX();
        r3 = r3 * r5;
        r3 = r3 * r9;
        r5 = r19.getScaleY();
        r3 = r3 * r5;
        r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1));
        if (r3 <= 0) goto L_0x013d;
    L_0x013c:
        goto L_0x013f;
    L_0x013d:
        r6 = 1;
        goto L_0x0140;
    L_0x013f:
        r6 = 0;
    L_0x0140:
        if (r6 != 0) goto L_0x0144;
    L_0x0142:
        goto L_0x0249;
    L_0x0144:
        r3 = f;
        if (r3 == 0) goto L_0x0181;
    L_0x0148:
        r3 = r1.e;
        if (r3 == 0) goto L_0x0181;
    L_0x014c:
        r5 = new java.lang.StringBuilder;
        r6 = "View %{view::class.java.simpleName} DID hit ";
        r5.<init>(r6);
        r6 = r19.getWidth();
        r5.append(r6);
        r6 = 47;
        r5.append(r6);
        r7 = r19.getHeight();
        r5.append(r7);
        r5.append(r4);
        r4 = r20.getX();
        r5.append(r4);
        r5.append(r6);
        r4 = r20.getY();
        r5.append(r4);
        r4 = r5.toString();
        com.snap.composer.utils.LoggerUtilsKt.debug(r3, r4);
    L_0x0181:
        r3 = r0 instanceof android.view.ViewGroup;
        if (r3 == 0) goto L_0x01eb;
    L_0x0185:
        r3 = r0;
        r3 = (android.view.ViewGroup) r3;
        r4 = r3.getChildCount();
        r4 = r4 - r10;
    L_0x018d:
        if (r4 < 0) goto L_0x01eb;
    L_0x018f:
        r5 = r3.getChildAt(r4);
        if (r5 == 0) goto L_0x01e8;
    L_0x0195:
        r6 = r20.getX();
        r7 = r20.getY();
        r8 = r5;
        r9 = 0;
        r11 = 0;
    L_0x01a0:
        if (r8 == 0) goto L_0x01cc;
    L_0x01a2:
        if (r8 == r0) goto L_0x01cc;
    L_0x01a4:
        r12 = r8.getX();
        r9 = r9 - r12;
        r12 = r8.getY();
        r11 = r11 - r12;
        r8 = r8.getParent();
        r12 = r8 instanceof android.view.View;
        if (r12 != 0) goto L_0x01b7;
    L_0x01b6:
        r8 = 0;
    L_0x01b7:
        r8 = (android.view.View) r8;
        if (r8 == 0) goto L_0x01a0;
    L_0x01bb:
        r12 = r8.getScrollX();
        if (r12 == 0) goto L_0x01c3;
    L_0x01c1:
        r12 = (float) r12;
        r9 = r9 + r12;
    L_0x01c3:
        r12 = r8.getScrollY();
        if (r12 == 0) goto L_0x01a0;
    L_0x01c9:
        r12 = (float) r12;
        r11 = r11 + r12;
        goto L_0x01a0;
    L_0x01cc:
        if (r8 != 0) goto L_0x01d3;
    L_0x01ce:
        r5 = r1.a(r5, r2);
        goto L_0x01df;
    L_0x01d3:
        r9 = r9 + r6;
        r11 = r11 + r7;
        r2.setLocation(r9, r11);
        r5 = r1.a(r5, r2);	 Catch:{ all -> 0x01e2 }
        r2.setLocation(r6, r7);
    L_0x01df:
        if (r5 != 0) goto L_0x01eb;
    L_0x01e1:
        goto L_0x01e8;
    L_0x01e2:
        r0 = move-exception;
        r3 = r0;
        r2.setLocation(r6, r7);
        throw r3;
    L_0x01e8:
        r4 = r4 + -1;
        goto L_0x018d;
    L_0x01eb:
        r2 = r0 instanceof com.snap.composer.views.ComposerTouchTarget;
        if (r2 == 0) goto L_0x0201;
    L_0x01ef:
        r2 = f;
        if (r2 == 0) goto L_0x01fc;
    L_0x01f3:
        r2 = r1.e;
        if (r2 == 0) goto L_0x01fc;
    L_0x01f7:
        r3 = "Composer touch target %{view::class.java.simpleName} wants to handle touch event";
        com.snap.composer.utils.LoggerUtilsKt.debug(r2, r3);
    L_0x01fc:
        r2 = r1.b;
        r2.add(r0);
    L_0x0201:
        r2 = com.snap.composer.extensions.ViewUtils.INSTANCE;
        r3 = 0;
        r0 = r2.getGestureRecognizers(r0, r3);
        if (r0 != 0) goto L_0x020b;
    L_0x020a:
        return r10;
    L_0x020b:
        r0 = r0.getGestureRecognizers();
        r0 = (java.lang.Iterable) r0;
        r0 = r0.iterator();
    L_0x0215:
        r2 = r0.hasNext();
        if (r2 == 0) goto L_0x0248;
    L_0x021b:
        r2 = r0.next();
        r2 = (com.snap.composer.views.touches.ComposerGestureRecognizer) r2;
        r3 = f;
        if (r3 == 0) goto L_0x0242;
    L_0x0225:
        r3 = r1.e;
        if (r3 == 0) goto L_0x0242;
    L_0x0229:
        r4 = new java.lang.StringBuilder;
        r5 = "Adding candidate gesture recognizer ";
        r4.<init>(r5);
        r5 = r2.getClass();
        r5 = r5.getSimpleName();
        r4.append(r5);
        r4 = r4.toString();
        com.snap.composer.utils.LoggerUtilsKt.debug(r3, r4);
    L_0x0242:
        r3 = r1.a;
        r3.add(r2);
        goto L_0x0215;
    L_0x0248:
        return r10;
    L_0x0249:
        r3 = f;
        if (r3 == 0) goto L_0x0286;
    L_0x024d:
        r3 = r1.e;
        if (r3 == 0) goto L_0x0286;
    L_0x0251:
        r5 = new java.lang.StringBuilder;
        r6 = "View %{view::class.java.simpleName} did NOT hit ";
        r5.<init>(r6);
        r6 = r19.getWidth();
        r5.append(r6);
        r6 = 47;
        r5.append(r6);
        r0 = r19.getHeight();
        r5.append(r0);
        r5.append(r4);
        r0 = r20.getX();
        r5.append(r0);
        r5.append(r6);
        r0 = r20.getY();
        r5.append(r0);
        r0 = r5.toString();
        com.snap.composer.utils.LoggerUtilsKt.debug(r3, r0);
    L_0x0286:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.views.touches.TouchDispatcher.a(android.view.View, android.view.MotionEvent):boolean");
    }

    private static boolean a(ComposerGestureRecognizer composerGestureRecognizer, ComposerGestureRecognizer composerGestureRecognizer2) {
        return composerGestureRecognizer.canRecognizeSimultaneously(composerGestureRecognizer2) || composerGestureRecognizer2.canRecognizeSimultaneously(composerGestureRecognizer);
    }

    private final void b() {
        for (ComposerGestureRecognizer cancel : this.a) {
            cancel.cancel();
        }
        this.a.clear();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:195:0x0329 in {2, 3, 8, 9, 15, 21, 25, 33, 36, 37, 43, 48, 51, 53, 64, 65, 67, 68, 69, 71, 73, 78, 81, 82, 86, 94, 100, 105, 108, 114, 115, 120, 127, 130, 133, 134, 137, 144, 145, 155, 158, 164, 165, 177, 178, 179, 185, 186, 187, 189, 190, 193, 194} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final boolean dispatchTouch(android.view.View r19, android.view.MotionEvent r20) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r2 = r20;
        r3 = "rootView";
        defpackage.akcr.b(r0, r3);
        r3 = "event";
        defpackage.akcr.b(r2, r3);
        r3 = r20.getActionMasked();
        r5 = 1;
        if (r3 != 0) goto L_0x0019;
        r3 = 1;
        goto L_0x001a;
        r3 = 0;
        r6 = r20.getActionMasked();
        if (r6 == r5) goto L_0x0025;
        r7 = 3;
        if (r6 == r7) goto L_0x0025;
        r6 = 0;
        goto L_0x0026;
        r6 = 1;
        r7 = f;
        if (r7 == 0) goto L_0x0035;
        if (r3 == 0) goto L_0x0035;
        r3 = r1.e;
        if (r3 == 0) goto L_0x0035;
        r7 = "Composer root view received touch down event";
        com.snap.composer.utils.LoggerUtilsKt.debug(r3, r7);
        r3 = f;
        if (r3 == 0) goto L_0x0044;
        if (r6 == 0) goto L_0x0044;
        r3 = r1.e;
        if (r3 == 0) goto L_0x0044;
        r7 = "Composer root view received touch up event";
        com.snap.composer.utils.LoggerUtilsKt.debug(r3, r7);
        r3 = r20.getActionMasked();	 Catch:{ all -> 0x0322 }
        if (r3 != 0) goto L_0x0050;	 Catch:{ all -> 0x0322 }
        r18.a();	 Catch:{ all -> 0x0322 }
        r18.a(r19, r20);	 Catch:{ all -> 0x0322 }
        r3 = r1.b;	 Catch:{ all -> 0x0322 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0322 }
        r7 = r3.hasNext();	 Catch:{ all -> 0x0322 }
        r8 = 0;	 Catch:{ all -> 0x0322 }
        r9 = 0;	 Catch:{ all -> 0x0322 }
        if (r7 == 0) goto L_0x0135;	 Catch:{ all -> 0x0322 }
        r7 = r3.next();	 Catch:{ all -> 0x0322 }
        r7 = (android.view.View) r7;	 Catch:{ all -> 0x0322 }
        r10 = r7 instanceof com.snap.composer.views.ComposerTouchTarget;	 Catch:{ all -> 0x0322 }
        if (r10 == 0) goto L_0x0056;	 Catch:{ all -> 0x0322 }
        r10 = r7;	 Catch:{ all -> 0x0322 }
        r10 = (com.snap.composer.views.ComposerTouchTarget) r10;	 Catch:{ all -> 0x0322 }
        r10 = r10.canHandleTouchEvents();	 Catch:{ all -> 0x0322 }
        if (r10 != 0) goto L_0x0072;	 Catch:{ all -> 0x0322 }
        goto L_0x0056;	 Catch:{ all -> 0x0322 }
        r10 = r20.getX();	 Catch:{ all -> 0x0322 }
        r11 = r20.getY();	 Catch:{ all -> 0x0322 }
        r12 = r7 instanceof android.view.View;	 Catch:{ all -> 0x0322 }
        if (r12 != 0) goto L_0x0080;	 Catch:{ all -> 0x0322 }
        r12 = r8;	 Catch:{ all -> 0x0322 }
        goto L_0x0081;	 Catch:{ all -> 0x0322 }
        r12 = r7;	 Catch:{ all -> 0x0322 }
        r13 = 0;	 Catch:{ all -> 0x0322 }
        if (r12 == 0) goto L_0x00ae;	 Catch:{ all -> 0x0322 }
        if (r12 == r0) goto L_0x00ae;	 Catch:{ all -> 0x0322 }
        r14 = r12.getX();	 Catch:{ all -> 0x0322 }
        r9 = r9 - r14;	 Catch:{ all -> 0x0322 }
        r14 = r12.getY();	 Catch:{ all -> 0x0322 }
        r13 = r13 - r14;	 Catch:{ all -> 0x0322 }
        r12 = r12.getParent();	 Catch:{ all -> 0x0322 }
        r14 = r12 instanceof android.view.View;	 Catch:{ all -> 0x0322 }
        if (r14 != 0) goto L_0x0099;	 Catch:{ all -> 0x0322 }
        r12 = r8;	 Catch:{ all -> 0x0322 }
        r12 = (android.view.View) r12;	 Catch:{ all -> 0x0322 }
        if (r12 == 0) goto L_0x0082;	 Catch:{ all -> 0x0322 }
        r14 = r12.getScrollX();	 Catch:{ all -> 0x0322 }
        if (r14 == 0) goto L_0x00a5;	 Catch:{ all -> 0x0322 }
        r14 = (float) r14;	 Catch:{ all -> 0x0322 }
        r9 = r9 + r14;	 Catch:{ all -> 0x0322 }
        r14 = r12.getScrollY();	 Catch:{ all -> 0x0322 }
        if (r14 == 0) goto L_0x0082;	 Catch:{ all -> 0x0322 }
        r14 = (float) r14;	 Catch:{ all -> 0x0322 }
        r13 = r13 + r14;	 Catch:{ all -> 0x0322 }
        goto L_0x0082;	 Catch:{ all -> 0x0322 }
        if (r12 != 0) goto L_0x00b3;	 Catch:{ all -> 0x0322 }
        r8 = 0;	 Catch:{ all -> 0x0322 }
        r9 = 0;	 Catch:{ all -> 0x0322 }
        goto L_0x00fd;	 Catch:{ all -> 0x0322 }
        r9 = r9 + r10;	 Catch:{ all -> 0x0322 }
        r13 = r13 + r11;	 Catch:{ all -> 0x0322 }
        r2.setLocation(r9, r13);	 Catch:{ all -> 0x0322 }
        r8 = r7 instanceof android.view.ViewGroup;	 Catch:{ all -> 0x0130 }
        if (r8 == 0) goto L_0x00f5;	 Catch:{ all -> 0x0130 }
        r8 = r7;	 Catch:{ all -> 0x0130 }
        r8 = (com.snap.composer.views.ComposerTouchTarget) r8;	 Catch:{ all -> 0x0130 }
        r8 = r8.requiresInterceptBeforeHandlingTouchEvents();	 Catch:{ all -> 0x0130 }
        if (r8 == 0) goto L_0x00f5;	 Catch:{ all -> 0x0130 }
        r8 = r18.c;	 Catch:{ all -> 0x0130 }
        r8 = r8.contains(r7);	 Catch:{ all -> 0x0130 }
        if (r8 != 0) goto L_0x00f0;	 Catch:{ all -> 0x0130 }
        r9 = r7;	 Catch:{ all -> 0x0130 }
        r9 = (android.view.ViewGroup) r9;	 Catch:{ all -> 0x0130 }
        r9 = r9.onInterceptTouchEvent(r2);	 Catch:{ all -> 0x0130 }
        if (r9 == 0) goto L_0x00f0;	 Catch:{ all -> 0x0130 }
        r8 = r18.c;	 Catch:{ all -> 0x0130 }
        r8.add(r7);	 Catch:{ all -> 0x0130 }
        r8 = r18.b;	 Catch:{ all -> 0x0130 }
        r8.clear();	 Catch:{ all -> 0x0130 }
        r8 = r18.b;	 Catch:{ all -> 0x0130 }
        r8.add(r7);	 Catch:{ all -> 0x0130 }
        r8 = 1;	 Catch:{ all -> 0x0130 }
        r9 = 1;	 Catch:{ all -> 0x0130 }
        goto L_0x00f1;	 Catch:{ all -> 0x0130 }
        r9 = 0;	 Catch:{ all -> 0x0130 }
        if (r8 != 0) goto L_0x00f6;	 Catch:{ all -> 0x0130 }
        r8 = 0;	 Catch:{ all -> 0x0130 }
        goto L_0x00fa;	 Catch:{ all -> 0x0130 }
        r9 = 0;	 Catch:{ all -> 0x0130 }
        r8 = r7.dispatchTouchEvent(r2);	 Catch:{ all -> 0x0130 }
        r2.setLocation(r10, r11);	 Catch:{ all -> 0x0322 }
        if (r8 != 0) goto L_0x0101;	 Catch:{ all -> 0x0322 }
        if (r9 == 0) goto L_0x0056;	 Catch:{ all -> 0x0322 }
        r0 = f;	 Catch:{ all -> 0x0322 }
        if (r0 == 0) goto L_0x0127;	 Catch:{ all -> 0x0322 }
        r0 = r1.e;	 Catch:{ all -> 0x0322 }
        if (r0 == 0) goto L_0x0127;	 Catch:{ all -> 0x0322 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0322 }
        r3 = "View ";	 Catch:{ all -> 0x0322 }
        r2.<init>(r3);	 Catch:{ all -> 0x0322 }
        r3 = r7.getClass();	 Catch:{ all -> 0x0322 }
        r3 = r3.getSimpleName();	 Catch:{ all -> 0x0322 }
        r2.append(r3);	 Catch:{ all -> 0x0322 }
        r3 = " intercepted touch event, cancelling gesture recognizers";	 Catch:{ all -> 0x0322 }
        r2.append(r3);	 Catch:{ all -> 0x0322 }
        r2 = r2.toString();	 Catch:{ all -> 0x0322 }
        com.snap.composer.utils.LoggerUtilsKt.debug(r0, r2);	 Catch:{ all -> 0x0322 }
        r18.b();	 Catch:{ all -> 0x0322 }
        if (r6 == 0) goto L_0x012f;
        r18.a();
        return r5;
        r0 = move-exception;
        r2.setLocation(r10, r11);	 Catch:{ all -> 0x0322 }
        throw r0;	 Catch:{ all -> 0x0322 }
        r3 = 0;	 Catch:{ all -> 0x0322 }
        r7 = r1.a;	 Catch:{ all -> 0x0322 }
        r7 = r7.size();	 Catch:{ all -> 0x0322 }
        r10 = "Cancelling ";
        if (r3 >= r7) goto L_0x0225;
        r7 = r1.a;	 Catch:{ all -> 0x0322 }
        r7 = r7.get(r3);	 Catch:{ all -> 0x0322 }
        r7 = (com.snap.composer.views.touches.ComposerGestureRecognizer) r7;	 Catch:{ all -> 0x0322 }
        r11 = r7.getState();	 Catch:{ all -> 0x0322 }
        r12 = r7.getView();	 Catch:{ all -> 0x0322 }
        r13 = r20.getX();	 Catch:{ all -> 0x0322 }
        r14 = r20.getY();	 Catch:{ all -> 0x0322 }
        r15 = r12 instanceof android.view.View;	 Catch:{ all -> 0x0322 }
        if (r15 != 0) goto L_0x015d;	 Catch:{ all -> 0x0322 }
        r12 = r8;	 Catch:{ all -> 0x0322 }
        r15 = 0;	 Catch:{ all -> 0x0322 }
        r16 = 0;	 Catch:{ all -> 0x0322 }
        if (r12 == 0) goto L_0x018f;	 Catch:{ all -> 0x0322 }
        if (r12 == r0) goto L_0x018f;	 Catch:{ all -> 0x0322 }
        r17 = r12.getX();	 Catch:{ all -> 0x0322 }
        r15 = r15 - r17;	 Catch:{ all -> 0x0322 }
        r17 = r12.getY();	 Catch:{ all -> 0x0322 }
        r16 = r16 - r17;	 Catch:{ all -> 0x0322 }
        r12 = r12.getParent();	 Catch:{ all -> 0x0322 }
        r4 = r12 instanceof android.view.View;	 Catch:{ all -> 0x0322 }
        if (r4 != 0) goto L_0x0179;	 Catch:{ all -> 0x0322 }
        r12 = r8;	 Catch:{ all -> 0x0322 }
        r12 = (android.view.View) r12;	 Catch:{ all -> 0x0322 }
        if (r12 == 0) goto L_0x0160;	 Catch:{ all -> 0x0322 }
        r4 = r12.getScrollX();	 Catch:{ all -> 0x0322 }
        if (r4 == 0) goto L_0x0185;	 Catch:{ all -> 0x0322 }
        r4 = (float) r4;	 Catch:{ all -> 0x0322 }
        r15 = r15 + r4;	 Catch:{ all -> 0x0322 }
        r4 = r12.getScrollY();	 Catch:{ all -> 0x0322 }
        if (r4 == 0) goto L_0x0160;	 Catch:{ all -> 0x0322 }
        r4 = (float) r4;	 Catch:{ all -> 0x0322 }
        r16 = r16 + r4;	 Catch:{ all -> 0x0322 }
        goto L_0x0160;	 Catch:{ all -> 0x0322 }
        if (r12 != 0) goto L_0x01bf;	 Catch:{ all -> 0x0322 }
        r4 = Companion;	 Catch:{ all -> 0x0322 }
        r4 = r4.getDebugTouchEvents();	 Catch:{ all -> 0x0322 }
        if (r4 == 0) goto L_0x01bb;	 Catch:{ all -> 0x0322 }
        r4 = r18.getLogger();	 Catch:{ all -> 0x0322 }
        if (r4 == 0) goto L_0x01bb;	 Catch:{ all -> 0x0322 }
        r12 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0322 }
        r12.<init>(r10);	 Catch:{ all -> 0x0322 }
        r10 = r7.getClass();	 Catch:{ all -> 0x0322 }
        r10 = r10.getSimpleName();	 Catch:{ all -> 0x0322 }
        r12.append(r10);	 Catch:{ all -> 0x0322 }
        r10 = " since its not part of the same hierarchy anymore.";	 Catch:{ all -> 0x0322 }
        r12.append(r10);	 Catch:{ all -> 0x0322 }
        r10 = r12.toString();	 Catch:{ all -> 0x0322 }
        com.snap.composer.utils.LoggerUtilsKt.debug(r4, r10);	 Catch:{ all -> 0x0322 }
        r7.cancel();	 Catch:{ all -> 0x0322 }
        goto L_0x01cb;	 Catch:{ all -> 0x0322 }
        r15 = r15 + r13;	 Catch:{ all -> 0x0322 }
        r4 = r14 + r16;	 Catch:{ all -> 0x0322 }
        r2.setLocation(r15, r4);	 Catch:{ all -> 0x0322 }
        r7.update(r2);	 Catch:{ all -> 0x021f }
        r2.setLocation(r13, r14);	 Catch:{ all -> 0x0322 }
        r4 = f;	 Catch:{ all -> 0x0322 }
        if (r4 == 0) goto L_0x01fc;	 Catch:{ all -> 0x0322 }
        r4 = r7.getState();	 Catch:{ all -> 0x0322 }
        if (r11 == r4) goto L_0x01fc;	 Catch:{ all -> 0x0322 }
        r4 = r1.e;	 Catch:{ all -> 0x0322 }
        if (r4 == 0) goto L_0x01fc;	 Catch:{ all -> 0x0322 }
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0322 }
        r10.<init>();	 Catch:{ all -> 0x0322 }
        r11 = r7.getClass();	 Catch:{ all -> 0x0322 }
        r11 = r11.getSimpleName();	 Catch:{ all -> 0x0322 }
        r10.append(r11);	 Catch:{ all -> 0x0322 }
        r11 = " transitioned to state ";	 Catch:{ all -> 0x0322 }
        r10.append(r11);	 Catch:{ all -> 0x0322 }
        r11 = r7.getState();	 Catch:{ all -> 0x0322 }
        r10.append(r11);	 Catch:{ all -> 0x0322 }
        r10 = r10.toString();	 Catch:{ all -> 0x0322 }
        com.snap.composer.utils.LoggerUtilsKt.debug(r4, r10);	 Catch:{ all -> 0x0322 }
        r4 = r7.getState();	 Catch:{ all -> 0x0322 }
        r10 = com.snap.composer.views.touches.ComposerGestureRecognizerState.FAILED;	 Catch:{ all -> 0x0322 }
        if (r4 != r10) goto L_0x020f;	 Catch:{ all -> 0x0322 }
        r4 = r1.a;	 Catch:{ all -> 0x0322 }
        r4.remove(r3);	 Catch:{ all -> 0x0322 }
        r7.cancel();	 Catch:{ all -> 0x0322 }
        r3 = r3 + -1;	 Catch:{ all -> 0x0322 }
        goto L_0x021c;	 Catch:{ all -> 0x0322 }
        r4 = r7.getState();	 Catch:{ all -> 0x0322 }
        r10 = com.snap.composer.views.touches.ComposerGestureRecognizerState.BEGAN;	 Catch:{ all -> 0x0322 }
        if (r4 != r10) goto L_0x021c;	 Catch:{ all -> 0x0322 }
        r4 = r1.d;	 Catch:{ all -> 0x0322 }
        r4.add(r7);	 Catch:{ all -> 0x0322 }
        r3 = r3 + r5;	 Catch:{ all -> 0x0322 }
        goto L_0x0136;	 Catch:{ all -> 0x0322 }
        r0 = move-exception;	 Catch:{ all -> 0x0322 }
        r3 = r0;	 Catch:{ all -> 0x0322 }
        r2.setLocation(r13, r14);	 Catch:{ all -> 0x0322 }
        throw r3;	 Catch:{ all -> 0x0322 }
        r0 = r1.d;	 Catch:{ all -> 0x0322 }
        r0 = r0.size();	 Catch:{ all -> 0x0322 }
        if (r0 <= 0) goto L_0x02a9;	 Catch:{ all -> 0x0322 }
        r0 = r0 + -1;	 Catch:{ all -> 0x0322 }
        r2 = r1.d;	 Catch:{ all -> 0x0322 }
        r2 = r2.get(r0);	 Catch:{ all -> 0x0322 }
        r2 = (com.snap.composer.views.touches.ComposerGestureRecognizer) r2;	 Catch:{ all -> 0x0322 }
        r3 = r0;	 Catch:{ all -> 0x0322 }
        if (r3 <= 0) goto L_0x024c;	 Catch:{ all -> 0x0322 }
        r3 = r3 + -1;	 Catch:{ all -> 0x0322 }
        r4 = r1.d;	 Catch:{ all -> 0x0322 }
        r4 = r4.get(r3);	 Catch:{ all -> 0x0322 }
        r4 = (com.snap.composer.views.touches.ComposerGestureRecognizer) r4;	 Catch:{ all -> 0x0322 }
        r4 = a(r2, r4);	 Catch:{ all -> 0x0322 }
        if (r4 != 0) goto L_0x0238;	 Catch:{ all -> 0x0322 }
        r4 = 0;	 Catch:{ all -> 0x0322 }
        goto L_0x024d;	 Catch:{ all -> 0x0322 }
        r4 = 1;	 Catch:{ all -> 0x0322 }
        if (r4 == 0) goto L_0x027a;	 Catch:{ all -> 0x0322 }
        r3 = r1.a;	 Catch:{ all -> 0x0322 }
        r3 = r3.iterator();	 Catch:{ all -> 0x0322 }
        r7 = r3.hasNext();	 Catch:{ all -> 0x0322 }
        if (r7 == 0) goto L_0x027a;	 Catch:{ all -> 0x0322 }
        r7 = r3.next();	 Catch:{ all -> 0x0322 }
        r7 = (com.snap.composer.views.touches.ComposerGestureRecognizer) r7;	 Catch:{ all -> 0x0322 }
        if (r7 == r2) goto L_0x0255;	 Catch:{ all -> 0x0322 }
        r8 = r7.getState();	 Catch:{ all -> 0x0322 }
        r9 = com.snap.composer.views.touches.ComposerGestureRecognizerState.CHANGED;	 Catch:{ all -> 0x0322 }
        if (r8 == r9) goto L_0x0273;	 Catch:{ all -> 0x0322 }
        r8 = r7.getState();	 Catch:{ all -> 0x0322 }
        r9 = com.snap.composer.views.touches.ComposerGestureRecognizerState.ENDED;	 Catch:{ all -> 0x0322 }
        if (r8 != r9) goto L_0x0255;	 Catch:{ all -> 0x0322 }
        r7 = a(r2, r7);	 Catch:{ all -> 0x0322 }
        if (r7 != 0) goto L_0x0255;	 Catch:{ all -> 0x0322 }
        r4 = 0;	 Catch:{ all -> 0x0322 }
        if (r4 != 0) goto L_0x022b;	 Catch:{ all -> 0x0322 }
        r3 = f;	 Catch:{ all -> 0x0322 }
        if (r3 == 0) goto L_0x02a0;	 Catch:{ all -> 0x0322 }
        r3 = r1.e;	 Catch:{ all -> 0x0322 }
        if (r3 == 0) goto L_0x02a0;	 Catch:{ all -> 0x0322 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0322 }
        r4.<init>(r10);	 Catch:{ all -> 0x0322 }
        r7 = r2.getClass();	 Catch:{ all -> 0x0322 }
        r7 = r7.getSimpleName();	 Catch:{ all -> 0x0322 }
        r4.append(r7);	 Catch:{ all -> 0x0322 }
        r7 = " since it conflicted with another gesture";	 Catch:{ all -> 0x0322 }
        r4.append(r7);	 Catch:{ all -> 0x0322 }
        r4 = r4.toString();	 Catch:{ all -> 0x0322 }
        com.snap.composer.utils.LoggerUtilsKt.debug(r3, r4);	 Catch:{ all -> 0x0322 }
        r2.cancel();	 Catch:{ all -> 0x0322 }
        r3 = r1.a;	 Catch:{ all -> 0x0322 }
        r3.remove(r2);	 Catch:{ all -> 0x0322 }
        goto L_0x022b;	 Catch:{ all -> 0x0322 }
        r0 = r1.d;	 Catch:{ all -> 0x0322 }
        r0.clear();	 Catch:{ all -> 0x0322 }
        r0 = 0;	 Catch:{ all -> 0x0322 }
        r2 = r1.a;	 Catch:{ all -> 0x0322 }
        r2 = r2.size();	 Catch:{ all -> 0x0322 }
        if (r0 >= r2) goto L_0x0300;	 Catch:{ all -> 0x0322 }
        r2 = r1.a;	 Catch:{ all -> 0x0322 }
        r2 = r2.get(r0);	 Catch:{ all -> 0x0322 }
        r2 = (com.snap.composer.views.touches.ComposerGestureRecognizer) r2;	 Catch:{ all -> 0x0322 }
        r3 = r2.isActive();	 Catch:{ all -> 0x0322 }
        if (r3 == 0) goto L_0x02fe;	 Catch:{ all -> 0x0322 }
        r2.process();	 Catch:{ all -> 0x0322 }
        r3 = r2.getState();	 Catch:{ all -> 0x0322 }
        r4 = com.snap.composer.views.touches.ComposerGestureRecognizerState.ENDED;	 Catch:{ all -> 0x0322 }
        if (r3 != r4) goto L_0x02fe;	 Catch:{ all -> 0x0322 }
        r3 = f;	 Catch:{ all -> 0x0322 }
        if (r3 == 0) goto L_0x02f4;	 Catch:{ all -> 0x0322 }
        r3 = r1.e;	 Catch:{ all -> 0x0322 }
        if (r3 == 0) goto L_0x02f4;	 Catch:{ all -> 0x0322 }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0322 }
        r4.<init>();	 Catch:{ all -> 0x0322 }
        r7 = r2.getClass();	 Catch:{ all -> 0x0322 }
        r7 = r7.getSimpleName();	 Catch:{ all -> 0x0322 }
        r4.append(r7);	 Catch:{ all -> 0x0322 }
        r7 = " ended";	 Catch:{ all -> 0x0322 }
        r4.append(r7);	 Catch:{ all -> 0x0322 }
        r4 = r4.toString();	 Catch:{ all -> 0x0322 }
        com.snap.composer.utils.LoggerUtilsKt.debug(r3, r4);	 Catch:{ all -> 0x0322 }
        r2.cancel();	 Catch:{ all -> 0x0322 }
        r2 = r1.a;	 Catch:{ all -> 0x0322 }
        r2.remove(r0);	 Catch:{ all -> 0x0322 }
        r0 = r0 + -1;	 Catch:{ all -> 0x0322 }
        r0 = r0 + r5;	 Catch:{ all -> 0x0322 }
        goto L_0x02af;	 Catch:{ all -> 0x0322 }
        r0 = r1.a;	 Catch:{ all -> 0x0322 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0322 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0322 }
        r0 = r0 ^ r5;	 Catch:{ all -> 0x0322 }
        if (r0 != 0) goto L_0x031a;	 Catch:{ all -> 0x0322 }
        r0 = r1.b;	 Catch:{ all -> 0x0322 }
        r0 = (java.util.Collection) r0;	 Catch:{ all -> 0x0322 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0322 }
        r0 = r0 ^ r5;
        if (r0 == 0) goto L_0x0317;
        goto L_0x031a;
        r17 = 0;
        goto L_0x031c;
        r17 = 1;
        if (r6 == 0) goto L_0x0321;
        r18.a();
        return r17;
        r0 = move-exception;
        if (r6 == 0) goto L_0x0328;
        r18.a();
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.views.touches.TouchDispatcher.dispatchTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final Logger getLogger() {
        return this.e;
    }
}
