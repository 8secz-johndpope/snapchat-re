package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: zoy */
public final class zoy extends zob {
    private static final String[] a = new String[]{"android:text"};

    private static /* synthetic */ void a(TextView textView, CharSequence charSequence, CharSequence charSequence2, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue < 1.0f) {
            textView.setText(charSequence);
            textView.setAlpha(1.0f - floatValue);
            return;
        }
        textView.setText(charSequence2);
        textView.setAlpha(floatValue - 1.0f);
    }

    private static void d(zog zog) {
        if (zog.a instanceof TextView) {
            zog.b.put("android:text", ((TextView) zog.a).getText());
        }
    }

    public final Animator a(ViewGroup viewGroup, zog zog, zog zog2) {
        if (zog == null || zog2 == null || !(zog2.a instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) zog2.a;
        String str = "android:text";
        final CharSequence charSequence = (CharSequence) zog.b.get(str);
        final CharSequence charSequence2 = (CharSequence) zog2.b.get(str);
        if (TextUtils.equals(charSequence, charSequence2)) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, 2.0f});
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                textView.setText(charSequence2);
                textView.setAlpha(1.0f);
            }

            public final void onAnimationStart(Animator animator) {
                textView.setText(charSequence);
            }
        });
        ofFloat.addUpdateListener(new -$$Lambda$zoy$78BBCGXykWNxKkuFsIsfCBNXyF8(textView, charSequence, charSequence2));
        return ofFloat;
    }

    public final void a(zog zog) {
        zoy.d(zog);
    }

    public final String[] a() {
        return a;
    }

    public final void b(zog zog) {
        zoy.d(zog);
    }
}
