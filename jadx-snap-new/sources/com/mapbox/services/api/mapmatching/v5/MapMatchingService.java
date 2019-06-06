package com.mapbox.services.api.mapmatching.v5;

import defpackage.akwh;
import defpackage.akxp;
import defpackage.akxs;
import defpackage.akyc;
import defpackage.akyd;

public interface MapMatchingService {
    @akxp(a = "matching/v5/{user}/{profile}/{coordinates}")
    akwh<Object> getCall(@akxs(a = "User-Agent") String str, @akyc(a = "user") String str2, @akyc(a = "profile") String str3, @akyc(a = "coordinates") String str4, @akyd(a = "access_token") String str5, @akyd(a = "geometries") String str6, @akyd(a = "radiuses") String str7, @akyd(a = "steps") Boolean bool, @akyd(a = "overview") String str8, @akyd(a = "timestamps") String str9, @akyd(a = "annotations") String str10, @akyd(a = "language") String str11);
}
