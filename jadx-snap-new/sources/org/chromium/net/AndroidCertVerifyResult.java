package org.chromium.net;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.base.annotations.CalledByNative;

public class AndroidCertVerifyResult {
    private final int a;
    private final boolean b;
    private final List<X509Certificate> c;

    public AndroidCertVerifyResult(int i) {
        this.a = i;
        this.b = false;
        this.c = Collections.emptyList();
    }

    public AndroidCertVerifyResult(boolean z, List<X509Certificate> list) {
        this.a = 0;
        this.b = z;
        this.c = new ArrayList(list);
    }

    @CalledByNative
    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.c.size()][];
        int i = 0;
        while (i < this.c.size()) {
            try {
                bArr[i] = ((X509Certificate) this.c.get(i)).getEncoded();
                i++;
            } catch (CertificateEncodingException unused) {
                return new byte[0][];
            }
        }
        return bArr;
    }

    @CalledByNative
    public int getStatus() {
        return this.a;
    }

    @CalledByNative
    public boolean isIssuedByKnownRoot() {
        return this.b;
    }
}
