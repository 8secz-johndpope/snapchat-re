package defpackage;

import android.util.SparseArray;

/* renamed from: zpf */
public final class zpf<T> extends SparseArray<T> {
    private zpf(int i) {
        super(i);
    }

    static <K> zpf<K> a(SparseArray<K> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        if (sparseArray instanceof zpf) {
            return (zpf) sparseArray;
        }
        int size = sparseArray.size();
        zpf zpf = new zpf(size);
        for (int i = 0; i < size; i++) {
            zpf.append(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        return zpf;
    }

    public final synchronized void append(int i, T t) {
        super.append(i, t);
    }

    public final synchronized void clear() {
        super.clear();
    }

    public final synchronized SparseArray<T> clone() {
        return super.clone();
    }

    public final synchronized void delete(int i) {
        super.delete(i);
    }

    public final synchronized T get(int i) {
        return super.get(i);
    }

    public final synchronized T get(int i, T t) {
        return super.get(i, t);
    }

    public final synchronized int indexOfKey(int i) {
        return super.indexOfKey(i);
    }

    public final synchronized int indexOfValue(T t) {
        return super.indexOfValue(t);
    }

    public final synchronized int keyAt(int i) {
        return super.keyAt(i);
    }

    public final synchronized void put(int i, T t) {
        super.put(i, t);
    }

    public final synchronized void remove(int i) {
        super.remove(i);
    }

    public final synchronized void removeAt(int i) {
        super.removeAt(i);
    }

    public final synchronized void removeAtRange(int i, int i2) {
        super.removeAtRange(i, i2);
    }

    public final synchronized void setValueAt(int i, T t) {
        super.setValueAt(i, t);
    }

    public final synchronized int size() {
        return super.size();
    }

    public final synchronized T valueAt(int i) {
        return super.valueAt(i);
    }
}
