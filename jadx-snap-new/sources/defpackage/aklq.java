package defpackage;

import java.lang.reflect.Array;

/* renamed from: aklq */
public final class aklq {
    public static final String[] a = new String[0];

    public static int a(Object[] objArr, Object obj) {
        return aklq.b(objArr, obj);
    }

    public static <T> T[] a(T[] tArr) {
        return tArr == null ? null : (Object[]) tArr.clone();
    }

    public static <T> T[] a(T[] tArr, T... tArr2) {
        if (tArr == null) {
            return aklq.a(tArr2);
        }
        if (tArr2 == null) {
            return aklq.a(tArr);
        }
        Class componentType = tArr.getClass().getComponentType();
        Object[] objArr = (Object[]) Array.newInstance(componentType, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, objArr, 0, tArr.length);
        try {
            System.arraycopy(tArr2, 0, objArr, tArr.length, tArr2.length);
            return objArr;
        } catch (ArrayStoreException e) {
            Class componentType2 = tArr2.getClass().getComponentType();
            if (componentType.isAssignableFrom(componentType2)) {
                throw e;
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot store ");
            stringBuilder.append(componentType2.getName());
            stringBuilder.append(" in an array of ");
            stringBuilder.append(componentType.getName());
            throw new IllegalArgumentException(stringBuilder.toString(), e);
        }
    }

    private static int b(Object[] objArr, Object obj) {
        if (objArr == null) {
            return -1;
        }
        int i = 0;
        if (obj == null) {
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else if (objArr.getClass().getComponentType().isInstance(obj)) {
            while (i < objArr.length) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }
}
