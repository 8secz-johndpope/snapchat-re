package defpackage;

/* renamed from: sjn */
public enum sjn {
    NONE,
    PREPARING,
    MINIMALLY_DISPLAYED,
    FULLY_DISPLAYED,
    ERROR;

    public static sjn a(sjn sjn, sjn sjn2) {
        sjn sjn3 = ERROR;
        return (sjn == sjn3 || sjn2 == sjn3) ? ERROR : sjn.ordinal() < sjn2.ordinal() ? sjn : sjn2;
    }
}
