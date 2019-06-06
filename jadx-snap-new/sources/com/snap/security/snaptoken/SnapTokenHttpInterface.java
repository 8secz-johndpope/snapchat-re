package com.snap.security.snaptoken;

import defpackage.aeap;
import defpackage.aeaq;
import defpackage.aear;
import defpackage.aeas;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;

public interface SnapTokenHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy(a = "/snap_token/pb/snap_session")
    ajdx<akxa<aeas>> fetchSessionRequest(@akxk aear aear);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy(a = "/snap_token/pb/snap_access_tokens")
    ajdx<akxa<aeaq>> fetchSnapAccessTokens(@akxk aeap aeap);
}
