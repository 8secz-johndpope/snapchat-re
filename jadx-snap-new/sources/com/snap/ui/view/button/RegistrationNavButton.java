package com.snap.ui.view.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.zhg.a;

public class RegistrationNavButton extends LinearLayout {
    private int mBackgroundResourceId;
    private View mContainerView;
    private int mNavButtonStyle;
    private LoadingSpinnerView mProgressBar;
    private SnapFontTextView mTextView;

    /* renamed from: com.snap.ui.view.button.RegistrationNavButton$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$snap$ui$view$button$RegistrationNavButton$State = new int[State.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = com.snap.ui.view.button.RegistrationNavButton.State.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$snap$ui$view$button$RegistrationNavButton$State = r0;
            r0 = $SwitchMap$com$snap$ui$view$button$RegistrationNavButton$State;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.snap.ui.view.button.RegistrationNavButton.State.ENABLED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$snap$ui$view$button$RegistrationNavButton$State;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.snap.ui.view.button.RegistrationNavButton.State.IN_PROGRESS;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = $SwitchMap$com$snap$ui$view$button$RegistrationNavButton$State;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.snap.ui.view.button.RegistrationNavButton.State.DISABLE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.ui.view.button.RegistrationNavButton$AnonymousClass1.<clinit>():void");
        }
    }

    enum State {
        DISABLE,
        ENABLED,
        IN_PROGRESS
    }

    public RegistrationNavButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.registration_nav_button, this);
        parseAttributes(context, attributeSet);
    }

    private void parseAttributes(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f);
        try {
            this.mBackgroundResourceId = obtainStyledAttributes.getResourceId(0, R.drawable.blue_button_selector);
            this.mNavButtonStyle = obtainStyledAttributes.getResourceId(1, R.style.registration_nav_button_text);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void updateViews(State state) {
        int i = AnonymousClass1.$SwitchMap$com$snap$ui$view$button$RegistrationNavButton$State[state.ordinal()];
        if (i == 1) {
            this.mContainerView.setEnabled(true);
            this.mContainerView.setClickable(true);
            this.mProgressBar.setVisibility(8);
        } else if (i != 2) {
            if (i == 3) {
                this.mContainerView.setEnabled(false);
                this.mContainerView.setClickable(false);
                this.mProgressBar.setVisibility(8);
            }
        } else {
            this.mContainerView.setEnabled(false);
            this.mContainerView.setClickable(false);
            this.mProgressBar.setVisibility(0);
        }
    }

    public void disable(int i) {
        setText(i);
        updateViews(State.DISABLE);
    }

    public void disableWithString(String str) {
        setText((CharSequence) str);
        updateViews(State.DISABLE);
    }

    public void enable(int i) {
        setText(i);
        updateViews(State.ENABLED);
    }

    public void enable(String str) {
        setText((CharSequence) str);
        updateViews(State.ENABLED);
    }

    public boolean isShowingProgressBar() {
        return this.mProgressBar.getVisibility() == 0;
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.mContainerView = findViewById(R.id.registration_nav_container);
        this.mProgressBar = (LoadingSpinnerView) findViewById(R.id.progress_bar);
        this.mTextView = (SnapFontTextView) findViewById(R.id.button_text);
        this.mContainerView.setBackgroundResource(this.mBackgroundResourceId);
        if (this.mNavButtonStyle != R.style.registration_nav_button_text) {
            this.mTextView.setTextAppearance(getContext(), this.mNavButtonStyle);
        }
        updateViews(State.DISABLE);
    }

    public void setBackgroundColor(int i) {
        this.mContainerView.setBackgroundColor(i);
    }

    public void setBackgroundResourceId(int i) {
        this.mBackgroundResourceId = i;
        this.mContainerView.setBackgroundResource(this.mBackgroundResourceId);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.mContainerView.setOnClickListener(onClickListener);
    }

    public void setText(int i) {
        setText(i == 0 ? "" : getContext().getResources().getString(i));
    }

    public void setText(CharSequence charSequence) {
        this.mTextView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.mTextView.setText(charSequence);
    }

    public void setTextAppearance(int i) {
        this.mTextView.setTextAppearance(getContext(), i);
    }

    public void setTextColor(int i) {
        this.mTextView.setTextColor(i);
    }

    public void setTextSize(int i) {
        this.mTextView.setTextSize((float) i);
    }

    public void showProgressBar(int i) {
        setText(i);
        updateViews(State.IN_PROGRESS);
    }

    public void showProgressBar(String str) {
        setText((CharSequence) str);
        updateViews(State.IN_PROGRESS);
    }
}
