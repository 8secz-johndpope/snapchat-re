package com.snap.map.screen.mapstatus.network;

import defpackage.ajdx;
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

public interface MapStatusHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<Object>> addCheckin(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk algl algl);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<Object>> deleteCheckin(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alha alha);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alhc>> deleteExplorerStatus(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alhb alhb);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alhl>> flagCheckin(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alhk alhk);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alib>> getCheckinOptions(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alia alia);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<Object>> onboardingComplete(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk aljs aljs);
}
