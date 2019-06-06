package com.snap.ui.view.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.abur;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akco;
import defpackage.akcr;
import defpackage.zhg.a;

public class ScButton extends LinearLayout {
    private final abur<LoadingSpinnerView> spinnerLazyView;
    private final SnapFontTextView textView;

    public static final class Builder {
        private Integer _color;
        private Integer _colorPressed;
        private boolean _enabled = true;
        private OnClickListener _onClick;
        private boolean _roundedCorners = true;
        private boolean _spinner;
        private String _text;
        private Integer _textColor;
        private int _visibility;

        public final Builder backgroundColors(int i, Integer num) {
            this._color = Integer.valueOf(i);
            this._colorPressed = num;
            return this;
        }

        public final ScButton build(Context context) {
            akcr.b(context, "context");
            ScButton scButton = new ScButton(context, null, 2, null);
            scButton.setText(this._text);
            scButton.setTextColor(this._textColor);
            scButton.setVisibility(this._visibility);
            scButton.setBackgroundColors(this._color, this._colorPressed, this._roundedCorners);
            scButton.setSpinnerVisibility(this._spinner);
            OnClickListener onClickListener = this._onClick;
            if (onClickListener != null) {
                scButton.setOnClickListener(onClickListener);
            }
            scButton.setEnabled(this._enabled);
            return scButton;
        }

        public final ajxe<ScButton> buildLazy(Context context) {
            akcr.b(context, "context");
            return ajxh.a(new ScButton$Builder$buildLazy$1(this, context));
        }

        public final Builder disabled() {
            this._enabled = false;
            return this;
        }

        public final Builder onClick(OnClickListener onClickListener) {
            akcr.b(onClickListener, "onClick");
            this._onClick = onClickListener;
            return this;
        }

        public final Builder rectangular() {
            this._roundedCorners = false;
            return this;
        }

        public final Builder setVisibility(int i) {
            this._visibility = i;
            return this;
        }

        public final Builder spinner() {
            this._spinner = true;
            return this;
        }

        public final Builder text(String str) {
            akcr.b(str, "text");
            this._text = str;
            return this;
        }

        public final Builder textColor(int i) {
            this._textColor = Integer.valueOf(i);
            return this;
        }
    }

    public ScButton(Context context) {
        this(context, null, 2, null);
    }

    public ScButton(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        setOrientation(0);
        setGravity(17);
        LayoutInflater.from(context).inflate(R.layout.button_thing, this, true);
        this.spinnerLazyView = new abur((View) this, (int) R.id.button_spinner_stub, (int) R.id.button_spinner);
        Object findViewById = findViewById(R.id.button_text);
        akcr.a(findViewById, "findViewById(R.id.button_text)");
        this.textView = (SnapFontTextView) findViewById;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.i, 0, 0);
            try {
                setText(obtainStyledAttributes.getString(4));
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(5);
                if (colorStateList != null) {
                    setTextColor(colorStateList);
                }
                setSpinnerVisibility(obtainStyledAttributes.getBoolean(3, false));
                setBackgroundColors$default(this, Integer.valueOf(obtainStyledAttributes.getColor(1, getResources().getColor(R.color.regular_purple))), Integer.valueOf(obtainStyledAttributes.getColor(2, getResources().getColor(R.color.dark_purple))), false, 4, null);
                Drawable drawable = obtainStyledAttributes.getDrawable(0);
                if (drawable != null) {
                    setBackground(drawable);
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public /* synthetic */ ScButton(Context context, AttributeSet attributeSet, int i, akco akco) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public static /* synthetic */ void setBackgroundColors$default(ScButton scButton, Integer num, Integer num2, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = true;
            }
            scButton.setBackgroundColors(num, num2, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setBackgroundColors");
    }

    public final abur<LoadingSpinnerView> getSpinnerLazyView() {
        return this.spinnerLazyView;
    }

    public final SnapFontTextView getTextView() {
        return this.textView;
    }

    public final void setBackgroundColors(Integer num, Integer num2, boolean z) {
        int intValue;
        StateListDrawable stateListDrawable = new StateListDrawable();
        String str = "context";
        if (num2 != null) {
            int[] iArr = new int[]{16842919};
            Object context = getContext();
            akcr.a(context, str);
            stateListDrawable.addState(iArr, new ButtonBackgroundDrawable(context, num2.intValue(), z));
        }
        int[] iArr2 = new int[0];
        Object context2 = getContext();
        akcr.a(context2, str);
        if (num != null) {
            intValue = num.intValue();
        } else {
            Object context3 = getContext();
            akcr.a(context3, str);
            intValue = context3.getResources().getColor(R.color.regular_purple);
        }
        stateListDrawable.addState(iArr2, new ButtonBackgroundDrawable(context2, intValue, z));
        setBackground(stateListDrawable);
    }

    public final void setSpinnerVisibility(boolean z) {
        abur abur;
        int i;
        if (z) {
            abur = this.spinnerLazyView;
            i = 0;
        } else {
            abur = this.spinnerLazyView;
            i = 8;
        }
        abur.a(i);
    }

    public final void setText(String str) {
        this.textView.setText(str);
    }

    public final void setTextColor(ColorStateList colorStateList) {
        akcr.b(colorStateList, "color");
        this.textView.setTextColor(colorStateList);
    }

    public final void setTextColor(Integer num) {
        this.textView.setTextColor(num != null ? num.intValue() : -1);
    }
}
