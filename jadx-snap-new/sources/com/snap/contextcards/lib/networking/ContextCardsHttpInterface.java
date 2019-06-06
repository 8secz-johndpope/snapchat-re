package com.snap.contextcards.lib.networking;

import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.aleg;
import defpackage.aleh;
import defpackage.alej;
import defpackage.alek;

public interface ContextCardsHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<alek> rpcGetContextCards(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alej alej);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<aleh> rpcGetCta(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk aleg aleg);
}
