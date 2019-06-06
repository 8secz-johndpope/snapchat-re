package defpackage;

import android.content.Context;

/* renamed from: rdi */
public final class rdi extends zim {

    /* renamed from: rdi$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public rdi(Context context, akbk<ajxw> akbk) {
        akcr.b(context, "context");
        akcr.b(akbk, "viewInvalidater");
        super(context, akbk);
    }

    public final void a(zio zio, boolean z, qwl qwl, rgc rgc) {
        akcr.b(zio, "resource");
        if (zio.a != 0) {
            a(zio);
            if (z) {
                a(System.currentTimeMillis());
                return;
            }
            if (!(qwl == null || rgc == null)) {
                int i = 0;
                if (qwl.a) {
                    if (this.b == 2) {
                        i = 1;
                    }
                    if (i == 0) {
                        long j = rgc.a;
                        long currentTimeMillis = System.currentTimeMillis() + j;
                        this.c = j;
                        this.d = currentTimeMillis;
                        this.b = 2;
                        this.e.invoke();
                        return;
                    }
                }
                this.c = 0;
                this.d = 0;
                this.b = 0;
                this.e.invoke();
            }
        }
    }
}
