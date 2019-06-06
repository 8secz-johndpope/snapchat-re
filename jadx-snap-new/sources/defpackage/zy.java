package defpackage;

import android.net.Uri;
import com.brightcove.player.event.Event;
import com.mapbox.mapboxsdk.style.sources.RasterSource;

/* renamed from: zy */
public final class zy {
    public static boolean a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= RasterSource.DEFAULT_TILE_SIZE && i2 <= 384;
    }

    public static boolean a(Uri uri) {
        if (uri != null) {
            if ("content".equals(uri.getScheme())) {
                if ("media".equals(uri.getAuthority())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(Uri uri) {
        return uri.getPathSegments().contains(Event.VIDEO);
    }
}
