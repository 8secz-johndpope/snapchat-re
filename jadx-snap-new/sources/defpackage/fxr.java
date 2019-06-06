package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: fxr */
public final class fxr implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "DURABLE_JOB_MUSHROOM_WAKEUP_SCHEDULE";
            builder.put(fxq.DURABLE_JOB_MUSHROOM_WAKEUP_USE_CUSTOM_SCHEDULE, new hxh(str, "USE_CUSTOM_WAKEUP_SCHEDULE", false));
            builder.put(fxq.DURABLE_JOB_MUSHROOM_WAKEUP_SCHEDULE_TIME_WINDOW_START, new hxh(str, "TIME_WINDOW_START", false));
            builder.put(fxq.DURABLE_JOB_MUSHROOM_WAKEUP_SCHEDULE_TIME_WINDOW_END, new hxh(str, "TIME_WINDOW_END", false));
            builder.put(fxq.DURABLE_JOB_WAKEUP_DEBOUNCE_SEC, new hxh(str, "WAKEUP_DEBOUNCE_SEC", false));
            builder.put(fxq.DURABLE_JOB_MUSHROOM_WORKMANAGER_WAKEUP_EMABLED, new hxh(str, "USE_WORK_MANAGER", false));
            builder.put(fxq.DURABLE_JOB_ALLOW_BLIZZARD_INIT, new hxh(str, "ALLOW_BLIZZARD_INIT", false));
            builder.put(fxq.DURABLE_JOB_GRAPHENE_FLUSH_ON_STOP_ENABLED, new hxh(str, "GRAPHENE_FLUSH_ON_STOP_ENABLED", false));
            this.a = builder.build();
        }
        return this.a;
    }
}
