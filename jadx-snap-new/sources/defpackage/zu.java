package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import defpackage.zm.a;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: zu */
public abstract class zu<T> implements zm<T> {
    private final Uri a;
    private final ContentResolver b;
    private T c;

    public zu(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
    }

    public abstract T a(Uri uri, ContentResolver contentResolver);

    public abstract void a(T t);

    public final void a(yk ykVar, a<? super T> aVar) {
        try {
            this.c = a(this.a, this.b);
            aVar.a(this.c);
        } catch (FileNotFoundException e) {
            String str = "LocalUriFetcher";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to open Uri", e);
            }
            aVar.a(e);
        }
    }

    public final void b() {
        Object obj = this.c;
        if (obj != null) {
            try {
                a(obj);
            } catch (IOException unused) {
            }
        }
    }

    public final void c() {
    }

    public final yx d() {
        return yx.LOCAL;
    }
}
