package defpackage;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;

/* renamed from: slk */
public abstract class slk {
    private static final LayoutParams a = new LayoutParams(-1, -1);
    public sjo F = sjo.DESTROYED;

    /* Access modifiers changed, original: protected */
    public void C_() {
    }

    public final void a(Canvas canvas, int i) {
        int[] iArr = new int[2];
        e().getLocationOnScreen(iArr);
        if (!(iArr[0] == 0 && iArr[1] == 0)) {
            canvas.translate((float) iArr[0], (float) iArr[1]);
        }
        b(canvas, i);
        if (iArr[0] != 0 || iArr[1] != 0) {
            canvas.translate((float) (-iArr[0]), (float) (-iArr[1]));
        }
    }

    public void a(szo szo) {
    }

    /* Access modifiers changed, original: protected */
    public void a(szw szw) {
    }

    public final void a(szw szw, sjp sjp) {
        if (this.F == sjo.PAUSED || this.F == sjo.STARTED) {
            this.F = sjo.STOPPING_GRACEFULLY;
            b(szw, sjp);
        }
    }

    public void a_(szw szw) {
    }

    /* Access modifiers changed, original: protected */
    public void ae_() {
    }

    public boolean af_() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void b() {
    }

    /* Access modifiers changed, original: protected */
    public void b(Canvas canvas, int i) {
        e().draw(canvas);
    }

    /* Access modifiers changed, original: protected */
    public void b(szw szw) {
    }

    public void b(szw szw, sjp sjp) {
        i(szw);
        sjp.a();
    }

    public void c(float f) {
    }

    /* Access modifiers changed, original: protected */
    public void c(szw szw) {
    }

    public abstract View e();

    public void e(szw szw) {
    }

    public abstract String f();

    public final void g(szw szw) {
        if (this.F != sjo.STARTED) {
            a(szw);
            this.F = sjo.STARTED;
        }
    }

    public final void h(szw szw) {
        if (this.F == sjo.PAUSED) {
            c(szw);
            this.F = sjo.STARTED;
        }
    }

    public boolean h() {
        return false;
    }

    public final void i(szw szw) {
        if (this.F == sjo.PAUSED || this.F == sjo.STARTED || this.F == sjo.STOPPING_GRACEFULLY) {
            b(szw);
            this.F = sjo.STOPPED;
        }
    }

    public LayoutParams j() {
        return a;
    }

    public final void r() {
        if (this.F == sjo.DESTROYED) {
            ae_();
            this.F = sjo.PREPARED;
        }
    }

    public final void s() {
        if (this.F == sjo.STARTED) {
            C_();
            this.F = sjo.PAUSED;
        }
    }

    public final void t() {
        if (this.F != sjo.DESTROYED) {
            b();
            this.F = sjo.DESTROYED;
            u();
        }
    }

    /* Access modifiers changed, original: 0000 */
    public void u() {
    }

    public final sjo v() {
        return this.F;
    }
}
