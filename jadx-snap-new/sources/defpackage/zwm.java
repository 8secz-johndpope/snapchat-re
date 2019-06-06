package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: zwm */
public final class zwm implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ENABLE";
            builder.put(zwl.WEB_VIEW_RECYCLE_ENABLED, new hxh("WEBMODULE_WEBVIEW_RECYCLE", str, true));
            builder.put(zwl.ENABLE_LOAD_ON_SWIPE_START, new hxh("WEBMODULE_LOAD_ON_SWIPE_START", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
