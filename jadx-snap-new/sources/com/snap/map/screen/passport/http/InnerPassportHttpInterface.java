package com.snap.map.screen.passport.http;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.alko;
import defpackage.alkp;
import defpackage.alkq;
import defpackage.alkr;
import defpackage.alks;
import defpackage.alkt;
import defpackage.alku;
import defpackage.alkv;
import defpackage.alkw;
import defpackage.alkx;

public interface InnerPassportHttpInterface {
    public static final a Companion = a.a;
    public static final String PASSPORT_BASE_URL = "https://ps-lb.sc-jpl.com";
    public static final String PATH_DELETE_PASSPORT = "/rpc/deleteMyPassport";
    public static final String PATH_DELETE_PASSPORT_ENTRY = "/rpc/deleteMyPassportEntry";
    public static final String PATH_GET_PASSPORT = "/rpc/getMyPassport";
    public static final String PATH_GET_PASSPORT_CITIES = "/rpc/getMyPassportCities";
    public static final String PATH_GET_PASSPORT_COUNTRIES = "/rpc/getMyPassportCountries";
    public static final String PATH_GET_PASSPORT_PLACES = "/rpc/getMyPassportPlaces";

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    @akxy
    ajdx<akxa<Object>> deletePassport(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alkp alkp);

    @akxy
    ajdx<akxa<Object>> deletePassportEntry(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alko alko);

    @akxy
    ajdx<akxa<alkx>> getMyPassport(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alkw alkw);

    @akxy
    ajdx<akxa<alkr>> getMyPassportCities(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alkq alkq);

    @akxy
    ajdx<akxa<alkt>> getMyPassportCountries(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alks alks);

    @akxy
    ajdx<akxa<alkv>> getMyPassportPlaces(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alku alku);
}
