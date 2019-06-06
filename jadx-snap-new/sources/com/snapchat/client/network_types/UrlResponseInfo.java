package com.snapchat.client.network_types;

import java.util.ArrayList;

public final class UrlResponseInfo {
    final ArrayList<Header> mAllHeadersList;
    final int mHttpStatusCode;
    final String mHttpStatusText;
    final String mNegotiatedProtocol;
    final String mProxyServer;
    final long mReceivedByteCount;
    final String mUrl;
    final ArrayList<String> mUrlChain;
    final boolean mWasCached;

    public UrlResponseInfo(String str, ArrayList<String> arrayList, int i, String str2, ArrayList<Header> arrayList2, boolean z, String str3, String str4, long j) {
        this.mUrl = str;
        this.mUrlChain = arrayList;
        this.mHttpStatusCode = i;
        this.mHttpStatusText = str2;
        this.mAllHeadersList = arrayList2;
        this.mWasCached = z;
        this.mNegotiatedProtocol = str3;
        this.mProxyServer = str4;
        this.mReceivedByteCount = j;
    }

    public final ArrayList<Header> getAllHeadersList() {
        return this.mAllHeadersList;
    }

    public final int getHttpStatusCode() {
        return this.mHttpStatusCode;
    }

    public final String getHttpStatusText() {
        return this.mHttpStatusText;
    }

    public final String getNegotiatedProtocol() {
        return this.mNegotiatedProtocol;
    }

    public final String getProxyServer() {
        return this.mProxyServer;
    }

    public final long getReceivedByteCount() {
        return this.mReceivedByteCount;
    }

    public final String getUrl() {
        return this.mUrl;
    }

    public final ArrayList<String> getUrlChain() {
        return this.mUrlChain;
    }

    public final boolean getWasCached() {
        return this.mWasCached;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UrlResponseInfo{mUrl=");
        stringBuilder.append(this.mUrl);
        stringBuilder.append(",mUrlChain=");
        stringBuilder.append(this.mUrlChain);
        stringBuilder.append(",mHttpStatusCode=");
        stringBuilder.append(this.mHttpStatusCode);
        stringBuilder.append(",mHttpStatusText=");
        stringBuilder.append(this.mHttpStatusText);
        stringBuilder.append(",mAllHeadersList=");
        stringBuilder.append(this.mAllHeadersList);
        stringBuilder.append(",mWasCached=");
        stringBuilder.append(this.mWasCached);
        stringBuilder.append(",mNegotiatedProtocol=");
        stringBuilder.append(this.mNegotiatedProtocol);
        stringBuilder.append(",mProxyServer=");
        stringBuilder.append(this.mProxyServer);
        stringBuilder.append(",mReceivedByteCount=");
        stringBuilder.append(this.mReceivedByteCount);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
