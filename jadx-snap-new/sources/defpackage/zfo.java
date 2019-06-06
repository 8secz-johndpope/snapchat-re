package defpackage;

import com.google.common.collect.ConcurrentHashMultiset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zfo */
public final class zfo implements zfq {
    private final ConcurrentHashMap<zfm, ajxm<AtomicLong, AtomicLong>> a = new ConcurrentHashMap();
    private final ConcurrentHashMultiset<ajxm<zfm, Long>> b;
    private final zgg c;

    public zfo(zgg zgg) {
        akcr.b(zgg, "clock");
        this.c = zgg;
        Object create = ConcurrentHashMultiset.create();
        akcr.a(create, "ConcurrentHashMultiset.create()");
        this.b = create;
    }

    private final Map<zfm, Long> c() {
        HashMap hashMap = new HashMap(this.a.size());
        for (Entry entry : this.a.entrySet()) {
            hashMap.put((zfm) entry.getKey(), Long.valueOf(((AtomicLong) ((ajxm) entry.getValue()).a).get()));
        }
        return hashMap;
    }

    private final Map<zfm, Long> d() {
        HashMap hashMap = new HashMap(this.a.size());
        for (Entry entry : this.a.entrySet()) {
            hashMap.put((zfm) entry.getKey(), Long.valueOf(((AtomicLong) ((ajxm) entry.getValue()).b).get()));
        }
        long a = this.c.a();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ajxm ajxm = (ajxm) it.next();
            zfm zfm = (zfm) ajxm.a;
            long longValue = ((Number) ajxm.b).longValue();
            Long l = (Long) hashMap.get(zfm);
            if (l == null) {
                l = Long.valueOf(0);
            }
            hashMap.put(zfm, Long.valueOf(l.longValue() + (a - longValue)));
        }
        return hashMap;
    }

    public final zfn a() {
        return new zfn(this.c.a(), c());
    }

    public final void a(String str, String str2, String str3) {
        akcr.b(str, "project");
        akcr.b(str2, "feature");
        akcr.b(str3, "callsite");
    }

    public final void a(String str, String str2, String str3, long j) {
        akcr.b(str, "project");
        akcr.b(str2, "feature");
        akcr.b(str3, "callsite");
        this.b.add(ajxs.a(new zfm(str, str2, str3), Long.valueOf(j)));
    }

    public final void a(String str, String str2, String str3, long j, long j2, long j3) {
        akcr.b(str, "project");
        akcr.b(str2, "feature");
        akcr.b(str3, "callsite");
        ConcurrentMap concurrentMap = this.a;
        ajxm a = ajxs.a(new AtomicLong(), new AtomicLong());
        ajxm ajxm = (ajxm) concurrentMap.putIfAbsent(new zfm(str, str2, str3), a);
        if (ajxm == null) {
            ajxm = a;
        }
        ((AtomicLong) ajxm.a).getAndAdd(j);
        ((AtomicLong) ajxm.b).getAndAdd(j2);
        this.b.remove(ajxs.a(new zfm(str, str2, str3), Long.valueOf(j3)));
    }

    public final zfz b() {
        return new zfz(d());
    }
}
