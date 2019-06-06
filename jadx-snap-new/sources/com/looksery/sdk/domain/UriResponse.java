package com.looksery.sdk.domain;

import java.util.Arrays;

public class UriResponse {
    private final String mContentType;
    private final byte[] mData;
    private final String mDescription;
    private final int mResponseCode;
    private final String mUri;

    public UriResponse(String str, String str2, int i, byte[] bArr, String str3) {
        this.mUri = str;
        this.mDescription = str2;
        this.mResponseCode = i;
        this.mData = bArr;
        this.mContentType = str3;
    }

    public String getContentType() {
        return this.mContentType;
    }

    public byte[] getData() {
        return this.mData;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public int getResponseCode() {
        return this.mResponseCode;
    }

    public String getUri() {
        return this.mUri;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("UriResponse{mUri='");
        stringBuilder.append(this.mUri);
        stringBuilder.append('\'');
        stringBuilder.append(", mDescription='");
        stringBuilder.append(this.mDescription);
        stringBuilder.append('\'');
        stringBuilder.append(", mResponseCode=");
        stringBuilder.append(this.mResponseCode);
        stringBuilder.append(", mData=");
        stringBuilder.append(Arrays.toString(this.mData));
        stringBuilder.append(", mContentType='");
        stringBuilder.append(this.mContentType);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
