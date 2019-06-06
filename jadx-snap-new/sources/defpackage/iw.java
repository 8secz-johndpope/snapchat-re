package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: iw */
public final class iw<E> implements Collection<E>, Set<E> {
    private static final int[] c = new int[0];
    private static final Object[] d = new Object[0];
    private static Object[] e;
    private static int f;
    private static Object[] g;
    private static int h;
    public Object[] a;
    int b;
    private int[] i;
    private jc<E, E> j;

    /* renamed from: iw$1 */
    class 1 extends jc<E, E> {
        1() {
        }

        /* Access modifiers changed, original: protected|final */
        public final int a() {
            return iw.this.b;
        }

        /* Access modifiers changed, original: protected|final */
        public final int a(Object obj) {
            return iw.this.a(obj);
        }

        /* Access modifiers changed, original: protected|final */
        public final Object a(int i, int i2) {
            return iw.this.a[i];
        }

        /* Access modifiers changed, original: protected|final */
        public final E a(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }

        /* Access modifiers changed, original: protected|final */
        public final void a(int i) {
            iw.this.a(i);
        }

        /* Access modifiers changed, original: protected|final */
        public final void a(E e, E e2) {
            iw.this.add(e);
        }

        /* Access modifiers changed, original: protected|final */
        public final int b(Object obj) {
            return iw.this.a(obj);
        }

        /* Access modifiers changed, original: protected|final */
        public final Map<E, E> b() {
            throw new UnsupportedOperationException("not a map");
        }

        /* Access modifiers changed, original: protected|final */
        public final void c() {
            iw.this.clear();
        }
    }

    public iw() {
        this(0);
    }

    public iw(int i) {
        if (i == 0) {
            this.i = c;
            this.a = d;
        } else {
            b(i);
        }
        this.b = 0;
    }

    private int a() {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        int a = ix.a(this.i, i, 0);
        if (a < 0 || this.a[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.i[i2] == 0) {
            if (this.a[i2] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.i[a] == 0) {
            if (this.a[a] == null) {
                return a;
            }
            a--;
        }
        return i2 ^ -1;
    }

    private int a(Object obj, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int a = ix.a(this.i, i2, i);
        if (a < 0 || obj.equals(this.a[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.i[i3] == i) {
            if (obj.equals(this.a[i3])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.i[a] == i) {
            if (obj.equals(this.a[a])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (iw.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (iw.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (i--; i >= 2; i--) {
                        objArr[i] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    private void b(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (iw.class) {
                if (g != null) {
                    objArr = g;
                    this.a = objArr;
                    g = (Object[]) objArr[0];
                    this.i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (iw.class) {
                if (e != null) {
                    objArr = e;
                    this.a = objArr;
                    e = (Object[]) objArr[0];
                    this.i = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.i = new int[i];
        this.a = new Object[i];
    }

    public final int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public final E a(int i) {
        Object[] objArr = this.a;
        E e = objArr[i];
        int i2 = this.b;
        if (i2 <= 1) {
            iw.a(this.i, objArr, i2);
            this.i = c;
            this.a = d;
            this.b = 0;
        } else {
            int[] iArr = this.i;
            int i3 = 8;
            int i4;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                this.b--;
                int i5 = this.b;
                if (i < i5) {
                    int[] iArr2 = this.i;
                    i4 = i + 1;
                    System.arraycopy(iArr2, i4, iArr2, i, i5 - i);
                    objArr = this.a;
                    System.arraycopy(objArr, i4, objArr, i, this.b - i);
                }
                this.a[this.b] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                iArr = this.i;
                Object[] objArr2 = this.a;
                b(i3);
                this.b--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.i, 0, i);
                    System.arraycopy(objArr2, 0, this.a, 0, i);
                }
                i4 = this.b;
                if (i < i4) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.i, i, i4 - i);
                    System.arraycopy(objArr2, i6, this.a, i, this.b - i);
                }
            }
        }
        return e;
    }

    public final boolean add(E e) {
        int a;
        int i;
        if (e == null) {
            a = a();
            i = 0;
        } else {
            a = e.hashCode();
            i = a;
            a = a(e, a);
        }
        if (a >= 0) {
            return false;
        }
        int i2;
        int[] iArr;
        a ^= -1;
        int i3 = this.b;
        if (i3 >= this.i.length) {
            i2 = 4;
            if (i3 >= 8) {
                i2 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i2 = 8;
            }
            iArr = this.i;
            Object[] objArr = this.a;
            b(i2);
            int[] iArr2 = this.i;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.a, 0, objArr.length);
            }
            iw.a(iArr, objArr, this.b);
        }
        int i4 = this.b;
        if (a < i4) {
            iArr = this.i;
            i2 = a + 1;
            System.arraycopy(iArr, a, iArr, i2, i4 - a);
            Object[] objArr2 = this.a;
            System.arraycopy(objArr2, a, objArr2, i2, this.b - a);
        }
        this.i[a] = i;
        this.a[a] = e;
        this.b++;
        return true;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.b + collection.size();
        int[] iArr = this.i;
        int i = 0;
        if (iArr.length < size) {
            Object[] objArr = this.a;
            b(size);
            size = this.b;
            if (size > 0) {
                System.arraycopy(iArr, 0, this.i, 0, size);
                System.arraycopy(objArr, 0, this.a, 0, this.b);
            }
            iw.a(iArr, objArr, this.b);
        }
        for (Object add : collection) {
            i |= add(add);
        }
        return i;
    }

    public final void clear() {
        int i = this.b;
        if (i != 0) {
            iw.a(this.i, this.a, i);
            this.i = c;
            this.a = d;
            this.b = 0;
        }
    }

    public final boolean contains(Object obj) {
        return a(obj) >= 0;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.b) {
                try {
                    if (!set.contains(this.a[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.i;
        int i = 0;
        for (int i2 = 0; i2 < this.b; i2++) {
            i += iArr[i2];
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.b <= 0;
    }

    public final Iterator<E> iterator() {
        if (this.j == null) {
            this.j = new 1();
        }
        return this.j.d().iterator();
    }

    public final boolean remove(Object obj) {
        int a = a(obj);
        if (a < 0) {
            return false;
        }
        a(a);
        return true;
    }

    public final boolean removeAll(Collection<?> collection) {
        int i = 0;
        for (Object remove : collection) {
            i |= remove(remove);
        }
        return i;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.b - 1; i >= 0; i--) {
            if (!collection.contains(this.a[i])) {
                a(i);
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        return this.b;
    }

    public final Object[] toArray() {
        int i = this.b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.a, 0, objArr, 0, i);
        return objArr;
    }

    public final <T> T[] toArray(T[] tArr) {
        Object tArr2;
        if (tArr2.length < this.b) {
            tArr2 = (Object[]) Array.newInstance(tArr2.getClass().getComponentType(), this.b);
        }
        System.arraycopy(this.a, 0, tArr2, 0, this.b);
        int length = tArr2.length;
        int i = this.b;
        if (length > i) {
            tArr2[i] = null;
        }
        return tArr2;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.b * 14);
        stringBuilder.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                stringBuilder.append(ppy.d);
            }
            iw iwVar = this.a[i];
            if (iwVar != this) {
                stringBuilder.append(iwVar);
            } else {
                stringBuilder.append("(this Set)");
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
