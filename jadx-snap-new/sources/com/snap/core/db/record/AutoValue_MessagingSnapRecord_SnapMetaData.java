package com.snap.core.db.record;

import com.snap.core.db.column.FeedKind;
import com.snap.core.db.column.GeofilterMetadata;
import com.snap.core.db.column.SnappableLensMetadata;
import com.snap.core.db.record.MessagingSnapRecord.SnapMetaData;
import defpackage.gcp;

final class AutoValue_MessagingSnapRecord_SnapMetaData extends SnapMetaData {
    private final String conversationId;
    private final long durationInMs;
    private final Long feedRowId;
    private final GeofilterMetadata geofilterMetadata;
    private final FeedKind kind;
    private final Long senderId;
    private final String senderUsername;
    private final String snapId;
    private final gcp snapType;
    private final SnappableLensMetadata snappableLensMetadata;

    AutoValue_MessagingSnapRecord_SnapMetaData(String str, gcp gcp, Long l, Long l2, GeofilterMetadata geofilterMetadata, SnappableLensMetadata snappableLensMetadata, String str2, FeedKind feedKind, String str3, long j) {
        if (str != null) {
            this.snapId = str;
            if (gcp != null) {
                this.snapType = gcp;
                this.senderId = l;
                this.feedRowId = l2;
                this.geofilterMetadata = geofilterMetadata;
                this.snappableLensMetadata = snappableLensMetadata;
                if (str2 != null) {
                    this.conversationId = str2;
                    if (feedKind != null) {
                        this.kind = feedKind;
                        if (str3 != null) {
                            this.senderUsername = str3;
                            this.durationInMs = j;
                            return;
                        }
                        throw new NullPointerException("Null senderUsername");
                    }
                    throw new NullPointerException("Null kind");
                }
                throw new NullPointerException("Null conversationId");
            }
            throw new NullPointerException("Null snapType");
        }
        throw new NullPointerException("Null snapId");
    }

    public final String conversationId() {
        return this.conversationId;
    }

    public final long durationInMs() {
        return this.durationInMs;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapMetaData) {
            SnapMetaData snapMetaData = (SnapMetaData) obj;
            if (this.snapId.equals(snapMetaData.snapId()) && this.snapType.equals(snapMetaData.snapType())) {
                Long l = this.senderId;
                if (l != null ? !l.equals(snapMetaData.senderId()) : snapMetaData.senderId() != null) {
                    l = this.feedRowId;
                    if (l != null ? !l.equals(snapMetaData.feedRowId()) : snapMetaData.feedRowId() != null) {
                        GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
                        if (geofilterMetadata != null ? !geofilterMetadata.equals(snapMetaData.geofilterMetadata()) : snapMetaData.geofilterMetadata() != null) {
                            SnappableLensMetadata snappableLensMetadata = this.snappableLensMetadata;
                            if (snappableLensMetadata != null ? !snappableLensMetadata.equals(snapMetaData.snappableLensMetadata()) : snapMetaData.snappableLensMetadata() != null) {
                                return this.conversationId.equals(snapMetaData.conversationId()) && this.kind.equals(snapMetaData.kind()) && this.senderUsername.equals(snapMetaData.senderUsername()) && this.durationInMs == snapMetaData.durationInMs();
                            }
                        }
                    }
                }
            }
        }
    }

    public final Long feedRowId() {
        return this.feedRowId;
    }

    public final GeofilterMetadata geofilterMetadata() {
        return this.geofilterMetadata;
    }

    public final int hashCode() {
        int hashCode = (((this.snapId.hashCode() ^ 1000003) * 1000003) ^ this.snapType.hashCode()) * 1000003;
        Long l = this.senderId;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.feedRowId;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        GeofilterMetadata geofilterMetadata = this.geofilterMetadata;
        hashCode = (hashCode ^ (geofilterMetadata == null ? 0 : geofilterMetadata.hashCode())) * 1000003;
        SnappableLensMetadata snappableLensMetadata = this.snappableLensMetadata;
        if (snappableLensMetadata != null) {
            i = snappableLensMetadata.hashCode();
        }
        hashCode = (((((((hashCode ^ i) * 1000003) ^ this.conversationId.hashCode()) * 1000003) ^ this.kind.hashCode()) * 1000003) ^ this.senderUsername.hashCode()) * 1000003;
        long j = this.durationInMs;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final FeedKind kind() {
        return this.kind;
    }

    public final Long senderId() {
        return this.senderId;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final String snapId() {
        return this.snapId;
    }

    public final gcp snapType() {
        return this.snapType;
    }

    public final SnappableLensMetadata snappableLensMetadata() {
        return this.snappableLensMetadata;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapMetaData{snapId=");
        stringBuilder.append(this.snapId);
        stringBuilder.append(", snapType=");
        stringBuilder.append(this.snapType);
        stringBuilder.append(", senderId=");
        stringBuilder.append(this.senderId);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append(", geofilterMetadata=");
        stringBuilder.append(this.geofilterMetadata);
        stringBuilder.append(", snappableLensMetadata=");
        stringBuilder.append(this.snappableLensMetadata);
        stringBuilder.append(", conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", kind=");
        stringBuilder.append(this.kind);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append(", durationInMs=");
        stringBuilder.append(this.durationInMs);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
