package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region.Op;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: acjf */
public final class acjf<T extends achg, C extends achd<T, C>> extends acja {
    private Path b = null;
    private final WeakReference<C> c;

    public acjf(Context context, C c) {
        super(context);
        this.c = new WeakReference(c);
    }

    private /* synthetic */ Boolean a(Canvas canvas, View view, long j) {
        if (this.b != null) {
            if (VERSION.SDK_INT < 26) {
                canvas.clipPath(this.b, Op.DIFFERENCE);
            } else {
                canvas.clipOutPath(this.b);
            }
        }
        return Boolean.valueOf(super.drawChild(canvas, view, j));
    }

    private /* synthetic */ Object a(int i, int i2) {
        super.onMeasure(i, i2);
        return null;
    }

    public final void a() {
        this.b = null;
        invalidate();
    }

    public final void a(int i, float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f4);
        float f5 = (float) i;
        float f6 = f2 + f5;
        path.lineTo(f, f6);
        path.quadTo(f, f2, f + f5, f2);
        path.lineTo(f3 - f5, f2);
        path.quadTo(f3, f2, f3, f6);
        path.lineTo(f3, f4);
        path.close();
        this.b = path;
        invalidate();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean drawChild(Canvas canvas, View view, long j) {
        achd achd = (achd) this.c.get();
        if (achd != null) {
            if (((Boolean) achd.traceRenderingEvent("drawChild", new -$$Lambda$acjf$k46-kTdbNd0rDi4JVrZja0Thwus(this, canvas, view, j))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        achd achd = (achd) this.c.get();
        if (achd != null) {
            achd.traceRenderingEvent("onLayout", new -$$Lambda$acjf$XbMQ974VFx-Tt3MjsDM0C-gGvlg(this, z, i, i2, i3, i4));
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        achd achd = (achd) this.c.get();
        if (achd != null) {
            achd.traceRenderingEvent("onMeasure", new -$$Lambda$acjf$gqjU5_VP1SQjtKj887STvoh0plc(this, i, i2));
            return;
        }
        super.onMeasure(i, i2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        achd achd = (achd) this.c.get();
        return (achd == null || !achd.getDeckPageType().a()) ? false : super.onTouchEvent(motionEvent);
    }
}
