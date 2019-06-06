package com.snap.lenses.common;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.text.Html;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.Tooltip;
import com.snapchat.android.framework.ui.views.TriangleView;
import defpackage.ajxt;
import defpackage.akcr;

public final class LensesTooltipView extends Tooltip {
    public SnapFontTextView a;
    private TriangleView b;
    private TriangleView c;
    private TriangleView d;
    private a e;

    public enum a {
        VERTICAL,
        HORIZONTAL_RIGHT,
        HORIZONTAL_RIGHT_VERTICAL_CENTER
    }

    public LensesTooltipView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private LensesTooltipView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    private final int a(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    private void a(String str, a aVar) {
        akcr.b(str, "tooltipHtmlText");
        akcr.b(aVar, "tooltipType");
        SnapFontTextView snapFontTextView = this.a;
        if (snapFontTextView == null) {
            akcr.a("tooltipTextView");
        }
        snapFontTextView.setTypefaceStyle(0);
        Object fromHtml = VERSION.SDK_INT >= 24 ? Html.fromHtml(str, 63) : Html.fromHtml(str);
        akcr.a(fromHtml, "tooltipText");
        a((CharSequence) fromHtml, aVar);
    }

    public final void a(CharSequence charSequence, a aVar) {
        akcr.b(charSequence, "tooltipText");
        akcr.b(aVar, "tooltipType");
        SnapFontTextView snapFontTextView = this.a;
        if (snapFontTextView == null) {
            akcr.a("tooltipTextView");
        }
        snapFontTextView.setText(charSequence);
        this.e = aVar;
    }

    public final void moveTooltipToPointAtAttachedView() {
        a aVar = this.e;
        String str = "tooltipType";
        if (aVar == null) {
            akcr.a(str);
        }
        String str2 = "rightTriangleView";
        if (aVar != a.HORIZONTAL_RIGHT) {
            aVar = this.e;
            if (aVar == null) {
                akcr.a(str);
            }
            if (aVar != a.HORIZONTAL_RIGHT_VERTICAL_CENTER) {
                TriangleView triangleView = this.d;
                if (triangleView == null) {
                    akcr.a(str2);
                }
                triangleView.setVisibility(8);
                super.moveTooltipToPointAtAttachedView();
                return;
            }
        }
        int[] iArr = new int[2];
        View view = this.mAttachedView;
        if (view == null) {
            akcr.a();
        }
        view.getLocationOnScreen(iArr);
        TriangleView triangleView2 = this.b;
        if (triangleView2 == null) {
            akcr.a("upperTriangleView");
        }
        triangleView2.setVisibility(4);
        triangleView2 = this.c;
        if (triangleView2 == null) {
            akcr.a("lowerTriangleView");
        }
        triangleView2.setVisibility(4);
        triangleView2 = this.d;
        if (triangleView2 == null) {
            akcr.a(str2);
        }
        triangleView2.setVisibility(0);
        triangleView2 = this.d;
        if (triangleView2 == null) {
            akcr.a(str2);
        }
        LayoutParams layoutParams = triangleView2.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            SnapFontTextView snapFontTextView = this.a;
            if (snapFontTextView == null) {
                akcr.a("tooltipTextView");
            }
            int paddingBottom = snapFontTextView.getPaddingBottom() + (a(R.dimen.lenses_tooltip_text_size) / 2);
            a aVar2 = this.e;
            if (aVar2 == null) {
                akcr.a(str);
            }
            if (aVar2 == a.HORIZONTAL_RIGHT_VERTICAL_CENTER && marginLayoutParams.bottomMargin != paddingBottom) {
                marginLayoutParams.bottomMargin = paddingBottom;
                TriangleView triangleView3 = this.d;
                if (triangleView3 == null) {
                    akcr.a(str2);
                }
                triangleView3.setLayoutParams(marginLayoutParams);
            }
            setX((float) (iArr[0] - getWidth()));
            Object obj = this.mAttachedView;
            if (obj == null) {
                akcr.a();
            }
            akcr.a(obj, "mAttachedView!!");
            setY((float) (((obj.getHeight() - getHeight()) / 2) + iArr[1]));
            return;
        }
        throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        super.initialize(R.id.lenses_tooltip_upper_triangle, R.id.lenses_tooltip_lower_triangle, a(R.dimen.lenses_tooltip_rounded_corner_radius), a(R.dimen.lenses_tooltip_triangle_width));
        View topTriangle = getTopTriangle();
        String str = "null cannot be cast to non-null type com.snapchat.android.framework.ui.views.TriangleView";
        if (topTriangle != null) {
            this.b = (TriangleView) topTriangle;
            topTriangle = getBottomTriangle();
            if (topTriangle != null) {
                this.c = (TriangleView) topTriangle;
                Object findViewById = findViewById(R.id.lenses_tooltip_right_triangle);
                akcr.a(findViewById, "findViewById(R.id.lenses_tooltip_right_triangle)");
                this.d = (TriangleView) findViewById;
                findViewById = findViewById(R.id.lenses_tooltip_text);
                SnapFontTextView snapFontTextView = (SnapFontTextView) findViewById;
                snapFontTextView.setTextColor(-16777216);
                akcr.a(findViewById, "findViewById<SnapFontTex…tTextColor(Color.BLACK) }");
                this.a = snapFontTextView;
                setBackgroundColor(-1);
                return;
            }
            throw new ajxt(str);
        }
        throw new ajxt(str);
    }

    public final void setBackgroundColor(int i) {
        SnapFontTextView snapFontTextView = this.a;
        if (snapFontTextView == null) {
            akcr.a("tooltipTextView");
        }
        Drawable background = snapFontTextView.getBackground();
        if (!(background instanceof GradientDrawable)) {
            background = null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) background;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
        TriangleView triangleView = this.c;
        if (triangleView == null) {
            akcr.a("lowerTriangleView");
        }
        triangleView.b(i);
        triangleView = this.b;
        if (triangleView == null) {
            akcr.a("upperTriangleView");
        }
        triangleView.b(i);
        triangleView = this.d;
        if (triangleView == null) {
            akcr.a("rightTriangleView");
        }
        triangleView.b(i);
    }
}
