package com.snap.preview.tools.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.tzp;
import defpackage.uac;
import java.util.LinkedHashMap;

public final class PreviewBottomToolbarView extends LinearLayout implements tzp {
    public final LinkedHashMap<String, FrameLayout> a;
    private final LinkedHashMap<String, uac> b;

    public PreviewBottomToolbarView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private PreviewBottomToolbarView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.b = new LinkedHashMap();
        this.a = new LinkedHashMap();
    }

    public final uac a(String str) {
        akcr.b(str, "toolId");
        return (uac) this.b.get(str);
    }

    public final void a(FrameLayout frameLayout) {
        akcr.b(frameLayout, "frameLayout");
        Object context = getContext();
        akcr.a(context, "context");
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.preview_bottom_tool_bar_buttons_horizontal_margin);
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = dimensionPixelOffset;
            addView(frameLayout);
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void a(String str, int i) {
        akcr.b(str, "toolId");
        uac a = a(str);
        if (a != null && a.d.getVisibility() != i) {
            a.d.setVisibility(i);
        }
    }

    public final void a(String str, uac uac) {
        akcr.b(str, "toolId");
        akcr.b(uac, "button");
        this.b.put(str, uac);
        this.a.remove(str);
    }
}
