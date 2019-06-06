package com.snapchat.client.composer;

public final class FlexBoxValue {
    final FlexBoxValueType mType;
    final double mValue;

    public FlexBoxValue(double d, FlexBoxValueType flexBoxValueType) {
        this.mValue = d;
        this.mType = flexBoxValueType;
    }

    public final FlexBoxValueType getType() {
        return this.mType;
    }

    public final double getValue() {
        return this.mValue;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FlexBoxValue{mValue=");
        stringBuilder.append(this.mValue);
        stringBuilder.append(",mType=");
        stringBuilder.append(this.mType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
