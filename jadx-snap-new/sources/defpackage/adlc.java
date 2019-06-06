package defpackage;

/* renamed from: adlc */
public interface adlc {

    /* renamed from: adlc$a */
    public static final class a {
        public static Long a(adlg adlg, b bVar) {
            akcr.b(adlg, "playbackSessionRecord");
            akcr.b(bVar, "playbackSection");
            Long l = (Long) adlg.d.get(bVar.startEvent);
            Long l2 = (Long) adlg.d.get(bVar.endEvent);
            return (l == null || l2 == null) ? null : Long.valueOf(l2.longValue() - l.longValue());
        }

        public static boolean a(adlg adlg) {
            akcr.b(adlg, "playbackSessionRecord");
            return adlg.f == null;
        }
    }

    /* renamed from: adlc$b */
    public enum b {
        GL_CONTEXT_SETUP_DELAY(adlh.PLAYER_BEGIN_SETUP, adlh.GL_CONTEXT_FINISH_SETUP),
        VIDEO_COMPONENT_SETUP_DELAY(adlh.VIDEO_COMPONENT_BEGIN_SETUP, adlh.VIDEO_COMPONENT_FINISH_SETUP),
        AUDIO_COMPONENT_SETUP_DELAY(adlh.AUDIO_COMPONENT_BEGIN_SETUP, adlh.AUDIO_COMPONENT_FINISH_SETUP),
        PLAYER_SETUP_DELAY(adlh.PLAYER_BEGIN_SETUP, adlh.PLAYER_FINISH_SETUP),
        PLAYER_SETUP_TO_FIRST_FRAME_DELAY(adlh.PLAYER_BEGIN_SETUP, adlh.PLAYER_FIRST_FRAME),
        PLAYER_RESTART_DELAY(adlh.PLAYER_BEGIN_RESTART, adlh.PLAYER_FINISH_RESTART);
        
        final adlh endEvent;
        final adlh startEvent;

        private b(adlh adlh, adlh adlh2) {
            akcr.b(adlh, "startEvent");
            akcr.b(adlh2, "endEvent");
            this.startEvent = adlh;
            this.endEvent = adlh2;
        }
    }

    void a(adkz adkz);

    void a(adlg adlg, adlh adlh);
}
