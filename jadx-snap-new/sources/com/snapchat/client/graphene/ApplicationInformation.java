package com.snapchat.client.graphene;

public final class ApplicationInformation {
    final String mBuild;
    final String mFlavor;
    final OperatingSystem mOsType;
    final String mVariant;

    public ApplicationInformation(String str, String str2, OperatingSystem operatingSystem, String str3) {
        this.mBuild = str;
        this.mFlavor = str2;
        this.mOsType = operatingSystem;
        this.mVariant = str3;
    }

    public final String getBuild() {
        return this.mBuild;
    }

    public final String getFlavor() {
        return this.mFlavor;
    }

    public final OperatingSystem getOsType() {
        return this.mOsType;
    }

    public final String getVariant() {
        return this.mVariant;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ApplicationInformation{mBuild=");
        stringBuilder.append(this.mBuild);
        stringBuilder.append(",mFlavor=");
        stringBuilder.append(this.mFlavor);
        stringBuilder.append(",mOsType=");
        stringBuilder.append(this.mOsType);
        stringBuilder.append(",mVariant=");
        stringBuilder.append(this.mVariant);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
