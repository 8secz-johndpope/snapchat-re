package defpackage;

import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.listener.SnapRecordingListener;
import defpackage.mjm.a;
import defpackage.mjm.a.b;

/* renamed from: mkh */
public final class mkh implements SnapRecordingListener, mjm {
    private final ajws<a> a;
    private final ajdp<a> b;

    /* renamed from: mkh$1 */
    static final class 1 extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        private /* synthetic */ mkh a;

        1(mkh mkh) {
            this.a = mkh;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setSnapRecordingListener(this.a);
            return ajxw.a;
        }
    }

    public mkh(mkx mkx) {
        akcr.b(mkx, "defaultLensCore");
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<Request>().toSerialized()");
        this.a = r;
        r = this.a.f();
        akcr.a(r, "relay.hide()");
        this.b = r;
        mkx.c(new 1(this));
    }

    public final ajfb a() {
        return myr.a();
    }

    public final ajdp<a> b() {
        return this.b;
    }

    public final void captureSnapImage() {
        this.a.a((Object) a.a.a);
    }

    public final void startSnapRecording() {
        this.a.a((Object) b.a.a);
    }

    public final void stopSnapRecording() {
        this.a.a((Object) b.b.a);
    }
}
