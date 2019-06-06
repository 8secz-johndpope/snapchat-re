package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

final class MessageDigestHashFunction extends AbstractHashFunction implements Serializable {
    private final int bytes = this.prototype.getDigestLength();
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    static final class MessageDigestHasher extends AbstractByteHasher {
        private final int bytes;
        private final MessageDigest digest;
        private boolean done;

        private MessageDigestHasher(MessageDigest messageDigest, int i) {
            this.digest = messageDigest;
            this.bytes = i;
        }

        private void checkNotDone() {
            Preconditions.checkState(this.done ^ 1, "Cannot re-use a Hasher after calling hash() on it");
        }

        public final HashCode hash() {
            checkNotDone();
            this.done = true;
            return HashCode.fromBytesNoCopy(this.bytes == this.digest.getDigestLength() ? this.digest.digest() : Arrays.copyOf(this.digest.digest(), this.bytes));
        }

        /* Access modifiers changed, original: protected|final */
        public final void update(byte b) {
            checkNotDone();
            this.digest.update(b);
        }

        /* Access modifiers changed, original: protected|final */
        public final void update(byte[] bArr, int i, int i2) {
            checkNotDone();
            this.digest.update(bArr, i, i2);
        }
    }

    MessageDigestHashFunction(String str, String str2) {
        this.prototype = getMessageDigest(str);
        this.toString = (String) Preconditions.checkNotNull(str2);
        this.supportsClone = supportsClone(this.prototype);
    }

    private static MessageDigest getMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private static boolean supportsClone(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final Hasher newHasher() {
        if (this.supportsClone) {
            try {
                return new MessageDigestHasher((MessageDigest) this.prototype.clone(), this.bytes);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new MessageDigestHasher(getMessageDigest(this.prototype.getAlgorithm()), this.bytes);
    }

    public final String toString() {
        return this.toString;
    }
}
