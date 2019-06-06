package com.snap.ads.core.lib.network;

import defpackage.ajdx;
import defpackage.akhu;
import defpackage.akhw;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxp;
import defpackage.akxt;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import java.util.Map;

public interface AdRequestHttpInterface {
    @akxp
    ajdx<akws<akhw>> issueGetRequest(@akyh String str, @akxt Map<String, String> map);

    @akxu(a = {"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy
    ajdx<akws<akhw>> issueProtoRequest(@akyh String str, @akxt Map<String, String> map, @akxk akhu akhu);
}
