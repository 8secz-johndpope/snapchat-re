package defpackage;

import defpackage.tnj.a;

/* renamed from: ciw */
public final class ciw implements cij {
    private final ajwy<tnj> a;
    private final ajwy<ftl> b;
    private final abqo c;

    public ciw(ajwy<tnj> ajwy, ajwy<ftl> ajwy2, abqo abqo) {
        akcr.b(ajwy, "prefsProvider");
        akcr.b(ajwy2, "configProvider");
        akcr.b(abqo, "clock");
        this.a = ajwy;
        this.b = ajwy2;
        this.c = abqo;
    }

    public final String a() {
        String j = ((ftl) this.b.get()).j(cip.USER_DATA);
        CharSequence charSequence = j;
        int i = (charSequence == null || charSequence.length() == 0) ? 1 : 0;
        return (i ^ 1) != 0 ? j : null;
    }

    public final void a(String str) {
        akcr.b(str, "userAdId");
        a b = ((tnj) this.a.get()).b();
        b.a((fth) cip.USER_DATA, str);
        b.b();
    }

    public final void a(boolean z) {
        a b = ((tnj) this.a.get()).b();
        b.a((fth) cip.AUDIENCE_MATCH_OPT_OUT, Boolean.valueOf(z));
        b.b();
    }

    public final String b() {
        String j = ((ftl) this.b.get()).j(cip.RAW_AD_USER_DATA);
        CharSequence charSequence = j;
        int i = (charSequence == null || charSequence.length() == 0) ? 1 : 0;
        return (i ^ 1) != 0 ? j : null;
    }

    public final void b(String str) {
        akcr.b(str, "userAdId");
        a b = ((tnj) this.a.get()).b();
        b.a((fth) cip.RAW_AD_USER_DATA, str);
        b.a((fth) cip.RAW_USER_DATA_TIMESTAMP, Long.valueOf(abqo.a()));
        b.b();
    }

    public final void b(boolean z) {
        a b = ((tnj) this.a.get()).b();
        b.a((fth) cip.EXTERNAL_ACTIVITY_MATCH_OPT_OUT, Boolean.valueOf(z));
        b.b();
    }

    public final void c(String str) {
        akcr.b(str, "sceid");
        a b = ((tnj) this.a.get()).b();
        b.a((fth) cip.SCEID, str);
        b.b();
    }

    public final boolean c() {
        return ((ftl) this.b.get()).a((fth) cip.AUDIENCE_MATCH_OPT_OUT);
    }

    public final void d(String str) {
        akcr.b(str, "pixelToken");
        a b = ((tnj) this.a.get()).b();
        b.a((fth) cip.PIXEL_TOKEN, str);
        b.b();
    }

    public final boolean d() {
        return ((ftl) this.b.get()).a((fth) cip.EXTERNAL_ACTIVITY_MATCH_OPT_OUT);
    }

    public final long e() {
        return ((ftl) this.b.get()).h(cip.RAW_USER_DATA_TIMESTAMP);
    }

    public final long f() {
        return ((ftl) this.b.get()).h(cip.RAW_USER_DATA_TTL_MS);
    }
}
