package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import com.snap.opera.view.FitWidthImageView;
import defpackage.abtg.1;
import defpackage.abtg.a;

/* renamed from: spf */
public class spf extends spc {
    protected final alsn b;

    public spf(Context context) {
        this(context, new FitWidthImageView(context));
    }

    private spf(Context context, alsn alsn) {
        super(context);
        this.b = alsn;
        this.a.addView(this.b);
    }

    public final void a(int i) {
        this.b.setVisibility(i);
    }

    /* Access modifiers changed, original: final */
    public final void a(LayoutParams layoutParams) {
        this.b.setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: protected */
    public void a(ohz ohz) {
        if (ohz.c() != null) {
            this.b.setImageBitmap(((jwj) ohz.c().c.a()).a());
        }
        a(b(ohz));
    }

    /* Access modifiers changed, original: protected */
    public abtl b(ohz ohz) {
        Bitmap a = ohz.c() != null ? ((jwj) ohz.c().c.a()).a() : null;
        return a == null ? null : new abtl(a.getWidth(), a.getHeight());
    }

    public String f() {
        return "OVERLAY_BLOB_SCREEN_OVERLAY_IMAGE";
    }

    public final void m() {
        szw szw = this.I;
        this.b.b(false);
        this.b.setMinimumWidth(1);
        this.b.setMinimumHeight(1);
        if (szw.c(sqh.F)) {
            ScaleType scaleType;
            a aVar = (a) szw.a(sqh.F);
            if (aVar != null) {
                int i = 1.a[aVar.ordinal()];
                if (i == 1) {
                    scaleType = ScaleType.FIT_CENTER;
                } else if (i == 2 || i == 3) {
                    scaleType = ScaleType.CENTER_CROP;
                }
                this.b.setScaleType(scaleType);
            }
            scaleType = null;
            this.b.setScaleType(scaleType);
        }
    }

    public final void n() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        D().a(this.b);
        this.b.setLayoutParams(layoutParams);
        this.b.b(false);
    }

    /* Access modifiers changed, original: protected */
    public void o() {
        z().m();
    }
}
