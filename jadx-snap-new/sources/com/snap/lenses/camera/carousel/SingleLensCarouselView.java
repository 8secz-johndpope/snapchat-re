package com.snap.lenses.camera.carousel;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajen;
import defpackage.ajfb;
import defpackage.ajfq;
import defpackage.ajot;
import defpackage.ajvo;
import defpackage.ajxt;
import defpackage.ajyu;
import defpackage.akcr;
import defpackage.lrw.a.b;
import defpackage.lsd;
import defpackage.ltc;
import defpackage.mih;

public final class SingleLensCarouselView extends FrameLayout implements lsd {
    View a;
    private int b;
    private DefaultCarouselItemView c;
    private final ajdp<defpackage.lsd.a> d;
    private final ajen e = new ajen();

    static final class a<T> implements ajfb<b> {
        private /* synthetic */ SingleLensCarouselView a;

        a(SingleLensCarouselView singleLensCarouselView) {
            this.a = singleLensCarouselView;
        }

        public final /* synthetic */ void accept(Object obj) {
            b bVar = (b) obj;
            View view = this.a.a;
            if (view == null) {
                akcr.a("overlayView");
            }
            int i = (bVar != null && ltc.a[bVar.ordinal()] == 1) ? 8 : 0;
            view.setVisibility(i);
        }
    }

    public SingleLensCarouselView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
        Object a = ajvo.a(ajot.a);
        akcr.a(a, "Observable.empty()");
        this.d = a;
    }

    public final ajdp<defpackage.lsd.a> a() {
        return this.d;
    }

    public final /* synthetic */ void accept(Object obj) {
        obj = (lsd.b) obj;
        akcr.b(obj, MapboxEvent.KEY_MODEL);
        if (akcr.a(obj, defpackage.lsd.b.a.a)) {
            setVisibility(4);
            return;
        }
        if (obj instanceof lsd.b.b) {
            setVisibility(0);
            lsd.b.b bVar = (lsd.b.b) obj;
            mih mih = bVar.g;
            DefaultCarouselItemView defaultCarouselItemView = this.c;
            String str = "itemView";
            if (defaultCarouselItemView == null) {
                akcr.a(str);
            }
            DefaultCarouselItemView defaultCarouselItemView2 = this.c;
            if (defaultCarouselItemView2 == null) {
                akcr.a(str);
            }
            LayoutParams layoutParams = defaultCarouselItemView2.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, this.b + mih.d);
                defaultCarouselItemView.setLayoutParams(marginLayoutParams);
                defpackage.lrw.a aVar = (defpackage.lrw.a) ajyu.g(bVar.b);
                if (aVar != null) {
                    if (aVar instanceof defpackage.lrw.a.a) {
                        this.e.a(((defpackage.lrw.a.a) aVar).c.f((ajfb) new a(this)));
                    }
                    DefaultCarouselItemView defaultCarouselItemView3 = this.c;
                    if (defaultCarouselItemView3 == null) {
                        akcr.a(str);
                    }
                    defaultCarouselItemView3.accept(aVar);
                    return;
                }
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        this.e.a(ajfq.INSTANCE);
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.lenses_camera_carousel_item_view);
        akcr.a(findViewById, "findViewById(R.id.lenses…amera_carousel_item_view)");
        this.c = (DefaultCarouselItemView) findViewById;
        findViewById = findViewById(R.id.lens_loading_overlay_view);
        akcr.a(findViewById, "findViewById(R.id.lens_loading_overlay_view)");
        this.a = findViewById;
        findViewById = getContext();
        akcr.a(findViewById, "context");
        this.b = findViewById.getResources().getDimensionPixelSize(R.dimen.lens_camera_carousel_single_lens_mode_item_margin);
    }
}
