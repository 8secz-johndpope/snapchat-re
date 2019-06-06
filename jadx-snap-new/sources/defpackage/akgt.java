package defpackage;

import com.brightcove.player.media.MediaService;
import defpackage.akhm.a;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: akgt */
public final class akgt {
    public final akhm a;
    public final akhh b;
    public final SocketFactory c;
    public final List<akhr> d;
    public final List<akhd> e;
    public final ProxySelector f;
    public final Proxy g;
    public final SSLSocketFactory h;
    public final HostnameVerifier i;
    public final akgz j;
    private akgu k;

    public akgt(String str, int i, akhh akhh, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, akgz akgz, akgu akgu, Proxy proxy, List<akhr> list, List<akhd> list2, ProxySelector proxySelector) {
        String str2 = str;
        int i2 = i;
        akhh akhh2 = akhh;
        SocketFactory socketFactory2 = socketFactory;
        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
        akgu akgu2 = akgu;
        ProxySelector proxySelector2 = proxySelector;
        a aVar = new a();
        String str3 = "https";
        String str4 = MediaService.DEFAULT_MEDIA_DELIVERY;
        String str5 = sSLSocketFactory2 != null ? str3 : str4;
        if (str5.equalsIgnoreCase(str4)) {
            aVar.a = str4;
        } else if (str5.equalsIgnoreCase(str3)) {
            aVar.a = str3;
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str5));
        }
        if (str2 != null) {
            str3 = a.a(str, 0, str.length());
            if (str3 != null) {
                aVar.d = str3;
                if (i2 <= 0 || i2 > 65535) {
                    throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
                }
                aVar.e = i2;
                this.a = aVar.b();
                if (akhh2 != null) {
                    this.b = akhh2;
                    if (socketFactory2 != null) {
                        this.c = socketFactory2;
                        if (akgu2 != null) {
                            this.k = akgu2;
                            if (list != null) {
                                this.d = akib.a((List) list);
                                if (list2 != null) {
                                    this.e = akib.a((List) list2);
                                    if (proxySelector2 != null) {
                                        this.f = proxySelector2;
                                        this.g = null;
                                        this.h = sSLSocketFactory2;
                                        this.i = hostnameVerifier;
                                        this.j = akgz;
                                        return;
                                    }
                                    throw new NullPointerException("proxySelector == null");
                                }
                                throw new NullPointerException("connectionSpecs == null");
                            }
                            throw new NullPointerException("protocols == null");
                        }
                        throw new NullPointerException("proxyAuthenticator == null");
                    }
                    throw new NullPointerException("socketFactory == null");
                }
                throw new NullPointerException("dns == null");
            }
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
        }
        throw new NullPointerException("host == null");
    }

    /* Access modifiers changed, original: final */
    public final boolean a(akgt akgt) {
        return this.b.equals(akgt.b) && this.k.equals(akgt.k) && this.d.equals(akgt.d) && this.e.equals(akgt.e) && this.f.equals(akgt.f) && akib.a(this.g, akgt.g) && akib.a(this.h, akgt.h) && akib.a(this.i, akgt.i) && akib.a(this.j, akgt.j) && this.a.c == akgt.a.c;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof akgt) {
            akgt akgt = (akgt) obj;
            if (this.a.equals(akgt.a) && a(akgt)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.k.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        Proxy proxy = this.g;
        int i = 0;
        hashCode = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.h;
        hashCode = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.i;
        hashCode = (hashCode + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        akgz akgz = this.j;
        if (akgz != null) {
            i = akgz.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        Object obj;
        StringBuilder stringBuilder = new StringBuilder("Address{");
        stringBuilder.append(this.a.b);
        stringBuilder.append(":");
        stringBuilder.append(this.a.c);
        if (this.g != null) {
            stringBuilder.append(", proxy=");
            obj = this.g;
        } else {
            stringBuilder.append(", proxySelector=");
            obj = this.f;
        }
        stringBuilder.append(obj);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
