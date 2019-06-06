package com.snap.composer.views;

import com.snap.composer.utils.CanvasClipper;

public interface ComposerClippableView {
    boolean getClipToBounds();

    boolean getClipToBoundsDefaultValue();

    CanvasClipper getClipper();

    void setClipToBounds(boolean z);
}
