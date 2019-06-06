package defpackage;

import com.snap.core.db.record.UploadedMediaModel;
import java.util.Map;

/* renamed from: sap */
public final class sap {
    public static final String a = sap.a("event_logger");
    public static final String b = sap.a("content_type");
    public static final String c = sap.a(UploadedMediaModel.CONTENT_ID);
    public static final String d = sap.a("feature");

    private static String a(String str) {
        akcr.b(str, "suffix");
        return "__req_local__:".concat(String.valueOf(str));
    }

    public static final String a(sak<?> sak) {
        akcr.b(sak, "receiver$0");
        Map m = sak.m();
        if (m != null) {
            Object obj = m.get(c);
            if (obj != null) {
                return obj.toString();
            }
        }
        return null;
    }

    public static final String b(sak<?> sak) {
        akcr.b(sak, "receiver$0");
        Map m = sak.m();
        if (m != null) {
            Object obj = m.get(b);
            if (obj != null) {
                return obj.toString();
            }
        }
        return null;
    }
}
