package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.List;

/* renamed from: jys */
public abstract class jys implements jwa {

    /* renamed from: jys$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[Config.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = android.graphics.Bitmap.Config.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = android.graphics.Bitmap.Config.RGB_565;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = android.graphics.Bitmap.Config.ALPHA_8;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = android.graphics.Bitmap.Config.ARGB_4444;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = android.graphics.Bitmap.Config.ARGB_8888;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.jys$1.<clinit>():void");
        }
    }

    private kaz<jwj> a(int i, int i2, Config config, boolean z, String str) {
        return b(i, i2, config, z, str);
    }

    private static void a(int i, int i2) {
        boolean z = true;
        Preconditions.checkArgument(i > 0, "width must be > 0, was: ".concat(String.valueOf(i)));
        if (i2 <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z, "height must be > 0, was: ".concat(String.valueOf(i2)));
    }

    private kaz<jwj> b(int i, int i2, Config config, boolean z, String str) {
        jys.a(i, i2);
        kaz b = b(i, i2, config, str);
        Bitmap a = ((jwj) b.a()).a();
        a.setHasAlpha(z);
        if (config == Config.ARGB_8888 && !z) {
            a.eraseColor(-16777216);
        }
        return b;
    }

    public final kaz<jwj> a(int i, int i2, Config config, String str) {
        return b(i, i2, config, str);
    }

    public final kaz<jwj> a(int i, int i2, String str) {
        return a(i, i2, Config.ARGB_8888, str);
    }

    public final kaz<jwj> a(Bitmap bitmap, int i, int i2, int i3, int i4, Matrix matrix, boolean z, Config config, String str) {
        Config config2;
        kaz<jwj> a;
        Paint paint;
        Bitmap bitmap2 = bitmap;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        Matrix matrix2 = matrix;
        Preconditions.checkNotNull(bitmap2, "Source bitmap cannot be null");
        Preconditions.checkArgument(i5 >= 0, "x must be >= 0, was: ".concat(String.valueOf(i)));
        Preconditions.checkArgument(i6 >= 0, "y must be >= 0, was: ".concat(String.valueOf(i2)));
        jys.a(i3, i4);
        int i9 = i5 + i7;
        Preconditions.checkArgument(i9 <= bitmap.getWidth(), "x + width must be <= bitmap.width()");
        int i10 = i6 + i8;
        Preconditions.checkArgument(i10 <= bitmap.getHeight(), "y + height must be <= bitmap.height()");
        Canvas canvas = new Canvas();
        Rect rect = new Rect(i5, i6, i9, i10);
        RectF rectF = new RectF(MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, (float) i7, (float) i8);
        if (config != null) {
            config2 = config;
        } else {
            Config config3 = Config.ARGB_8888;
            Config config4 = bitmap.getConfig();
            if (config4 != null) {
                i5 = 1.a[config4.ordinal()];
                config3 = i5 != 1 ? i5 != 2 ? Config.ARGB_8888 : Config.ALPHA_8 : Config.RGB_565;
            }
            config2 = config3;
        }
        if (matrix2 == null || matrix.isIdentity()) {
            a = a(i3, i4, config2, bitmap.hasAlpha(), str);
            Bitmap a2 = ((jwj) a.a()).a();
            a2.setDensity(bitmap.getDensity());
            canvas.setBitmap(a2);
            paint = null;
        } else {
            i5 = matrix.rectStaysRect() ^ 1;
            RectF rectF2 = new RectF();
            matrix2.mapRect(rectF2, rectF);
            int round = Math.round(rectF2.width());
            int round2 = Math.round(rectF2.height());
            if (i5 != 0) {
                config2 = Config.ARGB_8888;
            }
            Config config5 = config2;
            boolean z2 = i5 != 0 || bitmap.hasAlpha();
            a = a(round, round2, config5, z2, str);
            Bitmap a3 = ((jwj) a.a()).a();
            a3.setDensity(bitmap.getDensity());
            canvas.setBitmap(a3);
            canvas.translate(-rectF2.left, -rectF2.top);
            canvas.concat(matrix2);
            paint = new Paint();
            paint.setFilterBitmap(z);
            if (i5 != 0) {
                paint.setAntiAlias(true);
            }
        }
        canvas.drawBitmap(bitmap2, rect, rectF, paint);
        canvas.setBitmap(null);
        return a;
    }

    public final kaz<jwj> a(Bitmap bitmap, int i, int i2, int i3, int i4, Matrix matrix, boolean z, String str) {
        return a(bitmap, i, i2, i3, i4, matrix, z, null, str);
    }

    public final kaz<jwj> a(Bitmap bitmap, int i, int i2, int i3, int i4, String str) {
        return a(bitmap, i, i2, i3, i4, null, false, str);
    }

    public final kaz<jwj> a(Bitmap bitmap, int i, int i2, boolean z, String str) {
        jys.a(i, i2);
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        matrix.setScale(((float) i) / ((float) width), ((float) i2) / ((float) height));
        return a(bitmap, 0, 0, width, height, matrix, z, str);
    }

    public final kaz<jwj> a(Bitmap bitmap, Config config, String str) {
        return a(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), null, false, config, str);
    }

    public final kaz<jwj> a(Bitmap bitmap, Matrix matrix, String str) {
        return a(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false, str);
    }

    public final kaz<jwj> a(Bitmap bitmap, String str) {
        return a(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), str);
    }

    public final kaz<jwj> a(kaz<jwj> kaz, int i, int i2, List<jwg> list) {
        if (list.isEmpty()) {
            return kaz;
        }
        try {
            kaz a = (list.size() == 1 ? (jwg) list.get(0) : new jyt(list)).a(this, kaz, i, i2);
            if (a == null || ((jwj) a.a()).a() != ((jwj) kaz.a()).a()) {
                kaz.dispose();
            }
            return a;
        } catch (Throwable th) {
            kaz.dispose();
        }
    }

    public final kaz<jwj> a(kaz<jwj> kaz, List<jwg> list) {
        return a((kaz) kaz, ((jwj) kaz.a()).a().getWidth(), ((jwj) kaz.a()).a().getHeight(), (List) list);
    }

    public abstract kaz<jwj> b(int i, int i2, Config config, String str);

    public final kaz<jwj> b(Bitmap bitmap, String str) {
        return a(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), null, false, str);
    }
}
