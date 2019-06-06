package defpackage;

/* renamed from: ajad */
public enum ajad {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String javaName;

    private ajad(String str) {
        this.javaName = str;
    }
}
