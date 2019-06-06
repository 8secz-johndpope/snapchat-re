package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: abyh */
public enum abyh {
    MEDIA_ERROR_MISSING_FILE,
    MEDIA_ERROR_DECRYPTION,
    MEDIA_ERROR_PLAYBACK,
    MEDIA_ERROR_DISK_FULL,
    MEDIA_ERROR_NO_EXTERNAL_DIR,
    MEDIA_ERROR_VALIDATION,
    MEDIA_ERROR_DECRYPTION_NULL_URI,
    MEDIA_ERROR_BLANK_WEBVIEW,
    MEDIA_ERROR_TIMEOUT,
    MEDIA_ERROR_IO,
    MEDIA_ERROR_SOURCE,
    MEDIA_ERROR_RENDERER,
    MEDIA_ERROR_RUNTIME;

    public static abyh a(IOException iOException) {
        return iOException instanceof FileNotFoundException ? MEDIA_ERROR_MISSING_FILE : (iOException.getMessage() == null || !iOException.getMessage().contains("ENOSPC")) ? MEDIA_ERROR_IO : MEDIA_ERROR_DISK_FULL;
    }
}
