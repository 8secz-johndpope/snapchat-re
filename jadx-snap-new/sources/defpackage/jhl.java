package defpackage;

import com.brightcove.player.event.EventType;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: jhl */
public final class jhl implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(jhk.ONE_TAP_LOGIN_KILL_SWITCH, new hxh("ONE_TAP_LOGIN_KILL_SWITCH", EventType.STOP, true));
            builder.put(jhk.ONE_TAP_LOGIN_ENABLED_INTERNAL_USE, new hxh("ONE_TAP_LOGIN_KARMA_CHECK", "enabled", true));
            this.a = builder.build();
        }
        return this.a;
    }
}
