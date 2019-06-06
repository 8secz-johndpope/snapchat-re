package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.common.base.Supplier;

/* renamed from: abwh */
public final class abwh implements abvv, abwk, abwx {
    private boolean a = false;
    private Supplier<Float> b;
    private boolean c = false;
    private Supplier<Float> d;
    private boolean e = true;
    private abwk f;
    private abvv g;
    private abwx h;
    private boolean i;

    public final void a(float f) {
        this.b = new -$$Lambda$abwh$37svF4LIRt1ONjrn8q4Y1OXB7MI(f);
        this.a = true;
    }

    public final void a(abwk abwk, abvv abvv, abwx abwx) {
        this.f = abwk;
        this.g = abvv;
        this.h = abwx;
    }

    public final void a(View view, abxs abxs, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        if (this.a) {
            i = MeasureSpec.makeMeasureSpec(((Float) this.b.get()).intValue(), AudioPlayer.INFINITY_LOOP_COUNT);
        }
        if (this.c) {
            i2 = MeasureSpec.makeMeasureSpec(((Float) this.d.get()).intValue(), AudioPlayer.INFINITY_LOOP_COUNT);
        }
        this.f.a(view, abxs, i, i2);
        if (mode == AudioPlayer.INFINITY_LOOP_COUNT) {
            abxs.a = size;
        } else if (mode == Integer.MIN_VALUE) {
            abxs.a = Math.min(abxs.a, size);
        }
        if (mode2 == AudioPlayer.INFINITY_LOOP_COUNT) {
            abxs.b = size2;
            return;
        }
        if (mode2 == Integer.MIN_VALUE) {
            abxs.b = Math.min(abxs.b, size2);
        }
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        if (this.a) {
            abxs.a = ((Float) this.b.get()).intValue();
        }
        if (this.c) {
            abxs.b = ((Float) this.d.get()).intValue();
        }
        if (this.e) {
            canvas.save();
            canvas.clipRect(0, 0, abxs.a, abxs.b);
        }
        this.g.a(view, canvas, abxs);
        if (this.a) {
            abxs.a = ((Float) this.b.get()).intValue();
        }
        if (this.c) {
            abxs.b = ((Float) this.d.get()).intValue();
        }
        this.g.b(view, canvas, abxs);
        if (this.e) {
            canvas.restore();
        }
    }

    public final void a(View view, boolean z, int i, int i2, int i3, int i4) {
        this.f.a(view, z, i, i2, i3, i4);
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final boolean a(MotionEvent motionEvent) {
        return (!this.a || motionEvent.getX() <= ((Float) this.b.get()).floatValue()) ? (!this.c || motionEvent.getY() <= ((Float) this.d.get()).floatValue()) ? this.h.a(motionEvent) : false : false;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.i = false;
        }
        if (this.i) {
            this.h.a(view, motionEvent);
            return true;
        } else if (this.a && motionEvent.getX() > ((Float) this.b.get()).floatValue()) {
            return false;
        } else {
            if ((this.c && motionEvent.getY() > ((Float) this.d.get()).floatValue()) || !this.h.a(view, motionEvent)) {
                return false;
            }
            this.i = true;
            return true;
        }
    }

    public final void b(float f) {
        this.d = new -$$Lambda$abwh$fteTQKHth5QsQDmRF-Smx1NVag0(f);
        this.c = true;
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
    }
}
