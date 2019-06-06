package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: adbr */
public final class adbr {
    public acua a;
    public acua b;
    private final Resources c;
    private final ajei d;
    private final jwb e;

    /* renamed from: adbr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public adbr(Resources resources, ajei ajei, jwb jwb) {
        akcr.b(resources, "resources");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(jwb, "bitmapFactoryProvider");
        this.c = resources;
        this.d = ajei;
        this.e = jwb;
    }

    public final acua a(int i) {
        jwa a = this.e.a(adcw.b);
        Drawable drawable = this.c.getDrawable(i);
        if (drawable != null) {
            Object a2 = aday.a(a, ((BitmapDrawable) drawable).getBitmap(), "MapStatusBitmapProvider");
            akcr.a(a2, "GoodBitmapUtil.createSca…ubble_size, TAG\n        )");
            kaz kaz = a2.a;
            if (kaz == null) {
                return a2;
            }
            this.d.a((ajej) kaz);
            a2 = acua.a(a2.b);
            akcr.a(a2, "BitmapEntry.immutable(entry.bitmap)");
            return a2;
        }
        throw new ajxt("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
    }
}
