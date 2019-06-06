package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: ewi */
public final class ewi implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(ewh.TEST_CIRCUMSTANCE_ENGINE_CONFIG_KEY, "CieslakTestAuditWithJun");
            builder.put(ewh.TEST_PROTO_CONFIG_KEY, "jyu-proto-test");
            this.a = builder.build();
        }
        return this.a;
    }
}
