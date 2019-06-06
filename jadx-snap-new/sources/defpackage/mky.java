package defpackage;

import com.looksery.sdk.listener.CryptographyDelegate;
import java.security.SecureRandom;

/* renamed from: mky */
public final class mky implements CryptographyDelegate {
    private final akbk<SecureRandom> a;

    /* renamed from: mky$1 */
    static final class 1 extends akcs implements akbk<SecureRandom> {
        public static final 1 a = new 1();

        1() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object a = abnf.a();
            akcr.a(a, "SecureRandomProvider.get()");
            return a;
        }
    }

    public /* synthetic */ mky() {
        this(1.a);
    }

    private mky(akbk<? extends SecureRandom> akbk) {
        akcr.b(akbk, "secureRandomProvider");
        this.a = akbk;
    }

    public final byte[] generateSecureRandomBytes(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) this.a.invoke()).nextBytes(bArr);
        return bArr;
    }
}
