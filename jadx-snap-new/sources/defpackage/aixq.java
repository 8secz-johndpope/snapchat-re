package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import defpackage.aivw.a;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: aixq */
final class aixq {
    static final aixq a = new aixq(1, 0, Collections.emptySet());
    private int b;
    private long c;
    private Set<a> d;

    /* renamed from: aixq$a */
    interface a {
    }

    aixq(int i, long j, Set<a> set) {
        this.b = i;
        this.c = j;
        this.d = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aixq aixq = (aixq) obj;
            return this.b == aixq.b && this.c == aixq.c && Objects.equal(this.d, aixq.d);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.b), Long.valueOf(this.c), this.d);
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("maxAttempts", this.b).add("hedgingDelayNanos", this.c).add("nonFatalStatusCodes", this.d).toString();
    }
}
