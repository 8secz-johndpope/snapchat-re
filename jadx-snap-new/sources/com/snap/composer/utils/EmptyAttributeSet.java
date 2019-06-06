package com.snap.composer.utils;

import android.util.AttributeSet;

public final class EmptyAttributeSet implements AttributeSet {
    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return z;
    }

    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        return z;
    }

    public final int getAttributeCount() {
        return 0;
    }

    public final float getAttributeFloatValue(int i, float f) {
        return f;
    }

    public final float getAttributeFloatValue(String str, String str2, float f) {
        return f;
    }

    public final int getAttributeIntValue(int i, int i2) {
        return i2;
    }

    public final int getAttributeIntValue(String str, String str2, int i) {
        return i;
    }

    public final int getAttributeListValue(int i, String[] strArr, int i2) {
        return i2;
    }

    public final int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return i;
    }

    public final String getAttributeName(int i) {
        return "";
    }

    public final int getAttributeNameResource(int i) {
        return 0;
    }

    public final int getAttributeResourceValue(int i, int i2) {
        return i2;
    }

    public final int getAttributeResourceValue(String str, String str2, int i) {
        return i;
    }

    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return i2;
    }

    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        return i;
    }

    public final String getAttributeValue(int i) {
        return "";
    }

    public final String getAttributeValue(String str, String str2) {
        return "";
    }

    public final String getClassAttribute() {
        return "";
    }

    public final String getIdAttribute() {
        return "";
    }

    public final int getIdAttributeResourceValue(int i) {
        return i;
    }

    public final String getPositionDescription() {
        return "";
    }

    public final int getStyleAttribute() {
        return 0;
    }
}
