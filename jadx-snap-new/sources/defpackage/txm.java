package defpackage;

/* renamed from: txm */
public final class txm {
    public static final adie a(int i, int i2, int i3, int i4, aeew aeew, abyc abyc) {
        akcr.b(aeew, "capturedMediaMetadata");
        akcr.b(abyc, "snapScaleType");
        abuf abuf = new abuf(i, i2, i3, i4);
        float a = 1.0f / (1.0f - abuf.a());
        float b = 1.0f / (1.0f - abuf.b());
        if (abyc == abyc.CENTER_INSIDE) {
            float max = Math.max(a, b);
            a /= max;
            b /= max;
        }
        adie adie = new adie();
        Object obj = aeew.a;
        akcr.a(obj, "this.mediaType");
        if (abyp.c(obj.intValue())) {
            Integer num = aeew.b;
            adie.a((float) (num != null ? num.intValue() : 0));
        }
        adie.b(a, b);
        Object obj2 = aeew.c;
        akcr.a(obj2, "capturedMediaMetadata.isHorizontallyFlipped");
        if (obj2.booleanValue()) {
            adie.d();
        }
        return adie;
    }
}
