package com.snapchat.client.composer;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class AttributesBindingContext {

    static final class CppProxy extends AttributesBindingContext {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = AttributesBindingContext.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_bindBooleanAttribute(long j, String str, boolean z, BooleanAttributeHandler booleanAttributeHandler);

        private native void native_bindBorderAttribute(long j, String str, boolean z, BorderAttributeHandler borderAttributeHandler);

        private native void native_bindColorAttribute(long j, String str, boolean z, ColorAttributeHandler colorAttributeHandler);

        private native void native_bindCompositeAttribute(long j, String str, ArrayList<CompositeAttributePart> arrayList, UntypedAttributeHandler untypedAttributeHandler);

        private native void native_bindDoubleAttribute(long j, String str, boolean z, DoubleAttributeHandler doubleAttributeHandler);

        private native void native_bindFlexBoxAttribute(long j, String str, boolean z, FlexBoxAttributeHandler flexBoxAttributeHandler);

        private native void native_bindIntAttribute(long j, String str, boolean z, IntAttributeHandler intAttributeHandler);

        private native void native_bindPercentAttribute(long j, String str, boolean z, PercentAttributeHandler percentAttributeHandler);

        private native void native_bindStringAttribute(long j, String str, boolean z, StringAttributeHandler stringAttributeHandler);

        private native void native_bindUntypedAttribute(long j, String str, boolean z, UntypedAttributeHandler untypedAttributeHandler);

        private native void native_registerPreprocessor(long j, String str, AttributePreprocessor attributePreprocessor);

        public final void bindBooleanAttribute(String str, boolean z, BooleanAttributeHandler booleanAttributeHandler) {
            native_bindBooleanAttribute(this.nativeRef, str, z, booleanAttributeHandler);
        }

        public final void bindBorderAttribute(String str, boolean z, BorderAttributeHandler borderAttributeHandler) {
            native_bindBorderAttribute(this.nativeRef, str, z, borderAttributeHandler);
        }

        public final void bindColorAttribute(String str, boolean z, ColorAttributeHandler colorAttributeHandler) {
            native_bindColorAttribute(this.nativeRef, str, z, colorAttributeHandler);
        }

        public final void bindCompositeAttribute(String str, ArrayList<CompositeAttributePart> arrayList, UntypedAttributeHandler untypedAttributeHandler) {
            native_bindCompositeAttribute(this.nativeRef, str, arrayList, untypedAttributeHandler);
        }

        public final void bindDoubleAttribute(String str, boolean z, DoubleAttributeHandler doubleAttributeHandler) {
            native_bindDoubleAttribute(this.nativeRef, str, z, doubleAttributeHandler);
        }

        public final void bindFlexBoxAttribute(String str, boolean z, FlexBoxAttributeHandler flexBoxAttributeHandler) {
            native_bindFlexBoxAttribute(this.nativeRef, str, z, flexBoxAttributeHandler);
        }

        public final void bindIntAttribute(String str, boolean z, IntAttributeHandler intAttributeHandler) {
            native_bindIntAttribute(this.nativeRef, str, z, intAttributeHandler);
        }

        public final void bindPercentAttribute(String str, boolean z, PercentAttributeHandler percentAttributeHandler) {
            native_bindPercentAttribute(this.nativeRef, str, z, percentAttributeHandler);
        }

        public final void bindStringAttribute(String str, boolean z, StringAttributeHandler stringAttributeHandler) {
            native_bindStringAttribute(this.nativeRef, str, z, stringAttributeHandler);
        }

        public final void bindUntypedAttribute(String str, boolean z, UntypedAttributeHandler untypedAttributeHandler) {
            native_bindUntypedAttribute(this.nativeRef, str, z, untypedAttributeHandler);
        }

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final void registerPreprocessor(String str, AttributePreprocessor attributePreprocessor) {
            native_registerPreprocessor(this.nativeRef, str, attributePreprocessor);
        }
    }

    public abstract void bindBooleanAttribute(String str, boolean z, BooleanAttributeHandler booleanAttributeHandler);

    public abstract void bindBorderAttribute(String str, boolean z, BorderAttributeHandler borderAttributeHandler);

    public abstract void bindColorAttribute(String str, boolean z, ColorAttributeHandler colorAttributeHandler);

    public abstract void bindCompositeAttribute(String str, ArrayList<CompositeAttributePart> arrayList, UntypedAttributeHandler untypedAttributeHandler);

    public abstract void bindDoubleAttribute(String str, boolean z, DoubleAttributeHandler doubleAttributeHandler);

    public abstract void bindFlexBoxAttribute(String str, boolean z, FlexBoxAttributeHandler flexBoxAttributeHandler);

    public abstract void bindIntAttribute(String str, boolean z, IntAttributeHandler intAttributeHandler);

    public abstract void bindPercentAttribute(String str, boolean z, PercentAttributeHandler percentAttributeHandler);

    public abstract void bindStringAttribute(String str, boolean z, StringAttributeHandler stringAttributeHandler);

    public abstract void bindUntypedAttribute(String str, boolean z, UntypedAttributeHandler untypedAttributeHandler);

    public abstract void registerPreprocessor(String str, AttributePreprocessor attributePreprocessor);
}
