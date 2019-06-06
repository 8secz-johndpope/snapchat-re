package com.snap.lenses.camera.explorer.tooltip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.snap.lenses.common.LensesTooltipView;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajpy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.cfl;
import defpackage.iho;
import defpackage.lzq;

public final class DefaultExplorerTooltipView extends FrameLayout implements lzq {
    private LensesTooltipView a;
    private View b;
    private final ajxe c;
    private int d;

    static final class a extends akcs implements akbk<ajdp<defpackage.lzq.a>> {
        private /* synthetic */ DefaultExplorerTooltipView a;

        a(DefaultExplorerTooltipView defaultExplorerTooltipView) {
            this.a = defaultExplorerTooltipView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(cfl.c(this.a).p(AnonymousClass1.a)).a();
        }
    }

    static final class b implements Runnable {
        private /* synthetic */ DefaultExplorerTooltipView a;

        b(DefaultExplorerTooltipView defaultExplorerTooltipView) {
            this.a = defaultExplorerTooltipView;
        }

        public final void run() {
            this.a.setVisibility(8);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultExplorerTooltipView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultExplorerTooltipView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultExplorerTooltipView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.c = ajxh.a(new a(this));
    }

    public final ajdp<defpackage.lzq.a> a() {
        return (ajdp) this.c.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        defpackage.lzq.b bVar = (defpackage.lzq.b) obj;
        akcr.b(bVar, "viewModel");
        String str = "tooltipContainerView";
        LensesTooltipView lensesTooltipView;
        if (bVar instanceof defpackage.lzq.b.b) {
            int i = ((defpackage.lzq.b.b) bVar).a.d + this.d;
            View view = this.b;
            String str2 = "anchorView";
            if (view == null) {
                akcr.a(str2);
            }
            if (i != iho.h(view)) {
                view = this.b;
                if (view == null) {
                    akcr.a(str2);
                }
                iho.g(view, i);
            }
            setVisibility(0);
            lensesTooltipView = this.a;
            if (lensesTooltipView == null) {
                akcr.a(str);
            }
            view = this.b;
            if (view == null) {
                akcr.a(str2);
            }
            lensesTooltipView.attachToView(view, true);
            lensesTooltipView = this.a;
            if (lensesTooltipView == null) {
                akcr.a(str);
            }
            lensesTooltipView.show();
            return;
        }
        lensesTooltipView = this.a;
        if (lensesTooltipView == null) {
            akcr.a(str);
        }
        lensesTooltipView.fadeOut();
        postDelayed(new b(this), 200);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
        this.d = getResources().getDimensionPixelSize(R.dimen.lens_camera_explorerbutton_view_bottom_margin);
        Object findViewById = findViewById(R.id.lenses_explorer_tooltip_anchor_view);
        akcr.a(findViewById, "findViewById(R.id.lenses…orer_tooltip_anchor_view)");
        this.b = findViewById;
        findViewById = findViewById(R.id.tooltip_container_view);
        akcr.a(findViewById, "findViewById(R.id.tooltip_container_view)");
        this.a = (LensesTooltipView) findViewById;
        LensesTooltipView lensesTooltipView = this.a;
        if (lensesTooltipView == null) {
            akcr.a("tooltipContainerView");
        }
        lensesTooltipView.setTooltipPointerHorizontalOffsetPx(0);
        lensesTooltipView.setFadeoutDelayAndDuration(3000, 200);
        Object string = lensesTooltipView.getResources().getString(R.string.lenses_discover);
        akcr.a(string, "resources.getString(R.string.lenses_discover)");
        lensesTooltipView.a((CharSequence) string, com.snap.lenses.common.LensesTooltipView.a.HORIZONTAL_RIGHT);
    }
}
