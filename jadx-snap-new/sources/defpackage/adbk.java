package defpackage;

import android.text.TextUtils;

/* renamed from: adbk */
public final class adbk implements ajwy<String> {
    private final ftl a;
    private final abss b;

    public adbk(ftl ftl, abss abss) {
        this.a = ftl;
        this.b = abss;
    }

    /* renamed from: a */
    public final String get() {
        String str = "https://ms.sc-jpl.com";
        if (!this.b.b) {
            return str;
        }
        int i = 0;
        if (akly.a(this.a.j(adew.CUSTOM_SERVER_ENDPOINT))) {
            if (this.b.b && TextUtils.isEmpty(this.a.j(adew.CUSTOM_SERVER_ENDPOINT))) {
                i = 1;
            }
            return i != 0 ? "https://ms-staging.sc-jpl.com" : str;
        } else {
            return String.format("https://%s.sc-jpl-internal.com", new Object[]{this.a.j(adew.CUSTOM_SERVER_ENDPOINT)});
        }
    }
}
