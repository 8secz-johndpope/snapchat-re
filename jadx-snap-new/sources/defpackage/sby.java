package defpackage;

import com.brightcove.player.event.EventType;
import defpackage.sbe.a;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* renamed from: sby */
public final class sby extends saa {
    public final void a(saq<sai> saq, sab sab) {
        Closeable a;
        Closeable a2;
        saq saq2;
        Throwable th;
        Throwable th2;
        Throwable th3;
        akcr.b(saq2, EventType.RESPONSE);
        akcr.b(sab, "chain");
        sai sai = (sai) saq2.g();
        int a3 = saq2.a();
        if (400 <= a3 && 499 >= a3) {
            Object a4 = sab.a();
            akcr.a(a4, "chain.context()");
            a4 = a4.b();
            akcr.a(a4, "chain.context().request");
            String b = sbc.b(saq2.h(), "Server");
            Object obj = null;
            if ((b != null ? akgb.a(b, "AmazonS3", true) : false) || (a4.k() == sac.PUT && akgb.a(a4.j(), "cf-st.sc-cdn.net", true))) {
                obj = 1;
            }
            if (!(obj == null || sai == null)) {
                Closeable closeable = sai;
                try {
                    a = a.a(((sai) closeable).e());
                    try {
                        sbd sbd = (sbd) a;
                        Object a5 = sbg.a(sai.b(), sai.c(), sai.d(), sbd.a());
                        akcr.a(a5, "Payloads.create(\n       …der.provideInputStream())");
                        a2 = sbd.a();
                        try {
                            saq2 = saq2.f().a(aklc.a((InputStream) a2, StandardCharsets.UTF_8)).a(a5).a();
                            akax.a(a2, null);
                            akax.a(a, null);
                            akax.a(closeable, null);
                            akcr.a((Object) saq2, "originalPayload.use { pa…          }\n            }");
                        } catch (Throwable th22) {
                            th3 = th22;
                            th22 = th;
                            th = th3;
                        }
                    } catch (Throwable th222) {
                        th3 = th222;
                        th222 = th;
                        th = th3;
                    }
                } catch (Throwable th4) {
                    akax.a(closeable, th);
                }
            }
        }
        super.a(saq2, sab);
        return;
        akax.a(a, th222);
        throw th;
        akax.a(a2, th222);
        throw th;
    }
}
