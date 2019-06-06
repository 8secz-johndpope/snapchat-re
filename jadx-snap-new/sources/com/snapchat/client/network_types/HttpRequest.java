package com.snapchat.client.network_types;

public final class HttpRequest {
    final DeprecatedHttpRequestInfo mDeprecatedHttpRequestInfo;
    final HttpParams mHttpParams;
    final HttpRequestKey mKey;
    final String mUrl;
    final boolean mUsesDeprecatedHttpRequestInfo;

    public HttpRequest(HttpRequestKey httpRequestKey, String str, HttpParams httpParams, boolean z, DeprecatedHttpRequestInfo deprecatedHttpRequestInfo) {
        this.mKey = httpRequestKey;
        this.mUrl = str;
        this.mHttpParams = httpParams;
        this.mUsesDeprecatedHttpRequestInfo = z;
        this.mDeprecatedHttpRequestInfo = deprecatedHttpRequestInfo;
    }

    public final DeprecatedHttpRequestInfo getDeprecatedHttpRequestInfo() {
        return this.mDeprecatedHttpRequestInfo;
    }

    public final HttpParams getHttpParams() {
        return this.mHttpParams;
    }

    public final HttpRequestKey getKey() {
        return this.mKey;
    }

    public final String getUrl() {
        return this.mUrl;
    }

    public final boolean getUsesDeprecatedHttpRequestInfo() {
        return this.mUsesDeprecatedHttpRequestInfo;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpRequest{mKey=");
        stringBuilder.append(this.mKey);
        stringBuilder.append(",mUrl=");
        stringBuilder.append(this.mUrl);
        stringBuilder.append(",mHttpParams=");
        stringBuilder.append(this.mHttpParams);
        stringBuilder.append(",mUsesDeprecatedHttpRequestInfo=");
        stringBuilder.append(this.mUsesDeprecatedHttpRequestInfo);
        stringBuilder.append(",mDeprecatedHttpRequestInfo=");
        stringBuilder.append(this.mDeprecatedHttpRequestInfo);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
