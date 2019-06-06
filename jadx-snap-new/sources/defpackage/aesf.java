package defpackage;

/* renamed from: aesf */
public enum aesf {
    IMAGE(0),
    VIDEO(1),
    VIDEO_NO_SOUND(2),
    FRIEND_DEPRECATED(3),
    BLOB(4),
    LAGUNA_SOUND(5),
    LAGUNA_NO_SOUND(6),
    GIF(7),
    FINGERPRINT_HEADER_SIZE(8),
    AUDIO_STITCH(9),
    PSYCHOMANTIS(10),
    SCREAMINGMANTIS(11),
    MALIBU_SOUND(12),
    MALIBU_NO_SOUND(13),
    LAGUNAHD_SOUND(14),
    LAGUNAHD_NO_SOUND(15),
    GHOSTMANTIS(16),
    NEWPORT_SOUND(17),
    NEWPORT_NO_SOUND(18),
    AUDIO(19),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private aesf(int i) {
        this.intValue = i;
    }

    public static aesf a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        aesf[] values = aesf.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].intValue == num.intValue()) {
                return values[i];
            }
        }
        return UNRECOGNIZED_VALUE;
    }

    public final int a() {
        return this.intValue;
    }
}
