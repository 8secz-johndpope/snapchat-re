package com.snap.map.screen.passport.http;

import defpackage.ajdx;
import defpackage.akcr;
import defpackage.akxa;
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
import defpackage.wjd;

public final class PassportHttpInterface {
    private final InnerPassportHttpInterface inner;
    private final String scope = wjd.EXPLORE.a();

    public PassportHttpInterface(InnerPassportHttpInterface innerPassportHttpInterface) {
        akcr.b(innerPassportHttpInterface, "inner");
        this.inner = innerPassportHttpInterface;
    }

    private final String getUrl(String str) {
        return InnerPassportHttpInterface.PASSPORT_BASE_URL.concat(String.valueOf(str));
    }

    public final ajdx<akxa<Object>> deletePassport(alkp alkp) {
        akcr.b(alkp, "request");
        InnerPassportHttpInterface innerPassportHttpInterface = this.inner;
        Object obj = this.scope;
        akcr.a(obj, "scope");
        return innerPassportHttpInterface.deletePassport(obj, getUrl(InnerPassportHttpInterface.PATH_DELETE_PASSPORT), alkp);
    }

    public final ajdx<akxa<Object>> deletePassportEntry(alko alko) {
        akcr.b(alko, "request");
        InnerPassportHttpInterface innerPassportHttpInterface = this.inner;
        Object obj = this.scope;
        akcr.a(obj, "scope");
        return innerPassportHttpInterface.deletePassportEntry(obj, getUrl(InnerPassportHttpInterface.PATH_DELETE_PASSPORT_ENTRY), alko);
    }

    public final ajdx<akxa<alkx>> getMyPassport(alkw alkw) {
        akcr.b(alkw, "request");
        InnerPassportHttpInterface innerPassportHttpInterface = this.inner;
        Object obj = this.scope;
        akcr.a(obj, "scope");
        return innerPassportHttpInterface.getMyPassport(obj, getUrl(InnerPassportHttpInterface.PATH_GET_PASSPORT), alkw);
    }

    public final ajdx<akxa<alkr>> getMyPassportCities(alkq alkq) {
        akcr.b(alkq, "request");
        InnerPassportHttpInterface innerPassportHttpInterface = this.inner;
        Object obj = this.scope;
        akcr.a(obj, "scope");
        return innerPassportHttpInterface.getMyPassportCities(obj, getUrl(InnerPassportHttpInterface.PATH_GET_PASSPORT_CITIES), alkq);
    }

    public final ajdx<akxa<alkt>> getMyPassportCountries(alks alks) {
        akcr.b(alks, "request");
        InnerPassportHttpInterface innerPassportHttpInterface = this.inner;
        Object obj = this.scope;
        akcr.a(obj, "scope");
        return innerPassportHttpInterface.getMyPassportCountries(obj, getUrl(InnerPassportHttpInterface.PATH_GET_PASSPORT_COUNTRIES), alks);
    }

    public final ajdx<akxa<alkv>> getMyPassportPlaces(alku alku) {
        akcr.b(alku, "request");
        InnerPassportHttpInterface innerPassportHttpInterface = this.inner;
        Object obj = this.scope;
        akcr.a(obj, "scope");
        return innerPassportHttpInterface.getMyPassportPlaces(obj, getUrl(InnerPassportHttpInterface.PATH_GET_PASSPORT_PLACES), alku);
    }
}
