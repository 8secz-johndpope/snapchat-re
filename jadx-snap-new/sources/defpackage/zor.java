package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.zob.b;

/* renamed from: zor */
public final class zor extends zoi {
    private static float a(zog zog, float f) {
        if (zog == null) {
            return f;
        }
        Float f2 = (Float) zog.b.get("android:fade:alpha");
        return f2 != null ? f2.floatValue() : f;
    }

    private Animator a(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        view.setAlpha(f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f2});
        a((b) new zoc() {
            public final void a(zob zob) {
                view.setAlpha(1.0f);
                zob.b((b) this);
            }
        });
        return ofFloat;
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog) {
        return a(view, zor.a(zog, 1.0f), (float) MapboxConstants.MINIMUM_ZOOM);
    }

    public final Animator a(ViewGroup viewGroup, View view, zog zog, zog zog2) {
        float f = MapboxConstants.MINIMUM_ZOOM;
        float a = zor.a(zog, MapboxConstants.MINIMUM_ZOOM);
        if (a != 1.0f) {
            f = a;
        }
        return a(view, f, 1.0f);
    }

    public final void a(zog zog) {
        super.a(zog);
        zog.b.put("android:fade:alpha", Float.valueOf(zog.a.getAlpha()));
    }
}
