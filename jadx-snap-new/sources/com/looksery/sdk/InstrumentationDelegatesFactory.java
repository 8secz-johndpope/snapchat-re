package com.looksery.sdk;

import com.looksery.sdk.listener.ProfilerEventListener;

public interface InstrumentationDelegatesFactory {
    Logger newLogger();

    ProfilerEventListener newProfilerEventListener();
}
