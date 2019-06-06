package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;

/* renamed from: abkl */
public class abkl {
    boolean a = true;
    byte[] b;
    private final String c = abkl.class.getSimpleName();

    public abkl(String str) {
        if (str == null) {
            this.a = false;
            return;
        }
        try {
            this.b = Base64.decode(str, 2);
        } catch (IllegalArgumentException unused) {
            this.a = false;
        }
    }

    private long c() {
        byte[] bArr = new byte[8];
        for (int i = 4; i < 8; i++) {
            bArr[i] = this.b[i - 4];
        }
        return ByteBuffer.wrap(bArr).getLong();
    }

    public final boolean a() {
        if (this.a) {
            byte[] bArr = this.b;
            if (bArr != null && bArr.length >= 8 && c() == 1) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: final */
    public final long b() {
        byte[] bArr = new byte[8];
        for (int i = 4; i < 8; i++) {
            bArr[i] = this.b[i];
        }
        return ByteBuffer.wrap(bArr).getLong();
    }
}
