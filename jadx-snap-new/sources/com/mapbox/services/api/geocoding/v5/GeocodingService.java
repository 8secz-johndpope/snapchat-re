package com.mapbox.services.api.geocoding.v5;

import defpackage.akwh;
import defpackage.akxp;
import defpackage.akxs;
import defpackage.akyc;
import defpackage.akyd;
import java.util.List;

public interface GeocodingService {
    @akxp(a = "/geocoding/v5/{mode}/{query}.json")
    akwh<List<Object>> getBatchCall(@akxs(a = "User-Agent") String str, @akyc(a = "mode") String str2, @akyc(a = "query") String str3, @akyd(a = "access_token") String str4, @akyd(a = "country") String str5, @akyd(a = "proximity") String str6, @akyd(a = "types") String str7, @akyd(a = "autocomplete") Boolean bool, @akyd(a = "bbox") String str8, @akyd(a = "limit") String str9, @akyd(a = "language") String str10);

    @akxp(a = "/geocoding/v5/{mode}/{query}.json")
    akwh<Object> getCall(@akxs(a = "User-Agent") String str, @akyc(a = "mode") String str2, @akyc(a = "query") String str3, @akyd(a = "access_token") String str4, @akyd(a = "country") String str5, @akyd(a = "proximity") String str6, @akyd(a = "types") String str7, @akyd(a = "autocomplete") Boolean bool, @akyd(a = "bbox") String str8, @akyd(a = "limit") String str9, @akyd(a = "language") String str10);
}
