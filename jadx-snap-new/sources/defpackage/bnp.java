package defpackage;

import defpackage.brf.a;
import java.io.EOFException;

/* renamed from: bnp */
public final class bnp {
    private final bzc a = new bzc(10);

    public final bqp a(bnl bnl, a aVar) {
        bqp bqp = null;
        int i = 0;
        while (true) {
            try {
                bnl.c(this.a.a, 0, 10);
                this.a.c(0);
                if (this.a.g() != brf.a) {
                    break;
                }
                this.a.d(3);
                int n = this.a.n();
                int i2 = n + 10;
                if (bqp == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    bnl.c(bArr, 10, n);
                    bqp = new brf(aVar).a(bArr, i2);
                } else {
                    bnl.c(n);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        bnl.a();
        bnl.c(i);
        return bqp;
    }
}
