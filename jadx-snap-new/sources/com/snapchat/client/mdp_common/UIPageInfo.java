package com.snapchat.client.mdp_common;

import java.util.ArrayList;

public final class UIPageInfo {
    final ArrayList<String> mPageHierarchy;

    public UIPageInfo(ArrayList<String> arrayList) {
        this.mPageHierarchy = arrayList;
    }

    public final ArrayList<String> getPageHierarchy() {
        return this.mPageHierarchy;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UIPageInfo{mPageHierarchy=");
        stringBuilder.append(this.mPageHierarchy);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
