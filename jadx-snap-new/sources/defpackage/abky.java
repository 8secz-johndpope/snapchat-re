package defpackage;

/* renamed from: abky */
public abstract class abky<T> extends abkx<T> {
    public final boolean a(byte[] bArr, int i) {
        this.c = bArr;
        this.b = 0;
        while (this.b < i) {
            int i2;
            byte b = this.c[this.b];
            if (b == (byte) 0 || b == (byte) 10 || b == (byte) 13 || b == (byte) 32) {
                if (!c()) {
                    return false;
                }
                i2 = -1;
            } else if (this.a < 0) {
                i2 = this.b;
            } else {
                this.b++;
            }
            this.a = i2;
            this.b++;
        }
        return false;
    }
}
