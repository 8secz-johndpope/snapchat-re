package defpackage;

import com.google.common.collect.ImmutableMap;
import java.net.URISyntaxException;

/* renamed from: dky */
public abstract class dky {

    /* renamed from: dky$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public abstract String a();

    public final String a(dkw dkw) {
        akcr.b(dkw, "context");
        try {
            Object a = dih.a(d(), ImmutableMap.of("logQ", dih.b(a()), "bg", String.valueOf(dkw.a), "ecnt", String.valueOf(dkw.b), "decnt", String.valueOf(dkw.c)));
            akcr.a(a, "BlizzardLoggerUtils.appe…          )\n            )");
            return a;
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract void a(boolean z);

    public abstract boolean b();

    public abstract dkx c();

    public abstract String d();
}
