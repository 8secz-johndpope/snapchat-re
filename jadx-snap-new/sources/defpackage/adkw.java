package defpackage;

/* renamed from: adkw */
public enum adkw {
    SETUP(adks.SETUP_BEGIN, adks.SETUP_FINISH),
    SETUP_TO_FIRST_FRAME(adks.SETUP_FINISH, adks.FIRST_FRAME_RENDERED),
    RENDERING(adks.STARTED, adks.STOPPED),
    RELEASE(adks.RELEASE_BEGIN, adks.RELEASE_FINISH);
    
    final adks endEvent;
    final adks startEvent;

    private adkw(adks adks, adks adks2) {
        akcr.b(adks, "startEvent");
        akcr.b(adks2, "endEvent");
        this.startEvent = adks;
        this.endEvent = adks2;
    }
}
