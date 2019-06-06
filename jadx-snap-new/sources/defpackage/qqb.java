package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: qqb */
public final class qqb implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(qpy.USE_DIRECT_DOWNLOAD_URL_FOR_SNAPS, "messaging.use_download_url");
            builder.put(qpy.USE_DIRECT_DOWNLOAD_URL_FOR_CHAT_MEDIA, "messaging.use_download_url_for_chat_media");
            this.a = builder.build();
        }
        return this.a;
    }
}
