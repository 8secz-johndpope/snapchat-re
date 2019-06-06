package defpackage;

import com.google.common.collect.Iterables;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: ryz */
public class ryz extends sbm {
    @Deprecated
    private static final rzg e = new rzg(null);
    public final c a;
    public final TreeSet<rzg> b;
    public final Set<b> c;

    /* renamed from: ryz$c */
    public enum c {
        METADATA,
        SMALL_MEDIA,
        LARGE_MEDIA,
        UPLOAD,
        STREAMING
    }

    /* renamed from: ryz$a */
    public static class a extends defpackage.sbm.a<Object> {
        protected c a;
        protected final Set<rzg> b;
        protected final Set<b> c;

        public a(String str, sac sac, c cVar, Set<rzg> set) {
            super(str, sac);
            this.a = cVar;
            this.b = new HashSet(set);
            this.c = new HashSet();
        }

        public a(ryz ryz) {
            super(ryz);
            this.a = ryz.a;
            this.b = new HashSet(ryz.b);
            this.c = new HashSet(ryz.c);
        }

        public final a a() {
            super.a(false);
            return this;
        }

        public final a a(Object obj) {
            super.b(obj);
            return this;
        }

        /* renamed from: a */
        public final <V> a b(String str, V v) {
            super.b(str, v);
            return this;
        }

        public final a a(Map<String, String> map) {
            super.d(map);
            return this;
        }

        public final a a(rzg rzg) {
            this.b.add(rzg);
            return this;
        }

        public final a b() {
            this.b.clear();
            return this;
        }

        public final a b(Map<String, ?> map) {
            super.c(map);
            return this;
        }

        /* renamed from: c */
        public ryz e() {
            return new ryz(this.d, this.e, this.f, this.h, this.g, this.a, this.b, this.c, this.i);
        }

        public final /* bridge */ /* synthetic */ defpackage.sak.a c(Map map) {
            super.c(map);
            return this;
        }

        public final /* bridge */ /* synthetic */ defpackage.sak.a d(Map map) {
            super.d(map);
            return this;
        }
    }

    /* renamed from: ryz$b */
    public interface b {
        boolean a();

        Throwable b();
    }

    protected ryz(String str, sac sac, Map<String, String> map, Object obj, Map<String, ?> map2, c cVar, Set<rzg> set, Set<b> set2, boolean z) {
        super(str, sac, map, obj, map2, z);
        this.a = cVar;
        Set<rzg> set3 = set;
        this.b = new TreeSet(set);
        this.c = new HashSet(set2);
    }

    /* renamed from: a */
    public a h() {
        return new a(this);
    }

    public final c b() {
        return this.a;
    }

    public final Set<rzg> c() {
        return this.b;
    }

    public final Set<b> d() {
        return this.c;
    }

    public final rzg e() {
        return this.b.isEmpty() ? e : (rzg) this.b.first();
    }

    public final boolean f() {
        return Iterables.all(this.c, -$$Lambda$ryz$8e_umjwPmwVY-KPqRX6-iCKaHLw.INSTANCE);
    }
}
