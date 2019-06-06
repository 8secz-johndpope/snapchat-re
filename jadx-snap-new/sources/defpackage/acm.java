package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: acm */
public final class acm implements ack {
    private final Map<String, List<acl>> b;
    private volatile Map<String, String> c;

    /* renamed from: acm$a */
    public static final class a {
        private static final String c;
        private static final Map<String, List<acl>> d;
        boolean a = true;
        Map<String, List<acl>> b = d;
        private boolean e = true;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder stringBuilder = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt <= 31 && charAt != 9) || charAt >= 127) {
                        charAt = '?';
                    }
                    stringBuilder.append(charAt);
                }
                property = stringBuilder.toString();
            }
            c = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(c)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(c)));
            }
            d = Collections.unmodifiableMap(hashMap);
        }
    }

    /* renamed from: acm$b */
    static final class b implements acl {
        private final String a;

        b(String str) {
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            return this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("StringHeaderFactory{value='");
            stringBuilder.append(this.a);
            stringBuilder.append('\'');
            stringBuilder.append('}');
            return stringBuilder.toString();
        }
    }

    acm(Map<String, List<acl>> map) {
        this.b = Collections.unmodifiableMap(map);
    }

    private static String a(List<acl> list) {
        StringBuilder stringBuilder = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a = ((acl) list.get(i)).a();
            if (!TextUtils.isEmpty(a)) {
                stringBuilder.append(a);
                if (i != list.size() - 1) {
                    stringBuilder.append(',');
                }
            }
        }
        return stringBuilder.toString();
    }

    public final Map<String, String> a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    HashMap hashMap = new HashMap();
                    for (Entry entry : this.b.entrySet()) {
                        String a = acm.a((List) entry.getValue());
                        if (!TextUtils.isEmpty(a)) {
                            hashMap.put(entry.getKey(), a);
                        }
                    }
                    this.c = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof acm)) {
            return false;
        }
        return this.b.equals(((acm) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LazyHeaders{headers=");
        stringBuilder.append(this.b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
