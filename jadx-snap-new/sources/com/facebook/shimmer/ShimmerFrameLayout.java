package com.facebook.shimmer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;

public class ShimmerFrameLayout extends FrameLayout {
    private static final PorterDuffXfermode f = new PorterDuffXfermode(Mode.DST_IN);
    d a;
    boolean b;
    int c;
    int d;
    boolean e;
    private Paint g;
    private Paint h;
    private a i;
    private Bitmap j;
    private Bitmap k;
    private int l;
    private int m;
    private int n;
    private int o;
    private OnGlobalLayoutListener p;
    private ValueAnimator q;
    private Bitmap r;

    /* renamed from: com.facebook.shimmer.ShimmerFrameLayout$3 */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] a = new int[c.a().length];
        static final /* synthetic */ int[] b = new int[b.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0019 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|20) */
        /* JADX WARNING: Missing block: B:21:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.facebook.shimmer.ShimmerFrameLayout.b.a();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 0;
            r1 = 1;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r2 = 2;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r3[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r3 = 3;
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r4[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x001e }
            r5 = 4;
            r4[r3] = r5;	 Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            r3 = com.facebook.shimmer.ShimmerFrameLayout.c.a();
            r3 = r3.length;
            r3 = new int[r3];
            a = r3;
            r3 = a;	 Catch:{ NoSuchFieldError -> 0x002b }
            r3[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x002b }
        L_0x002b:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002f }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002f }
        L_0x002f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.shimmer.ShimmerFrameLayout$AnonymousClass3.<clinit>():void");
        }
    }

    static class a {
        public int a;
        public float b;
        public float c;
        public int d;
        public int e;
        public float f;
        public float g;
        public float h;
        public int i;

        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final int[] a() {
            return AnonymousClass3.a[this.i + -1] != 2 ? new int[]{0, -16777216, -16777216, 0} : new int[]{-16777216, -16777216, 0};
        }

        public final float[] b() {
            if (AnonymousClass3.a[this.i - 1] != 2) {
                return new float[]{Math.max(((1.0f - this.f) - this.c) / 2.0f, MapboxConstants.MINIMUM_ZOOM), Math.max((1.0f - this.f) / 2.0f, MapboxConstants.MINIMUM_ZOOM), Math.min((this.f + 1.0f) / 2.0f, 1.0f), Math.min(((this.f + 1.0f) + this.c) / 2.0f, 1.0f)};
            }
            return new float[]{MapboxConstants.MINIMUM_ZOOM, Math.min(this.f, 1.0f), Math.min(this.f + this.c, 1.0f)};
        }
    }

    public enum b {
        ;

        static {
            a = new int[]{1, 2, 3, 4};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    public enum c {
        ;

        static {
            a = new int[]{1, 2};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    static class d {
        public int a;
        public int b;
        public int c;
        public int d;

        private d() {
        }

        /* synthetic */ d(byte b) {
            this();
        }

        public final void a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ShimmerFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        setWillNotDraw(false);
        this.i = new a();
        this.g = new Paint();
        this.h = new Paint();
        this.h.setAntiAlias(true);
        this.h.setDither(true);
        this.h.setFilterBitmap(true);
        this.h.setXfermode(f);
        a(false);
        a((int) MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL);
        b(-1);
        c(0);
        d(1);
        a aVar = this.i;
        aVar.a = 1;
        aVar.i = 1;
        aVar.c = 0.5f;
        aVar.d = 0;
        aVar.e = 0;
        aVar.f = MapboxConstants.MINIMUM_ZOOM;
        aVar.g = 1.0f;
        aVar.h = 1.0f;
        aVar.b = 20.0f;
        this.a = new d();
        a(0.3f);
        c();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.azy.a.a, 0, 0);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    a(obtainStyledAttributes.getBoolean(0, false));
                }
                if (obtainStyledAttributes.hasValue(1)) {
                    a(obtainStyledAttributes.getFloat(1, MapboxConstants.MINIMUM_ZOOM));
                }
                if (obtainStyledAttributes.hasValue(2)) {
                    a(obtainStyledAttributes.getInt(2, 0));
                }
                if (obtainStyledAttributes.hasValue(3)) {
                    b(obtainStyledAttributes.getInt(3, 0));
                }
                if (obtainStyledAttributes.hasValue(4)) {
                    c(obtainStyledAttributes.getInt(4, 0));
                }
                if (obtainStyledAttributes.hasValue(5)) {
                    d(obtainStyledAttributes.getInt(5, 0));
                }
                if (obtainStyledAttributes.hasValue(6)) {
                    int i = obtainStyledAttributes.getInt(6, 0);
                    if (i == 90) {
                        this.i.a = 2;
                    } else if (i == 180) {
                        this.i.a = 3;
                    } else if (i != 270) {
                        this.i.a = 1;
                    } else {
                        this.i.a = 4;
                    }
                }
                if (obtainStyledAttributes.hasValue(13)) {
                    if (obtainStyledAttributes.getInt(13, 0) != 1) {
                        this.i.i = 1;
                    } else {
                        this.i.i = 2;
                    }
                }
                if (obtainStyledAttributes.hasValue(7)) {
                    this.i.c = obtainStyledAttributes.getFloat(7, MapboxConstants.MINIMUM_ZOOM);
                }
                if (obtainStyledAttributes.hasValue(8)) {
                    this.i.d = obtainStyledAttributes.getDimensionPixelSize(8, 0);
                }
                if (obtainStyledAttributes.hasValue(9)) {
                    this.i.e = obtainStyledAttributes.getDimensionPixelSize(9, 0);
                }
                if (obtainStyledAttributes.hasValue(10)) {
                    this.i.f = obtainStyledAttributes.getFloat(10, MapboxConstants.MINIMUM_ZOOM);
                }
                if (obtainStyledAttributes.hasValue(11)) {
                    this.i.g = obtainStyledAttributes.getFloat(11, MapboxConstants.MINIMUM_ZOOM);
                }
                if (obtainStyledAttributes.hasValue(12)) {
                    this.i.h = obtainStyledAttributes.getFloat(12, MapboxConstants.MINIMUM_ZOOM);
                }
                if (obtainStyledAttributes.hasValue(14)) {
                    this.i.b = obtainStyledAttributes.getFloat(14, MapboxConstants.MINIMUM_ZOOM);
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private static Bitmap a(int i, int i2) {
        try {
            i = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
            return i;
        } catch (OutOfMemoryError unused) {
            System.gc();
            return Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        }
    }

    private void a(float f) {
        this.g.setAlpha((int) (b(f) * 255.0f));
        c();
    }

    private void a(int i) {
        this.l = i;
        c();
    }

    private void a(boolean z) {
        this.b = z;
        c();
    }

    private static float b(float f) {
        return Math.min(1.0f, Math.max(MapboxConstants.MINIMUM_ZOOM, f));
    }

    private void b(int i) {
        this.m = i;
        c();
    }

    private void c(int i) {
        this.n = i;
        c();
    }

    private Bitmap d() {
        int width = getWidth();
        int height = getHeight();
        try {
            width = a(width, height);
            return width;
        } catch (OutOfMemoryError unused) {
            StringBuilder stringBuilder = new StringBuilder("ShimmerFrameLayout failed to create working bitmap");
            stringBuilder.append(" (width = ");
            stringBuilder.append(width);
            stringBuilder.append(", height = ");
            stringBuilder.append(height);
            stringBuilder.append(")\n\n");
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                stringBuilder.append(stackTraceElement.toString());
                stringBuilder.append("\n");
            }
            Log.d("ShimmerFrameLayout", stringBuilder.toString());
            return null;
        }
    }

    private void d(int i) {
        this.o = i;
        c();
    }

    private void e() {
        Bitmap bitmap = this.r;
        if (bitmap != null) {
            bitmap.recycle();
            this.r = null;
        }
    }

    private void f() {
        Bitmap bitmap = this.k;
        if (bitmap != null) {
            bitmap.recycle();
            this.k = null;
        }
        bitmap = this.j;
        if (bitmap != null) {
            bitmap.recycle();
            this.j = null;
        }
    }

    public final void a() {
        if (!this.e) {
            Animator animator = this.q;
            if (animator == null) {
                int width = getWidth();
                int height = getHeight();
                int i = AnonymousClass3.b[this.i.a - 1];
                if (i == 2) {
                    this.a.a(0, -height, 0, height);
                } else if (i == 3) {
                    this.a.a(width, 0, -width, 0);
                } else if (i != 4) {
                    this.a.a(-width, 0, width, 0);
                } else {
                    this.a.a(0, height, 0, -height);
                }
                this.q = ValueAnimator.ofFloat(new float[]{MapboxConstants.MINIMUM_ZOOM, (((float) this.n) / ((float) this.l)) + 1.0f});
                this.q.setDuration((long) (this.l + this.n));
                this.q.setRepeatCount(this.m);
                this.q.setRepeatMode(this.o);
                this.q.addUpdateListener(new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float max = Math.max(MapboxConstants.MINIMUM_ZOOM, Math.min(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                        ShimmerFrameLayout shimmerFrameLayout = ShimmerFrameLayout.this;
                        float f = 1.0f - max;
                        int i = (int) ((((float) shimmerFrameLayout.a.a) * f) + (((float) ShimmerFrameLayout.this.a.c) * max));
                        if (shimmerFrameLayout.c != i) {
                            shimmerFrameLayout.c = i;
                            shimmerFrameLayout.invalidate();
                        }
                        shimmerFrameLayout = ShimmerFrameLayout.this;
                        int i2 = (int) ((((float) shimmerFrameLayout.a.b) * f) + (((float) ShimmerFrameLayout.this.a.d) * max));
                        if (shimmerFrameLayout.d != i2) {
                            shimmerFrameLayout.d = i2;
                            shimmerFrameLayout.invalidate();
                        }
                    }
                });
                animator = this.q;
            }
            animator.start();
            this.e = true;
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.q;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.q.removeAllUpdateListeners();
            this.q.cancel();
        }
        this.q = null;
        this.e = false;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        b();
        e();
        f();
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (!this.e || getWidth() <= 0 || getHeight() <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.k == null) {
            this.k = d();
        }
        Bitmap bitmap = this.k;
        if (this.j == null) {
            this.j = d();
        }
        Bitmap bitmap2 = this.j;
        if (!(bitmap == null || bitmap2 == null)) {
            int height;
            super.dispatchDraw(new Canvas(bitmap));
            canvas2.drawBitmap(bitmap, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, this.g);
            Canvas canvas3 = new Canvas(bitmap2);
            Bitmap bitmap3 = this.r;
            if (bitmap3 == null) {
                int i;
                Shader linearGradient;
                a aVar = this.i;
                int width = aVar.d > 0 ? aVar.d : (int) (((float) getWidth()) * aVar.g);
                a aVar2 = this.i;
                height = aVar2.e > 0 ? aVar2.e : (int) (((float) getHeight()) * aVar2.h);
                this.r = a(width, height);
                Canvas canvas4 = new Canvas(this.r);
                if (AnonymousClass3.a[this.i.i - 1] != 2) {
                    int i2;
                    int i3;
                    i = AnonymousClass3.b[this.i.a - 1];
                    int i4 = 0;
                    if (i != 2) {
                        if (i == 3) {
                            i4 = width;
                            i = 0;
                            i2 = 0;
                        } else if (i != 4) {
                            i2 = width;
                            i = 0;
                        } else {
                            i = height;
                            i2 = 0;
                        }
                        i3 = 0;
                    } else {
                        i3 = height;
                        i = 0;
                        i2 = 0;
                    }
                    linearGradient = new LinearGradient((float) i4, (float) i, (float) i2, (float) i3, this.i.a(), this.i.b(), TileMode.REPEAT);
                } else {
                    float f = (float) (width / 2);
                    float f2 = (float) (height / 2);
                    double max = (double) Math.max(width, height);
                    double sqrt = Math.sqrt(2.0d);
                    Double.isNaN(max);
                    linearGradient = new RadialGradient(f, f2, (float) (max / sqrt), this.i.a(), this.i.b(), TileMode.REPEAT);
                }
                canvas4.rotate(this.i.b, (float) (width / 2), (float) (height / 2));
                Paint paint = new Paint();
                paint.setShader(linearGradient);
                double sqrt2 = Math.sqrt(2.0d);
                double max2 = (double) Math.max(width, height);
                Double.isNaN(max2);
                i = ((int) (sqrt2 * max2)) / 2;
                float f3 = (float) (-i);
                canvas4.drawRect(f3, f3, (float) (width + i), (float) (height + i), paint);
                bitmap3 = this.r;
            }
            if (bitmap3 != null) {
                height = this.c;
                canvas3.clipRect(height, this.d, bitmap3.getWidth() + height, this.d + bitmap3.getHeight());
                super.dispatchDraw(canvas3);
                canvas3.drawBitmap(bitmap3, (float) this.c, (float) this.d, this.h);
            }
            canvas2.drawBitmap(bitmap2, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, null);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.p == null) {
            this.p = new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    boolean z = ShimmerFrameLayout.this.e;
                    ShimmerFrameLayout.this.c();
                    if (ShimmerFrameLayout.this.b || z) {
                        ShimmerFrameLayout.this.a();
                    }
                }
            };
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.p);
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        b();
        if (this.p != null) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.p);
            this.p = null;
        }
        super.onDetachedFromWindow();
    }
}
