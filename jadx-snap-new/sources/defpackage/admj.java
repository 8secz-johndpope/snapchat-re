package defpackage;

import android.media.MediaMetadataRetriever;
import java.io.FileDescriptor;

/* renamed from: admj */
public final class admj {
    private final adnl a;

    public admj(adnl adnl) {
        akcr.b(adnl, "mMediaMetadataRetrieverConnection");
        this.a = adnl;
    }

    public static MediaMetadataRetriever a(FileDescriptor fileDescriptor) {
        akcr.b(fileDescriptor, "fileDescriptor");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        adnl.a(mediaMetadataRetriever, fileDescriptor);
        return mediaMetadataRetriever;
    }
}
