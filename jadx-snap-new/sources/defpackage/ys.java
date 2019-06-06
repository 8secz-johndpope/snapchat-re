package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.nio.ByteBuffer;

/* renamed from: ys */
public interface ys {

    /* renamed from: ys$a */
    public interface a {
        Bitmap a(int i, int i2, Config config);

        void a(Bitmap bitmap);

        void a(byte[] bArr);

        void a(int[] iArr);

        byte[] a(int i);

        int[] b(int i);
    }

    ByteBuffer a();

    void a(Config config);

    void b();

    int c();

    int d();

    int e();

    int f();

    Bitmap g();

    void h();
}
