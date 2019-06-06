package com.looksery.sdk.domain;

import java.util.Arrays;

public class UriRequest {
    private final String mContentType;
    private final byte[] mData;
    private final String mId;
    private final String mMethod;
    private final String mUri;

    public UriRequest(String str, String str2, byte[] bArr, String str3, String str4) {
        this.mId = str;
        this.mUri = str2;
        this.mData = bArr;
        this.mMethod = str3;
        this.mContentType = str4;
    }

    public String getContentType() {
        return this.mContentType;
    }

    public byte[] getData() {
        return this.mData;
    }

    public String getId() {
        return this.mId;
    }

    public String getMethod() {
        return this.mMethod;
    }

    public String getUri() {
        return this.mUri;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("UriRequest{mId='");
        stringBuilder.append(this.mId);
        stringBuilder.append('\'');
        stringBuilder.append(", mUri='");
        stringBuilder.append(this.mUri);
        stringBuilder.append('\'');
        stringBuilder.append(", mData=");
        stringBuilder.append(Arrays.toString(this.mData));
        stringBuilder.append(", mMethod='");
        stringBuilder.append(this.mMethod);
        stringBuilder.append('\'');
        stringBuilder.append(", mContentType='");
        stringBuilder.append(this.mContentType);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
