package com.snapchat.client.composer;

public final class PercentValue {
    final PercentValueType mType;
    final double mValue;

    public PercentValue(double d, PercentValueType percentValueType) {
        this.mValue = d;
        this.mType = percentValueType;
    }

    public final PercentValueType getType() {
        return this.mType;
    }

    public final double getValue() {
        return this.mValue;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("PercentValue{mValue=");
        stringBuilder.append(this.mValue);
        stringBuilder.append(",mType=");
        stringBuilder.append(this.mType);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
