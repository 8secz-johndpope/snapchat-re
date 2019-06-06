package com.snap.lenses.camera.snappables.closebutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.ajdp;
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
import defpackage.mep;
import defpackage.mep.b;

public final class DefaultFullScreenCloseButtonView extends ImageView implements mep {
    private final ajxe a;

    static final class a extends akcs implements akbk<ajdp<defpackage.mep.a>> {
        private /* synthetic */ DefaultFullScreenCloseButtonView a;

        a(DefaultFullScreenCloseButtonView defaultFullScreenCloseButtonView) {
            this.a = defaultFullScreenCloseButtonView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return cfl.c(this.a).p(AnonymousClass1.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultFullScreenCloseButtonView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultFullScreenCloseButtonView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultFullScreenCloseButtonView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.a = ajxh.a(new a(this));
    }

    public final ajdp<defpackage.mep.a> a() {
        return (ajdp) this.a.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        int i;
        obj = (b) obj;
        akcr.b(obj, "viewModel");
        if (akcr.a(obj, b.b.a)) {
            i = 0;
        } else if (akcr.a(obj, defpackage.mep.b.a.a)) {
            i = 8;
        } else {
            throw new ajxk();
        }
        setVisibility(i);
    }
}
