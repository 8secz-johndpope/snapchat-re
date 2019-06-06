package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.text.style.ReplacementSpan;
import defpackage.abuc.a;
import java.lang.ref.WeakReference;

/* renamed from: abuj */
public final class abuj extends ReplacementSpan implements AnimatorListener, AnimatorUpdateListener {
    private final WeakReference<a> a;
    private final String[] b;
    private final boolean c;
    private String d;
    private String e;
    private int f;
    private int g;
    private int h;
    private ValueAnimator i;
    private Rect j = null;

    public abuj(a aVar, String[] strArr) {
        if (strArr.length >= 2) {
            this.a = new WeakReference(aVar);
            this.b = strArr;
            this.f = -1;
            this.c = false;
            c();
            return;
        }
        throw new IllegalArgumentException("This baby must be greater than two noobs");
    }

    private int a(int i, int i2) {
        int i3 = this.h / 2;
        return i > i3 ? 0 : (int) ((((float) (i3 - i)) / ((float) i3)) * ((float) i2));
    }

    private void a() {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i.removeAllListeners();
        }
        if (this.a.get() != null) {
            this.a.clear();
        }
    }

    private void b() {
        this.i = ValueAnimator.ofInt(new int[]{0, this.h});
        this.i.setDuration(400);
        this.i.setStartDelay(400);
        this.i.addUpdateListener(this);
        this.i.addListener(this);
        this.i.start();
    }

    private boolean c() {
        this.f++;
        String[] strArr = this.b;
        int i = this.f;
        this.d = strArr[i % strArr.length];
        this.e = strArr[(i + 1) % strArr.length];
        if (i != strArr.length) {
            return true;
        }
        this.f = 0;
        return false;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        String str;
        Paint paint2 = paint;
        int height = this.j.height();
        int i6 = height / 2;
        int i7 = height + i6;
        if (this.i == null) {
            this.g = 0;
            this.h = i7;
            b();
        }
        int alpha = paint.getAlpha();
        i7 = this.g;
        int i8 = i4 - i7;
        if (i7 < this.h / 2) {
            paint2.setAlpha(a(i7, alpha));
            str = this.d;
            canvas.drawText(str, 0, str.length(), f, (float) i8, paint);
        }
        i7 = this.g;
        if (i7 > 0) {
            i8 = (i8 + height) + i6;
            paint2.setAlpha(a(this.h - i7, alpha));
            str = this.e;
            canvas.drawText(str, 0, str.length(), f, (float) i8, paint);
        }
        paint2.setAlpha(alpha);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        if (this.j == null) {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.b) {
                Rect rect = new Rect();
                paint.getTextBounds(str, 0, str.length(), rect);
                if (rect.width() > i3) {
                    i3 = rect.width();
                }
                if (rect.height() > i4) {
                    i4 = rect.height();
                }
            }
            this.j = new Rect(0, 0, i3, i4);
        }
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.j.bottom;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.j.right;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        a aVar = (a) this.a.get();
        if (aVar != null && aVar.a()) {
            this.g = 0;
            if (c()) {
                b();
                return;
            }
            a();
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a aVar = (a) this.a.get();
        if (aVar != null) {
            if (aVar.a()) {
                this.g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                aVar.b();
            }
            return;
        }
        a();
    }
}
