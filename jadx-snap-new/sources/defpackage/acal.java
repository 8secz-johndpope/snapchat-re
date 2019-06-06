package defpackage;

/* renamed from: acal */
public enum acal {
    WEATHER(0),
    SPEED(1),
    BATTERY(2),
    DATE(3),
    ALTITUDE(4),
    RATING(5),
    UNRECOGNIZED_VALUE(6),
    MENTION(7),
    VENUE(8);
    
    private final int type;

    private acal(int i) {
        this.type = i;
    }
}
