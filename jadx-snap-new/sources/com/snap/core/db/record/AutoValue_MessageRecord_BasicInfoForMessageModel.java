package com.snap.core.db.record;

import com.snap.core.db.record.MessageRecord.BasicInfoForMessageModel;

final class AutoValue_MessageRecord_BasicInfoForMessageModel extends BasicInfoForMessageModel {
    private final String key;
    private final String senderUsername;
    private final Long sequenceNumber;
    private final String type;

    AutoValue_MessageRecord_BasicInfoForMessageModel(String str, Long l, String str2, String str3) {
        if (str != null) {
            this.key = str;
            this.sequenceNumber = l;
            this.type = str2;
            this.senderUsername = str3;
            return;
        }
        throw new NullPointerException("Null key");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BasicInfoForMessageModel) {
            BasicInfoForMessageModel basicInfoForMessageModel = (BasicInfoForMessageModel) obj;
            if (this.key.equals(basicInfoForMessageModel.key())) {
                Long l = this.sequenceNumber;
                if (l != null ? !l.equals(basicInfoForMessageModel.sequenceNumber()) : basicInfoForMessageModel.sequenceNumber() != null) {
                    String str = this.type;
                    if (str != null ? !str.equals(basicInfoForMessageModel.type()) : basicInfoForMessageModel.type() != null) {
                        str = this.senderUsername;
                        return str != null ? !str.equals(basicInfoForMessageModel.senderUsername()) : basicInfoForMessageModel.senderUsername() != null;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (this.key.hashCode() ^ 1000003) * 1000003;
        Long l = this.sequenceNumber;
        int i = 0;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.type;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.senderUsername;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String key() {
        return this.key;
    }

    public final String senderUsername() {
        return this.senderUsername;
    }

    public final Long sequenceNumber() {
        return this.sequenceNumber;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BasicInfoForMessageModel{key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", sequenceNumber=");
        stringBuilder.append(this.sequenceNumber);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", senderUsername=");
        stringBuilder.append(this.senderUsername);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String type() {
        return this.type;
    }
}
