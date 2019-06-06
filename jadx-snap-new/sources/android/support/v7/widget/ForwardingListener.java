package android.support.v7.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.nk;
import defpackage.oh;

public abstract class ForwardingListener implements OnAttachStateChangeListener, OnTouchListener {
    private int mActivePointerId;
    private Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    final View mSrc;
    private final int mTapTimeout;
    private final int[] mTmpLocation = new int[2];
    private Runnable mTriggerLongPress;

    class a implements Runnable {
        a() {
        }

        public final void run() {
            ViewParent parent = ForwardingListener.this.mSrc.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public final void run() {
            ForwardingListener.this.onLongPress();
        }
    }

    public ForwardingListener(View view) {
        this.mSrc = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.mScaledTouchSlop = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.mTapTimeout = ViewConfiguration.getTapTimeout();
        this.mLongPressTimeout = (this.mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void clearCallbacks() {
        Runnable runnable = this.mTriggerLongPress;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
        runnable = this.mDisallowIntercept;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
    }

    private boolean onTouchForwarded(MotionEvent motionEvent) {
        View view = this.mSrc;
        nk popup = getPopup();
        if (popup != null && popup.isShowing()) {
            oh ohVar = (oh) popup.getListView();
            if (ohVar != null && ohVar.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                toGlobalMotionEvent(view, obtainNoHistory);
                toLocalMotionEvent(ohVar, obtainNoHistory);
                boolean onForwardedEvent = ohVar.onForwardedEvent(obtainNoHistory, this.mActivePointerId);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                Object obj = (actionMasked == 1 || actionMasked == 3) ? null : 1;
                return onForwardedEvent && obj != null;
            }
        }
    }

    /* JADX WARNING: Missing block: B:10:0x0017, code skipped:
            if (r1 != 3) goto L_0x006d;
     */
    private boolean onTouchObserved(android.view.MotionEvent r6) {
        /*
        r5 = this;
        r0 = r5.mSrc;
        r1 = r0.isEnabled();
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        return r2;
    L_0x000a:
        r1 = r6.getActionMasked();
        if (r1 == 0) goto L_0x0041;
    L_0x0010:
        r3 = 1;
        if (r1 == r3) goto L_0x003d;
    L_0x0013:
        r4 = 2;
        if (r1 == r4) goto L_0x001a;
    L_0x0016:
        r6 = 3;
        if (r1 == r6) goto L_0x003d;
    L_0x0019:
        goto L_0x006d;
    L_0x001a:
        r1 = r5.mActivePointerId;
        r1 = r6.findPointerIndex(r1);
        if (r1 < 0) goto L_0x006d;
    L_0x0022:
        r4 = r6.getX(r1);
        r6 = r6.getY(r1);
        r1 = r5.mScaledTouchSlop;
        r6 = pointInView(r0, r4, r6, r1);
        if (r6 != 0) goto L_0x006d;
    L_0x0032:
        r5.clearCallbacks();
        r6 = r0.getParent();
        r6.requestDisallowInterceptTouchEvent(r3);
        return r3;
    L_0x003d:
        r5.clearCallbacks();
        goto L_0x006d;
    L_0x0041:
        r6 = r6.getPointerId(r2);
        r5.mActivePointerId = r6;
        r6 = r5.mDisallowIntercept;
        if (r6 != 0) goto L_0x0052;
    L_0x004b:
        r6 = new android.support.v7.widget.ForwardingListener$a;
        r6.<init>();
        r5.mDisallowIntercept = r6;
    L_0x0052:
        r6 = r5.mDisallowIntercept;
        r1 = r5.mTapTimeout;
        r3 = (long) r1;
        r0.postDelayed(r6, r3);
        r6 = r5.mTriggerLongPress;
        if (r6 != 0) goto L_0x0065;
    L_0x005e:
        r6 = new android.support.v7.widget.ForwardingListener$b;
        r6.<init>();
        r5.mTriggerLongPress = r6;
    L_0x0065:
        r6 = r5.mTriggerLongPress;
        r1 = r5.mLongPressTimeout;
        r3 = (long) r1;
        r0.postDelayed(r6, r3);
    L_0x006d:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ForwardingListener.onTouchObserved(android.view.MotionEvent):boolean");
    }

    private static boolean pointInView(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    private boolean toGlobalMotionEvent(View view, MotionEvent motionEvent) {
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    private boolean toLocalMotionEvent(View view, MotionEvent motionEvent) {
        int[] iArr = this.mTmpLocation;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    public abstract nk getPopup();

    /* Access modifiers changed, original: protected */
    public boolean onForwardingStarted() {
        nk popup = getPopup();
        if (!(popup == null || popup.isShowing())) {
            popup.show();
        }
        return true;
    }

    /* Access modifiers changed, original: protected */
    public boolean onForwardingStopped() {
        nk popup = getPopup();
        if (popup != null && popup.isShowing()) {
            popup.dismiss();
        }
        return true;
    }

    /* Access modifiers changed, original: 0000 */
    public void onLongPress() {
        clearCallbacks();
        View view = this.mSrc;
        if (view.isEnabled() && !view.isLongClickable() && onForwardingStarted()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.mForwarding = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.mForwarding;
        if (z2) {
            z = onTouchForwarded(motionEvent) || !onForwardingStopped();
        } else {
            z = onTouchObserved(motionEvent) && onForwardingStarted();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 0);
                this.mSrc.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.mForwarding = z;
        return z || z2;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.mForwarding = false;
        this.mActivePointerId = -1;
        Runnable runnable = this.mDisallowIntercept;
        if (runnable != null) {
            this.mSrc.removeCallbacks(runnable);
        }
    }
}
