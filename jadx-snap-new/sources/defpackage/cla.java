package defpackage;

/* renamed from: cla */
public enum cla {
    DEFAULT(null),
    STAGING("https://adserver.staging.snapads.com"),
    USC("https://usc.adserver.snapads.com"),
    USE("https://use.adserver.snapads.com"),
    EUW("https://euw.adserver.snapads.com"),
    ASE("https://ase.adserver.snapads.com");
    
    public final String url;

    private cla(String str) {
        this.url = str;
    }
}
