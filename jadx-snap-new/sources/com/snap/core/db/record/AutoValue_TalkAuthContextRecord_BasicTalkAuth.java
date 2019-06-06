package com.snap.core.db.record;

import com.snap.core.db.record.TalkAuthContextRecord.BasicTalkAuth;

final class AutoValue_TalkAuthContextRecord_BasicTalkAuth extends BasicTalkAuth {
    private final String mac;
    private final String scopeId;
    private final String token;

    AutoValue_TalkAuthContextRecord_BasicTalkAuth(String str, String str2, String str3) {
        if (str != null) {
            this.scopeId = str;
            if (str2 != null) {
                this.mac = str2;
                if (str3 != null) {
                    this.token = str3;
                    return;
                }
                throw new NullPointerException("Null token");
            }
            throw new NullPointerException("Null mac");
        }
        throw new NullPointerException("Null scopeId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BasicTalkAuth) {
            BasicTalkAuth basicTalkAuth = (BasicTalkAuth) obj;
            return this.scopeId.equals(basicTalkAuth.scopeId()) && this.mac.equals(basicTalkAuth.mac()) && this.token.equals(basicTalkAuth.token());
        }
    }

    public final int hashCode() {
        return ((((this.scopeId.hashCode() ^ 1000003) * 1000003) ^ this.mac.hashCode()) * 1000003) ^ this.token.hashCode();
    }

    public final String mac() {
        return this.mac;
    }

    public final String scopeId() {
        return this.scopeId;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BasicTalkAuth{scopeId=");
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
