package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: ef */
interface ef {
    <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path);
}
