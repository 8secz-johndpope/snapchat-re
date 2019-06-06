package com.snapchat.client.network_types;

import java.util.ArrayList;

public final class HttpParams {
    final ArrayList<Header> mHeaders;
    final HttpMethod mMethod;

    public HttpParams(ArrayList<Header> arrayList, HttpMethod httpMethod) {
        this.mHeaders = arrayList;
        this.mMethod = httpMethod;
    }

    public final ArrayList<Header> getHeaders() {
        return this.mHeaders;
    }

    public final HttpMethod getMethod() {
        return this.mMethod;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpParams{mHeaders=");
        stringBuilder.append(this.mHeaders);
        stringBuilder.append(",mMethod=");
        stringBuilder.append(this.mMethod);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
