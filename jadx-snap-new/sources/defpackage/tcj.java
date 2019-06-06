package defpackage;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import android.view.View;
import com.google.common.base.Supplier;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.abql.a;

/* renamed from: tcj */
public final class tcj {
    boolean a;
    public float b;
    public float c;
    private final View d;
    private final Supplier<abql> e;
    private abqm f;
    private final FrameCallback g = new 1();

    /* renamed from: tcj$1 */
    class 1 implements FrameCallback {
        1() {
        }

        public final void doFrame(long j) {
            if (tcj.this.a) {
                tcj.this.d();
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    /* renamed from: tcj$2 */
    class 2 implements Supplier<abql> {
        2() {
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return a.a;
        }
    }

    /* renamed from: tcj$3 */
    class 3 implements abqm {
        3() {
        }

        public final void a(float f) {
        }
    }

    public tcj(View view) {
        this.d = view;
        this.e = new 2();
        c();
    }

    private void a(float f) {
        this.d.setRotation(f);
        if (this.b > f) {
            this.b = f;
        }
        if (this.c < f) {
            this.c = f;
        }
    }

    private abqm e() {
        return new 3();
    }

    private void f() {
        this.d.setRotation(MapboxConstants.MINIMUM_ZOOM);
    }

    public final void a() {
        if (!this.a) {
            this.a = true;
            this.d.setLayerType(2, null);
            this.f = e();
            ((abql) this.e.get()).a(this.f);
            d();
            Choreographer.getInstance().postFrameCallback(this.g);
        }
    }

    public final void b() {
        if (this.a) {
            this.a = false;
            this.d.setLayerType(0, null);
            ((abql) this.e.get()).b(this.f);
            this.f = null;
            Choreographer.getInstance().removeFrameCallback(this.g);
            f();
        }
    }

    public final void c() {
        this.b = Float.MAX_VALUE;
        this.c = Float.MIN_VALUE;
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        if (this.f != null) {
            a(((abql) this.e.get()).b());
        }
    }
}
