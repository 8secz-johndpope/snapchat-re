package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.kb;
import defpackage.lx;
import defpackage.nb;
import defpackage.nh.a;

public class ListMenuItemView extends LinearLayout implements a {
    public nb a;
    public boolean b;
    public boolean c;
    private ImageView d;
    private RadioButton e;
    private TextView f;
    private CheckBox g;
    private TextView h;
    private ImageView i;
    private Drawable j;
    private int k;
    private Context l;
    private Drawable m;
    private int n;
    private LayoutInflater o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private ListMenuItemView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, lx.a.t, R.attr.listMenuViewStyle, 0);
        this.j = obtainStyledAttributes.getDrawable(5);
        this.k = obtainStyledAttributes.getResourceId(1, -1);
        this.b = obtainStyledAttributes.getBoolean(7, false);
        this.l = context;
        this.m = obtainStyledAttributes.getDrawable(8);
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater c() {
        if (this.o == null) {
            this.o = LayoutInflater.from(getContext());
        }
        return this.o;
    }

    public final nb a() {
        return this.a;
    }

    public final void a(nb nbVar) {
        int i;
        this.a = nbVar;
        int i2 = 0;
        this.n = 0;
        setVisibility(nbVar.isVisible() ? 0 : 8);
        CharSequence a = nbVar.a((a) this);
        if (a != null) {
            this.f.setText(a);
            if (this.f.getVisibility() != 0) {
                this.f.setVisibility(0);
            }
        } else if (this.f.getVisibility() != 8) {
            this.f.setVisibility(8);
        }
        boolean isCheckable = nbVar.isCheckable();
        if (!(!isCheckable && this.e == null && this.g == null)) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.a.e()) {
                if (this.e == null) {
                    this.e = (RadioButton) c().inflate(R.layout.abc_list_menu_item_radio, this, false);
                    addView(this.e);
                }
                compoundButton = this.e;
                compoundButton2 = this.g;
            } else {
                if (this.g == null) {
                    this.g = (CheckBox) c().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
                    addView(this.g);
                }
                compoundButton = this.g;
                compoundButton2 = this.e;
            }
            if (isCheckable) {
                compoundButton.setChecked(this.a.isChecked());
                i = isCheckable ? 0 : 8;
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (!(compoundButton2 == null || compoundButton2.getVisibility() == 8)) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.g;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.e;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
        i = (nbVar.d() && this.a.d()) ? 0 : 8;
        if (i == 0) {
            CharSequence charSequence;
            TextView textView = this.h;
            char c = this.a.c();
            if (c == 0) {
                charSequence = "";
            } else {
                StringBuilder stringBuilder = new StringBuilder(null);
                if (c == 8 || c == 10 || c == ' ') {
                    stringBuilder.append(null);
                } else {
                    stringBuilder.append(c);
                }
                charSequence = stringBuilder.toString();
            }
            textView.setText(charSequence);
        }
        if (this.h.getVisibility() != i) {
            this.h.setVisibility(i);
        }
        Drawable icon = nbVar.getIcon();
        boolean z = this.c;
        if ((z || this.b) && !(this.d == null && icon == null && !this.b)) {
            if (this.d == null) {
                this.d = (ImageView) c().inflate(R.layout.abc_list_menu_item_icon, this, false);
                addView(this.d, 0);
            }
            if (icon != null || this.b) {
                ImageView imageView = this.d;
                if (!z) {
                    icon = null;
                }
                imageView.setImageDrawable(icon);
                if (this.d.getVisibility() != 0) {
                    this.d.setVisibility(0);
                }
            } else {
                this.d.setVisibility(8);
            }
        }
        setEnabled(nbVar.isEnabled());
        isCheckable = nbVar.hasSubMenu();
        ImageView imageView2 = this.i;
        if (imageView2 != null) {
            if (!isCheckable) {
                i2 = 8;
            }
            imageView2.setVisibility(i2);
        }
        setContentDescription(nbVar.getContentDescription());
    }

    public final boolean b() {
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        kb.a((View) this, this.j);
        this.f = (TextView) findViewById(R.id.title);
        int i = this.k;
        if (i != -1) {
            this.f.setTextAppearance(this.l, i);
        }
        this.h = (TextView) findViewById(R.id.shortcut);
        this.i = (ImageView) findViewById(R.id.submenuarrow);
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setImageDrawable(this.m);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        if (this.d != null && this.b) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.d.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }
}
