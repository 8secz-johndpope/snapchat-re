package defpackage;

import com.brightcove.player.event.Event;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: ajyc */
public abstract class ajyc<E> extends ajxz<E> implements akdh, List<E> {

    /* renamed from: ajyc$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static void a(int i, int i2) {
            if (i < 0 || i >= i2) {
                StringBuilder stringBuilder = new StringBuilder("index: ");
                stringBuilder.append(i);
                stringBuilder.append(", size: ");
                stringBuilder.append(i2);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
        }

        public static void a(int i, int i2, int i3) {
            String str = "fromIndex: ";
            if (i < 0 || i2 > i3) {
                StringBuilder stringBuilder = new StringBuilder(str);
                stringBuilder.append(i);
                stringBuilder.append(", toIndex: ");
                stringBuilder.append(i2);
                stringBuilder.append(", size: ");
                stringBuilder.append(i3);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            } else if (i > i2) {
                StringBuilder stringBuilder2 = new StringBuilder(str);
                stringBuilder2.append(i);
                stringBuilder2.append(" > toIndex: ");
                stringBuilder2.append(i2);
                throw new IllegalArgumentException(stringBuilder2.toString());
            }
        }
    }

    /* renamed from: ajyc$b */
    class b implements akdh, Iterator<E> {
        int a;

        public boolean hasNext() {
            return this.a < ajyc.this.size();
        }

        public E next() {
            if (hasNext()) {
                ajyc ajyc = ajyc.this;
                int i = this.a;
                this.a = i + 1;
                return ajyc.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ajyc$c */
    class c extends b implements akdh, ListIterator<E> {
        public c(int i) {
            super();
            int size = ajyc.this.size();
            if (i < 0 || i > size) {
                StringBuilder stringBuilder = new StringBuilder("index: ");
                stringBuilder.append(i);
                stringBuilder.append(", size: ");
                stringBuilder.append(size);
                throw new IndexOutOfBoundsException(stringBuilder.toString());
            }
            this.a = i;
        }

        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            return this.a > 0;
        }

        public final int nextIndex() {
            return this.a;
        }

        public final E previous() {
            if (hasPrevious()) {
                ajyc ajyc = ajyc.this;
                this.a--;
                return ajyc.get(this.a);
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.a - 1;
        }

        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: ajyc$d */
    static final class d<E> extends ajyc<E> implements RandomAccess {
        private int a;
        private final ajyc<E> b;
        private final int c;

        public d(ajyc<? extends E> ajyc, int i, int i2) {
            akcr.b(ajyc, Event.LIST);
            this.b = ajyc;
            this.c = i;
            a.a(this.c, i2, this.b.size());
            this.a = i2 - this.c;
        }

        public final int a() {
            return this.a;
        }

        public final E get(int i) {
            a.a(i, this.a);
            return this.b.get(this.c + i);
        }
    }

    static {
        a aVar = new a();
    }

    protected ajyc() {
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection<Object> collection = this;
        Collection collection2 = (Collection) obj;
        akcr.b(collection, "c");
        akcr.b(collection2, "other");
        if (collection.size() != collection2.size()) {
            return false;
        }
        Iterator it = collection2.iterator();
        for (Object a : collection) {
            if ((akcr.a(a, it.next()) ^ 1) != 0) {
                return false;
            }
        }
        return true;
    }

    public abstract E get(int i);

    public int hashCode() {
        Collection collection = this;
        akcr.b(collection, "c");
        int i = 1;
        for (Object next : collection) {
            i = (i * 31) + (next != null ? next.hashCode() : 0);
        }
        return i;
    }

    public int indexOf(Object obj) {
        int i = 0;
        for (Object a : this) {
            if (akcr.a(a, obj)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Iterator<E> iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (akcr.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public ListIterator<E> listIterator() {
        return new c(0);
    }

    public ListIterator<E> listIterator(int i) {
        return new c(i);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return new d(this, i, i2);
    }
}
