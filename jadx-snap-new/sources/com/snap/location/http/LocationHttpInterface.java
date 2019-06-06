package com.snap.location.http;

import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxt;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.alge;
import defpackage.algo;
import defpackage.algp;
import java.util.HashMap;

public interface LocationHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<akxa<algp>> batchLocation(@akxt HashMap<String, String> hashMap, @akyh String str, @akxk algo algo);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/location/clear_history")
    ajdx<akxa<Object>> clearLocation(@akxk alge alge);
}
