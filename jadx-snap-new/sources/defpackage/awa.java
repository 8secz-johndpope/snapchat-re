package defpackage;

import android.net.Uri;
import defpackage.avz.a;
import defpackage.avz.b;

/* renamed from: awa */
public final class awa {
    public Uri a = null;
    b b = b.FULL_FETCH;
    public avl c = null;
    avt d = avt.a;
    a e = a.DEFAULT;
    avh f = avh.HIGH;
    boolean g = true;
    private avk h = null;
    private boolean i = false;
    private boolean j = false;
    private awc k = null;
    private awb l = null;
    private auy m = null;

    /* renamed from: awa$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super("Invalid request builder: ".concat(String.valueOf(str)));
        }
    }

    public final avz a() {
        Uri uri = this.a;
        if (uri != null) {
            if (auw.c(uri)) {
                if (!this.a.isAbsolute()) {
                    throw new a("Resource URI path must be absolute.");
                } else if (this.a.getPath().isEmpty()) {
                    throw new a("Resource URI must not be empty");
                } else {
                    try {
                        Integer.parseInt(this.a.getPath().substring(1));
                    } catch (NumberFormatException unused) {
                        throw new a("Resource URI path must be a resource id.");
                    }
                }
            }
            if (!auw.b(this.a) || this.a.isAbsolute()) {
                return new avz(this);
            }
            throw new a("Asset URI path must be absolute.");
        }
        throw new a("Source must be set!");
    }
}
