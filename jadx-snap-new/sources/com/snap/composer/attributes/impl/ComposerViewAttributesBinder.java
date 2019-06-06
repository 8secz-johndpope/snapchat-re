package com.snap.composer.attributes.impl;

import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.AttributesBindingContext;
import com.snap.composer.views.ComposerView;
import defpackage.akcr;

public final class ComposerViewAttributesBinder implements AttributesBinder<ComposerView> {
    public final void bindAttributes(AttributesBindingContext<? extends ComposerView> attributesBindingContext) {
        akcr.b(attributesBindingContext, "attributesBindingContext");
    }

    public final ComposerView getMeasurerPlaceholderView() {
        return null;
    }

    public final Class<ComposerView> getViewClass() {
        return ComposerView.class;
    }
}
