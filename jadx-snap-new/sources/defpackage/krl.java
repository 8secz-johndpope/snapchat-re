package defpackage;

import defpackage.kqe.ak;
import defpackage.kqe.ak.a;
import defpackage.ksm.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: krl */
public final class krl implements krk {
    private volatile b a;
    private final ksr b;
    private final mhk c;

    /* renamed from: krl$b */
    public static final class b {
        Long a;
        final long b;
        kqj c;
        final ConcurrentHashMap<String, a> d;
        List<a> e;
        boolean f;

        public /* synthetic */ b(long j, kqj kqj) {
            this(j, kqj, new ConcurrentHashMap(), ajyw.a);
        }

        public b(long j, kqj kqj, ConcurrentHashMap<String, a> concurrentHashMap, List<a> list) {
            akcr.b(kqj, "analyticsSessionId");
            akcr.b(concurrentHashMap, "seenLensesHashMap");
            akcr.b(list, "availableLensIds");
            this.b = j;
            this.c = kqj;
            this.d = concurrentHashMap;
            this.e = list;
            this.f = false;
        }

        /* Access modifiers changed, original: final */
        public final void a(long j) {
            for (Entry value : this.d.entrySet()) {
                ((a) value.getValue()).a(j);
            }
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if ((this.b == bVar.b ? 1 : null) != null && akcr.a(this.c, bVar.c) && akcr.a(this.d, bVar.d) && akcr.a(this.e, bVar.e)) {
                        if ((this.f == bVar.f ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            long j = this.b;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            kqj kqj = this.c;
            int i2 = 0;
            i = (i + (kqj != null ? kqj.hashCode() : 0)) * 31;
            ConcurrentHashMap concurrentHashMap = this.d;
            i = (i + (concurrentHashMap != null ? concurrentHashMap.hashCode() : 0)) * 31;
            List list = this.e;
            if (list != null) {
                i2 = list.hashCode();
            }
            i = (i + i2) * 31;
            int i3 = this.f;
            if (i3 != 0) {
                i3 = 1;
            }
            return i + i3;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CarouselSession(startTimeMillis=");
            stringBuilder.append(this.b);
            stringBuilder.append(", analyticsSessionId=");
            stringBuilder.append(this.c);
            stringBuilder.append(", seenLensesHashMap=");
            stringBuilder.append(this.d);
            stringBuilder.append(", availableLensIds=");
            stringBuilder.append(this.e);
            stringBuilder.append(", stopped=");
            stringBuilder.append(this.f);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    /* renamed from: krl$a */
    public static final class a {
        long a;
        long b;
        long c;
        final String d;
        boolean e;

        private a(String str) {
            akcr.b(str, "id");
            this.d = str;
            this.e = false;
        }

        public /* synthetic */ a(String str, byte b) {
            this(str);
        }

        public final void a(long j) {
            long j2 = this.a;
            if (j2 != 0) {
                j -= j2;
                this.b += j;
                if (!this.e) {
                    this.c += j;
                }
                this.a = 0;
            }
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (akcr.a(this.d, aVar.d)) {
                        if ((this.e == aVar.e ? 1 : null) != null) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.d;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            int i = this.e;
            if (i != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("CarouselItem(id=");
            stringBuilder.append(this.d);
            stringBuilder.append(", loaded=");
            stringBuilder.append(this.e);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public krl(ksr ksr, mhk mhk) {
        akcr.b(ksr, "analyticsReporter");
        akcr.b(mhk, "clock");
        this.b = ksr;
        this.c = mhk;
    }

    public final void a() {
        b bVar = this.a;
        if (bVar != null && !bVar.f) {
            long a = krm.a(this.c);
            bVar.a(a);
            String a2 = bVar.c.a();
            long j = a - bVar.b;
            Iterable<a> iterable = bVar.e;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (a aVar : iterable) {
                arrayList.add(new ksm.a(aVar.a, aVar.b, aVar.c));
            }
            List list = (List) arrayList;
            Object entrySet = bVar.d.entrySet();
            akcr.a(entrySet, "seenLensesHashMap.entries");
            Iterable iterable2 = (Iterable) entrySet;
            Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a(iterable2, 10)), 16));
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                Object key = entry.getKey();
                a aVar2 = (a) entry.getValue();
                Iterator it2 = it;
                ajxm a3 = ajxs.a(key, new b(aVar2.d, aVar2.e, aVar2.b, aVar2.c));
                linkedHashMap.put(a3.a, a3.b);
                it = it2;
            }
            this.b.a(new ksm(a2, j, list, linkedHashMap, bVar.a));
            bVar.f = true;
        }
    }

    public final void a(List<ak.b> list, List<a> list2, kqj kqj) {
        String str = "visibleItems";
        akcr.b(list, str);
        String str2 = "availableItemsIds";
        akcr.b(list2, str2);
        akcr.b(kqj, "analyticsSessionId");
        b bVar = this.a;
        if (!(bVar == null || list.isEmpty() || list2.isEmpty())) {
            akcr.b(list2, str2);
            bVar.e = list2;
            long a = krm.a(this.c);
            akcr.b(list, str);
            bVar.a(a);
            for (ak.b bVar2 : list) {
                ConcurrentMap concurrentMap = bVar.d;
                str2 = bVar2.a;
                a aVar = concurrentMap.get(str2);
                if (aVar == null) {
                    aVar = new a(bVar2.a, (byte) 0);
                    a putIfAbsent = concurrentMap.putIfAbsent(str2, aVar);
                    if (putIfAbsent != null) {
                        aVar = putIfAbsent;
                    }
                }
                aVar = aVar;
                aVar.e = bVar2.b;
                aVar.a = a;
            }
            akcr.b(kqj, "<set-?>");
            bVar.c = kqj;
        }
    }

    public final void a(kqj kqj) {
        akcr.b(kqj, "analyticsSessionId");
        b bVar = this.a;
        if (bVar == null || (bVar.f && (akcr.a(kqj.a, bVar.c.a) ^ 1) != 0)) {
            bVar = new b(krm.a(this.c), kqj);
        }
        this.a = bVar;
    }

    public final void b(kqj kqj) {
        akcr.b(kqj, "analyticsSessionId");
        b bVar = this.a;
        if (bVar != null) {
            bVar.a = Long.valueOf(krm.a(this.c) - bVar.b);
        }
    }

    public final void c(kqj kqj) {
        akcr.b(kqj, "analyticsSessionId");
        this.a = new b(krm.a(this.c), kqj);
    }

    public final void d(kqj kqj) {
        String str = "analyticsSessionId";
        akcr.b(kqj, str);
        b bVar = this.a;
        if (bVar != null && bVar.f && akcr.a(kqj.a, bVar.c.a)) {
            long a = krm.a(this.c);
            ConcurrentHashMap concurrentHashMap = bVar.d;
            List list = bVar.e;
            akcr.b(kqj, str);
            akcr.b(concurrentHashMap, "seenLensesHashMap");
            akcr.b(list, "availableLensIds");
            this.a = new b(a, kqj, concurrentHashMap, list);
        }
    }
}
