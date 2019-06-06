package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.kb;
import defpackage.kf;
import defpackage.kh;
import defpackage.lx.a;
import defpackage.ma;
import defpackage.ms;
import defpackage.mz;
import defpackage.ng;
import defpackage.nq;

public class ToolbarWidgetWrapper implements DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200;
    private static final String TAG = "ToolbarWidgetWrapper";
    private nq mActionMenuPresenter;
    private View mCustomView;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private CharSequence mHomeDescription;
    private Drawable mIcon;
    private Drawable mLogo;
    boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private Spinner mSpinner;
    private CharSequence mSubtitle;
    private View mTabView;
    CharSequence mTitle;
    private boolean mTitleSet;
    Toolbar mToolbar;
    Callback mWindowCallback;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        this(toolbar, z, R.string.abc_action_bar_up_description, R.drawable.abc_ic_ab_back_material);
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z, int i, int i2) {
        this.mNavigationMode = 0;
        this.mDefaultNavigationContentDescription = 0;
        this.mToolbar = toolbar;
        this.mTitle = toolbar.getTitle();
        this.mSubtitle = toolbar.getSubtitle();
        this.mTitleSet = this.mTitle != null;
        this.mNavIcon = toolbar.getNavigationIcon();
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, a.a, R.attr.actionBarStyle, 0);
        this.mDefaultNavigationIcon = obtainStyledAttributes.getDrawable(15);
        if (z) {
            Toolbar toolbar2;
            CharSequence text = obtainStyledAttributes.getText(27);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            text = obtainStyledAttributes.getText(25);
            if (!TextUtils.isEmpty(text)) {
                setSubtitle(text);
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(20);
            if (drawable != null) {
                setLogo(drawable);
            }
            drawable = obtainStyledAttributes.getDrawable(17);
            if (drawable != null) {
                setIcon(drawable);
            }
            if (this.mNavIcon == null) {
                drawable = this.mDefaultNavigationIcon;
                if (drawable != null) {
                    setNavigationIcon(drawable);
                }
            }
            setDisplayOptions(obtainStyledAttributes.getInt(10, 0));
            int resourceId = obtainStyledAttributes.getResourceId(9, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(this.mToolbar.getContext()).inflate(resourceId, this.mToolbar, false));
                setDisplayOptions(this.mDisplayOpts | 16);
            }
            resourceId = obtainStyledAttributes.getLayoutDimension(13, 0);
            if (resourceId > 0) {
                LayoutParams layoutParams = this.mToolbar.getLayoutParams();
                layoutParams.height = resourceId;
                this.mToolbar.setLayoutParams(layoutParams);
            }
            resourceId = obtainStyledAttributes.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, -1);
            if (resourceId >= 0 || dimensionPixelOffset >= 0) {
                this.mToolbar.setContentInsetsRelative(Math.max(resourceId, 0), Math.max(dimensionPixelOffset, 0));
            }
            resourceId = obtainStyledAttributes.getResourceId(28, 0);
            if (resourceId != 0) {
                toolbar2 = this.mToolbar;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId);
            }
            resourceId = obtainStyledAttributes.getResourceId(26, 0);
            if (resourceId != 0) {
                toolbar2 = this.mToolbar;
                toolbar2.setSubtitleTextAppearance(toolbar2.getContext(), resourceId);
            }
            resourceId = obtainStyledAttributes.getResourceId(22, 0);
            if (resourceId != 0) {
                this.mToolbar.setPopupTheme(resourceId);
            }
        } else {
            this.mDisplayOpts = detectDisplayOptions();
        }
        obtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i);
        this.mHomeDescription = this.mToolbar.getNavigationContentDescription();
        this.mToolbar.setNavigationOnClickListener(new OnClickListener() {
            private ms a = new ms(ToolbarWidgetWrapper.this.mToolbar.getContext(), ToolbarWidgetWrapper.this.mTitle);

            public final void onClick(View view) {
                if (ToolbarWidgetWrapper.this.mWindowCallback != null && ToolbarWidgetWrapper.this.mMenuPrepared) {
                    ToolbarWidgetWrapper.this.mWindowCallback.onMenuItemSelected(0, this.a);
                }
            }
        });
    }

    private int detectDisplayOptions() {
        if (this.mToolbar.getNavigationIcon() == null) {
            return 11;
        }
        this.mDefaultNavigationIcon = this.mToolbar.getNavigationIcon();
        return 15;
    }

    private void ensureSpinner() {
        if (this.mSpinner == null) {
            this.mSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
            this.mSpinner.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    private void setTitleInt(CharSequence charSequence) {
        this.mTitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setTitle(charSequence);
        }
    }

    private void updateHomeAccessibility() {
        if ((this.mDisplayOpts & 4) != 0) {
            if (TextUtils.isEmpty(this.mHomeDescription)) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
                return;
            }
            this.mToolbar.setNavigationContentDescription(this.mHomeDescription);
        }
    }

    private void updateNavigationIcon() {
        if ((this.mDisplayOpts & 4) != 0) {
            Toolbar toolbar = this.mToolbar;
            Drawable drawable = this.mNavIcon;
            if (drawable == null) {
                drawable = this.mDefaultNavigationIcon;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.mToolbar.setNavigationIcon(null);
    }

    /* JADX WARNING: Missing block: B:5:0x000c, code skipped:
            if (r0 != null) goto L_0x0013;
     */
    private void updateToolbarLogo() {
        /*
        r2 = this;
        r0 = r2.mDisplayOpts;
        r1 = r0 & 2;
        if (r1 == 0) goto L_0x0012;
    L_0x0006:
        r0 = r0 & 1;
        if (r0 == 0) goto L_0x000f;
    L_0x000a:
        r0 = r2.mLogo;
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0013;
    L_0x000f:
        r0 = r2.mIcon;
        goto L_0x0013;
    L_0x0012:
        r0 = 0;
    L_0x0013:
        r1 = r2.mToolbar;
        r1.setLogo(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ToolbarWidgetWrapper.updateToolbarLogo():void");
    }

    public void animateToVisibility(int i) {
        kf kfVar = setupAnimatorToVisibility(i, DEFAULT_FADE_DURATION_MS);
        if (kfVar != null) {
            kfVar.d();
        }
    }

    public boolean canShowOverflowMenu() {
        return this.mToolbar.canShowOverflowMenu();
    }

    public void collapseActionView() {
        this.mToolbar.collapseActionView();
    }

    public void dismissPopupMenus() {
        this.mToolbar.dismissPopupMenus();
    }

    public Context getContext() {
        return this.mToolbar.getContext();
    }

    public View getCustomView() {
        return this.mCustomView;
    }

    public int getDisplayOptions() {
        return this.mDisplayOpts;
    }

    public int getDropdownItemCount() {
        Spinner spinner = this.mSpinner;
        return spinner != null ? spinner.getCount() : 0;
    }

    public int getDropdownSelectedPosition() {
        Spinner spinner = this.mSpinner;
        return spinner != null ? spinner.getSelectedItemPosition() : 0;
    }

    public int getHeight() {
        return this.mToolbar.getHeight();
    }

    public Menu getMenu() {
        return this.mToolbar.getMenu();
    }

    public int getNavigationMode() {
        return this.mNavigationMode;
    }

    public CharSequence getSubtitle() {
        return this.mToolbar.getSubtitle();
    }

    public CharSequence getTitle() {
        return this.mToolbar.getTitle();
    }

    public ViewGroup getViewGroup() {
        return this.mToolbar;
    }

    public int getVisibility() {
        return this.mToolbar.getVisibility();
    }

    public boolean hasEmbeddedTabs() {
        return this.mTabView != null;
    }

    public boolean hasExpandedActionView() {
        return this.mToolbar.hasExpandedActionView();
    }

    public boolean hasIcon() {
        return this.mIcon != null;
    }

    public boolean hasLogo() {
        return this.mLogo != null;
    }

    public boolean hideOverflowMenu() {
        return this.mToolbar.hideOverflowMenu();
    }

    public void initIndeterminateProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    public void initProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    public boolean isOverflowMenuShowPending() {
        return this.mToolbar.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        return this.mToolbar.isOverflowMenuShowing();
    }

    public boolean isTitleTruncated() {
        return this.mToolbar.isTitleTruncated();
    }

    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.restoreHierarchyState(sparseArray);
    }

    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.saveHierarchyState(sparseArray);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        kb.a(this.mToolbar, drawable);
    }

    public void setCollapsible(boolean z) {
        this.mToolbar.setCollapsible(z);
    }

    public void setCustomView(View view) {
        View view2 = this.mCustomView;
        if (!(view2 == null || (this.mDisplayOpts & 16) == 0)) {
            this.mToolbar.removeView(view2);
        }
        this.mCustomView = view;
        if (view != null && (this.mDisplayOpts & 16) != 0) {
            this.mToolbar.addView(this.mCustomView);
        }
    }

    public void setDefaultNavigationContentDescription(int i) {
        if (i != this.mDefaultNavigationContentDescription) {
            this.mDefaultNavigationContentDescription = i;
            if (TextUtils.isEmpty(this.mToolbar.getNavigationContentDescription())) {
                setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            }
        }
    }

    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.mDefaultNavigationIcon != drawable) {
            this.mDefaultNavigationIcon = drawable;
            updateNavigationIcon();
        }
    }

    public void setDisplayOptions(int i) {
        int i2 = this.mDisplayOpts ^ i;
        this.mDisplayOpts = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    updateHomeAccessibility();
                }
                updateNavigationIcon();
            }
            if ((i2 & 3) != 0) {
                updateToolbarLogo();
            }
            if ((i2 & 8) != 0) {
                Toolbar toolbar;
                CharSequence charSequence;
                if ((i & 8) != 0) {
                    this.mToolbar.setTitle(this.mTitle);
                    toolbar = this.mToolbar;
                    charSequence = this.mSubtitle;
                } else {
                    charSequence = null;
                    this.mToolbar.setTitle(null);
                    toolbar = this.mToolbar;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0) {
                View view = this.mCustomView;
                if (view != null) {
                    if ((i & 16) != 0) {
                        this.mToolbar.addView(view);
                        return;
                    }
                    this.mToolbar.removeView(view);
                }
            }
        }
    }

    public void setDropdownParams(SpinnerAdapter spinnerAdapter, OnItemSelectedListener onItemSelectedListener) {
        ensureSpinner();
        this.mSpinner.setAdapter(spinnerAdapter);
        this.mSpinner.setOnItemSelectedListener(onItemSelectedListener);
    }

    public void setDropdownSelectedPosition(int i) {
        Spinner spinner = this.mSpinner;
        if (spinner != null) {
            spinner.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.mTabView;
        if (view != null) {
            ViewParent parent = view.getParent();
            ViewParent viewParent = this.mToolbar;
            if (parent == viewParent) {
                viewParent.removeView(this.mTabView);
            }
        }
        this.mTabView = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.mNavigationMode == 2) {
            this.mToolbar.addView(this.mTabView, 0);
            Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.mTabView.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    public void setHomeButtonEnabled(boolean z) {
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? ma.b(getContext(), i) : null);
    }

    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        updateToolbarLogo();
    }

    public void setLogo(int i) {
        setLogo(i != 0 ? ma.b(getContext(), i) : null);
    }

    public void setLogo(Drawable drawable) {
        this.mLogo = drawable;
        updateToolbarLogo();
    }

    public void setMenu(Menu menu, ng.a aVar) {
        if (this.mActionMenuPresenter == null) {
            this.mActionMenuPresenter = new nq(this.mToolbar.getContext());
            this.mActionMenuPresenter.f = R.id.action_menu_presenter;
        }
        nq nqVar = this.mActionMenuPresenter;
        nqVar.d = aVar;
        this.mToolbar.setMenu((mz) menu, nqVar);
    }

    public void setMenuCallbacks(ng.a aVar, mz.a aVar2) {
        this.mToolbar.setMenuCallbacks(aVar, aVar2);
    }

    public void setMenuPrepared() {
        this.mMenuPrepared = true;
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i == 0 ? null : getContext().getString(i));
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        this.mHomeDescription = charSequence;
        updateHomeAccessibility();
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(i != 0 ? ma.b(getContext(), i) : null);
    }

    public void setNavigationIcon(Drawable drawable) {
        this.mNavIcon = drawable;
        updateNavigationIcon();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f  */
    public void setNavigationMode(int r5) {
        /*
        r4 = this;
        r0 = r4.mNavigationMode;
        if (r5 == r0) goto L_0x006a;
    L_0x0004:
        r1 = 2;
        r2 = 1;
        if (r0 == r2) goto L_0x001a;
    L_0x0008:
        if (r0 == r1) goto L_0x000b;
    L_0x000a:
        goto L_0x002b;
    L_0x000b:
        r0 = r4.mTabView;
        if (r0 == 0) goto L_0x002b;
    L_0x000f:
        r0 = r0.getParent();
        r3 = r4.mToolbar;
        if (r0 != r3) goto L_0x002b;
    L_0x0017:
        r0 = r4.mTabView;
        goto L_0x0028;
    L_0x001a:
        r0 = r4.mSpinner;
        if (r0 == 0) goto L_0x002b;
    L_0x001e:
        r0 = r0.getParent();
        r3 = r4.mToolbar;
        if (r0 != r3) goto L_0x002b;
    L_0x0026:
        r0 = r4.mSpinner;
    L_0x0028:
        r3.removeView(r0);
    L_0x002b:
        r4.mNavigationMode = r5;
        if (r5 == 0) goto L_0x006a;
    L_0x002f:
        r0 = 0;
        if (r5 == r2) goto L_0x0060;
    L_0x0032:
        if (r5 != r1) goto L_0x0050;
    L_0x0034:
        r5 = r4.mTabView;
        if (r5 == 0) goto L_0x006a;
    L_0x0038:
        r1 = r4.mToolbar;
        r1.addView(r5, r0);
        r5 = r4.mTabView;
        r5 = r5.getLayoutParams();
        r5 = (android.support.v7.widget.Toolbar.LayoutParams) r5;
        r0 = -2;
        r5.width = r0;
        r5.height = r0;
        r0 = 8388691; // 0x800053 float:1.175506E-38 double:4.144564E-317;
        r5.gravity = r0;
        return;
    L_0x0050:
        r0 = new java.lang.IllegalArgumentException;
        r5 = java.lang.String.valueOf(r5);
        r1 = "Invalid navigation mode ";
        r5 = r1.concat(r5);
        r0.<init>(r5);
        throw r0;
    L_0x0060:
        r4.ensureSpinner();
        r5 = r4.mToolbar;
        r1 = r4.mSpinner;
        r5.addView(r1, r0);
    L_0x006a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ToolbarWidgetWrapper.setNavigationMode(int):void");
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setSubtitle(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.mTitleSet = true;
        setTitleInt(charSequence);
    }

    public void setVisibility(int i) {
        this.mToolbar.setVisibility(i);
    }

    public void setWindowCallback(Callback callback) {
        this.mWindowCallback = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.mTitleSet) {
            setTitleInt(charSequence);
        }
    }

    public kf setupAnimatorToVisibility(final int i, long j) {
        return kb.b(this.mToolbar).a(i == 0 ? 1.0f : MapboxConstants.MINIMUM_ZOOM).a(j).a(new kh() {
            private boolean a = false;

            public final void onAnimationCancel(View view) {
                this.a = true;
            }

            public final void onAnimationEnd(View view) {
                if (!this.a) {
                    ToolbarWidgetWrapper.this.mToolbar.setVisibility(i);
                }
            }

            public final void onAnimationStart(View view) {
                ToolbarWidgetWrapper.this.mToolbar.setVisibility(0);
            }
        });
    }

    public boolean showOverflowMenu() {
        return this.mToolbar.showOverflowMenu();
    }
}
