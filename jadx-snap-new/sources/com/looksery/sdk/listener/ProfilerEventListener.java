package com.looksery.sdk.listener;

public interface ProfilerEventListener {
    void onBeginSection(String str);

    void onEndSection();
}
