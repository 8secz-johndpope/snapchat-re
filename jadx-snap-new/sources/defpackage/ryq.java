package defpackage;

import defpackage.rzf.a;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: ryq */
public final class ryq implements ryo {
    private final Map<a, Set<rzf<ryz>>> a = new EnumMap(a.class);

    public ryq(Comparator<rzf<ryz>> comparator) {
        for (Object put : a.values()) {
            this.a.put(put, new TreeSet(comparator).descendingSet());
        }
    }

    private /* synthetic */ boolean c(rzf rzf) {
        return true;
    }

    public final Map<a, List<rzf<ryz>>> a() {
        EnumMap enumMap = new EnumMap(a.class);
        rza.a(this.a, enumMap, new -$$Lambda$ryq$MloCy4WzHchj4DzMNlQkOcO8PLM(this));
        return enumMap;
    }

    public final void a(rzf<ryz> rzf) {
        ((Set) this.a.get(rzf.d())).add(rzf);
    }

    public final boolean b(rzf<ryz> rzf) {
        return ((Set) this.a.get(rzf.d())).remove(rzf);
    }
}
