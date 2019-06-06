package defpackage;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Lists;
import java.util.Iterator;

/* renamed from: ajbn */
public abstract class ajbn {
    public abstract Iterator<ajbm> a();

    public boolean equals(Object obj) {
        if (!(obj instanceof ajbn)) {
            return false;
        }
        ajbn ajbn = (ajbn) obj;
        Iterator a = a();
        Iterator a2 = ajbn.a();
        return (a == null ? ImmutableMultiset.of() : HashMultiset.create(Lists.newArrayList(a))).equals(a2 == null ? ImmutableMultiset.of() : HashMultiset.create(Lists.newArrayList(a2)));
    }

    public final int hashCode() {
        Iterator a = a();
        int i = 0;
        if (a == null) {
            return 0;
        }
        while (a.hasNext()) {
            ajbm ajbm = (ajbm) a.next();
            if (ajbm != null) {
                i += ajbm.hashCode();
            }
        }
        return i;
    }

    public String toString() {
        return "TagContext";
    }
}
