package com.snap.ui.view.multisnap;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.abpf;
import defpackage.abpx;
import defpackage.abtc;
import defpackage.ajxt;
import defpackage.akbl;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.jwa;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public final class ThumbnailTrimmingController implements OnTouchListener, ThumbnailTrimmingPositionProvider {
    public static final Companion Companion = new Companion();
    private final jwa bitmapFactory;
    private final View borderView;
    private TrimmingType currentDraggingType;
    private Animation handleAnimation;
    private final TrimmingHandleImageView leftHandle;
    private final ThumbnailTrimmingOverlayView overlay;
    private final TrimmingHandleImageView rightHandle;
    private float startBorderMargin;
    private float startEventX;
    private final WeakReference<MultiSnapThumbnailViewDelegate> thumbnailViewDelegate;
    private final abpx<TrimmingListener> trimmingListeners = new abpx();
    private final Map<TrimmingType, Integer> trimmingTimestamps;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        private final float calculatePositionFromTimestamp(MultiSnapThumbnailViewDelegate multiSnapThumbnailViewDelegate, int i, float f, TrimmingType trimmingType) {
            float startingTimestamp;
            Integer endingTimestamp = multiSnapThumbnailViewDelegate.getEndingTimestamp();
            if (endingTimestamp != null) {
                startingTimestamp = ((float) (i - multiSnapThumbnailViewDelegate.getStartingTimestamp())) / ((float) (endingTimestamp.intValue() - multiSnapThumbnailViewDelegate.getStartingTimestamp()));
            } else {
                startingTimestamp = MapboxConstants.MINIMUM_ZOOM;
            }
            if (trimmingType != TrimmingType.LEFT) {
                startingTimestamp = 1.0f - startingTimestamp;
            }
            return startingTimestamp * f;
        }

        private final int calculateTimestampFromPosition(MultiSnapThumbnailViewDelegate multiSnapThumbnailViewDelegate, float f, float f2, TrimmingType trimmingType) {
            f = trimmingType == TrimmingType.LEFT ? f / f2 : 1.0f - (f / f2);
            Integer endingTimestamp = multiSnapThumbnailViewDelegate.getEndingTimestamp();
            if (endingTimestamp == null) {
                return multiSnapThumbnailViewDelegate.getStartingTimestamp();
            }
            return multiSnapThumbnailViewDelegate.getStartingTimestamp() + ((int) (((float) (endingTimestamp.intValue() - multiSnapThumbnailViewDelegate.getStartingTimestamp())) * f));
        }

        private final float getNewBorderMargin(float f, float f2, float f3, float f4, float f5) {
            return abpf.a(f3 + ((f - f2) * f5), (float) MapboxConstants.MINIMUM_ZOOM, f4);
        }
    }

    static final class TrimmingHandleXPosAnimation extends Animation {
        private final View borderView;
        private final ThumbnailTrimmingOverlayView overlay;
        private final float toX;
        private final TrimmingType type;

        public TrimmingHandleXPosAnimation(View view, ThumbnailTrimmingOverlayView thumbnailTrimmingOverlayView, float f, TrimmingType trimmingType) {
            akcr.b(view, "borderView");
            akcr.b(thumbnailTrimmingOverlayView, "overlay");
            akcr.b(trimmingType, "type");
            this.borderView = view;
            this.overlay = thumbnailTrimmingOverlayView;
            this.toX = f;
            this.type = trimmingType;
        }

        /* Access modifiers changed, original: protected|final */
        public final void applyTransformation(float f, Transformation transformation) {
            akcr.b(transformation, "t");
            LayoutParams layoutParams = this.borderView.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                float f2 = (float) (this.type == TrimmingType.LEFT ? layoutParams2.leftMargin : layoutParams2.rightMargin);
                f2 += (this.toX - f2) * f;
                if (this.type == TrimmingType.LEFT) {
                    layoutParams2.leftMargin = (int) f2;
                    this.overlay.setLeftMargin(layoutParams2.leftMargin);
                } else {
                    layoutParams2.rightMargin = (int) f2;
                    this.overlay.setRightMargin(layoutParams2.rightMargin);
                }
                this.overlay.invalidate();
                this.borderView.requestLayout();
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }

        public final boolean willChangeBounds() {
            return true;
        }
    }

    public enum TrimmingType {
        LEFT,
        RIGHT
    }

    /* renamed from: com.snap.ui.view.multisnap.ThumbnailTrimmingController$1 */
    static final class AnonymousClass1 extends akcs implements akbl<MotionEvent, Boolean> {
        final /* synthetic */ ThumbnailTrimmingController this$0;

        AnonymousClass1(ThumbnailTrimmingController thumbnailTrimmingController) {
            this.this$0 = thumbnailTrimmingController;
            super(1);
        }

        public final boolean invoke(MotionEvent motionEvent) {
            akcr.b(motionEvent, "input");
            return this.this$0.getTouchingType(motionEvent.getRawX()) == TrimmingType.LEFT;
        }
    }

    /* renamed from: com.snap.ui.view.multisnap.ThumbnailTrimmingController$2 */
    static final class AnonymousClass2 extends akcs implements akbl<MotionEvent, Boolean> {
        final /* synthetic */ ThumbnailTrimmingController this$0;

        AnonymousClass2(ThumbnailTrimmingController thumbnailTrimmingController) {
            this.this$0 = thumbnailTrimmingController;
            super(1);
        }

        public final boolean invoke(MotionEvent motionEvent) {
            akcr.b(motionEvent, "input");
            return this.this$0.getTouchingType(motionEvent.getRawX()) == TrimmingType.RIGHT;
        }
    }

    public ThumbnailTrimmingController(RelativeLayout relativeLayout, View view, Set<? extends TrimmingListener> set, MultiSnapThumbnailViewDelegate multiSnapThumbnailViewDelegate, jwa jwa) {
        akcr.b(relativeLayout, "thumbnailView");
        akcr.b(view, "borderView");
        akcr.b(set, "trimmingListeners");
        akcr.b(multiSnapThumbnailViewDelegate, "thumbnailViewDelegate");
        akcr.b(jwa, "bitmapFactory");
        this.borderView = view;
        this.bitmapFactory = jwa;
        this.trimmingListeners.b((Collection) set);
        this.thumbnailViewDelegate = new WeakReference(multiSnapThumbnailViewDelegate);
        Object findViewById = relativeLayout.findViewById(R.id.thumbnail_trimming_left_handle);
        akcr.a(findViewById, "thumbnailView.findViewBy…ail_trimming_left_handle)");
        this.leftHandle = (TrimmingHandleImageView) findViewById;
        findViewById = relativeLayout.findViewById(R.id.thumbnail_trimming_right_handle);
        akcr.a(findViewById, "thumbnailView.findViewBy…il_trimming_right_handle)");
        this.rightHandle = (TrimmingHandleImageView) findViewById;
        Object findViewById2 = relativeLayout.findViewById(R.id.thumbnail_trimming_overlay);
        akcr.a(findViewById2, "thumbnailView.findViewBy…umbnail_trimming_overlay)");
        this.overlay = (ThumbnailTrimmingOverlayView) findViewById2;
        this.overlay.setBitmapFactory(this.bitmapFactory);
        abtc abtc = new abtc(this.leftHandle);
        this.leftHandle.setOnTouchListener(abtc);
        this.leftHandle.setShouldDispatchTouchEvent(new AnonymousClass1(this));
        OnTouchListener onTouchListener = this;
        abtc.a(onTouchListener);
        abtc = new abtc(this.rightHandle);
        this.rightHandle.setOnTouchListener(abtc);
        this.rightHandle.setShouldDispatchTouchEvent(new AnonymousClass2(this));
        abtc.a(onTouchListener);
        this.trimmingTimestamps = new EnumMap(TrimmingType.class);
    }

    private final void cancelHandleAnimationIfNecessary() {
        Animation animation = this.handleAnimation;
        if (animation != null) {
            animation.cancel();
        }
        this.handleAnimation = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    private final float getConstrainedHandlePosition(com.snap.ui.view.multisnap.MultiSnapThumbnailViewDelegate r6, float r7, float r8, com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType r9) {
        /*
        r5 = this;
        r0 = r6.getStartingTimestamp();
        r1 = r6.getEndingTimestamp();
        r2 = Companion;
        r7 = r2.calculateTimestampFromPosition(r6, r7, r8, r9);
        r2 = com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType.LEFT;
        if (r9 != r2) goto L_0x0014;
    L_0x0012:
        r2 = r0;
        goto L_0x001a;
    L_0x0014:
        r2 = r5.getTrimmingStartTimestamp();
        r2 = r2 + 2000;
    L_0x001a:
        r3 = com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType.RIGHT;
        if (r9 != r3) goto L_0x0025;
    L_0x001e:
        if (r1 == 0) goto L_0x0034;
    L_0x0020:
        r3 = r1.intValue();
        goto L_0x0035;
    L_0x0025:
        r3 = r5.getTrimmingEndTimestamp();
        if (r3 == 0) goto L_0x0034;
    L_0x002b:
        r3 = (java.lang.Number) r3;
        r3 = r3.intValue();
        r3 = r3 + -2000;
        goto L_0x0035;
    L_0x0034:
        r3 = r2;
    L_0x0035:
        r4 = com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType.LEFT;
        if (r9 != r4) goto L_0x003f;
    L_0x0039:
        r0 = r7 - r0;
        r0 = r0 % 250;
        r7 = r7 - r0;
        goto L_0x004d;
    L_0x003f:
        if (r1 == 0) goto L_0x004b;
    L_0x0041:
        r1 = (java.lang.Number) r1;
        r0 = r1.intValue();
        r0 = r0 - r7;
        r0 = r0 % 250;
        goto L_0x004c;
    L_0x004b:
        r0 = 0;
    L_0x004c:
        r7 = r7 + r0;
    L_0x004d:
        r7 = defpackage.abpf.a(r7, r2, r3);
        r0 = Companion;
        r6 = r0.calculatePositionFromTimestamp(r6, r7, r8, r9);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.multisnap.ThumbnailTrimmingController.getConstrainedHandlePosition(com.snap.ui.view.multisnap.MultiSnapThumbnailViewDelegate, float, float, com.snap.ui.view.multisnap.ThumbnailTrimmingController$TrimmingType):float");
    }

    private final TrimmingType getTouchingType(float f) {
        int[] iArr = new int[2];
        this.leftHandle.getLocationOnScreen(iArr);
        float f2 = (((float) iArr[0]) * 0.5f) + MapboxConstants.MINIMUM_ZOOM;
        this.rightHandle.getLocationOnScreen(iArr);
        return f < f2 + (((float) (iArr[0] + this.rightHandle.getWidth())) * 0.5f) ? TrimmingType.LEFT : TrimmingType.RIGHT;
    }

    public final Integer getTrimmingEndTimestamp() {
        Integer num = (Integer) this.trimmingTimestamps.get(TrimmingType.RIGHT);
        if (num != null) {
            return Integer.valueOf(num.intValue());
        }
        Object obj = (MultiSnapThumbnailViewDelegate) this.thumbnailViewDelegate.get();
        if (obj == null) {
            return Integer.valueOf(0);
        }
        akcr.a(obj, "thumbnailViewDelegate.get() ?: return 0");
        return obj.getEndingTimestamp();
    }

    public final int getTrimmingStartTimestamp() {
        Integer num = (Integer) this.trimmingTimestamps.get(TrimmingType.LEFT);
        if (num != null) {
            return num.intValue();
        }
        Object obj = (MultiSnapThumbnailViewDelegate) this.thumbnailViewDelegate.get();
        if (obj == null) {
            return 0;
        }
        akcr.a(obj, "thumbnailViewDelegate.get() ?: return 0");
        return obj.getStartingTimestamp();
    }

    public final boolean isDragging() {
        return this.currentDraggingType != null;
    }

    /* JADX WARNING: Missing block: B:27:0x0062, code skipped:
            if (r4 != 3) goto L_0x016a;
     */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        r11 = this;
        r0 = "handleView";
        defpackage.akcr.b(r12, r0);
        r0 = "event";
        defpackage.akcr.b(r13, r0);
        r0 = r11.trimmingListeners;
        r0 = r0.c();
        r1 = 0;
        if (r0 == 0) goto L_0x0014;
    L_0x0013:
        return r1;
    L_0x0014:
        r0 = r11.thumbnailViewDelegate;
        r0 = r0.get();
        r0 = (com.snap.ui.view.multisnap.MultiSnapThumbnailViewDelegate) r0;
        if (r0 == 0) goto L_0x0173;
    L_0x001e:
        r2 = r0.isSplitting();
        if (r2 == 0) goto L_0x0026;
    L_0x0024:
        goto L_0x0173;
    L_0x0026:
        r2 = r11.leftHandle;
        if (r12 != r2) goto L_0x002d;
    L_0x002a:
        r12 = com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType.LEFT;
        goto L_0x002f;
    L_0x002d:
        r12 = com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType.RIGHT;
    L_0x002f:
        r2 = r11.currentDraggingType;
        if (r2 == 0) goto L_0x0036;
    L_0x0033:
        if (r2 == r12) goto L_0x0036;
    L_0x0035:
        return r1;
    L_0x0036:
        r11.cancelHandleAnimationIfNecessary();
        r2 = r11.borderView;
        r2 = r2.getLayoutParams();
        if (r2 == 0) goto L_0x016b;
    L_0x0041:
        r2 = (android.widget.RelativeLayout.LayoutParams) r2;
        r3 = com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType.LEFT;
        if (r12 != r3) goto L_0x004c;
    L_0x0047:
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        goto L_0x0050;
    L_0x004c:
        r3 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r9 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x0050:
        r3 = r0.getThumbnailViewWidth(r1);
        r3 = (float) r3;
        r4 = r13.getActionMasked();
        r10 = 1;
        if (r4 == 0) goto L_0x0140;
    L_0x005c:
        if (r4 == r10) goto L_0x00cb;
    L_0x005e:
        r5 = 2;
        if (r4 == r5) goto L_0x0066;
    L_0x0061:
        r2 = 3;
        if (r4 == r2) goto L_0x00cb;
    L_0x0064:
        goto L_0x016a;
    L_0x0066:
        r4 = Companion;
        r5 = r13.getRawX();
        r6 = r11.startEventX;
        r7 = r11.startBorderMargin;
        r8 = r3;
        r13 = r4.getNewBorderMargin(r5, r6, r7, r8, r9);
        r13 = r11.getConstrainedHandlePosition(r0, r13, r3, r12);
        r1 = r11.getConstrainedHandlePosition(r0, r13, r3, r12);
        r4 = com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType.LEFT;
        if (r12 != r4) goto L_0x008c;
    L_0x0081:
        r13 = (int) r13;
        r2.leftMargin = r13;
        r13 = r11.overlay;
        r2 = r2.leftMargin;
        r13.setLeftMargin(r2);
        goto L_0x0096;
    L_0x008c:
        r13 = (int) r13;
        r2.rightMargin = r13;
        r13 = r11.overlay;
        r2 = r2.rightMargin;
        r13.setRightMargin(r2);
    L_0x0096:
        r13 = r11.overlay;
        r13.invalidate();
        r13 = Companion;
        r13 = r13.calculateTimestampFromPosition(r0, r1, r3, r12);
        r1 = r11.trimmingTimestamps;
        r2 = java.lang.Integer.valueOf(r13);
        r1.put(r12, r2);
        r1 = r11.trimmingListeners;
        r1 = r1.iterator();
    L_0x00b0:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x00c4;
    L_0x00b6:
        r2 = r1.next();
        r2 = (com.snap.ui.view.multisnap.TrimmingListener) r2;
        r3 = r0.getSegmentKey();
        r2.onTrimmingHandleDraggingUpdated(r3, r13, r12);
        goto L_0x00b0;
    L_0x00c4:
        r12 = r11.borderView;
        r12.requestLayout();
        goto L_0x016a;
    L_0x00cb:
        r4 = Companion;
        r5 = r13.getRawX();
        r6 = r11.startEventX;
        r7 = r11.startBorderMargin;
        r8 = r3;
        r13 = r4.getNewBorderMargin(r5, r6, r7, r8, r9);
        r2 = r11.getConstrainedHandlePosition(r0, r13, r3, r12);
        r4 = 0;
        r11.currentDraggingType = r4;
        r4 = Companion;
        r3 = r4.calculateTimestampFromPosition(r0, r2, r3, r12);
        r4 = r11.trimmingTimestamps;
        r3 = java.lang.Integer.valueOf(r3);
        r4.put(r12, r3);
        r0.updateButtonVisibility(r1);
        r1 = r11.trimmingListeners;
        r1 = r1.iterator();
    L_0x00f9:
        r3 = r1.hasNext();
        if (r3 == 0) goto L_0x0115;
    L_0x00ff:
        r3 = r1.next();
        r3 = (com.snap.ui.view.multisnap.TrimmingListener) r3;
        r4 = r0.getSegmentKey();
        r5 = r11.getTrimmingStartTimestamp();
        r6 = r11.getTrimmingEndTimestamp();
        r3.onTrimmingHandleDraggingFinished(r4, r5, r6, r12);
        goto L_0x00f9;
    L_0x0115:
        r13 = r2 - r13;
        r13 = java.lang.Math.abs(r13);
        r0 = 981668463; // 0x3a83126f float:0.001 double:4.85008663E-315;
        r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1));
        if (r13 <= 0) goto L_0x016a;
    L_0x0122:
        r13 = new com.snap.ui.view.multisnap.ThumbnailTrimmingController$TrimmingHandleXPosAnimation;
        r0 = r11.borderView;
        r1 = r11.overlay;
        r13.<init>(r0, r1, r2, r12);
        r13 = (android.view.animation.Animation) r13;
        r11.handleAnimation = r13;
        r12 = r11.handleAnimation;
        if (r12 == 0) goto L_0x0138;
    L_0x0133:
        r0 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
        r12.setDuration(r0);
    L_0x0138:
        r12 = r11.borderView;
        r13 = r11.handleAnimation;
        r12.startAnimation(r13);
        goto L_0x016a;
    L_0x0140:
        r0 = com.snap.ui.view.multisnap.ThumbnailTrimmingController.TrimmingType.LEFT;
        if (r12 != r0) goto L_0x0147;
    L_0x0144:
        r0 = r2.leftMargin;
        goto L_0x0149;
    L_0x0147:
        r0 = r2.rightMargin;
    L_0x0149:
        r0 = (float) r0;
        r11.startBorderMargin = r0;
        r13 = r13.getRawX();
        r11.startEventX = r13;
        r11.currentDraggingType = r12;
        r12 = r11.trimmingListeners;
        r12 = r12.iterator();
    L_0x015a:
        r13 = r12.hasNext();
        if (r13 == 0) goto L_0x016a;
    L_0x0160:
        r13 = r12.next();
        r13 = (com.snap.ui.view.multisnap.TrimmingListener) r13;
        r13.onTrimmingHandleDraggingStart();
        goto L_0x015a;
    L_0x016a:
        return r10;
    L_0x016b:
        r12 = new ajxt;
        r13 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams";
        r12.<init>(r13);
        throw r12;
    L_0x0173:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.multisnap.ThumbnailTrimmingController.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void setTrimmingEnabled(boolean z, boolean z2) {
        int i = 8;
        this.leftHandle.setVisibility(z ? 0 : 8);
        this.rightHandle.setVisibility(z ? 0 : 8);
        if (z2) {
            LayoutParams layoutParams = this.borderView.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                Object obj = (MultiSnapThumbnailViewDelegate) this.thumbnailViewDelegate.get();
                if (obj != null) {
                    akcr.a(obj, "thumbnailViewDelegate.get() ?: return");
                    cancelHandleAnimationIfNecessary();
                    float thumbnailViewWidth = (float) obj.getThumbnailViewWidth(true);
                    Integer num = (Integer) this.trimmingTimestamps.get(TrimmingType.LEFT);
                    int access$calculatePositionFromTimestamp = (!z || num == null) ? 0 : (int) Companion.calculatePositionFromTimestamp(obj, num.intValue(), thumbnailViewWidth, TrimmingType.LEFT);
                    layoutParams2.leftMargin = access$calculatePositionFromTimestamp;
                    this.overlay.setLeftMargin(layoutParams2.leftMargin);
                    num = (Integer) this.trimmingTimestamps.get(TrimmingType.RIGHT);
                    int access$calculatePositionFromTimestamp2 = (!z || num == null) ? 0 : (int) Companion.calculatePositionFromTimestamp(obj, num.intValue(), thumbnailViewWidth, TrimmingType.RIGHT);
                    layoutParams2.rightMargin = access$calculatePositionFromTimestamp2;
                    this.overlay.setRightMargin(layoutParams2.rightMargin);
                    this.overlay.invalidate();
                    ThumbnailTrimmingOverlayView thumbnailTrimmingOverlayView = this.overlay;
                    if (z) {
                        i = 0;
                    }
                    thumbnailTrimmingOverlayView.setVisibility(i);
                    this.borderView.requestLayout();
                    return;
                }
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    public final void setTrimmingTimestamp(TrimmingType trimmingType, Integer num) {
        akcr.b(trimmingType, "type");
        if (num == null) {
            this.trimmingTimestamps.remove(trimmingType);
        } else {
            this.trimmingTimestamps.put(trimmingType, num);
        }
    }
}
