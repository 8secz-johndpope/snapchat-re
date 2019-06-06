package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: exg */
public final class exg {
    static {
        exg exg = new exg();
    }

    private exg() {
    }

    public static ilz a(int i, boolean z) {
        return inr.PROPERTY_CACHE_HIT.a("property_id", String.valueOf(i)).a("property_hit", z);
    }

    public static ilz a(long j) {
        return inr.SYNC_REQUEST_ERROR.a("error_source", "client").a("error_code", String.valueOf(j));
    }

    public static ilz a(String str, boolean z) {
        akcr.b(str, "configName");
        return inr.GET_CONFIG.a("config_name", exg.a(str)).a("db_hit", z);
    }

    public static ilz a(boolean z) {
        return inr.INIT.a("is_warm_start", z);
    }

    public static String a(String str) {
        if ((((CharSequence) str).length() == 0 ? 1 : null) != null) {
            return "invalid_config_id";
        }
        if (str.length() < 64) {
            return str;
        }
        if (str != null) {
            Object substring = str.substring(0, 62);
            akcr.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new ajxt("null cannot be cast to non-null type java.lang.String");
    }

    public static String a(byte[] bArr) {
        try {
            Object wrap = ByteBuffer.wrap(bArr);
            akcr.a(wrap, "buffer");
            wrap = new UUID(wrap.getLong(), wrap.getLong()).toString();
            akcr.a(wrap, "UUID(buffer.long, buffer.long).toString()");
            if (wrap != null) {
                wrap = wrap.substring(0, 7);
                akcr.a(wrap, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return wrap;
            }
            throw new ajxt("null cannot be cast to non-null type java.lang.String");
        } catch (BufferUnderflowException unused) {
            return "invalid_rule_id";
        }
    }

    public static ilz b(boolean z) {
        return inr.DB_UPDATE.a("ttl_refresh", z);
    }
}
