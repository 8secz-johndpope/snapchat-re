package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: akha */
public final class akha {
    static final Comparator<String> a = new 1();
    public static final akha b = akha.a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final akha c = akha.a("TLS_RSA_WITH_AES_128_CBC_SHA");
    public static final akha d = akha.a("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final akha e = akha.a("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final akha f = akha.a("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final akha g = akha.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    public static final akha h = akha.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    public static final akha i = akha.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final akha j = akha.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final akha k = akha.a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final akha l = akha.a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final akha m = akha.a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final akha n = akha.a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final akha o = akha.a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final akha p = akha.a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    private static final Map<String, akha> r = new TreeMap(a);
    final String q;

    /* renamed from: akha$1 */
    class 1 implements Comparator<String> {
        1() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (i < min) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    return charAt < charAt2 ? -1 : 1;
                } else {
                    i++;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            return length != length2 ? length < length2 ? -1 : 1 : 0;
        }
    }

    static {
        akha.a("SSL_RSA_WITH_NULL_MD5");
        akha.a("SSL_RSA_WITH_NULL_SHA");
        akha.a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        akha.a("SSL_RSA_WITH_RC4_128_MD5");
        akha.a("SSL_RSA_WITH_RC4_128_SHA");
        akha.a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        akha.a("SSL_RSA_WITH_DES_CBC_SHA");
        akha.a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        akha.a("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        akha.a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        akha.a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        akha.a("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        akha.a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        akha.a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        akha.a("SSL_DH_anon_WITH_RC4_128_MD5");
        akha.a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        akha.a("SSL_DH_anon_WITH_DES_CBC_SHA");
        akha.a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        akha.a("TLS_KRB5_WITH_DES_CBC_SHA");
        akha.a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        akha.a("TLS_KRB5_WITH_RC4_128_SHA");
        akha.a("TLS_KRB5_WITH_DES_CBC_MD5");
        akha.a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        akha.a("TLS_KRB5_WITH_RC4_128_MD5");
        akha.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        akha.a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        akha.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        akha.a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        akha.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        akha.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        akha.a("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        akha.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        akha.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        akha.a("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        akha.a("TLS_RSA_WITH_NULL_SHA256");
        akha.a("TLS_RSA_WITH_AES_128_CBC_SHA256");
        akha.a("TLS_RSA_WITH_AES_256_CBC_SHA256");
        akha.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        akha.a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        akha.a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        akha.a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        akha.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        akha.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        akha.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        akha.a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        akha.a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        akha.a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        akha.a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        akha.a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        akha.a("TLS_PSK_WITH_RC4_128_SHA");
        akha.a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        akha.a("TLS_PSK_WITH_AES_128_CBC_SHA");
        akha.a("TLS_PSK_WITH_AES_256_CBC_SHA");
        akha.a("TLS_RSA_WITH_SEED_CBC_SHA");
        akha.a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        akha.a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        akha.a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        akha.a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        akha.a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        akha.a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        akha.a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        akha.a("TLS_FALLBACK_SCSV");
        akha.a("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        akha.a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        akha.a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        akha.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        akha.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        akha.a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        akha.a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        akha.a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        akha.a("TLS_ECDH_RSA_WITH_NULL_SHA");
        akha.a("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        akha.a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        akha.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        akha.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        akha.a("TLS_ECDHE_RSA_WITH_NULL_SHA");
        akha.a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        akha.a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        akha.a("TLS_ECDH_anon_WITH_NULL_SHA");
        akha.a("TLS_ECDH_anon_WITH_RC4_128_SHA");
        akha.a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        akha.a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        akha.a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        akha.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        akha.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        akha.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        akha.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        akha.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        akha.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        akha.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        akha.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        akha.a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        akha.a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        akha.a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        akha.a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        akha.a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        akha.a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    }

    private akha(String str) {
        if (str != null) {
            this.q = str;
            return;
        }
        throw new NullPointerException();
    }

    public static synchronized akha a(String str) {
        akha akha;
        synchronized (akha.class) {
            akha = (akha) r.get(str);
            if (akha == null) {
                akha = new akha(str);
                r.put(str, akha);
            }
        }
        return akha;
    }

    public final String toString() {
        return this.q;
    }
}
