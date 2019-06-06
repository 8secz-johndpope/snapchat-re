package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: ed */
final class ed implements ef {
    ed() {
    }

    public final <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofFloat(t, new eh(property, path), new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
    }
}
