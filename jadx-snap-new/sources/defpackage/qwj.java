package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: qwj */
public final class qwj {
    public final Map<Long, qwl> a;
    public final Set<String> b;
    public final Map<Long, Boolean> c;
    public final Long d;
    public final Long e;
    public final rgc f;
    private final Map<Long, rge> g;
    private final Set<Long> h;
    private final Set<Long> i;
    private final Map<Long, Set<Long>> j;

    public qwj(Map<Long, rge> map, Map<Long, qwl> map2, Set<Long> set, Set<Long> set2, Set<String> set3, Map<Long, ? extends Set<Long>> map3, Map<Long, Boolean> map4, Long l, Long l2, rgc rgc) {
        akcr.b(map, "feedReplayableSnaps");
        akcr.b(map2, "feedSnapStatuses");
        akcr.b(set, "feedsWithViewedSnaps");
        akcr.b(set2, "feedsWithViewedSnapsLastSession");
        akcr.b(set3, "feedViewedSnapIds");
        akcr.b(map3, "feedIdToSnapRowIds");
        akcr.b(map4, "sessionPlayedStoryIds");
        this.g = map;
        this.a = map2;
        this.h = set;
        this.i = set2;
        this.b = set3;
        this.j = map3;
        this.c = map4;
        this.d = l;
        this.e = l2;
        this.f = rgc;
    }

    public final iin a(long j) {
        rge rge = (rge) this.g.get(Long.valueOf(j));
        return rge != null ? rge.a : null;
    }

    /* JADX WARNING: Missing block: B:22:0x006a, code skipped:
            if (defpackage.akcr.a(r2.f, r3.f) != false) goto L_0x006f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x006f;
    L_0x0002:
        r0 = r3 instanceof defpackage.qwj;
        if (r0 == 0) goto L_0x006d;
    L_0x0006:
        r3 = (defpackage.qwj) r3;
        r0 = r2.g;
        r1 = r3.g;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0012:
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x001c:
        r0 = r2.h;
        r1 = r3.h;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0026:
        r0 = r2.i;
        r1 = r3.i;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0030:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x003a:
        r0 = r2.j;
        r1 = r3.j;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0044:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x004e:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0058:
        r0 = r2.e;
        r1 = r3.e;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0062:
        r0 = r2.f;
        r3 = r3.f;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x006d;
    L_0x006c:
        goto L_0x006f;
    L_0x006d:
        r3 = 0;
        return r3;
    L_0x006f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwj.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Map map = this.g;
        int i = 0;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        Map map2 = this.a;
        hashCode = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Set set = this.h;
        hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        set = this.i;
        hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        set = this.b;
        hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        map2 = this.j;
        hashCode = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        map2 = this.c;
        hashCode = (hashCode + (map2 != null ? map2.hashCode() : 0)) * 31;
        Long l = this.d;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        rgc rgc = this.f;
        if (rgc != null) {
            i = rgc.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FeedViewingSessionState(feedReplayableSnaps=");
        stringBuilder.append(this.g);
        stringBuilder.append(", feedSnapStatuses=");
        stringBuilder.append(this.a);
        stringBuilder.append(", feedsWithViewedSnaps=");
        stringBuilder.append(this.h);
        stringBuilder.append(", feedsWithViewedSnapsLastSession=");
        stringBuilder.append(this.i);
        stringBuilder.append(", feedViewedSnapIds=");
        stringBuilder.append(this.b);
        stringBuilder.append(", feedIdToSnapRowIds=");
        stringBuilder.append(this.j);
        stringBuilder.append(", sessionPlayedStoryIds=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lastFeedWithPlayedSnap=");
        stringBuilder.append(this.d);
        stringBuilder.append(", lastFeedWithPlayedStory=");
        stringBuilder.append(this.e);
        stringBuilder.append(", latestPlayingSnapInfo=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
