package com.snap.ui.view.multisnap;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.Preconditions;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.akcr;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.jwa;
import defpackage.zfw;
import defpackage.zlv;
import defpackage.zlx;
import defpackage.zms;

public final class MultiSnapThumbnailViewFactoryProvider {
    static final /* synthetic */ aken[] $$delegatedProperties = new aken[]{new akdc(akde.a(MultiSnapThumbnailViewFactoryProvider.class), "thumbnailMargin", "getThumbnailMargin()I"), new akdc(akde.a(MultiSnapThumbnailViewFactoryProvider.class), "thumbnailContainerBottomMargin", "getThumbnailContainerBottomMargin()I"), new akdc(akde.a(MultiSnapThumbnailViewFactoryProvider.class), "thumbnailHeight", "getThumbnailHeight()I"), new akdc(akde.a(MultiSnapThumbnailViewFactoryProvider.class), "thumbnailWidth", "getThumbnailWidth()I"), new akdc(akde.a(MultiSnapThumbnailViewFactoryProvider.class), "viewFactory", "getViewFactory()Lcom/snap/ui/view/multisnap/MultiSnapThumbnailViewFactoryProvider$ThumbnailViewFactory;")};
    private final jwa bitmapFactory;
    private final Context context;
    private final zfw schedulers;
    private final ajxe thumbnailContainerBottomMargin$delegate = ajxh.a(new MultiSnapThumbnailViewFactoryProvider$thumbnailContainerBottomMargin$2(this));
    private final ajxe thumbnailHeight$delegate = ajxh.a(new MultiSnapThumbnailViewFactoryProvider$thumbnailHeight$2(this));
    private final ajxe thumbnailMargin$delegate = ajxh.a(new MultiSnapThumbnailViewFactoryProvider$thumbnailMargin$2(this));
    private final ajxe thumbnailWidth$delegate = ajxh.a(new MultiSnapThumbnailViewFactoryProvider$thumbnailWidth$2(this));
    private final ajxe viewFactory$delegate = ajxh.a(new MultiSnapThumbnailViewFactoryProvider$viewFactory$2(this));

    public final class ThumbnailViewFactory extends zms {
        public ThumbnailViewFactory() {
            super((zlx) new MultiSnapThumbnailBindingContext(), MultiSnapThumbnailViewType.class);
        }

        public final View getOrCreateView(Context context, zlv zlv, ViewGroup viewGroup) {
            MultiSnapThumbnailView multiSnapThumbnailView = new MultiSnapThumbnailView(MultiSnapThumbnailViewFactoryProvider.this.context, MultiSnapThumbnailViewFactoryProvider.this.schedulers, 0, null, MultiSnapThumbnailView.THUMBNAIL_INVALID_KEY, MultiSnapThumbnailViewFactoryProvider.this.getThumbnailWidth(), MultiSnapThumbnailViewFactoryProvider.this.getThumbnailHeight(), MultiSnapThumbnailViewFactoryProvider.this.getThumbnailMargin(), MultiSnapThumbnailViewFactoryProvider.this.bitmapFactory);
            multiSnapThumbnailView.setVisibility(0);
            return multiSnapThumbnailView;
        }
    }

    public MultiSnapThumbnailViewFactoryProvider(Context context, zfw zfw, jwa jwa) {
        akcr.b(context, "context");
        akcr.b(zfw, "schedulers");
        akcr.b(jwa, "bitmapFactory");
        this.context = context;
        this.schedulers = zfw;
        this.bitmapFactory = jwa;
    }

    private final int calculateThumbnailWidth(Context context, int i) {
        int a = abtp.a(context);
        int b = abtp.b(context);
        boolean z = (b == 0 || a == 0) ? false : true;
        Preconditions.checkState(z);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.multi_snap_thumbnail_border_width) << 1;
        return (((i - dimensionPixelOffset) * Math.min(a, b)) / Math.max(a, b)) + dimensionPixelOffset;
    }

    public final int getThumbnailContainerBottomMargin() {
        return ((Number) this.thumbnailContainerBottomMargin$delegate.b()).intValue();
    }

    public final int getThumbnailHeight() {
        return ((Number) this.thumbnailHeight$delegate.b()).intValue();
    }

    public final int getThumbnailMargin() {
        return ((Number) this.thumbnailMargin$delegate.b()).intValue();
    }

    public final int getThumbnailWidth() {
        return ((Number) this.thumbnailWidth$delegate.b()).intValue();
    }

    public final ThumbnailViewFactory getViewFactory() {
        return (ThumbnailViewFactory) this.viewFactory$delegate.b();
    }
}
