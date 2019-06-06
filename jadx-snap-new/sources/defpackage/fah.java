package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: fah */
public final class fah {
    final Map<String, Set<String>> a = new ConcurrentHashMap();

    public final Set<String> a(String str) {
        Set set;
        akcr.b(str, "notificationKey");
        synchronized (this) {
            set = (Set) this.a.get(str);
        }
        return set;
    }

    public final void a(String str, String str2) {
        akcr.b(str, "notificationKey");
        akcr.b(str2, "username");
        synchronized (this) {
            Set set = (Set) this.a.get(str);
            if (set == null) {
                set = new HashSet();
            }
            set.add(str2);
            this.a.put(str, set);
        }
    }
}
