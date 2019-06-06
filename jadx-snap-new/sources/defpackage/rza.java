package defpackage;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: rza */
public final class rza {
    public static <T, F> void a(Map<T, Set<F>> map, Map<T, List<F>> map2, Predicate<? super F> predicate) {
        for (Entry entry : map.entrySet()) {
            map2.put(entry.getKey(), Collections.unmodifiableList(new ArrayList(Collections2.filter((Collection) entry.getValue(), predicate))));
        }
    }
}
