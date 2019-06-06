package defpackage;

/* renamed from: xja */
public enum xja {
    DISABLED(null),
    AMBA_LOW_TEMPERATURE(Integer.valueOf(0)),
    AMBA_HIGH_TEMPERATURE(Integer.valueOf(1)),
    WIFI_LOW_TEMPERATURE(Integer.valueOf(2)),
    WIFI_HIGH_TEMPERATURE(Integer.valueOf(3)),
    WIFI_START_FAILURE(Integer.valueOf(4)),
    LOW_BATTERY(Integer.valueOf(5)),
    NO_STORAGE(Integer.valueOf(6)),
    IMAGE_SENSOR_LOW_TEMPERATURE(Integer.valueOf(7)),
    IMAGE_SENSOR_HIGH_TEMPERATURE(Integer.valueOf(8)),
    AMBA_CRASH(Integer.valueOf(9));
    
    public final Integer errorTypeToFake;

    private xja(Integer num) {
        this.errorTypeToFake = num;
    }
}
