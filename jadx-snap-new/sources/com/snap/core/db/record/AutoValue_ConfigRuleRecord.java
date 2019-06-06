package com.snap.core.db.record;

import defpackage.acbz;
import java.util.Arrays;

final class AutoValue_ConfigRuleRecord extends ConfigRuleRecord {
    private final long _id;
    private final String config_id;
    private final acbz config_result;
    private final long last_updated;
    private final Long priority;
    private final byte[] rule_id;
    private final long ttl;

    AutoValue_ConfigRuleRecord(long j, byte[] bArr, String str, Long l, acbz acbz, long j2, long j3) {
        this._id = j;
        if (bArr != null) {
            this.rule_id = bArr;
            if (str != null) {
                this.config_id = str;
                this.priority = l;
                if (acbz != null) {
                    this.config_result = acbz;
                    this.last_updated = j2;
                    this.ttl = j3;
                    return;
                }
                throw new NullPointerException("Null config_result");
            }
            throw new NullPointerException("Null config_id");
        }
        throw new NullPointerException("Null rule_id");
    }

    public final long _id() {
        return this._id;
    }

    public final String config_id() {
        return this.config_id;
    }

    public final acbz config_result() {
        return this.config_result;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ConfigRuleRecord) {
            ConfigRuleRecord configRuleRecord = (ConfigRuleRecord) obj;
            if (this._id == configRuleRecord._id()) {
                if (Arrays.equals(this.rule_id, configRuleRecord instanceof AutoValue_ConfigRuleRecord ? ((AutoValue_ConfigRuleRecord) configRuleRecord).rule_id : configRuleRecord.rule_id()) && this.config_id.equals(configRuleRecord.config_id())) {
                    Long l = this.priority;
                    if (l != null ? !l.equals(configRuleRecord.priority()) : configRuleRecord.priority() != null) {
                        return this.config_result.equals(configRuleRecord.config_result()) && this.last_updated == configRuleRecord.last_updated() && this.ttl == configRuleRecord.ttl();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        long j = this._id;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.rule_id)) * 1000003) ^ this.config_id.hashCode()) * 1000003;
        Long l = this.priority;
        hashCode = (((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ this.config_result.hashCode()) * 1000003;
        long j2 = this.last_updated;
        hashCode = (hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        j2 = this.ttl;
        return ((int) (j2 ^ (j2 >>> 32))) ^ hashCode;
    }

    public final long last_updated() {
        return this.last_updated;
    }

    public final Long priority() {
        return this.priority;
    }

    public final byte[] rule_id() {
        return this.rule_id;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConfigRuleRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", rule_id=");
        stringBuilder.append(Arrays.toString(this.rule_id));
        stringBuilder.append(", config_id=");
        stringBuilder.append(this.config_id);
        stringBuilder.append(", priority=");
        stringBuilder.append(this.priority);
        stringBuilder.append(", config_result=");
        stringBuilder.append(this.config_result);
        stringBuilder.append(", last_updated=");
        stringBuilder.append(this.last_updated);
        stringBuilder.append(", ttl=");
        stringBuilder.append(this.ttl);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long ttl() {
        return this.ttl;
    }
}
