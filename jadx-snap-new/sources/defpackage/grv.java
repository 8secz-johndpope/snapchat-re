package defpackage;

import android.os.Build.VERSION;
import defpackage.gqi.a;
import org.opencv.imgproc.Imgproc;

/* renamed from: grv */
public final class grv implements gqj {
    private final ajwy<grt> a;
    private final ajwy<ifb> b;

    public grv(ajwy<grt> ajwy, ajwy<ifb> ajwy2) {
        akcr.b(ajwy, "crashAnalyticsHelper");
        akcr.b(ajwy2, "userAgent");
        this.a = ajwy;
        this.b = ajwy2;
    }

    public final void a(gqi gqi) {
        akcr.b(gqi, "anrException");
        String message = gqi.getMessage();
        if (message != null && message.length() > Imgproc.INTER_TAB_SIZE2) {
            message = message.substring(0, Imgproc.INTER_TAB_SIZE2);
            akcr.a((Object) message, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        grt grt = (grt) this.a.get();
        String str = gqi.a;
        a aVar = gqi.c;
        String str2 = "";
        Object obj = message == null ? str2 : message;
        String h = ((ifb) this.b.get()).h();
        String k = ((ifb) this.b.get()).k();
        akcr.b(str, "crashId");
        akcr.b(aVar, "anrType");
        akcr.b(obj, "crashMessage");
        ilv ilv = (ilv) grt.a.get();
        ilz a = iot.APP_CRASH.a("category", aVar.name());
        if (h != null) {
            str2 = h;
        }
        ilz a2 = a.a("app_version", str2);
        String str3 = VERSION.RELEASE;
        akcr.a((Object) str3, "Build.VERSION.RELEASE");
        ilv.c(a2.a("os_version", str3), 1);
        aaal aaal = aaal.ANR;
        int i = gru.b[aVar.ordinal()];
        aaam aaam = i != 1 ? i != 2 ? i != 3 ? null : aaam.DURABLE_ANR : aaam.DB_ANR : aaam.MAIN_ANR;
        grt.a(str, aaal, aaam, obj, null, h, k);
    }
}
