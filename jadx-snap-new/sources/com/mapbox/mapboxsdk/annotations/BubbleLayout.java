package com.mapbox.mapboxsdk.annotations;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class BubbleLayout extends LinearLayout {
    public static final float DEFAULT_STROKE_WIDTH = -1.0f;
    private ArrowDirection arrowDirection;
    private float arrowHeight;
    private float arrowPosition;
    private float arrowWidth;
    private Bubble bubble;
    private int bubbleColor;
    private float cornersRadius;
    private int strokeColor;
    private float strokeWidth;

    public BubbleLayout(Context context) {
        this(context, null, 0);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BubbleLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.mapbox_BubbleLayout);
        this.arrowDirection = new ArrowDirection(obtainStyledAttributes.getInt(R.styleable.mapbox_BubbleLayout_mapbox_bl_arrowDirection, 0));
        this.arrowWidth = obtainStyledAttributes.getDimension(R.styleable.mapbox_BubbleLayout_mapbox_bl_arrowWidth, convertDpToPixel(8.0f, context));
        this.arrowHeight = obtainStyledAttributes.getDimension(R.styleable.mapbox_BubbleLayout_mapbox_bl_arrowHeight, convertDpToPixel(8.0f, context));
        this.arrowPosition = obtainStyledAttributes.getDimension(R.styleable.mapbox_BubbleLayout_mapbox_bl_arrowPosition, convertDpToPixel(12.0f, context));
        this.cornersRadius = obtainStyledAttributes.getDimension(R.styleable.mapbox_BubbleLayout_mapbox_bl_cornersRadius, MapboxConstants.MINIMUM_ZOOM);
        this.bubbleColor = obtainStyledAttributes.getColor(R.styleable.mapbox_BubbleLayout_mapbox_bl_bubbleColor, -1);
        this.strokeWidth = obtainStyledAttributes.getDimension(R.styleable.mapbox_BubbleLayout_mapbox_bl_strokeWidth, -1.0f);
        this.strokeColor = obtainStyledAttributes.getColor(R.styleable.mapbox_BubbleLayout_mapbox_bl_strokeColor, -7829368);
        obtainStyledAttributes.recycle();
        initPadding();
    }

    static float convertDpToPixel(float f, Context context) {
        return f * ((float) (context.getResources().getDisplayMetrics().densityDpi / 160));
    }

    private void initDrawable(int i, int i2, int i3, int i4) {
        if (i2 >= i && i4 >= i3) {
            this.bubble = new Bubble(new RectF((float) i, (float) i3, (float) i2, (float) i4), this.arrowDirection, this.arrowWidth, this.arrowHeight, this.arrowPosition, this.cornersRadius, this.bubbleColor, this.strokeWidth, this.strokeColor);
        }
    }

    private void initPadding() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int value = this.arrowDirection.getValue();
        if (value == 0) {
            paddingLeft = (int) (((float) paddingLeft) + this.arrowWidth);
        } else if (value == 1) {
            paddingRight = (int) (((float) paddingRight) + this.arrowWidth);
        } else if (value == 2) {
            paddingTop = (int) (((float) paddingTop) + this.arrowHeight);
        } else if (value == 3) {
            paddingBottom = (int) (((float) paddingBottom) + this.arrowHeight);
        }
        float f = this.strokeWidth;
        if (f > MapboxConstants.MINIMUM_ZOOM) {
            paddingLeft = (int) (((float) paddingLeft) + f);
            paddingRight = (int) (((float) paddingRight) + f);
            paddingTop = (int) (((float) paddingTop) + f);
            paddingBottom = (int) (((float) paddingBottom) + f);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    private void resetPadding() {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int value = this.arrowDirection.getValue();
        if (value == 0) {
            paddingLeft = (int) (((float) paddingLeft) - this.arrowWidth);
        } else if (value == 1) {
            paddingRight = (int) (((float) paddingRight) - this.arrowWidth);
        } else if (value == 2) {
            paddingTop = (int) (((float) paddingTop) - this.arrowHeight);
        } else if (value == 3) {
            paddingBottom = (int) (((float) paddingBottom) - this.arrowHeight);
        }
        float f = this.strokeWidth;
        if (f > MapboxConstants.MINIMUM_ZOOM) {
            paddingLeft = (int) (((float) paddingLeft) - f);
            paddingRight = (int) (((float) paddingRight) - f);
            paddingTop = (int) (((float) paddingTop) - f);
            paddingBottom = (int) (((float) paddingBottom) - f);
        }
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    /* Access modifiers changed, original: protected */
    public void dispatchDraw(Canvas canvas) {
        Bubble bubble = this.bubble;
        if (bubble != null) {
            bubble.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public ArrowDirection getArrowDirection() {
        return this.arrowDirection;
    }

    public float getArrowHeight() {
        return this.arrowHeight;
    }

    public float getArrowPosition() {
        return this.arrowPosition;
    }

    public float getArrowWidth() {
        return this.arrowWidth;
    }

    public int getBubbleColor() {
        return this.bubbleColor;
    }

    public float getCornersRadius() {
        return this.cornersRadius;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        initDrawable(0, getWidth(), 0, getHeight());
    }

    public BubbleLayout setArrowDirection(ArrowDirection arrowDirection) {
        resetPadding();
        this.arrowDirection = arrowDirection;
        initPadding();
        return this;
    }

    public BubbleLayout setArrowHeight(float f) {
        resetPadding();
        this.arrowHeight = f;
        initPadding();
        return this;
    }

    public BubbleLayout setArrowPosition(float f) {
        resetPadding();
        this.arrowPosition = f;
        initPadding();
        return this;
    }

    public BubbleLayout setArrowWidth(float f) {
        resetPadding();
        this.arrowWidth = f;
        initPadding();
        return this;
    }

    public BubbleLayout setBubbleColor(int i) {
        this.bubbleColor = i;
        requestLayout();
        return this;
    }

    public BubbleLayout setCornersRadius(float f) {
        this.cornersRadius = f;
        requestLayout();
        return this;
    }

    public BubbleLayout setStrokeColor(int i) {
        this.strokeColor = i;
        requestLayout();
        return this;
    }

    public BubbleLayout setStrokeWidth(float f) {
        resetPadding();
        this.strokeWidth = f;
        initPadding();
        return this;
    }
}
