package defpackage;

/* renamed from: aimr */
public enum aimr {
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    final String javaName;

    private aimr(String str) {
        this.javaName = str;
    }
}
