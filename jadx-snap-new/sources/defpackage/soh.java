package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.View;
import com.snapchat.android.R;
import defpackage.szc.b;

/* renamed from: soh */
public final class soh extends slm implements b {
    private final View a;
    private boolean b;

    /* renamed from: soh$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: soh$b */
    static final class b implements Runnable {
        private /* synthetic */ soh a;

        b(soh soh) {
            this.a = soh;
        }

        public final void run() {
            if (this.a.y()) {
                this.a.C().a("LOCK_SWIPE_INPUT", (szw) this.a.w());
                this.a.C().a("SWIPE_FORWARD_PAGE", (szw) this.a.w());
            }
        }
    }

    static {
        a aVar = new a();
    }

    public soh(Context context) {
        akcr.b(context, "context");
        Object inflate = View.inflate(context, R.layout.opera_swipe_aware_overlay, null);
        akcr.a(inflate, "View.inflate(context, R.…wipe_aware_overlay, null)");
        this.a = inflate;
    }

    public final void T_() {
    }

    public final void a(int i, float f, PointF pointF, float f2) {
    }

    public final void a(int i, int i2, Point point) {
        if (v() == sjo.STARTED && i == 3 && i2 == 3 && this.b) {
            C().a("UNLOCK_SWIPE_INPUT", (szw) w());
        }
    }

    public final void a(int i, int i2, boolean z) {
        if (v() == sjo.STARTED && i == 3 && i2 == 3 && this.b) {
            this.a.post(new b(this));
        }
    }

    public final void ae_() {
        Object a = w().a(sqh.cW);
        akcr.a(a, "page.get(OperaPageModel.…R_THRESHOLD_FOR_SWIPE_UP)");
        this.b = ((Boolean) a).booleanValue();
        z().a((b) this);
    }

    public final View e() {
        return this.a;
    }

    public final String f() {
        return "SWIPE_AWARE_PAGE";
    }
}
