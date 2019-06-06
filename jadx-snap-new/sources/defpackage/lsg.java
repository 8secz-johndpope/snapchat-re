package defpackage;

import com.snap.lenses.camera.carousel.DefaultCarouselItemView;
import defpackage.lrw.a.b;

/* renamed from: lsg */
public final /* synthetic */ class lsg {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[b.values().length];
        a = iArr;
        iArr[b.IDLE.ordinal()] = 1;
        a[b.IN_PROGRESS.ordinal()] = 2;
        a[b.DONE.ordinal()] = 3;
        iArr = new int[DefaultCarouselItemView.b.values().length];
        b = iArr;
        iArr[DefaultCarouselItemView.b.FADED.ordinal()] = 1;
        b[DefaultCarouselItemView.b.LOADING.ordinal()] = 2;
        b[DefaultCarouselItemView.b.READY.ordinal()] = 3;
    }
}
