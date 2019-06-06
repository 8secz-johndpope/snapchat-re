package defpackage;

import defpackage.acm.a;
import java.util.Collections;
import java.util.Map;

/* renamed from: ack */
public interface ack {
    public static final ack a;

    /* renamed from: ack$1 */
    class 1 implements ack {
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
        a = new acm(aVar.b);
    }

    Map<String, String> a();
}
