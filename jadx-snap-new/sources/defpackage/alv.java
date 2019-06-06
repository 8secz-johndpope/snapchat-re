package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.util.Log;
import java.io.OutputStream;

/* renamed from: alv */
public final class alv implements air<Bitmap> {
    private CompressFormat a;
    private int b;

    public alv() {
        this((byte) 0);
    }

    private alv(byte b) {
        this.a = null;
        this.b = 90;
    }

    public final String a() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }

    public final /* synthetic */ boolean a(Object obj, OutputStream outputStream) {
        Bitmap bitmap = (Bitmap) ((ajn) obj).a();
        long a = apo.a();
        CompressFormat compressFormat = bitmap.hasAlpha() ? CompressFormat.PNG : CompressFormat.JPEG;
        bitmap.compress(compressFormat, this.b, outputStream);
        String str = "BitmapEncoder";
        if (Log.isLoggable(str, 2)) {
            StringBuilder stringBuilder = new StringBuilder("Compressed with type: ");
            stringBuilder.append(compressFormat);
            stringBuilder.append(" of size ");
            stringBuilder.append(aps.a(bitmap));
            stringBuilder.append(" in ");
            stringBuilder.append(apo.a(a));
            Log.v(str, stringBuilder.toString());
        }
        return true;
    }
}
