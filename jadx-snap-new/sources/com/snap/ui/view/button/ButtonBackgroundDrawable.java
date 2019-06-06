package com.snap.ui.view.button;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import com.snapchat.android.R;
import defpackage.akco;
import defpackage.akcr;

public final class ButtonBackgroundDrawable extends ShapeDrawable {
    public ButtonBackgroundDrawable(Context context, int i, boolean z) {
        akcr.b(context, "context");
        if (z) {
            float dimension = context.getResources().getDimension(R.dimen.button_radius);
            setShape(new RoundRectShape(new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension}, null, null));
        } else {
            setShape(new RectShape());
        }
        Object paint = getPaint();
        akcr.a(paint, "paint");
        paint.setColor(i);
    }

    public /* synthetic */ ButtonBackgroundDrawable(Context context, int i, boolean z, int i2, akco akco) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        this(context, i, z);
    }
}
