package com.snapchat.client.grpc;

public final class GrpcParameters {
    final String mEndpointAddress;
    final Long mRpcTimeout;
    final boolean mSecure;
    final String mUserAgentPrefix;

    public GrpcParameters(String str, Long l, boolean z, String str2) {
        this.mEndpointAddress = str;
        this.mRpcTimeout = l;
        this.mSecure = z;
        this.mUserAgentPrefix = str2;
    }

    public final String getEndpointAddress() {
        return this.mEndpointAddress;
    }

    public final Long getRpcTimeout() {
        return this.mRpcTimeout;
    }

    public final boolean getSecure() {
        return this.mSecure;
    }

    public final String getUserAgentPrefix() {
        return this.mUserAgentPrefix;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("GrpcParameters{mEndpointAddress=");
        stringBuilder.append(this.mEndpointAddress);
        stringBuilder.append(",mRpcTimeout=");
        stringBuilder.append(this.mRpcTimeout);
        stringBuilder.append(",mSecure=");
        stringBuilder.append(this.mSecure);
        stringBuilder.append(",mUserAgentPrefix=");
        stringBuilder.append(this.mUserAgentPrefix);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
