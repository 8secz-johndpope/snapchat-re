package defpackage;

import android.text.TextUtils;

/* renamed from: tkb */
public final class tkb {

    /* renamed from: tkb$a */
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

    public static agjm a(thi thi) {
        akcr.b(thi, "shippingAddressModel");
        agjm agjm = new agjm();
        if (!TextUtils.isEmpty(thi.d())) {
            agjm.a = thi.d();
        }
        agjm.l = thi.b();
        agjm.m = thi.c();
        agjm.d = thi.h();
        agjm.e = thi.i();
        agjm.f = thi.j();
        agjm.g = thi.k();
        agjm.h = thi.e();
        agjm.i = thi.l();
        return agjm;
    }
}
