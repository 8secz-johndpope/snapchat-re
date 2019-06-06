package com.snap.spectacles.sharedui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.brightcove.player.event.Event;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.deck.MainPageFragment;
import com.snap.ui.view.LazyIconView;
import com.snap.ui.view.LoadingSpinnerView;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.acgu;
import defpackage.acgv;
import defpackage.achb;
import defpackage.acig;
import defpackage.acip;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.jwj;
import defpackage.jwz;
import defpackage.kaz;
import defpackage.zjf;
import defpackage.zjk;
import defpackage.zjm;

public final class SpectaclesStatusBarView extends LinearLayout {
    public kaz<jwj> a;
    private TextView b;
    private SnapImageView c;
    private LazyIconView d;
    private View e;
    private final ajxe f;

    static final class a extends akcs implements akbk<Integer> {
        private /* synthetic */ SpectaclesStatusBarView a;

        a(SpectaclesStatusBarView spectaclesStatusBarView) {
            this.a = spectaclesStatusBarView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(ContextCompat.getColor(this.a.getContext(), R.color.dark_grey));
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SpectaclesStatusBarView.class), "defaultTextColor", "getDefaultTextColor()I");
    }

    public SpectaclesStatusBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SpectaclesStatusBarView(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.f = ajxh.a(new a(this));
        Object inflate = LayoutInflater.from(getContext()).inflate(R.layout.spectacles_status_bar_view, this, true);
        akcr.a(inflate, "view");
        inflate.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.status_bar_background));
        View findViewById = inflate.findViewById(R.id.status_bar_title);
        if (findViewById != null) {
            this.b = (SnapFontTextView) findViewById;
            findViewById = inflate.findViewById(R.id.spectacles_status_bar_thumbnail);
            if (findViewById != null) {
                this.c = (SnapImageView) findViewById;
                findViewById = inflate.findViewById(R.id.spectacles_status_bar_spectacles_icon);
                if (findViewById != null) {
                    this.d = (LazyIconView) findViewById;
                    View findViewById2 = inflate.findViewById(R.id.spectacles_status_bar_spinner);
                    if (findViewById2 != null) {
                        this.e = (LoadingSpinnerView) findViewById2;
                        inflate = new defpackage.jxj.b.a().d(true).f(true).b();
                        akcr.a(inflate, "ViewBitmapLoader.Request…                 .build()");
                        this.c.setRequestOptions(inflate);
                        setLayoutTransition(new LayoutTransition());
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.LoadingSpinnerView");
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.LazyIconView");
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.imageloading.view.SnapImageView");
        }
        throw new ajxt("null cannot be cast to non-null type com.snap.ui.view.SnapFontTextView");
    }

    public static void a(achb<zjm, zjk> achb, zjm zjm, MainPageFragment mainPageFragment, acgu<zjm> acgu, acgu<zjm> acgu2) {
        akcr.b(achb, "navHost");
        akcr.b(zjm, "deckPageType");
        akcr.b(mainPageFragment, Event.FRAGMENT);
        akcr.b(acgu, "navigationActionDismiss");
        akcr.b(acgu2, "navigationActionPresent");
        achb.b((acig) new acip(achb, new zjf(zjm, mainPageFragment, acgv.a().a(acgu).a()), acgu2));
    }

    public static /* synthetic */ void a(SpectaclesStatusBarView spectaclesStatusBarView, String str, kaz kaz, boolean z, boolean z2, OnClickListener onClickListener, int i) {
        spectaclesStatusBarView.a(str, (i & 2) != 0 ? null : kaz, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : onClickListener);
    }

    private void a(String str, kaz<jwj> kaz, boolean z, boolean z2, OnClickListener onClickListener) {
        TextView textView;
        int i;
        akcr.b(str, "statusText");
        setVisibility(0);
        this.b.setText(str);
        setOnClickListener(onClickListener);
        if (z) {
            textView = this.b;
            i = -65536;
        } else {
            textView = this.b;
            i = ((Number) this.f.b()).intValue();
        }
        textView.setTextColor(i);
        this.b.setVisibility(0);
        if (kaz != null) {
            this.e.setVisibility(8);
            this.d.setVisibility(8);
            this.c.setVisibility(0);
            kaz kaz2 = this.a;
            if (kaz2 != null) {
                kaz2.dispose();
            }
            this.a = kaz;
            this.c.setImageBitmap(jwz.a(kaz));
            return;
        }
        this.c.setVisibility(8);
        if (z2) {
            this.d.setVisibility(8);
            this.e.setVisibility(0);
            return;
        }
        this.d.setVisibility(0);
        this.e.setVisibility(8);
    }
}
