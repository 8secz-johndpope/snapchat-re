package com.looksery.sdk.domain;

public class CrashCrumb {
    public final String activeEffectId;
    public final String upcomingEffectId;

    CrashCrumb(String str, String str2) {
        this.upcomingEffectId = str;
        this.activeEffectId = str2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("{upcoming=");
        stringBuilder.append(this.upcomingEffectId);
        stringBuilder.append(", active=");
        stringBuilder.append(this.activeEffectId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
