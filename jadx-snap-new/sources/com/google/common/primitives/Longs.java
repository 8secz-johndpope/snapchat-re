package com.google.common.primitives;

import com.google.common.base.Preconditions;
import defpackage.ppy;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class Longs {

    static class LongArrayAsList extends AbstractList<Long> implements Serializable, RandomAccess {
        final long[] array;
        final int end;
        final int start;

        LongArrayAsList(long[] jArr, int i, int i2) {
            this.array = jArr;
            this.start = i;
            this.end = i2;
        }

        public boolean contains(Object obj) {
            return (obj instanceof Long) && Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end) != -1;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LongArrayAsList)) {
                return super.equals(obj);
            }
            LongArrayAsList longArrayAsList = (LongArrayAsList) obj;
            int size = size();
            if (longArrayAsList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.array[this.start + i] != longArrayAsList.array[longArrayAsList.start + i]) {
                    return false;
                }
            }
            return true;
        }

        public Long get(int i) {
            Preconditions.checkElementIndex(i, size());
            return Long.valueOf(this.array[this.start + i]);
        }

        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Longs.hashCode(this.array[i2]);
            }
            return i;
        }

        public int indexOf(Object obj) {
            if (obj instanceof Long) {
                int access$000 = Longs.indexOf(this.array, ((Long) obj).longValue(), this.start, this.end);
                if (access$000 >= 0) {
                    return access$000 - this.start;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object obj) {
            if (obj instanceof Long) {
                int access$100 = Longs.lastIndexOf(this.array, ((Long) obj).longValue(), this.start, this.end);
                if (access$100 >= 0) {
                    return access$100 - this.start;
                }
            }
            return -1;
        }

        public Long set(int i, Long l) {
            Preconditions.checkElementIndex(i, size());
            long[] jArr = this.array;
            int i2 = this.start;
            long j = jArr[i2 + i];
            jArr[i2 + i] = ((Long) Preconditions.checkNotNull(l)).longValue();
            return Long.valueOf(j);
        }

        public int size() {
            return this.end - this.start;
        }

        public List<Long> subList(int i, int i2) {
            Preconditions.checkPositionIndexes(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            long[] jArr = this.array;
            int i3 = this.start;
            return new LongArrayAsList(jArr, i + i3, i3 + i2);
        }

        /* Access modifiers changed, original: 0000 */
        public long[] toLongArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(size() * 10);
            stringBuilder.append('[');
            stringBuilder.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    stringBuilder.append(ppy.d);
                    stringBuilder.append(this.array[i]);
                } else {
                    stringBuilder.append(']');
                    return stringBuilder.toString();
                }
            }
        }
    }

    static final class AsciiDigits {
        private static final byte[] asciiDigits;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i <= 9; i++) {
                bArr[i + 48] = (byte) i;
            }
            for (int i2 = 0; i2 <= 26; i2++) {
                byte b = (byte) (i2 + 10);
                bArr[i2 + 65] = b;
                bArr[i2 + 97] = b;
            }
            asciiDigits = bArr;
        }

        static int digit(char c) {
            return c < 128 ? asciiDigits[c] : -1;
        }
    }

    public static int compare(long j, long j2) {
        return j < j2 ? -1 : j > j2 ? 1 : 0;
    }

    public static int hashCode(long j) {
        return (int) (j ^ (j >>> 32));
    }

    private static int indexOf(long[] jArr, long j, int i, int i2) {
        while (i < i2) {
            if (jArr[i] == j) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int lastIndexOf(long[] jArr, long j, int i, int i2) {
        for (i2--; i2 >= i; i2--) {
            if (jArr[i2] == j) {
                return i2;
            }
        }
        return -1;
    }

    public static long[] toArray(Collection<? extends Number> collection) {
        if (collection instanceof LongArrayAsList) {
            return ((LongArrayAsList) collection).toLongArray();
        }
        Object[] toArray = collection.toArray();
        int length = toArray.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) Preconditions.checkNotNull(toArray[i])).longValue();
        }
        return jArr;
    }

    public static Long tryParse(String str) {
        return tryParse(str, 10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x0089 in {2, 9, 12, 16, 25, 28, 29, 30, 33, 36, 38, 39, 41} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static java.lang.Long tryParse(java.lang.String r18, int r19) {
        /*
        r0 = r18;
        r1 = r19;
        r2 = com.google.common.base.Preconditions.checkNotNull(r18);
        r2 = (java.lang.String) r2;
        r2 = r2.isEmpty();
        r3 = 0;
        if (r2 == 0) goto L_0x0012;
        return r3;
        r2 = 2;
        if (r1 < r2) goto L_0x0079;
        r2 = 36;
        if (r1 > r2) goto L_0x0079;
        r2 = 0;
        r4 = r0.charAt(r2);
        r5 = 45;
        if (r4 != r5) goto L_0x0023;
        r2 = 1;
        r4 = r18.length();
        if (r2 != r4) goto L_0x002a;
        return r3;
        r4 = r2 + 1;
        r5 = r0.charAt(r2);
        r5 = com.google.common.primitives.Longs.AsciiDigits.digit(r5);
        if (r5 < 0) goto L_0x0078;
        if (r5 < r1) goto L_0x0039;
        goto L_0x0078;
        r5 = -r5;
        r5 = (long) r5;
        r7 = (long) r1;
        r9 = -9223372036854775808;
        r11 = r9 / r7;
        r13 = r18.length();
        if (r4 >= r13) goto L_0x0066;
        r13 = r4 + 1;
        r4 = r0.charAt(r4);
        r4 = com.google.common.primitives.Longs.AsciiDigits.digit(r4);
        if (r4 < 0) goto L_0x0065;
        if (r4 >= r1) goto L_0x0065;
        r14 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1));
        if (r14 >= 0) goto L_0x0059;
        goto L_0x0065;
        r5 = r5 * r7;
        r14 = (long) r4;
        r16 = r14 + r9;
        r4 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1));
        if (r4 >= 0) goto L_0x0062;
        return r3;
        r5 = r5 - r14;
        r4 = r13;
        goto L_0x0040;
        return r3;
        if (r2 == 0) goto L_0x006d;
        r0 = java.lang.Long.valueOf(r5);
        return r0;
        r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1));
        if (r0 != 0) goto L_0x0072;
        return r3;
        r0 = -r5;
        r0 = java.lang.Long.valueOf(r0);
        return r0;
        return r3;
        r0 = new java.lang.IllegalArgumentException;
        r1 = java.lang.String.valueOf(r19);
        r2 = "radix must be between MIN_RADIX and MAX_RADIX but was ";
        r1 = r2.concat(r1);
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Longs.tryParse(java.lang.String, int):java.lang.Long");
    }
}
