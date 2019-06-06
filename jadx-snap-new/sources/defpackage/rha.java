package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: rha */
public final class rha implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(rgz.ANDROID_PREVIEW_SWIPE_UP_TO_SEND, new hxh("ANDROID_PREVIEW_GESTURE_NAVIGATION", "isSwipeUpSendToEnabled", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
