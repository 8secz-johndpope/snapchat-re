package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import com.google.common.base.Preconditions;

/* renamed from: jxp */
public final class jxp {
    public static Uri a(int i) {
        return new Builder().scheme("res").path(String.valueOf(i)).build();
    }

    public static Uri a(Uri uri) {
        Preconditions.checkArgument("content".equalsIgnoreCase(uri.getScheme()));
        return uri.buildUpon().scheme("content2").build();
    }

    public static Uri b(int i) {
        return new Builder().scheme("res2").path(String.valueOf(i)).build();
    }

    public static boolean b(Uri uri) {
        return "res".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean c(Uri uri) {
        return "res2".equalsIgnoreCase(uri.getScheme());
    }

    public static boolean d(Uri uri) {
        if (uri != null) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Uri uri) {
        return "content2".equalsIgnoreCase(uri.getScheme());
    }

    public static int f(Uri uri) {
        boolean z = jxp.b(uri) || jxp.c(uri);
        Preconditions.checkArgument(z);
        String path = uri.getPath();
        if (path.charAt(0) == '/') {
            path = uri.getPath().substring(1);
        }
        return Integer.parseInt(path);
    }

    public static Uri g(Uri uri) {
        Preconditions.checkArgument(jxp.e(uri));
        return uri.buildUpon().scheme("content").build();
    }
}
