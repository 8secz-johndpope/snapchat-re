package defpackage;

import com.addlive.djinni.CommunicationError;
import com.addlive.djinni.MediaError;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;

/* renamed from: aili */
public enum aili {
    SERVICE_OK(MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS),
    DUPLICATE_REQUEST(CommunicationError.INVALID_HOST),
    BAD_REQUEST(4000),
    UNAUTHORIZED_USER(MediaError.INVALID_VIDEO_DEV),
    SERVICE_INTERNAL_ERROR(5000),
    THROTTLED(5001),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private aili(int i) {
        this.intValue = i;
    }

    public static aili a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        aili[] values = aili.values();
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
