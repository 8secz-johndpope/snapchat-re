package com.snap.lenses.app.geo;

import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.alse;
import defpackage.alsf;

public interface GeoDataHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy
    ajdx<alsf> getWeatherData(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alse alse);
}
