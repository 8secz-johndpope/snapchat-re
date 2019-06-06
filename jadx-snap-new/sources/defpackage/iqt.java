package defpackage;

/* renamed from: iqt */
public enum iqt {
    FRIENDS_FEED(abbd.FEED),
    DISCOVER_FEED(abbd.DISCOVER),
    SEARCH(abbd.SEARCH_CONTACT),
    PROFILE(abbd.MINI_PROFILE),
    SNAPCODE(abbd.SNAPCODE),
    REGISTRATION(abbd.SEARCH_NEW_FRIENDS),
    CAMERA(abbd.CAMERA),
    CONTEXT_CARDS(abbd.CONTEXT_CARDS);
    
    private final abbd sourceType;

    private iqt(abbd abbd) {
        akcr.b(abbd, "sourceType");
        this.sourceType = abbd;
    }
}
