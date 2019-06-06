package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* renamed from: aab */
final class aab {
    private static final zx a = new zx();
    private final zx b;
    private final aaa c;
    private final abd d;
    private final ContentResolver e;
    private final List<ImageHeaderParser> f;

    aab(List<ImageHeaderParser> list, aaa aaa, abd abd, ContentResolver contentResolver) {
        this(list, a, aaa, abd, contentResolver);
    }

    private aab(List<ImageHeaderParser> list, zx zxVar, aaa aaa, abd abd, ContentResolver contentResolver) {
        this.b = zxVar;
        this.c = aaa;
        this.d = abd;
        this.e = contentResolver;
        this.f = list;
    }

    private String c(Uri uri) {
        Cursor a = this.c.a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    String string = a.getString(0);
                    return string;
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final int a(Uri uri) {
        String str = "ThumbStreamOpener";
        InputStream inputStream = null;
        Object uri2;
        try {
            inputStream = this.e.openInputStream(uri2);
            uri2 = zc.b(this.f, inputStream, this.d);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return uri2;
        } catch (IOException | NullPointerException e) {
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to open uri: ".concat(String.valueOf(uri2)), e);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            return -1;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    public final InputStream b(Uri uri) {
        String c = c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File file = new File(c);
        Object obj = (!file.exists() || 0 >= file.length()) ? null : 1;
        if (obj == null) {
            return null;
        }
        Uri fromFile = Uri.fromFile(file);
        Object uri2;
        try {
            uri2 = this.e.openInputStream(fromFile);
            return uri2;
        } catch (NullPointerException e) {
            StringBuilder stringBuilder = new StringBuilder("NPE opening uri: ");
            stringBuilder.append(uri2);
            stringBuilder.append(" -> ");
            stringBuilder.append(fromFile);
            throw ((FileNotFoundException) new FileNotFoundException(stringBuilder.toString()).initCause(e));
        }
    }
}
