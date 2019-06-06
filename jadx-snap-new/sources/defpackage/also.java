package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.ref.WeakReference;

/* renamed from: also */
public final class also implements alsm, alst, OnTouchListener, OnGlobalLayoutListener {
    static final boolean a = Log.isLoggable("PhotoViewAttacher", 3);
    private b A;
    private int B;
    private float C;
    Interpolator b;
    int c;
    float d;
    float e;
    float f;
    GestureDetector g;
    alss h;
    public final Matrix i;
    final Matrix j;
    public e k;
    public OnLongClickListener l;
    public boolean m;
    public ScaleType n;
    private boolean o;
    private boolean p;
    private WeakReference<ImageView> q;
    private final Matrix r;
    private final RectF s;
    private final float[] t;
    private c u;
    private d v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* renamed from: also$2 */
    static /* synthetic */ class 2 {
        static final /* synthetic */ int[] a = new int[ScaleType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = android.widget.ImageView.ScaleType.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.widget.ImageView.ScaleType.MATRIX;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.widget.ImageView.ScaleType.FIT_START;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.widget.ImageView.ScaleType.FIT_END;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.widget.ImageView.ScaleType.FIT_CENTER;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = android.widget.ImageView.ScaleType.FIT_XY;	 Catch:{ NoSuchFieldError -> 0x0040 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
            r2 = 5;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
        L_0x0040:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.also$2.<clinit>():void");
        }
    }

    /* renamed from: also$1 */
    class 1 extends SimpleOnGestureListener {
        1() {
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (also.this.l != null) {
                also.this.l.onLongClick(also.this.d());
            }
        }
    }

    /* renamed from: also$a */
    class a implements Runnable {
        private final float a;
        private final float b;
        private final long c = System.currentTimeMillis();
        private final float d;
        private final float e;

        public a(float f, float f2, float f3, float f4) {
            this.a = f3;
            this.b = f4;
            this.d = f;
            this.e = f2;
        }

        public final void run() {
            ImageView d = also.this.d();
            if (d != null) {
                float interpolation = also.this.b.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.c)) * 1.0f) / ((float) also.this.c)));
                float f = this.d;
                also.this.a((f + ((this.e - f) * interpolation)) / also.this.e(), this.a, this.b);
                if (interpolation < 1.0f) {
                    alsk.a(d, this);
                }
            }
        }
    }

    /* renamed from: also$b */
    class b implements Runnable {
        final altb a;
        int b;
        int c;

        public b(Context context) {
            altb alta = VERSION.SDK_INT < 9 ? new alta(context) : VERSION.SDK_INT < 14 ? new alsy(context) : new alsz(context);
            this.a = alta;
        }

        public final void a() {
            if (also.a) {
                alsv.a.a("PhotoViewAttacher", "Cancel Fling");
            }
            this.a.b();
        }

        public final void run() {
            if (!this.a.c()) {
                ImageView d = also.this.d();
                if (d != null && this.a.a()) {
                    int d2 = this.a.d();
                    int e = this.a.e();
                    if (also.a) {
                        alsw alsw = alsv.a;
                        StringBuilder stringBuilder = new StringBuilder("fling run(). CurrentX:");
                        stringBuilder.append(this.b);
                        stringBuilder.append(" CurrentY:");
                        stringBuilder.append(this.c);
                        stringBuilder.append(" NewX:");
                        stringBuilder.append(d2);
                        stringBuilder.append(" NewY:");
                        stringBuilder.append(e);
                        alsw.a("PhotoViewAttacher", stringBuilder.toString());
                    }
                    also.this.j.postTranslate((float) (this.b - d2), (float) (this.c - e));
                    also also = also.this;
                    also.a(also.g());
                    this.b = d2;
                    this.c = e;
                    alsk.a(d, this);
                }
            }
        }
    }

    /* renamed from: also$c */
    public interface c {
    }

    /* renamed from: also$d */
    public interface d {
    }

    /* renamed from: also$e */
    public interface e {
        void a();
    }

    public also(ImageView imageView) {
        this(imageView, (byte) 0);
    }

    private also(ImageView imageView, byte b) {
        this.b = new AccelerateDecelerateInterpolator();
        this.c = Callback.DEFAULT_DRAG_ANIMATION_DURATION;
        this.d = 1.0f;
        this.e = 1.75f;
        this.f = 3.0f;
        this.o = true;
        this.p = false;
        this.r = new Matrix();
        this.i = new Matrix();
        this.j = new Matrix();
        this.s = new RectF();
        this.t = new float[9];
        this.B = 2;
        this.n = ScaleType.FIT_CENTER;
        this.q = new WeakReference(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        also.a(imageView);
        if (!imageView.isInEditMode()) {
            this.C = MapboxConstants.MINIMUM_ZOOM;
            a(true);
        }
    }

    private float a(Matrix matrix, int i) {
        matrix.getValues(this.t);
        return this.t[i];
    }

    private void a(Drawable drawable) {
        ImageView d = d();
        if (d != null && drawable != null) {
            float b = (float) also.b(d);
            float c = (float) also.c(d);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.r.reset();
            float f = (float) intrinsicWidth;
            float f2 = b / f;
            float f3 = (float) intrinsicHeight;
            float f4 = c / f3;
            if (this.n == ScaleType.CENTER) {
                this.r.postTranslate((b - f) / 2.0f, (c - f3) / 2.0f);
            } else {
                if (this.n == ScaleType.CENTER_CROP) {
                    f2 = Math.max(f2, f4);
                } else if (this.n == ScaleType.CENTER_INSIDE) {
                    f2 = Math.min(1.0f, Math.min(f2, f4));
                } else {
                    Matrix matrix;
                    ScaleToFit scaleToFit;
                    RectF rectF = new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, f, f3);
                    RectF rectF2 = new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, b, c);
                    int i = 2.a[this.n.ordinal()];
                    if (i == 2) {
                        matrix = this.r;
                        scaleToFit = ScaleToFit.START;
                    } else if (i == 3) {
                        matrix = this.r;
                        scaleToFit = ScaleToFit.END;
                    } else if (i == 4) {
                        matrix = this.r;
                        scaleToFit = ScaleToFit.CENTER;
                    } else if (i == 5) {
                        matrix = this.r;
                        scaleToFit = ScaleToFit.FILL;
                    }
                    matrix.setRectToRect(rectF, rectF2, scaleToFit);
                }
                this.r.postScale(f2, f2);
                this.r.postTranslate((b - (f * f2)) / 2.0f, (c - (f3 * f2)) / 2.0f);
            }
            m();
        }
    }

    private static void a(ImageView imageView) {
        if (imageView != null && !(imageView instanceof alsm) && !ScaleType.MATRIX.equals(imageView.getScaleType())) {
            imageView.setScaleType(ScaleType.MATRIX);
        }
    }

    private static int b(ImageView imageView) {
        return imageView == null ? 0 : (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private RectF b(Matrix matrix) {
        ImageView d = d();
        if (d != null) {
            Drawable drawable = d.getDrawable();
            if (drawable != null) {
                this.s.set(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
                matrix.mapRect(this.s);
                return this.s;
            }
        }
        return null;
    }

    private static boolean b(ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (2.a[scaleType.ordinal()] != 1) {
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(scaleType.name());
        stringBuilder.append(" is not supported in PhotoView");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    private static int c(ImageView imageView) {
        return imageView == null ? 0 : (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    private void h() {
        this.j.postRotate(MapboxConstants.MINIMUM_ZOOM);
        j();
    }

    private void i() {
        b bVar = this.A;
        if (bVar != null) {
            bVar.a();
            this.A = null;
        }
    }

    private void j() {
        if (l()) {
            a(g());
        }
    }

    private void k() {
        ImageView d = d();
        if (d != null && !(d instanceof alsm) && !ScaleType.MATRIX.equals(d.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher. You should call setScaleType on the PhotoViewAttacher instead of on the ImageView");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
    private boolean l() {
        /*
        r12 = this;
        r0 = r12.d();
        r1 = 0;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r1;
    L_0x0008:
        r2 = r12.g();
        r2 = r12.b(r2);
        if (r2 != 0) goto L_0x0013;
    L_0x0012:
        return r1;
    L_0x0013:
        r3 = r2.height();
        r4 = r2.width();
        r5 = defpackage.also.c(r0);
        r5 = (float) r5;
        r6 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r7 = 3;
        r8 = 2;
        r9 = 0;
        r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r10 > 0) goto L_0x0040;
    L_0x0029:
        r10 = defpackage.also.2.a;
        r11 = r12.n;
        r11 = r11.ordinal();
        r10 = r10[r11];
        if (r10 == r8) goto L_0x0046;
    L_0x0035:
        if (r10 == r7) goto L_0x003e;
    L_0x0037:
        r5 = r5 - r3;
        r5 = r5 / r6;
    L_0x0039:
        r3 = r2.top;
    L_0x003b:
        r3 = r5 - r3;
        goto L_0x0054;
    L_0x003e:
        r5 = r5 - r3;
        goto L_0x0039;
    L_0x0040:
        r3 = r2.top;
        r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
        if (r3 <= 0) goto L_0x004a;
    L_0x0046:
        r3 = r2.top;
        r3 = -r3;
        goto L_0x0054;
    L_0x004a:
        r3 = r2.bottom;
        r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r3 >= 0) goto L_0x0053;
    L_0x0050:
        r3 = r2.bottom;
        goto L_0x003b;
    L_0x0053:
        r3 = 0;
    L_0x0054:
        r0 = defpackage.also.b(r0);
        r0 = (float) r0;
        r5 = 1;
        r10 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));
        if (r10 > 0) goto L_0x007c;
    L_0x005e:
        r1 = defpackage.also.2.a;
        r9 = r12.n;
        r9 = r9.ordinal();
        r1 = r1[r9];
        if (r1 == r8) goto L_0x0075;
    L_0x006a:
        if (r1 == r7) goto L_0x0073;
    L_0x006c:
        r0 = r0 - r4;
        r0 = r0 / r6;
    L_0x006e:
        r1 = r2.left;
        r0 = r0 - r1;
    L_0x0071:
        r9 = r0;
        goto L_0x0079;
    L_0x0073:
        r0 = r0 - r4;
        goto L_0x006e;
    L_0x0075:
        r0 = r2.left;
        r0 = -r0;
        goto L_0x0071;
    L_0x0079:
        r12.B = r8;
        goto L_0x0098;
    L_0x007c:
        r4 = r2.left;
        r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r4 <= 0) goto L_0x0088;
    L_0x0082:
        r12.B = r1;
        r0 = r2.left;
        r9 = -r0;
        goto L_0x0098;
    L_0x0088:
        r1 = r2.right;
        r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1));
        if (r1 >= 0) goto L_0x0095;
    L_0x008e:
        r1 = r2.right;
        r9 = r0 - r1;
        r12.B = r5;
        goto L_0x0098;
    L_0x0095:
        r0 = -1;
        r12.B = r0;
    L_0x0098:
        r0 = r12.j;
        r0.postTranslate(r9, r3);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.also.l():boolean");
    }

    private void m() {
        this.j.reset();
        h();
        a(g());
        l();
    }

    public final void a() {
        if (this.g == null && this.h == null) {
            ImageView imageView = (ImageView) this.q.get();
            if (imageView != null) {
                this.h = alsu.a(imageView.getContext(), this);
                this.g = new GestureDetector(imageView.getContext(), new 1());
                this.g.setOnDoubleTapListener(new alsl(this));
                f();
            }
        }
    }

    public final void a(float f, float f2) {
        if (!this.h.a()) {
            if (a) {
                alsv.a.a("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", new Object[]{Float.valueOf(f), Float.valueOf(f2)}));
            }
            ImageView d = d();
            this.j.postTranslate(f, f2);
            j();
            ViewParent parent = d.getParent();
            if (this.o && !this.h.a() && !this.p) {
                int i = this.B;
                if ((i == 2 || ((i == 0 && f >= 1.0f) || (this.B == 1 && f <= -1.0f))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            } else if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public final void a(float f, float f2, float f3) {
        if (a) {
            alsv.a.a("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)}));
        }
        if (e() >= this.f && f >= 1.0f) {
            return;
        }
        if (e() > this.d || f > 1.0f) {
            this.j.postScale(f, f, f2, f3);
            j();
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        float f5 = f3;
        float f6 = f4;
        String str = "PhotoViewAttacher";
        if (a) {
            alsw alsw = alsv.a;
            StringBuilder stringBuilder = new StringBuilder("onFling. sX: ");
            stringBuilder.append(f);
            stringBuilder.append(" sY: ");
            stringBuilder.append(f2);
            stringBuilder.append(" Vx: ");
            stringBuilder.append(f5);
            stringBuilder.append(" Vy: ");
            stringBuilder.append(f6);
            alsw.a(str, stringBuilder.toString());
        }
        ImageView d = d();
        this.A = new b(d.getContext());
        b bVar = this.A;
        int b = also.b(d);
        int c = also.c(d);
        int i = (int) f5;
        int i2 = (int) f6;
        RectF c2 = also.this.c();
        if (c2 != null) {
            int round;
            int i3;
            int round2;
            int i4;
            int round3 = Math.round(-c2.left);
            f6 = (float) b;
            if (f6 < c2.width()) {
                round = Math.round(c2.width() - f6);
                i3 = 0;
            } else {
                i3 = round3;
                round = i3;
            }
            int round4 = Math.round(-c2.top);
            f6 = (float) c;
            if (f6 < c2.height()) {
                round2 = Math.round(c2.height() - f6);
                i4 = 0;
            } else {
                round2 = round4;
                i4 = round2;
            }
            bVar.b = round3;
            bVar.c = round4;
            if (a) {
                alsw alsw2 = alsv.a;
                StringBuilder stringBuilder2 = new StringBuilder("fling. StartX:");
                stringBuilder2.append(round3);
                stringBuilder2.append(" StartY:");
                stringBuilder2.append(round4);
                stringBuilder2.append(" MaxX:");
                stringBuilder2.append(round);
                stringBuilder2.append(" MaxY:");
                stringBuilder2.append(round2);
                alsw2.a(str, stringBuilder2.toString());
            }
            if (!(round3 == round && round4 == round2)) {
                bVar.a.a(round3, round4, i, i2, i3, round, i4, round2);
            }
        }
        d.post(this.A);
    }

    /* Access modifiers changed, original: final */
    public final void a(Matrix matrix) {
        ImageView d = d();
        if (d != null) {
            k();
            d.setImageMatrix(matrix);
        }
    }

    public final void a(ScaleType scaleType) {
        if (also.b(scaleType) && scaleType != this.n) {
            this.n = scaleType;
            f();
        }
    }

    public final void a(boolean z) {
        this.m = z;
        f();
    }

    public final void b() {
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            ImageView imageView = (ImageView) weakReference.get();
            if (imageView != null) {
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                imageView.setOnTouchListener(null);
                i();
            }
            GestureDetector gestureDetector = this.g;
            if (gestureDetector != null) {
                gestureDetector.setOnDoubleTapListener(null);
            }
            this.u = null;
            this.v = null;
            this.k = null;
            this.q = null;
        }
    }

    public final void b(float f, float f2, float f3) {
        ImageView d = d();
        if (d == null) {
            return;
        }
        if (f < this.d || f > this.f) {
            alsv.a.b("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
            return;
        }
        d.post(new a(e(), f, f2, f3));
    }

    public final RectF c() {
        l();
        return b(g());
    }

    public final ImageView d() {
        WeakReference weakReference = this.q;
        ImageView imageView = weakReference != null ? (ImageView) weakReference.get() : null;
        if (imageView == null) {
            b();
            alsv.a.b("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    public final float e() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) a(this.j, 0), 2.0d)) + ((float) Math.pow((double) a(this.j, 3), 2.0d))));
    }

    public final void f() {
        ImageView d = d();
        if (d != null) {
            if (this.m) {
                also.a(d);
                a(d.getDrawable());
                return;
            }
            m();
        }
    }

    /* Access modifiers changed, original: final */
    public final Matrix g() {
        this.i.set(this.r);
        this.i.postConcat(this.j);
        return this.i;
    }

    public final void onGlobalLayout() {
        ImageView d = d();
        if (d != null) {
            if (this.m) {
                int top = d.getTop();
                int right = d.getRight();
                int bottom = d.getBottom();
                int left = d.getLeft();
                if (!(top == this.w && bottom == this.y && left == this.z && right == this.x)) {
                    a(d.getDrawable());
                    this.w = top;
                    this.x = right;
                    this.y = bottom;
                    this.z = left;
                }
                return;
            }
            a(d.getDrawable());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0057  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
        r10 = this;
        r0 = r10.m;
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0096;
    L_0x0006:
        r0 = r11;
        r0 = (android.widget.ImageView) r0;
        if (r0 == 0) goto L_0x0013;
    L_0x000b:
        r0 = r0.getDrawable();
        if (r0 == 0) goto L_0x0013;
    L_0x0011:
        r0 = 1;
        goto L_0x0014;
    L_0x0013:
        r0 = 0;
    L_0x0014:
        if (r0 == 0) goto L_0x0096;
    L_0x0016:
        r11.getParent();
        r0 = r12.getAction();
        if (r0 == 0) goto L_0x004f;
    L_0x001f:
        if (r0 == r2) goto L_0x0025;
    L_0x0021:
        r3 = 3;
        if (r0 == r3) goto L_0x0025;
    L_0x0024:
        goto L_0x0052;
    L_0x0025:
        r0 = r10.e();
        r3 = r10.d;
        r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1));
        if (r0 >= 0) goto L_0x0052;
    L_0x002f:
        r0 = r10.c();
        if (r0 == 0) goto L_0x0052;
    L_0x0035:
        r9 = new also$a;
        r5 = r10.e();
        r6 = r10.d;
        r7 = r0.centerX();
        r8 = r0.centerY();
        r3 = r9;
        r4 = r10;
        r3.<init>(r5, r6, r7, r8);
        r11.post(r9);
        r11 = 1;
        goto L_0x0053;
    L_0x004f:
        r10.i();
    L_0x0052:
        r11 = 0;
    L_0x0053:
        r0 = r10.h;
        if (r0 == 0) goto L_0x008a;
    L_0x0057:
        r11 = r0.a();
        r0 = r10.h;
        r0 = r0.b();
        r3 = r10.h;
        r3 = r3.c(r12);
        if (r11 != 0) goto L_0x0073;
    L_0x0069:
        r11 = r10.h;
        r11 = r11.a();
        if (r11 != 0) goto L_0x0073;
    L_0x0071:
        r11 = 1;
        goto L_0x0074;
    L_0x0073:
        r11 = 0;
    L_0x0074:
        if (r0 != 0) goto L_0x0080;
    L_0x0076:
        r0 = r10.h;
        r0 = r0.b();
        if (r0 != 0) goto L_0x0080;
    L_0x007e:
        r0 = 1;
        goto L_0x0081;
    L_0x0080:
        r0 = 0;
    L_0x0081:
        if (r11 == 0) goto L_0x0086;
    L_0x0083:
        if (r0 == 0) goto L_0x0086;
    L_0x0085:
        r1 = 1;
    L_0x0086:
        r10.p = r1;
        r1 = r3;
        goto L_0x008b;
    L_0x008a:
        r1 = r11;
    L_0x008b:
        r11 = r10.g;
        if (r11 == 0) goto L_0x0096;
    L_0x008f:
        r11 = r11.onTouchEvent(r12);
        if (r11 == 0) goto L_0x0096;
    L_0x0095:
        r1 = 1;
    L_0x0096:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.also.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
