package com.snap.imageloading.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import com.brightcove.player.media.MediaService;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.ajwy;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akbk;
import defpackage.akco;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.idl;
import defpackage.in;
import defpackage.jxj;
import defpackage.jxj.b;
import defpackage.jxk;
import defpackage.jze;
import defpackage.kbc;
import defpackage.kbd;
import defpackage.kbe;
import defpackage.kbf;

public class SnapImageView extends kbc implements jxj {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(SnapImageView.class), "lazyView", "getLazyView()Lcom/snap/imageloading/api/ViewBitmapLoader;")};
    private volatile boolean initialized;
    private final ajxe lazyView$delegate;

    static final class a extends akcs implements akbk<jxj> {
        private /* synthetic */ SnapImageView a;
        private /* synthetic */ ajwy b;

        a(SnapImageView snapImageView, ajwy ajwy) {
            this.a = snapImageView;
            this.b = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            jxk jxk = (jxk) this.b.get();
            if (jxk != null) {
                jxj a = jxk.a(this.a);
                if (a != null) {
                    return a;
                }
            }
            return new jze(this.a);
        }
    }

    public SnapImageView(Context context) {
        this(context, null, 0, null, 14, null);
    }

    public SnapImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, null);
    }

    public SnapImageView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, null);
    }

    public SnapImageView(Context context, AttributeSet attributeSet, int i, ajwy<jxk> ajwy) {
        akcr.b(context, "context");
        akcr.b(ajwy, "viewProvider");
        super(context, attributeSet, i);
        this.lazyView$delegate = ajxh.a(new a(this, ajwy));
        this.initialized = true;
    }

    public /* synthetic */ SnapImageView(Context context, AttributeSet attributeSet, int i, ajwy ajwy, int i2, akco akco) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        if ((i2 & 8) != 0) {
            ajwy = AnonymousClass1.a;
        }
        this(context, attributeSet, i, ajwy);
    }

    private final void assertMainThread() {
    }

    private final jxj getLazyView() {
        return (jxj) this.lazyView$delegate.b();
    }

    private final Drawable transform(Drawable drawable) {
        if (!this.initialized) {
            return drawable;
        }
        if (drawable != null && (getRequestOptions().o || getRequestOptions().g())) {
            Object a;
            Drawable drawable2;
            String str;
            if (drawable instanceof ColorDrawable) {
                a = kbf.a((ColorDrawable) drawable);
                drawable2 = (Drawable) a;
                str = "colorDrawable";
            } else if (drawable instanceof BitmapDrawable) {
                a = kbe.a(getResources(), (BitmapDrawable) drawable);
                drawable2 = (Drawable) a;
                str = "bitmapDrawable";
            } else {
                StringBuilder stringBuilder = new StringBuilder("Rounding is not supported for ");
                stringBuilder.append(drawable.getClass().getSimpleName());
                throw new UnsupportedOperationException(stringBuilder.toString());
            }
            akcr.a(a, str);
            kbd kbd = (kbd) a;
            if (getRequestOptions().o) {
                kbd.a(true);
            } else {
                kbd.a(getRequestOptions().q);
            }
            drawable = drawable2;
        }
        return drawable;
    }

    public void clear() {
        assertMainThread();
        jxj lazyView = getLazyView();
        if (lazyView != null) {
            lazyView.clear();
        }
    }

    public Uri getImageUri() {
        jxj lazyView = getLazyView();
        return lazyView != null ? lazyView.getImageUri() : null;
    }

    public b getRequestOptions() {
        jxj lazyView = getLazyView();
        if (lazyView != null) {
            b requestOptions = lazyView.getRequestOptions();
            if (requestOptions != null) {
                return requestOptions;
            }
        }
        throw new IllegalStateException("Unable to retrieve options");
    }

    public idl getUiPage() {
        jxj lazyView = getLazyView();
        return lazyView != null ? lazyView.getUiPage() : null;
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        in.a("SnapImageView OnLayout");
        super.onLayout(z, i, i2, i3, i4);
        in.a();
    }

    public void onMeasure(int i, int i2) {
        in.a("SnapImageView OnMeasure");
        super.onMeasure(i, i2);
        in.a();
    }

    public void setImageDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        if (drawable2 instanceof Animatable) {
            ((Animatable) drawable2).stop();
        }
        drawable = transform(drawable);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        assertMainThread();
        setImageDrawable(ContextCompat.getDrawable(getContext(), i));
    }

    public void setImageURI(Uri uri) {
        throw new UnsupportedOperationException("Please use setImageUri(Uri, UiPage)");
    }

    public void setImageUri(Uri uri, idl idl) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(idl, "uiPage");
        assertMainThread();
        jxj lazyView = getLazyView();
        if (lazyView != null) {
            lazyView.setImageUri(uri, idl);
        }
    }

    public void setRequestListener(defpackage.jxj.a aVar) {
        akcr.b(aVar, "listener");
        jxj lazyView = getLazyView();
        if (lazyView != null) {
            lazyView.setRequestListener(aVar);
        }
    }

    public void setRequestOptions(b bVar) {
        akcr.b(bVar, MediaService.OPTIONS);
        jxj lazyView = getLazyView();
        if (lazyView != null) {
            lazyView.setRequestOptions(bVar);
        }
    }
}
