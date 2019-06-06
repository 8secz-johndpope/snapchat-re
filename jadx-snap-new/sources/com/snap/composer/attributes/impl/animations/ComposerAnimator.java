package com.snap.composer.attributes.impl.animations;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.attributes.impl.animations.transition.ComposerTransitionInfo;
import com.snap.composer.extensions.ViewUtils;
import com.snapchat.client.composer.Animator;
import defpackage.akco;
import defpackage.akcr;
import java.util.ArrayList;
import java.util.List;

public final class ComposerAnimator extends Animator {
    public static final Companion Companion = new Companion();
    private final List<a> a = new ArrayList();
    private final TimeInterpolator b;
    private final long c;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00c1 A:{RETURN} */
        public final com.snap.composer.attributes.impl.animations.ComposerAnimator createAnimation(int r6, java.lang.Object[] r7, long r8) {
            /*
            r5 = this;
            r0 = 0;
            if (r7 == 0) goto L_0x00a7;
        L_0x0003:
            r1 = r7.length;
            r2 = 1;
            r3 = 0;
            if (r1 != 0) goto L_0x000a;
        L_0x0008:
            r1 = 1;
            goto L_0x000b;
        L_0x000a:
            r1 = 0;
        L_0x000b:
            if (r1 == 0) goto L_0x000f;
        L_0x000d:
            goto L_0x00a7;
        L_0x000f:
            r6 = r7.length;
            r1 = 4;
            if (r6 != r1) goto L_0x0090;
        L_0x0013:
            r6 = r7[r3];
            r1 = r6 instanceof java.lang.Double;
            if (r1 != 0) goto L_0x001a;
        L_0x0019:
            r6 = r0;
        L_0x001a:
            r6 = (java.lang.Double) r6;
            if (r6 == 0) goto L_0x0086;
        L_0x001e:
            r6.doubleValue();
            r1 = r7[r2];
            r2 = r1 instanceof java.lang.Double;
            if (r2 != 0) goto L_0x0028;
        L_0x0027:
            r1 = r0;
        L_0x0028:
            r1 = (java.lang.Double) r1;
            if (r1 == 0) goto L_0x007c;
        L_0x002c:
            r1.doubleValue();
            r2 = 2;
            r2 = r7[r2];
            r3 = r2 instanceof java.lang.Double;
            if (r3 != 0) goto L_0x0037;
        L_0x0036:
            r2 = r0;
        L_0x0037:
            r2 = (java.lang.Double) r2;
            if (r2 == 0) goto L_0x0072;
        L_0x003b:
            r2.doubleValue();
            r3 = 3;
            r7 = r7[r3];
            r3 = r7 instanceof java.lang.Double;
            if (r3 != 0) goto L_0x0046;
        L_0x0045:
            r7 = r0;
        L_0x0046:
            r7 = (java.lang.Double) r7;
            if (r7 == 0) goto L_0x0068;
        L_0x004a:
            r7.doubleValue();
            r3 = r6.doubleValue();
            r6 = (float) r3;
            r3 = r1.doubleValue();
            r1 = (float) r3;
            r2 = r2.doubleValue();
            r2 = (float) r2;
            r3 = r7.doubleValue();
            r7 = (float) r3;
            r6 = defpackage.kr.a(r6, r1, r2, r7);
            r6 = (android.animation.TimeInterpolator) r6;
            goto L_0x00bf;
        L_0x0068:
            r6 = new com.snap.composer.exceptions.AttributeError;
            r7 = "Control point 4 is not a double";
            r6.<init>(r7);
            r6 = (java.lang.Throwable) r6;
            throw r6;
        L_0x0072:
            r6 = new com.snap.composer.exceptions.AttributeError;
            r7 = "Control point 3 is not a double";
            r6.<init>(r7);
            r6 = (java.lang.Throwable) r6;
            throw r6;
        L_0x007c:
            r6 = new com.snap.composer.exceptions.AttributeError;
            r7 = "Control point 2 is not a double";
            r6.<init>(r7);
            r6 = (java.lang.Throwable) r6;
            throw r6;
        L_0x0086:
            r6 = new com.snap.composer.exceptions.AttributeError;
            r7 = "Control point 1 is not a double";
            r6.<init>(r7);
            r6 = (java.lang.Throwable) r6;
            throw r6;
        L_0x0090:
            r6 = new com.snap.composer.exceptions.AttributeError;
            r8 = new java.lang.StringBuilder;
            r9 = "Wrong number of control points: ";
            r8.<init>(r9);
            r7 = r7.length;
            r8.append(r7);
            r7 = r8.toString();
            r6.<init>(r7);
            r6 = (java.lang.Throwable) r6;
            throw r6;
        L_0x00a7:
            r7 = com.snap.composer.attributes.impl.animations.AnimationType.Companion;
            r7 = r7.getANIMATION_LOOKUP();
            r6 = java.lang.Integer.valueOf(r6);
            r6 = r7.get(r6);
            r6 = (com.snap.composer.attributes.impl.animations.AnimationType) r6;
            if (r6 == 0) goto L_0x00be;
        L_0x00b9:
            r6 = r6.getInterpolator();
            goto L_0x00bf;
        L_0x00be:
            r6 = r0;
        L_0x00bf:
            if (r6 != 0) goto L_0x00c2;
        L_0x00c1:
            return r0;
        L_0x00c2:
            r7 = new com.snap.composer.attributes.impl.animations.ComposerAnimator;
            r7.<init>(r6, r8);
            return r7;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.animations.ComposerAnimator$Companion.createAnimation(int, java.lang.Object[], long):com.snap.composer.attributes.impl.animations.ComposerAnimator");
        }
    }

    static final class a {
        final Object a;
        final View b;
        final ValueAnimator c;

        public a(Object obj, View view, ValueAnimator valueAnimator) {
            akcr.b(obj, "key");
            akcr.b(view, "view");
            akcr.b(valueAnimator, "animator");
            this.a = obj;
            this.b = view;
            this.c = valueAnimator;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof com.snap.composer.attributes.impl.animations.ComposerAnimator.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (com.snap.composer.attributes.impl.animations.ComposerAnimator.a) r3;
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
            throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.animations.ComposerAnimator$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            Object obj = this.a;
            int i = 0;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            View view = this.b;
            hashCode = (hashCode + (view != null ? view.hashCode() : 0)) * 31;
            ValueAnimator valueAnimator = this.c;
            if (valueAnimator != null) {
                i = valueAnimator.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("PendingAnimation(key=");
            stringBuilder.append(this.a);
            stringBuilder.append(", view=");
            stringBuilder.append(this.b);
            stringBuilder.append(", animator=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public ComposerAnimator(TimeInterpolator timeInterpolator, long j) {
        akcr.b(timeInterpolator, "interpolator");
        this.b = timeInterpolator;
        this.c = j;
    }

    private static boolean a(a aVar, ComposerTransitionInfo composerTransitionInfo) {
        android.animation.Animator animator = composerTransitionInfo.getAnimator(aVar.a);
        return animator != null && animator == aVar.c;
    }

    public static final /* synthetic */ void access$removeAnimations(ComposerAnimator composerAnimator) {
        for (a aVar : composerAnimator.a) {
            ComposerTransitionInfo transitionInfo = ViewUtils.INSTANCE.getTransitionInfo(aVar.b);
            if (transitionInfo != null) {
                if (a(aVar, transitionInfo)) {
                    transitionInfo.cancelAnimator(aVar.a);
                }
            }
        }
        composerAnimator.a.clear();
    }

    public final void addValueAnimator(Object obj, View view, ValueAnimator valueAnimator) {
        akcr.b(obj, "key");
        akcr.b(view, "view");
        if (valueAnimator != null) {
            this.a.add(new a(obj, view, valueAnimator));
            ViewUtils.INSTANCE.getOrCreateTransitionInfo(view).addAnimator(obj, valueAnimator);
        }
    }

    public final void animateTextChange(TextView textView) {
        akcr.b(textView, "view");
    }

    public final void flushAnimations(Object obj) {
        List arrayList = new ArrayList();
        for (a aVar : this.a) {
            ComposerTransitionInfo transitionInfo = ViewUtils.INSTANCE.getTransitionInfo(aVar.b);
            if (transitionInfo != null) {
                if (a(aVar, transitionInfo)) {
                    arrayList.add(aVar.c);
                }
            }
        }
        Object ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
        ofFloat.addListener(new ComposerAnimator$flushAnimations$1(this, obj));
        akcr.a(ofFloat, "completionAnimator");
        arrayList.add(ofFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(this.c);
        animatorSet.setInterpolator(this.b);
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    public final long getDuration() {
        return this.c;
    }

    public final TimeInterpolator getInterpolator() {
        return this.b;
    }
}
