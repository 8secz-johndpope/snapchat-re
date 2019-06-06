package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: jdx */
public final class jdx implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ENABLED";
            builder.put(jdw.REG_PHONE_AUTO_ADVANCE, new hxh("REG_PHONE_AUTO_ADVANCE", str, true));
            builder.put(jdw.REG_REMOVE_CAPTCHA, new hxh("REG_REMOVE_CAPTCHA", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
