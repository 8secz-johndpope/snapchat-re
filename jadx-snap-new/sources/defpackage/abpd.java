package defpackage;

/* renamed from: abpd */
public enum abpd {
    ALL_S2R_PAGE_VIEW_EVENT("Page Event: "),
    SERVER_CONFIGS("Server Configs: "),
    TOOLS_SETTINGS_AB_TEST("AB Test config: "),
    TOOLS_S2R_SHAKE_COUNT("Shake Count: "),
    TOOLS_S2R_ACTIVATED_WITH_THRESHOLD_AND_SENSITIVITY("Activated shake2report with threshold and sensitivity: "),
    TOOLS_S2R_WARNING_SHAKE_TOO_FAST("WARNING: Shaking too quickly, user may have a broken gyro. "),
    SPECTACLES_EVENT("Spectacles: ");
    
    public final String mMessage;

    private abpd(String str) {
        this.mMessage = str;
    }
}
