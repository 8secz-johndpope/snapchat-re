package defpackage;

import android.media.MediaMetadataRetriever;
import java.io.FileDescriptor;

/* renamed from: acbk */
public final class acbk {
    public static MediaMetadataRetriever a(FileDescriptor fileDescriptor) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(fileDescriptor);
            return mediaMetadataRetriever;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
