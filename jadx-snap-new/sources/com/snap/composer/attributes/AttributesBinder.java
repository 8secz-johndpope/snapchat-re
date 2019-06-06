package com.snap.composer.attributes;

import android.view.View;

public interface AttributesBinder<T extends View> {
    void bindAttributes(AttributesBindingContext<? extends T> attributesBindingContext);

    T getMeasurerPlaceholderView();

    Class<T> getViewClass();
}
