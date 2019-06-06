package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: yja */
public final class yja implements evf {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(yiz.STORY_VIDEO_MEDIA_SELECTION, "MdpMushroomStoryVideoMediaSelection");
            this.a = builder.build();
        }
        return this.a;
    }
}
