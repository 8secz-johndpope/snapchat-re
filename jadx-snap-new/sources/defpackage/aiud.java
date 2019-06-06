package defpackage;

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: aiud */
public final class aiud {
    public static final aiud b = new aiud(Collections.emptyMap());
    private static /* synthetic */ boolean c = (aiud.class.desiredAssertionStatus() ^ 1);
    public final Map<b<?>, Object> a;

    /* renamed from: aiud$b */
    public static final class b<T> {
        private final String a;

        private b(String str) {
            this.a = str;
        }

        public static <T> b<T> a(String str) {
            return new b(str);
        }

        public final String toString() {
            return this.a;
        }
    }

    /* renamed from: aiud$a */
    public static final class a {
        private static /* synthetic */ boolean c = (aiud.class.desiredAssertionStatus() ^ 1);
        private aiud a;
        private Map<b<?>, Object> b;

        private a(aiud aiud) {
            if (c || aiud != null) {
                this.a = aiud;
                return;
            }
            throw new AssertionError();
        }

        /* synthetic */ a(aiud aiud, byte b) {
            this(aiud);
        }

        public final <T> a a(b<T> bVar, T t) {
            a(1).put(bVar, t);
            return this;
        }

        public final aiud a() {
            if (this.b != null) {
                for (Entry entry : this.a.a.entrySet()) {
                    if (!this.b.containsKey(entry.getKey())) {
                        this.b.put(entry.getKey(), entry.getValue());
                    }
                }
                this.a = new aiud(this.b, (byte) 0);
                this.b = null;
            }
            return this.a;
        }

        public final Map<b<?>, Object> a(int i) {
            if (this.b == null) {
                this.b = new IdentityHashMap(i);
            }
            return this.b;
        }
    }

    private aiud(Map<b<?>, Object> map) {
        if (c || map != null) {
            this.a = map;
            return;
        }
        throw new AssertionError();
    }

    /* synthetic */ aiud(Map map, byte b) {
        this(map);
    }

    public static a a() {
        return new a(b, (byte) 0);
    }

    public final <T> T a(b<T> bVar) {
        return this.a.get(bVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aiud aiud = (aiud) obj;
        if (this.a.size() != aiud.a.size()) {
            return false;
        }
        for (Entry entry : this.a.entrySet()) {
            if (!aiud.a.containsKey(entry.getKey())) {
                return false;
            }
            if (!Objects.equal(entry.getValue(), aiud.a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Entry entry : this.a.entrySet()) {
            i += Objects.hashCode(entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final String toString() {
        return this.a.toString();
    }
}
