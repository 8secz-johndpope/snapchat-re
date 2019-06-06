package com.snap.composer;

public interface DebugMessagePresenter {

    public enum Level {
        INFO,
        ERROR
    }

    void presentDebugMessage(Level level, String str);
}
