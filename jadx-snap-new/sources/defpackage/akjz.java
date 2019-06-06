package defpackage;

import com.brightcove.player.event.EventType;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: akjz */
public final class akjz implements HostnameVerifier {
    public static final akjz a = new akjz();

    private akjz() {
    }

    public static List<String> a(X509Certificate x509Certificate, int i) {
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2) {
                    Integer num = (Integer) list.get(0);
                    if (num != null && num.intValue() == i) {
                        String str = (String) list.get(1);
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private static boolean a(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            String str3 = ".";
            if (!str.startsWith(str3)) {
                String str4 = "..";
                if (!(str.endsWith(str4) || str2 == null || str2.length() == 0 || str2.startsWith(str3) || str2.endsWith(str4))) {
                    if (!str.endsWith(str3)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append('.');
                        str = stringBuilder.toString();
                    }
                    if (!str2.endsWith(str3)) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(str2);
                        stringBuilder2.append('.');
                        str2 = stringBuilder2.toString();
                    }
                    str2 = str2.toLowerCase(Locale.US);
                    if (!str2.contains(EventType.ANY)) {
                        return str.equals(str2);
                    }
                    str3 = "*.";
                    if (!str2.startsWith(str3) || str2.indexOf(42, 1) != -1 || str.length() < str2.length() || str3.equals(str2)) {
                        return false;
                    }
                    str2 = str2.substring(1);
                    if (!str.endsWith(str2)) {
                        return false;
                    }
                    int length = str.length() - str2.length();
                    return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
                }
            }
        }
        return false;
    }

    public static boolean a(String str, X509Certificate x509Certificate) {
        return akib.d(str) ? akjz.b(str, x509Certificate) : akjz.c(str, x509Certificate);
    }

    private static boolean b(String str, X509Certificate x509Certificate) {
        List a = akjz.a(x509Certificate, 7);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase((String) a.get(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(String str, X509Certificate x509Certificate) {
        str = str.toLowerCase(Locale.US);
        List a = akjz.a(x509Certificate, 2);
        int size = a.size();
        int i = 0;
        Object obj = null;
        while (i < size) {
            if (akjz.a(str, (String) a.get(i))) {
                return true;
            }
            i++;
            obj = 1;
        }
        if (obj == null) {
            String a2 = new akjy(x509Certificate.getSubjectX500Principal()).a("cn");
            if (a2 != null) {
                return akjz.a(str, a2);
            }
        }
        return false;
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return akjz.a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
