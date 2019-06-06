package com.brightcove.player.captioning;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.brightcove.player.R;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class BrightcoveClosedCaptioningTextView extends TextView {
    public static final String TAG = "BrightcoveClosedCaptioningTextView";
    private int a = 0;

    public BrightcoveClosedCaptioningTextView(Context context) {
        super(context);
        a();
    }

    public BrightcoveClosedCaptioningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public BrightcoveClosedCaptioningTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private static int a(int i, int i2) {
        return Color.argb(Color.alpha(i2), Color.red(i), Color.green(i), Color.blue(i));
    }

    private void a() {
        setSingleLine(false);
        setPadding(3, 3, 3, 3);
    }

    public void onDraw(Canvas canvas) {
        if (this.a == 1) {
            for (int i = 0; i < 4; i++) {
                super.onDraw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void setStyle(BrightcoveCaptionStyle brightcoveCaptionStyle) {
        int edgeColor = brightcoveCaptionStyle.edgeColor();
        this.a = brightcoveCaptionStyle.edgeType();
        setTypeface(Typeface.create(brightcoveCaptionStyle.typeface(), 0));
        int i = this.a;
        if (i == 0) {
            setShadowLayer(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, 0);
        } else if (i == 3) {
            setShadowLayer(0.01f, 2.0f, MapboxConstants.MINIMUM_ZOOM, edgeColor);
        } else if (i == 4) {
            setShadowLayer(0.01f, -2.0f, MapboxConstants.MINIMUM_ZOOM, edgeColor);
        } else if (i == 1) {
            setShadowLayer(6.0f, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, edgeColor);
        } else if (i == 2) {
            setShadowLayer(0.01f, 2.0f, 2.0f, edgeColor);
        }
        if (!getText().equals("")) {
            edgeColor = a(brightcoveCaptionStyle.windowColor(), brightcoveCaptionStyle.windowOpacity());
            ViewParent parent = getParent();
            if (parent == null || ((ViewGroup) parent).getId() != R.id.caption_block) {
                if (this.a == 1) {
                    edgeColor = Color.argb(Color.alpha(edgeColor) / 5, Color.red(edgeColor), Color.green(edgeColor), Color.blue(edgeColor));
                }
                setBackgroundColor(edgeColor);
            } else {
                ((LinearLayout) parent).setBackgroundColor(edgeColor);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            SpannableString spannableString = new SpannableString(getText());
            int length = getText().length();
            int a = a(brightcoveCaptionStyle.foregroundColor(), brightcoveCaptionStyle.foregroundOpacity());
            int a2 = a(brightcoveCaptionStyle.backgroundColor(), brightcoveCaptionStyle.backgroundOpacity());
            if (this.a == 1) {
                a2 = Color.argb(Color.alpha(a2) / 4, Color.red(a2), Color.green(a2), Color.blue(a2));
            }
            spannableString.setSpan(new ForegroundColorSpan(a), 0, length, 33);
            spannableString.setSpan(new BackgroundColorSpan(a2), 0, length, 33);
            Float valueOf = Float.valueOf(24.0f);
            Float valueOf2 = Float.valueOf(Float.parseFloat(brightcoveCaptionStyle.fontSize()));
            if (valueOf2.floatValue() > MapboxConstants.MINIMUM_ZOOM && valueOf.floatValue() > MapboxConstants.MINIMUM_ZOOM) {
                setTextSize(valueOf2.floatValue() * valueOf.floatValue());
            }
            spannableStringBuilder.append(spannableString);
            setText(spannableStringBuilder);
        }
    }
}
