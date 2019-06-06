package com.snapchat.client.network_types;

public final class Header {
    final String mKey;
    final String mValue;

    public Header(String str, String str2) {
        this.mKey = str;
        this.mValue = str2;
    }

    public final String getKey() {
        return this.mKey;
    }

    public final String getValue() {
        return this.mValue;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Header{mKey=");
        stringBuilder.append(this.mKey);
        stringBuilder.append(",mValue=");
        stringBuilder.append(this.mValue);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
