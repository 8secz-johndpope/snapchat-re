package com.snap.map.screen.mapstatus.network;

import defpackage.ajdx;
import defpackage.akcr;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.algl;
import defpackage.alha;
import defpackage.alhb;
import defpackage.alhc;
import defpackage.alhk;
import defpackage.alhl;
import defpackage.alia;
import defpackage.alib;
import defpackage.aljs;
import defpackage.gcy;

public final class MapStatusHttp implements MapStatusHttpInterface {
    private final gcy a;
    private final /* synthetic */ MapStatusHttpInterface b;

    public MapStatusHttp(gcy gcy) {
        akcr.b(gcy, "fsnServiceFactory");
        Object b = gcy.b(MapStatusHttpInterface.class);
        akcr.a(b, "fsnServiceFactory.create…ttpInterface::class.java)");
        this.b = (MapStatusHttpInterface) b;
        this.a = gcy;
    }

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    public final ajdx<akxa<Object>> addCheckin(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk algl algl) {
        akcr.b(str, "token");
        akcr.b(str2, "url");
        akcr.b(algl, "request");
        return this.b.addCheckin(str, str2, algl);
    }

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    public final ajdx<akxa<Object>> deleteCheckin(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alha alha) {
        akcr.b(str, "token");
        akcr.b(str2, "url");
        akcr.b(alha, "request");
        return this.b.deleteCheckin(str, str2, alha);
    }

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    public final ajdx<akxa<alhc>> deleteExplorerStatus(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alhb alhb) {
        akcr.b(str, "token");
        akcr.b(str2, "url");
        akcr.b(alhb, "req");
        return this.b.deleteExplorerStatus(str, str2, alhb);
    }

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    public final ajdx<akxa<alhl>> flagCheckin(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alhk alhk) {
        akcr.b(str, "token");
        akcr.b(str2, "url");
        akcr.b(alhk, "request");
        return this.b.flagCheckin(str, str2, alhk);
    }

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    public final ajdx<akxa<alib>> getCheckinOptions(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alia alia) {
        akcr.b(str, "token");
        akcr.b(str2, "url");
        akcr.b(alia, "request");
        return this.b.getCheckinOptions(str, str2, alia);
    }

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    public final ajdx<akxa<Object>> onboardingComplete(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk aljs aljs) {
        akcr.b(str, "token");
        akcr.b(str2, "url");
        akcr.b(aljs, "request");
        return this.b.onboardingComplete(str, str2, aljs);
    }
}
