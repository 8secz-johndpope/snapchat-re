package com.snap.composer.attributes.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.TextView;
import com.brightcove.player.captioning.TTMLParser.Attributes;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.attributes.AttributesBinder;
import com.snap.composer.attributes.AttributesBindingContext;
import com.snap.composer.attributes.impl.animations.ComposerAnimator;
import com.snap.composer.attributes.impl.richtext.RichTextConverter;
import com.snap.composer.attributes.impl.richtext.TextAttributes;
import com.snap.composer.attributes.impl.richtext.TextDecoration;
import com.snap.composer.views.ComposerTextView;
import com.snapchat.client.composer.AttributeType;
import com.snapchat.client.composer.CompositeAttributePart;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajym;
import defpackage.ajyn;
import defpackage.akbk;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class TextViewAttributesBinder implements AttributesBinder<ComposerTextView> {
    public static final Companion Companion = new Companion();
    private static final ArrayList<CompositeAttributePart> e;
    private static final List<String> f;
    private final float a;
    private final ajxe b = ajxh.a(new a(this));
    private final Context c;
    private final RichTextConverter d;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final ArrayList<CompositeAttributePart> getSPANNABLE_TEXT_ATTRIBUTE_PARTS() {
            return TextViewAttributesBinder.e;
        }

        public final List<String> getSPANNABLE_TEXT_COMPOSITE_ATTRIBUTE_NAMES() {
            return TextViewAttributesBinder.f;
        }
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Alignment.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Alignment.ALIGN_NORMAL.ordinal()] = 1;
            $EnumSwitchMapping$0[Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            $EnumSwitchMapping$0[Alignment.ALIGN_CENTER.ordinal()] = 3;
            iArr = new int[TextDecoration.values().length];
            $EnumSwitchMapping$1 = iArr;
            iArr[TextDecoration.UNDERLINE.ordinal()] = 1;
            $EnumSwitchMapping$1[TextDecoration.STRIKETHROUGH.ordinal()] = 2;
            $EnumSwitchMapping$1[TextDecoration.NONE.ordinal()] = 3;
        }
    }

    static final class a extends akcs implements akbk<ComposerTextView> {
        private /* synthetic */ TextViewAttributesBinder a;

        a(TextViewAttributesBinder textViewAttributesBinder) {
            this.a = textViewAttributesBinder;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ComposerTextView composerTextView = new ComposerTextView(this.a.c);
            composerTextView.setLayoutParams(new LayoutParams(-2, -2));
            return composerTextView;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(TextViewAttributesBinder.class), "placeholderView", "getPlaceholderView()Lcom/snap/composer/views/ComposerTextView;");
        CompositeAttributePart[] compositeAttributePartArr = new CompositeAttributePart[11];
        compositeAttributePartArr[0] = new CompositeAttributePart("value", AttributeType.UNTYPED, true, true);
        compositeAttributePartArr[1] = new CompositeAttributePart("color", AttributeType.COLOR, true, false);
        compositeAttributePartArr[2] = new CompositeAttributePart(Attributes.FONT_SIZE, AttributeType.INT, true, true);
        compositeAttributePartArr[3] = new CompositeAttributePart(Attributes.TEXT_DECORATION, AttributeType.STRING, true, false);
        compositeAttributePartArr[4] = new CompositeAttributePart(Attributes.TEXT_ALIGN, AttributeType.STRING, true, false);
        compositeAttributePartArr[5] = new CompositeAttributePart(Attributes.FONT_FAMILY, AttributeType.STRING, true, true);
        compositeAttributePartArr[6] = new CompositeAttributePart("fontName", AttributeType.STRING, true, true);
        compositeAttributePartArr[7] = new CompositeAttributePart("font", AttributeType.STRING, true, true);
        compositeAttributePartArr[8] = new CompositeAttributePart(Attributes.FONT_STYLE, AttributeType.STRING, true, true);
        compositeAttributePartArr[9] = new CompositeAttributePart(Attributes.FONT_WEIGHT, AttributeType.STRING, true, true);
        compositeAttributePartArr[10] = new CompositeAttributePart("lineHeight", AttributeType.DOUBLE, true, true);
        ArrayList d = ajym.d(compositeAttributePartArr);
        e = d;
        Iterable<CompositeAttributePart> iterable = d;
        Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        for (CompositeAttributePart attribute : iterable) {
            arrayList.add(attribute.getAttribute());
        }
        f = (List) arrayList;
    }

    public TextViewAttributesBinder(Context context, RichTextConverter richTextConverter) {
        akcr.b(context, "context");
        akcr.b(richTextConverter, "textConverter");
        this.c = context;
        this.d = richTextConverter;
        Object resources = this.c.getResources();
        akcr.a(resources, "context.resources");
        this.a = resources.getDisplayMetrics().scaledDensity;
    }

    private static TextAttributes a(TextView textView) {
        return textView instanceof Button ? TextAttributes.Companion.getButtonDefault() : TextAttributes.Companion.getDefault();
    }

    private static void a(TextView textView, int i) {
        textView.setPaintFlags(i | ((textView.getPaintFlags() & -9) & -17));
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    private final void a(android.widget.TextView r6, com.snap.composer.attributes.impl.richtext.TextAttributes r7) {
        /*
        r5 = this;
        r0 = r5.d;
        r0 = r0.getFontCache();
        r0 = r7.resolveTypeface(r0);
        r6.setTypeface(r0);
        r0 = r7.getFontSize();
        r0 = (float) r0;
        r1 = 1;
        r6.setTextSize(r1, r0);
        r0 = r7.getColor();
        r6.setTextColor(r0);
        r0 = r7.getAlignment();
        r2 = com.snap.composer.attributes.impl.TextViewAttributesBinder.WhenMappings.$EnumSwitchMapping$0;
        r0 = r0.ordinal();
        r0 = r2[r0];
        r2 = 3;
        r3 = 2;
        if (r0 == r1) goto L_0x0031;
    L_0x002d:
        if (r0 == r3) goto L_0x0035;
    L_0x002f:
        if (r0 == r2) goto L_0x0033;
    L_0x0031:
        r0 = 2;
        goto L_0x0036;
    L_0x0033:
        r0 = 4;
        goto L_0x0036;
    L_0x0035:
        r0 = 3;
    L_0x0036:
        r6.setTextAlignment(r0);
        r0 = r7.getTextDecoration();
        r4 = 0;
        if (r0 == 0) goto L_0x0067;
    L_0x0040:
        r7 = r7.getTextDecoration();
        if (r7 != 0) goto L_0x0049;
    L_0x0046:
        defpackage.akcr.a();
    L_0x0049:
        r0 = com.snap.composer.attributes.impl.TextViewAttributesBinder.WhenMappings.$EnumSwitchMapping$1;
        r7 = r7.ordinal();
        r7 = r0[r7];
        if (r7 == r1) goto L_0x0063;
    L_0x0053:
        if (r7 == r3) goto L_0x005e;
    L_0x0055:
        if (r7 != r2) goto L_0x0058;
    L_0x0057:
        goto L_0x0067;
    L_0x0058:
        r6 = new ajxk;
        r6.<init>();
        throw r6;
    L_0x005e:
        r7 = 16;
        r4 = 16;
        goto L_0x0067;
    L_0x0063:
        r7 = 8;
        r4 = 8;
    L_0x0067:
        a(r6, r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.TextViewAttributesBinder.a(android.widget.TextView, com.snap.composer.attributes.impl.richtext.TextAttributes):void");
    }

    public final void applyAdjustsFontSizeToFitWidth(TextView textView, boolean z, ComposerAnimator composerAnimator) {
        akcr.b(textView, "view");
    }

    public final void applyIncludeFontPadding(TextView textView, boolean z, ComposerAnimator composerAnimator) {
        akcr.b(textView, "view");
        textView.setIncludeFontPadding(z);
    }

    @TargetApi(21)
    public final void applyLetterSpacing(TextView textView, float f, ComposerAnimator composerAnimator) {
        akcr.b(textView, "view");
        if (VERSION.SDK_INT >= 21) {
            textView.setLetterSpacing(f / (textView.getTextSize() / this.a));
        }
    }

    public final void applyNumberOfLines(TextView textView, int i, ComposerAnimator composerAnimator) {
        akcr.b(textView, "view");
        if (i <= 0) {
            textView.setMaxLines(Integer.MAX_VALUE);
        } else {
            textView.setMaxLines(i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:75:0x016d in {2, 8, 13, 14, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 50, 53, 56, 59, 62, 65, 67, 68, 71, 72, 74} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final void applySpannableString(android.widget.TextView r34, java.lang.Object r35, com.snap.composer.attributes.impl.animations.ComposerAnimator r36) {
        /*
        r33 = this;
        r0 = r33;
        r1 = r34;
        r2 = "view";
        defpackage.akcr.b(r1, r2);
        r2 = r35;
        r3 = r2 instanceof java.lang.Object[];
        if (r3 != 0) goto L_0x0010;
        r2 = 0;
        r2 = (java.lang.Object[]) r2;
        if (r2 == 0) goto L_0x0163;
        r3 = 0;
        r5 = r2[r3];
        r6 = a(r34);
        r7 = r5 instanceof java.lang.String;
        r8 = 1;
        if (r7 != 0) goto L_0x0059;
        if (r5 != 0) goto L_0x0023;
        goto L_0x0059;
        r4 = new java.util.LinkedHashMap;
        r4.<init>();
        r4 = (java.util.Map) r4;
        r7 = f;
        r7 = r7.size();
        if (r8 >= r7) goto L_0x0049;
        r9 = r2[r8];
        r10 = f;
        r10 = r10.get(r8);
        r10 = (java.lang.String) r10;
        if (r9 == 0) goto L_0x0046;
        r11 = "attribute";
        defpackage.akcr.a(r10, r11);
        r4.put(r10, r9);
        r8 = r8 + 1;
        goto L_0x0030;
        a(r1, r3);
        r2 = r0.d;
        r2 = r2.parseTextJson(r5, r4, r6);
        r2 = (java.lang.CharSequence) r2;
        r1.setText(r2);
        goto L_0x0162;
        r3 = r2[r8];
        r7 = r3 instanceof java.lang.Long;
        if (r7 != 0) goto L_0x0060;
        r3 = 0;
        r3 = (java.lang.Long) r3;
        r7 = 2;
        r7 = r2[r7];
        r8 = r7 instanceof java.lang.Integer;
        if (r8 != 0) goto L_0x006a;
        r7 = 0;
        r19 = r7;
        r19 = (java.lang.Integer) r19;
        r7 = 3;
        r7 = r2[r7];
        r8 = r7 instanceof java.lang.String;
        if (r8 != 0) goto L_0x0076;
        r7 = 0;
        r15 = r7;
        r15 = (java.lang.String) r15;
        r7 = 4;
        r7 = r2[r7];
        r8 = r7 instanceof java.lang.String;
        if (r8 != 0) goto L_0x0081;
        r7 = 0;
        r14 = r7;
        r14 = (java.lang.String) r14;
        r7 = 5;
        r7 = r2[r7];
        r8 = r7 instanceof java.lang.String;
        if (r8 != 0) goto L_0x008c;
        r7 = 0;
        r13 = r7;
        r13 = (java.lang.String) r13;
        r7 = 6;
        r7 = r2[r7];
        r8 = r7 instanceof java.lang.String;
        if (r8 != 0) goto L_0x0097;
        r7 = 0;
        r12 = r7;
        r12 = (java.lang.String) r12;
        r7 = 7;
        r7 = r2[r7];
        r8 = r7 instanceof java.lang.String;
        if (r8 != 0) goto L_0x00a2;
        r7 = 0;
        r11 = r7;
        r11 = (java.lang.String) r11;
        r7 = 8;
        r7 = r2[r7];
        r8 = r7 instanceof java.lang.String;
        if (r8 != 0) goto L_0x00ae;
        r7 = 0;
        r10 = r7;
        r10 = (java.lang.String) r10;
        r7 = 9;
        r7 = r2[r7];
        r8 = r7 instanceof java.lang.String;
        if (r8 != 0) goto L_0x00ba;
        r7 = 0;
        r9 = r7;
        r9 = (java.lang.String) r9;
        r7 = 10;
        r2 = r2[r7];
        r7 = r2 instanceof java.lang.Double;
        if (r7 != 0) goto L_0x00c6;
        r2 = 0;
        r2 = (java.lang.Double) r2;
        r7 = 0;
        r8 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 0;
        r20 = 0;
        r21 = 0;
        r22 = 0;
        r23 = 0;
        r24 = 0;
        r25 = 1023; // 0x3ff float:1.434E-42 double:5.054E-321;
        r26 = 0;
        r4 = r9;
        r9 = r16;
        r27 = r10;
        r10 = r17;
        r28 = r11;
        r11 = r18;
        r29 = r12;
        r12 = r20;
        r30 = r13;
        r13 = r21;
        r31 = r14;
        r14 = r22;
        r32 = r15;
        r15 = r23;
        r16 = r24;
        r17 = r25;
        r18 = r26;
        r6 = com.snap.composer.attributes.impl.richtext.TextAttributes.copy$default(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
        if (r3 == 0) goto L_0x0112;
        r7 = com.snap.composer.attributes.conversions.ColorConversions.Companion;
        r8 = r3.longValue();
        r3 = r7.fromRGBA(r8);
        r6.setColor(r3);
        if (r19 == 0) goto L_0x011b;
        r3 = r19.intValue();
        r6.setFontSize(r3);
        r7 = r32;
        if (r7 == 0) goto L_0x0122;
        r6.applyTextDecoration(r7);
        r7 = r31;
        if (r7 == 0) goto L_0x0129;
        r6.applyTextAlign(r7);
        r7 = r30;
        r6.setFontFamily(r7);
        r7 = r29;
        r6.setFontName(r7);
        if (r4 == 0) goto L_0x0138;
        r6.applyFontWeight(r4);
        r7 = r27;
        if (r7 == 0) goto L_0x013f;
        r6.applyFontStyle(r7);
        r7 = r28;
        if (r7 == 0) goto L_0x0146;
        r6.applyFont(r7);
        if (r2 == 0) goto L_0x0152;
        r2 = r2.doubleValue();
        r2 = (float) r2;
        r4 = java.lang.Float.valueOf(r2);
        goto L_0x0153;
        r4 = 0;
        r6.setLineHeight(r4);
        r0.a(r1, r6);
        if (r5 == 0) goto L_0x0162;
        r5 = (java.lang.String) r5;
        r5 = (java.lang.CharSequence) r5;
        r1.setText(r5);
        return;
        r1 = new com.snap.composer.exceptions.AttributeError;
        r2 = "Expecting array for spannable string";
        r1.<init>(r2);
        r1 = (java.lang.Throwable) r1;
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.attributes.impl.TextViewAttributesBinder.applySpannableString(android.widget.TextView, java.lang.Object, com.snap.composer.attributes.impl.animations.ComposerAnimator):void");
    }

    public final void bindAttributes(AttributesBindingContext<ComposerTextView> attributesBindingContext) {
        akcr.b(attributesBindingContext, "attributesBindingContext");
        String str = "spannableText";
        attributesBindingContext.getBindingContext().bindCompositeAttribute(str, e, new TextViewAttributesBinder$bindAttributes$$inlined$bindCompositeAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindDoubleAttribute("letterSpacing", true, new TextViewAttributesBinder$bindAttributes$$inlined$bindFloatAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindIntAttribute("numberOfLines", true, new TextViewAttributesBinder$bindAttributes$$inlined$bindIntAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("includeFontPadding", true, new TextViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$1(this, this));
        attributesBindingContext.getBindingContext().bindBooleanAttribute("adjustsFontSizeToFitWidth", true, new TextViewAttributesBinder$bindAttributes$$inlined$bindBooleanAttribute$2(this, this));
    }

    public final ComposerTextView getMeasurerPlaceholderView() {
        return (ComposerTextView) this.b.b();
    }

    public final Class<ComposerTextView> getViewClass() {
        return ComposerTextView.class;
    }

    public final void resetAdjustFontSizeToFitWidth(TextView textView, ComposerAnimator composerAnimator) {
        akcr.b(textView, "view");
    }

    public final void resetIncludeFontPadding(TextView textView, ComposerAnimator composerAnimator) {
        akcr.b(textView, "view");
        textView.setIncludeFontPadding(false);
    }

    @TargetApi(21)
    public final void resetLetterSpacing(TextView textView, ComposerAnimator composerAnimator) {
        akcr.b(textView, "view");
        if (VERSION.SDK_INT >= 21) {
            textView.setLetterSpacing(MapboxConstants.MINIMUM_ZOOM);
        }
    }

    public final void resetNumberOfLines(TextView textView, ComposerAnimator composerAnimator) {
        akcr.b(textView, "view");
        textView.setMaxLines(1);
    }

    public final void resetSpannableString(TextView textView, ComposerAnimator composerAnimator) {
        akcr.b(textView, "view");
        a(textView, a(textView));
        textView.setText(null);
    }
}
