package defpackage;

import android.widget.Toast;
import com.google.common.base.Preconditions;
import com.snap.ui.view.TakeSnapButton;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;
import defpackage.ehb.b;

/* renamed from: ejm */
public final class ejm implements b {
    private final TakeSnapButton a;
    private final ftl b;
    private final zfw c = zgb.a(dnh.f.callsite("CaptureView"));
    private final ejh d;
    private final ejl e;

    public ejm(ViewFinder viewFinder, ftl ftl, ejh ejh, ejl ejl) {
        this.a = (TakeSnapButton) Preconditions.checkNotNull(viewFinder.findViewById(R.id.camera_capture_button));
        this.b = ftl;
        this.d = ejh;
        this.e = ejl;
    }

    public final void a() {
        this.a.expandInnerCircle();
    }

    public final void a(int i) {
        Toast.makeText(this.a.getContext(), i, 1).show();
    }

    public final void a(boolean z) {
        this.a.prepareForAnimation(z);
    }

    public final void b() {
        this.a.startVideoRecordingRing();
    }

    public final void c() {
        this.a.cancelAnimation();
        this.e.c();
    }

    public final void d() {
        this.d.a();
    }

    public final void e() {
        this.d.b();
    }

    public final void f() {
        this.d.c();
    }

    public final void g() {
        this.d.d();
    }

    public final void h() {
        this.e.b();
    }

    public final void i() {
        this.e.f();
    }

    public final void j() {
        this.e.g();
    }

    public final void k() {
        this.e.h();
    }

    public final void l() {
        this.e.i();
    }

    public final void m() {
        this.e.j();
    }
}
