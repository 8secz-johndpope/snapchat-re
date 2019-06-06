package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

/* renamed from: xsl */
public final class xsl implements wnh {
    private Map<fth, String> a = null;

    public final Map<fth, String> a() {
        if (this.a == null) {
            Builder builder = ImmutableMap.builder();
            builder.put(xsj.WEATHER_BASE_URL_KEY, "weather.weather_base_url");
            builder.put(xsj.STICKER_CDN_BASE_URL, "stickers.st_cdn_base_url");
            builder.put(xsj.STICKER_API_THROTTLE_SERVER, "stickers.st_pack_req_threshold_in_mins");
            this.a = builder.build();
        }
        return this.a;
    }
}
