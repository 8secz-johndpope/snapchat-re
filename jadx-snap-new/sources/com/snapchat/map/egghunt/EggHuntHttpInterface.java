package com.snapchat.map.egghunt;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.algi;
import defpackage.algj;
import defpackage.alic;
import defpackage.alid;
import defpackage.alie;
import defpackage.alif;

public interface EggHuntHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<algj>> rpcAcquireGameMarker(@akyh String str, @akxk algi algi, @akxs(a = "__xsc_local__snap_token") String str2);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alif>> rpcClearUserMarkers(@akyh String str, @akxk alic alic, @akxs(a = "__xsc_local__snap_token") String str2);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alid>> rpcGetCurrentGameState(@akyh String str, @akxk alic alic, @akxs(a = "__xsc_local__snap_token") String str2);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<alif>> rpcGetCurrentUserGameMarkers(@akyh String str, @akxk alie alie, @akxs(a = "__xsc_local__snap_token") String str2);
}
