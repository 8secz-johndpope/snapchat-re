package defpackage;

import com.snapchat.android.R;
import defpackage.sdr.a;
import java.util.List;

/* renamed from: fia */
public final class fia implements eyw {
    private final sdn a;
    private final ajwy<sdu> b;

    public fia(sdn sdn, ajwy<sdu> ajwy) {
        akcr.b(sdn, "notificationPolicySetter");
        akcr.b(ajwy, "notificationEmitter");
        this.a = sdn;
        this.b = ajwy;
    }

    public final ajdp<ffr> a() {
        Object a = ajvo.a(ajot.a);
        akcr.a(a, "Observable.empty()");
        return a;
    }

    public final void a(String str, String str2, String str3, List<String> list) {
        akcr.b(str, "username");
        akcr.b(str2, "title");
        akcr.b(str3, "appSessionId");
        akcr.b(list, "invitedFriends");
        a c = new a().b(true).c(false);
        c.a = str2;
        ((sdu) this.b.get()).b(c.a(Long.valueOf(6000)).a(sec.COGNAC_LOCAL_NOTIFICATION).a(Integer.valueOf(R.drawable.cognac_notification_badge)).a());
    }

    public final sdn b() {
        return this.a;
    }
}
