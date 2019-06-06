package defpackage;

import com.google.common.base.Preconditions;
import com.snap.ui.view.TakeSnapButton;
import com.snap.ui.view.ViewFinder;
import com.snapchat.android.R;

/* renamed from: ejh */
public final class ejh {
    private final zhb a;
    private final ejl b;
    private final ejj c;
    private final TakeSnapButton d;
    private boolean e = false;
    private boolean f = true;

    public ejh(ViewFinder viewFinder, zhb zhb, ejl ejl, ejj ejj) {
        this.d = (TakeSnapButton) Preconditions.checkNotNull(viewFinder.findViewById(R.id.camera_capture_button));
        this.a = zhb;
        this.b = ejl;
        this.c = ejj;
    }

    public final void a() {
        if (!this.e) {
            this.e = true;
            this.d.enableCapture(this.c);
            this.b.d();
            if (this.f) {
                this.a.a(this.c);
            }
        }
    }

    public final void b() {
        if (this.e) {
            this.e = false;
            this.d.disableCapture();
            this.b.e();
            if (this.f) {
                this.a.b(this.c);
            }
        }
    }

    public final void c() {
        if (!this.f) {
            this.f = true;
            if (this.e) {
                this.a.a(this.c);
            }
        }
    }

    public final void d() {
        if (this.f) {
            this.f = false;
            if (this.e) {
                this.a.b(this.c);
            }
        }
    }
}
