package com.snap.composer.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView.ScaleType;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.composer.actions.ComposerAction;
import com.snap.composer.utils.CanvasClipper;
import com.snap.imageloading.view.SnapImageView;
import defpackage.abpq;
import defpackage.akco;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public class ComposerImageView extends SnapImageView implements ComposerClippableView, ComposerRecyclableView {
    public static final Companion Companion = new Companion();
    private static final Map<Uri, abpq> imageSizeByURI = new LinkedHashMap();
    private final ComposerImageView$attribution$1 attribution = new ComposerImageView$attribution$1();
    private boolean clipToBounds = true;
    private final CanvasClipper clipper = new CanvasClipper();
    private Drawable composerDrawable;
    private Object currentSrc;
    private Uri currentUri;
    private boolean currentUriIsRemote;
    private boolean flipOnRtl;
    private boolean isMeasurerPlaceholder;
    private final Paint paint = new Paint();
    private float resolvedHeightScale = 1.0f;
    private float resolvedWidthScale = 1.0f;
    private final Rect targetDrawRect = new Rect(0, 0, 0, 0);
    private final Matrix transformationMatrix = new Matrix();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public static final /* synthetic */ void access$updateImageSize(Companion companion, Uri uri, int i, int i2) {
            abpq abpq = (abpq) ComposerImageView.imageSizeByURI.get(uri);
            if (abpq == null || abpq.a() != i || abpq.b() != i2) {
                ComposerImageView.imageSizeByURI.put(uri, new abpq(i, i2));
            }
        }
    }

    public ComposerImageView(Context context) {
        akcr.b(context, "context");
        super(context, null, 0, null, 14, null);
        setScaleType(ScaleType.FIT_XY);
    }

    public static /* synthetic */ void loadSrc$default(ComposerImageView composerImageView, Object obj, ComposerAction composerAction, Integer num, boolean z, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 2) != 0) {
                composerAction = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            composerImageView.loadSrc(obj, composerAction, num, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadSrc");
    }

    private final void resolveScale(float f, float f2) {
        if (getScaleType() == ScaleType.CENTER_CROP) {
            f = Math.max(f, f2);
            this.resolvedWidthScale = f;
            this.resolvedHeightScale = f;
            return;
        }
        if (getScaleType() != ScaleType.CENTER) {
            if (getScaleType() == ScaleType.FIT_XY) {
                this.resolvedWidthScale = f;
                this.resolvedHeightScale = f2;
                return;
            } else if (getScaleType() == ScaleType.CENTER_INSIDE) {
                f = Math.min(f, f2);
                this.resolvedWidthScale = f;
                this.resolvedHeightScale = f;
                return;
            }
        }
        this.resolvedWidthScale = 1.0f;
        this.resolvedHeightScale = 1.0f;
    }

    private final boolean shouldFlipHorizontally() {
        return this.flipOnRtl && getLayoutDirection() == 1;
    }

    private final void startRemoteUrlLoadIfNeeded() {
        Object obj = this.currentUri;
        if (obj != null && this.currentUriIsRemote) {
            int a = akcr.a(getImageUri(), obj) ^ 1;
            int width = getWidth();
            int height = getHeight();
            if (!(getRequestOptions().b == width && getRequestOptions().c == height)) {
                Object f = getRequestOptions().a().a(width, height, false).b();
                akcr.a(f, "requestOptions\n         …                 .build()");
                setRequestOptions(f);
                a = 1;
            }
            if (a != 0) {
                setImageUri(obj, this.attribution);
            }
        }
    }

    private final void updateMatrixAndDrawRectForDrawable(BitmapDrawable bitmapDrawable) {
        Object bitmap = bitmapDrawable.getBitmap();
        String str = "drawable.bitmap";
        akcr.a(bitmap, str);
        int width = bitmap.getWidth();
        Object bitmap2 = bitmapDrawable.getBitmap();
        akcr.a(bitmap2, str);
        int height = bitmap2.getHeight();
        float f = (float) width;
        float f2 = (float) height;
        if (getScaleType() != ScaleType.CENTER_CROP && getScaleType() != ScaleType.CENTER && getScaleType() != ScaleType.FIT_XY && getScaleType() != ScaleType.CENTER_INSIDE) {
            this.targetDrawRect.set(0, 0, getWidth(), getHeight());
            this.transformationMatrix.reset();
            if (shouldFlipHorizontally()) {
                this.transformationMatrix.preScale(-1.0f, 1.0f, f / 2.0f, MapboxConstants.MINIMUM_ZOOM);
            }
            if (this.paint.getShader() != null) {
                this.paint.getShader().setLocalMatrix(this.transformationMatrix);
            }
        } else if (width == 0 || height == 0) {
            this.targetDrawRect.set(0, 0, 0, 0);
        } else {
            float width2 = (float) getWidth();
            float height2 = (float) getHeight();
            resolveScale(width2 / f, height2 / f2);
            this.transformationMatrix.reset();
            if (shouldFlipHorizontally()) {
                this.transformationMatrix.preScale(-1.0f, 1.0f, f / 2.0f, MapboxConstants.MINIMUM_ZOOM);
            }
            this.transformationMatrix.postTranslate((-f) / 2.0f, (-f2) / 2.0f);
            this.transformationMatrix.postScale(this.resolvedWidthScale, this.resolvedHeightScale);
            this.transformationMatrix.postTranslate(width2 / 2.0f, height2 / 2.0f);
            if (getClipper().getHasNonNullCornerRadius()) {
                this.targetDrawRect.set(0, 0, getWidth(), getHeight());
            } else {
                int width3 = getWidth() - ((int) (this.resolvedWidthScale * f));
                height = getHeight() - ((int) (this.resolvedHeightScale * f2));
                if (getClipToBounds()) {
                    width3 = Math.max(width3, 0);
                    height = Math.max(height, 0);
                }
                width3 /= 2;
                height /= 2;
                this.targetDrawRect.set(width3, height, getWidth() - width3, getHeight() - height);
            }
            if (this.paint.getShader() != null) {
                this.paint.getShader().setLocalMatrix(this.transformationMatrix);
            }
        }
    }

    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public boolean getClipToBoundsDefaultValue() {
        return true;
    }

    public CanvasClipper getClipper() {
        return this.clipper;
    }

    public final boolean isMeasurerPlaceholder() {
        return this.isMeasurerPlaceholder;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:65:0x0195 in {2, 3, 8, 9, 12, 15, 18, 27, 30, 36, 38, 40, 41, 45, 53, 55, 59, 60, 61, 62, 64} preds:[]
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
    public final void loadSrc(java.lang.Object r11, com.snap.composer.actions.ComposerAction r12, java.lang.Integer r13, boolean r14) {
        /*
        r10 = this;
        r10.currentSrc = r11;
        r0 = 0;
        r10.currentUri = r0;
        if (r13 == 0) goto L_0x001a;
        r1 = r10.paint;
        r2 = new android.graphics.PorterDuffColorFilter;
        r13 = r13.intValue();
        r3 = android.graphics.PorterDuff.Mode.SRC_ATOP;
        r2.<init>(r13, r3);
        r2 = (android.graphics.ColorFilter) r2;
        r1.setColorFilter(r2);
        goto L_0x001f;
        r13 = r10.paint;
        r13.setColorFilter(r0);
        r13 = defpackage.jxj.d;
        r1 = "ViewBitmapLoader.DEFAULT_LISTENER";
        defpackage.akcr.a(r13, r1);
        r10.setRequestListener(r13);
        r13 = r11 instanceof android.graphics.drawable.Drawable;
        r1 = 1;
        r2 = 0;
        if (r13 == 0) goto L_0x0040;
        r11 = (android.graphics.drawable.Drawable) r11;
        r10.setImageDrawable(r11);
        if (r12 == 0) goto L_0x003f;
        r11 = new java.lang.Boolean[r1];
        r13 = java.lang.Boolean.TRUE;
        r11[r2] = r13;
        r12.perform(r11);
        return;
        r13 = new akdd$e;
        r13.<init>();
        r9 = new akdd$a;
        r9.<init>();
        r9.a = r2;
        if (r11 != 0) goto L_0x0052;
        r13.a = r0;
        goto L_0x011b;
        r0 = r11 instanceof java.lang.Number;
        if (r0 == 0) goto L_0x0062;
        r0 = r11;
        r0 = (java.lang.Number) r0;
        r0 = r0.intValue();
        r0 = defpackage.jxp.a(r0);
        goto L_0x004e;
        r0 = r11 instanceof android.net.Uri;
        if (r0 == 0) goto L_0x006a;
        r0 = r11;
        r0 = (android.net.Uri) r0;
        goto L_0x004e;
        r0 = r11 instanceof java.lang.String;
        if (r0 == 0) goto L_0x018b;
        r0 = r11;
        r0 = (java.lang.String) r0;
        r3 = "http://";
        r3 = defpackage.akgb.b(r0, r3, r2);
        if (r3 != 0) goto L_0x0113;
        r3 = "https://";
        r3 = defpackage.akgb.b(r0, r3, r2);
        if (r3 != 0) goto L_0x0113;
        r3 = "content://";
        r3 = defpackage.akgb.b(r0, r3, r2);
        if (r3 == 0) goto L_0x008b;
        goto L_0x0113;
        r3 = r11;	 Catch:{ NumberFormatException -> 0x009b }
        r3 = (java.lang.String) r3;	 Catch:{ NumberFormatException -> 0x009b }
        r3 = java.lang.Double.parseDouble(r3);	 Catch:{ NumberFormatException -> 0x009b }
        r3 = (int) r3;	 Catch:{ NumberFormatException -> 0x009b }
        r3 = defpackage.jxp.a(r3);	 Catch:{ NumberFormatException -> 0x009b }
        r13.a = r3;	 Catch:{ NumberFormatException -> 0x009b }
        goto L_0x011b;
        r3 = 45;
        r4 = 95;
        r0 = defpackage.akgb.a(r0, r3, r4);
        r3 = r10.getContext();
        r4 = "context";
        defpackage.akcr.a(r3, r4);
        r3 = r3.getResources();
        r5 = r10.getContext();
        defpackage.akcr.a(r5, r4);
        r5 = r5.getPackageName();
        r6 = "drawable";
        r3 = r3.getIdentifier(r0, r6, r5);
        if (r3 != 0) goto L_0x00f9;
        r0 = (java.lang.CharSequence) r0;
        r5 = new char[r1];
        r7 = 58;
        r5[r2] = r7;
        r0 = defpackage.akgc.b(r0, r5);
        r5 = r0;
        r5 = (java.util.Collection) r5;
        r5 = r5.isEmpty();
        r1 = r1 ^ r5;
        if (r1 == 0) goto L_0x00f9;
        r0 = defpackage.ajyu.h(r0);
        r0 = (java.lang.String) r0;
        r1 = r10.getContext();
        defpackage.akcr.a(r1, r4);
        r1 = r1.getResources();
        r3 = r10.getContext();
        defpackage.akcr.a(r3, r4);
        r3 = r3.getPackageName();
        r3 = r1.getIdentifier(r0, r6, r3);
        if (r3 == 0) goto L_0x0101;
        r0 = defpackage.jxp.a(r3);
        goto L_0x004e;
        r12 = new com.snap.composer.exceptions.AttributeError;
        r11 = java.lang.String.valueOf(r11);
        r13 = "Did not find Image drawable named ";
        r11 = r13.concat(r11);
        r12.<init>(r11);
        r12 = (java.lang.Throwable) r12;
        throw r12;
        r0 = android.net.Uri.parse(r0);
        r13.a = r0;
        r9.a = r1;
        r0 = r13.a;
        r0 = (android.net.Uri) r0;
        if (r0 != 0) goto L_0x0125;
        r10.clear();
        return;
        r0 = new com.snap.composer.views.ComposerImageView$loadSrc$1;
        r3 = r0;
        r4 = r10;
        r5 = r11;
        r6 = r9;
        r7 = r13;
        r8 = r12;
        r3.<init>(r4, r5, r6, r7, r8);
        r0 = (defpackage.jxj.a) r0;
        r10.setRequestListener(r0);
        r11 = r13.a;
        r11 = (android.net.Uri) r11;
        r10.currentUri = r11;
        r11 = r9.a;
        r10.currentUriIsRemote = r11;
        r10.flipOnRtl = r14;
        r11 = r10.isMeasurerPlaceholder;
        if (r11 != 0) goto L_0x018a;
        r11 = r9.a;
        if (r11 == 0) goto L_0x0157;
        r11 = r10.isLayoutRequested();
        if (r11 != 0) goto L_0x0153;
        r10.startRemoteUrlLoadIfNeeded();
        return;
        r10.clear();
        return;
        r11 = r10.getRequestOptions();
        r11 = r11.b;
        if (r11 != 0) goto L_0x0167;
        r11 = r10.getRequestOptions();
        r11 = r11.c;
        if (r11 == 0) goto L_0x017f;
        r11 = r10.getRequestOptions();
        r11 = r11.a();
        r11 = r11.a(r2, r2);
        r11 = r11.b();
        r12 = "requestOptions.buildUpon…setSizeHint(0, 0).build()";
        defpackage.akcr.a(r11, r12);
        r10.setRequestOptions(r11);
        r11 = r13.a;
        r11 = (android.net.Uri) r11;
        r12 = r10.attribution;
        r12 = (defpackage.idl) r12;
        r10.setImageUri(r11, r12);
        return;
        r11 = new com.snap.composer.exceptions.AttributeError;
        r12 = "Unsupported value";
        r11.<init>(r12);
        r11 = (java.lang.Throwable) r11;
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.views.ComposerImageView.loadSrc(java.lang.Object, com.snap.composer.actions.ComposerAction, java.lang.Integer, boolean):void");
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            Drawable drawable = this.composerDrawable;
            if (!(drawable == null || this.paint.getShader() == null)) {
                if (drawable instanceof BitmapDrawable) {
                    updateMatrixAndDrawRectForDrawable((BitmapDrawable) drawable);
                }
                if (getClipper().getHasNonNullCornerRadius()) {
                    canvas.drawPath(getClipper().getPath(this.targetDrawRect), this.paint);
                    return;
                }
                canvas.drawRect(this.targetDrawRect, this.paint);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        startRemoteUrlLoadIfNeeded();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    public void onMeasure(int r7, int r8) {
        /*
        r6 = this;
        r0 = r6.isMeasurerPlaceholder;
        r1 = 0;
        if (r0 == 0) goto L_0x0021;
    L_0x0005:
        r0 = r6.currentUri;
        if (r0 == 0) goto L_0x0021;
    L_0x0009:
        r2 = imageSizeByURI;
        if (r0 != 0) goto L_0x0010;
    L_0x000d:
        defpackage.akcr.a();
    L_0x0010:
        r0 = r2.get(r0);
        r0 = (defpackage.abpq) r0;
        if (r0 == 0) goto L_0x002e;
    L_0x0018:
        r1 = r0.a();
        r0 = r0.b();
        goto L_0x002f;
    L_0x0021:
        r0 = r6.composerDrawable;
        if (r0 == 0) goto L_0x002e;
    L_0x0025:
        r1 = r0.getIntrinsicWidth();
        r0 = r0.getIntrinsicHeight();
        goto L_0x002f;
    L_0x002e:
        r0 = 0;
    L_0x002f:
        r2 = android.view.View.MeasureSpec.getSize(r7);
        r7 = android.view.View.MeasureSpec.getMode(r7);
        r3 = android.view.View.MeasureSpec.getSize(r8);
        r8 = android.view.View.MeasureSpec.getMode(r8);
        r4 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        r5 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r7 != r5) goto L_0x0047;
    L_0x0045:
        r1 = r2;
        goto L_0x004d;
    L_0x0047:
        if (r7 != r4) goto L_0x004d;
    L_0x0049:
        r1 = java.lang.Math.min(r1, r2);
    L_0x004d:
        if (r8 != r5) goto L_0x0051;
    L_0x004f:
        r0 = r3;
        goto L_0x0057;
    L_0x0051:
        if (r8 != r4) goto L_0x0057;
    L_0x0053:
        r0 = java.lang.Math.min(r0, r3);
    L_0x0057:
        r6.setMeasuredDimension(r1, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.composer.views.ComposerImageView.onMeasure(int, int):void");
    }

    public boolean prepareForRecycling() {
        return true;
    }

    public void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public void setImageDrawable(Drawable drawable) {
        if ((akcr.a((Object) drawable, this.composerDrawable) ^ 1) != 0) {
            this.composerDrawable = drawable;
            if (drawable instanceof BitmapDrawable) {
                Paint paint = this.paint;
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                TileMode tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            } else {
                this.paint.setShader(null);
            }
            invalidate();
        }
    }

    public final void setMeasurerPlaceholder(boolean z) {
        this.isMeasurerPlaceholder = z;
    }
}
