package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: zuo */
public final class zuo implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(zun.MEDIA_UPLOAD_QUALITY_LEVEL, "MEDIA_UPLOAD_QUALITY_LEVEL");
            this.a = builder.build();
        }
        return this.a;
    }
}
