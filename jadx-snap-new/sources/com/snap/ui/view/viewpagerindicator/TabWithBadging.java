package com.snap.ui.view.viewpagerindicator;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;

public class TabWithBadging extends FrameLayout {
    private FrameLayout badge;
    private SnapFontTextView badgingText;
    private SnapFontTextView titleText;

    public TabWithBadging(Context context) {
        this(context, null);
    }

    public TabWithBadging(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabWithBadging(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup viewGroup = (ViewGroup) inflate(context, R.layout.tab_with_badging, this);
        this.titleText = (SnapFontTextView) viewGroup.findViewById(R.id.title_text);
        this.badgingText = (SnapFontTextView) viewGroup.findViewById(R.id.badge_text);
        this.badge = (FrameLayout) viewGroup.findViewById(R.id.badge);
    }

    public TextView getTitleTextView() {
        return this.titleText;
    }

    public void setAlpha(float f) {
        this.titleText.setAlpha(f);
    }

    public void setBadgingText(CharSequence charSequence) {
        this.badgingText.setText(charSequence);
        this.badge.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setTextColor(int i) {
        this.titleText.setTextColor(i);
    }

    public void setTitleText(CharSequence charSequence) {
        this.titleText.setText(charSequence);
    }
}
