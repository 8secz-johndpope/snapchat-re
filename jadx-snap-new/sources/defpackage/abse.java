package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.absb.a;

/* renamed from: abse */
public final class abse extends DisplayMetrics {
    public abse() {
        this(AppContext.get().getApplicationContext());
    }

    public abse(Context context) {
        this(((WindowManager) context.getSystemService("window")).getDefaultDisplay(), a.a);
    }

    private abse(Display display, absb absb) {
        int b;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        display.getMetrics(displayMetrics);
        setTo(displayMetrics);
        if ((absn.a.a.c() || absn.a.a.a) && !absb.a) {
            Point point = new Point();
            display.getRealSize(point);
            this.widthPixels = abso.a(point, false);
            b = abso.b(point, false);
        } else {
            this.widthPixels = abso.a(displayMetrics, false);
            b = abso.b(displayMetrics, false);
        }
        this.heightPixels = b;
        if (this.widthPixels != displayMetrics.widthPixels) {
            this.xdpi = displayMetrics.ydpi;
            this.ydpi = displayMetrics.xdpi;
        }
    }
}
