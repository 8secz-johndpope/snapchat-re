package defpackage;

import android.util.Base64;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.BaseEncoding;
import com.snap.framework.developer.BuildConfigInfo;
import defpackage.akhn.a;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: wih */
public final class wih extends saa implements akhn {
    private static long d = System.currentTimeMillis();
    private final ReentrantLock a = new ReentrantLock();
    private String b;
    private final BuildConfigInfo c;

    public wih(BuildConfigInfo buildConfigInfo) {
        this.c = buildConfigInfo;
    }

    private static String a(byte[] bArr, byte[] bArr2) {
        String encode = BaseEncoding.base32Hex().encode(bArr);
        String encode2 = BaseEncoding.base32Hex().encode(bArr2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(encode);
        stringBuilder.append("|");
        stringBuilder.append(encode2);
        return stringBuilder.toString();
    }

    private Map<String, String> a() {
        if (!this.c.INTERNAL_BUILD) {
            return Collections.emptyMap();
        }
        d();
        return ImmutableMap.of("X-Snapchat-Dev-Auth-Token", this.b);
    }

    private static byte[] b() {
        return Long.toString(d).getBytes(Charsets.UTF_8);
    }

    private PrivateKey c() {
        try {
            return KeyFactory.getInstance("RSA", "BC").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(this.c.DEV_AUTH_PRIVATE_KEY, 0)));
        } catch (NoSuchAlgorithmException | NoSuchProviderException | InvalidKeySpecException unused) {
            return null;
        }
    }

    private void d() {
        this.a.lock();
        try {
            if (this.b == null) {
                PrivateKey c = c();
                Signature instance = Signature.getInstance("SHA256withRSA");
                instance.initSign(c);
                byte[] b = wih.b();
                instance.update(b);
                this.b = wih.a(b, instance.sign());
            }
            this.a.unlock();
        } catch (Throwable th) {
            this.a.unlock();
        }
    }

    public final void a(sak sak, sab sab) {
        try {
            sab.a(sbi.a(sak, a()));
        } catch (RuntimeException | InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            sab.a(e);
        }
    }

    public final akhv intercept(a aVar) {
        akht a = aVar.a();
        if (this.c.INTERNAL_BUILD) {
            try {
                a = gmk.a(a.d(), a()).a();
            } catch (RuntimeException | InvalidKeyException | NoSuchAlgorithmException | SignatureException unused) {
            }
        }
        return aVar.a(a);
    }
}
