package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: fxu */
public final class fxu implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(fxs.DISPLAY_NOTCH_HEIGHT, "camera-config-provider.display-notch-height");
            builder.put(fxs.NEEDS_CUSTOM_INSETS_SOURCE, "camera-config-provider.needs-custom-insets-source");
            this.a = builder.build();
        }
        return this.a;
    }
}
