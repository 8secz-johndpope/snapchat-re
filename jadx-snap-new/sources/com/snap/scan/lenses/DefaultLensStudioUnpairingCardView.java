package com.snap.scan.lenses;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.ui.view.button.ScButton;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajdt;
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
import defpackage.vum;
import defpackage.vum.b;
import defpackage.vum.b.a.c;
import defpackage.vum.b.a.d;

public final class DefaultLensStudioUnpairingCardView extends ConstraintLayout implements vum {
    ScButton d;
    View e;
    private final ajxe f;

    static final class a extends akcs implements akbk<ajdp<defpackage.vum.a>> {
        private /* synthetic */ DefaultLensStudioUnpairingCardView a;

        a(DefaultLensStudioUnpairingCardView defaultLensStudioUnpairingCardView) {
            this.a = defaultLensStudioUnpairingCardView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ScButton scButton = this.a.d;
            if (scButton == null) {
                akcr.a("unpair");
            }
            ajdt p = cfl.c(scButton).p(AnonymousClass1.a);
            View view = this.a.e;
            if (view == null) {
                akcr.a("cancelButton");
            }
            return ajpy.k(ajdp.b(p, (ajdt) cfl.c(view).p(AnonymousClass2.a))).a();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(DefaultLensStudioUnpairingCardView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultLensStudioUnpairingCardView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultLensStudioUnpairingCardView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, (byte) 0);
        this.f = ajxh.a(new a(this));
    }

    private final void a(boolean z) {
        ScButton scButton = this.d;
        String str = "unpair";
        if (scButton == null) {
            akcr.a(str);
        }
        scButton.setSpinnerVisibility(z);
        scButton = this.d;
        if (scButton == null) {
            akcr.a(str);
        }
        scButton.setClickable(z ^ 1);
    }

    public final /* synthetic */ void accept(Object obj) {
        obj = (b) obj;
        akcr.b(obj, MapboxEvent.KEY_MODEL);
        if (obj instanceof defpackage.vum.b.a.a) {
            a(false);
            ScButton scButton = this.d;
            if (scButton == null) {
                akcr.a("unpair");
            }
            scButton.setText(getResources().getString(R.string.lens_studio_unpair));
        } else if (obj instanceof c) {
            a(true);
        } else {
            if ((obj instanceof defpackage.vum.b.a.b) || akcr.a(obj, d.a)) {
                a(false);
            }
        }
    }

    public final ajdp<defpackage.vum.a> b() {
        return (ajdp) this.f.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.scan_card_item_unpair_lens);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_unpair_lens)");
        this.d = (ScButton) findViewById;
        findViewById = findViewById(R.id.scan_card_item_cancel);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_cancel)");
        this.e = findViewById;
    }
}
