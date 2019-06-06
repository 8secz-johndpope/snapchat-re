package com.snap.location.map;

import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.alhd;
import defpackage.alhe;
import defpackage.alja;
import defpackage.aljb;
import defpackage.alkd;
import defpackage.alke;

public interface SharingPreferenceHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/map/delete_location_preferences")
    ajdx<alhe> deleteLocationSharingSettings(@akxk alhd alhd);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/map/get_location_preferences")
    ajdx<aljb> getLocationSharingSettings(@akxk alja alja);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/map/set_location_preferences")
    ajdx<alke> setLocationSharingSettings(@akxk alkd alkd);
}
