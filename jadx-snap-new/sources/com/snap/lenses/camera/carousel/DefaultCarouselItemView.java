package com.snap.lenses.camera.carousel;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.mapbox.services.android.telemetry.MapboxEvent;
import com.snap.imageloading.view.SnapImageView;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.ajen;
import defpackage.ajfb;
import defpackage.ajfc;
import defpackage.ajfq;
import defpackage.ajxk;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akde;
import defpackage.akej;
import defpackage.ide;
import defpackage.lrw;
import defpackage.lsg;
import defpackage.lsh;
import defpackage.mgy;
import defpackage.mhd;
import defpackage.miq;
import defpackage.miq.e;

public final class DefaultCarouselItemView extends FrameLayout implements lrw, mhd {
    private static final defpackage.jxj.b h;
    private SnapImageView a;
    private LoadingSpinnerView b;
    private View c;
    private View d;
    private ide e;
    private final ajen f;
    private defpackage.lrw.a g;

    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.lrw.a.b bVar = (defpackage.lrw.a.b) obj;
            akcr.b(bVar, "loadingState");
            int i = lsg.a[bVar.ordinal()];
            if (i == 1) {
                return b.FADED;
            }
            if (i == 2) {
                return b.LOADING;
            }
            if (i == 3) {
                return b.READY;
            }
            throw new ajxk();
        }
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public enum b {
        READY,
        FADED,
        LOADING
    }

    static final class d extends akcq implements akbl<b, ajxw> {
        d(DefaultCarouselItemView defaultCarouselItemView) {
            super(1, defaultCarouselItemView);
        }

        public final String getName() {
            return "applyItemViewState";
        }

        public final akej getOwner() {
            return akde.a(DefaultCarouselItemView.class);
        }

        public final String getSignature() {
            return "applyItemViewState(Lcom/snap/lenses/camera/carousel/DefaultCarouselItemView$ItemViewState;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            b bVar = (b) obj;
            akcr.b(bVar, "p1");
            DefaultCarouselItemView defaultCarouselItemView = (DefaultCarouselItemView) this.receiver;
            int i = lsg.b[bVar.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    defaultCarouselItemView.a(true);
                    defaultCarouselItemView.b(true);
                } else if (i == 3) {
                    defaultCarouselItemView.a(false);
                }
                return ajxw.a;
            }
            defaultCarouselItemView.a(true);
            defaultCarouselItemView.b(false);
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
        Object f = new defpackage.jxj.b.a().a((int) R.drawable.lens_placeholder).b();
        akcr.a(f, "RequestOptions.Builder()…\n                .build()");
        h = f;
    }

    public DefaultCarouselItemView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private DefaultCarouselItemView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.e = mgy.a;
        this.f = new ajen(ajfq.INSTANCE);
    }

    private final void a() {
        this.f.a(ajfq.INSTANCE);
    }

    private final void a(defpackage.lrw.a.a aVar) {
        this.f.a(aVar.c.p(c.a).f((ajfb) new lsh(new d(this))));
    }

    private final void a(miq miq, boolean z, String str) {
        setContentDescription(str);
        setVisibility(0);
        String str2 = "itemImage";
        if (akcr.a((Object) miq, defpackage.miq.b.a)) {
            SnapImageView snapImageView = this.a;
            if (snapImageView == null) {
                akcr.a(str2);
            }
            snapImageView.clear();
            snapImageView = this.a;
            if (snapImageView == null) {
                akcr.a(str2);
            }
            snapImageView.setImageResource(R.drawable.lens_placeholder);
        } else if (miq instanceof e) {
            SnapImageView snapImageView2 = this.a;
            if (snapImageView2 == null) {
                akcr.a(str2);
            }
            snapImageView2.setBackground(null);
            snapImageView2 = this.a;
            if (snapImageView2 == null) {
                akcr.a(str2);
            }
            Object parse = Uri.parse(((e) miq).a());
            akcr.a(parse, "android.net.Uri.parse(iconUri.uri)");
            snapImageView2.setImageUri(parse, this.e.getAttributionFor("lensIcon"));
        }
        c(z);
    }

    private final void a(boolean z, miq miq, boolean z2, String str) {
        if (z) {
            a(miq, z2, str);
        } else {
            b();
        }
    }

    private final void a(boolean z, boolean z2) {
        setVisibility(z ? 0 : 4);
        a(false);
        c(true);
        SnapImageView snapImageView = this.a;
        String str = "itemImage";
        if (snapImageView == null) {
            akcr.a(str);
        }
        snapImageView.setBackground(null);
        if (z2) {
            snapImageView = this.a;
            if (snapImageView == null) {
                akcr.a(str);
            }
            snapImageView.setImageResource(R.drawable.lens_carousel_camera_ring_small);
            return;
        }
        snapImageView = this.a;
        if (snapImageView == null) {
            akcr.a(str);
        }
        snapImageView.clear();
    }

    private final void b() {
        setVisibility(4);
        a(false);
    }

    private final void c(boolean z) {
        View view = this.d;
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
    }

    public final void a(ide ide) {
        akcr.b(ide, "attributedFeature");
        this.e = ide;
    }

    /* renamed from: a */
    public final void accept(defpackage.lrw.a aVar) {
        akcr.b(aVar, MapboxEvent.KEY_MODEL);
        this.g = aVar;
        if (aVar instanceof defpackage.lrw.a.c) {
            a();
            a(aVar.b(), ((defpackage.lrw.a.c) aVar).a);
        } else if (aVar instanceof defpackage.lrw.a.a) {
            if (aVar.b()) {
                a((defpackage.lrw.a.a) aVar);
            } else {
                a();
            }
            a(aVar.b(), ((defpackage.lrw.a.a) aVar).b, ((defpackage.lrw.a.a) aVar).a, aVar.c());
        } else {
            if (aVar instanceof defpackage.lrw.a.d) {
                a(aVar.b(), defpackage.miq.b.a, true, aVar.c());
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        View view = this.c;
        if (view == null) {
            akcr.a("fadeOverlay");
        }
        view.setVisibility(z ? 0 : 8);
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        LoadingSpinnerView loadingSpinnerView = this.b;
        if (loadingSpinnerView == null) {
            akcr.a("loadingSpinner");
        }
        loadingSpinnerView.setVisibility(z ? 0 : 8);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        defpackage.lrw.a aVar = this.g;
        if (!(aVar instanceof defpackage.lrw.a.a)) {
            aVar = null;
        }
        defpackage.lrw.a.a aVar2 = (defpackage.lrw.a.a) aVar;
        if (aVar2 != null) {
            a(aVar2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        a();
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.item_image);
        akcr.a(findViewById, "findViewById(R.id.item_image)");
        this.a = (SnapImageView) findViewById;
        SnapImageView snapImageView = this.a;
        if (snapImageView == null) {
            akcr.a("itemImage");
        }
        snapImageView.setRequestOptions(h);
        findViewById = findViewById(R.id.loading_spinner);
        akcr.a(findViewById, "findViewById(R.id.loading_spinner)");
        this.b = (LoadingSpinnerView) findViewById;
        findViewById = findViewById(R.id.lens_fade_overlay);
        akcr.a(findViewById, "findViewById(R.id.lens_fade_overlay)");
        this.c = findViewById;
        this.d = findViewById(R.id.badge);
    }
}
