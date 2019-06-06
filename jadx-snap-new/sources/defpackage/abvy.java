package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView.ScaleType;

/* renamed from: abvy */
public final class abvy implements abvv {
    public boolean a;
    public Drawable b;
    public Bitmap c;
    public ScaleType d = ScaleType.FIT_XY;
    public akbk<Float> e = a.a;
    private final Rect f = new Rect();
    private final Rect g = new Rect();
    private final Paint h = new Paint(2);

    /* renamed from: abvy$a */
    static final class a extends akcs implements akbk<Float> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(1.0f);
        }
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        int width;
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
        this.h.setAlpha((int) (((Number) this.e.invoke()).floatValue() * 255.0f));
        Bitmap bitmap = this.c;
        if (bitmap != null) {
            this.f.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            switch (abvz.a[this.d.ordinal()]) {
                case 1:
                    throw new ajxl();
                case 2:
                    this.g.set(0, 0, abxs.a, abxs.b);
                    break;
                case 3:
                    throw new ajxl();
                case 4:
                    int i;
                    if (((float) bitmap.getWidth()) / ((float) bitmap.getHeight()) < ((float) abxs.a) / ((float) abxs.b)) {
                        width = (bitmap.getWidth() * abxs.b) / bitmap.getHeight();
                        i = (abxs.a - width) / 2;
                        this.g.set(i, 0, width + i, abxs.b);
                        break;
                    }
                    width = (abxs.a * bitmap.getHeight()) / bitmap.getWidth();
                    i = (abxs.b - width) / 2;
                    this.g.set(0, i, abxs.a, width + i);
                    break;
                case 5:
                    throw new ajxl();
                case 6:
                    throw new ajxl();
                case 7:
                    throw new ajxl();
                case 8:
                    throw new ajxl();
            }
            canvas.drawBitmap(bitmap, this.f, this.g, this.h);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            width = abvz.b[this.d.ordinal()];
            if (width == 1) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                width = drawable.getIntrinsicHeight();
                drawable.setBounds((abxs.a - intrinsicWidth) / 2, (abxs.b - width) / 2, (abxs.a + intrinsicWidth) / 2, (abxs.b + width) / 2);
            } else if (width == 2) {
                drawable.setBounds(0, 0, abxs.a, abxs.b);
            } else {
                throw new ajxl();
            }
            drawable.setAlpha((int) (((Number) this.e.invoke()).floatValue() * 255.0f));
            drawable.draw(canvas);
        }
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
        akcr.b(view, "view");
        akcr.b(canvas, "canvas");
        akcr.b(abxs, "dimensions");
    }
}
