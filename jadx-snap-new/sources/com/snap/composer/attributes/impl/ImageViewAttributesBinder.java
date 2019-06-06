package com.snap.composer.attributes.impl;

import android.content.Context;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.AttributesBindingContext;
import com.snap.composer.attributes.conversions.ColorConversions;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.exceptions.AttributeError;
import com.snap.composer.views.ComposerImageView;
import com.snapchat.client.composer.AttributeType;
import com.snapchat.client.composer.CompositeAttributePart;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajym;
import defpackage.akbk;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;

public final class ImageViewAttributesBinder implements AttributesBinder<ComposerImageView> {
    public static final Companion Companion = new Companion();
    private final float a;
    private final ajxe b = ajxh.a(new a(this));
    private final Context c;
    private final ViewAttributesBinder d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }
    }

    static final class a extends akcs implements akbk<ComposerImageView> {
        private /* synthetic */ ImageViewAttributesBinder a;

        a(ImageViewAttributesBinder imageViewAttributesBinder) {
            this.a = imageViewAttributesBinder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ComposerImageView composerImageView = new ComposerImageView(this.a.c);
            composerImageView.setMeasurerPlaceholder(true);
            return composerImageView;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ImageViewAttributesBinder.class), "placeholderView", "getPlaceholderView()Lcom/snap/composer/views/ComposerImageView;");
        Object obj = new Object();
    }

    public ImageViewAttributesBinder(Context context, ViewAttributesBinder viewAttributesBinder) {
        akcr.b(context, "context");
        akcr.b(viewAttributesBinder, "viewAttributesBinder");
        this.c = context;
        this.d = viewAttributesBinder;
        Object resources = this.c.getResources();
        akcr.a(resources, "context.resources");
        this.a = resources.getDisplayMetrics().density;
    }

    /* JADX WARNING: Missing block: B:14:0x003d, code skipped:
            r1.setScaleType(r2);
     */
    /* JADX WARNING: Missing block: B:15:0x0040, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:17:0x004a, code skipped:
            throw new com.snap.composer.exceptions.AttributeError("Unsupported cover value");
     */
    public final void applyObjectFit(android.widget.ImageView r1, java.lang.String r2, com.snap.composer.attributes.impl.animations.ComposerAnimator r3) {
        /*
        r0 = this;
        r3 = "view";
        defpackage.akcr.b(r1, r3);
        r3 = "value";
        defpackage.akcr.b(r2, r3);
        r3 = r2.hashCode();
        switch(r3) {
            case 3143043: goto L_0x0033;
            case 3387192: goto L_0x0028;
            case 94852023: goto L_0x001d;
            case 951526612: goto L_0x0012;
            default: goto L_0x0011;
        };
    L_0x0011:
        goto L_0x0041;
    L_0x0012:
        r3 = "contain";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0041;
    L_0x001a:
        r2 = android.widget.ImageView.ScaleType.CENTER_INSIDE;
        goto L_0x003d;
    L_0x001d:
        r3 = "cover";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0041;
    L_0x0025:
        r2 = android.widget.ImageView.ScaleType.CENTER_CROP;
        goto L_0x003d;
    L_0x0028:
        r3 = "none";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0041;
    L_0x0030:
        r2 = android.widget.ImageView.ScaleType.CENTER;
        goto L_0x003d;
    L_0x0033:
        r3 = "fill";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0041;
    L_0x003b:
        r2 = android.widget.ImageView.ScaleType.FIT_XY;
    L_0x003d:
        r1.setScaleType(r2);
        return;
    L_0x0041:
        r1 = new com.snap.composer.exceptions.AttributeError;
        r2 = "Unsupported cover value";
        r1.<init>(r2);
        r1 = (java.lang.Throwable) r1;
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.ImageViewAttributesBinder.applyObjectFit(android.widget.ImageView, java.lang.String, com.snap.composer.attributes.impl.animations.ComposerAnimator):void");
    }

    public final void applySrcOnLoad(ComposerImageView composerImageView, Object obj, ComposerAnimator composerAnimator) {
        akcr.b(composerImageView, "view");
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length == 4) {
                Object obj2 = objArr[2];
                if (!(obj2 instanceof Long)) {
                    obj2 = null;
                }
                Long l = (Long) obj2;
                Integer valueOf = l != null ? Integer.valueOf(ColorConversions.Companion.fromRGBA(l.longValue())) : null;
                Object obj3 = objArr[3];
                if (!(obj3 instanceof Boolean)) {
                    obj3 = null;
                }
                Boolean bool = (Boolean) obj3;
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                Object obj4 = objArr[0];
                obj = objArr[1];
                if (!(obj instanceof ComposerAction)) {
                    obj = null;
                }
                composerImageView.loadSrc(obj4, (ComposerAction) obj, valueOf, booleanValue);
                return;
            }
            throw new AttributeError("srcOnLoad should have 4 values in the given array");
        }
        throw new AttributeError("srcOnLoad should be an array");
    }

    public final void bindAttributes(AttributesBindingContext<? extends ComposerImageView> attributesBindingContext) {
        akcr.b(attributesBindingContext, "attributesBindingContext");
        attributesBindingContext.getBindingContext().bindStringAttribute("objectFit", false, new ImageViewAttributesBinder$bindAttributes$$inlined$bindStringAttribute$1(this, this));
        r0 = new CompositeAttributePart[4];
        r0[0] = new CompositeAttributePart("src", AttributeType.STRING, true, true);
        r0[1] = new CompositeAttributePart("onLoad", AttributeType.UNTYPED, true, false);
        r0[2] = new CompositeAttributePart("tint", AttributeType.COLOR, true, false);
        r0[3] = new CompositeAttributePart("flipOnRtl", AttributeType.BOOLEAN, true, false);
        String str = "srcOnLoad";
        attributesBindingContext.getBindingContext().bindCompositeAttribute(str, ajym.d(r0), new ImageViewAttributesBinder$bindAttributes$$inlined$bindCompositeAttribute$1(this, this));
    }

    public final ComposerImageView getMeasurerPlaceholderView() {
        return (ComposerImageView) this.b.b();
    }

    public final Class<ComposerImageView> getViewClass() {
        return ComposerImageView.class;
    }

    public final void resetObjectFit(ImageView imageView, ComposerAnimator composerAnimator) {
        akcr.b(imageView, "view");
        imageView.setScaleType(ScaleType.FIT_XY);
    }

    public final void resetSrcOnLoad(ComposerImageView composerImageView, ComposerAnimator composerAnimator) {
        akcr.b(composerImageView, "view");
        composerImageView.loadSrc(null, null, null, false);
    }
}
