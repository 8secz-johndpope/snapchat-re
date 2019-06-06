package defpackage;

import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: adqi */
public final class adqi {
    final SSLContext a;

    public adqi(whi whi) {
        SSLContext instance;
        try {
            KeyStore a = whi.a();
            instance = SSLContext.getInstance("TLS");
            try {
                instance.init(null, new TrustManager[]{new adqj(a)}, new SecureRandom());
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            instance = null;
        }
        this.a = instance;
    }
}
