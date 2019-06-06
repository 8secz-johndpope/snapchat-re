package defpackage;

import java.io.InputStream;

/* renamed from: saw */
final class saw implements sbd {
    private final akkd a;

    public saw(akkd akkd) {
        this.a = akkd;
    }

    public final InputStream a() {
        akkd akkd = this.a;
        if (akkd != null) {
            return akkd.clone().e();
        }
        Object a = scc.a();
        akcr.a(a, "InputStreams.empty()");
        return a;
    }

    public final void close() {
        akkd akkd = this.a;
        if (akkd != null) {
            akkd.close();
        }
    }
}
