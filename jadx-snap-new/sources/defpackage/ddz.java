package defpackage;

/* renamed from: ddz */
public enum ddz {
    PRODUCTION("https://images.bitmoji.com/web-builder/"),
    STAGING("http://dcgro32pny54o.cloudfront.net/web-builder/");
    
    public final String urlString;

    private ddz(String str) {
        akcr.b(str, "urlString");
        this.urlString = str;
    }
}
