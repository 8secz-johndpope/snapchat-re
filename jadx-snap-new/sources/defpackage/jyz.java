package defpackage;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: jyz */
public final class jyz implements all<jwh> {
    final jwi a;

    /* renamed from: jyz$a */
    public static class a implements akx<jwh, InputStream> {
        private final jwi a;

        public a(jwi jwi) {
            this.a = jwi;
        }

        public final akw<jwh, InputStream> a(Context context, akn akn) {
            return new jyz(this.a);
        }
    }

    public jyz(jwi jwi) {
        this.a = jwi;
    }

    public final /* synthetic */ aiv a(Object obj, int i, int i2) {
        final jwh jwh = (jwh) obj;
        return new aiv<InputStream>() {
            private InputStream a;

            public final /* synthetic */ Object a(aia aia) {
                this.a = (InputStream) jyz.this.a.a(jwh).b();
                return this.a;
            }

            public final void a() {
                try {
                    if (this.a != null) {
                        this.a.close();
                    }
                } catch (IOException unused) {
                }
            }

            public final String b() {
                return jwh.a.toString();
            }

            public final void c() {
            }
        };
    }
}
