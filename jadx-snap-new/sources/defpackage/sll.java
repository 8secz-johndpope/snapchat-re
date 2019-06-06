package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import com.snap.opera.view.OperaScalableCircleMaskFrameLayout;
import defpackage.siw.c;

/* renamed from: sll */
public final class sll {
    private final Context a;
    private final slm b;
    private final abth c;
    private final OperaScalableCircleMaskFrameLayout d;
    private final absl e;
    private c f;

    public sll(Context context, slm slm, abth abth, OperaScalableCircleMaskFrameLayout operaScalableCircleMaskFrameLayout, absl absl) {
        this.a = context;
        this.b = slm;
        this.c = abth;
        this.d = operaScalableCircleMaskFrameLayout;
        this.e = absl;
    }

    private void b() {
        c cVar = this.f;
        if (cVar != null) {
            cVar.b();
        }
    }

    public final void a() {
        b();
        this.f = null;
    }

    public final void a(sqo sqo) {
        if (this.b.K) {
            int measuredWidth = this.b.e().getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = this.e.a();
            }
            int measuredHeight = this.b.e().getMeasuredHeight();
            if (measuredHeight == 0) {
                measuredHeight = this.e.c();
            }
            c a = this.b.D().a(measuredWidth, measuredHeight, Config.ARGB_8888);
            Bitmap c = a.c();
            c.eraseColor(sqo.g);
            this.b.z().a(c);
            Paint paint = new Paint();
            paint.setAlpha(sqo.h);
            b();
            this.f = this.b.A().a.a(c, c.getHeight(), c.getWidth(), sqo.i, paint, Integer.valueOf(sqo.g));
            a.b();
            if (this.f != null) {
                this.d.setBackground(new BitmapDrawable(this.a.getResources(), this.f.c()));
            }
        }
        RectF rectF = sqo.b;
        final abth abth = this.c;
        float f = sqo.d;
        abth.setPivotX(((float) this.d.getMeasuredWidth()) / 2.0f);
        abth.setPivotY(rectF.top);
        if (sqo.a) {
            this.d.a(rectF, sqo.c);
            abth.setScaleX(f);
            abth.setScaleY(f);
            return;
        }
        this.d.a(rectF, sqo.c, sqo.e, sqo.f);
        azx b = azx.b();
        azu azu = new azu((double) sqo.e, (double) sqo.f);
        azt a2 = b.a();
        a2.a(azu);
        a2.a(new azs() {
            public final void onSpringUpdate(azt azt) {
                float f = (float) azt.d.a;
                abth.setScaleX(f);
                abth.setScaleY(f);
            }
        });
        a2.a((double) abth.getScaleX());
        a2.b((double) f);
    }
}
