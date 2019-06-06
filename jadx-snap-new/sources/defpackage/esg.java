package defpackage;

/* renamed from: esg */
public enum esg {
    PROD("https://us-central1-gcp.api.snapchat.com/charms/"),
    STAGGING("https://us-central1-gcp.api.snapchat.com/charms-staging/"),
    DEV("https://us-central1-gcp-api.sc-gw-dev.snapchat.com/charms/");
    
    public final String endpoint;

    private esg(String str) {
        akcr.b(str, "endpoint");
        this.endpoint = str;
    }
}
