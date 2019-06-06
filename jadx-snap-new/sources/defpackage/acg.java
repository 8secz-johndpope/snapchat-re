package defpackage;

import android.util.Log;
import defpackage.acq.a;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: acg */
public final class acg implements acq<File, ByteBuffer> {

    /* renamed from: acg$a */
    static final class a implements zm<ByteBuffer> {
        private final File a;

        a(File file) {
            this.a = file;
        }

        public final Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public final void a(yk ykVar, defpackage.zm.a<? super ByteBuffer> aVar) {
            try {
                aVar.a(ahc.a(this.a));
            } catch (IOException e) {
                String str = "ByteBufferFileLoader";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Failed to obtain ByteBuffer for file", e);
                }
                aVar.a(e);
            }
        }

        public final void b() {
        }

        public final void c() {
        }

        public final yx d() {
            return yx.LOCAL;
        }
    }

    /* renamed from: acg$b */
    public static class b implements acr<File, ByteBuffer> {
        public final acq<File, ByteBuffer> a(acu acu) {
            return new acg();
        }
    }

    public final /* synthetic */ a a(Object obj, int i, int i2, zf zfVar) {
        File file = (File) obj;
        return new a(new ahb(file), new a(file));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }
}
