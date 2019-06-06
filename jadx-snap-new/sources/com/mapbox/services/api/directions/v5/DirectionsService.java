package com.mapbox.services.api.directions.v5;

import defpackage.akwh;
import defpackage.akxp;
import defpackage.akxs;
import defpackage.akyc;
import defpackage.akyd;

public interface DirectionsService {
    @akxp(a = "directions/v5/{user}/{profile}/{coordinates}")
    akwh<Object> getCall(@akxs(a = "User-Agent") String str, @akyc(a = "user") String str2, @akyc(a = "profile") String str3, @akyc(a = "coordinates") String str4, @akyd(a = "access_token") String str5, @akyd(a = "alternatives") Boolean bool, @akyd(a = "geometries") String str6, @akyd(a = "overview") String str7, @akyd(a = "radiuses") String str8, @akyd(a = "steps") Boolean bool2, @akyd(a = "bearings") String str9, @akyd(a = "continue_straight") Boolean bool3, @akyd(a = "annotations") String str10, @akyd(a = "language") String str11, @akyd(a = "roundabout_exits") Boolean bool4);
}
