package defpackage;

import defpackage.aku.a;
import java.util.Collections;
import java.util.Map;

/* renamed from: akp */
public interface akp {
    public static final akp a;

    /* renamed from: akp$1 */
    static class 1 implements akp {
        1() {
        }

        public final Map<String, String> a() {
            return Collections.emptyMap();
        }
    }

    static {
        1 1 = new 1();
        a aVar = new a();
        aVar.a = true;
        a = new aku(aVar.b);
    }

    Map<String, String> a();
}
