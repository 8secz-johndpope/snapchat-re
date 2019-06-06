package defpackage;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: ej */
final class ej implements el {
    ej() {
    }

    public final PropertyValuesHolder a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofFloat(new eh(property, path), new float[]{MapboxConstants.MINIMUM_ZOOM, 1.0f});
    }
}
