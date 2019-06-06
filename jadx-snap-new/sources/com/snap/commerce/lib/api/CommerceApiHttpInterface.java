package com.snap.commerce.lib.api;

import defpackage.aghe;
import defpackage.agip;
import defpackage.agiz;
import defpackage.agjb;
import defpackage.agjd;
import defpackage.agkd;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxp;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akxz;
import defpackage.akyd;
import defpackage.akyh;
import defpackage.gjg;

public interface CommerceApiHttpInterface {
    @akxu(a = {"__payments_header: dummy"})
    @gjg
    @akxy
    ajdx<akxa<aghe>> createCheckout(@akxs(a = "Authorization") String str, @akyh String str2, @akxk aghe aghe);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<agjb>> getProductInfo(@akxs(a = "Authorization") String str, @akyh String str2);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<agjd>> getProductInfoList(@akxs(a = "Authorization") String str, @akyh String str2);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<agjd>> getProductInfoList(@akxs(a = "Authorization") String str, @akyh String str2, @akyd(a = "category_id") String str3);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<agjd>> getProductInfoList(@akxs(a = "Authorization") String str, @akyh String str2, @akyd(a = "category_id") String str3, @akyd(a = "limit") long j, @akyd(a = "offset") long j2);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<agkd>> getStoreInfo(@akxs(a = "Authorization") String str, @akyh String str2);

    @akxu(a = {"__payments_header: dummy"})
    @gjg
    @akxy
    ajdx<akxa<agip>> placeOrder(@akxs(a = "Authorization") String str, @akyh String str2, @akxk agiz agiz);

    @akxz
    @akxu(a = {"__payments_header: dummy"})
    @gjg
    ajdx<akxa<aghe>> updateCheckout(@akxs(a = "Authorization") String str, @akyh String str2, @akxk aghe aghe);
}
