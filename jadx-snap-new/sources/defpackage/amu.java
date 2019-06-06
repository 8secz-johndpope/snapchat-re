package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.view.Gravity;
import defpackage.aif.a;
import defpackage.amy.b;

/* renamed from: amu */
public class amu extends amo implements b {
    public final a a;
    public final aif b;
    final amy c;
    boolean d;
    private final Paint e;
    private final Rect f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;

    /* renamed from: amu$a */
    public static class a extends ConstantState {
        aih a;
        byte[] b;
        Context c;
        ais<Bitmap> d;
        int e;
        int f;
        defpackage.aif.a g;
        ajr h;
        public Bitmap i;

        public a(aih aih, byte[] bArr, Context context, ais<Bitmap> ais, int i, int i2, defpackage.aif.a aVar, ajr ajr, Bitmap bitmap) {
            if (bitmap != null) {
                this.a = aih;
                this.b = bArr;
                this.h = ajr;
                this.i = bitmap;
                this.c = context.getApplicationContext();
                this.d = ais;
                this.e = i;
                this.f = i2;
                this.g = aVar;
                return;
            }
            throw new NullPointerException("The first frame of the GIF must not be null");
        }

        public final int getChangingConfigurations() {
            return 0;
        }

        public final Drawable newDrawable() {
            return new amu(this);
        }

        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    amu(a aVar) {
        this.f = new Rect();
        this.i = true;
        this.k = -1;
        this.a = aVar;
        this.b = new aif(aVar.g);
        this.e = new Paint();
        this.b.a(aVar.a, aVar.b);
        this.c = new amy(aVar.c, this, this.b, aVar.e, aVar.f);
        amy amy = this.c;
        if (aVar.d != null) {
            amy.f = amy.f.b(r11);
            return;
        }
        throw new NullPointerException("Transformation must not be null");
    }

    public amu(amu amu, Bitmap bitmap, ais<Bitmap> ais) {
        this(new a(amu.a.a, amu.a.b, amu.a.c, ais, amu.a.e, amu.a.f, amu.a.g, amu.a.h, bitmap));
    }

    public amu(Context context, a aVar, ajr ajr, ais<Bitmap> ais, int i, int i2, aih aih, byte[] bArr, Bitmap bitmap) {
        a aVar2 = new a(aih, bArr, context, ais, i, i2, aVar, ajr, bitmap);
        this(aVar2);
    }

    private void b() {
        if (this.b.f.c == 1) {
            invalidateSelf();
            return;
        }
        if (!this.g) {
            this.g = true;
            this.c.a();
            invalidateSelf();
        }
    }

    private void c() {
        this.g = false;
        this.c.d = false;
    }

    public final void a(int i) {
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        } else if (i == 0) {
            this.k = this.b.f.m;
        } else {
            this.k = i;
        }
    }

    public final boolean a() {
        return true;
    }

    @TargetApi(11)
    public final void b(int i) {
        if (getCallback() == null) {
            stop();
            this.c.b();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (i == this.b.f.c - 1) {
            this.j++;
        }
        i = this.k;
        if (i != -1 && this.j >= i) {
            stop();
        }
    }

    public void draw(Canvas canvas) {
        if (!this.d) {
            if (this.l) {
                Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f);
                this.l = false;
            }
            amy amy = this.c;
            Bitmap bitmap = amy.g != null ? amy.g.b : null;
            if (bitmap == null) {
                bitmap = this.a.i;
            }
            canvas.drawBitmap(bitmap, null, this.f, this.e);
        }
    }

    public ConstantState getConstantState() {
        return this.a;
    }

    public int getIntrinsicHeight() {
        return this.a.i.getHeight();
    }

    public int getIntrinsicWidth() {
        return this.a.i.getWidth();
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.g;
    }

    /* Access modifiers changed, original: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }

    public void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    public boolean setVisible(boolean z, boolean z2) {
        this.i = z;
        if (!z) {
            c();
        } else if (this.h) {
            b();
        }
        return super.setVisible(z, z2);
    }

    public void start() {
        this.h = true;
        this.j = 0;
        if (this.i) {
            b();
        }
    }

    public void stop() {
        this.h = false;
        c();
    }
}
