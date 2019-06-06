package com.snap.identity;

import defpackage.aedh;
import defpackage.aerr;
import defpackage.aert;
import defpackage.afvp;
import defpackage.afvr;
import defpackage.afvt;
import defpackage.agxo;
import defpackage.agxq;
import defpackage.agzy;
import defpackage.ahaa;
import defpackage.ahac;
import defpackage.ahao;
import defpackage.ahch;
import defpackage.ahcj;
import defpackage.ajcx;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.gjg;

public interface AuthHttpInterface {
    public static final String PATH_LOGIN = "/scauth/login";
    public static final String PATH_ONE_TAP_LOGIN = "/scauth/otp/login";

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/scauth/change_password")
    ajdx<akxa<ahao>> changePasswordInApp(@akxk agxq agxq);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/scauth/change_password_pre_login")
    ajdx<akxa<ahao>> changePasswordPreLogin(@akxk agxo agxo);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/scauth/get_password_strength_pre_login")
    ajdx<ahac> changePasswordPreLogin(@akxk agzy agzy);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/scauth/get_password_strength")
    ajdx<ahac> getPasswordStrengthInApp(@akxk ahaa ahaa);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/scauth/login")
    ajdx<akxa<aert>> login(@akxk aerr aerr);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/scauth/droid/logout")
    ajcx logout(@akxk aedh aedh);

    @akxu(a = {"__authorization: user"})
    @gjg
    @akxy(a = "/scauth/otp/droid/logout")
    ajdx<afvt> logoutAndFetchToken(@akxk afvr afvr);

    @akxu(a = {"__authorization: content"})
    @akxy(a = "/scauth/otp/login")
    ajdx<akxa<aert>> oneTapLogin(@akxk afvp afvp);

    @akxu(a = {"__authorization: user"})
    @akxy(a = "/scauth/reauth")
    ajdx<akxa<ahcj>> reauth(@akxk ahch ahch);
}
