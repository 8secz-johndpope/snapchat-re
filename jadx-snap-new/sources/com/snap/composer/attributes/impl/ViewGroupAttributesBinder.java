package com.snap.composer.attributes.impl;

import android.view.ViewGroup;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.AttributesBindingContext;
import defpackage.akcr;

public final class ViewGroupAttributesBinder implements AttributesBinder<ViewGroup> {
    public final void bindAttributes(AttributesBindingContext<? extends ViewGroup> attributesBindingContext) {
        akcr.b(attributesBindingContext, "attributesBindingContext");
    }

    public final ViewGroup getMeasurerPlaceholderView() {
        return null;
    }

    public final Class<ViewGroup> getViewClass() {
        return ViewGroup.class;
    }
}
