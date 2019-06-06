package com.google.common.hash;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.GOOD_FAST_HASH_SEED);
    static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    private final int seed;

    static final class Murmur3_128Hasher extends AbstractStreamingHasher {
        private long h1;
        private long h2;
        private int length = 0;

        Murmur3_128Hasher(int i) {
            super(16);
            long j = (long) i;
            this.h1 = j;
            this.h2 = j;
        }

        private void bmix64(long j, long j2) {
            this.h1 = mixK1(j) ^ this.h1;
            this.h1 = Long.rotateLeft(this.h1, 27);
            j = this.h1;
            long j3 = this.h2;
            this.h1 = j + j3;
            this.h1 = (this.h1 * 5) + 1390208809;
            this.h2 = mixK2(j2) ^ j3;
            this.h2 = Long.rotateLeft(this.h2, 31);
            this.h2 += this.h1;
            this.h2 = (this.h2 * 5) + 944331445;
        }

        private static long fmix64(long j) {
            j = (j ^ (j >>> 33)) * -49064778989728563L;
            j = (j ^ (j >>> 33)) * -4265267296055464877L;
            return j ^ (j >>> 33);
        }

        private static long mixK1(long j) {
            return Long.rotateLeft(j * -8663945395140668459L, 31) * 5545529020109919103L;
        }

        private static long mixK2(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * -8663945395140668459L;
        }

        public final HashCode makeHash() {
            long j = this.h1;
            int i = this.length;
            this.h1 = j ^ ((long) i);
            this.h2 ^= (long) i;
            j = this.h1;
            long j2 = this.h2;
            this.h1 = j + j2;
            j = this.h1;
            this.h2 = j2 + j;
            this.h1 = fmix64(j);
            this.h2 = fmix64(this.h2);
            j = this.h1;
            j2 = this.h2;
            this.h1 = j + j2;
            this.h2 = j2 + this.h1;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.h1).putLong(this.h2).array());
        }

        /* Access modifiers changed, original: protected|final */
        public final void process(ByteBuffer byteBuffer) {
            bmix64(byteBuffer.getLong(), byteBuffer.getLong());
            this.length += 16;
        }

        /* Access modifiers changed, original: protected|final */
        /* JADX WARNING: Missing block: B:6:0x0036, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(13))) << 40);
     */
        /* JADX WARNING: Missing block: B:8:0x0045, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(12))) << 32);
     */
        /* JADX WARNING: Missing block: B:10:0x0055, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(11))) << 24);
     */
        /* JADX WARNING: Missing block: B:12:0x0064, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(10))) << 16);
     */
        /* JADX WARNING: Missing block: B:14:0x0073, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(9))) << 8);
     */
        /* JADX WARNING: Missing block: B:16:0x0082, code skipped:
            r0 = r0 ^ ((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(8)));
     */
        /* JADX WARNING: Missing block: B:18:0x008e, code skipped:
            r2 = r12.getLong() ^ 0;
     */
        /* JADX WARNING: Missing block: B:21:0x00a3, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(5))) << 40);
     */
        /* JADX WARNING: Missing block: B:23:0x00b1, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(4))) << 32);
     */
        /* JADX WARNING: Missing block: B:25:0x00c0, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(3))) << 24);
     */
        /* JADX WARNING: Missing block: B:27:0x00ce, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(2))) << 16);
     */
        /* JADX WARNING: Missing block: B:29:0x00dc, code skipped:
            r0 = r0 ^ (((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(1))) << 8);
     */
        /* JADX WARNING: Missing block: B:31:0x00ea, code skipped:
            r2 = ((long) com.google.common.primitives.UnsignedBytes.toInt(r12.get(0))) ^ r0;
            r0 = 0;
     */
        /* JADX WARNING: Missing block: B:32:0x00f6, code skipped:
            r11.h1 = mixK1(r2) ^ r11.h1;
            r11.h2 = mixK2(r0) ^ r11.h2;
     */
        /* JADX WARNING: Missing block: B:33:0x0108, code skipped:
            return;
     */
        public final void processRemaining(java.nio.ByteBuffer r12) {
            /*
            r11 = this;
            r0 = r11.length;
            r1 = r12.remaining();
            r0 = r0 + r1;
            r11.length = r0;
            r0 = r12.remaining();
            r1 = 48;
            r2 = 40;
            r3 = 32;
            r4 = 24;
            r5 = 16;
            r6 = 8;
            r7 = 0;
            switch(r0) {
                case 1: goto L_0x00e9;
                case 2: goto L_0x00db;
                case 3: goto L_0x00cd;
                case 4: goto L_0x00bf;
                case 5: goto L_0x00b0;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0094;
                case 8: goto L_0x008d;
                case 9: goto L_0x0081;
                case 10: goto L_0x0072;
                case 11: goto L_0x0063;
                case 12: goto L_0x0054;
                case 13: goto L_0x0044;
                case 14: goto L_0x0035;
                case 15: goto L_0x0026;
                default: goto L_0x001e;
            };
        L_0x001e:
            r12 = new java.lang.AssertionError;
            r0 = "Should never get here.";
            r12.<init>(r0);
            throw r12;
        L_0x0026:
            r0 = 14;
            r0 = r12.get(r0);
            r0 = com.google.common.primitives.UnsignedBytes.toInt(r0);
            r9 = (long) r0;
            r0 = r9 << r1;
            r0 = r0 ^ r7;
            goto L_0x0036;
        L_0x0035:
            r0 = r7;
        L_0x0036:
            r9 = 13;
            r9 = r12.get(r9);
            r9 = com.google.common.primitives.UnsignedBytes.toInt(r9);
            r9 = (long) r9;
            r9 = r9 << r2;
            r0 = r0 ^ r9;
            goto L_0x0045;
        L_0x0044:
            r0 = r7;
        L_0x0045:
            r2 = 12;
            r2 = r12.get(r2);
            r2 = com.google.common.primitives.UnsignedBytes.toInt(r2);
            r9 = (long) r2;
            r2 = r9 << r3;
            r0 = r0 ^ r2;
            goto L_0x0055;
        L_0x0054:
            r0 = r7;
        L_0x0055:
            r2 = 11;
            r2 = r12.get(r2);
            r2 = com.google.common.primitives.UnsignedBytes.toInt(r2);
            r2 = (long) r2;
            r2 = r2 << r4;
            r0 = r0 ^ r2;
            goto L_0x0064;
        L_0x0063:
            r0 = r7;
        L_0x0064:
            r2 = 10;
            r2 = r12.get(r2);
            r2 = com.google.common.primitives.UnsignedBytes.toInt(r2);
            r2 = (long) r2;
            r2 = r2 << r5;
            r0 = r0 ^ r2;
            goto L_0x0073;
        L_0x0072:
            r0 = r7;
        L_0x0073:
            r2 = 9;
            r2 = r12.get(r2);
            r2 = com.google.common.primitives.UnsignedBytes.toInt(r2);
            r2 = (long) r2;
            r2 = r2 << r6;
            r0 = r0 ^ r2;
            goto L_0x0082;
        L_0x0081:
            r0 = r7;
        L_0x0082:
            r2 = r12.get(r6);
            r2 = com.google.common.primitives.UnsignedBytes.toInt(r2);
            r2 = (long) r2;
            r0 = r0 ^ r2;
            goto L_0x008e;
        L_0x008d:
            r0 = r7;
        L_0x008e:
            r2 = r12.getLong();
            r2 = r2 ^ r7;
            goto L_0x00f6;
        L_0x0094:
            r0 = 6;
            r0 = r12.get(r0);
            r0 = com.google.common.primitives.UnsignedBytes.toInt(r0);
            r9 = (long) r0;
            r0 = r9 << r1;
            r0 = r0 ^ r7;
            goto L_0x00a3;
        L_0x00a2:
            r0 = r7;
        L_0x00a3:
            r9 = 5;
            r9 = r12.get(r9);
            r9 = com.google.common.primitives.UnsignedBytes.toInt(r9);
            r9 = (long) r9;
            r9 = r9 << r2;
            r0 = r0 ^ r9;
            goto L_0x00b1;
        L_0x00b0:
            r0 = r7;
        L_0x00b1:
            r2 = 4;
            r2 = r12.get(r2);
            r2 = com.google.common.primitives.UnsignedBytes.toInt(r2);
            r9 = (long) r2;
            r2 = r9 << r3;
            r0 = r0 ^ r2;
            goto L_0x00c0;
        L_0x00bf:
            r0 = r7;
        L_0x00c0:
            r2 = 3;
            r2 = r12.get(r2);
            r2 = com.google.common.primitives.UnsignedBytes.toInt(r2);
            r2 = (long) r2;
            r2 = r2 << r4;
            r0 = r0 ^ r2;
            goto L_0x00ce;
        L_0x00cd:
            r0 = r7;
        L_0x00ce:
            r2 = 2;
            r2 = r12.get(r2);
            r2 = com.google.common.primitives.UnsignedBytes.toInt(r2);
            r2 = (long) r2;
            r2 = r2 << r5;
            r0 = r0 ^ r2;
            goto L_0x00dc;
        L_0x00db:
            r0 = r7;
        L_0x00dc:
            r2 = 1;
            r2 = r12.get(r2);
            r2 = com.google.common.primitives.UnsignedBytes.toInt(r2);
            r2 = (long) r2;
            r2 = r2 << r6;
            r0 = r0 ^ r2;
            goto L_0x00ea;
        L_0x00e9:
            r0 = r7;
        L_0x00ea:
            r2 = 0;
            r12 = r12.get(r2);
            r12 = com.google.common.primitives.UnsignedBytes.toInt(r12);
            r2 = (long) r12;
            r2 = r2 ^ r0;
            r0 = r7;
        L_0x00f6:
            r4 = r11.h1;
            r2 = mixK1(r2);
            r2 = r2 ^ r4;
            r11.h1 = r2;
            r2 = r11.h2;
            r0 = mixK2(r0);
            r0 = r0 ^ r2;
            r11.h2 = r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher.processRemaining(java.nio.ByteBuffer):void");
        }
    }

    Murmur3_128HashFunction(int i) {
        this.seed = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Murmur3_128HashFunction) {
            if (this.seed == ((Murmur3_128HashFunction) obj).seed) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ this.seed;
    }

    public final Hasher newHasher() {
        return new Murmur3_128Hasher(this.seed);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Hashing.murmur3_128(");
        stringBuilder.append(this.seed);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
