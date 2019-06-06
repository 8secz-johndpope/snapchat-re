package com.snap.composer.views;

public interface ComposerTouchTarget {
    boolean canHandleTouchEvents();

    boolean requiresInterceptBeforeHandlingTouchEvents();
}
