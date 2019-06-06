package defpackage;

import com.snap.shake2report.ui.gallery.GalleryPageFragment;
import com.snap.shake2report.ui.reportpage.ReportPageFragment;
import com.snap.shake2report.ui.screenshotpage.ScreenshotPageFragment;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: wvt */
public final class wvt implements ajej {
    public final ajwm a;
    private final ajei b = new ajei();
    private final achb<zjm, zjk> c;

    public wvt(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        this.c = achb;
        Object ajwm = new ajwm();
        akcr.a(ajwm, "CompletableSubject.create()");
        this.a = ajwm;
    }

    public final void dispose() {
        this.b.a();
    }

    public final boolean isDisposed() {
        return this.b.isDisposed();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onGalleryPageEnd(wvh wvh) {
        akcr.b(wvh, "event");
        zjf zjf = new zjf(wqv.a, new ReportPageFragment());
        acgu a = acgu.a(acis.e, (achg) wqv.a, false);
        achb achb = this.c;
        achd achd = zjf;
        akcr.a((Object) a, "navigationAction");
        achb.a(achd, a, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onGalleryPageStart(wvi wvi) {
        akcr.b(wvi, "event");
        zjf zjf = new zjf(wqv.f, new GalleryPageFragment());
        acgu a = acgu.a(acis.e, (achg) wqv.f, false);
        achb achb = this.c;
        achd achd = zjf;
        akcr.a((Object) a, "navigationAction");
        achb.a(achd, a, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onScreenshotViewEnd(wvn wvn) {
        akcr.b(wvn, "event");
        zjf zjf = new zjf(wqv.a, new ReportPageFragment());
        acgu a = acgu.a(acis.e, (achg) wqv.a, false);
        achb achb = this.c;
        achd achd = zjf;
        akcr.a((Object) a, "navigationAction");
        achb.a(achd, a, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onScreenshotViewStart(wvo wvo) {
        akcr.b(wvo, "event");
        zjf zjf = new zjf(wqv.b, new ScreenshotPageFragment());
        acgu a = acgu.a(acis.a, (achg) wqv.b, false);
        achb achb = this.c;
        achd achd = zjf;
        akcr.a((Object) a, "navigationAction");
        achb.a(achd, a, null);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onShakeComplete(wvu wvu) {
        akcr.b(wvu, "event");
        this.a.a();
    }
}
