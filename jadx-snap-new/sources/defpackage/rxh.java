package defpackage;

import defpackage.rzu.a;
import java.util.Set;
import java.util.UUID;

/* renamed from: rxh */
public final class rxh implements rwz, a {
    private final aipn<Set<rwz.a>> a;

    public rxh(aipn<Set<rwz.a>> aipn) {
        this.a = aipn;
    }

    private void a(rwy rwy) {
        for (rwz.a a : (Set) this.a.get()) {
            a.a(rwy);
        }
    }

    public final void a(UUID uuid, long j, long j2, long j3, long j4) {
        a(new rwy(uuid, j3, j2 == 0, false));
    }

    public final void a(UUID uuid, long j, boolean z) {
        a(uuid, 0, 0, j, 0);
    }

    public final void a(UUID uuid, Throwable th, san san) {
        a(new rwy(uuid, 0, false, true));
    }
}
