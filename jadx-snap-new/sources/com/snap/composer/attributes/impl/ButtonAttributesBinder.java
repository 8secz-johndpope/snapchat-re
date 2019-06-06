package com.snap.composer.attributes.impl;

import android.content.Context;
import android.view.ViewGroup.LayoutParams;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.AttributesBindingContext;
import com.snap.composer.views.ComposerButton;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;

public final class ButtonAttributesBinder implements AttributesBinder<ComposerButton> {
    private final ajxe a = ajxh.a(new a(this));
    private final Context b;

    static final class a extends akcs implements akbk<ComposerButton> {
        private /* synthetic */ ButtonAttributesBinder a;

        a(ButtonAttributesBinder buttonAttributesBinder) {
            this.a = buttonAttributesBinder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ComposerButton composerButton = new ComposerButton(this.a.b);
            composerButton.setLayoutParams(new LayoutParams(-2, -2));
            return composerButton;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ButtonAttributesBinder.class), "placeholderView", "getPlaceholderView()Lcom/snap/composer/views/ComposerButton;");
    }

    public ButtonAttributesBinder(Context context) {
        akcr.b(context, "context");
        this.b = context;
    }

    public final void bindAttributes(AttributesBindingContext<ComposerButton> attributesBindingContext) {
        akcr.b(attributesBindingContext, "attributesBindingContext");
    }

    public final ComposerButton getMeasurerPlaceholderView() {
        return (ComposerButton) this.a.b();
    }

    public final Class<ComposerButton> getViewClass() {
        return ComposerButton.class;
    }
}
