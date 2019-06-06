package com.snapchat.client.network_types;

import java.util.ArrayList;

public final class UIPageInfo {
    final ArrayList<String> mPage;

    public UIPageInfo(ArrayList<String> arrayList) {
        this.mPage = arrayList;
    }

    public final ArrayList<String> getPage() {
        return this.mPage;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UIPageInfo{mPage=");
        stringBuilder.append(this.mPage);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
