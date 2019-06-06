package com.snap.lenses.app.data;

import defpackage.adzw;
import defpackage.aeqv;
import defpackage.aewm;
import defpackage.ajdx;
import defpackage.akhu;
import defpackage.akhw;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;

public interface LensesHttpInterface {
    @akxy(a = "/lens/v2/load_schedule")
    ajdx<aeqv> fetchLensSchedule(@akxk aewm aewm);

    @akxu(a = {"Accept: application/x-protobuf", "Accept-Encoding: gzip"})
    @akxy(a = "/lens/v2/load_schedule")
    ajdx<adzw> fetchLensScheduleProto(@akxk aewm aewm);

    @akxu(a = {"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy
    ajdx<akws<akhw>> performProtoRequest(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk akhu akhu);
}
