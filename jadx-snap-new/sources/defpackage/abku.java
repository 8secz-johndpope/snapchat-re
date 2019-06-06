package defpackage;

import com.google.common.base.Supplier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: abku */
public final class abku {
    public static aipn<abku> b;
    public final abkv a;
    private final ConcurrentHashMap<String, Map<String, String>> c = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, Map<String, Long>> d = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, Map<String, Boolean>> e = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, Map<String, Integer>> f = new ConcurrentHashMap();
    private final ConcurrentHashMap<String, Map<String, Float>> g = new ConcurrentHashMap();
    private final hxf h;
    private final Set<String> i;
    private final abpt<Object> j = new abpt();
    private volatile boolean k = false;

    /* renamed from: abku$1 */
    static class 1 implements Supplier<abku> {
        1() {
        }

        public final /* bridge */ /* synthetic */ Object get() {
            return (abku) abku.b.get();
        }
    }

    static {
        1 1 = new 1();
    }

    public abku(abkv abkv, Set<String> set) {
        this.a = abkv;
        this.h = null;
        this.i = set;
        b();
    }

    public static abku a() {
        return (abku) b.get();
    }

    private void a(Map<String, Map<String, String>> map) {
        HashMap hashMap = new HashMap(this.c);
        this.c.clear();
        this.c.putAll(map);
        this.g.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void b() {
        if (!this.k) {
            synchronized (this) {
                if (this.k) {
                    return;
                }
                Map a = this.a.a();
                if (a != null) {
                    a(a);
                }
                this.k = true;
            }
        }
    }

    public final String a(String str, String str2) {
        b();
        Map map = (Map) this.c.get(str);
        if (map != null) {
            str = (String) map.get(str2);
            if (str != null) {
                return str;
            }
        }
        return null;
    }
}
