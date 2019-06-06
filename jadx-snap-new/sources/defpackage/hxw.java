package defpackage;

import com.snap.core.db.AllUpdatesProcessor;
import com.snap.core.db.api.DbTransaction;
import com.snap.core.db.api.SnapDb;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: hxw */
public final class hxw implements AllUpdatesProcessor {
    private final hxs a;

    public hxw(hxs hxs) {
        akcr.b(hxs, "featureConfiguration");
        this.a = hxs;
    }

    public final void applyUpdates(aecy aecy, SnapDb snapDb, DbTransaction dbTransaction) {
        aecy aecy2 = aecy;
        DbTransaction dbTransaction2 = dbTransaction;
        String str = "featureSettingV2List";
        akcr.b(aecy2, "updates");
        akcr.b(snapDb, "database");
        String str2 = "tx";
        akcr.b(dbTransaction2, str2);
        afeq afeq = aecy2.c;
        if (afeq != null) {
            hxw thisR;
            List<aekm> list = afeq.bS;
            if (list != null) {
                ajcx a;
                hxs hxs = this.a;
                akcr.b(list, str);
                akcr.b(dbTransaction2, str2);
                akcr.b(list, str);
                akcr.b(dbTransaction2, str2);
                if (list.isEmpty()) {
                    a = ajvo.a(ajhn.a);
                    akcr.a((Object) a, "Completable.complete()");
                } else {
                    dbTransaction.checkInTransaction();
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    for (aekm aekm : list) {
                        Object a2 = hxs.b.a(aekm.a);
                        if (a2 != null) {
                            akcr.a(a2, "featureMap.mapToConfigKe….settingName) ?: continue");
                            Object a3 = a2.a();
                            akcr.a(a3, "key.delegate");
                            fti a4 = a3.a();
                            akcr.a((Object) a4, "key.delegate.type");
                            Comparable a5 = hxs.a(a4, aekm.b);
                            Object valueOf = aekm.c == null ? Long.valueOf(0) : aekm.c;
                            hxp a6 = hxs.a.a(a2);
                            String str3 = "serverVersion";
                            if (a6 != null) {
                                long j = a6.c;
                                akcr.a(valueOf, str3);
                                if (j > valueOf.longValue()) {
                                    hashMap2.put(a2, a6);
                                }
                            }
                            Map map = hashMap;
                            akcr.a(valueOf, str3);
                            map.put(a2, new hxp(a5, false, valueOf.longValue()));
                            aecy2 = aecy;
                        }
                    }
                    ajcx b = hxs.a((Map) hashMap).b((ajdb) hxs.a.a().a((fth) fxs.FEATURE_CONFIG_SYNCED_FEATURE_SETTINGS, Boolean.TRUE).c());
                    Map map2 = hashMap2;
                    akcr.a((Object) b, "dbSet");
                    a = hxs.a(map2, b);
                }
                a.e();
            }
            Map map3 = afeq.af;
            if (map3 != null) {
                thisR = this;
                thisR.a.a(map3, dbTransaction2);
            } else {
                thisR = this;
            }
            if (afeq.ae != null) {
                hxs hxs2 = thisR.a;
                List list2 = afeq.ae;
                akcr.a((Object) list2, "updateResponse.seenTooltips");
                hxs2.a(list2, dbTransaction2);
            } else if (aecy instanceof aert) {
                thisR.a.a.a().a((fth) fxs.FEATURE_CONFIG_SYNCED_TOOLTIPS, Boolean.TRUE).b();
            }
        }
    }
}
