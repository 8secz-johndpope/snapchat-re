package defpackage;

import defpackage.dpa.c;
import defpackage.dpb.a;
import defpackage.dpb.b;

/* renamed from: dwb */
public final class dwb extends dwf {
    private final c a;
    private final kaz<jwj> b;
    private final jwa c;

    public dwb(c cVar, kaz<jwj> kaz, jwa jwa) {
        akcr.b(cVar, "takePictureRequestType");
        akcr.b(kaz, "bitmap");
        akcr.b(jwa, "bitmapFactory");
        this.a = cVar;
        this.b = kaz;
        this.c = jwa;
    }

    public final dpb a() {
        int i = dwc.a[this.a.ordinal()];
        if (i == 1) {
            Object b = new dzf(this.c).b();
            akcr.a(b, "ImageTranscodingRequest(….jpegEncodingQuality(100)");
            b = b.a().a(jwz.a(this.b));
            akcr.a(b, "jpegArray");
            return new b(b);
        } else if (i == 2) {
            return new a(this.b);
        } else {
            throw new ajxk();
        }
    }
}
