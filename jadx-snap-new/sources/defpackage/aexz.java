package defpackage;

/* renamed from: aexz */
public final class aexz {
    public static aeaa a(aexx aexx) {
        aeaa aeaa = new aeaa();
        if (aexx.a != null) {
            aeaa.a = aexx.a.intValue();
        }
        if (aexx.b != null) {
            aeaa.b = aexx.b.intValue();
        }
        return aeaa;
    }

    public static aexx a(aeaa aeaa) {
        aexx aexx = new aexx();
        aexx.a = Integer.valueOf(aeaa.a);
        aexx.b = Integer.valueOf(aeaa.b);
        return aexx;
    }
}
