package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: zov */
public final class zov extends zob {
    final boolean a;

    public zov(boolean z) {
        this.a = z;
    }

    private static void d(zog zog) {
        View view = zog.a;
        zog.b.put("android:scale:width", Float.valueOf((float) view.getMeasuredWidth()));
        zog.b.put("android:scale:height", Float.valueOf((float) view.getMeasuredHeight()));
        String str = "android:scale:scaleX";
        zog.b.put(str, Float.valueOf(view.getScaleX()));
        zog.b.put("android:scale:scaleY", Float.valueOf(view.getScaleY()));
    }

    public final Animator a(ViewGroup viewGroup, zog zog, zog zog2) {
        if (!(zog == null || zog2 == null)) {
            String str = "android:scale:width";
            float floatValue = ((Float) zog.b.get(str)).floatValue();
            String str2 = "android:scale:height";
            float floatValue2 = ((Float) zog.b.get(str2)).floatValue();
            String str3 = "android:scale:scaleX";
            float floatValue3 = ((Float) zog.b.get(str3)).floatValue();
            String str4 = "android:scale:scaleY";
            float floatValue4 = ((Float) zog.b.get(str4)).floatValue();
            float floatValue5 = ((Float) zog2.b.get(str)).floatValue();
            float floatValue6 = ((Float) zog2.b.get(str2)).floatValue();
            float floatValue7 = ((Float) zog2.b.get(str3)).floatValue();
            float floatValue8 = ((Float) zog2.b.get(str4)).floatValue();
            if (!(floatValue5 == MapboxConstants.MINIMUM_ZOOM || floatValue6 == MapboxConstants.MINIMUM_ZOOM)) {
                final View view = zog2.a;
                floatValue = (floatValue * floatValue3) / floatValue5;
                floatValue2 = (floatValue2 * floatValue4) / floatValue6;
                floatValue4 = view.getPivotX();
                final float pivotY = view.getPivotY();
                if (this.a) {
                    if (view.getLayoutDirection() == 0) {
                        view.setPivotX(MapboxConstants.MINIMUM_ZOOM);
                    } else {
                        view.setPivotX((float) view.getMeasuredWidth());
                    }
                    view.setPivotY(MapboxConstants.MINIMUM_ZOOM);
                }
                Animator a = zof.a(ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{floatValue, floatValue7}), ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{floatValue2, floatValue8}));
                a.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (zov.this.a) {
                            view.setPivotX(floatValue4);
                            view.setPivotY(pivotY);
                        }
                    }
                });
                return a;
            }
        }
        return null;
    }

    public final void a(zog zog) {
        zov.d(zog);
    }

    public final void b(zog zog) {
        zov.d(zog);
    }
}
