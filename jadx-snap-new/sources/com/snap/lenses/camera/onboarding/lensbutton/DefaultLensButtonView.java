package com.snap.lenses.camera.onboarding.lensbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
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
import defpackage.mbh;
import defpackage.mbh.b;

public final class DefaultLensButtonView extends ImageView implements mbh {
    private final ajxe a;
    private int b;

    static final class a extends akcs implements akbk<ajdp<defpackage.mbh.a>> {
        private /* synthetic */ DefaultLensButtonView a;

        a(DefaultLensButtonView defaultLensButtonView) {
            this.a = defaultLensButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(cfl.c(this.a).p(AnonymousClass1.a)).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultLensButtonView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultLensButtonView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultLensButtonView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.a = ajxh.a(new a(this));
    }

    public final ajdp<defpackage.mbh.a> a() {
        return (ajdp) this.a.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        b bVar = (b) obj;
        akcr.b(bVar, "viewModel");
        if (bVar instanceof defpackage.mbh.b.a) {
            setVisibility(8);
            return;
        }
        if (bVar instanceof b.b) {
            setVisibility(0);
            int i = ((b.b) bVar).a.d + this.b;
            if (iho.h(this) != i) {
                iho.g(this, i);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.b = getResources().getDimensionPixelSize(R.dimen.lens_camera_lensbutton_bottom_margin);
    }
}
