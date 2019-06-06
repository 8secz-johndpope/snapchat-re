package defpackage;

import android.content.Context;
import java.io.File;
import java.io.InputStream;

/* renamed from: amv */
public final class amv implements aof<InputStream, amu> {
    private final anb a;
    private final anc b;
    private final akz c;
    private final amr<amu> d = new amr(this.a);

    public amv(Context context, ajr ajr) {
        this.a = new anb(context, ajr);
        this.b = new anc(ajr);
        this.c = new akz();
    }

    public final aiq<File, amu> a() {
        return this.d;
    }

    public final aiq<InputStream, amu> b() {
        return this.a;
    }

    public final ain<InputStream> c() {
        return this.c;
    }

    public final air<amu> d() {
        return this.b;
    }
}
