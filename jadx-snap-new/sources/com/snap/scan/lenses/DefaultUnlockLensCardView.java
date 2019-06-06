package com.snap.scan.lenses;

import android.content.Context;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.imageloading.view.SnapImageView;
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
import defpackage.vpg;
import defpackage.vuy;
import defpackage.vuy.b;
import defpackage.vuy.b.a.c;

public final class DefaultUnlockLensCardView extends ConstraintLayout implements vuy {
    ScButton d;
    View e;
    private SnapImageView f;
    private final ajxe g;

    static final class a extends akcs implements akbk<ajdp<defpackage.vuy.a>> {
        private /* synthetic */ DefaultUnlockLensCardView a;

        a(DefaultUnlockLensCardView defaultUnlockLensCardView) {
            this.a = defaultUnlockLensCardView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ScButton scButton = this.a.d;
            if (scButton == null) {
                akcr.a("unlockLens");
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
        new aken[1][0] = new akdc(akde.a(DefaultUnlockLensCardView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultUnlockLensCardView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultUnlockLensCardView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, (byte) 0);
        this.g = ajxh.a(new a(this));
    }

    public final /* synthetic */ void accept(Object obj) {
        obj = (b) obj;
        akcr.b(obj, MapboxEvent.KEY_MODEL);
        if (obj instanceof defpackage.vuy.b.a.a) {
            SnapImageView snapImageView = this.f;
            if (snapImageView == null) {
                akcr.a("lensIcon");
            }
            obj = Uri.parse(((defpackage.vuy.b.a.a) obj).a);
            akcr.a(obj, "Uri.parse(model.icon)");
            snapImageView.setImageUri(obj, vpg.b);
            return;
        }
        String str = "unlockLens";
        ScButton scButton;
        if (obj instanceof c) {
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setText(getResources().getString(R.string.scan_card_unlocking));
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
        } else if (obj instanceof defpackage.vuy.b.a.b) {
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setText(getResources().getString(R.string.scan_card_unlocked));
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setSpinnerVisibility(false);
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setClickable(true);
        } else {
            akcr.a(obj, b.b.a);
        }
    }

    public final ajdp<defpackage.vuy.a> b() {
        return (ajdp) this.g.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.scan_card_item_lens_icon);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_lens_icon)");
        this.f = (SnapImageView) findViewById;
        findViewById = findViewById(R.id.scan_card_item_unlock_lens);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_unlock_lens)");
        this.d = (ScButton) findViewById;
        findViewById = findViewById(R.id.scan_card_item_cancel);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_cancel)");
        this.e = findViewById;
    }
}
