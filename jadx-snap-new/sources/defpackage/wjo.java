package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: wjo */
public final class wjo extends Exception {
    public final wjc a;
    public final String b;

    /* renamed from: wjo$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static Throwable a() {
            return new wjo(wjc.LOGOUT_CANCEL, "User is logged out.");
        }
    }

    static {
        a aVar = new a();
    }

    public wjo(wjc wjc, String str) {
        akcr.b(wjc, Event.ERROR_CODE);
        akcr.b(str, "errorDetail");
        StringBuilder stringBuilder = new StringBuilder("Fail to fetch snap access token ");
        stringBuilder.append(wjc);
        stringBuilder.append(ppy.d);
        stringBuilder.append(str);
        super(stringBuilder.toString());
        this.a = wjc;
        this.b = str;
    }

    public wjo(wjc wjc, String str, Throwable th) {
        akcr.b(wjc, Event.ERROR_CODE);
        akcr.b(str, "errorDetail");
        akcr.b(th, "cause");
        this(wjc, str);
        initCause(th);
    }
}
