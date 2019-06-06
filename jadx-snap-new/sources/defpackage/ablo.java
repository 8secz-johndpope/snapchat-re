package defpackage;

/* renamed from: ablo */
public abstract class ablo<T> extends abkx<T> {
    public final boolean a(byte[] bArr, int i) {
        this.c = bArr;
        this.b = 0;
        while (this.b < i) {
            int i2;
            byte b = this.c[this.b];
            if (b != (byte) 0) {
                if (b == (byte) 10 || b == (byte) 13) {
                    c();
                    return false;
                } else if (b != (byte) 32) {
                    if (this.a < 0) {
                        i2 = this.b;
                        this.a = i2;
                        this.b++;
                    } else {
                        this.b++;
                    }
                }
            }
            if (!c()) {
                return false;
            }
            i2 = -1;
            this.a = i2;
            this.b++;
        }
        return false;
    }
}
