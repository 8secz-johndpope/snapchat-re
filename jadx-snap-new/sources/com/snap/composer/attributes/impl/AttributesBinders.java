package com.snap.composer.attributes.impl;

import android.content.Context;
import android.view.View;
import com.snap.composer.ComposerViewLoaderManager;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.impl.richtext.RichTextConverter;
import com.snap.composer.logger.Logger;
import defpackage.akcr;

public final class AttributesBinders {
    public static final AttributesBinders INSTANCE = new AttributesBinders();

    private AttributesBinders() {
    }

    public final void registerAttributesBinders(ComposerViewLoaderManager composerViewLoaderManager) {
        akcr.b(composerViewLoaderManager, "manager");
        Context context = composerViewLoaderManager.getContext();
        Logger logger = composerViewLoaderManager.getLogger();
        AttributesBinder attributesBinderForClass = composerViewLoaderManager.getAttributesBinderForClass(View.class);
        if (!(attributesBinderForClass instanceof ViewAttributesBinder)) {
            attributesBinderForClass = null;
        }
        ViewAttributesBinder viewAttributesBinder = (ViewAttributesBinder) attributesBinderForClass;
        if (viewAttributesBinder == null) {
            viewAttributesBinder = new ViewAttributesBinder(context, logger);
        }
        TextViewAttributesBinder textViewAttributesBinder = new TextViewAttributesBinder(context, new RichTextConverter(composerViewLoaderManager.getFontCache()));
        composerViewLoaderManager.registerAttributesBinder(textViewAttributesBinder);
        composerViewLoaderManager.registerAttributesBinder(new EditTextAttributesBinder(context, textViewAttributesBinder));
        composerViewLoaderManager.registerAttributesBinder(new ImageViewAttributesBinder(context, viewAttributesBinder));
        composerViewLoaderManager.registerAttributesBinder(new SpinnerViewAttributesBinder());
    }
}
