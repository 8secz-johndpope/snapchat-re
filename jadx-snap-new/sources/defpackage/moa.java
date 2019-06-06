package defpackage;

import defpackage.kqe.al;

/* renamed from: moa */
public final class moa implements mns {
    private final kqf a;

    public moa(kqf kqf) {
        akcr.b(kqf, "analyticsEventHandler");
        this.a = kqf;
    }

    public final void a(String str, String str2) {
        akcr.b(str, "activeLensId");
        akcr.b(str2, "upcomingLensId");
        ajxm a = mmx.a(str, str2);
        this.a.a(new al((String) a.a, (String) a.b));
    }
}
