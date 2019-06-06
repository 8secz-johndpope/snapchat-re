package com.snap.ui.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.absj.a;
import defpackage.abtc;
import defpackage.abtj;
import defpackage.zhg;
import defpackage.zpj;

public class ScHeaderView extends FrameLayout {
    private int mArrowColorScheme;
    private ImageView mBackArrow;
    private int mColorScheme;
    private int mHeaderArrowRotation;
    private String mHeaderTitle;
    private boolean mIncludeStatusBarHeight;
    private ImageView mRightImage;
    private int mRightImageResourceId;
    private View mRightLayout;
    private int mRightLayoutResourceId;
    private boolean mShouldShowBackArrow;
    private boolean mShouldShowBottomBorder;
    private int mStatusBarHeight;
    private final int mTitleMargin;
    private TextView mTitleTextView;
    private final int mTitleWithBackArrowMargin;

    public ScHeaderView(Context context) {
        this(context, null);
    }

    public ScHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRightImageResourceId = -1;
        this.mRightLayoutResourceId = -1;
        this.mHeaderArrowRotation = 0;
        parseAttributes(attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.sc_header_view, this, true);
        if (getLayoutParams() == null) {
            setLayoutParams(new LayoutParams(context, attributeSet));
        }
        this.mTitleMargin = getResources().getDimensionPixelSize(R.dimen.default_gap);
        this.mTitleWithBackArrowMargin = getResources().getDimensionPixelSize(R.dimen.neon_header_back_button_width);
        initViews();
    }

    private void initOverallScHeaderView(LayoutParams layoutParams) {
        layoutParams.height = getResources().getDimensionPixelSize(R.dimen.sc_header_height);
        layoutParams.width = -1;
        setClickable(true);
        setLayoutDirection(0);
        setLayoutParams(layoutParams);
        if (getId() == -1) {
            setId(R.id.overall_sc_header);
        }
    }

    private void initScHeaderBackArrow() {
        this.mBackArrow = (ImageView) findViewById(R.id.sc_header_back_arrow);
        ImageView imageView = this.mBackArrow;
        imageView.setOnTouchListener(new abtc(imageView));
        this.mBackArrow.setOnClickListener(new -$$Lambda$ScHeaderView$ci_JHZ2udLeD-g6F0dr2r07MXcM(this));
        int i = this.mColorScheme;
        if (i != R.color.white) {
            this.mBackArrow.setColorFilter(i, Mode.MULTIPLY);
        }
        i = this.mArrowColorScheme;
        if (i != -1) {
            this.mBackArrow.setColorFilter(i, Mode.MULTIPLY);
        }
        if (this.mIncludeStatusBarHeight) {
            setTopMargin(this.mBackArrow, this.mStatusBarHeight);
        }
        i = this.mHeaderArrowRotation;
        if (i != 0) {
            this.mBackArrow.setRotation((float) i);
            ((FrameLayout.LayoutParams) this.mBackArrow.getLayoutParams()).gravity = 16;
        }
        this.mBackArrow.setVisibility(0);
    }

    private void initScHeaderRightImage() {
        this.mRightImage = (ImageView) findViewById(R.id.sc_header_right_image);
        this.mRightImage.setImageDrawable(getResources().getDrawable(this.mRightImageResourceId));
        ImageView imageView = this.mRightImage;
        imageView.setOnTouchListener(new abtc(imageView));
        if (this.mIncludeStatusBarHeight) {
            setTopMargin(this.mRightImage, this.mStatusBarHeight);
        }
        this.mRightImage.setVisibility(0);
    }

    private void initScHeaderRightLayout() {
        this.mRightLayout = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(this.mRightLayoutResourceId, this, false);
        addView(this.mRightLayout);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.neon_header_back_button_vertical_padding);
        layoutParams.setMargins(0, dimensionPixelOffset, 0, dimensionPixelOffset);
        layoutParams.setMarginEnd(getResources().getDimensionPixelOffset(R.dimen.neon_header_button_padding));
        layoutParams.gravity = 8388613;
        this.mRightLayout.setLayoutParams(layoutParams);
        this.mRightLayout.setVisibility(0);
    }

    private void initScHeaderTextView() {
        View view;
        int i;
        this.mTitleTextView = (TextView) findViewById(R.id.sc_header_title);
        this.mTitleTextView.setText(this.mHeaderTitle);
        this.mTitleTextView.setTextColor(this.mColorScheme);
        if (this.mShouldShowBackArrow) {
            view = this.mTitleTextView;
            i = this.mTitleWithBackArrowMargin;
        } else {
            view = this.mTitleTextView;
            i = this.mTitleMargin;
        }
        setStartMargin(view, i);
        if (this.mIncludeStatusBarHeight) {
            this.mTitleTextView.setPadding(0, this.mStatusBarHeight, 0, 0);
        }
    }

    private void initViews() {
        LayoutParams layoutParams = getLayoutParams();
        initOverallScHeaderView(layoutParams);
        if (this.mIncludeStatusBarHeight) {
            this.mStatusBarHeight = a.a.b();
            layoutParams.height = a.a.c();
        }
        if (this.mShouldShowBottomBorder) {
            findViewById(R.id.sc_header_bottom_border).setVisibility(0);
        }
        initScHeaderTextView();
        if (this.mShouldShowBackArrow) {
            initScHeaderBackArrow();
        }
        if (this.mRightImageResourceId != -1) {
            initScHeaderRightImage();
        }
        if (this.mRightLayoutResourceId != -1) {
            initScHeaderRightLayout();
        }
    }

    private void parseAttributes(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, zhg.a.j, 0, 0);
            try {
                this.mColorScheme = obtainStyledAttributes.getColor(2, -1);
                this.mArrowColorScheme = obtainStyledAttributes.getColor(1, -1);
                this.mShouldShowBottomBorder = obtainStyledAttributes.getBoolean(8, false);
                this.mShouldShowBackArrow = obtainStyledAttributes.getBoolean(7, false);
                this.mIncludeStatusBarHeight = obtainStyledAttributes.getBoolean(6, false);
                this.mHeaderTitle = obtainStyledAttributes.getString(5);
                this.mRightImageResourceId = obtainStyledAttributes.getResourceId(3, -1);
                this.mRightLayoutResourceId = obtainStyledAttributes.getResourceId(4, -1);
                this.mHeaderArrowRotation = obtainStyledAttributes.getInt(0, 0);
                if (this.mColorScheme == -1) {
                    this.mColorScheme = -1;
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private void setStartMargin(View view, int i) {
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            ((MarginLayoutParams) view.getLayoutParams()).setMarginStart(i);
        }
    }

    private void setTopMargin(View view, int i) {
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public boolean compareBackArrowId(int i) {
        return this.mBackArrow.getId() == i;
    }

    public void destroyBackArrow() {
        if (this.mBackArrow != null) {
            setBackArrowOnClickListener(null);
            this.mBackArrow = null;
        }
    }

    public void enableBackArrow(boolean z) {
        ImageView imageView = this.mBackArrow;
        if (imageView != null) {
            ImageView imageView2;
            float f;
            if (z) {
                imageView.setEnabled(true);
                imageView2 = this.mBackArrow;
                f = 1.0f;
            } else {
                imageView.setEnabled(false);
                imageView2 = this.mBackArrow;
                f = 0.4f;
            }
            imageView2.setAlpha(f);
        }
    }

    public ImageView getRightImage() {
        return this.mRightImage;
    }

    public View getRightLayout() {
        return this.mRightLayout;
    }

    public /* synthetic */ void lambda$initScHeaderBackArrow$0$ScHeaderView(View view) {
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).onBackPressed();
        }
    }

    public void setBackArrowOnClickListener(OnClickListener onClickListener) {
        this.mBackArrow.setOnClickListener(onClickListener);
    }

    public void setColorScheme(int i) {
        i = ContextCompat.getColor(getContext(), i);
        this.mTitleTextView.setTextColor(i);
        this.mBackArrow.setColorFilter(i, Mode.MULTIPLY);
    }

    public void setHideSoftInputBackArrowOnClickListener() {
        this.mBackArrow.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Context context = ScHeaderView.this.getContext();
                if (context instanceof Activity) {
                    if (abtj.a(ScHeaderView.this.getContext())) {
                        zpj.a(context, view.getWindowToken());
                    }
                    ((Activity) ScHeaderView.this.getContext()).onBackPressed();
                }
            }
        });
    }

    public void setOnRightImageClickedListener(OnClickListener onClickListener) {
        this.mRightImage.setOnClickListener(onClickListener);
    }

    public void setOnRightLayoutClickedListener(OnClickListener onClickListener) {
        this.mRightLayout.setOnClickListener(onClickListener);
    }

    public void setShouldShowBackArrow(boolean z) {
        if (z) {
            this.mBackArrow.setVisibility(0);
            this.mShouldShowBackArrow = true;
            return;
        }
        this.mBackArrow.setVisibility(8);
        this.mShouldShowBackArrow = false;
        setStartMargin(this.mTitleTextView, this.mTitleMargin);
    }

    public void setTitleText(int i) {
        this.mTitleTextView.setText(i);
    }

    public void setTitleText(String str) {
        this.mTitleTextView.setText(str);
    }
}
