package defpackage;

import com.addlive.djinni.CommunicationError;
import com.addlive.djinni.MediaError;

/* renamed from: agxf */
public enum agxf {
    CREATED(CommunicationError.INVALID_HOST),
    BAD_PROFILE_MISSING(4000),
    BAD_REGISTRATION_DATE(MediaError.INVALID_VIDEO_DEV),
    BAD_MINIMUM_ENTRIES_COUNT(MediaError.NO_AUDIO_IN_DEV),
    BAD_MINIMUM_SNAPS_COUNT(MediaError.INVALID_AUDIO_IN_DEV),
    BAD_MINIMUM_GROUPS_COUNT(MediaError.INVALID_AUDIO_OUT_DEV),
    VIEWED(CommunicationError.INVALID_PORT),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agxf(int i) {
        this.intValue = i;
    }

    public static agxf a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agxf[] values = agxf.values();
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
