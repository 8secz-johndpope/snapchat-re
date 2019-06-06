package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: abwl */
public final class abwl implements abvv, abwk, abwx {
    private Supplier<Float> a = -$$Lambda$abwl$A7YX9cJWiWnjkMWD-9-jo_HTizY.INSTANCE;
    private Supplier<Float> b = -$$Lambda$abwl$drsGMsHcSHG6z9x4rJKHGTusuAI.INSTANCE;
    private Supplier<Float> c = -$$Lambda$abwl$R_Dk6P37FCN4SBDO2cGHAHK63KY.INSTANCE;
    private boolean d = true;
    private abwk e;
    private abvv f;
    private abwx g;
    private int h;
    private int i;
    private boolean j;

    private boolean b(MotionEvent motionEvent) {
        return motionEvent.getX() > ((Float) this.a.get()).floatValue() && motionEvent.getY() > ((Float) this.b.get()).floatValue() && motionEvent.getX() < ((Float) this.a.get()).floatValue() + ((float) this.h) && motionEvent.getY() < ((Float) this.b.get()).floatValue() + ((float) this.i);
    }

    public final void a(float f) {
        this.b = new -$$Lambda$abwl$PbyViyFNRnk3_UegdHoVJtNSoM8(f);
    }

    public final <T extends abwk & abvv & abwx> void a(T t) {
        this.e = t;
        this.f = (abvv) t;
        this.g = (abwx) t;
    }

    public final void a(View view, abxs abxs, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        float size = (float) MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        float size2 = (float) MeasureSpec.getSize(i2);
        int makeMeasureSpec = (mode == AudioPlayer.INFINITY_LOOP_COUNT || mode == Integer.MIN_VALUE) ? MeasureSpec.makeMeasureSpec((int) Math.max(MapboxConstants.MINIMUM_ZOOM, (size - ((Float) this.c.get()).floatValue()) - ((Float) this.a.get()).floatValue()), mode) : MeasureSpec.makeMeasureSpec(0, mode);
        int makeMeasureSpec2 = (mode2 == AudioPlayer.INFINITY_LOOP_COUNT || mode2 == Integer.MIN_VALUE) ? MeasureSpec.makeMeasureSpec((int) Math.max(MapboxConstants.MINIMUM_ZOOM, size2 - ((Float) this.b.get()).floatValue()), mode) : MeasureSpec.makeMeasureSpec(0, mode2);
        this.e.a(view, abxs, makeMeasureSpec, makeMeasureSpec2);
        float floatValue = (((float) abxs.a) + ((Float) this.c.get()).floatValue()) + ((Float) this.a.get()).floatValue();
        if (mode != AudioPlayer.INFINITY_LOOP_COUNT) {
            size = mode == Integer.MIN_VALUE ? Math.min(size, floatValue) : floatValue;
        }
        abxs.a = (int) size;
        floatValue = (((float) abxs.b) + ((Float) this.b.get()).floatValue()) + MapboxConstants.MINIMUM_ZOOM;
        if (mode2 != AudioPlayer.INFINITY_LOOP_COUNT) {
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(size2, floatValue) : floatValue;
        }
        abxs.b = (int) size2;
    }

    public final void a(View view, Canvas canvas, abxs abxs) {
        this.h = (int) ((((float) abxs.a) - ((Float) this.a.get()).floatValue()) - ((Float) this.c.get()).floatValue());
        this.i = (int) (((float) abxs.b) - ((Float) this.b.get()).floatValue());
        canvas.save();
        canvas.translate(((Float) this.a.get()).floatValue(), ((Float) this.b.get()).floatValue());
        if (this.d) {
            canvas.clipRect(0, 0, this.h, this.i);
        }
        abxs.a(this.h, this.i);
        this.f.a(view, canvas, abxs);
        abxs.a(this.h, this.i);
        this.f.b(view, canvas, abxs);
        canvas.restore();
    }

    public final void a(View view, boolean z, int i, int i2, int i3, int i4) {
        this.e.a(view, z, ((Float) this.a.get()).intValue(), ((Float) this.b.get()).intValue(), (int) (((float) (i3 - i)) - ((Float) this.c.get()).floatValue()), (int) ((float) (i4 - i2)));
    }

    public final void a(Supplier<Float> supplier) {
        this.a = supplier;
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public final boolean a(MotionEvent motionEvent) {
        if (!b(motionEvent)) {
            return false;
        }
        motionEvent.offsetLocation(-((Float) this.a.get()).floatValue(), -((Float) this.b.get()).floatValue());
        boolean a = this.g.a(motionEvent);
        motionEvent.offsetLocation(((Float) this.a.get()).floatValue(), ((Float) this.b.get()).floatValue());
        return a;
    }

    public final boolean a(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent.getActionMasked() == 0) {
            this.j = false;
        }
        if (this.j) {
            motionEvent.offsetLocation(-((Float) this.a.get()).floatValue(), -((Float) this.b.get()).floatValue());
            this.g.a(view, motionEvent);
            motionEvent.offsetLocation(((Float) this.a.get()).floatValue(), ((Float) this.b.get()).floatValue());
            return true;
        }
        if (b(motionEvent)) {
            motionEvent.offsetLocation(-((Float) this.a.get()).floatValue(), -((Float) this.b.get()).floatValue());
            z = this.g.a(view, motionEvent);
            motionEvent.offsetLocation(((Float) this.a.get()).floatValue(), ((Float) this.b.get()).floatValue());
        }
        if (z) {
            this.j = true;
        }
        return z;
    }

    public final void b(View view, Canvas canvas, abxs abxs) {
    }

    public final void b(Supplier<Float> supplier) {
        this.b = supplier;
    }

    public final void c(Supplier<Float> supplier) {
        this.c = supplier;
    }
}
