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
import defpackage.vus;
import defpackage.vus.b;

public final class DefaultRemoveLensCardView extends ConstraintLayout implements vus {
    ScButton d;
    View e;
    private final ajxe f;

    static final class a extends akcs implements akbk<ajdp<defpackage.vus.a>> {
        private /* synthetic */ DefaultRemoveLensCardView a;

        a(DefaultRemoveLensCardView defaultRemoveLensCardView) {
            this.a = defaultRemoveLensCardView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ScButton scButton = this.a.d;
            if (scButton == null) {
                akcr.a("removeLens");
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
        new aken[1][0] = new akdc(akde.a(DefaultRemoveLensCardView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultRemoveLensCardView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultRemoveLensCardView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, (byte) 0);
        this.f = ajxh.a(new a(this));
    }

    public final /* synthetic */ void accept(Object obj) {
        b bVar = (b) obj;
        akcr.b(bVar, MapboxEvent.KEY_MODEL);
        String str = "removeLens";
        ScButton scButton;
        if (bVar instanceof defpackage.vus.b.a.a) {
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setClickable(true);
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setSpinnerVisibility(false);
            return;
        }
        if (bVar instanceof defpackage.vus.b.a.b) {
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setClickable(false);
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setSpinnerVisibility(true);
        }
    }

    public final ajdp<defpackage.vus.a> b() {
        return (ajdp) this.f.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.scan_card_item_remove_lens);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_remove_lens)");
        this.d = (ScButton) findViewById;
        findViewById = findViewById(R.id.scan_card_item_cancel);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_cancel)");
        this.e = findViewById;
    }
}
