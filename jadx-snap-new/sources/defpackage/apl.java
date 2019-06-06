package defpackage;

import android.util.Log;
import java.util.Queue;
import org.opencv.imgproc.Imgproc;

/* renamed from: apl */
public final class apl {
    public static final apl a = new apl();
    private final Queue<byte[]> b = aps.a(0);

    private apl() {
    }

    public final boolean a(byte[] bArr) {
        boolean z = false;
        if (bArr.length != Imgproc.FLOODFILL_FIXED_RANGE) {
            return false;
        }
        synchronized (this.b) {
            if (this.b.size() < 32) {
                z = true;
                this.b.offer(bArr);
            }
        }
        return z;
    }

    public final byte[] a() {
        byte[] bArr;
        synchronized (this.b) {
            bArr = (byte[]) this.b.poll();
        }
        if (bArr == null) {
            bArr = new byte[Imgproc.FLOODFILL_FIXED_RANGE];
            if (Log.isLoggable("ByteArrayPool", 3)) {
                Log.d("ByteArrayPool", "Created temp bytes");
            }
        }
        return bArr;
    }
}
