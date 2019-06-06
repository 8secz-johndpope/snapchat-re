package defpackage;

import com.addlive.djinni.CommunicationError;
import com.addlive.djinni.MediaError;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;

/* renamed from: ahlr */
public enum ahlr {
    SERVICE_OK(MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS),
    DUPLICATE_REQUEST(CommunicationError.INVALID_PORT),
    BAD_REQUEST(4000),
    UNAUTHORIZED(MediaError.INVALID_VIDEO_DEV),
    SERVICE_INTERNAL_ERROR(5000),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private ahlr(int i) {
        this.intValue = i;
    }

    public static ahlr a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        ahlr[] values = ahlr.values();
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
