package com.snap.payments.lib.api;

import defpackage.aedh;
import defpackage.aggw;
import defpackage.aghn;
import defpackage.agij;
import defpackage.agip;
import defpackage.agit;
import defpackage.agjm;
import defpackage.ahio;
import defpackage.ahir;
import defpackage.ahix;
import defpackage.ahjg;
import defpackage.ahjl;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxp;
import defpackage.akxr;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akxz;
import defpackage.akyc;
import defpackage.akyh;
import defpackage.gjg;

public interface PaymentsApiHttpInterface {
    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final a Companion = a.a;
    public static final String STUB_HEADER = "__payments_header";
    public static final String STUB_VALUE = "dummy";

    public static final class DefaultImpls {
        @akxr(a = "DELETE", c = true)
        @gjg
        @akxu(a = {"__payments_header: dummy"})
        public static /* synthetic */ ajdx deletePaymentMethod$default(PaymentsApiHttpInterface paymentsApiHttpInterface, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = "";
                }
                return paymentsApiHttpInterface.deletePaymentMethod(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deletePaymentMethod");
        }

        @akxr(a = "DELETE", c = true)
        @gjg
        @akxu(a = {"__payments_header: dummy"})
        public static /* synthetic */ ajdx removeShippingAddress$default(PaymentsApiHttpInterface paymentsApiHttpInterface, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = "";
                }
                return paymentsApiHttpInterface.removeShippingAddress(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeShippingAddress");
        }
    }

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    @akxu(a = {"__payments_header: dummy"})
    @gjg
    @akxy
    ajdx<akxa<ahir>> createCreditCard(@akxs(a = "Authorization") String str, @akyh String str2, @akxk ahix ahix);

    @akxr(a = "DELETE", c = true)
    @akxu(a = {"__payments_header: dummy"})
    @gjg
    ajdx<akxa<akhw>> deletePaymentMethod(@akxs(a = "Authorization") String str, @akyh String str2, @akxk String str3);

    @akxy(a = "/loq/commerce_mobile_auth")
    ajdx<akxa<agij>> fetchAuthToken(@akxk aedh aedh);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<aggw>> getAccountInfo(@akxs(a = "Authorization") String str, @akyh String str2);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<ahio>> getBraintreeClientToken(@akxs(a = "Authorization") String str, @akyh String str2);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<agip>> getOrder(@akxs(a = "Authorization") String str, @akyh String str2, @akyc(a = "orderId") String str3);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<agit>> getOrderList(@akxs(a = "Authorization") String str, @akyh String str2);

    @akxu(a = {"__payments_header: dummy"})
    @akxp
    ajdx<akxa<ahjg>> getPaymentMethods(@akxs(a = "Authorization") String str, @akyh String str2);

    @akxr(a = "DELETE", c = true)
    @akxu(a = {"__payments_header: dummy"})
    @gjg
    ajdx<akxa<akhw>> removeShippingAddress(@akxs(a = "Authorization") String str, @akyh String str2, @akxk String str3);

    @akxu(a = {"__payments_header: dummy"})
    @gjg
    @akxy
    ajdx<akxa<agjm>> saveShippingAddress(@akxs(a = "Authorization") String str, @akyh String str2, @akxk agjm agjm);

    @akxz
    @akxu(a = {"__payments_header: dummy"})
    @gjg
    ajdx<akxa<aghn>> updateContactInfo(@akxs(a = "Authorization") String str, @akyh String str2, @akxk aghn aghn);

    @akxu(a = {"__payments_header: dummy"})
    @gjg
    @akxy
    ajdx<akxa<ahjl>> updateCreditCard(@akxs(a = "Authorization") String str, @akyh String str2, @akxk ahix ahix);

    @akxz
    @akxu(a = {"__payments_header: dummy"})
    @gjg
    ajdx<akxa<agjm>> updateShippingAddress(@akxs(a = "Authorization") String str, @akyh String str2, @akxk agjm agjm);
}
