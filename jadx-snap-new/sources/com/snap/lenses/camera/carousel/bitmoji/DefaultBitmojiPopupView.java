package com.snap.lenses.camera.carousel.bitmoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snapchat.android.R;
import defpackage.ajdp;
import defpackage.ajdv;
import defpackage.ajfc;
import defpackage.ajwo;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.aqd;
import defpackage.cfl;
import defpackage.ltr;
import defpackage.lvm;

public final class DefaultBitmojiPopupView extends LinearLayout implements ltr {
    final ajwo<defpackage.ltr.a> a;
    BitmojiCreateButton b;
    private final ajxe c;
    private final ajxe d;
    private int e;

    static final class d extends akcs implements akbk<lvm> {
        private /* synthetic */ DefaultBitmojiPopupView a;

        d(DefaultBitmojiPopupView defaultBitmojiPopupView) {
            this.a = defaultBitmojiPopupView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new lvm(this.a);
        }
    }

    static final class c extends akcs implements akbk<ajwo<defpackage.ltr.a>> {
        private /* synthetic */ DefaultBitmojiPopupView a;

        c(DefaultBitmojiPopupView defaultBitmojiPopupView) {
            this.a = defaultBitmojiPopupView;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return this.a.a;
        }
    }

    static final class a implements defpackage.lvm.b<View> {
        private final int a = R.layout.lenses_bitmoji_popup_message_view;

        public final int a() {
            return R.layout.lenses_bitmoji_popup_message_view;
        }

        public final void a(View view) {
            String str = "view";
            akcr.b(view, str);
            akcr.b(view, str);
        }
    }

    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ DefaultBitmojiPopupView a;

        static final class a<T, R> implements ajfc<T, R> {
            public static final a a = new a();

            a() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                akcr.b(obj, "it");
                return defpackage.ltr.a.a.a;
            }
        }

        b(DefaultBitmojiPopupView defaultBitmojiPopupView) {
            this.a = defaultBitmojiPopupView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            View view = (View) obj;
            akcr.b(view, "receiver$0");
            BitmojiCreateButton bitmojiCreateButton = (BitmojiCreateButton) view.findViewById(R.id.lenses_bitmoji_popup_create_button);
            this.a.b = bitmojiCreateButton;
            cfl.c(bitmojiCreateButton).p(a.a).a((ajdv) this.a.a);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(DefaultBitmojiPopupView.class), "popupViewController", "getPopupViewController()Lcom/snap/lenses/camera/carousel/imagepicker/PopupViewController;"), new akdc(akde.a(DefaultBitmojiPopupView.class), aqd.a, "getEvents()Lio/reactivex/Observable;")};
    }

    public DefaultBitmojiPopupView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultBitmojiPopupView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.c = ajxh.a(new d(this));
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<BitmojiPopupView.Event>()");
        this.a = ajwo;
        this.d = ajxh.a(new c(this));
    }

    private final lvm b() {
        return (lvm) this.c.b();
    }

    public final ajdp<defpackage.ltr.a> a() {
        return (ajdp) this.d.b();
    }

    public final /* synthetic */ void accept(Object obj) {
        defpackage.ltr.b bVar = (defpackage.ltr.b) obj;
        akcr.b(bVar, MapboxEvent.KEY_MODEL);
        BitmojiCreateButton bitmojiCreateButton;
        if (bVar instanceof defpackage.ltr.b.b.a) {
            int i = ((defpackage.ltr.b.b.a) bVar).a.d + this.e;
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (marginLayoutParams.bottomMargin != i) {
                    marginLayoutParams.bottomMargin = i;
                    setLayoutParams(marginLayoutParams);
                }
                bitmojiCreateButton = this.b;
                if (bitmojiCreateButton != null) {
                    bitmojiCreateButton.a(false);
                }
                b().a(new a(), new b(this));
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        } else if (bVar instanceof defpackage.ltr.b.b.b) {
            bitmojiCreateButton = this.b;
            if (bitmojiCreateButton != null) {
                bitmojiCreateButton.a(true);
            }
        } else {
            if (bVar instanceof defpackage.ltr.b.a) {
                b().a();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.e = getResources().getDimensionPixelSize(R.dimen.lenses_carousel_imagepicker_bottom_margin);
    }
}
