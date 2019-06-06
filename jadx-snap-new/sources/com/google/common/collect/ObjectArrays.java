package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collection;

public final class ObjectArrays {
    static Object checkElementNotNull(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index ".concat(String.valueOf(i)));
    }

    static Object[] checkElementsNotNull(Object... objArr) {
        return checkElementsNotNull(objArr, objArr.length);
    }

    static Object[] checkElementsNotNull(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            checkElementNotNull(objArr[i2], i2);
        }
        return objArr;
    }

    private static Object[] fillArray(Iterable<?> iterable, Object[] objArr) {
        int i = 0;
        for (Object obj : iterable) {
            int i2 = i + 1;
            objArr[i] = obj;
            i = i2;
        }
        return objArr;
    }

    public static <T> T[] newArray(Class<T> cls, int i) {
        return (Object[]) Array.newInstance(cls, i);
    }

    public static <T> T[] newArray(T[] tArr, int i) {
        return Platform.newArray(tArr, i);
    }

    static Object[] toArrayImpl(Collection<?> collection) {
        return fillArray(collection, new Object[collection.size()]);
    }

    static <T> T[] toArrayImpl(Collection<?> collection, T[] tArr) {
        Object[] tArr2;
        int size = collection.size();
        if (tArr2.length < size) {
            tArr2 = newArray((Object[]) tArr2, size);
        }
        fillArray(collection, tArr2);
        if (tArr2.length > size) {
            tArr2[size] = null;
        }
        return tArr2;
    }

    static <T> T[] toArrayImpl(Object[] objArr, int i, int i2, T[] tArr) {
        Object tArr2;
        Preconditions.checkPositionIndexes(i, i + i2, objArr.length);
        if (tArr2.length < i2) {
            tArr2 = newArray((Object[]) tArr2, i2);
        } else if (tArr2.length > i2) {
            tArr2[i2] = null;
        }
        System.arraycopy(objArr, i, tArr2, 0, i2);
        return tArr2;
    }
}
