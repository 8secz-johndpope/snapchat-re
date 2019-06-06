package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: ajyt */
public class ajyt extends ajys {
    public static final <C extends Collection<? super R>, R> C a(Iterable<?> iterable, C c, Class<R> cls) {
        akcr.b(iterable, "receiver$0");
        akcr.b(c, "destination");
        akcr.b(cls, "klass");
        for (Object next : iterable) {
            if (cls.isInstance(next)) {
                c.add(next);
            }
        }
        return c;
    }

    public static final <R> List<R> a(Iterable<?> iterable, Class<R> cls) {
        akcr.b(iterable, "receiver$0");
        akcr.b(cls, "klass");
        return (List) ajyt.a(iterable, new ArrayList(), cls);
    }

    public static final <T> void e(List<T> list) {
        akcr.b(list, "receiver$0");
        Collections.reverse(list);
    }
}
