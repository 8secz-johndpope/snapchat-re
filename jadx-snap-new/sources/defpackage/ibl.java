package defpackage;

import android.text.TextUtils;
import defpackage.abnf.a;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;

/* renamed from: ibl */
public final class ibl implements hyz {
    private ick a;
    private final ajwy<hyk> b;
    private final ian c;

    public ibl(ajwy<hyk> ajwy, ian ian) {
        this.b = ajwy;
        this.c = ian;
    }

    public final synchronized ick a(String str) {
        if (this.a != null) {
            return this.a;
        }
        ((hyk) this.b.get()).d(str);
        byte[] bArr = new byte[32];
        a.a.nextBytes(bArr);
        KeyPair keyPair = null;
        try {
            ian ian = this.c;
            hyr a = ian.b.a(hyt.SEC_EC_GENERATE_KEY_PAIR_LATENCY).a();
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC");
            instance.initialize(new ECGenParameterSpec("secp256r1"), ian.a);
            KeyPair generateKeyPair = instance.generateKeyPair();
            ((hyk) ian.c.get()).c(a);
            keyPair = generateKeyPair;
        } catch (GeneralSecurityException unused) {
        }
        if (keyPair != null) {
            try {
                this.a = a(bArr, keyPair.getPublic().getEncoded(), keyPair.getPrivate().getEncoded());
            } catch (IllegalArgumentException e) {
                ((hyk) this.b.get()).a("init_temp_info_exc", abmt.a(e));
            }
        } else {
            ((hyk) this.b.get()).a("init_temp_info_null_beta_group");
        }
        return this.a;
    }

    public final ick a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String a = abne.a(bArr);
        if (TextUtils.isEmpty(a)) {
            throw new IllegalArgumentException("null_iwek_str");
        }
        String a2 = abne.a(bArr2);
        if (TextUtils.isEmpty(a2)) {
            throw new IllegalArgumentException("null_out_beta_str");
        }
        try {
            String a3 = abne.a(this.c.b(bArr, bArr2));
            if (!TextUtils.isEmpty(a3)) {
                return new ick(bArr, a, bArr2, a2, bArr3, a3);
            }
            throw new IllegalArgumentException("null_beta_hash");
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("hmac_exc", e);
        }
    }

    public final synchronized void a() {
        this.a = null;
    }
}
