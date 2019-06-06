package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: ajyh */
public class ajyh extends ajyg {
    public static final <T> List<T> a(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        Object asList = Arrays.asList(tArr);
        akcr.a(asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }

    public static final <T> void a(T[] tArr, Comparator<? super T> comparator) {
        akcr.b(tArr, "receiver$0");
        akcr.b(comparator, "comparator");
        if (tArr.length > 1) {
            Arrays.sort(tArr, comparator);
        }
    }

    public static final byte[] a(byte[] bArr, int i, int i2) {
        akcr.b(bArr, "receiver$0");
        ajyf.a(i2, bArr.length);
        Object copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        akcr.a(copyOfRange, "java.util.Arrays.copyOfR…this, fromIndex, toIndex)");
        return copyOfRange;
    }

    public static final byte[] a(byte[] bArr, byte[] bArr2) {
        akcr.b(bArr, "receiver$0");
        akcr.b(bArr2, "elements");
        int length = bArr.length;
        int length2 = bArr2.length;
        Object copyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(bArr2, 0, copyOf, length, length2);
        akcr.a(copyOf, "result");
        return copyOf;
    }

    public static final int[] a(int[] iArr, int i) {
        akcr.b(iArr, "receiver$0");
        int length = iArr.length;
        Object copyOf = Arrays.copyOf(iArr, length + 1);
        copyOf[length] = i;
        akcr.a(copyOf, "result");
        return copyOf;
    }

    public static final Long[] a(long[] jArr) {
        akcr.b(jArr, "receiver$0");
        Long[] lArr = new Long[jArr.length];
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    public static final <T> void b(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        if (tArr.length > 1) {
            Arrays.sort(tArr);
        }
    }
}
