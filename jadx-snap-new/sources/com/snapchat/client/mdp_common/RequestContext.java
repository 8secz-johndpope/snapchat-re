package com.snapchat.client.mdp_common;

public final class RequestContext {
    final float mImportance;
    final UIPageInfo mUiPageInfo;

    public RequestContext(UIPageInfo uIPageInfo, float f) {
        this.mUiPageInfo = uIPageInfo;
        this.mImportance = f;
    }

    public final float getImportance() {
        return this.mImportance;
    }

    public final UIPageInfo getUiPageInfo() {
        return this.mUiPageInfo;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestContext{mUiPageInfo=");
        stringBuilder.append(this.mUiPageInfo);
        stringBuilder.append(",mImportance=");
        stringBuilder.append(this.mImportance);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
