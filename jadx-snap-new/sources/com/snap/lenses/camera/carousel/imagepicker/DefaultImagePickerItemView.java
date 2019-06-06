package com.snap.lenses.camera.carousel.imagepicker;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.snap.imageloading.view.SnapImageView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.akcr;
import defpackage.ide;
import defpackage.jxj.b;
import defpackage.luy;
import defpackage.lvf;
import defpackage.mgy;
import defpackage.mhd;
import defpackage.mht;
import defpackage.miq;
import defpackage.miq.e;

public final class DefaultImagePickerItemView extends FrameLayout implements lvf, mhd {
    private static final b e;
    private LoadingSpinnerView a;
    private SnapImageView b;
    private View c;
    private ide d = mgy.a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
        Object f = new defpackage.jxj.b.a().b(true).b();
        akcr.a(f, "ViewBitmapLoader.Request…\n                .build()");
        e = f;
    }

    public DefaultImagePickerItemView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    private static /* synthetic */ void a(DefaultImagePickerItemView defaultImagePickerItemView, miq miq, mht mht, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            mht = mht.b.a;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        defaultImagePickerItemView.a(miq, mht, z, z2);
    }

    private final void a(miq miq, mht mht, boolean z, boolean z2) {
        setActivated(z);
        LoadingSpinnerView loadingSpinnerView = this.a;
        if (loadingSpinnerView == null) {
            akcr.a("loadingSpinner");
        }
        int i = 8;
        loadingSpinnerView.setVisibility(z ? 0 : 8);
        SnapImageView snapImageView = this.b;
        String str = "imageView";
        if (snapImageView == null) {
            akcr.a(str);
        }
        snapImageView.setVisibility(z ? 8 : 0);
        SnapImageView snapImageView2 = this.b;
        if (snapImageView2 == null) {
            akcr.a(str);
        }
        snapImageView2.setAlpha(z2 ? 1.0f : 0.9f);
        View view = this.c;
        if (view == null) {
            akcr.a("border");
        }
        if (z2) {
            i = 0;
        }
        view.setVisibility(i);
        if (!akcr.a((Object) miq, miq.b.a) && (miq instanceof e)) {
            Object f;
            if (mht instanceof defpackage.mht.a) {
                defpackage.mht.a aVar = (defpackage.mht.a) mht;
                luy luy = new luy(aVar.a, aVar.b, aVar.c, aVar.d);
                f = e.a().c(luy).b();
            } else {
                f = e;
            }
            akcr.a(f, "when (imageTransformatio…Options\n                }");
            snapImageView2 = this.b;
            if (snapImageView2 == null) {
                akcr.a(str);
            }
            snapImageView2.setRequestOptions(f);
            SnapImageView snapImageView3 = this.b;
            if (snapImageView3 == null) {
                akcr.a(str);
            }
            Object parse = Uri.parse(((e) miq).a());
            akcr.a(parse, "android.net.Uri.parse(iconUri.uri)");
            snapImageView3.setImageUri(parse, this.d.getAttributionFor("lensImagePickerIcon"));
        }
    }

    public final void a(ide ide) {
        akcr.b(ide, "attributedFeature");
        this.d = ide;
    }

    /* renamed from: a */
    public final void accept(defpackage.lvf.a aVar) {
        miq miq;
        mht mht;
        boolean z;
        boolean z2;
        int i;
        akcr.b(aVar, "viewModel");
        if (aVar instanceof defpackage.lvf.a.b.a) {
            defpackage.lvf.a.b.a aVar2 = (defpackage.lvf.a.b.a) aVar;
            miq = aVar2.a;
            mht = aVar2.c;
            z = false;
            z2 = aVar2.b;
            i = 4;
        } else if (aVar instanceof defpackage.lvf.a.b.b) {
            defpackage.lvf.a.b.b bVar = (defpackage.lvf.a.b.b) aVar;
            miq = bVar.a;
            mht = bVar.b;
            z = true;
            z2 = false;
            i = 8;
        } else {
            if (aVar instanceof defpackage.lvf.a.a) {
                a(this, miq.b.a, null, false, false, 14);
            }
            return;
        }
        a(this, miq, mht, z, z2, i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.loading_spinner);
        akcr.a(findViewById, "findViewById(R.id.loading_spinner)");
        this.a = (LoadingSpinnerView) findViewById;
        findViewById = findViewById(R.id.item_image);
        akcr.a(findViewById, "findViewById(R.id.item_image)");
        this.b = (SnapImageView) findViewById;
        findViewById = findViewById(R.id.border);
        akcr.a(findViewById, "findViewById(R.id.border)");
        this.c = findViewById;
        SnapImageView snapImageView = this.b;
        if (snapImageView == null) {
            akcr.a("imageView");
        }
        snapImageView.setRequestOptions(e);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i2, i2);
    }
}
