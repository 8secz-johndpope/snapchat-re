package defpackage;

import android.graphics.Canvas;

/* renamed from: abvd */
public final class abvd implements abvf {
    private int a = -1;
    private int b = -1;
    private int c = -1;
    private int d = -1;

    public final void a(Canvas canvas) {
        canvas.save();
        if (this.a == -1) {
            this.a = 0;
        }
        if (this.b == -1) {
            this.b = 0;
        }
        if (this.c == -1) {
            this.c = canvas.getWidth();
        }
        if (this.d == -1) {
            this.d = canvas.getHeight();
        }
        if (this.a > 0 || this.b > 0 || this.c < canvas.getWidth() || this.d < canvas.getHeight()) {
            canvas.clipRect(this.a, this.b, this.c, this.d);
        }
    }

    public final void b(Canvas canvas) {
        if (this.a > 0 || this.b > 0 || this.c < canvas.getWidth() || this.d < canvas.getHeight()) {
            canvas.restore();
        }
    }

    public final int getClipBottom() {
        return this.d;
    }

    public final int getClipLeft() {
        return this.a;
    }

    public final int getClipRight() {
        return this.c;
    }

    public final int getClipTop() {
        return this.b;
    }

    public final void setClipBottom(int i) {
        this.d = i;
    }

    public final void setClipLeft(int i) {
        this.a = i;
    }

    public final void setClipRight(int i) {
        this.c = i;
    }

    public final void setClipTop(int i) {
        this.b = i;
    }
}
