package com.brightcove.player.model;

import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.util.ErrorUtil;
import java.util.HashMap;
import java.util.Map;

public class Source extends SourceAwareMetadataObject {

    public static final class Fields {
        public static final String BIT_RATE = "bitRate";
        public static final String DURATION = "duration";
        public static final String HEADERS = "headers";
        public static final String KEY_SYSTEMS = "key_systems";
        public static final String LICENSE_URL = "license_url";
        public static final String URL = "url";
        public static final String WIDEVINE_KEY_SYSTEM = "com.widevine.alpha";
    }

    public Source(String str) {
        super(new HashMap());
        a(str);
    }

    public Source(String str, DeliveryType deliveryType) {
        super(new HashMap());
        a(str);
        a(deliveryType);
    }

    public Source(Map<String, Object> map) {
        super(map);
    }

    private void a(String str) {
        if (str != null) {
            this.a.put("url", str);
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.URL_REQUIRED));
    }

    public Integer getBitRate() {
        Object obj = this.a.get(Fields.BIT_RATE);
        return (obj == null || !(obj instanceof Integer)) ? Integer.valueOf(-1) : (Integer) obj;
    }

    public String getUrl() {
        return (String) this.a.get("url");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Source{");
        stringBuilder.append("deliveryType: ");
        stringBuilder.append(getDeliveryType().toString());
        stringBuilder.append(", url: ");
        stringBuilder.append(getUrl() == null ? "N/A" : getUrl());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
