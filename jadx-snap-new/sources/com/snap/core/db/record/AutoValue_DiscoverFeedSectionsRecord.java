package com.snap.core.db.record;

final class AutoValue_DiscoverFeedSectionsRecord extends DiscoverFeedSectionsRecord {
    private final long _id;
    private final boolean isLocal;
    private final String loggingKey;
    private final long sectionId;
    private final String sectionKeyName;
    private final boolean useLargeTiles;

    AutoValue_DiscoverFeedSectionsRecord(long j, long j2, String str, String str2, boolean z, boolean z2) {
        this._id = j;
        this.sectionId = j2;
        this.loggingKey = str;
        this.sectionKeyName = str2;
        this.isLocal = z;
        this.useLargeTiles = z2;
    }

    public final long _id() {
        return this._id;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof DiscoverFeedSectionsRecord) {
            DiscoverFeedSectionsRecord discoverFeedSectionsRecord = (DiscoverFeedSectionsRecord) obj;
            if (this._id == discoverFeedSectionsRecord._id() && this.sectionId == discoverFeedSectionsRecord.sectionId()) {
                String str = this.loggingKey;
                if (str != null ? !str.equals(discoverFeedSectionsRecord.loggingKey()) : discoverFeedSectionsRecord.loggingKey() != null) {
                    str = this.sectionKeyName;
                    if (str != null ? !str.equals(discoverFeedSectionsRecord.sectionKeyName()) : discoverFeedSectionsRecord.sectionKeyName() != null) {
                        return this.isLocal == discoverFeedSectionsRecord.isLocal() && this.useLargeTiles == discoverFeedSectionsRecord.useLargeTiles();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.sectionId;
        i = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str = this.loggingKey;
        int i2 = 0;
        i = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.sectionKeyName;
        if (str != null) {
            i2 = str.hashCode();
        }
        i = (i ^ i2) * 1000003;
        i2 = 1231;
        i = (i ^ (this.isLocal ? 1231 : 1237)) * 1000003;
        if (!this.useLargeTiles) {
            i2 = 1237;
        }
        return i ^ i2;
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    public final String loggingKey() {
        return this.loggingKey;
    }

    public final long sectionId() {
        return this.sectionId;
    }

    public final String sectionKeyName() {
        return this.sectionKeyName;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DiscoverFeedSectionsRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", sectionId=");
        stringBuilder.append(this.sectionId);
        stringBuilder.append(", loggingKey=");
        stringBuilder.append(this.loggingKey);
        stringBuilder.append(", sectionKeyName=");
        stringBuilder.append(this.sectionKeyName);
        stringBuilder.append(", isLocal=");
        stringBuilder.append(this.isLocal);
        stringBuilder.append(", useLargeTiles=");
        stringBuilder.append(this.useLargeTiles);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final boolean useLargeTiles() {
        return this.useLargeTiles;
    }
}
