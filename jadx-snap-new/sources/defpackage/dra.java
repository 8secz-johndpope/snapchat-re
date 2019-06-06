package defpackage;

import defpackage.czp.a;
import java.io.Closeable;
import org.opencv.imgproc.Imgproc;

/* renamed from: dra */
public final class dra implements adfh, czq<byte[]> {
    private czn<byte[]> a = null;
    private volatile czo<byte[]> b = a.a;

    private /* synthetic */ void b() {
        this.b = a.a;
    }

    public final Closeable a(czo<byte[]> czo) {
        this.b = czo;
        return new -$$Lambda$dra$Y9QFFpxFwCGlkI8rhHYCeu-MNEc(this);
    }

    public final void a() {
        this.a = null;
        this.b = a.a;
    }

    public final void a(int i) {
        this.a = czn.a.a(i, Imgproc.INTER_TAB_SIZE2);
    }

    public final void a(byte[] bArr, int i) {
        if (this.a != null) {
            this.b.a(bArr, i, this.a);
        }
    }
}
