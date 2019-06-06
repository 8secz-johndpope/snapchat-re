package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;

/* renamed from: zol */
public final class zol extends zob {
    private static void d(zog zog) {
        View view = zog.a;
        zog.b.put("android:scale:width", Float.valueOf((float) view.getMeasuredWidth()));
        zog.b.put("android:scale:height", Float.valueOf((float) view.getMeasuredHeight()));
    }

    public final Animator a(ViewGroup viewGroup, zog zog, zog zog2) {
        if (zog == null || zog2 == null) {
            return null;
        }
        String str = "android:scale:width";
        float floatValue = ((Float) zog.b.get(str)).floatValue();
        String str2 = "android:scale:height";
        float floatValue2 = ((Float) zog.b.get(str2)).floatValue();
        float floatValue3 = ((Float) zog2.b.get(str)).floatValue();
        float floatValue4 = ((Float) zog2.b.get(str2)).floatValue();
        if (floatValue3 == MapboxConstants.MINIMUM_ZOOM || floatValue4 == MapboxConstants.MINIMUM_ZOOM) {
            return null;
        }
        View view = zog2.a;
        floatValue /= floatValue3;
        floatValue2 /= floatValue4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{floatValue, 1.3f, 1.0f}));
        arrayList.add(ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{floatValue2, 1.3f, 1.0f}));
        return zof.a(arrayList);
    }

    public final void a(zog zog) {
        zol.d(zog);
    }

    public final void b(zog zog) {
        zol.d(zog);
    }
}
