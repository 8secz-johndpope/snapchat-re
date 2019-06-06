package defpackage;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: ave */
public final class ave implements Closeable {
    private final auq<auo> a;
    private final aui<InputStream> b;
    private avx c = avx.a;
    private int d = -1;
    private int e = -1;
    private int f = -1;
    private int g = 1;
    private int h = -1;

    public ave(aui<InputStream> aui) {
        auh.a((Object) aui);
        this.a = null;
        this.b = aui;
    }

    public final InputStream a() {
        aui aui = this.b;
        if (aui != null) {
            return (InputStream) aui.get();
        }
        auq b = auq.b(null);
        if (b == null) {
            return null;
        }
        try {
            InputStream aup = new aup((auo) b.a());
            return aup;
        } finally {
            auq.c(b);
        }
    }

    public final void close() {
        auq.c(null);
    }
}
