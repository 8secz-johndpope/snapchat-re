package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableSet;
import defpackage.aivw.a;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* renamed from: aiyt */
final class aiyt {
    static final aiyt f = new aiyt(1, 0, 0, 1.0d, Collections.emptySet());
    final int a;
    final long b;
    final long c;
    final double d;
    final Set<a> e;

    /* renamed from: aiyt$a */
    interface a {
        aiyt a();
    }

    aiyt(int i, long j, long j2, double d, Set<a> set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = ImmutableSet.copyOf((Collection) set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aiyt)) {
            return false;
        }
        aiyt aiyt = (aiyt) obj;
        return this.a == aiyt.a && this.b == aiyt.b && this.c == aiyt.c && Double.compare(this.d, aiyt.d) == 0 && Objects.equal(this.e, aiyt.e);
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e);
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("maxAttempts", this.a).add("initialBackoffNanos", this.b).add("maxBackoffNanos", this.c).add("backoffMultiplier", this.d).add("retryableStatusCodes", this.e).toString();
    }
}
