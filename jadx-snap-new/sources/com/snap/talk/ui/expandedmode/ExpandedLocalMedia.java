package com.snap.talk.ui.expandedmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.snap.ui.autofocus.AutofocusTapView;
import com.snapchat.android.R;
import defpackage.abjd;
import defpackage.abjr;
import defpackage.abtc;
import defpackage.acbm;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.iho;
import defpackage.ihp;
import defpackage.zav;
import defpackage.zba;

public final class ExpandedLocalMedia extends FrameLayout {
    public final View a;
    public final ViewGroup b;
    public final ViewGroup c;
    public final View d;
    public zba e;
    public abjd f;
    public abjr g;
    public View h;
    public boolean i;
    public final SimpleOnGestureListener j = new c(this);
    private final ajxe k = ajxh.a(new e(this));
    private final ajxe l = ajxh.a(new b(this));
    private final ajxe m = ajxh.a(new a(this));
    private final ajxe n = ajxh.a(new f(this));
    private boolean o = true;
    private ajej p;

    /* renamed from: com.snap.talk.ui.expandedmode.ExpandedLocalMedia$1 */
    static final class AnonymousClass1 implements OnClickListener {
        private /* synthetic */ ExpandedLocalMedia a;

        AnonymousClass1(ExpandedLocalMedia expandedLocalMedia) {
            this.a = expandedLocalMedia;
        }

        public final void onClick(View view) {
            if (!this.a.c()) {
                ExpandedLocalMedia.b(this.a);
            }
        }
    }

    public static final class c extends SimpleOnGestureListener {
        private /* synthetic */ ExpandedLocalMedia a;

        c(ExpandedLocalMedia expandedLocalMedia) {
            this.a = expandedLocalMedia;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            akcr.b(motionEvent, "e");
            acbm.a().a("ExpandedLocalMedia");
            ExpandedLocalMedia.a(this.a);
            return true;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            akcr.b(motionEvent, "e");
            acbm.a().a("ExpandedLocalMedia");
            if (ExpandedLocalMedia.c(this.a).e()) {
                ((AutofocusTapView) this.a.m.b()).bringToFront();
                ((AutofocusTapView) this.a.m.b()).a(motionEvent.getX(), motionEvent.getY());
                ExpandedLocalMedia.c(this.a).a(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }
    }

    static final class d<T> implements ajfb<Integer> {
        private /* synthetic */ ExpandedLocalMedia a;

        d(ExpandedLocalMedia expandedLocalMedia) {
            this.a = expandedLocalMedia;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            ExpandedLocalMedia expandedLocalMedia = this.a;
            akcr.a(obj, "it");
            iho.e(expandedLocalMedia, obj.intValue());
        }
    }

    static final class a extends akcs implements akbk<AutofocusTapView> {
        private /* synthetic */ ExpandedLocalMedia a;

        a(ExpandedLocalMedia expandedLocalMedia) {
            this.a = expandedLocalMedia;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View inflate = ((ViewStub) this.a.findViewById(R.id.autofocus_tapspot_stub)).inflate();
            if (inflate != null) {
                return (AutofocusTapView) inflate;
            }
            throw new ajxt("null cannot be cast to non-null type com.snap.ui.autofocus.AutofocusTapView");
        }
    }

    static final class b extends akcs implements akbk<View> {
        final /* synthetic */ ExpandedLocalMedia a;

        static final class a implements OnClickListener {
            private /* synthetic */ b a;

            a(b bVar) {
                this.a = bVar;
            }

            public final void onClick(View view) {
                if (!this.a.a.c()) {
                    ExpandedLocalMedia.b(this.a.a);
                }
            }
        }

        b(ExpandedLocalMedia expandedLocalMedia) {
            this.a = expandedLocalMedia;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View findViewById = this.a.findViewById(R.id.expanded_local_media_close_button);
            findViewById.setOnClickListener(new a(this));
            return findViewById;
        }
    }

    static final class e extends akcs implements akbk<ImageView> {
        final /* synthetic */ ExpandedLocalMedia a;

        static final class a implements OnClickListener {
            private /* synthetic */ e a;

            a(e eVar) {
                this.a = eVar;
            }

            public final void onClick(View view) {
                ExpandedLocalMedia.a(this.a.a);
            }
        }

        e(ExpandedLocalMedia expandedLocalMedia) {
            this.a = expandedLocalMedia;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ImageView imageView = (ImageView) this.a.findViewById(R.id.expanded_local_media_swap_camera_button);
            imageView.setOnClickListener(new a(this));
            return imageView;
        }
    }

    static final class f extends akcs implements akbk<abtc> {
        private /* synthetic */ ExpandedLocalMedia a;

        f(ExpandedLocalMedia expandedLocalMedia) {
            this.a = expandedLocalMedia;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new abtc(this.a.a(), (byte) 0);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ExpandedLocalMedia.class), "swapCameraButton", "getSwapCameraButton$sc_talk_release()Landroid/widget/ImageView;"), new akdc(akde.a(ExpandedLocalMedia.class), "closeButton", "getCloseButton$sc_talk_release()Landroid/view/View;"), new akdc(akde.a(ExpandedLocalMedia.class), "autofocusTapView", "getAutofocusTapView()Lcom/snap/ui/autofocus/AutofocusTapView;"), new akdc(akde.a(ExpandedLocalMedia.class), "switchCameraBouncyToucher", "getSwitchCameraBouncyToucher()Lcom/snapchat/android/framework/ui/BouncyToucher;")};
    }

    public ExpandedLocalMedia(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet);
        ihp.a(this, R.layout.expanded_local_media);
        Object findViewById = findViewById(R.id.expanded_local_media_container);
        akcr.a(findViewById, "findViewById(R.id.expanded_local_media_container)");
        this.c = (ViewGroup) findViewById;
        findViewById = findViewById(R.id.local_media_container_space);
        akcr.a(findViewById, "findViewById(R.id.local_media_container_space)");
        this.d = findViewById;
        findViewById = findViewById(R.id.expanded_local_media_lenses_container);
        akcr.a(findViewById, "findViewById(R.id.expand…l_media_lenses_container)");
        this.b = (ViewGroup) findViewById;
        findViewById = findViewById(R.id.not_dismissible_elm_area);
        akcr.a(findViewById, "findViewById(R.id.not_dismissible_elm_area)");
        this.a = findViewById;
        setClipChildren(false);
        setClipToPadding(false);
        setOnClickListener(new AnonymousClass1(this));
    }

    public static final /* synthetic */ void b(ExpandedLocalMedia expandedLocalMedia) {
        zba zba = expandedLocalMedia.e;
        String str = "uiController";
        if (zba == null) {
            akcr.a(str);
        }
        zba.d(false);
        zba zba2 = expandedLocalMedia.e;
        if (zba2 == null) {
            akcr.a(str);
        }
        zba2.ag_();
    }

    public static final /* synthetic */ abjd c(ExpandedLocalMedia expandedLocalMedia) {
        abjd abjd = expandedLocalMedia.f;
        if (abjd == null) {
            akcr.a("cameraServices");
        }
        return abjd;
    }

    public final ImageView a() {
        return (ImageView) this.k.b();
    }

    public final void a(boolean z) {
        abjr abjr = this.g;
        if (abjr == null) {
            akcr.a("lensesServices");
        }
        if (!abjr.c()) {
            z = false;
        }
        if (this.o != z) {
            int dimensionPixelSize;
            int i;
            this.o = z;
            if (this.o) {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.expanded_lenses_container_margin_bottom);
                i = 0;
            } else {
                dimensionPixelSize = 0;
                i = 8;
            }
            this.b.setPadding(0, 0, 0, dimensionPixelSize);
            this.b.setVisibility(i);
            View view = this.h;
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    public final View b() {
        return (View) this.l.b();
    }

    public final boolean c() {
        return this.a.getVisibility() == 4;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i) {
            this.p = new zav(this).a().f((ajfb) new d(this));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ajej ajej = this.p;
        if (ajej != null) {
            ajej.dispose();
        }
    }
}
