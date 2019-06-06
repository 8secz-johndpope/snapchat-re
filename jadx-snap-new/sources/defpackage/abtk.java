package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.WindowManager;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import defpackage.abtm.a;

/* renamed from: abtk */
final class abtk implements a {
    private final Supplier<abtl> a;

    abtk(final Context context) {
        this.a = Suppliers.memoize(new Supplier<abtl>() {
            public final /* synthetic */ Object get() {
                return abtk.a(context);
            }
        });
    }

    protected static abtl a(Context context) {
        int i;
        Point point = new Point();
        try {
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        } catch (Exception unused) {
            point = null;
        }
        int i2 = -1;
        if (point == null) {
            i = -1;
        } else if (point.x < point.y) {
            i2 = point.x;
            i = point.y;
        } else {
            i2 = point.y;
            i = point.x;
        }
        return new abtl(i2, i);
    }

    public final int a() {
        return ((abtl) this.a.get()).c();
    }

    public final int b() {
        return ((abtl) this.a.get()).b();
    }
}
