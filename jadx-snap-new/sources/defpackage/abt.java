package defpackage;

import defpackage.abq.a;
import java.io.File;

/* renamed from: abt */
public class abt implements a {
    private final long a = 262144000;
    private final a b;

    /* renamed from: abt$a */
    public interface a {
        File a();
    }

    public abt(a aVar) {
        this.b = aVar;
    }

    public final abq a() {
        File a = this.b.a();
        return a == null ? null : (a.mkdirs() || (a.exists() && a.isDirectory())) ? new abu(a, 262144000) : null;
    }
}
