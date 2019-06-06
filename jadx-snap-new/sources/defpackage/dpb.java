package defpackage;

import android.graphics.Bitmap;
import defpackage.jwr.a;
import java.io.ByteArrayInputStream;

/* renamed from: dpb */
public abstract class dpb {

    /* renamed from: dpb$a */
    public static final class a extends dpb {
        public final kaz<jwj> a;
        private final Bitmap b = jwz.a(this.a);

        public a(kaz<jwj> kaz) {
            akcr.b(kaz, "refCountBitmap");
            super();
            this.a = kaz;
        }

        public final int a() {
            return this.b.getWidth();
        }

        public final int b() {
            return this.b.getHeight();
        }
    }

    /* renamed from: dpb$b */
    public static final class b extends dpb {
        public final byte[] a;
        private final int b;
        private final int c;

        public b(byte[] bArr) {
            akcr.b(bArr, "jpegData");
            super();
            this.a = bArr;
            jxe a = a.a(new ByteArrayInputStream(this.a));
            this.b = a.a;
            this.c = a.b;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.c;
        }
    }

    private dpb() {
    }

    public /* synthetic */ dpb(byte b) {
        this();
    }

    public abstract int a();

    public abstract int b();
}
