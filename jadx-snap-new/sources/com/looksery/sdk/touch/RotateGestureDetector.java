package com.looksery.sdk.touch;

import android.view.MotionEvent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class RotateGestureDetector {
    private static final double ROTATE_EPSILON = Math.toRadians(0.25d);
    private static final double ROTATE_SLOP = Math.toRadians(3.0d);
    private final float[] mCurrentFocus = new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM};
    private final float[] mCurrentSpan = new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM};
    private final float[] mDownSpan = new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM};
    private boolean mGestureActive = false;
    private final OnRotateGestureListener mListener;
    private int mPointerId0 = -1;
    private int mPointerId1 = -1;
    private final float[] mPreviousSpan = new float[]{MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM};

    public interface OnRotateGestureListener {
        boolean onRotate(MotionEvent motionEvent, float f, float f2, float f3);

        boolean onRotateBegin(MotionEvent motionEvent, float f, float f2, float f3);

        boolean onRotateEnd(MotionEvent motionEvent, float f, float f2, float f3);
    }

    public RotateGestureDetector(OnRotateGestureListener onRotateGestureListener) {
        this.mListener = onRotateGestureListener;
    }

    private void calculateFocus(MotionEvent motionEvent, float[] fArr) {
        int pointerIndex = getPointerIndex(motionEvent, this.mPointerId0);
        int pointerIndex2 = getPointerIndex(motionEvent, this.mPointerId1);
        if (pointerIndex >= 0 && pointerIndex2 >= 0) {
            fArr[0] = (motionEvent.getX(pointerIndex) + motionEvent.getX(pointerIndex2)) * 0.5f;
            fArr[1] = (motionEvent.getY(pointerIndex) + motionEvent.getY(pointerIndex2)) * 0.5f;
        }
    }

    private static double calculateRotationRadians(float f, float f2, float f3, float f4) {
        return clampMinusPiToPi(Math.atan2((double) f4, (double) f3) - Math.atan2((double) f2, (double) f));
    }

    private void calculateSpan(MotionEvent motionEvent, float[] fArr) {
        int pointerIndex = getPointerIndex(motionEvent, this.mPointerId0);
        int pointerIndex2 = getPointerIndex(motionEvent, this.mPointerId1);
        if (pointerIndex >= 0 && pointerIndex2 >= 0) {
            fArr[0] = motionEvent.getX(pointerIndex2) - motionEvent.getX(pointerIndex);
            fArr[1] = motionEvent.getY(pointerIndex2) - motionEvent.getY(pointerIndex);
        }
    }

    private static double clampMinusPiToPi(double d) {
        while (d < -3.141592653589793d) {
            d += 6.283185307179586d;
        }
        while (d > 3.141592653589793d) {
            d -= 6.283185307179586d;
        }
        return d;
    }

    private static int getPointerIndex(MotionEvent motionEvent, int i) {
        return i >= 0 ? motionEvent.findPointerIndex(i) : -1;
    }

    private boolean validatePointerIds(MotionEvent motionEvent) {
        return getPointerIndex(motionEvent, this.mPointerId0) >= 0 && getPointerIndex(motionEvent, this.mPointerId1) >= 0;
    }

    /* JADX WARNING: Missing block: B:38:0x0080, code skipped:
            if (r10.mGestureActive != false) goto L_0x012d;
     */
    /* JADX WARNING: Missing block: B:53:0x012b, code skipped:
            if (r10.mGestureActive != false) goto L_0x012d;
     */
    /* JADX WARNING: Missing block: B:54:0x012d, code skipped:
            r11 = r10.mListener.onRotateEnd(r11, com.mapbox.mapboxsdk.constants.MapboxConstants.MINIMUM_ZOOM, com.mapbox.mapboxsdk.constants.MapboxConstants.MINIMUM_ZOOM, com.mapbox.mapboxsdk.constants.MapboxConstants.MINIMUM_ZOOM);
            r10.mGestureActive = false;
     */
    /* JADX WARNING: Missing block: B:69:?, code skipped:
            return r11;
     */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        r10 = this;
        r0 = r11.getActionMasked();
        r1 = r11.getPointerCount();
        r2 = 0;
        if (r0 == 0) goto L_0x0136;
    L_0x000b:
        r3 = 0;
        r4 = 1;
        if (r0 == r4) goto L_0x0129;
    L_0x000f:
        r5 = 2;
        if (r0 == r5) goto L_0x00a9;
    L_0x0012:
        r6 = 3;
        if (r0 == r6) goto L_0x0129;
    L_0x0015:
        r6 = 5;
        if (r0 == r6) goto L_0x0084;
    L_0x0018:
        r5 = 6;
        if (r0 == r5) goto L_0x001d;
    L_0x001b:
        goto L_0x013e;
    L_0x001d:
        r0 = r11.getActionIndex();
        r5 = 0;
        r6 = 0;
        r7 = 0;
    L_0x0024:
        if (r5 >= r1) goto L_0x003a;
    L_0x0026:
        if (r0 == r5) goto L_0x0037;
    L_0x0028:
        r8 = r11.getPointerId(r5);
        r9 = r10.mPointerId0;
        if (r8 != r9) goto L_0x0032;
    L_0x0030:
        r6 = 1;
        goto L_0x0037;
    L_0x0032:
        r9 = r10.mPointerId1;
        if (r8 != r9) goto L_0x0037;
    L_0x0036:
        r7 = 1;
    L_0x0037:
        r5 = r5 + 1;
        goto L_0x0024;
    L_0x003a:
        if (r6 == 0) goto L_0x003e;
    L_0x003c:
        if (r7 != 0) goto L_0x013e;
    L_0x003e:
        r5 = -1;
        r10.mPointerId0 = r5;
        r10.mPointerId1 = r5;
        r6 = 0;
    L_0x0044:
        if (r6 >= r1) goto L_0x005d;
    L_0x0046:
        if (r0 == r6) goto L_0x005a;
    L_0x0048:
        r7 = r10.mPointerId0;
        if (r7 != r5) goto L_0x0053;
    L_0x004c:
        r7 = r11.getPointerId(r6);
        r10.mPointerId0 = r7;
        goto L_0x005a;
    L_0x0053:
        r0 = r11.getPointerId(r6);
        r10.mPointerId1 = r0;
        goto L_0x005d;
    L_0x005a:
        r6 = r6 + 1;
        goto L_0x0044;
    L_0x005d:
        r0 = r10.mPointerId0;
        if (r0 < 0) goto L_0x007e;
    L_0x0061:
        r0 = r10.mPointerId1;
        if (r0 < 0) goto L_0x007e;
    L_0x0065:
        r0 = r10.mCurrentSpan;
        r10.calculateSpan(r11, r0);
        r11 = r10.mDownSpan;
        r0 = r10.mPreviousSpan;
        r1 = r10.mCurrentSpan;
        r3 = r1[r2];
        r0[r2] = r3;
        r11[r2] = r3;
        r1 = r1[r4];
        r0[r4] = r1;
        r11[r4] = r1;
        goto L_0x013e;
    L_0x007e:
        r0 = r10.mGestureActive;
        if (r0 == 0) goto L_0x013e;
    L_0x0082:
        goto L_0x012d;
    L_0x0084:
        if (r1 != r5) goto L_0x013e;
    L_0x0086:
        r0 = r11.getActionIndex();
        r0 = r11.getPointerId(r0);
        r10.mPointerId1 = r0;
        r0 = r10.mCurrentSpan;
        r10.calculateSpan(r11, r0);
        r11 = r10.mDownSpan;
        r0 = r10.mPreviousSpan;
        r1 = r10.mCurrentSpan;
        r3 = r1[r2];
        r0[r2] = r3;
        r11[r2] = r3;
        r1 = r1[r4];
        r0[r4] = r1;
        r11[r4] = r1;
        goto L_0x013e;
    L_0x00a9:
        r0 = r10.validatePointerIds(r11);
        if (r0 == 0) goto L_0x013e;
    L_0x00af:
        r0 = r10.mCurrentSpan;
        r10.calculateSpan(r11, r0);
        r0 = r10.mCurrentFocus;
        r10.calculateFocus(r11, r0);
        r0 = r10.mDownSpan;
        r1 = r0[r2];
        r0 = r0[r4];
        r3 = r10.mCurrentSpan;
        r5 = r3[r2];
        r3 = r3[r4];
        r0 = calculateRotationRadians(r1, r0, r5, r3);
        r3 = r10.mPreviousSpan;
        r5 = r3[r2];
        r3 = r3[r4];
        r6 = r10.mCurrentSpan;
        r7 = r6[r2];
        r6 = r6[r4];
        r5 = calculateRotationRadians(r5, r3, r7, r6);
        r3 = r10.mGestureActive;
        if (r3 != 0) goto L_0x0103;
    L_0x00dd:
        r5 = java.lang.Math.abs(r0);
        r7 = ROTATE_SLOP;
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 <= 0) goto L_0x0127;
    L_0x00e7:
        r3 = r10.mListener;
        r0 = (float) r0;
        r1 = r10.mCurrentFocus;
        r5 = r1[r2];
        r1 = r1[r4];
        r11 = r3.onRotateBegin(r11, r0, r5, r1);
        r0 = r10.mPreviousSpan;
        r1 = r10.mCurrentSpan;
        r3 = r1[r2];
        r0[r2] = r3;
        r1 = r1[r4];
        r0[r4] = r1;
        r10.mGestureActive = r4;
        goto L_0x013f;
    L_0x0103:
        r5 = java.lang.Math.abs(r5);
        r7 = ROTATE_EPSILON;
        r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1));
        if (r3 <= 0) goto L_0x0127;
    L_0x010d:
        r3 = r10.mListener;
        r0 = (float) r0;
        r1 = r10.mCurrentFocus;
        r5 = r1[r2];
        r1 = r1[r4];
        r11 = r3.onRotate(r11, r0, r5, r1);
        r0 = r10.mPreviousSpan;
        r1 = r10.mCurrentSpan;
        r3 = r1[r2];
        r0[r2] = r3;
        r1 = r1[r4];
        r0[r4] = r1;
        r2 = r11;
    L_0x0127:
        r11 = r2;
        goto L_0x013f;
    L_0x0129:
        r0 = r10.mGestureActive;
        if (r0 == 0) goto L_0x013e;
    L_0x012d:
        r0 = r10.mListener;
        r11 = r0.onRotateEnd(r11, r3, r3, r3);
        r10.mGestureActive = r2;
        goto L_0x013f;
    L_0x0136:
        r11 = r11.getPointerId(r2);
        r10.mPointerId0 = r11;
        r10.mGestureActive = r2;
    L_0x013e:
        r11 = 0;
    L_0x013f:
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.touch.RotateGestureDetector.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
