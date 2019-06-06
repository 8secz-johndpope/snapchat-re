package defpackage;

/* renamed from: airi */
public enum airi {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    public static final String BETA_APP_PACKAGE_NAME = "io.crash.air";
    public final int id;

    private airi(int i) {
        this.id = i;
    }

    public static airi a(String str) {
        return BETA_APP_PACKAGE_NAME.equals(str) ? TEST_DISTRIBUTION : str != null ? APP_STORE : DEVELOPER;
    }

    public final String toString() {
        return Integer.toString(this.id);
    }
}
