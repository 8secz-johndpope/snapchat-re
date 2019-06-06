package com.snap.lenses.camera.explorer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajpy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxk;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.cfl;
import defpackage.iho;
import defpackage.lyx;
import defpackage.lyx.b;

public final class DefaultExplorerButtonView extends ImageView implements lyx {
    private final ajxe a;
    private int b;

    static final class a extends akcs implements akbk<ajdp<defpackage.lyx.a>> {
        private /* synthetic */ DefaultExplorerButtonView a;

        a(DefaultExplorerButtonView defaultExplorerButtonView) {
            this.a = defaultExplorerButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(cfl.c(this.a).p(AnonymousClass1.a)).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultExplorerButtonView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultExplorerButtonView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultExplorerButtonView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.a = ajxh.a(new a(this));
    }

    public final ajdp<defpackage.lyx.a> a() {
        return (ajdp) this.a.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        int i;
        b bVar = (b) obj;
        akcr.b(bVar, "viewModel");
        if (bVar instanceof b.b) {
            b.b bVar2 = (b.b) bVar;
            int i2 = bVar2.a.d + this.b;
            if (i2 != iho.h(this)) {
                iho.g(this, i2);
                requestLayout();
                invalidate();
            }
            setImageResource(bVar2.b ? R.drawable.lenses_explorer_icon_with_badge : R.drawable.lenses_discover_icon);
            i = 0;
        } else if (bVar instanceof defpackage.lyx.b.a) {
            i = 8;
        } else {
            throw new ajxk();
        }
        setVisibility(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = getResources().getDimensionPixelSize(R.dimen.lens_camera_explorerbutton_view_bottom_margin);
    }
}
