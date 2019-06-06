package com.mapbox.services.api.optimizedtrips.v1;

import defpackage.akwh;
import defpackage.akxp;
import defpackage.akxs;
import defpackage.akyc;
import defpackage.akyd;

public interface OptimizedTripsService {
    @akxp(a = "optimized-trips/v1/{user}/{profile}/{coordinates}")
    akwh<Object> getCall(@akxs(a = "User-Agent") String str, @akyc(a = "user") String str2, @akyc(a = "profile") String str3, @akyc(a = "coordinates") String str4, @akyd(a = "access_token") String str5, @akyd(a = "roundtrip") Boolean bool, @akyd(a = "radiuses") String str6, @akyd(a = "bearings") String str7, @akyd(a = "steps") Boolean bool2, @akyd(a = "overview") String str8, @akyd(a = "geometries") String str9, @akyd(a = "annotations") String[] strArr, @akyd(a = "destination") String str10, @akyd(a = "source") String str11, @akyd(a = "language") String str12, @akyd(a = "distributions") String str13);
}
