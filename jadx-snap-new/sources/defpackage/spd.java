package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.google.common.base.Predicate;
import com.snap.opera.view.OperaScalableCircleMaskFrameLayout;

/* renamed from: spd */
public class spd extends spc {
    public static final Predicate<sqh> b = new 1();
    private final OperaScalableCircleMaskFrameLayout c;
    private final alsn d;
    private final tcj e;
    private float f;

    /* renamed from: spd$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return ((sqh) obj).a(sqh.ca, false);
        }
    }

    public spd(Context context) {
        this(context, new alsn(context));
    }

    private spd(Context context, alsn alsn) {
        super(context);
        this.f = 1.0f;
        this.c = (OperaScalableCircleMaskFrameLayout) e();
        this.d = alsn;
        this.e = new tcj(this.a);
        this.a.addView(this.d);
    }

    public final void a(float f, float f2) {
        d(this.f * f2);
        this.c.a(f2);
    }

    public final void a(int i) {
        this.d.setVisibility(i);
    }

    /* Access modifiers changed, original: final */
    public final void a(LayoutParams layoutParams) {
        this.d.setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: final */
    public final void a(ohz ohz) {
        if (ohz.d() != null) {
            this.d.setImageBitmap(((jwj) ohz.d().c.a()).a());
        }
        a(b(ohz));
    }

    public final void a(szo szo) {
        super.a(szo);
        this.c.b();
    }

    public final void a(szw szw) {
        super.a(szw);
        this.e.a();
    }

    public final void ae_() {
        super.ae_();
        this.c.a();
        this.c.c();
        this.f = ((Float) this.I.c(sqh.Y, Float.valueOf(1.0f))).floatValue();
    }

    /* Access modifiers changed, original: protected|final */
    public final abtl b(ohz ohz) {
        Bitmap a = ohz.d() != null ? ((jwj) ohz.d().c.a()).a() : null;
        return a == null ? null : new abtl(a.getWidth(), a.getHeight());
    }

    public final void b() {
        super.b();
        this.c.b();
        this.c.d();
        this.f = 1.0f;
    }

    public final void b(szw szw) {
        super.b(szw);
        this.e.b();
    }

    public final void e(szw szw) {
        super.e(szw);
        this.c.a();
    }

    public final String f() {
        return "OVERLAY_BLOB_ROTATABLE_MEDIA_OVERLAY_IMAGE";
    }

    public final void m() {
        this.d.b(false);
        this.d.setMinimumWidth(1);
        this.d.setMinimumHeight(1);
        this.d.setScaleType(ScaleType.FIT_CENTER);
    }

    public final void n() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        D().a(this.d);
        this.d.setLayoutParams(layoutParams);
        this.d.b(false);
    }

    /* Access modifiers changed, original: final */
    public final void o() {
        z().m();
    }
}
