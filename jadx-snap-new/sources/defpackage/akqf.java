package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: akqf */
public final class akqf extends akpn {
    private final List<String> a;
    private final int b;
    private final String c;
    private final boolean d;
    private final String e;
    private final String f;
    private final AtomicLong g;
    private final a h;

    /* renamed from: akqf$a */
    public static final class a extends defpackage.akpn.a {
        final List<Entry<String, String>> a;
        private Map<String, List<String>> b;

        public a(List<Entry<String, String>> list) {
            this.a = list;
        }

        public final Map<String, List<String>> a() {
            Map map = this.b;
            if (map != null) {
                return map;
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (Entry entry : this.a) {
                ArrayList arrayList = new ArrayList();
                if (treeMap.containsKey(entry.getKey())) {
                    arrayList.addAll((Collection) treeMap.get(entry.getKey()));
                }
                arrayList.add((String) entry.getValue());
                treeMap.put((String) entry.getKey(), Collections.unmodifiableList(arrayList));
            }
            this.b = Collections.unmodifiableMap(treeMap);
            return this.b;
        }
    }

    public akqf(List<String> list, int i, String str, List<Entry<String, String>> list2, boolean z, String str2, String str3, long j) {
        this.a = Collections.unmodifiableList(list);
        this.b = i;
        this.c = str;
        this.h = new a(Collections.unmodifiableList(list2));
        this.d = z;
        this.e = str2;
        this.f = str3;
        this.g = new AtomicLong(j);
    }

    public final int a() {
        return this.b;
    }

    public final void a(long j) {
        this.g.set(j);
    }

    public final String b() {
        return this.c;
    }

    public final Map<String, List<String>> c() {
        return this.h.a();
    }

    public final String d() {
        return this.e;
    }

    public final long e() {
        return this.g.get();
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        r1 = new Object[10];
        List list = this.a;
        r1[1] = (String) list.get(list.size() - 1);
        r1[2] = this.a.toString();
        r1[3] = Integer.valueOf(this.b);
        r1[4] = this.c;
        r1[5] = this.h.a.toString();
        r1[6] = Boolean.valueOf(this.d);
        r1[7] = this.e;
        r1[8] = this.f;
        r1[9] = Long.valueOf(this.g.get());
        return String.format(locale, "UrlResponseInfo@[%s][%s]: urlChain = %s, httpStatus = %d %s, headers = %s, wasCached = %b, negotiatedProtocol = %s, proxyServer= %s, receivedByteCount = %d", r1);
    }
}
