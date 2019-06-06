package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: hps */
public final class hps implements AllUpdatesProcessor, hpr {
    final ajwl<Map<String, Map<String, String>>> a;
    private final zfw b = zgb.a(hbn.f, "RankingABStudyManagerImpl");
    private final ajwy<ftl> c;
    private final zgb d;

    /* renamed from: hps$a */
    static final class a implements Runnable {
        private /* synthetic */ hps a;
        private /* synthetic */ aecy b;

        a(hps hps, aecy aecy) {
            this.a = hps;
            this.b = aecy;
        }

        public final void run() {
            afeq afeq = this.b.c;
            Map map = null;
            if ((afeq != null ? afeq.cl : null) != null) {
                Object linkedHashMap = new LinkedHashMap();
                Set a = hps.a(this.a);
                afeq afeq2 = this.b.c;
                if (afeq2 != null) {
                    map = afeq2.cl;
                }
                if (map == null) {
                    akcr.a();
                }
                for (Entry entry : map.entrySet()) {
                    if (a.contains(entry.getKey())) {
                        Object key = entry.getKey();
                        akcr.a(key, "entry.key");
                        Object value = entry.getValue();
                        akcr.a(value, "entry.value");
                        linkedHashMap.put(key, value);
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    this.a.a.a(linkedHashMap);
                }
            }
        }
    }

    public hps(ajwy<ftl> ajwy, zgb zgb) {
        akcr.b(ajwy, "configurationProvider");
        akcr.b(zgb, "schedulersProvider");
        this.c = ajwy;
        this.d = zgb;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<M…leMap<String, String>>>()");
        this.a = ajwl;
    }

    public static final /* synthetic */ Set a(hps hps) {
        Object j = ((ftl) hps.c.get()).j(gvt.RANKING_SERVER_CONFIG_STUDIES);
        akcr.a(j, "configurationProvider\n  …NG_SERVER_CONFIG_STUDIES)");
        List a = new akfr(ppy.b).a((CharSequence) j, 0);
        if (!a.isEmpty()) {
            ListIterator listIterator = a.listIterator(a.size());
            while (listIterator.hasPrevious()) {
                Object obj;
                if (((String) listIterator.previous()).length() == 0) {
                    obj = 1;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
                if (obj == null) {
                    a = ajyu.c((Iterable) a, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        a = ajyw.a;
        return ajyu.m(a);
    }

    public final ajdx<Map<String, Map<String, String>>> a() {
        Object e = this.a.e();
        akcr.a(e, "whiteListedStudiesSubject.firstOrError()");
        return e;
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        akcr.b(aecy, "updates");
        akcr.b(snapDb, "database");
        akcr.b(dbTransaction, "tx");
        if (aecy.c.cl != null) {
            this.b.f().a((Runnable) new a(this, aecy));
        }
    }
}
