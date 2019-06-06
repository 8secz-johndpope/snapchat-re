package defpackage;

import android.app.Activity;

/* renamed from: iti */
public interface iti {

    /* renamed from: iti$a */
    public enum a {
        NeedTermsOfUse,
        NeedPrivacyPolicy,
        AllAccepted
    }

    ajdp<a> a();

    void a(Activity activity, a aVar);
}
