package defpackage;

import defpackage.gdx.a;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* renamed from: gfl */
public interface gfl {

    /* renamed from: gfl$a */
    public interface a {
        List<gdt> a(gez gez);
    }

    /* renamed from: gfl$b */
    public static final class b {
        public static gez a(gej gej, a aVar) {
            akcr.b(gej, "result");
            akcr.b(aVar, "cacheEntry");
            throw new UnsupportedOperationException();
        }
    }

    gez a(gej gej, a aVar);

    gez a(InputStream inputStream, a aVar, Map<String, String> map);

    a a();
}
