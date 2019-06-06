package defpackage;

import com.addlive.djinni.CommunicationError;
import com.addlive.djinni.MediaError;
import com.snap.ui.view.multisnap.MultiSnapThumbnailView;

/* renamed from: agvr */
public enum agvr {
    SERVICE_OK(MultiSnapThumbnailView.MIN_SEGMENT_DURATION_MS),
    SERVICE_PARTIAL_FAILURE(CommunicationError.INVALID_HOST),
    DUPLICATE_REQUEST(CommunicationError.INVALID_PORT),
    BAD_REQUEST(4000),
    UNAUTHORIZED_USER(MediaError.INVALID_VIDEO_DEV),
    OUT_OF_SYNC(MediaError.NO_AUDIO_IN_DEV),
    MEDIA_TOO_LARGE(MediaError.INVALID_AUDIO_IN_DEV),
    OVERLAY_TOO_LARGE(MediaError.INVALID_AUDIO_OUT_DEV),
    SNAP_QUOTA_REACHED(MediaError.INVALID_AUDIO_DEV),
    SNAP_NOT_FOUND(4006),
    UPGRADE_REQUIRED(4007),
    SNAP_DEFUNCT(4008),
    SERVICE_INTERNAL_ERROR(5000),
    SERVICE_UNAVAILABLE(5001),
    THROTTLED(5002),
    MEDIA_NOT_UPLOADED(5003),
    THUMBNAIL_NOT_UPLOADED(5004),
    OVERLAY_IMAGE_NOT_UPLOADED(5005),
    UNRECOGNIZED_VALUE(-9999);
    
    private final int intValue;

    private agvr(int i) {
        this.intValue = i;
    }

    public static agvr a(Integer num) {
        if (num == null) {
            return UNRECOGNIZED_VALUE;
        }
        agvr[] values = agvr.values();
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
