package defpackage;

import defpackage.adbe.b;

/* renamed from: acqu */
public final class acqu implements b {
    private final acqq a;
    private final adbv b;

    /* renamed from: acqu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public acqu(acqq acqq, adbv adbv) {
        akcr.b(acqq, "friendMarkerManager");
        akcr.b(adbv, "viewHost");
        this.a = acqq;
        this.b = adbv;
    }

    public final void a(String str) {
        akcr.b(str, "userId");
        if (this.a.a(str)) {
            this.b.m();
        }
    }
}
