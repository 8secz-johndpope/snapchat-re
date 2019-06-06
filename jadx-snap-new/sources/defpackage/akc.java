package defpackage;

import defpackage.ajz.a;
import java.io.File;

/* renamed from: akc */
public class akc implements a {
    private final int a = 262144000;
    private final a b;

    /* renamed from: akc$a */
    public interface a {
        File a();
    }

    public akc(a aVar) {
        this.b = aVar;
    }

    public ajz build() {
        File a = this.b.a();
        return a == null ? null : (a.mkdirs() || (a.exists() && a.isDirectory())) ? akd.a(a, 262144000) : null;
    }
}
