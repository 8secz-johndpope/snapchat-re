package com.snap.lenses.camera.carousel.locked.cta;

import android.content.Context;
import android.util.AttributeSet;
import com.snap.ui.view.SnapFontTextView;
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
import defpackage.lwd;
import defpackage.lwd.b;

public final class DefaultLockedCtaView extends SnapFontTextView implements lwd {
    private final ajxe b;

    static final class a extends akcs implements akbk<ajdp<defpackage.lwd.a>> {
        private /* synthetic */ DefaultLockedCtaView a;

        a(DefaultLockedCtaView defaultLockedCtaView) {
            this.a = defaultLockedCtaView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajpy.k(cfl.c(this.a).p(AnonymousClass1.a)).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultLockedCtaView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultLockedCtaView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultLockedCtaView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.b = ajxh.a(new a(this));
    }

    public final ajdp<defpackage.lwd.a> a() {
        return (ajdp) this.b.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        b bVar = (b) obj;
        akcr.b(bVar, "viewModel");
        if (bVar instanceof b.b) {
            setText(getResources().getString(R.string.locked_lens_cta_text));
            setVisibility(0);
            return;
        }
        if (bVar instanceof defpackage.lwd.b.a) {
            setVisibility(8);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
    }
}
