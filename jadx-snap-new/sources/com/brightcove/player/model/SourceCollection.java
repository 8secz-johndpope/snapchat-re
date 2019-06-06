package com.brightcove.player.model;

import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.util.ErrorUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SourceCollection extends SourceAwareMetadataObject {
    private Set<Source> b;

    public SourceCollection(Source source, DeliveryType deliveryType) {
        super(new HashMap());
        if (source != null) {
            this.b = new HashSet();
            this.b.add(source);
            a(deliveryType);
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.SOURCE_REQUIRED));
    }

    public SourceCollection(Map<String, Object> map) {
        super(map);
    }

    public SourceCollection(Map<String, Object> map, Set<Source> set) {
        super(map);
        if (set != null) {
            this.b = set;
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.SOURCES_REQUIRED));
    }

    public SourceCollection(Set<Source> set, DeliveryType deliveryType) {
        super(new HashMap());
        if (set != null) {
            this.b = set;
            a(deliveryType);
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.SOURCES_REQUIRED));
    }

    public Set<Source> getSources() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SourceCollection{");
        stringBuilder.append(" deliveryType:");
        stringBuilder.append(getDeliveryType().toString());
        stringBuilder.append(" sources:");
        Set set = this.b;
        stringBuilder.append(set == null ? 0 : set.size());
        stringBuilder.append("} ");
        return stringBuilder.toString();
    }
}
