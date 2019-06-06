package defpackage;

/* renamed from: acuv */
public final class acuv {
    public float a;
    public float b;
    public float c;
    public float d;

    public final float a() {
        return this.b - this.d;
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final float b() {
        return this.c - this.a;
    }

    public final float c() {
        return (this.a + this.c) / 2.0f;
    }

    public final float d() {
        return (this.b + this.d) / 2.0f;
    }
}
