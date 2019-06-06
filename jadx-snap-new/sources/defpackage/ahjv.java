package defpackage;

import com.addlive.djinni.MediaError;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;

/* renamed from: ahjv */
public enum ahjv {
    SERVICE_OK(MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS),
    SERVICE_BUSY(MediaError.INVALID_VIDEO_DEV),
    SERVICE_UNAVAIABLE(MediaError.NO_AUDIO_IN_DEV),
    ILLEGAL_ARGUMENTS(MediaError.INVALID_AUDIO_IN_DEV),
    UNAUTHORIZED_USER(MediaError.INVALID_AUDIO_OUT_DEV),
    USER_NOT_EXSIT(MediaError.INVALID_AUDIO_DEV),
    INVAILD_TIMESTAMP(4006),
    SERVICE_INTERNAL_ERROR(5000),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private ahjv(int i) {
        this.intValue = i;
    }

    public static ahjv a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        ahjv[] values = ahjv.values();
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
