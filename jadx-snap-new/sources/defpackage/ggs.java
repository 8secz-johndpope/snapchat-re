package defpackage;

import android.net.Uri;
import com.google.common.base.Preconditions;
import java.io.File;
import java.io.InputStream;

/* renamed from: ggs */
final class ggs implements gdt {
    private final String a;
    private final int b;
    private final gez c;

    public ggs(String str, int i, gez gez) {
        boolean z = i >= 0 && i < gez.a();
        Preconditions.checkArgument(z);
        this.a = str;
        this.b = i;
        this.c = gez;
    }

    public final String a() {
        return this.a;
    }

    public final InputStream b() {
        return (InputStream) Preconditions.checkNotNull(this.c.a(this.b));
    }

    @Deprecated
    public final File c() {
        return (File) Preconditions.checkNotNull(this.c.b(this.b));
    }

    public final Uri d() {
        return Uri.fromFile(c());
    }

    public final long e() {
        return this.c.c(this.b);
    }
}
