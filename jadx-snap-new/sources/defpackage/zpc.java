package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Map;

/* renamed from: zpc */
public final class zpc extends zob {
    private static final String[] a = new String[]{"android:start", "android:top"};

    private static void d(zog zog) {
        Map map;
        int left;
        String str = "android:start";
        if (zog.a.getLayoutDirection() == 0) {
            map = zog.b;
            left = zog.a.getLeft();
        } else {
            map = zog.b;
            left = zog.a.getRight();
        }
        map.put(str, Float.valueOf((float) left));
        zog.b.put("android:top", Float.valueOf((float) zog.a.getTop()));
    }

    public final Animator a(ViewGroup viewGroup, zog zog, zog zog2) {
        Animator animator = null;
        if (zog == null || zog2 == null) {
            return null;
        }
        Animator ofFloat;
        View view = zog2.a;
        String str = "android:start";
        float floatValue = ((Float) zog.b.get(str)).floatValue();
        float floatValue2 = ((Float) zog2.b.get(str)).floatValue();
        String str2 = "android:top";
        float floatValue3 = ((Float) zog.b.get(str2)).floatValue();
        float floatValue4 = ((Float) zog2.b.get(str2)).floatValue();
        if (floatValue != floatValue2) {
            ofFloat = ObjectAnimator.ofFloat(view, "translationX", new float[]{floatValue - floatValue2, MapboxConstants.MINIMUM_ZOOM});
        } else {
            ofFloat = null;
        }
        if (floatValue3 != floatValue4) {
            animator = ObjectAnimator.ofFloat(view, "translationY", new float[]{floatValue3 - floatValue4, MapboxConstants.MINIMUM_ZOOM});
        }
        return zof.a(ofFloat, animator);
    }

    public final void a(zog zog) {
        zpc.d(zog);
    }

    public final String[] a() {
        return a;
    }

    public final void b(zog zog) {
        zpc.d(zog);
    }
}
