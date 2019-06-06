package com.snap.ui.view.stackdraw;

import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.text.BoringLayout;
import android.text.BoringLayout.Metrics;
import android.text.DynamicLayout;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.stackdraw.StackDrawLayout.LayoutParams;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxj;
import defpackage.ajxt;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import java.lang.reflect.Constructor;

public final class TextHolder extends ItemHolder {
    public static final Companion Companion = new Companion();
    public static final int EMS = 1;
    public static final int LINES = 1;
    public static final int PIXELS = 2;
    private static final Metrics UNKNOWN_BORING = new Metrics();
    private static final ajxe staticLayoutConstructor$delegate = ajxh.a(ajxj.PUBLICATION, TextHolder$Companion$staticLayoutConstructor$2.INSTANCE);
    private final TextConfiguration configuration;
    private Layout layout;
    private Metrics mBoring;
    private int mDesiredHeightAtMeasure = -1;
    private TruncateAt mEllipsize = TruncateAt.END;
    private final boolean mIncludePad = this.configuration.getIncludeFontPadding();
    private int mMaxMode = 1;
    private int mMaxWidth = Integer.MAX_VALUE;
    private int mMaxWidthMode = 2;
    private int mMaximum = this.configuration.getMaxLines();
    private int mMinMode = 1;
    private int mMinWidth;
    private int mMinWidthMode = 2;
    private int mMinimum;
    private int mOldMaxMode = this.mMaxMode;
    private int mOldMaximum = this.mMaximum;
    private final boolean mSingleLine;
    private float mSpacingAdd;
    private float mSpacingMult = 1.0f;
    private TextDirectionHeuristic mTextDir;
    private final TextPaint paint;
    private BoringLayout savedBoringLayout;
    private CharSequence text;

    public static final class Companion {
        static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(Companion.class), "staticLayoutConstructor", "getStaticLayoutConstructor()Ljava/lang/reflect/Constructor;")};

        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final Constructor<StaticLayout> getStaticLayoutConstructor() {
            return (Constructor) TextHolder.staticLayoutConstructor$delegate.b();
        }

        public final Metrics getUNKNOWN_BORING() {
            return TextHolder.UNKNOWN_BORING;
        }
    }

    public TextHolder(StackDrawLayout stackDrawLayout, LayoutParams layoutParams, TextConfiguration textConfiguration) {
        akcr.b(stackDrawLayout, "container");
        akcr.b(layoutParams, "lp");
        akcr.b(textConfiguration, Event.CONFIGURATION);
        super(stackDrawLayout, layoutParams);
        this.configuration = textConfiguration;
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(this.configuration.getTypeface());
        textPaint.setTextSize(this.configuration.getTextSize());
        textPaint.setColor(this.configuration.getTextColor());
        textPaint.setStyle(Style.FILL);
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(this.configuration.getTextAlign());
        if (this.configuration.getShadowRadius() > MapboxConstants.MINIMUM_ZOOM) {
            textPaint.setShadowLayer(this.configuration.getShadowRadius(), this.configuration.getShadowDx(), this.configuration.getShadowDy(), this.configuration.getShadowColor());
        }
        this.paint = textPaint;
    }

    private final void checkForRelayout() {
        nullLayouts();
        requestLayout();
        invalidate();
    }

    private final int desired(Layout layout) {
        int lineCount = layout.getLineCount();
        CharSequence text = layout.getText();
        int i = lineCount - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (text.charAt(layout.getLineEnd(i2) - 1) != 10) {
                return -1;
            }
        }
        float f = MapboxConstants.MINIMUM_ZOOM;
        for (int i3 = 0; i3 < lineCount; i3++) {
            f = Math.max(f, layout.getLineWidth(i3));
        }
        return (int) Math.ceil((double) f);
    }

    private final int getCompoundPaddingBottom() {
        return 0;
    }

    private final int getCompoundPaddingLeft() {
        return 0;
    }

    private final int getCompoundPaddingRight() {
        return 0;
    }

    private final int getCompoundPaddingTop() {
        return 0;
    }

    private final int getDesiredHeight() {
        return getDesiredHeight(this.layout, true);
    }

    private final int getDesiredHeight(Layout layout, boolean z) {
        if (layout == null) {
            return 0;
        }
        int height = layout.getHeight();
        int lineCount = layout.getLineCount();
        int compoundPaddingTop = getCompoundPaddingTop() + getCompoundPaddingBottom();
        height += compoundPaddingTop;
        if (this.mMaxMode != 1) {
            height = Math.min(height, this.mMaximum);
        } else if (z && lineCount > this.mMaximum && ((layout instanceof DynamicLayout) || (layout instanceof BoringLayout))) {
            height = layout.getLineTop(this.mMaximum) + compoundPaddingTop;
            lineCount = this.mMaximum;
        }
        if (this.mMinMode != 1) {
            height = Math.max(height, this.mMinimum);
        } else if (lineCount < this.mMinimum) {
            height += getLineHeight() * (this.mMinimum - lineCount);
        }
        return Math.max(height, getSuggestedMinimumHeight());
    }

    private final Alignment getLayoutAlignment() {
        return Alignment.ALIGN_NORMAL;
    }

    private final int getLineHeight() {
        return Math.round((((float) this.paint.getFontMetricsInt(null)) * this.mSpacingMult) + this.mSpacingAdd);
    }

    private final CharSequence getMTransformed() {
        CharSequence charSequence = this.text;
        return charSequence == null ? "" : charSequence;
    }

    private final Metrics isBoring(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, Metrics metrics) {
        return (textDirectionHeuristic == null || !textDirectionHeuristic.isRtl(charSequence, 0, charSequence.length())) ? BoringLayout.isBoring(charSequence, textPaint, metrics) : null;
    }

    private final void nullLayouts() {
        Layout layout = this.layout;
        if (layout instanceof BoringLayout) {
            if (layout != null) {
                this.savedBoringLayout = (BoringLayout) layout;
            } else {
                throw new ajxt("null cannot be cast to non-null type android.text.BoringLayout");
            }
        }
        this.layout = null;
        this.mBoring = null;
    }

    public final void draw(Canvas canvas) {
        akcr.b(canvas, "canvas");
        canvas.save();
        canvas.translate((float) getItemBounds().left, (float) getItemBounds().top);
        Layout layout = this.layout;
        if (layout != null) {
            layout.draw(canvas);
        }
        canvas.restore();
    }

    public final TextConfiguration getConfiguration() {
        return this.configuration;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final TextPaint getPaint() {
        return this.paint;
    }

    public final BoringLayout getSavedBoringLayout() {
        return this.savedBoringLayout;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.configuration.getTextColor();
    }

    /* Access modifiers changed, original: protected|final */
    public final TextDirectionHeuristic getTextDirectionHeuristic() {
        Object obj = 1;
        if (getContainer().getLayoutDirection() != 1) {
            obj = null;
        }
        String str = "TextDirectionHeuristics.FIRSTSTRONG_RTL";
        String str2 = "TextDirectionHeuristics.FIRSTSTRONG_LTR";
        Object obj2;
        switch (getContainer().getTextDirection()) {
            case 1:
                if (obj != null) {
                    obj2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    akcr.a(obj2, str);
                    return obj2;
                }
                obj2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                akcr.a(obj2, str2);
                return obj2;
            case 2:
                obj2 = TextDirectionHeuristics.ANYRTL_LTR;
                akcr.a(obj2, "TextDirectionHeuristics.ANYRTL_LTR");
                return obj2;
            case 3:
                obj2 = TextDirectionHeuristics.LTR;
                akcr.a(obj2, "TextDirectionHeuristics.LTR");
                return obj2;
            case 4:
                obj2 = TextDirectionHeuristics.RTL;
                akcr.a(obj2, "TextDirectionHeuristics.RTL");
                return obj2;
            case 5:
                obj2 = TextDirectionHeuristics.LOCALE;
                akcr.a(obj2, "TextDirectionHeuristics.LOCALE");
                return obj2;
            case 6:
                obj2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                akcr.a(obj2, str2);
                return obj2;
            case 7:
                obj2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                akcr.a(obj2, str);
                return obj2;
            default:
                if (obj != null) {
                    obj2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    akcr.a(obj2, str);
                    return obj2;
                }
                obj2 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                akcr.a(obj2, str2);
                return obj2;
        }
    }

    public final float getTextSize() {
        return this.configuration.getTextSize();
    }

    public final void makeNewLayout(int i, Metrics metrics, int i2) {
        this.mOldMaximum = this.mMaximum;
        this.mOldMaxMode = this.mMaxMode;
        int i3 = i < 0 ? 0 : i;
        Alignment layoutAlignment = getLayoutAlignment();
        Object obj = (this.mSingleLine && this.layout != null && (layoutAlignment == Alignment.ALIGN_NORMAL || layoutAlignment == Alignment.ALIGN_OPPOSITE)) ? 1 : null;
        if (obj != null) {
            Layout layout = this.layout;
            if (layout == null) {
                akcr.a();
            }
            layout.getParagraphDirection(0);
        }
        boolean z = this.mEllipsize != null;
        TruncateAt truncateAt = this.mEllipsize;
        if (this.mTextDir == null) {
            this.mTextDir = getTextDirectionHeuristic();
        }
        this.layout = makeSingleLayout(i3, metrics, i2, layoutAlignment, z, truncateAt, truncateAt == this.mEllipsize);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ca  */
    public final android.text.Layout makeSingleLayout(int r18, android.text.BoringLayout.Metrics r19, int r20, android.text.Layout.Alignment r21, boolean r22, android.text.TextUtils.TruncateAt r23, boolean r24) {
        /*
        r17 = this;
        r0 = r17;
        r12 = r18;
        r13 = r20;
        r14 = r21;
        r15 = r23;
        r1 = "alignment";
        defpackage.akcr.b(r14, r1);
        r1 = UNKNOWN_BORING;
        r2 = r19;
        if (r2 != r1) goto L_0x0029;
    L_0x0015:
        r1 = r17.getMTransformed();
        r2 = r0.paint;
        r3 = r0.mTextDir;
        r4 = r0.mBoring;
        r1 = r0.isBoring(r1, r2, r3, r4);
        if (r1 == 0) goto L_0x0027;
    L_0x0025:
        r0.mBoring = r1;
    L_0x0027:
        r8 = r1;
        goto L_0x002a;
    L_0x0029:
        r8 = r2;
    L_0x002a:
        if (r8 == 0) goto L_0x00c7;
    L_0x002c:
        r1 = r8.width;
        if (r1 > r12) goto L_0x0080;
    L_0x0030:
        if (r15 == 0) goto L_0x0036;
    L_0x0032:
        r1 = r8.width;
        if (r1 > r13) goto L_0x0080;
    L_0x0036:
        if (r24 == 0) goto L_0x0056;
    L_0x0038:
        r1 = r0.savedBoringLayout;
        if (r1 == 0) goto L_0x0056;
    L_0x003c:
        if (r1 != 0) goto L_0x0041;
    L_0x003e:
        defpackage.akcr.a();
    L_0x0041:
        r2 = r17.getMTransformed();
        r3 = r0.paint;
        r6 = r0.mSpacingMult;
        r7 = r0.mSpacingAdd;
        r9 = r0.mIncludePad;
        r4 = r18;
        r5 = r21;
        r1 = r1.replaceOrMake(r2, r3, r4, r5, r6, r7, r8, r9);
        goto L_0x006c;
    L_0x0056:
        r1 = r17.getMTransformed();
        r2 = r0.paint;
        r5 = r0.mSpacingMult;
        r6 = r0.mSpacingAdd;
        r9 = r0.mIncludePad;
        r3 = r18;
        r4 = r21;
        r7 = r8;
        r8 = r9;
        r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8);
    L_0x006c:
        r1 = (android.text.Layout) r1;
        if (r24 == 0) goto L_0x00c8;
    L_0x0070:
        if (r1 == 0) goto L_0x0078;
    L_0x0072:
        r2 = r1;
        r2 = (android.text.BoringLayout) r2;
        r0.savedBoringLayout = r2;
        goto L_0x00c8;
    L_0x0078:
        r1 = new ajxt;
        r2 = "null cannot be cast to non-null type android.text.BoringLayout";
        r1.<init>(r2);
        throw r1;
    L_0x0080:
        if (r22 == 0) goto L_0x00c7;
    L_0x0082:
        r1 = r8.width;
        if (r1 > r12) goto L_0x00c7;
    L_0x0086:
        if (r24 == 0) goto L_0x00aa;
    L_0x0088:
        r1 = r0.savedBoringLayout;
        if (r1 == 0) goto L_0x00aa;
    L_0x008c:
        if (r1 != 0) goto L_0x0091;
    L_0x008e:
        defpackage.akcr.a();
    L_0x0091:
        r2 = r17.getMTransformed();
        r3 = r0.paint;
        r6 = r0.mSpacingMult;
        r7 = r0.mSpacingAdd;
        r9 = r0.mIncludePad;
        r4 = r18;
        r5 = r21;
        r10 = r23;
        r11 = r20;
        r1 = r1.replaceOrMake(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
        goto L_0x00c4;
    L_0x00aa:
        r1 = r17.getMTransformed();
        r2 = r0.paint;
        r5 = r0.mSpacingMult;
        r6 = r0.mSpacingAdd;
        r9 = r0.mIncludePad;
        r3 = r18;
        r4 = r21;
        r7 = r8;
        r8 = r9;
        r9 = r23;
        r10 = r20;
        r1 = android.text.BoringLayout.make(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);
    L_0x00c4:
        r1 = (android.text.Layout) r1;
        goto L_0x00c8;
    L_0x00c7:
        r1 = 0;
    L_0x00c8:
        if (r1 != 0) goto L_0x01dd;
    L_0x00ca:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 28;
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r4 = 1;
        r5 = 0;
        if (r1 < r2) goto L_0x0123;
    L_0x00d5:
        r1 = r17.getMTransformed();
        r2 = r17.getMTransformed();
        r2 = r2.length();
        r6 = r0.paint;
        r1 = android.text.StaticLayout.Builder.obtain(r1, r5, r2, r6, r12);
        r1 = r1.setAlignment(r14);
        r2 = r0.mTextDir;
        if (r2 != 0) goto L_0x00f2;
    L_0x00ef:
        defpackage.akcr.a();
    L_0x00f2:
        r1 = r1.setTextDirection(r2);
        r2 = r0.mSpacingAdd;
        r5 = r0.mSpacingMult;
        r1 = r1.setLineSpacing(r2, r5);
        r2 = r0.mIncludePad;
        r1 = r1.setIncludePad(r2);
        r2 = r0.mMaxMode;
        if (r2 != r4) goto L_0x010a;
    L_0x0108:
        r3 = r0.mMaximum;
    L_0x010a:
        r1 = r1.setMaxLines(r3);
        if (r22 == 0) goto L_0x0117;
    L_0x0110:
        r2 = r1.setEllipsize(r15);
        r2.setEllipsizedWidth(r13);
    L_0x0117:
        r1 = r1.build();
        r2 = "builder.build()";
        defpackage.akcr.a(r1, r2);
        r1 = (android.text.Layout) r1;
        return r1;
    L_0x0123:
        r2 = r17.getMTransformed();
        if (r22 == 0) goto L_0x01c3;
    L_0x0129:
        r1 = Companion;	 Catch:{ Exception -> 0x01a4 }
        r1 = r1.getStaticLayoutConstructor();	 Catch:{ Exception -> 0x01a4 }
        r6 = 13;
        r6 = new java.lang.Object[r6];	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r2;	 Catch:{ Exception -> 0x01a4 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ Exception -> 0x01a4 }
        r6[r4] = r5;	 Catch:{ Exception -> 0x01a4 }
        r5 = 2;
        r7 = r2.length();	 Catch:{ Exception -> 0x01a4 }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r7;	 Catch:{ Exception -> 0x01a4 }
        r5 = 3;
        r7 = r0.paint;	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r7;	 Catch:{ Exception -> 0x01a4 }
        r5 = 4;
        r7 = java.lang.Integer.valueOf(r18);	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r7;	 Catch:{ Exception -> 0x01a4 }
        r5 = 5;
        r6[r5] = r14;	 Catch:{ Exception -> 0x01a4 }
        r5 = 6;
        r7 = r0.mTextDir;	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r7;	 Catch:{ Exception -> 0x01a4 }
        r5 = 7;
        r7 = r0.mSpacingMult;	 Catch:{ Exception -> 0x01a4 }
        r7 = java.lang.Float.valueOf(r7);	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r7;	 Catch:{ Exception -> 0x01a4 }
        r5 = 8;
        r7 = r0.mSpacingAdd;	 Catch:{ Exception -> 0x01a4 }
        r7 = java.lang.Float.valueOf(r7);	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r7;	 Catch:{ Exception -> 0x01a4 }
        r5 = 9;
        r7 = r0.mIncludePad;	 Catch:{ Exception -> 0x01a4 }
        r7 = java.lang.Boolean.valueOf(r7);	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r7;	 Catch:{ Exception -> 0x01a4 }
        r5 = 10;
        r6[r5] = r15;	 Catch:{ Exception -> 0x01a4 }
        r5 = 11;
        r7 = java.lang.Integer.valueOf(r20);	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r7;	 Catch:{ Exception -> 0x01a4 }
        r5 = 12;
        r7 = r0.mMaxMode;	 Catch:{ Exception -> 0x01a4 }
        if (r7 != r4) goto L_0x018b;
    L_0x0189:
        r3 = r0.mMaximum;	 Catch:{ Exception -> 0x01a4 }
    L_0x018b:
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ Exception -> 0x01a4 }
        r6[r5] = r3;	 Catch:{ Exception -> 0x01a4 }
        r1 = r1.newInstance(r6);	 Catch:{ Exception -> 0x01a4 }
        if (r1 == 0) goto L_0x019c;
    L_0x0197:
        r1 = (android.text.StaticLayout) r1;	 Catch:{ Exception -> 0x01a4 }
        r1 = (android.text.Layout) r1;	 Catch:{ Exception -> 0x01a4 }
        return r1;
    L_0x019c:
        r1 = new ajxt;	 Catch:{ Exception -> 0x01a4 }
        r3 = "null cannot be cast to non-null type android.text.StaticLayout";
        r1.<init>(r3);	 Catch:{ Exception -> 0x01a4 }
        throw r1;	 Catch:{ Exception -> 0x01a4 }
    L_0x01a4:
        r16 = new android.text.StaticLayout;
        r3 = 0;
        r4 = r2.length();
        r5 = r0.paint;
        r8 = r0.mSpacingMult;
        r9 = r0.mSpacingAdd;
        r10 = r0.mIncludePad;
        r1 = r16;
        r6 = r18;
        r7 = r21;
        r11 = r23;
        r12 = r20;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r16 = (android.text.Layout) r16;
        return r16;
    L_0x01c3:
        r11 = new android.text.StaticLayout;
        r3 = 0;
        r4 = r2.length();
        r5 = r0.paint;
        r8 = r0.mSpacingMult;
        r9 = r0.mSpacingAdd;
        r10 = r0.mIncludePad;
        r1 = r11;
        r6 = r18;
        r7 = r21;
        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10);
        r1 = r11;
        r1 = (android.text.Layout) r1;
    L_0x01dd:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.stackdraw.TextHolder.makeSingleLayout(int, android.text.BoringLayout$Metrics, int, android.text.Layout$Alignment, boolean, android.text.TextUtils$TruncateAt, boolean):android.text.Layout");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:93:0x0187 in {4, 7, 8, 11, 18, 19, 20, 24, 25, 26, 30, 31, 33, 34, 37, 39, 42, 44, 47, 50, 51, 58, 59, 60, 69, 70, 71, 75, 76, 78, 81, 82, 84, 87, 88, 90, 92} preds:[]
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
    public final void onMeasure(int r17, int r18) {
        /*
        r16 = this;
        r1 = r16;
        r0 = android.view.View.MeasureSpec.getMode(r17);	 Catch:{ all -> 0x0185 }
        r2 = android.view.View.MeasureSpec.getMode(r18);	 Catch:{ all -> 0x0185 }
        r3 = android.view.View.MeasureSpec.getSize(r17);	 Catch:{ all -> 0x0185 }
        r4 = android.view.View.MeasureSpec.getSize(r18);	 Catch:{ all -> 0x0185 }
        r5 = new akdd$c;	 Catch:{ all -> 0x0185 }
        r5.<init>();	 Catch:{ all -> 0x0185 }
        r6 = UNKNOWN_BORING;	 Catch:{ all -> 0x0185 }
        r7 = r1.mTextDir;	 Catch:{ all -> 0x0185 }
        if (r7 != 0) goto L_0x0023;	 Catch:{ all -> 0x0185 }
        r7 = r16.getTextDirectionHeuristic();	 Catch:{ all -> 0x0185 }
        r1.mTextDir = r7;	 Catch:{ all -> 0x0185 }
        r7 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;	 Catch:{ all -> 0x0185 }
        if (r0 != r7) goto L_0x0029;	 Catch:{ all -> 0x0185 }
        r8 = (float) r3;	 Catch:{ all -> 0x0185 }
        goto L_0x002c;	 Catch:{ all -> 0x0185 }
        r8 = 2139095039; // 0x7f7fffff float:3.4028235E38 double:1.056853372E-314;	 Catch:{ all -> 0x0185 }
        r9 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x0185 }
        r11 = 0;	 Catch:{ all -> 0x0185 }
        r12 = 1;	 Catch:{ all -> 0x0185 }
        if (r0 != r9) goto L_0x0038;	 Catch:{ all -> 0x0185 }
        r5.a = r3;	 Catch:{ all -> 0x0185 }
        r10 = 0;	 Catch:{ all -> 0x0185 }
        r13 = -1;	 Catch:{ all -> 0x0185 }
        goto L_0x00ef;	 Catch:{ all -> 0x0185 }
        r13 = r1.layout;	 Catch:{ all -> 0x0185 }
        if (r13 == 0) goto L_0x004c;	 Catch:{ all -> 0x0185 }
        r13 = r1.mEllipsize;	 Catch:{ all -> 0x0185 }
        if (r13 != 0) goto L_0x004c;	 Catch:{ all -> 0x0185 }
        r13 = r1.layout;	 Catch:{ all -> 0x0185 }
        if (r13 != 0) goto L_0x0047;	 Catch:{ all -> 0x0185 }
        defpackage.akcr.a();	 Catch:{ all -> 0x0185 }
        r13 = r1.desired(r13);	 Catch:{ all -> 0x0185 }
        goto L_0x004d;	 Catch:{ all -> 0x0185 }
        r13 = -1;	 Catch:{ all -> 0x0185 }
        if (r13 >= 0) goto L_0x0063;	 Catch:{ all -> 0x0185 }
        r6 = r16.getMTransformed();	 Catch:{ all -> 0x0185 }
        r14 = r1.paint;	 Catch:{ all -> 0x0185 }
        r15 = r1.mTextDir;	 Catch:{ all -> 0x0185 }
        r10 = r1.mBoring;	 Catch:{ all -> 0x0185 }
        r6 = r1.isBoring(r6, r14, r15, r10);	 Catch:{ all -> 0x0185 }
        if (r6 == 0) goto L_0x0061;	 Catch:{ all -> 0x0185 }
        r1.mBoring = r6;	 Catch:{ all -> 0x0185 }
        r10 = 0;	 Catch:{ all -> 0x0185 }
        goto L_0x0064;	 Catch:{ all -> 0x0185 }
        r10 = 1;	 Catch:{ all -> 0x0185 }
        if (r6 == 0) goto L_0x0070;	 Catch:{ all -> 0x0185 }
        r14 = UNKNOWN_BORING;	 Catch:{ all -> 0x0185 }
        if (r6 != r14) goto L_0x006b;	 Catch:{ all -> 0x0185 }
        goto L_0x0070;	 Catch:{ all -> 0x0185 }
        r8 = r6.width;	 Catch:{ all -> 0x0185 }
        r5.a = r8;	 Catch:{ all -> 0x0185 }
        goto L_0x0091;	 Catch:{ all -> 0x0185 }
        if (r13 >= 0) goto L_0x008f;	 Catch:{ all -> 0x0185 }
        r8 = (int) r8;	 Catch:{ all -> 0x0185 }
        r13 = r16.getMTransformed();	 Catch:{ all -> 0x0185 }
        r14 = r16.getMTransformed();	 Catch:{ all -> 0x0185 }
        r14 = r14.length();	 Catch:{ all -> 0x0185 }
        r15 = r1.paint;	 Catch:{ all -> 0x0185 }
        r13 = android.text.Layout.getDesiredWidth(r13, r11, r14, r15);	 Catch:{ all -> 0x0185 }
        r13 = (double) r13;	 Catch:{ all -> 0x0185 }
        r13 = java.lang.Math.ceil(r13);	 Catch:{ all -> 0x0185 }
        r13 = (int) r13;	 Catch:{ all -> 0x0185 }
        r13 = java.lang.Math.min(r8, r13);	 Catch:{ all -> 0x0185 }
        r5.a = r13;	 Catch:{ all -> 0x0185 }
        r8 = r5.a;	 Catch:{ all -> 0x0185 }
        r14 = r16.getCompoundPaddingLeft();	 Catch:{ all -> 0x0185 }
        r15 = r16.getCompoundPaddingRight();	 Catch:{ all -> 0x0185 }
        r14 = r14 + r15;	 Catch:{ all -> 0x0185 }
        r8 = r8 + r14;	 Catch:{ all -> 0x0185 }
        r5.a = r8;	 Catch:{ all -> 0x0185 }
        r8 = r1.mMaxWidthMode;	 Catch:{ all -> 0x0185 }
        if (r8 != r12) goto L_0x00b3;	 Catch:{ all -> 0x0185 }
        r8 = r5.a;	 Catch:{ all -> 0x0185 }
        r14 = r1.mMaxWidth;	 Catch:{ all -> 0x0185 }
        r15 = r16.getLineHeight();	 Catch:{ all -> 0x0185 }
        r14 = r14 * r15;	 Catch:{ all -> 0x0185 }
        r8 = java.lang.Math.min(r8, r14);	 Catch:{ all -> 0x0185 }
        r5.a = r8;	 Catch:{ all -> 0x0185 }
        goto L_0x00bc;	 Catch:{ all -> 0x0185 }
        r8 = r5.a;	 Catch:{ all -> 0x0185 }
        r14 = r1.mMaxWidth;	 Catch:{ all -> 0x0185 }
        r8 = java.lang.Math.min(r8, r14);	 Catch:{ all -> 0x0185 }
        goto L_0x00b0;	 Catch:{ all -> 0x0185 }
        r8 = r1.mMinWidthMode;	 Catch:{ all -> 0x0185 }
        if (r8 != r12) goto L_0x00d0;	 Catch:{ all -> 0x0185 }
        r8 = r5.a;	 Catch:{ all -> 0x0185 }
        r14 = r1.mMinWidth;	 Catch:{ all -> 0x0185 }
        r15 = r16.getLineHeight();	 Catch:{ all -> 0x0185 }
        r14 = r14 * r15;	 Catch:{ all -> 0x0185 }
        r8 = java.lang.Math.max(r8, r14);	 Catch:{ all -> 0x0185 }
        r5.a = r8;	 Catch:{ all -> 0x0185 }
        goto L_0x00d9;	 Catch:{ all -> 0x0185 }
        r8 = r5.a;	 Catch:{ all -> 0x0185 }
        r14 = r1.mMinWidth;	 Catch:{ all -> 0x0185 }
        r8 = java.lang.Math.max(r8, r14);	 Catch:{ all -> 0x0185 }
        goto L_0x00cd;	 Catch:{ all -> 0x0185 }
        r8 = r5.a;	 Catch:{ all -> 0x0185 }
        r14 = r16.getSuggestedMinimumWidth();	 Catch:{ all -> 0x0185 }
        r8 = java.lang.Math.max(r8, r14);	 Catch:{ all -> 0x0185 }
        r5.a = r8;	 Catch:{ all -> 0x0185 }
        if (r0 != r7) goto L_0x00ef;	 Catch:{ all -> 0x0185 }
        r0 = r5.a;	 Catch:{ all -> 0x0185 }
        r0 = java.lang.Math.min(r3, r0);	 Catch:{ all -> 0x0185 }
        r5.a = r0;	 Catch:{ all -> 0x0185 }
        r0 = r5.a;	 Catch:{ all -> 0x0185 }
        r3 = r16.getCompoundPaddingLeft();	 Catch:{ all -> 0x0185 }
        r0 = r0 - r3;	 Catch:{ all -> 0x0185 }
        r3 = r16.getCompoundPaddingRight();	 Catch:{ all -> 0x0185 }
        r0 = r0 - r3;	 Catch:{ all -> 0x0185 }
        r3 = r1.layout;	 Catch:{ all -> 0x0185 }
        if (r3 != 0) goto L_0x010f;	 Catch:{ all -> 0x0185 }
        r3 = r5.a;	 Catch:{ all -> 0x0185 }
        r8 = r16.getCompoundPaddingLeft();	 Catch:{ all -> 0x0185 }
        r3 = r3 - r8;	 Catch:{ all -> 0x0185 }
        r8 = r16.getCompoundPaddingRight();	 Catch:{ all -> 0x0185 }
        r3 = r3 - r8;	 Catch:{ all -> 0x0185 }
        r1.makeNewLayout(r0, r6, r3);	 Catch:{ all -> 0x0185 }
        goto L_0x016b;	 Catch:{ all -> 0x0185 }
        r3 = r1.layout;	 Catch:{ all -> 0x0185 }
        if (r3 == 0) goto L_0x016b;	 Catch:{ all -> 0x0185 }
        r8 = r3.getWidth();	 Catch:{ all -> 0x0185 }
        if (r8 != r0) goto L_0x012e;	 Catch:{ all -> 0x0185 }
        r8 = r3.getEllipsizedWidth();	 Catch:{ all -> 0x0185 }
        r14 = r5.a;	 Catch:{ all -> 0x0185 }
        r15 = r16.getCompoundPaddingLeft();	 Catch:{ all -> 0x0185 }
        r14 = r14 - r15;	 Catch:{ all -> 0x0185 }
        r15 = r16.getCompoundPaddingRight();	 Catch:{ all -> 0x0185 }
        r14 = r14 - r15;	 Catch:{ all -> 0x0185 }
        if (r8 == r14) goto L_0x012c;	 Catch:{ all -> 0x0185 }
        goto L_0x012e;	 Catch:{ all -> 0x0185 }
        r8 = 0;	 Catch:{ all -> 0x0185 }
        goto L_0x012f;	 Catch:{ all -> 0x0185 }
        r8 = 1;	 Catch:{ all -> 0x0185 }
        r14 = r1.mEllipsize;	 Catch:{ all -> 0x0185 }
        if (r14 != 0) goto L_0x0145;	 Catch:{ all -> 0x0185 }
        r14 = r3.getWidth();	 Catch:{ all -> 0x0185 }
        if (r0 <= r14) goto L_0x0145;	 Catch:{ all -> 0x0185 }
        r14 = r3 instanceof android.text.BoringLayout;	 Catch:{ all -> 0x0185 }
        if (r14 != 0) goto L_0x0143;	 Catch:{ all -> 0x0185 }
        if (r10 == 0) goto L_0x0145;	 Catch:{ all -> 0x0185 }
        if (r13 < 0) goto L_0x0145;	 Catch:{ all -> 0x0185 }
        if (r13 > r0) goto L_0x0145;	 Catch:{ all -> 0x0185 }
        r10 = 1;	 Catch:{ all -> 0x0185 }
        goto L_0x0146;	 Catch:{ all -> 0x0185 }
        r10 = 0;	 Catch:{ all -> 0x0185 }
        r13 = r1.mMaxMode;	 Catch:{ all -> 0x0185 }
        r14 = r1.mOldMaxMode;	 Catch:{ all -> 0x0185 }
        if (r13 != r14) goto L_0x0152;	 Catch:{ all -> 0x0185 }
        r13 = r1.mMaximum;	 Catch:{ all -> 0x0185 }
        r14 = r1.mOldMaximum;	 Catch:{ all -> 0x0185 }
        if (r13 == r14) goto L_0x0153;	 Catch:{ all -> 0x0185 }
        r11 = 1;	 Catch:{ all -> 0x0185 }
        if (r8 != 0) goto L_0x0157;	 Catch:{ all -> 0x0185 }
        if (r11 == 0) goto L_0x016b;	 Catch:{ all -> 0x0185 }
        if (r11 != 0) goto L_0x015f;	 Catch:{ all -> 0x0185 }
        if (r10 == 0) goto L_0x015f;	 Catch:{ all -> 0x0185 }
        r3.increaseWidthTo(r0);	 Catch:{ all -> 0x0185 }
        goto L_0x016b;	 Catch:{ all -> 0x0185 }
        r3 = r5.a;	 Catch:{ all -> 0x0185 }
        r8 = r16.getCompoundPaddingLeft();	 Catch:{ all -> 0x0185 }
        r3 = r3 - r8;	 Catch:{ all -> 0x0185 }
        r8 = r16.getCompoundPaddingRight();	 Catch:{ all -> 0x0185 }
        goto L_0x010a;	 Catch:{ all -> 0x0185 }
        if (r2 != r9) goto L_0x0171;	 Catch:{ all -> 0x0185 }
        r0 = -1;	 Catch:{ all -> 0x0185 }
        r1.mDesiredHeightAtMeasure = r0;	 Catch:{ all -> 0x0185 }
        goto L_0x017f;	 Catch:{ all -> 0x0185 }
        r0 = r16.getDesiredHeight();	 Catch:{ all -> 0x0185 }
        r1.mDesiredHeightAtMeasure = r0;	 Catch:{ all -> 0x0185 }
        if (r2 != r7) goto L_0x017e;	 Catch:{ all -> 0x0185 }
        r4 = java.lang.Math.min(r0, r4);	 Catch:{ all -> 0x0185 }
        goto L_0x017f;	 Catch:{ all -> 0x0185 }
        r4 = r0;	 Catch:{ all -> 0x0185 }
        r0 = r5.a;	 Catch:{ all -> 0x0185 }
        r1.setMeasuredDimension(r0, r4);	 Catch:{ all -> 0x0185 }
        return;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.stackdraw.TextHolder.onMeasure(int, int):void");
    }

    public final void setLayout(Layout layout) {
        this.layout = layout;
    }

    public final void setSavedBoringLayout(BoringLayout boringLayout) {
        this.savedBoringLayout = boringLayout;
    }

    public final void setShadowLayer(float f, float f2, float f3, int i) {
        this.paint.setShadowLayer(f, f2, f3, i);
        this.configuration.setShadowRadius(f);
        this.configuration.setShadowDx(f2);
        this.configuration.setShadowDy(f3);
        this.configuration.setShadowColor(i);
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        this.text = charSequence;
        if (this.layout != null) {
            checkForRelayout();
        }
    }

    public final void setTextColor(int i) {
        if (this.configuration.getTextColor() != i) {
            this.configuration.setTextColor(i);
            this.paint.setColor(i);
            invalidate();
        }
    }

    public final void setTextSize(float f) {
        if (f != this.configuration.getTextSize()) {
            this.configuration.setTextSize(f);
            this.paint.setTextSize(f);
            if (this.layout != null) {
                nullLayouts();
                requestLayout();
                invalidate();
            }
        }
    }
}
