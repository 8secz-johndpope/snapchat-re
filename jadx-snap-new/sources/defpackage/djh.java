package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: djh */
public final class djh implements hww {
    private Map<fth, hxh> a = null;

    public final Map<fth, hxh> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            String str = "ENABLED";
            builder.put(djg.QOS_CONFIG, new hxh("BLIZZARD_QOS_CONFIG_ANDROID", str, true));
            builder.put(djg.RELIABLE_UPLOADS, new hxh("DAQ_RELIABLE_UPLOADS", "enabled", true));
            String str2 = "BLIZZARD_ANDROID_UPLOAD_EXPERIMENT";
            builder.put(djg.QUEUES_DISABLE_UPLOAD_WITHOUT_NETWORK, new hxh(str2, "disable_no_network_queues", true));
            builder.put(djg.QUEUES_DISABLE_UPLOAD_IN_BACKGROUND, new hxh(str2, "disable_in_background_queues", true));
            builder.put(djg.ENABLE_UPLOADER_V2, new hxh("BLIZZARD_UPLOAD_TO_DISK_ANDROID", str, true));
            String str3 = "BLIZZARD_DURABLE_JOB_ANDROID";
            builder.put(djg.DURABLE_JOB, new hxh(str3, str, false));
            builder.put(djg.DURABLE_JOB_PERIOD_MINUTES, new hxh(str3, "PERIOD_MINUTES", false));
            builder.put(djg.DURABLE_JOB_PERIODIC_QUEUES, new hxh(str3, "PERIODIC_QUEUES", false));
            builder.put(djg.DURABLE_JOB_DELAY_SECONDS_ON_BACKGROUND, new hxh(str3, "DELAY_SECONDS_ON_BACKGROUND", false));
            builder.put(djg.DURABLE_JOB_IN_FOREGROUND, new hxh(str3, "FOREGROUND_ENABLED", false));
            builder.put(djg.DURABLE_JOB_FOREGROUND_DELAY_SECONDS, new hxh(str3, "FOREGROUND_DELAY_SECONDS", false));
            builder.put(djg.BATCH_SEQUENCE_ID_WRITES, new hxh("BLIZZARD_BATCH_SEQUENCEID_ANDROID", str, true));
            this.a = builder.build();
        }
        return this.a;
    }
}
