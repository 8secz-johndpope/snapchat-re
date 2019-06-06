package com.snap.core.db.query;

import com.snap.core.db.column.GeofilterType;
import defpackage.ahyg.a;

final class AutoValue_LegacyGeofilterQueries extends LegacyGeofilterQueries {
    private final a autoStackType;
    private final long filterId;
    private final String filterImageUrl;
    private final GeofilterType filterType;
    private final long gravitySetting;
    private final boolean isAnimated;
    private final boolean isBelowDrawingLayer;
    private final long scaleSetting;

    AutoValue_LegacyGeofilterQueries(long j, GeofilterType geofilterType, String str, long j2, long j3, boolean z, boolean z2, a aVar) {
        this.filterId = j;
        if (geofilterType != null) {
            this.filterType = geofilterType;
            if (str != null) {
                this.filterImageUrl = str;
                this.scaleSetting = j2;
                this.gravitySetting = j3;
                this.isAnimated = z;
                this.isBelowDrawingLayer = z2;
                this.autoStackType = aVar;
                return;
            }
            throw new NullPointerException("Null filterImageUrl");
        }
        throw new NullPointerException("Null filterType");
    }

    public final a autoStackType() {
        return this.autoStackType;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LegacyGeofilterQueries) {
            LegacyGeofilterQueries legacyGeofilterQueries = (LegacyGeofilterQueries) obj;
            if (this.filterId == legacyGeofilterQueries.filterId() && this.filterType.equals(legacyGeofilterQueries.filterType()) && this.filterImageUrl.equals(legacyGeofilterQueries.filterImageUrl()) && this.scaleSetting == legacyGeofilterQueries.scaleSetting() && this.gravitySetting == legacyGeofilterQueries.gravitySetting() && this.isAnimated == legacyGeofilterQueries.isAnimated() && this.isBelowDrawingLayer == legacyGeofilterQueries.isBelowDrawingLayer()) {
                a aVar = this.autoStackType;
                return aVar != null ? !aVar.equals(legacyGeofilterQueries.autoStackType()) : legacyGeofilterQueries.autoStackType() != null;
            }
        }
    }

    public final long filterId() {
        return this.filterId;
    }

    public final String filterImageUrl() {
        return this.filterImageUrl;
    }

    public final GeofilterType filterType() {
        return this.filterType;
    }

    public final long gravitySetting() {
        return this.gravitySetting;
    }

    public final int hashCode() {
        long j = this.filterId;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.filterType.hashCode()) * 1000003) ^ this.filterImageUrl.hashCode()) * 1000003;
        long j2 = this.scaleSetting;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.gravitySetting;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        int i = 1231;
        hashCode = (hashCode ^ (this.isAnimated ? 1231 : 1237)) * 1000003;
        if (!this.isBelowDrawingLayer) {
            i = 1237;
        }
        hashCode = (hashCode ^ i) * 1000003;
        a aVar = this.autoStackType;
        return (aVar == null ? 0 : aVar.hashCode()) ^ hashCode;
    }

    public final boolean isAnimated() {
        return this.isAnimated;
    }

    public final boolean isBelowDrawingLayer() {
        return this.isBelowDrawingLayer;
    }

    public final long scaleSetting() {
        return this.scaleSetting;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("LegacyGeofilterQueries{filterId=");
        stringBuilder.append(this.filterId);
        stringBuilder.append(", filterType=");
        stringBuilder.append(this.filterType);
        stringBuilder.append(", filterImageUrl=");
        stringBuilder.append(this.filterImageUrl);
        stringBuilder.append(", scaleSetting=");
        stringBuilder.append(this.scaleSetting);
        stringBuilder.append(", gravitySetting=");
        stringBuilder.append(this.gravitySetting);
        stringBuilder.append(", isAnimated=");
        stringBuilder.append(this.isAnimated);
        stringBuilder.append(", isBelowDrawingLayer=");
        stringBuilder.append(this.isBelowDrawingLayer);
        stringBuilder.append(", autoStackType=");
        stringBuilder.append(this.autoStackType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
