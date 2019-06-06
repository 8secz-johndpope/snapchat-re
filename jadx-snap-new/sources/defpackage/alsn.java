package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: alsn */
public class alsn extends ImageView implements alsm {
    private ScaleType a;
    protected also d;

    public alsn(Context context) {
        this(context, null);
    }

    public alsn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private alsn(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        super.setScaleType(ScaleType.MATRIX);
        c();
    }

    private void c() {
        also also = this.d;
        if (also == null || also.d() == null) {
            this.d = new also(this);
        }
        ScaleType scaleType = this.a;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.a = null;
        }
    }

    public final void a() {
        also also = this.d;
        if (also != null) {
            also.a();
        }
    }

    public final void b() {
        also also = this.d;
        if (also != null) {
            also.g = null;
            also.h = null;
            also.f();
        }
    }

    public final void b(boolean z) {
        this.d.a(z);
    }

    public Matrix getImageMatrix() {
        return this.d.i;
    }

    public ScaleType getScaleType() {
        return this.d.n;
    }

    /* Access modifiers changed, original: protected */
    public void onAttachedToWindow() {
        c();
        super.onAttachedToWindow();
    }

    /* Access modifiers changed, original: protected */
    public void onDetachedFromWindow() {
        this.d.b();
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected */
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        also also = this.d;
        if (also != null) {
            also.f();
        }
        return frame;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        also also = this.d;
        if (also != null) {
            also.f();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        also also = this.d;
        if (also != null) {
            also.f();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        also also = this.d;
        if (also != null) {
            also.f();
        }
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.d.l = onLongClickListener;
    }

    public void setScaleType(ScaleType scaleType) {
        also also = this.d;
        if (also != null) {
            also.a(scaleType);
        } else {
            this.a = scaleType;
        }
    }
}
