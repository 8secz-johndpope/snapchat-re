package defpackage;

import com.looksery.sdk.touch.TouchConverter;

/* renamed from: mpm */
final class mpm extends TouchConverter<Object> {
    final iia a = new iia(0, 0);
    iia b = new iia(0, 0);
    private final a c = new a(this);

    /* renamed from: mpm$a */
    public static final class a extends TouchConverter<iia> {
        private /* synthetic */ mpm a;

        a(mpm mpm) {
            this.a = mpm;
        }

        /* renamed from: a */
        public final float[] normalizePosition(iia iia, float f, float f2) {
            akcr.b(iia, "viewResolution");
            float a = (((float) this.a.b.a()) * ((float) iia.b())) / (((float) this.a.b.b()) * ((float) iia.a()));
            float min = Math.min(1.0f, 1.0f / a);
            f /= (float) iia.a();
            float b = 0.5f - ((0.5f - (f2 / ((float) iia.b()))) * Math.min(1.0f, a));
            return new float[]{0.5f - ((0.5f - f) * min), b};
        }
    }

    public final float[] normalizePosition(Object obj, float f, float f2) {
        return (this.a.a() == 0 || this.a.b() == 0 || this.b.a() == 0 || this.b.b() == 0) ? mlu.a : this.c.normalizePosition(this.a, f, f2);
    }
}
