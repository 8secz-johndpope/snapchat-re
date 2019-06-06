package com.snap.composer.attributes;

import android.view.View;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.nativebridge.ComposerViewManager;
import com.snapchat.client.composer.CompositeAttributePart;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akbm;
import defpackage.akbw;
import defpackage.akca;
import defpackage.akcr;
import java.util.ArrayList;

public final class AttributesBindingContext<T extends View> {
    private final Class<T> a;
    private final com.snapchat.client.composer.AttributesBindingContext b;
    private final ComposerViewManager c;

    public AttributesBindingContext(Class<T> cls, com.snapchat.client.composer.AttributesBindingContext attributesBindingContext, ComposerViewManager composerViewManager) {
        akcr.b(cls, "viewClass");
        akcr.b(attributesBindingContext, "bindingContext");
        akcr.b(composerViewManager, "viewManager");
        this.a = cls;
        this.b = attributesBindingContext;
        this.c = composerViewManager;
    }

    public final void bindActionAttribute(String str, akbw<? super T, ? super ComposerAction, ajxw> akbw, akbl<? super T, ajxw> akbl) {
        akcr.b(str, "attribute");
        akcr.b(akbw, "apply");
        akcr.b(akbl, "reset");
        getBindingContext().bindUntypedAttribute(str, false, new AttributesBindingContext$bindActionAttribute$$inlined$bindUntypedAttribute$1(akbl, akbw));
    }

    public final void bindArrayAttribute(String str, boolean z, akca<? super T, ? super Object[], ? super ComposerAnimator, ajxw> akca, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(akca, "apply");
        akcr.b(akbw, "reset");
        getBindingContext().bindUntypedAttribute(str, z, new AttributesBindingContext$bindArrayAttribute$$inlined$bindUntypedAttribute$1(akbw, akca));
    }

    public final void bindBooleanAttribute(String str, boolean z, akca<? super T, ? super Boolean, ? super ComposerAnimator, ajxw> akca, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(akca, "apply");
        akcr.b(akbw, "reset");
        getBindingContext().bindBooleanAttribute(str, z, new AttributesBindingContext$bindBooleanAttribute$1(akca, akbw));
    }

    public final void bindColorAttribute(String str, boolean z, akca<? super T, ? super Integer, ? super ComposerAnimator, ajxw> akca, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(akca, "apply");
        akcr.b(akbw, "reset");
        getBindingContext().bindColorAttribute(str, z, new AttributesBindingContext$bindColorAttribute$1(akca, akbw));
    }

    public final void bindCompositeAttribute(String str, ArrayList<CompositeAttributePart> arrayList, akca<? super T, Object, ? super ComposerAnimator, ajxw> akca, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(arrayList, "parts");
        akcr.b(akca, "apply");
        akcr.b(akbw, "reset");
        getBindingContext().bindCompositeAttribute(str, arrayList, new AttributesBindingContext$bindCompositeAttribute$1(akca, akbw));
    }

    public final void bindCornersAttribute(String str, boolean z, akbm<? super T, ? super Float, ? super Boolean, ? super Float, ? super Boolean, ? super Float, ? super Boolean, ? super Float, ? super Boolean, ? super ComposerAnimator, ajxw> akbm, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(akbm, "apply");
        akcr.b(akbw, "reset");
        getBindingContext().bindBorderAttribute(str, z, new AttributesBindingContext$bindCornersAttribute$1(akbm, akbw));
    }

    public final void bindFlexBoxAttribute(String str, boolean z, akca<? super T, ? super Float, ? super ComposerAnimator, ajxw> akca, akca<? super T, ? super Float, ? super ComposerAnimator, ajxw> akca2, akbw<? super T, ? super ComposerAnimator, ajxw> akbw, akbw<? super T, ? super ComposerAnimator, ajxw> akbw2) {
        akcr.b(str, "attribute");
        akcr.b(akca, "applyPercent");
        akcr.b(akca2, "applyRaw");
        akcr.b(akbw, "applyAuto");
        akcr.b(akbw2, "reset");
        getBindingContext().bindFlexBoxAttribute(str, z, new AttributesBindingContext$bindFlexBoxAttribute$1(akca, akca2, akbw, akbw2));
    }

    public final void bindFloatAttribute(String str, boolean z, akca<? super T, ? super Float, ? super ComposerAnimator, ajxw> akca, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(akca, "apply");
        akcr.b(akbw, "reset");
        getBindingContext().bindDoubleAttribute(str, z, new AttributesBindingContext$bindFloatAttribute$1(akca, akbw));
    }

    public final void bindIntAttribute(String str, boolean z, akca<? super T, ? super Integer, ? super ComposerAnimator, ajxw> akca, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(akca, "apply");
        akcr.b(akbw, "reset");
        getBindingContext().bindIntAttribute(str, z, new AttributesBindingContext$bindIntAttribute$1(akca, akbw));
    }

    public final void bindPercentAttribute(String str, boolean z, akca<? super T, ? super Float, ? super ComposerAnimator, ajxw> akca, akca<? super T, ? super Float, ? super ComposerAnimator, ajxw> akca2, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(akca, "applyPercent");
        akcr.b(akca2, "applyRaw");
        akcr.b(akbw, "reset");
        getBindingContext().bindPercentAttribute(str, z, new AttributesBindingContext$bindPercentAttribute$1(akca, akca2, akbw));
    }

    public final void bindStringAttribute(String str, boolean z, akca<? super T, ? super String, ? super ComposerAnimator, ajxw> akca, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(akca, "apply");
        akcr.b(akbw, "reset");
        getBindingContext().bindStringAttribute(str, z, new AttributesBindingContext$bindStringAttribute$1(akca, akbw));
    }

    public final void bindUntypedAttribute(String str, boolean z, akbw<? super T, Object, ajxw> akbw, akbl<? super T, ajxw> akbl) {
        akcr.b(str, "attribute");
        akcr.b(akbw, "apply");
        akcr.b(akbl, "reset");
        getBindingContext().bindUntypedAttribute(str, z, new AttributesBindingContext$bindUntypedAttribute$1(akbw, akbl));
    }

    public final void bindUntypedAttribute(String str, boolean z, akca<? super T, Object, ? super ComposerAnimator, ajxw> akca, akbw<? super T, ? super ComposerAnimator, ajxw> akbw) {
        akcr.b(str, "attribute");
        akcr.b(akca, "apply");
        akcr.b(akbw, "reset");
        getBindingContext().bindUntypedAttribute(str, z, new AttributesBindingContext$bindUntypedAttribute$2(akca, akbw));
    }

    public final com.snapchat.client.composer.AttributesBindingContext getBindingContext() {
        return this.b;
    }
}
