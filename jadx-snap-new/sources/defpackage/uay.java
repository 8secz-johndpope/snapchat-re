package defpackage;

/* renamed from: uay */
public final class uay {
    public static final uaj a(uav uav, aeew aeew, ftl ftl) {
        akcr.b(uav, "tooltipRepository");
        akcr.b(ftl, "configurationProvider");
        Object obj = ftl.f((fth) jic.NUM_SNAPS_SENT) == 0 ? 1 : null;
        if (!uav.a(uaj.NEW_USER) && obj != null) {
            return uaj.NEW_USER;
        }
        if (!uav.a(uaj.SWIPE_FILTER) && obj != null) {
            return uaj.SWIPE_FILTER;
        }
        if (!uav.a(uaj.FACE_CUT)) {
            return uaj.FACE_CUT;
        }
        String str = "this.mediaType";
        if (aeew != null) {
            Object obj2 = aeew.a;
            akcr.a(obj2, str);
            if (!(abyp.i(obj2.intValue()) || uav.a(uaj.ANIMATED_STICKER))) {
                return uaj.ANIMATED_STICKER;
            }
        }
        if (aeew != null) {
            Object obj3 = aeew.a;
            akcr.a(obj3, str);
            if (!(abyp.i(obj3.intValue()) || uav.a(uaj.GIPHY_STICKER))) {
                return uaj.GIPHY_STICKER;
            }
        }
        return uaj.UNDEFINED;
    }
}
