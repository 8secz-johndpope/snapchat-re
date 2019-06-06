package defpackage;

import android.util.LongSparseArray;
import android.util.SparseArray;

/* renamed from: zpe */
public final class zpe<T> extends LongSparseArray<SparseArray<T>> {
    public zpe(byte b) {
        super(3);
    }

    private synchronized int a(SparseArray<T> sparseArray) {
        return super.indexOfValue(sparseArray);
    }

    private synchronized SparseArray<T> a(int i) {
        return (SparseArray) super.valueAt(i);
    }

    private synchronized SparseArray<T> a(long j) {
        return (SparseArray) super.get(j);
    }

    private synchronized void a(int i, SparseArray<T> sparseArray) {
        super.setValueAt(i, zpf.a(sparseArray));
    }

    private synchronized void a(long j, SparseArray<T> sparseArray) {
        super.put(j, zpf.a(sparseArray));
    }

    private synchronized void b(long j, SparseArray<T> sparseArray) {
        super.append(j, zpf.a(sparseArray));
    }

    private synchronized SparseArray<T> c(long j, SparseArray<T> sparseArray) {
        return (SparseArray) super.get(j, sparseArray);
    }

    public final /* synthetic */ void append(long j, Object obj) {
        b(j, (SparseArray) obj);
    }

    public final synchronized void clear() {
        super.clear();
    }

    public final synchronized LongSparseArray<SparseArray<T>> clone() {
        return super.clone();
    }

    public final synchronized void delete(long j) {
        super.delete(j);
    }

    public final /* synthetic */ Object get(long j) {
        return a(j);
    }

    public final /* synthetic */ Object get(long j, Object obj) {
        return c(j, (SparseArray) obj);
    }

    public final synchronized int indexOfKey(long j) {
        return super.indexOfKey(j);
    }

    public final /* synthetic */ int indexOfValue(Object obj) {
        return a((SparseArray) obj);
    }

    public final synchronized long keyAt(int i) {
        return super.keyAt(i);
    }

    public final /* synthetic */ void put(long j, Object obj) {
        a(j, (SparseArray) obj);
    }

    public final synchronized void remove(long j) {
        super.remove(j);
    }

    public final synchronized void removeAt(int i) {
        super.removeAt(i);
    }

    public final /* synthetic */ void setValueAt(int i, Object obj) {
        a(i, (SparseArray) obj);
    }

    public final synchronized int size() {
        return super.size();
    }

    public final /* synthetic */ Object valueAt(int i) {
        return a(i);
    }
}
