package defpackage;

/* renamed from: zpx */
public enum zpx {
    PROD("https://gtq.sct.sc-prod.net"),
    SHADOW("https://shadow-dot-gtq.sct.sc-prod.net"),
    DEV("https://gtq.sct.snap-dev.net"),
    TEST("https://gtq-test.sct.snap-dev.net"),
    LOAD_TEST("https://gtq-loadtest.sct.snap-dev.net");
    
    public final String hostUrl;

    private zpx(String str) {
        akcr.b(str, "hostUrl");
        this.hostUrl = str;
    }
}
