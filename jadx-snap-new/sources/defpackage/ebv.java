package defpackage;

import com.google.common.primitives.Floats;

/* renamed from: ebv */
public final class ebv {
    public float a = 1.0f;
    private float b = 1.0f;

    public final void a() {
        this.a = this.b;
    }

    public final boolean a(float f) {
        f = Floats.constrainToRange(this.a * f, 1.0f, 2.0f);
        if (f == this.a) {
            return false;
        }
        this.a = f;
        return true;
    }

    public final void b() {
        this.b = this.a;
    }
}
