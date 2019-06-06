package defpackage;

/* renamed from: ecv */
public final class ecv {

    /* renamed from: ecv$a */
    static class a implements dpn {
        private final adie a;

        a(adie adie) {
            this.a = adie;
        }

        public final adie a(abtl abtl, abtl abtl2) {
            return this.a;
        }
    }

    public static adie a(int i) {
        return new adie().a((float) (-i));
    }

    public static ecu a(ecw ecw, adie adie) {
        return ecv.a(ecw, new a(adie));
    }

    public static ecu a(ecw ecw, dpn dpn) {
        switch (ecw) {
            case MAIN:
                return new ecu(ecw, 1000000000, 1, true, dpn, false, false);
            case SCAN:
                return new ecu(ecw, 5, 1, false, dpn, false, false);
            case SCREENSHOT:
                return new ecu(ecw, 1, 1, false, dpn, false, false);
            case SCREENSHOT_PLUS:
                return new ecu(ecw, 1, 1, true, dpn, false, false);
            case VIDEO_CHAT_PREVIEW:
                return new ecu(ecw, 1000000000, 1, true, dpn, false, false);
            case ANDROID_VIDEO_RECORDER:
                return new ecu(ecw, 1000000000, 1, true, dpn, true, false);
            case SC_VIDEO_RECORDER:
                return new ecu(ecw, 1000000000, 2, true, dpn, true, true);
            case ANDROID_ORIGINAL_VIDEO_RECORDER:
                return new ecu(ecw, 1000000000, 1, false, dpn, true, false);
            default:
                throw new IllegalArgumentException("unknown template type");
        }
    }
}
