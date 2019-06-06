package com.snap.venues.api.network;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.alhk;
import defpackage.alhl;
import defpackage.alia;
import defpackage.alib;

public interface VenuesHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alhl>> flagCheckinOption(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alhk alhk);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alib>> getCheckinOptions(@akxs(a = "__xsc_local__snap_token") String str, @akyh String str2, @akxk alia alia);
}
