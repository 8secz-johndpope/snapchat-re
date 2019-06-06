package com.snap.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.akco;
import defpackage.akcr;
import defpackage.zhg.a;

public class LoadingSpinnerButtonView extends LinearLayout {
    private ButtonState currentState;
    private final int mCheckedBackgroundStrokeColor;
    private final int mCheckedBgColor;
    private int mCheckedIconResId;
    private final int mCheckedIconSize;
    private final ViewStubWrapper<ImageView> mCheckedIconStub;
    private String mCheckedString;
    private final int mCheckedTextColor;
    private final ViewStubWrapper<LoadingSpinnerView> mSpinnerStub;
    private final TextView mText;
    private final int mTextFontWeight;
    private int mUncheckedBackgroundStrokeColor;
    private final int mUncheckedBgColor;
    private final ImageView mUncheckedIcon;
    private final int mUncheckedIconResId;
    private final int mUncheckedIconSize;
    private String mUncheckedString;
    private int mUncheckedTextColor;
    private final View mView;

    public enum ButtonState {
        UNCHECKED,
        UNCHECKED_LOADING,
        CHECKED,
        CHECKED_LOADING
    }

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[ButtonState.UNCHECKED.ordinal()] = 1;
            $EnumSwitchMapping$0[ButtonState.UNCHECKED_LOADING.ordinal()] = 2;
            $EnumSwitchMapping$0[ButtonState.CHECKED.ordinal()] = 3;
            $EnumSwitchMapping$0[ButtonState.CHECKED_LOADING.ordinal()] = 4;
            iArr = new int[ButtonState.values().length];
            $EnumSwitchMapping$1 = iArr;
            iArr[ButtonState.UNCHECKED.ordinal()] = 1;
            $EnumSwitchMapping$1[ButtonState.CHECKED_LOADING.ordinal()] = 2;
            $EnumSwitchMapping$1[ButtonState.CHECKED.ordinal()] = 3;
            $EnumSwitchMapping$1[ButtonState.UNCHECKED_LOADING.ordinal()] = 4;
        }
    }

    public LoadingSpinnerButtonView(Context context) {
        this(context, null, 2, null);
    }

    public LoadingSpinnerButtonView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        this.currentState = ButtonState.UNCHECKED;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.c);
        try {
            this.mCheckedString = obtainStyledAttributes.getString(4);
            this.mUncheckedString = obtainStyledAttributes.getString(11);
            this.mCheckedTextColor = obtainStyledAttributes.getColor(5, getResources().getColor(R.color.regular_purple));
            this.mUncheckedTextColor = obtainStyledAttributes.getColor(12, getResources().getColor(R.color.regular_blue));
            this.mCheckedBgColor = obtainStyledAttributes.getColor(0, getResources().getColor(R.color.white));
            this.mUncheckedBgColor = obtainStyledAttributes.getColor(7, getResources().getColor(R.color.white));
            this.mCheckedIconResId = obtainStyledAttributes.getResourceId(2, R.drawable.snap_circle_button);
            this.mUncheckedIconResId = obtainStyledAttributes.getResourceId(9, R.drawable.plus_icon);
            this.mCheckedBackgroundStrokeColor = obtainStyledAttributes.getColor(1, getResources().getColor(R.color.regular_purple_thirty_opacity));
            this.mUncheckedBackgroundStrokeColor = obtainStyledAttributes.getColor(8, getResources().getColor(R.color.regular_blue_thirty_opacity));
            this.mUncheckedIconSize = obtainStyledAttributes.getResourceId(10, R.dimen.icon_size_extra_extra_smaller);
            this.mCheckedIconSize = obtainStyledAttributes.getResourceId(3, R.dimen.icon_size_extra_extra_smaller);
            this.mTextFontWeight = obtainStyledAttributes.getInt(6, 0);
            Object systemService = getContext().getSystemService("layout_inflater");
            if (systemService != null) {
                systemService = ((LayoutInflater) systemService).inflate(R.layout.loading_spinner_button, this);
                akcr.a(systemService, "inflater.inflate(R.layou…ing_spinner_button, this)");
                this.mView = systemService;
                systemService = this.mView.findViewById(R.id.loading_spinner_button_unchecked_state_icon);
                akcr.a(systemService, "mView.findViewById(R.id.…ton_unchecked_state_icon)");
                this.mUncheckedIcon = (ImageView) systemService;
                systemService = this.mView.findViewById(R.id.loading_spinner_button_text);
                akcr.a(systemService, "mView.findViewById(R.id.…ding_spinner_button_text)");
                this.mText = (TextView) systemService;
                Object findViewById = findViewById(R.id.loading_spinner_button_checked_state_icon_stub);
                akcr.a(findViewById, "findViewById(R.id.loadin…_checked_state_icon_stub)");
                this.mCheckedIconStub = new ViewStubWrapper((ViewStub) findViewById);
                findViewById = findViewById(R.id.loading_spinner_button_spinner_stub);
                akcr.a(findViewById, "findViewById(R.id.loadin…nner_button_spinner_stub)");
                this.mSpinnerStub = new ViewStubWrapper((ViewStub) findViewById);
                initButton();
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.LayoutInflater");
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ LoadingSpinnerButtonView(Context context, AttributeSet attributeSet, int i, akco akco) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    private final void initButton() {
        this.mUncheckedIcon.setColorFilter(this.mUncheckedTextColor);
        this.mUncheckedIcon.setImageResource(this.mUncheckedIconResId);
        updateIconSize(this.mUncheckedIcon, this.mUncheckedIconSize);
        this.mCheckedIconStub.setOnInflatedListener(new LoadingSpinnerButtonView$initButton$1(this));
        this.mView.setBackgroundResource(R.drawable.loading_spinner_button_selector);
        TextView textView = this.mText;
        if (!(textView instanceof SnapFontTextView)) {
            textView = null;
        }
        SnapFontTextView snapFontTextView = (SnapFontTextView) textView;
        if (snapFontTextView != null) {
            snapFontTextView.setTypefaceStyle(this.mTextFontWeight);
        }
    }

    private final void reload() {
        setButtonState(this.currentState);
    }

    private final void updateBackgroundResource(ButtonState buttonState) {
        if (this.mView.getBackground() != null) {
            Object background = this.mView.getBackground();
            akcr.a(background, "mView.background");
            Drawable current = background.getCurrent();
            if (current instanceof GradientDrawable) {
                int i = WhenMappings.$EnumSwitchMapping$1[buttonState.ordinal()];
                GradientDrawable gradientDrawable;
                if (i == 1 || i == 2) {
                    gradientDrawable = (GradientDrawable) current;
                    gradientDrawable.setColor(this.mUncheckedBgColor);
                    gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.loading_spinner_button_stroke_width), this.mUncheckedBackgroundStrokeColor);
                } else if (i == 3 || i == 4) {
                    gradientDrawable = (GradientDrawable) current;
                    gradientDrawable.setColor(this.mCheckedBgColor);
                    gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.loading_spinner_button_stroke_width), this.mCheckedBackgroundStrokeColor);
                }
            }
        }
    }

    private final void updateIconSize(ImageView imageView, int i) {
        LayoutParams layoutParams = imageView.getLayoutParams();
        i = getResources().getDimensionPixelSize(i);
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
    }

    public final void setButtonState(ButtonState buttonState) {
        akcr.b(buttonState, "state");
        int i = WhenMappings.$EnumSwitchMapping$0[buttonState.ordinal()];
        TextView textView;
        if (i != 1) {
            LoadingSpinnerView loadingSpinnerView;
            if (i == 2) {
                this.mUncheckedIcon.setVisibility(8);
                this.mSpinnerStub.setVisibility(0);
                this.mCheckedIconStub.setVisibility(8);
                textView = this.mText;
                textView.setText(this.mCheckedString);
                textView.setTextColor(this.mCheckedTextColor);
                loadingSpinnerView = (LoadingSpinnerView) this.mSpinnerStub.getIfInflated();
                if (loadingSpinnerView != null) {
                    loadingSpinnerView.setColor(this.mCheckedTextColor);
                }
                setClickable(false);
            } else if (i != 3) {
                if (i == 4) {
                    this.mUncheckedIcon.setVisibility(8);
                    this.mSpinnerStub.setVisibility(0);
                    this.mCheckedIconStub.setVisibility(8);
                    textView = this.mText;
                    textView.setText(this.mUncheckedString);
                    textView.setTextColor(this.mUncheckedTextColor);
                    loadingSpinnerView = (LoadingSpinnerView) this.mSpinnerStub.getIfInflated();
                    if (loadingSpinnerView != null) {
                        loadingSpinnerView.setColor(this.mUncheckedTextColor);
                    }
                    setClickable(false);
                }
                this.currentState = buttonState;
                updateBackgroundResource(buttonState);
            } else {
                this.mUncheckedIcon.setVisibility(8);
                this.mSpinnerStub.setVisibility(8);
                this.mCheckedIconStub.setVisibility(0);
                textView = this.mText;
                textView.setText(this.mCheckedString);
                textView.setTextColor(this.mCheckedTextColor);
                setClickable(true);
            }
            setSelected(true);
            this.currentState = buttonState;
            updateBackgroundResource(buttonState);
        }
        this.mUncheckedIcon.setVisibility(0);
        this.mSpinnerStub.setVisibility(8);
        this.mCheckedIconStub.setVisibility(8);
        textView = this.mText;
        textView.setText(this.mUncheckedString);
        textView.setTextColor(this.mUncheckedTextColor);
        setClickable(true);
        setSelected(false);
        this.currentState = buttonState;
        updateBackgroundResource(buttonState);
    }

    public final void setCheckedIcon(int i) {
        this.mCheckedIconResId = i;
        reload();
    }

    public final void setCheckedText(String str) {
        this.mCheckedString = str;
        reload();
    }

    public final void setUncheckedBackgroundStrokeColor(int i) {
        this.mUncheckedBackgroundStrokeColor = i;
        reload();
    }

    public final void setUncheckedText(String str) {
        this.mUncheckedString = str;
        reload();
    }

    public final void setUncheckedTextColor(int i) {
        this.mUncheckedTextColor = i;
        this.mUncheckedIcon.setColorFilter(this.mUncheckedTextColor);
        reload();
    }
}
