package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;

/* renamed from: anj */
public final class anj implements aof<akr, and> {
    private final aiq<File, and> a;
    private final aiq<akr, and> b;
    private final air<and> c;
    private final ain<akr> d;

    public anj(aof<akr, Bitmap> aof, aof<InputStream, amu> aof2, ajr ajr) {
        anf anf = new anf(aof.b(), aof2.b(), ajr);
        this.a = new amr(new anh(anf));
        this.b = anf;
        this.c = new ang(aof.d(), aof2.d());
        this.d = aof.c();
    }

    public final aiq<File, and> a() {
        return this.a;
    }

    public final aiq<akr, and> b() {
        return this.b;
    }

    public final ain<akr> c() {
        return this.d;
    }

    public final air<and> d() {
        return this.c;
    }
}
