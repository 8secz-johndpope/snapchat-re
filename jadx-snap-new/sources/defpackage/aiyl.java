package defpackage;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.net.Authenticator;
import java.net.Authenticator.RequestorType;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aiyl */
class aiyl implements aiyk {
    static final Logger a = Logger.getLogger(aiyl.class.getName());
    private static final a b = new 1();
    private static final Supplier<ProxySelector> c = new 2();
    private final Supplier<ProxySelector> d;
    private final a e;
    private final aiym f;

    /* renamed from: aiyl$1 */
    class 1 implements a {
        1() {
        }

        public final PasswordAuthentication a(String str, InetAddress inetAddress, int i, String str2, String str3) {
            URL url;
            try {
                url = new URL(str2, str, i, "");
            } catch (MalformedURLException unused) {
                aiyl.a.log(Level.WARNING, String.format("failed to create URL for Authenticator: %s %s", new Object[]{str2, str}));
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i, str2, str3, null, url, RequestorType.PROXY);
        }
    }

    /* renamed from: aiyl$2 */
    class 2 implements Supplier<ProxySelector> {
        2() {
        }

        public final /* synthetic */ Object get() {
            return ProxySelector.getDefault();
        }
    }

    /* renamed from: aiyl$a */
    interface a {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i, String str2, String str3);
    }

    public aiyl() {
        this(c, b, System.getenv("GRPC_PROXY_EXP"));
    }

    private aiyl(Supplier<ProxySelector> supplier, a aVar, String str) {
        this.d = (Supplier) Preconditions.checkNotNull(supplier);
        this.e = (a) Preconditions.checkNotNull(aVar);
        if (str != null) {
            InetSocketAddress inetSocketAddress;
            if (str == null) {
                inetSocketAddress = null;
            } else {
                String[] split = str.split(":", 2);
                int i = 80;
                if (split.length > 1) {
                    i = Integer.parseInt(split[1]);
                }
                a.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
                inetSocketAddress = new InetSocketAddress(split[0], i);
            }
            this.f = new aiym(inetSocketAddress, null, null);
            return;
        }
        this.f = null;
    }

    private aiym a(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, aixo.a(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = (ProxySelector) this.d.get();
                if (proxySelector == null) {
                    a.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List select = proxySelector.select(uri);
                if (select.size() > 1) {
                    a.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = (Proxy) select.get(0);
                if (proxy.type() == Type.DIRECT) {
                    return null;
                }
                inetSocketAddress = (InetSocketAddress) proxy.address();
                PasswordAuthentication a = this.e.a(aixo.a(inetSocketAddress), inetSocketAddress.getAddress(), inetSocketAddress.getPort(), "https", "");
                if (inetSocketAddress.isUnresolved()) {
                    inetSocketAddress = new InetSocketAddress(InetAddress.getByName(inetSocketAddress.getHostName()), inetSocketAddress.getPort());
                }
                return a == null ? new aiym(inetSocketAddress, null, null) : new aiym(inetSocketAddress, a.getUserName(), new String(a.getPassword()));
            } catch (URISyntaxException e) {
                a.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", e);
                return null;
            }
        } catch (Throwable th) {
            a.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th);
            return null;
        }
    }

    public final aiym a(SocketAddress socketAddress) {
        aiym aiym = this.f;
        return aiym != null ? aiym : !(socketAddress instanceof InetSocketAddress) ? null : a((InetSocketAddress) socketAddress);
    }
}
