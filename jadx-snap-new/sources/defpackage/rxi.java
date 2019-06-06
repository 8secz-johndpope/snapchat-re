package defpackage;

import defpackage.rwz.a;
import defpackage.rzu.b;
import java.util.Set;
import java.util.UUID;

/* renamed from: rxi */
public final class rxi implements rwz, b {
    private final aipn<Set<a>> a;

    public rxi(aipn<Set<a>> aipn) {
        this.a = aipn;
    }

    private void a(rwy rwy) {
        for (a a : (Set) this.a.get()) {
            a.a(rwy);
        }
    }

    public final void a(UUID uuid) {
        a(new rwy(uuid, 0, false, true));
    }

    public final void a(UUID uuid, long j, long j2, long j3) {
        a(new rwy(uuid, j3, j2 == j, false));
    }
}
