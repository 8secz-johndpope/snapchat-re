package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import defpackage.szw.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: spz */
public final class spz {
    public final LinkedHashSet<b<?>> a;
    public final snu b;
    public final boolean c;
    public final Predicate<sqh> d;
    private final Map<b, b> e;
    private final boolean f;
    private final int g;
    private final int h;

    /* renamed from: spz$a */
    public static class a {
        final snu a;
        final LinkedHashSet<b<?>> b = new LinkedHashSet();
        final Map<b, b> c = new HashMap();
        public boolean d = false;
        public boolean e = false;
        public int f = 5;
        int g = 0;
        public Predicate<sqh> h = Predicates.alwaysTrue();

        public a(snu snu) {
            this.a = snu;
        }

        public final a a() {
            this.e = true;
            return this;
        }

        public final a a(int i) {
            this.g = i;
            this.f = 0;
            return this;
        }

        public final a a(Predicate<sqh> predicate) {
            this.h = predicate;
            return this;
        }

        public final a a(b<?> bVar) {
            this.b.add(bVar);
            return this;
        }

        public final <T> a a(b<T> bVar, b<T> bVar2) {
            this.b.add(bVar);
            this.c.put(bVar, bVar2);
            return this;
        }

        public final a b() {
            this.d = true;
            return this;
        }

        public final <T, U> a b(b<T> bVar, b<T> bVar2) {
            this.c.put(bVar, bVar2);
            return this;
        }

        public final spz c() {
            if (!this.e && this.b.size() <= 0) {
                throw new IllegalArgumentException("Can't build layer without at least one required param!");
            } else if (this.g <= 0 || this.f <= 0) {
                return new spz(this, (byte) 0);
            } else {
                throw new IllegalArgumentException("Can't build layer with two types of pre-initializations");
            }
        }
    }

    private spz(a aVar) {
        this.a = aVar.b;
        this.b = aVar.a;
        this.e = aVar.c;
        this.c = aVar.d;
        this.f = aVar.e;
        this.d = aVar.h;
        this.g = aVar.f;
        this.h = aVar.g;
    }

    /* synthetic */ spz(a aVar, byte b) {
        this(aVar);
    }

    public final String a() {
        return this.b.b();
    }

    public final boolean a(szw szw) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (szw.c(bVar)) {
                if (szw.a(bVar) == null) {
                }
            }
            return false;
        }
        return true;
    }

    public final int b() {
        return this.g;
    }

    public final szw b(szw szw) {
        szw szw2 = new szw(szw);
        for (Entry entry : this.e.entrySet()) {
            szw2.b((b) entry.getValue(), szw.a((b) entry.getKey()));
        }
        return szw2;
    }

    public final Class<? extends slm> c() {
        return this.b.a();
    }

    public final snu d() {
        return this.b;
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("type", this.b.b()).toString();
    }
}
