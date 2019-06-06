package defpackage;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: akhk */
public final class akhk {
    public final akha a;
    public final List<Certificate> b;
    private final akhy c;
    private final List<Certificate> d;

    private akhk(akhy akhy, akha akha, List<Certificate> list, List<Certificate> list2) {
        this.c = akhy;
        this.a = akha;
        this.b = list;
        this.d = list2;
    }

    public static akhk a(SSLSession sSLSession) {
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            akha a = akha.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                Object[] peerCertificates;
                akhy a2 = akhy.a(protocol);
                try {
                    peerCertificates = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    peerCertificates = null;
                }
                List a3 = peerCertificates != null ? akib.a(peerCertificates) : Collections.emptyList();
                Object[] localCertificates = sSLSession.getLocalCertificates();
                return new akhk(a2, a, a3, localCertificates != null ? akib.a(localCertificates) : Collections.emptyList());
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akhk)) {
            return false;
        }
        akhk akhk = (akhk) obj;
        return this.c.equals(akhk.c) && this.a.equals(akhk.a) && this.b.equals(akhk.b) && this.d.equals(akhk.d);
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() + 527) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode();
    }
}
