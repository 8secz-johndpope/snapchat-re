package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: wir */
public final class wir implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(wiq.SHOULD_SEND_CLEARTEXT_KEY, new hxh("FIDELIUS_DROID_RETRY", "cleartext", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
