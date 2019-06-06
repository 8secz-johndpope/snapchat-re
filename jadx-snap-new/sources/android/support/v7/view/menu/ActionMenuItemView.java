package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView.ActionMenuChildView;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.ForwardingListener;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import defpackage.nb;
import defpackage.nk;

public class ActionMenuItemView extends AppCompatTextView implements ActionMenuChildView, OnClickListener, defpackage.nh.a {
    nb b;
    public defpackage.mz.b c;
    public b d;
    private CharSequence e;
    private Drawable f;
    private ForwardingListener g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public static abstract class b {
        public abstract nk a();
    }

    class a extends ForwardingListener {
        public a() {
            super(ActionMenuItemView.this);
        }

        public final nk getPopup() {
            return ActionMenuItemView.this.d != null ? ActionMenuItemView.this.d.a() : null;
        }

        public final boolean onForwardingStarted() {
            if (ActionMenuItemView.this.c != null && ActionMenuItemView.this.c.invokeItem(ActionMenuItemView.this.b)) {
                nk popup = getPopup();
                if (popup != null && popup.isShowing()) {
                    return true;
                }
            }
            return false;
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ActionMenuItemView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.h = d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.lx.a.c, 0, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.j = -1;
        setSaveEnabled(false);
    }

    private boolean d() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || ((i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2);
    }

    private void e() {
        int i = 1;
        int isEmpty = TextUtils.isEmpty(this.e) ^ 1;
        if (!(this.f == null || (this.b.i() && this.h))) {
            i = 0;
        }
        isEmpty &= i;
        CharSequence charSequence = null;
        setText(isEmpty != 0 ? this.e : null);
        CharSequence contentDescription = this.b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = isEmpty != 0 ? null : this.b.getTitle();
        }
        setContentDescription(contentDescription);
        contentDescription = this.b.getTooltipText();
        if (TextUtils.isEmpty(contentDescription)) {
            if (isEmpty == 0) {
                charSequence = this.b.getTitle();
            }
            TooltipCompat.setTooltipText(this, charSequence);
            return;
        }
        TooltipCompat.setTooltipText(this, contentDescription);
    }

    public final nb a() {
        return this.b;
    }

    public final void a(nb nbVar) {
        this.b = nbVar;
        Drawable icon = nbVar.getIcon();
        this.f = icon;
        int i = 0;
        if (icon != null) {
            int intrinsicWidth = icon.getIntrinsicWidth();
            int intrinsicHeight = icon.getIntrinsicHeight();
            int i2 = this.k;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            i2 = this.k;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
                intrinsicHeight = i2;
            }
            icon.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(icon, null, null, null);
        e();
        this.e = nbVar.a((defpackage.nh.a) this);
        e();
        setId(nbVar.getItemId());
        if (!nbVar.isVisible()) {
            i = 8;
        }
        setVisibility(i);
        setEnabled(nbVar.isEnabled());
        if (nbVar.hasSubMenu() && this.g == null) {
            this.g = new a();
        }
    }

    public final boolean b() {
        return true;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public boolean needsDividerAfter() {
        return c();
    }

    public boolean needsDividerBefore() {
        return c() && this.b.getIcon() == null;
    }

    public void onClick(View view) {
        defpackage.mz.b bVar = this.c;
        if (bVar != null) {
            bVar.invokeItem(this.b);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.h = d();
        e();
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        boolean c = c();
        if (c) {
            i3 = this.j;
            if (i3 >= 0) {
                super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
        }
        super.onMeasure(i, i2);
        i3 = MeasureSpec.getMode(i);
        i = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        i = i3 == Integer.MIN_VALUE ? Math.min(i, this.i) : this.i;
        if (i3 != AudioPlayer.INFINITY_LOOP_COUNT && this.i > 0 && measuredWidth < i) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i, AudioPlayer.INFINITY_LOOP_COUNT), i2);
        }
        if (!c && this.f != null) {
            super.setPadding((getMeasuredWidth() - this.f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b.hasSubMenu()) {
            ForwardingListener forwardingListener = this.g;
            if (forwardingListener != null && forwardingListener.onTouch(this, motionEvent)) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.j = i;
        super.setPadding(i, i2, i3, i4);
    }
}
