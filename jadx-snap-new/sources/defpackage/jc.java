package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: jc */
public abstract class jc<K, V> {
    b a;
    e b;
    private c c;

    /* renamed from: jc$e */
    final class e implements Collection<V> {
        e() {
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            jc.this.c();
        }

        public final boolean contains(Object obj) {
            return jc.this.b(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return jc.this.a() == 0;
        }

        public final Iterator<V> iterator() {
            return new a(1);
        }

        public final boolean remove(Object obj) {
            int b = jc.this.b(obj);
            if (b < 0) {
                return false;
            }
            jc.this.a(b);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int a = jc.this.a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (collection.contains(jc.this.a(i, 1))) {
                    jc.this.a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int a = jc.this.a();
            int i = 0;
            boolean z = false;
            while (i < a) {
                if (!collection.contains(jc.this.a(i, 1))) {
                    jc.this.a(i);
                    i--;
                    a--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return jc.this.a();
        }

        public final Object[] toArray() {
            return jc.this.b(1);
        }

        public final <T> T[] toArray(T[] tArr) {
            return jc.this.a((Object[]) tArr, 1);
        }
    }

    /* renamed from: jc$c */
    final class c implements Set<K> {
        c() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            jc.this.c();
        }

        public final boolean contains(Object obj) {
            return jc.this.a(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map b = jc.this.b();
            for (Object containsKey : collection) {
                if (!b.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return jc.a((Set) this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int a = jc.this.a() - 1; a >= 0; a--) {
                Object a2 = jc.this.a(a, 0);
                i += a2 == null ? 0 : a2.hashCode();
            }
            return i;
        }

        public final boolean isEmpty() {
            return jc.this.a() == 0;
        }

        public final Iterator<K> iterator() {
            return new a(0);
        }

        public final boolean remove(Object obj) {
            int a = jc.this.a(obj);
            if (a < 0) {
                return false;
            }
            jc.this.a(a);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map b = jc.this.b();
            int size = b.size();
            for (Object remove : collection) {
                b.remove(remove);
            }
            return size != b.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return jc.a(jc.this.b(), (Collection) collection);
        }

        public final int size() {
            return jc.this.a();
        }

        public final Object[] toArray() {
            return jc.this.b(0);
        }

        public final <T> T[] toArray(T[] tArr) {
            return jc.this.a((Object[]) tArr, 0);
        }
    }

    /* renamed from: jc$a */
    final class a<T> implements Iterator<T> {
        private int a;
        private int b;
        private int c;
        private boolean d = false;

        a(int i) {
            this.a = i;
            this.b = jc.this.a();
        }

        public final boolean hasNext() {
            return this.c < this.b;
        }

        public final T next() {
            if (hasNext()) {
                Object a = jc.this.a(this.c, this.a);
                this.c++;
                this.d = true;
                return a;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.d) {
                this.c--;
                this.b--;
                this.d = false;
                jc.this.a(this.c);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: jc$d */
    final class d implements Iterator<Entry<K, V>>, Entry<K, V> {
        private int a;
        private int b;
        private boolean c = false;

        d() {
            this.a = jc.this.a() - 1;
            this.b = -1;
        }

        public final boolean equals(Object obj) {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Entry)) {
                return false;
            } else {
                Entry entry = (Entry) obj;
                return ix.a(entry.getKey(), jc.this.a(this.b, 0)) && ix.a(entry.getValue(), jc.this.a(this.b, 1));
            }
        }

        public final K getKey() {
            if (this.c) {
                return jc.this.a(this.b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.c) {
                return jc.this.a(this.b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.b < this.a;
        }

        public final int hashCode() {
            if (this.c) {
                int i = 0;
                Object a = jc.this.a(this.b, 0);
                Object a2 = jc.this.a(this.b, 1);
                int hashCode = a == null ? 0 : a.hashCode();
                if (a2 != null) {
                    i = a2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final /* synthetic */ Object next() {
            if (hasNext()) {
                this.b++;
                this.c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.c) {
                jc.this.a(this.b);
                this.b--;
                this.a--;
                this.c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v) {
            if (this.c) {
                return jc.this.a(this.b, (Object) v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getKey());
            stringBuilder.append("=");
            stringBuilder.append(getValue());
            return stringBuilder.toString();
        }
    }

    /* renamed from: jc$b */
    final class b implements Set<Entry<K, V>> {
        b() {
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Entry<K, V>> collection) {
            int a = jc.this.a();
            for (Entry entry : collection) {
                jc.this.a(entry.getKey(), entry.getValue());
            }
            return a != jc.this.a();
        }

        public final void clear() {
            jc.this.c();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            int a = jc.this.a(entry.getKey());
            return a < 0 ? false : ix.a(jc.this.a(a, 1), entry.getValue());
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return jc.a((Set) this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int a = jc.this.a() - 1; a >= 0; a--) {
                Object a2 = jc.this.a(a, 0);
                Object a3 = jc.this.a(a, 1);
                i += (a2 == null ? 0 : a2.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public final boolean isEmpty() {
            return jc.this.a() == 0;
        }

        public final Iterator<Entry<K, V>> iterator() {
            return new d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return jc.this.a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    jc() {
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
    }

    public abstract int a();

    public abstract int a(Object obj);

    public abstract Object a(int i, int i2);

    public abstract V a(int i, V v);

    public abstract void a(int i);

    public abstract void a(K k, V v);

    public final <T> T[] a(T[] tArr, int i) {
        int a = a();
        if (tArr.length < a) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a);
        }
        for (int i2 = 0; i2 < a; i2++) {
            tArr[i2] = a(i2, i);
        }
        if (tArr.length > a) {
            tArr[a] = null;
        }
        return tArr;
    }

    public abstract int b(Object obj);

    public abstract Map<K, V> b();

    public final Object[] b(int i) {
        int a = a();
        Object[] objArr = new Object[a];
        for (int i2 = 0; i2 < a; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public abstract void c();

    public final Set<K> d() {
        if (this.c == null) {
            this.c = new c();
        }
        return this.c;
    }
}
