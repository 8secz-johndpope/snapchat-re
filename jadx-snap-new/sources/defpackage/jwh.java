package defpackage;

import android.net.Uri;
import com.google.common.base.Preconditions;
import com.snap.core.db.record.MessageMediaRefModel;

/* renamed from: jwh */
public final class jwh {
    public final Uri a;
    public final idl b;
    public final int c;
    public final a d;

    /* renamed from: jwh$a */
    public interface a {
        void a(Throwable th, int i);

        void a(jwt jwt);
    }

    public jwh(Uri uri, idl idl) {
        this(uri, idl, 0, 12);
    }

    public jwh(Uri uri, idl idl, int i) {
        this(uri, idl, i, 8);
    }

    public jwh(Uri uri, idl idl, int i, a aVar) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(idl, "uiPage");
        this.c = i;
        this.d = aVar;
        this.a = (Uri) Preconditions.checkNotNull(uri);
        this.b = (idl) Preconditions.checkNotNull(idl);
    }

    public final boolean equals(Object obj) {
        return !(obj instanceof jwh) ? false : akcr.a(this.a, ((jwh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object uri = this.a.toString();
        akcr.a(uri, "uri.toString()");
        return uri;
    }
}
