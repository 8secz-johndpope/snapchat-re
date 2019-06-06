package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: acf */
public final class acf implements za<ByteBuffer> {
    private static boolean a(ByteBuffer byteBuffer, File file) {
        try {
            ahc.a(byteBuffer, file);
            return true;
        } catch (IOException e) {
            String str = "ByteBufferEncoder";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Failed to write data", e);
            }
            return false;
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, zf zfVar) {
        return acf.a((ByteBuffer) obj, file);
    }
}
