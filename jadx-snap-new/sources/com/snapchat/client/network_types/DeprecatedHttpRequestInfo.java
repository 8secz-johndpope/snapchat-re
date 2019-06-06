package com.snapchat.client.network_types;

public final class DeprecatedHttpRequestInfo {
    final boolean mShouldGzipRequest;

    public DeprecatedHttpRequestInfo(boolean z) {
        this.mShouldGzipRequest = z;
    }

    public final boolean getShouldGzipRequest() {
        return this.mShouldGzipRequest;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DeprecatedHttpRequestInfo{mShouldGzipRequest=");
        stringBuilder.append(this.mShouldGzipRequest);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
