package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abvs */
public final class abvs extends View {
    private final List<abwk> a = new ArrayList();
    private final List<abvv> b = new ArrayList();
    private final List<abwx> c = new ArrayList();
    private final List<abvt> d = new ArrayList();
    private final abxs e = new abxs();
    private final abxs f = new abxs();
    private abwx g = null;

    public abvs(Context context) {
        super(context);
    }

    public final void a(abvt abvt) {
        this.d.add(abvt);
    }

    public final void a(abvv abvv) {
        this.b.add(abvv);
    }

    public final void a(abwk abwk) {
        this.a.add(abwk);
    }

    public final void a(abwx abwx) {
        this.c.add(abwx);
    }

    public final boolean canScrollHorizontally(int i) {
        if (this.d.isEmpty()) {
            return super.canScrollHorizontally(i);
        }
        i = this.d.size();
        for (int i2 = 0; i2 < i; i2++) {
            if (((abvt) this.d.get(i2)).a()) {
                return true;
            }
        }
        return false;
    }

    public final boolean canScrollVertically(int i) {
        if (this.d.isEmpty()) {
            return super.canScrollVertically(i);
        }
        i = this.d.size();
        for (int i2 = 0; i2 < i; i2++) {
            if (((abvt) this.d.get(i2)).b()) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDraw(Canvas canvas) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            this.f.a(getWidth(), getHeight());
            ((abvv) this.b.get(i)).a(this, canvas, this.f);
        }
        super.onDraw(canvas);
        for (size--; size >= 0; size--) {
            this.f.a(getWidth(), getHeight());
            ((abvv) this.b.get(size)).b(this, canvas, this.f);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int size = this.a.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((abwk) this.a.get(i5)).a(this, z, i, i2, i3, i4);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int size = this.a.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            ((abwk) this.a.get(i5)).a(this, this.e, i, i2);
            i3 = Math.max(i3, View.resolveSize(this.e.a, i));
            i4 = Math.max(i4, View.resolveSize(this.e.b, i2));
        }
        setMeasuredDimension(i3, i4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.g = null;
        }
        abwx abwx = this.g;
        if (abwx != null) {
            abwx.a(this, motionEvent);
            return true;
        }
        boolean z = false;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            abwx abwx2 = (abwx) this.c.get(size);
            if (abwx2.a(this, motionEvent)) {
                this.g = abwx2;
                int action = motionEvent.getAction();
                motionEvent.setAction(3);
                for (size = this.c.size() - 1; size >= 0; size--) {
                    abwx abwx3 = (abwx) this.c.get(size);
                    if (abwx3 != abwx2) {
                        abwx3.a(this, motionEvent);
                    }
                }
                motionEvent.setAction(action);
                return true;
            }
            if (!z && abwx2.a(motionEvent)) {
                z = true;
            }
        }
        return z;
    }
}
