package com.snap.memories.lib.grid.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.snapchat.android.R;
import defpackage.abtp;

public class MemoriesMyEyesOnlyKeypad extends LinearLayout {
    private static final int[] k = new int[]{11, 11, 11, 11};
    private static final int[] l = new int[]{9, 9, 9, 9};
    private static final int[] m = new int[]{16, 30, 30, 40};
    private static final int[] n = new int[]{52, 60, 72, 72};
    private static final int[] o = new int[]{22, 24, 26, 26};
    private static final int[] p = new int[]{14, 20, 24, 26};
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final ViewGroup g;
    private final View[] h;
    private final View[] i;
    private final View j;

    enum a {
        SMALL(0),
        NORMAL(1),
        LARGE(2),
        XLARGE(3);
        
        int mIndex;

        private a(int i) {
            this.mIndex = i;
        }
    }

    public MemoriesMyEyesOnlyKeypad(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private MemoriesMyEyesOnlyKeypad(Context context, AttributeSet attributeSet, byte b) {
        int i;
        super(context, attributeSet, 0);
        context = getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = ((float) displayMetrics.widthPixels) / displayMetrics.density;
        float j = (float) abtp.j(context);
        a aVar = a.SMALL;
        if (f >= 320.0f && j >= 640.0f) {
            aVar = a.NORMAL;
        }
        if (f >= 360.0f && j >= 640.0f) {
            aVar = a.LARGE;
        }
        if (f >= 411.0f && j >= 640.0f) {
            aVar = a.XLARGE;
        }
        int i2 = aVar.mIndex;
        this.a = abtp.b((float) k[i2], getContext());
        this.b = abtp.b((float) l[i2], getContext());
        this.c = abtp.b((float) m[i2], getContext());
        this.d = abtp.b((float) n[i2], getContext());
        this.e = abtp.b((float) o[i2], getContext());
        this.f = abtp.b((float) p[i2], getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        LayoutParams layoutParams = new LayoutParams(new ViewGroup.LayoutParams(-1, -2));
        layoutParams.setMargins(0, 0, 0, this.c);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(1);
        this.g = linearLayout;
        View[] e = e();
        this.h = e;
        for (i = 0; i < 4; i++) {
            linearLayout.addView(e[i]);
        }
        addView(linearLayout);
        this.i = new View[10];
        ViewGroup viewGroup = null;
        for (i2 = 1; i2 <= 9; i2++) {
            i = i2 % 3;
            if (i == 1) {
                viewGroup = a(false);
                addView(viewGroup);
            }
            Button a = a(String.valueOf(i2), i == 2);
            a.setId(R.id.meo_keypad_number_button);
            this.i[i2] = a;
            viewGroup.addView(a);
        }
        ViewGroup a2 = a(true);
        addView(a2);
        a2.addView(a((CharSequence) "", false));
        Button a3 = a((CharSequence) "0", true);
        this.i[0] = a3;
        a2.addView(a3);
        Button a4 = a((int) R.drawable.memories_meo_passcode_delete_button_selector, false);
        this.j = a4;
        a2.addView(a4);
        setOrientation(1);
        setGravity(17);
    }

    private ViewGroup a(boolean z) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        LayoutParams layoutParams = new LayoutParams(new ViewGroup.LayoutParams(-1, -2));
        if (!z) {
            layoutParams.setMargins(0, 0, 0, this.f);
        }
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(1);
        return linearLayout;
    }

    private Button a(int i, boolean z) {
        ViewGroup.LayoutParams layoutParams;
        Button button = new Button(getContext());
        button.setGravity(17);
        button.setTextColor(getResources().getColor(R.color.memories_meo_passcode_number_color));
        button.setTextSize(20.0f);
        button.setTypeface(null, 1);
        int i2;
        if (z) {
            i2 = this.d;
            layoutParams = new LayoutParams(i2, i2);
            i2 = this.e;
            layoutParams.setMargins(i2, 0, i2, 0);
        } else {
            i2 = this.d;
            layoutParams = new ViewGroup.LayoutParams(i2, i2);
        }
        button.setLayoutParams(layoutParams);
        button.setBackgroundResource(i);
        return button;
    }

    private Button a(CharSequence charSequence, boolean z) {
        Button a = a((int) R.drawable.memories_meo_passcode_number, z);
        if (TextUtils.isEmpty(charSequence)) {
            a.setVisibility(4);
        } else {
            a.setText(charSequence);
        }
        return a;
    }

    private View[] e() {
        View[] viewArr = new View[4];
        for (int i = 0; i < 4; i++) {
            View view = new View(getContext());
            int i2 = this.a;
            LayoutParams layoutParams = new LayoutParams(i2, i2);
            i2 = this.b;
            layoutParams.setMargins(i2, 0, i2, 0);
            view.setLayoutParams(layoutParams);
            view.setBackgroundResource(R.drawable.memories_meo_passcode_select_transition);
            viewArr[i] = view;
        }
        return viewArr;
    }

    public final ViewGroup a() {
        return this.g;
    }

    public final View[] b() {
        return this.h;
    }

    public final View[] c() {
        return this.i;
    }

    public final View d() {
        return this.j;
    }
}
