package com.snap.core.db.record;

final class AutoValue_NetworkGatewayInfoRecord extends NetworkGatewayInfoRecord {
    private final long _id;
    private final String authToken;
    private final String server;

    AutoValue_NetworkGatewayInfoRecord(long j, String str, String str2) {
        this._id = j;
        if (str != null) {
            this.authToken = str;
            if (str2 != null) {
                this.server = str2;
                return;
            }
            throw new NullPointerException("Null server");
        }
        throw new NullPointerException("Null authToken");
    }

    public final long _id() {
        return this._id;
    }

    public final String authToken() {
        return this.authToken;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NetworkGatewayInfoRecord) {
            NetworkGatewayInfoRecord networkGatewayInfoRecord = (NetworkGatewayInfoRecord) obj;
            return this._id == networkGatewayInfoRecord._id() && this.authToken.equals(networkGatewayInfoRecord.authToken()) && this.server.equals(networkGatewayInfoRecord.server());
        }
    }

    public final int hashCode() {
        long j = this._id;
        return this.server.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.authToken.hashCode()) * 1000003);
    }

    public final String server() {
        return this.server;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("NetworkGatewayInfoRecord{_id=");
        stringBuilder.append(this._id);
        stringBuilder.append(", authToken=");
        stringBuilder.append(this.authToken);
        stringBuilder.append(", server=");
        stringBuilder.append(this.server);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
