package defpackage;

/* renamed from: rxm */
public enum rxm {
    CONNECTIONCLASS_UNDER400KBITPS(0, 0, 409600),
    CONNECTIONCLASS_400KBITPS_800KBITPS(1, 409600, 819200),
    CONNECTIONCLASS_800KBITPS_1600KBITPS(2, 819200, 1638400),
    CONNECTIONCLASS_1600KBITPS_4MBITPS(3, 1638400, 4096000),
    CONNECTIONCLASS_4MBITPS_8MBITPS(4, 4096000, 8192000),
    CONNECTIONCLASS_8MBITPS_16MBITPS(5, 8192000, 16384000),
    CONNECTIONCLASS_ABOVE16MBITPS(6, 16384000, Integer.MAX_VALUE),
    UNRECOGNIZED_VALUE(-9999, -1, -1);
    
    public final int bottom_bandwidth_bps;
    private final int intValue;
    public final int top_bandwidth_bps;

    private rxm(int i, int i2, int i3) {
        this.intValue = i;
        this.bottom_bandwidth_bps = i2;
        this.top_bandwidth_bps = i3;
    }

    public static rxm a(int i) {
        switch (i) {
            case 0:
                return CONNECTIONCLASS_UNDER400KBITPS;
            case 1:
                return CONNECTIONCLASS_400KBITPS_800KBITPS;
            case 2:
                return CONNECTIONCLASS_800KBITPS_1600KBITPS;
            case 3:
                return CONNECTIONCLASS_1600KBITPS_4MBITPS;
            case 4:
                return CONNECTIONCLASS_4MBITPS_8MBITPS;
            case 5:
                return CONNECTIONCLASS_8MBITPS_16MBITPS;
            case 6:
                return CONNECTIONCLASS_ABOVE16MBITPS;
            default:
                return UNRECOGNIZED_VALUE;
        }
    }

    public final String toString() {
        switch (this) {
            case CONNECTIONCLASS_UNDER400KBITPS:
                return "UNDER_400Kbitps";
            case CONNECTIONCLASS_400KBITPS_800KBITPS:
                return "400Kbitps_TO_800Kbitps";
            case CONNECTIONCLASS_800KBITPS_1600KBITPS:
                return "800Kbitps_TO_1600Kbitps";
            case CONNECTIONCLASS_1600KBITPS_4MBITPS:
                return "1600Kbitps_TO_4Mbitps";
            case CONNECTIONCLASS_4MBITPS_8MBITPS:
                return "4Mbitps_TO_8Mbitps";
            case CONNECTIONCLASS_8MBITPS_16MBITPS:
                return "8Mbitps_TO_16Mbitps";
            case CONNECTIONCLASS_ABOVE16MBITPS:
                return "ABOVE_16Mbitps";
            default:
                return "UNKNOWN";
        }
    }
}
