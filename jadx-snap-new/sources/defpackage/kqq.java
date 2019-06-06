package defpackage;

import com.google.common.collect.Maps;
import java.util.Map;

/* renamed from: kqq */
public final class kqq implements kql {
    private final Map<String, Integer> a;
    private final akbl<String, Integer> b;
    private final akbw<String, Integer, ajxw> c;

    /* renamed from: kqq$1 */
    static final class 1 extends akcs implements akbl<String, Integer> {
        public static final 1 a = new 1();

        1() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((String) obj, "tag");
            return Integer.valueOf(zgo.a());
        }
    }

    /* renamed from: kqq$2 */
    static final class 2 extends akcs implements akbw<String, Integer, ajxw> {
        public static final 2 a = new 2();

        2() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            int intValue = ((Number) obj2).intValue();
            akcr.b(str, "tag");
            zgo.a(intValue);
            return ajxw.a;
        }
    }

    public /* synthetic */ kqq() {
        this(1.a, 2.a);
    }

    private kqq(akbl<? super String, Integer> akbl, akbw<? super String, ? super Integer, ajxw> akbw) {
        akcr.b(akbl, "asyncTraceBegin");
        akcr.b(akbw, "asyncTraceEnd");
        this.b = akbl;
        this.c = akbw;
        Object newConcurrentMap = Maps.newConcurrentMap();
        akcr.a(newConcurrentMap, "Maps.newConcurrentMap()");
        this.a = (Map) newConcurrentMap;
    }

    public final void a(String str) {
        akcr.b(str, "traceTag");
        this.a.put(str, this.b.invoke(str));
    }

    public final void b(String str) {
        akcr.b(str, "traceTag");
        Integer num = (Integer) this.a.remove(str);
        if (num != null) {
            this.c.invoke(str, Integer.valueOf(num.intValue()));
        }
    }
}
