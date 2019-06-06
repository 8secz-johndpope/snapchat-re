package com.snap.ui.view;

public interface RoundedView {
    float getCornerRadiusBottomLeft();

    float getCornerRadiusBottomRight();

    float getCornerRadiusTopLeft();

    float getCornerRadiusTopRight();

    boolean isCircular();

    void setCircular(boolean z);

    void setCornerRadii(float f);

    void setCornerRadii(float f, float f2, float f3, float f4);

    void setCornerRadiusBottomLeft(float f);

    void setCornerRadiusBottomRight(float f);

    void setCornerRadiusTopLeft(float f);

    void setCornerRadiusTopRight(float f);
}
