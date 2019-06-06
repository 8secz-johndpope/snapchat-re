package com.snap.core.db.record;

final class AutoValue_PreferencesRecord extends PreferencesRecord {
    private final long _id;
    private final Boolean booleanValue;
    private final Double doubleValue;
    private final Float floatValue;
    private final Integer intValue;
    private final String key;
    private final Long longValue;
    private final Boolean needSync;
    private final String stringValue;
    private final int type;
    private final Long version;

    AutoValue_PreferencesRecord(long j, String str, int i, Boolean bool, Integer num, Long l, Float f, Double d, String str2, Boolean bool2, Long l2) {
        this._id = j;
        if (str != null) {
            this.key = str;
            this.type = i;
            this.booleanValue = bool;
            this.intValue = num;
            this.longValue = l;
            this.floatValue = f;
            this.doubleValue = d;
            this.stringValue = str2;
            this.needSync = bool2;
            this.version = l2;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final long _id() {
        return this._id;
    }

    public final Boolean booleanValue() {
        return this.booleanValue;
    }

    public final Double doubleValue() {
        return this.doubleValue;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PreferencesRecord) {
            PreferencesRecord preferencesRecord = (PreferencesRecord) obj;
            if (this._id == preferencesRecord._id() && this.key.equals(preferencesRecord.key()) && this.type == preferencesRecord.type()) {
                Boolean bool = this.booleanValue;
                if (bool != null ? !bool.equals(preferencesRecord.booleanValue()) : preferencesRecord.booleanValue() != null) {
                    Integer num = this.intValue;
                    if (num != null ? !num.equals(preferencesRecord.intValue()) : preferencesRecord.intValue() != null) {
                        Long l = this.longValue;
                        if (l != null ? !l.equals(preferencesRecord.longValue()) : preferencesRecord.longValue() != null) {
                            Float f = this.floatValue;
                            if (f != null ? !f.equals(preferencesRecord.floatValue()) : preferencesRecord.floatValue() != null) {
                                Double d = this.doubleValue;
                                if (d != null ? !d.equals(preferencesRecord.doubleValue()) : preferencesRecord.doubleValue() != null) {
                                    String str = this.stringValue;
                                    if (str != null ? !str.equals(preferencesRecord.stringValue()) : preferencesRecord.stringValue() != null) {
                                        bool = this.needSync;
                                        if (bool != null ? !bool.equals(preferencesRecord.needSync()) : preferencesRecord.needSync() != null) {
                                            l = this.version;
                                            return l != null ? !l.equals(preferencesRecord.version()) : preferencesRecord.version() != null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final Float floatValue() {
        return this.floatValue;
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.key.hashCode()) * 1000003) ^ this.type) * 1000003;
        Boolean bool = this.booleanValue;
        int i = 0;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Integer num = this.intValue;
        hashCode = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Long l = this.longValue;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Float f = this.floatValue;
        hashCode = (hashCode ^ (f == null ? 0 : f.hashCode())) * 1000003;
        Double d = this.doubleValue;
        hashCode = (hashCode ^ (d == null ? 0 : d.hashCode())) * 1000003;
        String str = this.stringValue;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        bool = this.needSync;
        hashCode = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Long l2 = this.version;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Integer intValue() {
        return this.intValue;
    }

    public final String key() {
        return this.key;
    }

    public final Long longValue() {
        return this.longValue;
    }

    public final Boolean needSync() {
        return this.needSync;
    }

    public final String stringValue() {
        return this.stringValue;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PreferencesRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", booleanValue=");
        stringBuilder.append(this.booleanValue);
        stringBuilder.append(", intValue=");
        stringBuilder.append(this.intValue);
        stringBuilder.append(", longValue=");
        stringBuilder.append(this.longValue);
        stringBuilder.append(", floatValue=");
        stringBuilder.append(this.floatValue);
        stringBuilder.append(", doubleValue=");
        stringBuilder.append(this.doubleValue);
        stringBuilder.append(", stringValue=");
        stringBuilder.append(this.stringValue);
        stringBuilder.append(", needSync=");
        stringBuilder.append(this.needSync);
        stringBuilder.append(", version=");
        stringBuilder.append(this.version);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final int type() {
        return this.type;
    }

    public final Long version() {
        return this.version;
    }
}
