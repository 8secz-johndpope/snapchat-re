package android.support.design.internal;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.LinearLayoutCompat.LayoutParams;
import android.support.v7.widget.RecyclerView.ItemAnimator;
import android.support.v7.widget.TooltipCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.snapchat.android.R;
import defpackage.ck;
import defpackage.jl;
import defpackage.kb;
import defpackage.kb.j;
import defpackage.kk;
import defpackage.le;
import defpackage.nb;
import defpackage.nh.a;

public class NavigationMenuItemView extends ck implements a {
    private static final int[] b = new int[]{16842912};
    boolean a;
    private final int c;
    private final CheckedTextView d;
    private FrameLayout e;
    private nb f;
    private final jl g;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private NavigationMenuItemView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, (byte) 0);
        this.g = new jl() {
            public final void onInitializeAccessibilityNodeInfo(View view, kk kkVar) {
                super.onInitializeAccessibilityNodeInfo(view, kkVar);
                kkVar.a(NavigationMenuItemView.this.a);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        this.c = context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size);
        this.d = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.d.setDuplicateParentStateEnabled(true);
        j.a(this.d, this.g);
    }

    public final nb a() {
        return this.f;
    }

    public final void a(nb nbVar) {
        this.f = nbVar;
        setVisibility(nbVar.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            Drawable stateListDrawable;
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(b, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            kb.a((View) this, stateListDrawable);
        }
        boolean isCheckable = nbVar.isCheckable();
        refreshDrawableState();
        if (this.a != isCheckable) {
            this.a = isCheckable;
            this.g.sendAccessibilityEvent(this.d, ItemAnimator.FLAG_MOVED);
        }
        isCheckable = nbVar.isChecked();
        refreshDrawableState();
        this.d.setChecked(isCheckable);
        setEnabled(nbVar.isEnabled());
        this.d.setText(nbVar.getTitle());
        Drawable icon = nbVar.getIcon();
        if (icon != null) {
            int i = this.c;
            icon.setBounds(0, 0, i, i);
        }
        le.a.a(this.d, icon);
        View actionView = nbVar.getActionView();
        if (actionView != null) {
            if (this.e == null) {
                this.e = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.e.removeAllViews();
            this.e.addView(actionView);
        }
        setContentDescription(nbVar.getContentDescription());
        TooltipCompat.setTooltipText(this, nbVar.getTooltipText());
        if (!(this.f.getTitle() == null && this.f.getIcon() == null && this.f.getActionView() != null)) {
            z = false;
        }
        FrameLayout frameLayout;
        LayoutParams layoutParams;
        if (z) {
            this.d.setVisibility(8);
            frameLayout = this.e;
            if (frameLayout != null) {
                layoutParams = (LayoutParams) frameLayout.getLayoutParams();
                layoutParams.width = -1;
                this.e.setLayoutParams(layoutParams);
                return;
            }
        }
        this.d.setVisibility(0);
        frameLayout = this.e;
        if (frameLayout != null) {
            layoutParams = (LayoutParams) frameLayout.getLayoutParams();
            layoutParams.width = -2;
            this.e.setLayoutParams(layoutParams);
        }
    }

    public final boolean b() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        nb nbVar = this.f;
        if (nbVar != null && nbVar.isCheckable() && this.f.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, b);
        }
        return onCreateDrawableState;
    }
}
