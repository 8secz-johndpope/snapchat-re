package com.snap.core.db.query;

import com.snap.core.db.column.GeofilterType;
import com.snap.core.db.query.LegacyGeofilterQueries.StaticGeofilters;
import defpackage.ahyg.a;

final class AutoValue_LegacyGeofilterQueries_StaticGeofilters extends StaticGeofilters {
    private final a autoStackType;
    private final long filterId;
    private final String filterImageUrl;
    private final GeofilterType filterType;
    private final long gravitySetting;
    private final boolean isAnimated;
    private final boolean isBelowDrawingLayer;
    private final long scaleSetting;

    AutoValue_LegacyGeofilterQueries_StaticGeofilters(long j, GeofilterType geofilterType, String str, long j2, long j3, boolean z, a aVar, boolean z2) {
        this.filterId = j;
        if (geofilterType != null) {
            this.filterType = geofilterType;
            if (str != null) {
                this.filterImageUrl = str;
                this.scaleSetting = j2;
                this.gravitySetting = j3;
                this.isAnimated = z;
                this.autoStackType = aVar;
                this.isBelowDrawingLayer = z2;
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
        if (obj instanceof StaticGeofilters) {
            StaticGeofilters staticGeofilters = (StaticGeofilters) obj;
            if (this.filterId == staticGeofilters.filterId() && this.filterType.equals(staticGeofilters.filterType()) && this.filterImageUrl.equals(staticGeofilters.filterImageUrl()) && this.scaleSetting == staticGeofilters.scaleSetting() && this.gravitySetting == staticGeofilters.gravitySetting() && this.isAnimated == staticGeofilters.isAnimated()) {
                a aVar = this.autoStackType;
                if (aVar != null ? !aVar.equals(staticGeofilters.autoStackType()) : staticGeofilters.autoStackType() != null) {
                    if (this.isBelowDrawingLayer == staticGeofilters.isBelowDrawingLayer()) {
                        return true;
                    }
                }
            }
        }
        return false;
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
        a aVar = this.autoStackType;
        hashCode = (hashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        if (!this.isBelowDrawingLayer) {
            i = 1237;
        }
        return hashCode ^ i;
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
        StringBuilder stringBuilder = new StringBuilder("StaticGeofilters{filterId=");
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
        stringBuilder.append(", autoStackType=");
        stringBuilder.append(this.autoStackType);
        stringBuilder.append(", isBelowDrawingLayer=");
        stringBuilder.append(this.isBelowDrawingLayer);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
