package defpackage;

/* renamed from: kqk */
public final class kqk {
    public static final aapp a(String str) {
        akcr.b(str, "receiver$0");
        switch (str.hashCode()) {
            case -1103714116:
                if (str.equals("VIDEO_CHAT")) {
                    return aapp.VIDEOCHAT;
                }
                break;
            case -1023317544:
                if (str.equals("LIVE_CAMERA")) {
                    return aapp.CAMERA;
                }
                break;
            case -585402330:
                if (str.equals("AD_TO_LENS")) {
                    return aapp.AD_TO_LENS;
                }
                break;
            case 680837690:
                if (str.equals("REPLY_CAMERA")) {
                    return aapp.REPLY_CAMERA;
                }
                break;
        }
        return null;
    }
}
