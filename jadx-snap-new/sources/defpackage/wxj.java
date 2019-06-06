package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: wxj */
public final class wxj implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(wxh.ENABLED, "shazam.shazam_enable");
            builder.put(wxh.API_TOKEN, "shazam.shazam_api_token");
            builder.put(wxh.INITIAL_REQUEST_TIME, "shazam.shazam_initial_request_time");
            builder.put(wxh.POST_RETRY_SEND_INTERVAL, "shazam.shazam_post_retry_send_interval");
            builder.put(wxh.MAX_BUFFER_LENGTH, "shazam.shazam_max_buffer_length");
            builder.put(wxh.MAX_ATTEMPTS, "shazam.shazam_max_attempts");
            this.a = builder.build();
        }
        return this.a;
    }
}
