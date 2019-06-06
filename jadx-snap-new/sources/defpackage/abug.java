package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.ArcShape;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abug */
public final class abug {
    public static float a(long j) {
        return Math.min(Math.max(1.0f - (((float) (System.currentTimeMillis() - j)) / 8.64E7f), MapboxConstants.MINIMUM_ZOOM), 1.0f);
    }

    public static ShapeDrawable a(float f, int i, int i2) {
        int round = Math.round((1.0f - f) * 24.0f);
        if (round == 24) {
            round--;
        }
        round *= 15;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new ArcShape((float) ((round - 360) + 270), (float) (360 - round)));
        shapeDrawable.getPaint().setColor(i);
        shapeDrawable.setIntrinsicHeight(i2);
        shapeDrawable.setIntrinsicWidth(i2);
        return shapeDrawable;
    }
}
