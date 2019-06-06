package defpackage;

import com.google.common.base.Preconditions;
import java.net.Socket;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* renamed from: aizp */
class aizp {
    static final Logger a = Logger.getLogger(aizp.class.getName());
    static aizp b = aizp.a(aizp.class.getClassLoader());
    private static final ajab d = ajab.b;
    protected final ajab c;

    /* renamed from: aizp$a */
    static final class a extends aizp {
        private static final ajaa<Socket> d = new ajaa(null, "setUseSessionTickets", Boolean.TYPE);
        private static final ajaa<Socket> e = new ajaa(null, "setHostname", String.class);
        private static final ajaa<Socket> f = new ajaa(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        private static final ajaa<Socket> g = new ajaa(null, "setAlpnProtocols", byte[].class);
        private static final ajaa<Socket> h = new ajaa(byte[].class, "getNpnSelectedProtocol", new Class[0]);
        private static final ajaa<Socket> i = new ajaa(null, "setNpnProtocols", byte[].class);

        a(ajab ajab) {
            super(ajab);
        }

        public final String a(SSLSocket sSLSocket) {
            if (this.c.a() == 1) {
                try {
                    byte[] bArr = (byte[]) f.b(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, ajae.b);
                    }
                } catch (Exception e) {
                    aizp.a.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", e);
                }
            }
            if (this.c.a() != 3) {
                try {
                    byte[] bArr2 = (byte[]) h.b(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, ajae.b);
                    }
                } catch (Exception e2) {
                    aizp.a.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", e2);
                }
            }
            return null;
        }

        public final String a(SSLSocket sSLSocket, String str, List<ajac> list) {
            String a = a(sSLSocket);
            return a == null ? super.a(sSLSocket, str, list) : a;
        }

        /* Access modifiers changed, original: protected|final */
        public final void b(SSLSocket sSLSocket, String str, List<ajac> list) {
            if (str != null) {
                d.a(sSLSocket, Boolean.TRUE);
                e.a(sSLSocket, str);
            }
            Object[] objArr = new Object[]{ajab.a((List) list)};
            if (this.c.a() == 1) {
                g.b(sSLSocket, objArr);
            }
            if (this.c.a() != 3) {
                i.b(sSLSocket, objArr);
                return;
            }
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
    }

    aizp(ajab ajab) {
        this.c = (ajab) Preconditions.checkNotNull(ajab, "platform");
    }

    private static aizp a(ClassLoader classLoader) {
        Object obj;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e) {
            a.log(Level.FINE, "Unable to find Conscrypt. Skipping", e);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e2) {
                a.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", e2);
                obj = null;
            }
        }
        obj = 1;
        return obj != null ? new a(d) : new aizp(d);
    }

    public String a(SSLSocket sSLSocket) {
        return this.c.b(sSLSocket);
    }

    public String a(SSLSocket sSLSocket, String str, List<ajac> list) {
        if (list != null) {
            b(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            str = a(sSLSocket);
            if (str != null) {
                return str;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: ".concat(String.valueOf(list)));
        } finally {
            this.c.a(sSLSocket);
        }
    }

    /* Access modifiers changed, original: protected */
    public void b(SSLSocket sSLSocket, String str, List<ajac> list) {
        this.c.a(sSLSocket, str, list);
    }
}
