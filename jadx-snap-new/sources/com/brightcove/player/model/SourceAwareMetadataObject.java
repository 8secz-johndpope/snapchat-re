package com.brightcove.player.model;

import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.util.ErrorUtil;
import java.util.Map;

public abstract class SourceAwareMetadataObject extends MetadataObject {

    public static final class Fields {
        public static final String DELIVERY_TYPE = "deliveryType";
    }

    public SourceAwareMetadataObject(Map<String, Object> map) {
        super(map);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(DeliveryType deliveryType) {
        if (deliveryType != null) {
            this.a.put(Fields.DELIVERY_TYPE, deliveryType);
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.DELIVERY_TYPE_REQUIRED));
    }

    public DeliveryType getDeliveryType() {
        Object obj = this.a.get(Fields.DELIVERY_TYPE);
        return (obj == null || !(obj instanceof DeliveryType)) ? DeliveryType.UNKNOWN : (DeliveryType) obj;
    }
}
