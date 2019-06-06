package defpackage;

import android.content.Context;

/* renamed from: soq */
public final class soq implements sos {
    cd a;
    cb b;
    ce c;
    sop d;
    final Context e;

    /* renamed from: soq$a */
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

    public soq(Context context) {
        akcr.b(context, "context");
        this.e = context;
    }

    public final void a() {
        this.b = null;
        this.c = null;
    }

    public final void a(cb cbVar) {
        akcr.b(cbVar, "client");
        cbVar.a();
        this.c = cbVar.a(this.d);
        this.b = cbVar;
        sop sop = this.d;
        if (sop != null) {
            sop.a();
        }
    }
}
