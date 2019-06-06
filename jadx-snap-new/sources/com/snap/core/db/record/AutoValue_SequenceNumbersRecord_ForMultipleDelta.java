package com.snap.core.db.record;

import com.snap.core.db.record.SequenceNumbersRecord.ForMultipleDelta;

final class AutoValue_SequenceNumbersRecord_ForMultipleDelta extends ForMultipleDelta {
    private final String key;
    private final Long processedEarliest;
    private final Long processedLatest;
    private final Long serverEarliest;
    private final Long serverLatest;
    private final Long updateNumber;
    private final String username;

    AutoValue_SequenceNumbersRecord_ForMultipleDelta(String str, String str2, Long l, Long l2, Long l3, Long l4, Long l5) {
        if (str != null) {
            this.key = str;
            if (str2 != null) {
                this.username = str2;
                this.serverEarliest = l;
                this.serverLatest = l2;
                this.processedEarliest = l3;
                this.processedLatest = l4;
                this.updateNumber = l5;
                return;
            }
            throw new NullPointerException("Null username");
        }
        throw new NullPointerException("Null key");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ForMultipleDelta) {
            ForMultipleDelta forMultipleDelta = (ForMultipleDelta) obj;
            if (this.key.equals(forMultipleDelta.key()) && this.username.equals(forMultipleDelta.username())) {
                Long l = this.serverEarliest;
                if (l != null ? !l.equals(forMultipleDelta.serverEarliest()) : forMultipleDelta.serverEarliest() != null) {
                    l = this.serverLatest;
                    if (l != null ? !l.equals(forMultipleDelta.serverLatest()) : forMultipleDelta.serverLatest() != null) {
                        l = this.processedEarliest;
                        if (l != null ? !l.equals(forMultipleDelta.processedEarliest()) : forMultipleDelta.processedEarliest() != null) {
                            l = this.processedLatest;
                            if (l != null ? !l.equals(forMultipleDelta.processedLatest()) : forMultipleDelta.processedLatest() != null) {
                                l = this.updateNumber;
                                return l != null ? !l.equals(forMultipleDelta.updateNumber()) : forMultipleDelta.updateNumber() != null;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.key.hashCode() ^ 1000003) * 1000003) ^ this.username.hashCode()) * 1000003;
        Long l = this.serverEarliest;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.serverLatest;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.processedEarliest;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        l = this.processedLatest;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.updateNumber;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final Long processedEarliest() {
        return this.processedEarliest;
    }

    public final Long processedLatest() {
        return this.processedLatest;
    }

    public final Long serverEarliest() {
        return this.serverEarliest;
    }

    public final Long serverLatest() {
        return this.serverLatest;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ForMultipleDelta{key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", username=");
        stringBuilder.append(this.username);
        stringBuilder.append(", serverEarliest=");
        stringBuilder.append(this.serverEarliest);
        stringBuilder.append(", serverLatest=");
        stringBuilder.append(this.serverLatest);
        stringBuilder.append(", processedEarliest=");
        stringBuilder.append(this.processedEarliest);
        stringBuilder.append(", processedLatest=");
        stringBuilder.append(this.processedLatest);
        stringBuilder.append(", updateNumber=");
        stringBuilder.append(this.updateNumber);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final Long updateNumber() {
        return this.updateNumber;
    }

    public final String username() {
        return this.username;
    }
}
