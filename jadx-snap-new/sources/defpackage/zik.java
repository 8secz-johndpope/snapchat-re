package defpackage;

/* renamed from: zik */
public enum zik {
    DISCOVER_FEED("DISCOVER/FEED"),
    DISCOVER_FEED_OPERA("DISCOVER/STREAM"),
    STORIES_FEED("STORY/FEED"),
    STORIES_FEATURED("STORY/FEATURED"),
    CAMERA("CAMERA/VIEW_FINDER"),
    CAMERA_LENSES("CAMERA/LENSES"),
    FEED("MESSAGING/FEED"),
    CHAT("MESSAGING/CHAT"),
    PROFILE(r2),
    SEARCH(r2),
    MAP(r2),
    ACTION_MENU("ACTION_MENU");
    
    public final String pageName;

    private zik(String str) {
        akcr.b(str, "pageName");
        this.pageName = str;
    }
}
