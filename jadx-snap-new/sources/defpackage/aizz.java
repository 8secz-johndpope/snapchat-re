package defpackage;

import com.brightcove.player.event.EventType;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: aizz */
public final class aizz implements HostnameVerifier {
    public static final aizz a = new aizz();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private aizz() {
    }

    private static List<String> a(X509Certificate x509Certificate, int i) {
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

    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            int i;
            if (b.matcher(str).matches()) {
                List a = aizz.a(x509Certificate, 7);
                int size = a.size();
                for (i = 0; i < size; i++) {
                    if (str.equalsIgnoreCase((String) a.get(i))) {
                        return true;
                    }
                }
                return false;
            }
            str = str.toLowerCase(Locale.US);
            List a2 = aizz.a(x509Certificate, 2);
            i = a2.size();
            int i2 = 0;
            Object obj = null;
            while (i2 < i) {
                if (aizz.a(str, (String) a2.get(i2))) {
                    return true;
                }
                i2++;
                obj = 1;
            }
            if (obj == null) {
                aizy aizy = new aizy(x509Certificate.getSubjectX500Principal());
                String str2 = "cn";
                aizy.c = 0;
                aizy.d = 0;
                aizy.e = 0;
                aizy.f = 0;
                aizy.g = aizy.a.toCharArray();
                String a3 = aizy.a();
                String str3 = null;
                if (a3 != null) {
                    while (true) {
                        String str4 = "";
                        if (aizy.c == aizy.b) {
                            break;
                        }
                        StringBuilder stringBuilder;
                        char c = aizy.g[aizy.c];
                        if (c == '\"') {
                            aizy.c++;
                            aizy.d = aizy.c;
                            aizy.e = aizy.d;
                            while (aizy.c != aizy.b) {
                                if (aizy.g[aizy.c] == '\"') {
                                    while (true) {
                                        aizy.c++;
                                        if (aizy.c >= aizy.b || aizy.g[aizy.c] != ' ') {
                                            str4 = new String(aizy.g, aizy.d, aizy.e - aizy.d);
                                        }
                                    }
                                    str4 = new String(aizy.g, aizy.d, aizy.e - aizy.d);
                                } else {
                                    if (aizy.g[aizy.c] == '\\') {
                                        aizy.g[aizy.e] = aizy.d();
                                    } else {
                                        aizy.g[aizy.e] = aizy.g[aizy.c];
                                    }
                                    aizy.c++;
                                    aizy.e++;
                                }
                            }
                            stringBuilder = new StringBuilder("Unexpected end of DN: ");
                            stringBuilder.append(aizy.a);
                            throw new IllegalStateException(stringBuilder.toString());
                        } else if (c == '#') {
                            str4 = aizy.b();
                        } else if (!(c == '+' || c == ',' || c == ';')) {
                            str4 = aizy.c();
                        }
                        if (str2.equalsIgnoreCase(a3)) {
                            str3 = str4;
                            break;
                        } else if (aizy.c >= aizy.b) {
                            break;
                        } else {
                            str4 = "Malformed DN: ";
                            if (aizy.g[aizy.c] != ',') {
                                if (aizy.g[aizy.c] != ';') {
                                    if (aizy.g[aizy.c] != '+') {
                                        stringBuilder = new StringBuilder(str4);
                                        stringBuilder.append(aizy.a);
                                        throw new IllegalStateException(stringBuilder.toString());
                                    }
                                }
                            }
                            aizy.c++;
                            a3 = aizy.a();
                            if (a3 == null) {
                                stringBuilder = new StringBuilder(str4);
                                stringBuilder.append(aizy.a);
                                throw new IllegalStateException(stringBuilder.toString());
                            }
                        }
                    }
                }
                if (str3 != null) {
                    return aizz.a(str, str3);
                }
            }
            return false;
        } catch (SSLException unused) {
        }
    }
}
