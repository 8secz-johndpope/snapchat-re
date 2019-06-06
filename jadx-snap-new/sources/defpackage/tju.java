package defpackage;

import com.snap.framework.developer.BuildConfigInfo;
import com.snap.payments.lib.api.PaymentsApiHttpInterface;
import defpackage.akhn.a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: tju */
public final class tju extends saa implements akhn {
    private final Map<String, String> a;
    private final tfz b;

    /* renamed from: tju$a */
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

    public tju(BuildConfigInfo buildConfigInfo, abss abss, tfz tfz) {
        akcr.b(buildConfigInfo, "buildConfigInfo");
        akcr.b(abss, "releaseManager");
        akcr.b(tfz, "commerceSessionIdStore");
        this.b = tfz;
        r2 = new ajxm[4];
        r2[2] = ajxs.a("X-SC-Client-Version", abss.q());
        r2[3] = ajxs.a("X-SC-Client-User-Locale", Locale.getDefault().toString());
        this.a = ajzm.a(r2);
    }

    private final Map<String, String> a() {
        HashMap hashMap = new HashMap(this.a);
        String a = this.b.a();
        CharSequence charSequence = a;
        Object obj = (charSequence == null || charSequence.length() == 0) ? 1 : null;
        if (obj == null) {
            hashMap.put("X-SC-Client-Session-Id", a);
        }
        return hashMap;
    }

    public final void a(sak<sai> sak, sab sab) {
        sak sak2;
        akcr.b(sak2, "request");
        akcr.b(sab, "chain");
        HashMap hashMap = new HashMap(sak2.l());
        if (((String) hashMap.remove(PaymentsApiHttpInterface.STUB_HEADER)) != null) {
            hashMap.putAll(a());
            sak2 = sak2.h().d(hashMap).e();
            akcr.a((Object) sak2, "request.builder.setHeaders(headers).build()");
        }
        sab.a(sak2);
    }

    public final akhv intercept(a aVar) {
        if (aVar != null) {
            akht a = aVar.a();
            String str = PaymentsApiHttpInterface.STUB_HEADER;
            if (akcr.a(PaymentsApiHttpInterface.STUB_VALUE, a.a(str))) {
                akht.a d = a.d();
                d.b(str);
                Object a2 = d.a();
                akcr.a(a2, "builder.build()");
                a = gmk.a(a2.d(), a()).a();
                akcr.a((Object) a, "TransformHelper.addHeade…entsAuthHeader()).build()");
            }
            Object a3 = aVar.a(a);
            akcr.a(a3, "chain.proceed(request)");
            return a3;
        }
        throw new IOException("Chain is null!");
    }
}
