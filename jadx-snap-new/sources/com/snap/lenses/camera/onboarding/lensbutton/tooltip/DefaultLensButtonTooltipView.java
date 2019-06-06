package com.snap.lenses.camera.onboarding.lensbutton.tooltip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.snap.lenses.common.LensesTooltipView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.Tooltip;
import defpackage.akcr;
import defpackage.iho;
import defpackage.mbw;
import defpackage.mbw.a;
import defpackage.mbw.a.b;

public final class DefaultLensButtonTooltipView extends FrameLayout implements mbw {
    private LensesTooltipView a;
    private View b;

    public DefaultLensButtonTooltipView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultLensButtonTooltipView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    private final int a(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    public final /* synthetic */ void accept(Object obj) {
        a aVar = (a) obj;
        akcr.b(aVar, "viewModel");
        if (aVar instanceof a.a) {
            setVisibility(8);
            return;
        }
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            if (getPaddingBottom() != bVar.a.d) {
                iho.e(this, bVar.a.d);
            }
            setVisibility(0);
            LensesTooltipView lensesTooltipView = this.a;
            if (lensesTooltipView == null) {
                akcr.a("tooltipView");
            }
            lensesTooltipView.show();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.lens_button_tooltip_anchor_view);
        akcr.a(findViewById, "findViewById(R.id.lens_button_tooltip_anchor_view)");
        this.b = findViewById;
        findViewById = findViewById(R.id.lens_button_tooltip);
        LensesTooltipView lensesTooltipView = (LensesTooltipView) findViewById;
        int a = a(R.dimen.lenses_button_tooltip_text_max_width);
        SnapFontTextView snapFontTextView = lensesTooltipView.a;
        if (snapFontTextView == null) {
            akcr.a("tooltipTextView");
        }
        snapFontTextView.setMaxWidth(a);
        lensesTooltipView.setHorizontalOffsetPx(a(R.dimen.lenses_button_tooltip_horizontal_offset));
        lensesTooltipView.setTooltipPointerHorizontalOffsetPx(a(R.dimen.lenses_button_tooltip_triangle_offset));
        Object string = lensesTooltipView.getResources().getString(R.string.lens_tooltip_tap_to_use_lens_on_lens_button);
        akcr.a(string, "resources.getString(R.st…_use_lens_on_lens_button)");
        lensesTooltipView.a((CharSequence) string, LensesTooltipView.a.VERTICAL);
        lensesTooltipView.setTooltipDirection(Tooltip.a.POINTER_DOWN);
        View view = this.b;
        if (view == null) {
            akcr.a("anchorView");
        }
        lensesTooltipView.attachToView(view, true);
        lensesTooltipView.setVisibility(8);
        akcr.a(findViewById, "findViewById<LensesToolt…ity = View.GONE\n        }");
        this.a = lensesTooltipView;
    }
}
