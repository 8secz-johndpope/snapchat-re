package defpackage;

/* renamed from: acyc */
public final class acyc {
    public Float a;
    public float b = -1.0f;
    private final a c;

    /* renamed from: acyc$a */
    public interface a {
        Float getRenderRatioAtZoom(float f);
    }

    public acyc(a aVar) {
        this.c = aVar;
    }

    public final Float a(float f) {
        return this.c.getRenderRatioAtZoom(f);
    }
}
