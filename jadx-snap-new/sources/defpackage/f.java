package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: f */
public class f<K, V> implements Iterable<Entry<K, V>> {
    public c<K, V> b;
    public c<K, V> c;
    public WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap();
    public int e = 0;

    /* renamed from: f$c */
    public static class c<K, V> implements Entry<K, V> {
        final K a;
        final V b;
        c<K, V> c;
        public c<K, V> d;

        c(K k, V v) {
            this.a = k;
            this.b = v;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && this.b.equals(cVar.b);
        }

        public final K getKey() {
            return this.a;
        }

        public final V getValue() {
            return this.b;
        }

        public final V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("=");
            stringBuilder.append(this.b);
            return stringBuilder.toString();
        }
    }

    /* renamed from: f$d */
    public class d implements f<K, V>, Iterator<Entry<K, V>> {
        private c<K, V> a;
        private boolean b;

        private d() {
            this.b = true;
        }

        /* synthetic */ d(f fVar, byte b) {
            this();
        }

        public final void a_(c<K, V> cVar) {
            c<K, V> cVar2 = this.a;
            if (cVar == cVar2) {
                this.a = cVar2.d;
                this.b = this.a == null;
            }
        }

        public final boolean hasNext() {
            if (this.b) {
                return f.this.b != null;
            } else {
                c cVar = this.a;
                return (cVar == null || cVar.c == null) ? false : true;
            }
        }

        public final /* bridge */ /* synthetic */ Object next() {
            c cVar;
            if (this.b) {
                this.b = false;
                cVar = f.this.b;
            } else {
                cVar = this.a;
                cVar = cVar != null ? cVar.c : null;
            }
            this.a = cVar;
            return this.a;
        }
    }

    /* renamed from: f$f */
    interface f<K, V> {
        void a_(c<K, V> cVar);
    }

    /* renamed from: f$e */
    static abstract class e<K, V> implements f<K, V>, Iterator<Entry<K, V>> {
        private c<K, V> a;
        private c<K, V> b;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.a = cVar2;
            this.b = cVar;
        }

        private c<K, V> a() {
            c cVar = this.b;
            c cVar2 = this.a;
            return (cVar == cVar2 || cVar2 == null) ? null : a(cVar);
        }

        public abstract c<K, V> a(c<K, V> cVar);

        public final void a_(c<K, V> cVar) {
            if (this.a == cVar && cVar == this.b) {
                this.b = null;
                this.a = null;
            }
            c<K, V> cVar2 = this.a;
            if (cVar2 == cVar) {
                this.a = b(cVar2);
            }
            if (this.b == cVar) {
                this.b = a();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public boolean hasNext() {
            return this.b != null;
        }

        public /* synthetic */ Object next() {
            c cVar = this.b;
            this.b = a();
            return cVar;
        }
    }

    /* renamed from: f$b */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* Access modifiers changed, original: final */
        public final c<K, V> a(c<K, V> cVar) {
            return cVar.d;
        }

        /* Access modifiers changed, original: final */
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.c;
        }
    }

    /* renamed from: f$a */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* Access modifiers changed, original: final */
        public final c<K, V> a(c<K, V> cVar) {
            return cVar.c;
        }

        /* Access modifiers changed, original: final */
        public final c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* Access modifiers changed, original: protected */
    public c<K, V> a(K k) {
        c cVar = this.b;
        while (cVar != null && !cVar.a.equals(k)) {
            cVar = cVar.c;
        }
        return cVar;
    }

    public final d a() {
        d dVar = new d(this, (byte) 0);
        this.d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public V a(K k, V v) {
        c a = a(k);
        if (a != null) {
            return a.b;
        }
        b(k, v);
        return null;
    }

    /* Access modifiers changed, original: protected|final */
    public final c<K, V> b(K k, V v) {
        c cVar = new c(k, v);
        this.e++;
        c cVar2 = this.c;
        if (cVar2 == null) {
            this.b = cVar;
            this.c = this.b;
            return cVar;
        }
        cVar2.c = cVar;
        cVar.d = cVar2;
        this.c = cVar;
        return cVar;
    }

    public V b(K k) {
        c a = a(k);
        if (a == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            for (f a_ : this.d.keySet()) {
                a_.a_(a);
            }
        }
        if (a.d != null) {
            a.d.c = a.c;
        } else {
            this.b = a.c;
        }
        if (a.c != null) {
            a.c.d = a.d;
        } else {
            this.c = a.d;
        }
        a.c = null;
        a.d = null;
        return a.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.e != fVar.e) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = fVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Entry entry = (Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Iterator<Entry<K, V>> iterator() {
        a aVar = new a(this.b, this.c);
        this.d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            stringBuilder.append(((Entry) it.next()).toString());
            if (it.hasNext()) {
                stringBuilder.append(ppy.d);
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
