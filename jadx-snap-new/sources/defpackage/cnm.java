package defpackage;

import defpackage.aecl.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: cnm */
public interface cnm {

    /* renamed from: cnm$a */
    public static final class a {
        static final HashMap<defpackage.aecl.a, String> a = ajzm.c(ajxs.a(defpackage.aecl.a.PRIMARY, "https://usc.adserver.snapads.com"), ajxs.a(defpackage.aecl.a.SHADOW, "https://adserver.shadow.snapads.com"));
        static final HashMap<cnn, String> b = ajzm.c(ajxs.a(cnn.INIT_HOST_AND_PATH_V2, "/v2/init"), ajxs.a(cnn.SERVE_HOST_AND_PATH_BATCH, "/v3/get"), ajxs.a(cnn.TRACK_HOST_AND_PATH_V2, "/v2/track"), ajxs.a(cnn.BATCH_TRACK_HOST_AND_PATH_V2, "/v2/batch_track"));

        static {
            a aVar = new a();
        }

        private a() {
        }
    }

    ckk a(cnn cnn);

    Map<a, ckk> a();

    void a(cnn cnn, a aVar);

    void a(cnn cnn, List<ckk> list);

    Map<a, ckk> b();

    Map<a, ckk> c();
}
