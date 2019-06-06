package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: axo */
public final class axo extends awz implements axj {
    Drawable a = null;
    private axk b;

    public axo(Drawable drawable) {
        super(drawable);
    }

    public final void a(axk axk) {
        this.b = axk;
    }

    @SuppressLint({"WrongCall"})
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            axk axk = this.b;
            if (axk != null) {
                axk.a();
            }
            super.draw(canvas);
            Drawable drawable = this.a;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.a.draw(canvas);
            }
        }
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        axk axk = this.b;
        if (axk != null) {
            axk.a(z);
        }
        return super.setVisible(z, z2);
    }
}
