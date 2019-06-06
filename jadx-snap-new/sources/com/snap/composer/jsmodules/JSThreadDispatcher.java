package com.snap.composer.jsmodules;

public interface JSThreadDispatcher {
    void runOnJsThread(Runnable runnable);
}
