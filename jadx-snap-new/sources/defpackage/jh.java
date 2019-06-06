package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: jh */
public class jh<K, V> {
    private static Object[] c;
    private static int d;
    private static Object[] e;
    private static int f;
    Object[] a;
    int b;
    private int[] g;

    public jh() {
        this.g = ix.a;
        this.a = ix.b;
        this.b = 0;
    }

    public jh(int i) {
        if (i == 0) {
            this.g = ix.a;
            this.a = ix.b;
        } else {
            e(i);
        }
        this.b = 0;
    }

    public jh(jh<K, V> jhVar) {
        this();
        if (jhVar != null) {
            a((jh) jhVar);
        }
    }

    private int a() {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        int a = jh.a(this.g, i, 0);
        if (a < 0 || this.a[a << 1] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.g[i2] == 0) {
            if (this.a[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        a--;
        while (a >= 0 && this.g[a] == 0) {
            if (this.a[a << 1] == null) {
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
        int a = jh.a(this.g, i2, i);
        if (a < 0 || obj.equals(this.a[a << 1])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.g[i3] == i) {
            if (obj.equals(this.a[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        a--;
        while (a >= 0 && this.g[a] == i) {
            if (obj.equals(this.a[a << 1])) {
                return a;
            }
            a--;
        }
        return i3 ^ -1;
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return ix.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        int i2;
        if (iArr.length == 8) {
            synchronized (iv.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (iv.class) {
                if (d < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    for (i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    c = objArr;
                    d++;
                }
            }
        }
    }

    private void e(int i) {
        Object[] objArr;
        if (i == 8) {
            synchronized (iv.class) {
                if (e != null) {
                    objArr = e;
                    this.a = objArr;
                    e = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (iv.class) {
                if (c != null) {
                    objArr = c;
                    this.a = objArr;
                    c = (Object[]) objArr[0];
                    this.g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    d--;
                    return;
                }
            }
        }
        this.g = new int[i];
        this.a = new Object[(i << 1)];
    }

    public final int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public V a(int i, V v) {
        i = (i << 1) + 1;
        Object[] objArr = this.a;
        V v2 = objArr[i];
        objArr[i] = v;
        return v2;
    }

    public final void a(int i) {
        int i2 = this.b;
        int[] iArr = this.g;
        if (iArr.length < i) {
            Object[] objArr = this.a;
            e(i);
            if (this.b > 0) {
                System.arraycopy(iArr, 0, this.g, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, i2 << 1);
            }
            jh.a(iArr, objArr, i2);
        }
        if (this.b != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void a(jh<? extends K, ? extends V> jhVar) {
        int i = jhVar.b;
        a(this.b + i);
        int i2 = 0;
        if (this.b != 0) {
            while (i2 < i) {
                put(jhVar.b(i2), jhVar.c(i2));
                i2++;
            }
        } else if (i > 0) {
            System.arraycopy(jhVar.g, 0, this.g, 0, i);
            System.arraycopy(jhVar.a, 0, this.a, 0, i << 1);
            this.b = i;
        }
    }

    /* Access modifiers changed, original: final */
    public final int b(Object obj) {
        int i = this.b << 1;
        Object[] objArr = this.a;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
        } else {
            for (int i3 = 1; i3 < i; i3 += 2) {
                if (obj.equals(objArr[i3])) {
                    return i3 >> 1;
                }
            }
        }
        return -1;
    }

    public final K b(int i) {
        return this.a[i << 1];
    }

    public final V c(int i) {
        return this.a[(i << 1) + 1];
    }

    public void clear() {
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.g;
            Object[] objArr = this.a;
            this.g = ix.a;
            this.a = ix.b;
            this.b = 0;
            jh.a(iArr, objArr, i);
        }
        if (this.b > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V d(int i) {
        int i2;
        Object[] objArr = this.a;
        int i3 = i << 1;
        V v = objArr[i3 + 1];
        int i4 = this.b;
        if (i4 <= 1) {
            jh.a(this.g, objArr, i4);
            this.g = ix.a;
            this.a = ix.b;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.g;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                Object[] objArr2;
                if (i < i2) {
                    int[] iArr2 = this.g;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    objArr2 = this.a;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i3, i7 << 1);
                }
                objArr2 = this.a;
                i3 = i2 << 1;
                objArr2[i3] = null;
                objArr2[i3 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                iArr = this.g;
                Object[] objArr3 = this.a;
                e(i5);
                if (i4 == this.b) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.g, 0, i);
                        System.arraycopy(objArr3, 0, this.a, 0, i3);
                    }
                    if (i < i2) {
                        int i8 = i + 1;
                        int i9 = i2 - i;
                        System.arraycopy(iArr, i8, this.g, i, i9);
                        System.arraycopy(objArr3, i8 << 1, this.a, i3, i9 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
        }
        if (i4 == this.b) {
            this.b = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        int i;
        Object b;
        Object c;
        Object obj2;
        if (obj instanceof jh) {
            jh jhVar = (jh) obj;
            if (size() != jhVar.size()) {
                return false;
            }
            i = 0;
            while (i < this.b) {
                try {
                    b = b(i);
                    c = c(i);
                    obj2 = jhVar.get(b);
                    if (c == null) {
                        if (obj2 != null || !jhVar.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            i = 0;
            while (i < this.b) {
                try {
                    b = b(i);
                    c = c(i);
                    obj2 = map.get(b);
                    if (c == null) {
                        if (obj2 != null || !map.containsKey(b)) {
                            return false;
                        }
                    } else if (!c.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int a = a(obj);
        return a >= 0 ? this.a[(a << 1) + 1] : null;
    }

    public int hashCode() {
        int[] iArr = this.g;
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.b <= 0;
    }

    public V put(K k, V v) {
        int a;
        int i;
        int i2 = this.b;
        if (k == null) {
            a = a();
            i = 0;
        } else {
            a = k.hashCode();
            i = a;
            a = a((Object) k, a);
        }
        Object[] objArr;
        if (a >= 0) {
            int i3 = (a << 1) + 1;
            objArr = this.a;
            V v2 = objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4;
        a ^= -1;
        if (i2 >= this.g.length) {
            i4 = 4;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i4 = 8;
            }
            int[] iArr = this.g;
            Object[] objArr2 = this.a;
            e(i4);
            if (i2 == this.b) {
                int[] iArr2 = this.g;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.a, 0, objArr2.length);
                }
                jh.a(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (a < i2) {
            int[] iArr3 = this.g;
            i4 = a + 1;
            System.arraycopy(iArr3, a, iArr3, i4, i2 - a);
            Object[] objArr3 = this.a;
            System.arraycopy(objArr3, a << 1, objArr3, i4 << 1, (this.b - a) << 1);
        }
        int i5 = this.b;
        if (i2 == i5) {
            int[] iArr4 = this.g;
            if (a < iArr4.length) {
                iArr4[a] = i;
                objArr = this.a;
                a <<= 1;
                objArr[a] = k;
                objArr[a + 1] = v;
                this.b = i5 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V remove(Object obj) {
        int a = a(obj);
        return a >= 0 ? d(a) : null;
    }

    public int size() {
        return this.b;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(this.b * 28);
        stringBuilder.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                stringBuilder.append(ppy.d);
            }
            jh b = b(i);
            String str = "(this Map)";
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append(str);
            }
            stringBuilder.append('=');
            b = c(i);
            if (b != this) {
                stringBuilder.append(b);
            } else {
                stringBuilder.append(str);
            }
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
