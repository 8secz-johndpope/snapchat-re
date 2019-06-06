package defpackage;

/* renamed from: achj */
public enum achj {
    DRAGGING,
    SETTLING_TO_DESTINATION,
    SETTLING_BACK_TO_SOURCE;

    public final boolean a() {
        return this == SETTLING_TO_DESTINATION || this == SETTLING_BACK_TO_SOURCE;
    }
}
