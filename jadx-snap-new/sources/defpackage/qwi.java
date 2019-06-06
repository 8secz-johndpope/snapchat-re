package defpackage;

import android.os.Handler;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.snap.core.db.record.UnlockablesModel;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: qwi */
public final class qwi {
    public Long a;
    public rgc b;
    public Long c;
    public final Map<Long, Boolean> d = new ConcurrentHashMap();
    public final HashSet<String> e = new HashSet();
    public final Handler f = this.u.k();
    public boolean g;
    public final Runnable h = new a(this);
    public final Map<Long, rge> i = new ConcurrentHashMap();
    public final Map<Long, qwl> j = new ConcurrentHashMap();
    public final Set<Long> k = new LinkedHashSet();
    public final Set<Long> l = new LinkedHashSet();
    public final Set<String> m;
    public final Map<Long, Set<Long>> n;
    public final Map<Long, qwl> o;
    public final Map<Long, psf> p;
    public final Set<Long> q;
    public final ajwl<qwj> r;
    public final ajei s;
    private final idd t = pql.j.callsite("FeedViewingSessionManager");
    private final zfw u = zgb.a(this.t);

    /* renamed from: qwi$a */
    static final class a implements Runnable {
        private /* synthetic */ qwi a;

        a(qwi qwi) {
            this.a = qwi;
        }

        public final void run() {
            Long l = this.a.c;
            if (l != null) {
                long longValue = l.longValue();
                qwi qwi = this.a;
                qwl qwl = (qwl) qwi.j.get(Long.valueOf(longValue));
                if (qwl != null) {
                    qwl.a = false;
                }
                qwi.b();
            }
            this.a.g = false;
        }
    }

    public qwi(zgb zgb) {
        akcr.b(zgb, "schedulersProvider");
        Object newConcurrentHashSet = Sets.newConcurrentHashSet();
        akcr.a(newConcurrentHashSet, "Sets.newConcurrentHashSet()");
        this.m = newConcurrentHashSet;
        this.n = new ConcurrentHashMap();
        this.o = new ConcurrentHashMap();
        this.p = new LinkedHashMap();
        this.q = new LinkedHashSet();
        newConcurrentHashSet = ajwl.i(c());
        akcr.a(newConcurrentHashSet, "BehaviorSubject.createDe…eedViewingSessionState())");
        this.r = newConcurrentHashSet;
        this.s = new ajei();
    }

    private final qwj c() {
        Object copyOf = ImmutableMap.copyOf(this.i);
        akcr.a(copyOf, "ImmutableMap.copyOf(feedReplayableSnaps)");
        Map map = (Map) copyOf;
        copyOf = ImmutableMap.copyOf(this.j);
        akcr.a(copyOf, "ImmutableMap.copyOf(feedSnapStatuses)");
        Map map2 = (Map) copyOf;
        copyOf = ImmutableSet.copyOf((Collection) this.k);
        akcr.a(copyOf, "ImmutableSet.copyOf(feedsWithViewedSnaps)");
        Set set = (Set) copyOf;
        copyOf = ImmutableSet.copyOf((Collection) this.l);
        akcr.a(copyOf, "ImmutableSet.copyOf(feed…thViewedSnapsLastSession)");
        Set set2 = (Set) copyOf;
        copyOf = ImmutableSet.copyOf((Collection) this.m);
        akcr.a(copyOf, "ImmutableSet.copyOf(feedViewedSnapIds)");
        Set set3 = (Set) copyOf;
        copyOf = ImmutableMap.copyOf(this.n);
        akcr.a(copyOf, "ImmutableMap.copyOf(feedIdToSnapRowIds)");
        Map map3 = (Map) copyOf;
        copyOf = ImmutableMap.copyOf(this.d);
        akcr.a(copyOf, "ImmutableMap.copyOf(sessionPlayedStoryFeedIds)");
        Map map4 = (Map) copyOf;
        Long l = this.c;
        Long l2 = this.a;
        rgc rgc = this.b;
        return new qwj(map, map2, set, set2, set3, map3, map4, l, l2, rgc != null ? rgc.a(rgc.a, rgc.b) : null);
    }

    public final void a() {
        this.j.clear();
        this.o.clear();
        this.q.clear();
        b();
    }

    public final synchronized void a(long j, long j2) {
        Set set = (Set) this.n.get(Long.valueOf(j));
        if (set != null) {
            this.n.put(Long.valueOf(j), ajzu.b(set, (Object) Long.valueOf(j2)));
        } else {
            this.n.put(Long.valueOf(j), ajzs.a(Long.valueOf(j2)));
        }
        this.o.put(Long.valueOf(j2), new qwl(true, 27));
    }

    public final void a(long j, psf psf) {
        akcr.b(psf, UnlockablesModel.DATA);
        this.p.put(Long.valueOf(j), psf);
    }

    public final void a(long j, boolean z) {
        this.c = null;
        this.a = Long.valueOf(j);
        this.d.put(Long.valueOf(j), Boolean.valueOf(z));
        b();
    }

    public final boolean a(long j) {
        qwl qwl = (qwl) this.j.get(Long.valueOf(j));
        return qwl != null && qwl.d;
    }

    public final boolean a(String str) {
        akcr.b(str, "snapId");
        return this.m.contains(str);
    }

    public final void b() {
        this.r.a(c());
    }

    public final boolean b(long j) {
        qwl qwl = (qwl) this.j.get(Long.valueOf(j));
        return qwl != null && qwl.a;
    }

    public final boolean c(long j) {
        qwl qwl = (qwl) this.o.get(Long.valueOf(j));
        if (!(qwl == null || qwl.d)) {
            qwl qwl2 = (qwl) this.o.get(Long.valueOf(j));
            if (!(qwl2 == null || qwl2.c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(long j) {
        qwl qwl = (qwl) this.o.get(Long.valueOf(j));
        return qwl != null && qwl.d;
    }

    public final boolean e(long j) {
        qwl qwl = (qwl) this.o.get(Long.valueOf(j));
        return qwl != null && qwl.c;
    }
}
