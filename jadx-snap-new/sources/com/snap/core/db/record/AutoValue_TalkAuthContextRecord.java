package com.snap.core.db.record;

final class AutoValue_TalkAuthContextRecord extends TalkAuthContextRecord {
    private final long _id;
    private final String conversationId;
    private final String mac;
    private final String scopeId;
    private final String sessionId;
    private final String sessionType;
    private final String token;

    AutoValue_TalkAuthContextRecord(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        this._id = j;
        if (str != null) {
            this.conversationId = str;
            if (str2 != null) {
                this.sessionType = str2;
                if (str3 != null) {
                    this.sessionId = str3;
                    if (str4 != null) {
                        this.scopeId = str4;
                        if (str5 != null) {
                            this.mac = str5;
                            if (str6 != null) {
                                this.token = str6;
                                return;
                            }
                            throw new NullPointerException("Null token");
                        }
                        throw new NullPointerException("Null mac");
                    }
                    throw new NullPointerException("Null scopeId");
                }
                throw new NullPointerException("Null sessionId");
            }
            throw new NullPointerException("Null sessionType");
        }
        throw new NullPointerException("Null conversationId");
    }

    public final long _id() {
        return this._id;
    }

    public final String conversationId() {
        return this.conversationId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TalkAuthContextRecord) {
            TalkAuthContextRecord talkAuthContextRecord = (TalkAuthContextRecord) obj;
            return this._id == talkAuthContextRecord._id() && this.conversationId.equals(talkAuthContextRecord.conversationId()) && this.sessionType.equals(talkAuthContextRecord.sessionType()) && this.sessionId.equals(talkAuthContextRecord.sessionId()) && this.scopeId.equals(talkAuthContextRecord.scopeId()) && this.mac.equals(talkAuthContextRecord.mac()) && this.token.equals(talkAuthContextRecord.token());
        }
    }

    public final int hashCode() {
        long j = this._id;
        return this.token.hashCode() ^ ((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.conversationId.hashCode()) * 1000003) ^ this.sessionType.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.scopeId.hashCode()) * 1000003) ^ this.mac.hashCode()) * 1000003);
    }

    public final String mac() {
        return this.mac;
    }

    public final String scopeId() {
        return this.scopeId;
    }

    public final String sessionId() {
        return this.sessionId;
    }

    public final String sessionType() {
        return this.sessionType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TalkAuthContextRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", conversationId=");
        stringBuilder.append(this.conversationId);
        stringBuilder.append(", sessionType=");
        stringBuilder.append(this.sessionType);
        stringBuilder.append(", sessionId=");
        stringBuilder.append(this.sessionId);
        stringBuilder.append(", scopeId=");
        stringBuilder.append(this.scopeId);
        stringBuilder.append(", mac=");
        stringBuilder.append(this.mac);
        stringBuilder.append(", token=");
        stringBuilder.append(this.token);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final String token() {
        return this.token;
    }
}
