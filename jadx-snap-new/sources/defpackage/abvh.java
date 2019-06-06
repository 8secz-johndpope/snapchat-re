package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Scroller;
import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abvh */
public final class abvh implements abvi, Runnable {
    public float a = MapboxConstants.MINIMUM_ZOOM;
    private b b = new a();
    private float c = MapboxConstants.MINIMUM_ZOOM;
    private Supplier<Float> d = -$$Lambda$abvh$0cYUcN_QlOFoWREEyQoCtzGAZCY.INSTANCE;
    private Supplier<Float> e = -$$Lambda$abvh$rpwPV1pMXm-pGfXduXABlFIDk24.INSTANCE;
    private final Scroller f;
    private final List<abvg> g = new ArrayList();
    private final boolean h;
    private int i = 0;
    private float j = 1.0f;
    private c k = null;

    /* renamed from: abvh$b */
    interface b {
        void a(Runnable runnable);

        void b(Runnable runnable);
    }

    /* renamed from: abvh$c */
    public interface c {
        float a(float f);
    }

    /* renamed from: abvh$a */
    static class a implements b {
        private final Handler a;

        private a() {
            this.a = new Handler(Looper.getMainLooper());
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final void a(Runnable runnable) {
            this.a.post(runnable);
        }

        public final void b(Runnable runnable) {
            this.a.removeCallbacks(runnable);
        }
    }

    public abvh(Context context, boolean z) {
        this.f = new Scroller(context);
        this.h = z;
    }

    private float d(float f) {
        c cVar = this.k;
        return cVar != null ? cVar.a(f) : f;
    }

    private void j() {
        for (int size = this.g.size() - 1; size >= 0; size--) {
            ((abvg) this.g.get(size)).a(this.a);
        }
    }

    private void k() {
        this.i = 0;
        for (int size = this.g.size() - 1; size >= 0; size--) {
            ((abvg) this.g.get(size)).b(0);
        }
    }

    public final void a() {
        if (!this.f.isFinished()) {
            g();
        }
        this.i = 1;
        for (int size = this.g.size() - 1; size >= 0; size--) {
            ((abvg) this.g.get(size)).b(1);
        }
    }

    public final void a(float f) {
        this.c = (this.c + f) - this.a;
        this.a = f;
        j();
    }

    public final void a(int i, int i2) {
        this.a = this.h ? abpf.a(this.c - ((float) i2), ((Float) this.e.get()).floatValue(), ((Float) this.d.get()).floatValue()) : abpf.a(this.c - ((float) i), ((Float) this.e.get()).floatValue(), ((Float) this.d.get()).floatValue());
        j();
    }

    public final void a(abvg abvg) {
        this.g.add(abvg);
    }

    public final void a(c cVar) {
        this.k = cVar;
    }

    public final void a(Supplier<Float> supplier) {
        this.d = supplier;
    }

    public final void a(boolean z, int i, int i2) {
        float f;
        Scroller scroller;
        if (z) {
            int size;
            this.i = 2;
            for (size = this.g.size() - 1; size >= 0; size--) {
                ((abvg) this.g.get(size)).b(2);
            }
            Scroller scroller2 = this.f;
            f = this.a;
            scroller2.fling((int) f, (int) f, -i, -i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            f = (float) (this.h ? this.f.getFinalY() : this.f.getFinalX());
            if (!abpf.a(f, this.a)) {
                float d = d(abpf.a(f, ((Float) this.e.get()).floatValue(), ((Float) this.d.get()).floatValue()));
                size = (int) d;
                this.f.setFinalX(size);
                this.f.setFinalY(size);
                d = Math.abs(d - this.a) / Math.abs(f - this.a);
                scroller = this.f;
                scroller.extendDuration((int) ((((float) scroller.getDuration()) * d) * this.j));
            }
            this.b.a(this);
            return;
        }
        f = d(this.a);
        if (abpf.a(f, this.a)) {
            k();
            this.c = this.a;
            return;
        }
        Scroller scroller3 = this.f;
        float f2 = this.a;
        scroller3.startScroll((int) f2, (int) f2, (int) (f - f2), (int) (f - f2));
        scroller = this.f;
        scroller.extendDuration((int) (((float) scroller.getDuration()) * this.j));
        this.b.a(this);
    }

    public final void b() {
        k();
        this.c = this.a;
    }

    public final void b(float f) {
        this.d = new -$$Lambda$abvh$9u9rn-7Yaz6FTTPq24p-SYvQ7j4(f);
    }

    public final float c() {
        return this.a;
    }

    public final void c(float f) {
        this.e = new -$$Lambda$abvh$Ki6SaogjtS7DjPbX8l3wKipPUiE(f);
    }

    public final float d() {
        return ((Float) this.d.get()).floatValue();
    }

    public final float e() {
        return ((Float) this.e.get()).floatValue();
    }

    public final boolean f() {
        return !this.f.isFinished();
    }

    public final void g() {
        this.f.abortAnimation();
        this.c = this.a;
        this.b.b(this);
    }

    public final void h() {
        this.j = 3.7f;
    }

    public final void i() {
        this.f.setFriction(0.4f);
    }

    public final void run() {
        if (this.f.computeScrollOffset()) {
            this.a = (float) (this.h ? this.f.getCurrY() : this.f.getCurrX());
            j();
            this.b.a(this);
            return;
        }
        int i = this.i;
        if (i == 2 || i == 1 || i == 3) {
            k();
            this.c = this.a;
        }
    }
}
