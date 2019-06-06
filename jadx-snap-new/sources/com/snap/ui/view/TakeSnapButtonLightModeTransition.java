package com.snap.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zof;
import defpackage.zog;
import defpackage.zoo;
import java.util.Map;

public class TakeSnapButtonLightModeTransition implements zoo {
    private static final String PROPNAME_BORDER = "android:camera_button_light_mode:border";
    private static final String PROPNAME_TINT = "android:camera_button_light_mode:tint";

    private void captureValues(zog zog) {
        zog.b.put(PROPNAME_TINT, ((TakeSnapButton) zog.a).getDefaultCameraButtonTint());
        zog.b.put(PROPNAME_BORDER, Integer.valueOf(((TakeSnapButton) zog.a).getDefaultCameraButtonBorderAlpha()));
    }

    public void captureEndValues(zog zog) {
        captureValues(zog);
    }

    public void captureStartValues(zog zog) {
        captureValues(zog);
    }

    public Animator createAnimator(ViewGroup viewGroup, zog zog, zog zog2) {
        Animator animator = null;
        if (zog == null || zog2 == null) {
            return null;
        }
        Animator animator2;
        final TakeSnapButton takeSnapButton = (TakeSnapButton) zog2.a;
        Map map = zog.b;
        String str = PROPNAME_TINT;
        ColorStateList colorStateList = (ColorStateList) map.get(str);
        final ColorStateList colorStateList2 = (ColorStateList) zog2.b.get(str);
        Map map2 = zog.b;
        String str2 = PROPNAME_BORDER;
        int intValue = ((Integer) map2.get(str2)).intValue();
        final int intValue2 = ((Integer) zog2.b.get(str2)).intValue();
        if (colorStateList == null && colorStateList2 == null) {
            animator2 = null;
        } else {
            ColorStateList colorStateList3;
            if (colorStateList2 != null) {
                animator2 = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
                colorStateList3 = colorStateList2;
            } else {
                colorStateList3 = colorStateList;
                animator2 = ValueAnimator.ofFloat(new float[]{1.0f, MapboxConstants.MINIMUM_ZOOM});
            }
            animator2.addUpdateListener(new -$$Lambda$TakeSnapButtonLightModeTransition$QG10OjxGsJFqG2u7nZSBM01HCVk(takeSnapButton, colorStateList3));
            animator2.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    takeSnapButton.setCameraButtonTint(colorStateList2);
                }
            });
        }
        if (intValue != intValue2) {
            animator = ValueAnimator.ofInt(new int[]{intValue, intValue2});
            animator.addUpdateListener(new -$$Lambda$TakeSnapButtonLightModeTransition$mX31Nc8Me3F8C1QFIz_02NyN78g(takeSnapButton));
            animator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    takeSnapButton.setCameraButtonBorderAlpha(intValue2);
                }
            });
        }
        return zof.a(animator2, animator);
    }
}
