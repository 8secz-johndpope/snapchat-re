package com.snap.lenses.camera.onboarding.tooltip.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.snap.lenses.common.LensesTooltipView;
import com.snap.lenses.common.LensesTooltipView.a;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.Tooltip;
import defpackage.akcr;
import defpackage.mci;

public final class DefaultCarouselTooltipView extends FrameLayout implements mci {
    private LensesTooltipView a;
    private View b;
    private View c;
    private int d;

    public DefaultCarouselTooltipView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultCarouselTooltipView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    private final void a(String str, View view, int i) {
        LensesTooltipView lensesTooltipView = this.a;
        if (lensesTooltipView == null) {
            akcr.a("tooltipContainerView");
        }
        lensesTooltipView.setTooltipPointerHorizontalOffsetPx(i);
        lensesTooltipView.a(str, a.VERTICAL);
        lensesTooltipView.attachToView(view, true);
        lensesTooltipView.show();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    public final /* synthetic */ void accept(java.lang.Object r5) {
        /*
        r4 = this;
        r5 = (defpackage.mci.a) r5;
        r0 = "viewModel";
        defpackage.akcr.b(r5, r0);
        r0 = r5 instanceof defpackage.mci.a.b.b;
        if (r0 == 0) goto L_0x0033;
    L_0x000b:
        r0 = r4.getResources();
        r1 = 2131888183; // 0x7f120837 float:1.9410994E38 double:1.053292712E-314;
        r0 = r0.getString(r1);
        r1 = "resources.getString(R.st…wipe_to_try_another_lens)";
        defpackage.akcr.a(r0, r1);
        r1 = r4.b;
        if (r1 != 0) goto L_0x0024;
    L_0x001f:
        r2 = "swipeLensTooltipAnchorView";
        defpackage.akcr.a(r2);
    L_0x0024:
        r2 = r4.getResources();
        r3 = 2131166758; // 0x7f070626 float:1.794777E38 double:1.0529362807E-314;
        r2 = r2.getDimensionPixelSize(r3);
    L_0x002f:
        r4.a(r0, r1, r2);
        goto L_0x0062;
    L_0x0033:
        r0 = r5 instanceof defpackage.mci.a.b.a;
        if (r0 == 0) goto L_0x0052;
    L_0x0037:
        r0 = r4.getResources();
        r1 = 2131888184; // 0x7f120838 float:1.9410996E38 double:1.0532927125E-314;
        r0 = r0.getString(r1);
        r1 = "resources.getString(R.st…tip_tap_or_hold_for_snap)";
        defpackage.akcr.a(r0, r1);
        r1 = r4.c;
        if (r1 != 0) goto L_0x0050;
    L_0x004b:
        r2 = "captureSnapTooltipAnchorView";
        defpackage.akcr.a(r2);
    L_0x0050:
        r2 = 0;
        goto L_0x002f;
    L_0x0052:
        r0 = r5 instanceof defpackage.mci.a.a;
        if (r0 == 0) goto L_0x0062;
    L_0x0056:
        r0 = r4.a;
        if (r0 != 0) goto L_0x005f;
    L_0x005a:
        r1 = "tooltipContainerView";
        defpackage.akcr.a(r1);
    L_0x005f:
        r0.hide();
    L_0x0062:
        r0 = r5 instanceof defpackage.mci.a.b;
        if (r0 == 0) goto L_0x0086;
    L_0x0066:
        r5 = (defpackage.mci.a.b) r5;
        r5 = r5.a();
        r5 = r5.d;
        r0 = r4.d;
        r5 = r5 + r0;
        r0 = r4.getPaddingBottom();
        if (r0 == r5) goto L_0x0086;
    L_0x0077:
        r0 = r4.getPaddingLeft();
        r1 = r4.getPaddingTop();
        r2 = r4.getPaddingRight();
        r4.setPadding(r0, r1, r2, r5);
    L_0x0086:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.lenses.camera.onboarding.tooltip.carousel.DefaultCarouselTooltipView.accept(java.lang.Object):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object context = getContext();
        akcr.a(context, "context");
        this.d = context.getResources().getDimensionPixelSize(R.dimen.lens_camera_carousel_bottom_margin);
        context = findViewById(R.id.tooltip_container_view);
        akcr.a(context, "findViewById(R.id.tooltip_container_view)");
        this.a = (LensesTooltipView) context;
        context = findViewById(R.id.swipe_lens_tooltip_anchor_view);
        akcr.a(context, "findViewById(R.id.swipe_lens_tooltip_anchor_view)");
        this.b = context;
        context = findViewById(R.id.capture_snap_tooltip_anchor_view);
        akcr.a(context, "findViewById(R.id.captur…snap_tooltip_anchor_view)");
        this.c = context;
        LensesTooltipView lensesTooltipView = this.a;
        if (lensesTooltipView == null) {
            akcr.a("tooltipContainerView");
        }
        lensesTooltipView.setVisibility(8);
        lensesTooltipView.setTooltipDirection(Tooltip.a.POINTER_DOWN);
    }
}
