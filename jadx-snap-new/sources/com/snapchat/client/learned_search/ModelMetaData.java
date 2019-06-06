package com.snapchat.client.learned_search;

public final class ModelMetaData {
    final String mModelUrl;
    final Integer mModelVersion;
    final StatusEnums mStatusCode;

    public ModelMetaData(String str, Integer num, StatusEnums statusEnums) {
        this.mModelUrl = str;
        this.mModelVersion = num;
        this.mStatusCode = statusEnums;
    }

    public final String getModelUrl() {
        return this.mModelUrl;
    }

    public final Integer getModelVersion() {
        return this.mModelVersion;
    }

    public final StatusEnums getStatusCode() {
        return this.mStatusCode;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ModelMetaData{mModelUrl=");
        stringBuilder.append(this.mModelUrl);
        stringBuilder.append(",mModelVersion=");
        stringBuilder.append(this.mModelVersion);
        stringBuilder.append(",mStatusCode=");
        stringBuilder.append(this.mStatusCode);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
