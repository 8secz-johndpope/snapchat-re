package com.snapchat.client.composer;

public final class CompositeAttributePart {
    final String mAttribute;
    final boolean mInvalidateLayoutOnChange;
    final boolean mOptional;
    final AttributeType mType;

    public CompositeAttributePart(String str, AttributeType attributeType, boolean z, boolean z2) {
        this.mAttribute = str;
        this.mType = attributeType;
        this.mOptional = z;
        this.mInvalidateLayoutOnChange = z2;
    }

    public final String getAttribute() {
        return this.mAttribute;
    }

    public final boolean getInvalidateLayoutOnChange() {
        return this.mInvalidateLayoutOnChange;
    }

    public final boolean getOptional() {
        return this.mOptional;
    }

    public final AttributeType getType() {
        return this.mType;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompositeAttributePart{mAttribute=");
        stringBuilder.append(this.mAttribute);
        stringBuilder.append(",mType=");
        stringBuilder.append(this.mType);
        stringBuilder.append(",mOptional=");
        stringBuilder.append(this.mOptional);
        stringBuilder.append(",mInvalidateLayoutOnChange=");
        stringBuilder.append(this.mInvalidateLayoutOnChange);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
