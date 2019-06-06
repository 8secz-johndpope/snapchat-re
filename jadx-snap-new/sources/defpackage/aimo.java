package defpackage;

/* renamed from: aimo */
public enum aimo {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String protocol;

    private aimo(String str) {
        this.protocol = str;
    }

    public final String toString() {
        return this.protocol;
    }
}
