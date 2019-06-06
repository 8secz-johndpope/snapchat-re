package defpackage;

/* renamed from: ajac */
public enum ajac {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    GRPC_EXP("grpc-exp");
    
    public final String protocol;

    private ajac(String str) {
        this.protocol = str;
    }

    public final String toString() {
        return this.protocol;
    }
}
