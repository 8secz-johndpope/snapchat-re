package defpackage;

import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/* renamed from: adcf */
public class adcf<T> implements Iterable<T> {
    protected T[] a;
    protected int b;
    private final adcj<T> c = new adcj(this);
    private T[] d;

    public adcf(T[] tArr, int i) {
        this.a = Arrays.copyOf(tArr, i);
        this.b = 0;
    }

    public adcf(T[] tArr, List<T> list) {
        this.a = list.toArray(tArr);
        this.b = this.a.length;
    }

    public final T a(int i) {
        return this.a[i];
    }

    public final void a() {
        this.b = 0;
    }

    public final void a(adcf<? extends T> adcf) {
        int i = adcf.b;
        if (i != 0) {
            int i2 = this.b + i;
            Object[] objArr = this.a;
            if (i2 >= objArr.length) {
                this.a = Arrays.copyOf(objArr, i2 << 1);
            }
            System.arraycopy(adcf.a, 0, this.a, this.b, adcf.b);
            this.b = i2;
        }
    }

    public final void a(T t) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            this.a = Arrays.copyOf(objArr, objArr.length << 1);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr2[i2] = t;
    }

    public final void a(Collection<? extends T> collection) {
        if (!collection.isEmpty()) {
            int size = collection.size();
            int i = this.b + size;
            Object[] objArr = this.a;
            if (i >= objArr.length) {
                this.a = Arrays.copyOf(objArr, i << 1);
            }
            objArr = this.d;
            if (objArr == null || objArr.length < size) {
                this.d = Arrays.copyOf(this.a, size);
            }
            System.arraycopy(collection.toArray(this.d), 0, this.a, this.b, size);
            this.b = i;
        }
    }

    public final void a(Comparator<? super T> comparator) {
        Arrays.sort(this.a, 0, this.b, comparator);
    }

    public final int b() {
        return this.b;
    }

    public final void b(T t) {
        int i = 0;
        while (i < this.b) {
            if (this.a[i].equals(t)) {
                break;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            Object[] objArr = this.a;
            System.arraycopy(objArr, i + 1, objArr, i, (this.b - 1) - i);
            objArr = this.a;
            i = this.b - 1;
            this.b = i;
            objArr[i] = null;
        }
    }

    public void forEach(Consumer<? super T> consumer) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (VERSION.SDK_INT >= 24) {
                consumer.accept(this.a[i2]);
            }
        }
    }

    public Iterator<T> iterator() {
        return this.c.a();
    }

    public Spliterator<T> spliterator() {
        throw new UnsupportedOperationException();
    }
}
