package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

/* renamed from: akhx */
public final class akhx {
    public final akgt a;
    public final Proxy b;
    public final InetSocketAddress c;

    public akhx(akgt akgt, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (akgt == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.a = akgt;
            this.b = proxy;
            this.c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean a() {
        return this.a.h != null && this.b.type() == Type.HTTP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akhx) {
            akhx akhx = (akhx) obj;
            if (akhx.a.equals(this.a) && akhx.b.equals(this.b) && akhx.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Route{");
        stringBuilder.append(this.c);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
