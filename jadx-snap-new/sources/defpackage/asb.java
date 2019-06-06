package defpackage;

import java.io.UnsupportedEncodingException;

/* renamed from: asb */
final class asb {
    final byte[] a;
    private volatile int b = 0;

    static {
        asb asb = new asb(new byte[0]);
    }

    asb(byte[] bArr) {
        this.a = bArr;
    }

    public static asb a(String str) {
        try {
            return new asb(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported.", e);
        }
    }

    public final void a(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.a, i, bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof asb)) {
            return false;
        }
        asb asb = (asb) obj;
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = asb.a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.b;
        if (i == 0) {
            int i2 = r1;
            for (byte b : this.a) {
                i2 = (i2 * 31) + b;
            }
            i = i2 == 0 ? 1 : i2;
            this.b = i;
        }
        return i;
    }
}
