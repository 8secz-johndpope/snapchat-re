package com.snap.opera.view.market;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import com.snapchat.android.framework.ui.views.openlayout.OpenLayout;
import defpackage.absl;
import defpackage.absn.a;
import defpackage.abtx;

public class CardInteractionLayerView extends OpenLayout {
    public boolean a = false;
    public int b;
    public float c;
    public ImageView d;
    public LoadingSpinnerView e;
    public OpenLayout f;
    public TextView g;
    public TextView h;
    public View i;

    /* renamed from: com.snap.opera.view.market.CardInteractionLayerView$2 */
    public class AnonymousClass2 extends abtx {
        private /* synthetic */ Runnable a;

        public AnonymousClass2(Runnable runnable) {
            this.a = runnable;
        }

        public final void onAnimationEnd(Animator animator) {
            CardInteractionLayerView.this.a = true;
            this.a.run();
        }
    }

    public CardInteractionLayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = a.a.c() ? new absl(context).c() : new absl(context).b();
        this.c = getResources().getDimension(R.dimen.card_interaction_card_margin);
    }

    public final void a() {
        this.i.animate().alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(300);
        this.f.animate().y((float) this.b).alpha(MapboxConstants.MINIMUM_ZOOM).setDuration(300).setListener(new abtx() {
            public final void onAnimationEnd(Animator animator) {
                CardInteractionLayerView.this.a = false;
            }
        });
        this.f.setVisibility(8);
    }

    /* Access modifiers changed, original: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ImageView) findViewById(R.id.app_icon);
        this.g = (TextView) findViewById(R.id.card_interaction_main_label);
        this.h = (TextView) findViewById(R.id.card_interaction_sub_label);
        this.i = findViewById(R.id.blank_background);
        this.e = (LoadingSpinnerView) findViewById(R.id.card_interaction_spinner);
        this.f = (OpenLayout) findViewById(R.id.card_interaction_card_view);
        this.f.setTranslationY((float) this.b);
    }
}
