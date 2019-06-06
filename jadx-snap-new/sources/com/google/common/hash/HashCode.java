package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;

public abstract class HashCode {
    private static final char[] hexDigits = "0123456789abcdef".toCharArray();

    static final class BytesHashCode extends HashCode implements Serializable {
        final byte[] bytes;

        BytesHashCode(byte[] bArr) {
            this.bytes = (byte[]) Preconditions.checkNotNull(bArr);
        }

        public final byte[] asBytes() {
            return (byte[]) this.bytes.clone();
        }

        public final int asInt() {
            Preconditions.checkState(this.bytes.length >= 4, "HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", this.bytes.length);
            byte[] bArr = this.bytes;
            return ((bArr[3] & 255) << 24) | ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) | ((bArr[2] & 255) << 16));
        }

        public final int bits() {
            return this.bytes.length << 3;
        }

        /* Access modifiers changed, original: final */
        public final boolean equalsSameBits(HashCode hashCode) {
            if (this.bytes.length != hashCode.getBytesInternal().length) {
                return false;
            }
            int i = 0;
            int i2 = 1;
            while (true) {
                byte[] bArr = this.bytes;
                if (i >= bArr.length) {
                    return i2;
                }
                i2 &= bArr[i] == hashCode.getBytesInternal()[i] ? 1 : 0;
                i++;
            }
        }

        /* Access modifiers changed, original: final */
        public final byte[] getBytesInternal() {
            return this.bytes;
        }
    }

    static final class IntHashCode extends HashCode implements Serializable {
        final int hash;

        IntHashCode(int i) {
            this.hash = i;
        }

        public final byte[] asBytes() {
            r0 = new byte[4];
            int i = this.hash;
            r0[0] = (byte) i;
            r0[1] = (byte) (i >> 8);
            r0[2] = (byte) (i >> 16);
            r0[3] = (byte) (i >> 24);
            return r0;
        }

        public final int asInt() {
            return this.hash;
        }

        public final int bits() {
            return 32;
        }

        /* Access modifiers changed, original: final */
        public final boolean equalsSameBits(HashCode hashCode) {
            return this.hash == hashCode.asInt();
        }
    }

    HashCode() {
    }

    static HashCode fromBytesNoCopy(byte[] bArr) {
        return new BytesHashCode(bArr);
    }

    public static HashCode fromInt(int i) {
        return new IntHashCode(i);
    }

    public abstract byte[] asBytes();

    public abstract int asInt();

    public abstract int bits();

    public final boolean equals(Object obj) {
        if (obj instanceof HashCode) {
            HashCode hashCode = (HashCode) obj;
            if (bits() == hashCode.bits() && equalsSameBits(hashCode)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean equalsSameBits(HashCode hashCode);

    /* Access modifiers changed, original: 0000 */
    public byte[] getBytesInternal() {
        return asBytes();
    }

    public final int hashCode() {
        if (bits() >= 32) {
            return asInt();
        }
        byte[] bytesInternal = getBytesInternal();
        int i = bytesInternal[0] & 255;
        for (int i2 = 1; i2 < bytesInternal.length; i2++) {
            i |= (bytesInternal[i2] & 255) << (i2 << 3);
        }
        return i;
    }

    public final String toString() {
        byte[] bytesInternal = getBytesInternal();
        StringBuilder stringBuilder = new StringBuilder(bytesInternal.length * 2);
        for (byte b : bytesInternal) {
            stringBuilder.append(hexDigits[(b >> 4) & 15]);
            stringBuilder.append(hexDigits[b & 15]);
        }
        return stringBuilder.toString();
    }
}
