package com.mapbox.services.api.directionsmatrix.v1;

import defpackage.akwh;
import defpackage.akxp;
import defpackage.akxs;
import defpackage.akyc;
import defpackage.akyd;

public interface DirectionsMatrixService {
    @akxp(a = "directions-matrix/v1/{user}/{profile}/{coordinates}")
    akwh<Object> getCall(@akxs(a = "User-Agent") String str, @akyc(a = "user") String str2, @akyc(a = "profile") String str3, @akyc(a = "coordinates") String str4, @akyd(a = "access_token") String str5, @akyd(a = "destinations") String str6, @akyd(a = "sources") String str7);
}
