package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* renamed from: gy */
public final class gy {
    public static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, ij ijVar) {
        if (VERSION.SDK_INT >= 16) {
            Object b;
            if (ijVar != null) {
                try {
                    b = ijVar.b();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new il();
                    }
                    throw e;
                }
            }
            b = null;
            return contentResolver.query(uri, strArr, null, null, str2, (CancellationSignal) b);
        } else if (ijVar == null || !ijVar.a()) {
            return contentResolver.query(uri, strArr, null, null, str2);
        } else {
            throw new il();
        }
    }
}
