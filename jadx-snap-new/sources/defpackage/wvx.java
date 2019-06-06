package defpackage;

import android.support.v4.view.ViewPager;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: wvx */
public final class wvx extends zll<wvy> {
    public wvv a;
    public final wvl b;
    private final ajei c = new ajei();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final wwd e;
    private final zkf f;

    public wvx(wwd wwd, wvl wvl, zkf zkf) {
        akcr.b(wwd, "attachmentPagesContainer");
        akcr.b(wvl, "reportConfigProvider");
        akcr.b(zkf, "rxBus");
        this.e = wwd;
        this.b = wvl;
        this.f = zkf;
    }

    /* renamed from: a */
    public final void takeTarget(wvy wvy) {
        akcr.b(wvy, "target");
        if (this.d.compareAndSet(false, true)) {
            super.takeTarget(wvy);
            ViewPager a = wvy.a();
            if (a == null) {
                akcr.a();
            }
            a.c(1);
            this.a = new wvv(wvy.b(), this.b, this.e);
            ViewPager a2 = wvy.a();
            wvv wvv = this.a;
            if (wvv == null) {
                akcr.a("attachmentPagerAdapter");
            }
            a2.a((jz) wvv);
            ajej a3 = this.f.a(this);
            akcr.a((Object) a3, "rxBus.subscribe(this)");
            ajvv.a(a3, this.c);
        }
    }

    public final boolean a() {
        wvv wvv = this.a;
        if (wvv == null) {
            akcr.a("attachmentPagerAdapter");
        }
        return (wvv != null ? Boolean.valueOf(wvv.a.contains(wvm.SCREENSHOT)) : null).booleanValue();
    }

    public final void dropTarget() {
        super.dropTarget();
        this.c.a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onAddAttachmentPage(wvf wvf) {
        List list;
        Object obj;
        akcr.b(wvf, "event");
        wvv wvv = this.a;
        if (wvv == null) {
            akcr.a("attachmentPagerAdapter");
        }
        wvm wvm = wvf.a;
        aily aily = wvf.b;
        akcr.b(wvm, "attachmentPageType");
        akcr.b(aily, "reportSource");
        wvv.a.add(wvm);
        if (wvw.a[aily.ordinal()] != 1) {
            list = wvv.a;
            obj = wvm.ADD_BACK;
        } else {
            list = wvv.a;
            obj = wvm.ADD_NEW;
        }
        list.remove(obj);
        wvv.notifyDataSetChanged();
    }
}
