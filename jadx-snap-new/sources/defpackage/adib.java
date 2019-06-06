package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.google.common.base.Preconditions;

/* renamed from: adib */
public final class adib {
    public int a;
    public int b;
    public int c;
    private final adhk d;
    private final adhm e;
    private final adht f;
    private boolean g;

    /* renamed from: adib$a */
    public static class a {
        public static adib a() {
            return new adib();
        }
    }

    public adib() {
        this(adhk.a, adhm.a, adht.a);
    }

    private adib(adhk adhk, adhm adhm, adht adht) {
        this.g = false;
        this.d = adhk;
        this.e = adhm;
        this.f = adht;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.a = iArr[0];
        GLES20.glBindTexture(3553, this.a);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    private Bitmap b(Bitmap bitmap) {
        double d = (double) adib.d();
        if (((double) bitmap.getWidth()) <= d && ((double) bitmap.getHeight()) <= d) {
            return bitmap;
        }
        double width = (double) bitmap.getWidth();
        Double.isNaN(d);
        Double.isNaN(width);
        width = d / width;
        double height = (double) bitmap.getHeight();
        Double.isNaN(d);
        Double.isNaN(height);
        d = Math.min(width, d / height);
        width = (double) bitmap.getWidth();
        Double.isNaN(width);
        int i = (int) (width * d);
        double height2 = (double) bitmap.getHeight();
        Double.isNaN(height2);
        return Bitmap.createScaledBitmap(bitmap, i, (int) (height2 * d), true);
    }

    public static void b() {
        GLES20.glActiveTexture(adht.a(0));
        GLES20.glBindTexture(3553, 0);
    }

    private static int d() {
        int[] iArr = new int[1];
        adhk.b(iArr);
        return iArr[0];
    }

    private void e() {
        GLES20.glDeleteTextures(1, new int[]{this.a}, 0);
    }

    public final int a() {
        return this.a;
    }

    public final adib a(Bitmap bitmap) {
        return a(bitmap, false);
    }

    public final adib a(Bitmap bitmap, boolean z) {
        Preconditions.checkNotNull(bitmap);
        GLES20.glBindTexture(3553, this.a);
        if (z) {
            bitmap = b(bitmap);
        }
        GLES20.glPixelStorei(3317, 1);
        adhm.a(bitmap);
        this.b = bitmap.getWidth();
        this.c = bitmap.getHeight();
        return this;
    }

    public final void a(int i) {
        GLES20.glActiveTexture(adht.a(i));
        GLES20.glBindTexture(3553, this.a);
    }

    public final void c() {
        if (!this.g) {
            e();
            this.g = true;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void finalize() {
        super.finalize();
    }
}
