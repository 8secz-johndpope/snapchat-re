package defpackage;

import com.brightcove.player.event.Event;
import com.looksery.sdk.exception.LookserySdkException;

/* renamed from: mmx */
public final class mmx {
    static {
        mmx mmx = new mmx();
    }

    private mmx() {
    }

    public static ajxm<String, String> a(String str, String str2) {
        Object str3;
        Object str22;
        akcr.b(str3, "currentId");
        akcr.b(str22, "upcomingId");
        Object obj = "<null>";
        if (akcr.a((Object) str3, obj)) {
            str3 = null;
        }
        if (akcr.a((Object) str22, obj)) {
            str22 = null;
        }
        if (str3 == null && str22 == null) {
            str3 = Event.ORIGINAL_EVENT;
        }
        return ajxs.a(str3, str22);
    }

    static mmv a(LookserySdkException lookserySdkException) {
        Object lensId = lookserySdkException.getLensId();
        akcr.a(lensId, "exception.lensId");
        Object upcomingLensId = lookserySdkException.getUpcomingLensId();
        akcr.a(upcomingLensId, "exception.upcomingLensId");
        ajxm a = mmx.a(lensId, upcomingLensId);
        Object exceptionName = lookserySdkException.getExceptionName();
        akcr.a(exceptionName, "exception.exceptionName");
        Object exceptionReason = lookserySdkException.getExceptionReason();
        akcr.a(exceptionReason, "exception.exceptionReason");
        return new mmv(exceptionName, exceptionReason, (String) a.a, (String) a.b);
    }
}
