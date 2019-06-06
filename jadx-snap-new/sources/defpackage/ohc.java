package defpackage;

import android.graphics.Bitmap.CompressFormat;
import defpackage.yes.b;
import java.io.Closeable;
import java.io.FileOutputStream;

/* renamed from: ohc */
public final class ohc extends oha {
    private final String l = odv.a();
    private final String m = odv.a();
    private final String n = odv.a();
    private final kaz<jwj> o;
    private final ogw p;

    public ohc(idd idd, String str, kaz<jwj> kaz, ajdw ajdw, iha iha, ogw ogw) {
        akcr.b(idd, "caller");
        akcr.b(str, "sessionId");
        akcr.b(kaz, "bitmap");
        akcr.b(ajdw, "scheduler");
        akcr.b(iha, "serializationHelper");
        akcr.b(ogw, "mediaPackageManager");
        super(idd, str, ajdw, iha, ogw);
        this.o = kaz;
        this.p = ogw;
    }

    public final odx a(abyi abyi, idd idd) {
        akcr.b(abyi, "mediaPackage");
        akcr.b(idd, "caller");
        return new ogz(idd, abyi, this.o, this.c, this.a, this.b, this.p);
    }

    public final void a() {
        super.a();
        this.o.dispose();
    }

    public final String b() {
        return this.l;
    }

    public final String c() {
        return this.m;
    }

    public final String d() {
        return this.n;
    }

    public final abyi l() {
        b f = f();
        Closeable d;
        try {
            d = f.d();
            FileOutputStream fileOutputStream = (FileOutputStream) d;
            Object a = this.o.a();
            akcr.a(a, "bitmap.get()");
            ((jwj) a).a().compress(CompressFormat.JPEG, 100, fileOutputStream);
            akax.a(d, null);
            f.e();
            f.h();
            this.d = null;
            return super.l();
        } catch (Throwable th) {
            f.h();
        }
    }
}
