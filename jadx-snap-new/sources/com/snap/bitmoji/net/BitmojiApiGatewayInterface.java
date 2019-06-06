package com.snap.bitmoji.net;

import defpackage.ajdx;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.alcc;
import defpackage.alcd;
import defpackage.alce;

public interface BitmojiApiGatewayInterface {
    @akxu(a = {"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy(a = "bitmoji-api/avatar-service/create-avatar-data")
    ajdx<alcd> createAvatarData(@akxs(a = "X-Snap-Access-Token") String str, @akxk alce alce);

    @akxu(a = {"Accept: application/x-protobuf", "Content-Type: text/plain"})
    @akxy(a = "bitmoji-api/avatar-service/get-avatar-data")
    ajdx<akws<alcc>> getAvatarData(@akxs(a = "X-Snap-Access-Token") String str);

    @akxu(a = {"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy(a = "bitmoji-api/avatar-service/update-avatar-data")
    ajdx<alcd> updateAvatarData(@akxs(a = "X-Snap-Access-Token") String str, @akxk alcc alcc);
}
