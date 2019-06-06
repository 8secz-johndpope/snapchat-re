package com.snap.scan.lenses;

import android.content.Context;
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
import defpackage.vug;
import defpackage.vug.b;
import defpackage.vug.b.a.c;
import defpackage.vug.b.a.d;

public final class DefaultLensStudioPairingCardView extends ConstraintLayout implements vug {
    ScButton d;
    View e;
    private SnapImageView f;
    private final ajxe g;

    static final class a extends akcs implements akbk<ajdp<defpackage.vug.a>> {
        private /* synthetic */ DefaultLensStudioPairingCardView a;

        a(DefaultLensStudioPairingCardView defaultLensStudioPairingCardView) {
            this.a = defaultLensStudioPairingCardView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ScButton scButton = this.a.d;
            if (scButton == null) {
                akcr.a("pairLens");
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
        new aken[1][0] = new akdc(akde.a(DefaultLensStudioPairingCardView.class), aqd.a, "getEvents()Lio/reactivex/Observable;");
    }

    public DefaultLensStudioPairingCardView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultLensStudioPairingCardView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, (byte) 0);
        this.g = ajxh.a(new a(this));
    }

    public final /* synthetic */ void accept(Object obj) {
        b bVar = (b) obj;
        akcr.b(bVar, MapboxEvent.KEY_MODEL);
        String str = "pairLens";
        ScButton scButton;
        if (bVar instanceof defpackage.vug.b.a.a) {
            SnapImageView snapImageView = this.f;
            if (snapImageView == null) {
                akcr.a("lensIcon");
            }
            snapImageView.setImageResource(R.drawable.studio3d_icon);
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setText(getResources().getString(R.string.studio3d_sync_dialog_connect));
        } else if (bVar instanceof c) {
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setText(getResources().getString(R.string.studio3d_sync_dialog_connecting));
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
        } else if (bVar instanceof defpackage.vug.b.a.b) {
            scButton = this.d;
            if (scButton == null) {
                akcr.a(str);
            }
            scButton.setText(getResources().getString(R.string.studio3d_sync_dialog_connect));
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
            if (bVar instanceof d) {
                scButton = this.d;
                if (scButton == null) {
                    akcr.a(str);
                }
                scButton.setText(getResources().getString(R.string.studio3d_sync_dialog_connect_failed));
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
            }
        }
    }

    public final ajdp<defpackage.vug.a> b() {
        return (ajdp) this.g.b();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.scan_card_item_lens_icon);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_lens_icon)");
        this.f = (SnapImageView) findViewById;
        findViewById = findViewById(R.id.scan_card_item_pair_lens);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_pair_lens)");
        this.d = (ScButton) findViewById;
        findViewById = findViewById(R.id.scan_card_item_cancel);
        akcr.a(findViewById, "findViewById(R.id.scan_card_item_cancel)");
        this.e = findViewById;
    }
}
