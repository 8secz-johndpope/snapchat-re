package defpackage;

import com.google.common.primitives.Bytes;
import defpackage.abnf.a;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* renamed from: abnh */
public final class abnh {
    private final SecureRandom a = a.a;

    public static byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        akvt akvt = new akvt(new akvn());
        akvt.a(false, new akvz(new akwb(bArr), bArr2));
        bArr = new byte[akvt.a(bArr3.length)];
        try {
            akvt.a(bArr, akvt.a(bArr3, bArr3.length, bArr));
            return bArr;
        } catch (akvf e) {
            throw new GeneralSecurityException(e);
        }
    }

    private static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        akvt akvt = new akvt(new akvn());
        akvt.a(true, new akvz(new akwb(bArr), bArr2));
        bArr = new byte[akvt.a(bArr3.length)];
        try {
            akvt.a(bArr, akvt.a(bArr3, bArr3.length, bArr));
            return bArr;
        } catch (akvf e) {
            throw new GeneralSecurityException(e);
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[12];
        this.a.nextBytes(bArr3);
        bArr = abnh.b(bArr, bArr3, bArr2);
        return Bytes.concat(bArr3, bArr);
    }
}
