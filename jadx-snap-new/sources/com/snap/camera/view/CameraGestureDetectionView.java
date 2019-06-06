package com.snap.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.achm;
import defpackage.akcr;

public final class CameraGestureDetectionView extends View implements achm {
    public Supplier<Float> a;

    public CameraGestureDetectionView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet);
        Object ofInstance = Suppliers.ofInstance(Float.valueOf(1.0f));
        akcr.a(ofInstance, "Suppliers.ofInstance(1.0f)");
        this.a = ofInstance;
    }

    public final boolean a() {
        return ((Number) this.a.get()).floatValue() > 1.16f;
    }
}
