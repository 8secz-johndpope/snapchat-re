package com.snap.payments.pixel.api;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxm;
import defpackage.akxo;
import defpackage.akxu;
import defpackage.akxy;

public interface PixelApiHttpInterface {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    @akxu(a = {"Content-Type: application/x-www-form-urlencoded"})
    @akxo
    @akxy(a = "https://tr.snapchat.com/p")
    ajdx<akxa<Void>> sendAddBillingEvent(@akxm(a = "pid") String str, @akxm(a = "ev") String str2, @akxm(a = "v") String str3, @akxm(a = "ts") String str4, @akxm(a = "u_hmai") String str5, @akxm(a = "u_hem") String str6, @akxm(a = "u_hpn") String str7, @akxm(a = "e_iids") String str8, @akxm(a = "e_su") String str9);

    @akxu(a = {"Content-Type: application/x-www-form-urlencoded"})
    @akxo
    @akxy(a = "https://tr.snapchat.com/p")
    ajdx<akxa<Void>> sendAddToCartEvent(@akxm(a = "pid") String str, @akxm(a = "ev") String str2, @akxm(a = "v") String str3, @akxm(a = "ts") String str4, @akxm(a = "u_hmai") String str5, @akxm(a = "u_hem") String str6, @akxm(a = "u_hpn") String str7, @akxm(a = "e_iids") String str8, @akxm(a = "e_cur") String str9, @akxm(a = "e_pr") String str10);

    @akxu(a = {"Content-Type: application/x-www-form-urlencoded"})
    @akxo
    @akxy(a = "https://tr.snapchat.com/p")
    ajdx<akxa<Void>> sendViewContentEvent(@akxm(a = "pid") String str, @akxm(a = "ev") String str2, @akxm(a = "v") String str3, @akxm(a = "ts") String str4, @akxm(a = "u_hmai") String str5, @akxm(a = "u_hem") String str6, @akxm(a = "u_hpn") String str7, @akxm(a = "e_iids") String str8, @akxm(a = "e_cur") String str9, @akxm(a = "e_pr") String str10);
}
