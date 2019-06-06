package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import com.brightcove.player.media.MediaService;

/* renamed from: auw */
public final class auw {
    static {
        Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo").getPath();
    }

    public static boolean a(Uri uri) {
        String d = auw.d(uri);
        return "https".equals(d) || MediaService.DEFAULT_MEDIA_DELIVERY.equals(d);
    }

    public static boolean b(Uri uri) {
        return "asset".equals(auw.d(uri));
    }

    public static boolean c(Uri uri) {
        return "res".equals(auw.d(uri));
    }

    public static String d(Uri uri) {
        return uri == null ? null : uri.getScheme();
    }
}
