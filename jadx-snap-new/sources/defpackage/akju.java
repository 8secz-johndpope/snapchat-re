package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: akju */
public class akju {
    public static final akju a;
    private static final Logger b = Logger.getLogger(akhq.class.getName());

    static {
        akju a = akjq.a();
        if (a == null) {
            a = akjr.a();
            if (a == null) {
                a = akjs.a();
                if (a == null) {
                    a = new akju();
                }
            }
        }
        a = a;
    }

    public static List<String> a(List<akhr> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            akhr akhr = (akhr) list.get(i);
            if (akhr != akhr.HTTP_1_0) {
                arrayList.add(akhr.toString());
            }
        }
        return arrayList;
    }

    public akjx a(X509TrustManager x509TrustManager) {
        return new akjv(b(x509TrustManager));
    }

    public Object a(String str) {
        return b.isLoggable(Level.FINE) ? new Throwable(str) : null;
    }

    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = stringBuilder.toString();
        }
        a(5, str, (Throwable) obj);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void a(SSLSocket sSLSocket, String str, List<akhr> list) {
    }

    public akka b(X509TrustManager x509TrustManager) {
        return new akjw(x509TrustManager.getAcceptedIssuers());
    }

    public void b(SSLSocket sSLSocket) {
    }

    public boolean b(String str) {
        return true;
    }
}
