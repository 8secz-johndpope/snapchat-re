package defpackage;

/* renamed from: achr */
public enum achr {
    LEFT_TO_RIGHT,
    RIGHT_TO_LEFT,
    TOP_TO_BOTTOM,
    BOTTOM_TO_TOP,
    PINCH_IN,
    PINCH_OUT;

    public static achr a(achr achr) {
        switch (achr) {
            case LEFT_TO_RIGHT:
                return RIGHT_TO_LEFT;
            case RIGHT_TO_LEFT:
                return LEFT_TO_RIGHT;
            case TOP_TO_BOTTOM:
                return BOTTOM_TO_TOP;
            case BOTTOM_TO_TOP:
                return TOP_TO_BOTTOM;
            case PINCH_IN:
                return PINCH_OUT;
            case PINCH_OUT:
                return PINCH_IN;
            default:
                throw new RuntimeException("Invalid input gesture");
        }
    }
}
