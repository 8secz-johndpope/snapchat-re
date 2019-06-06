package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.siw.c;

/* renamed from: taq */
public final class taq extends SnapFontTextView implements tat {
    public siw b;
    private final Paint c;
    private final Paint d;
    private final RectF e;
    private float f = MapboxConstants.MINIMUM_ZOOM;
    private int g = 0;
    private c h;
    private c i;

    public taq(Context context) {
        super(context);
        setTextColor(-1);
        setTextSize(1, 20.0f);
        setGravity(17);
        this.d = new Paint(1);
        this.c = new Paint(1);
        this.e = new RectF();
    }

    private c a(Context context, int i, int i2, int i3) {
        Drawable drawable = context.getResources().getDrawable(i);
        if (drawable != null) {
            c a = this.b.a(i2, i3, Config.ARGB_8888);
            Canvas canvas = new Canvas(a.c());
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return a;
        }
        throw new NullPointerException();
    }

    public final void a() {
        c cVar = this.h;
        if (cVar != null) {
            cVar.b();
            this.h = null;
        }
        cVar = this.i;
        if (cVar != null) {
            cVar.b();
            this.i = null;
        }
    }

    public final void a(float f) {
        this.f = 1.0f - f;
        postInvalidate();
    }

    public final void a(long j, float f) {
        int i = (int) ((f * ((float) j)) / 1000.0f);
        if (i != this.g) {
            super.setText(Integer.toString(i + 1));
            CharSequence text = getText();
            int length = text != null ? text.length() : 0;
            if (length < 2) {
                length = 2;
            }
            length = (int) (((float) ((length * 12) + 12)) * (((float) getContext().getResources().getDisplayMetrics().densityDpi) / 160.0f));
            setHeight(length);
            setWidth(length);
            postInvalidate();
            this.g = i;
        }
    }

    public final void a(boolean z) {
    }

    public final void b(boolean z) {
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public final void onDraw(Canvas canvas) {
        if (!(getHeight() == 0 || getWidth() == 0)) {
            canvas.drawRect(this.e, this.c);
            float f = this.f * 360.0f;
            this.d.setAlpha(255);
            canvas.drawArc(this.e, f - 0.049804688f, 360.0f - f, true, this.d);
            this.d.setAlpha(85);
            canvas.drawArc(this.e, -90.0f, f, true, this.d);
        }
        super.onDraw(canvas);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            Paint paint;
            Bitmap c;
            TileMode tileMode;
            c cVar = this.i;
            if (!(cVar != null && cVar.c().getWidth() == i && this.i.c().getHeight() == i2)) {
                cVar = this.i;
                if (cVar != null) {
                    cVar.b();
                }
                this.i = a(getContext(), R.drawable.countdown_timer_highlight, i, i2);
                paint = this.d;
                c = this.i.c();
                tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(c, tileMode, tileMode));
            }
            cVar = this.h;
            if (!(cVar != null && cVar.c().getWidth() == i && this.h.c().getHeight() == i2)) {
                cVar = this.h;
                if (cVar != null) {
                    cVar.b();
                }
                this.h = a(getContext(), R.drawable.countdown_timer_background, i, i2);
                paint = this.c;
                c = this.h.c();
                tileMode = TileMode.CLAMP;
                paint.setShader(new BitmapShader(c, tileMode, tileMode));
            }
        }
        double max = (double) (Math.max(i, i2) / 2);
        i3 = (int) Math.ceil(Math.sqrt(Math.pow(max, 2.0d) + Math.pow(max, 2.0d)));
        i4 = i3 - (i2 / 2);
        i3 -= i / 2;
        this.e.set((float) (0 - i3), (float) (0 - i4), (float) (i + i3), (float) (i2 + i4));
    }
}
