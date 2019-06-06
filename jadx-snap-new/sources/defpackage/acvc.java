package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: acvc */
public final class acvc {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final Rect f;

    public acvc(RectF rectF) {
        this.a = rectF.left;
        this.b = rectF.right;
        this.c = rectF.top;
        this.d = rectF.bottom;
        float f = this.b;
        float f2 = this.a;
        this.e = f - f2;
        this.f = new Rect((int) f2, (int) this.c, (int) f, (int) this.d);
    }
}
