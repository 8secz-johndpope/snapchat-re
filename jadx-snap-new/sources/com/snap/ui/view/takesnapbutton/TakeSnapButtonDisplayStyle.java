package com.snap.ui.view.takesnapbutton;

import android.graphics.Canvas;

public interface TakeSnapButtonDisplayStyle {
    void draw(Canvas canvas);

    void onDetached();

    void prepareAnimation();

    void startAnimation();

    void stopAnimation();
}
