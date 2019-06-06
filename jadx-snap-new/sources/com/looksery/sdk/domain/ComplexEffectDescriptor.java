package com.looksery.sdk.domain;

import java.util.Arrays;

public final class ComplexEffectDescriptor {
    private final String mConfig;
    private final String mEffectId;
    private final ComplexEffectFormat mFormat;
    private final boolean mHasWatermark;
    private final boolean mIs3rdParty;
    private final byte[] mLaunchMetadata;
    private final String mResourcesPath;

    public static final class Builder {
        private String mConfig;
        private final String mEffectId;
        private final ComplexEffectFormat mFormat;
        private boolean mHasWatermark;
        private boolean mIs3rdParty;
        private byte[] mLaunchMetadata;
        private final String mResourcesPath;

        private Builder(String str, String str2, ComplexEffectFormat complexEffectFormat) {
            this.mConfig = "";
            this.mLaunchMetadata = null;
            this.mIs3rdParty = false;
            this.mHasWatermark = false;
            this.mEffectId = str;
            this.mResourcesPath = str2;
            this.mFormat = complexEffectFormat;
        }

        /* synthetic */ Builder(String str, String str2, ComplexEffectFormat complexEffectFormat, AnonymousClass1 anonymousClass1) {
            this(str, str2, complexEffectFormat);
        }

        public final ComplexEffectDescriptor build() {
            return new ComplexEffectDescriptor(this);
        }

        public final Builder setConfig(String str) {
            this.mConfig = str;
            return this;
        }

        public final Builder setHasWatermark(boolean z) {
            this.mHasWatermark = z;
            return this;
        }

        public final Builder setIs3rdParty(boolean z) {
            this.mIs3rdParty = z;
            return this;
        }

        public final Builder setLaunchMetadata(byte[] bArr) {
            this.mLaunchMetadata = bArr;
            return this;
        }
    }

    private ComplexEffectDescriptor(Builder builder) {
        this.mEffectId = builder.mEffectId;
        this.mResourcesPath = builder.mResourcesPath;
        this.mFormat = builder.mFormat;
        this.mConfig = builder.mConfig;
        this.mLaunchMetadata = builder.mLaunchMetadata;
        this.mIs3rdParty = builder.mIs3rdParty;
        this.mHasWatermark = builder.mHasWatermark;
    }

    public static Builder newBuilder(String str, String str2) {
        return new Builder(str, str2, ComplexEffectFormat.DIRECTORY, null);
    }

    public static Builder newBuilder(String str, String str2, ComplexEffectFormat complexEffectFormat) {
        return new Builder(str, str2, complexEffectFormat, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComplexEffectDescriptor complexEffectDescriptor = (ComplexEffectDescriptor) obj;
        return (this.mEffectId.equals(complexEffectDescriptor.mEffectId) && this.mResourcesPath.equals(complexEffectDescriptor.mResourcesPath) && this.mFormat.equals(complexEffectDescriptor.mFormat) && this.mConfig.equals(complexEffectDescriptor.mConfig) && this.mIs3rdParty == complexEffectDescriptor.mIs3rdParty && this.mHasWatermark == complexEffectDescriptor.mHasWatermark) ? Arrays.equals(this.mLaunchMetadata, complexEffectDescriptor.mLaunchMetadata) : false;
    }

    public final int hashCode() {
        int hashCode = ((((((this.mEffectId.hashCode() * 31) + this.mResourcesPath.hashCode()) * 31) + this.mFormat.hashCode()) * 31) + this.mConfig.hashCode()) * 31;
        byte[] bArr = this.mLaunchMetadata;
        return ((((hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31) + this.mIs3rdParty) * 31) + this.mHasWatermark;
    }

    public final String toString() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder("ComplexEffectDescriptor{mEffectId='");
        stringBuilder2.append(this.mEffectId);
        stringBuilder2.append('\'');
        stringBuilder2.append(", mResourcesPath=");
        stringBuilder2.append(this.mResourcesPath);
        stringBuilder2.append(", mFormat=");
        stringBuilder2.append(this.mFormat);
        stringBuilder2.append(", mConfig='");
        stringBuilder2.append(this.mConfig);
        stringBuilder2.append('\'');
        stringBuilder2.append(", mIs3rdParty=");
        stringBuilder2.append(this.mIs3rdParty);
        stringBuilder2.append(", mHasWatermark=");
        stringBuilder2.append(this.mHasWatermark);
        stringBuilder2.append(", mLaunchMetadata=");
        if (this.mLaunchMetadata != null) {
            StringBuilder stringBuilder3 = new StringBuilder("size ");
            stringBuilder3.append(this.mLaunchMetadata.length);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "null";
        }
        stringBuilder2.append(stringBuilder);
        stringBuilder2.append('}');
        return stringBuilder2.toString();
    }
}
