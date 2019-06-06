package com.snapchat.maps.api.locationsharing;

import defpackage.ajdx;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.algq;
import defpackage.algr;
import defpackage.aljj;
import defpackage.sat;

public interface LocationRequestHttpInterface {
    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/map/location_request/can_request")
    ajdx<sat<algr>> getCanRequestLocation(@akxk algq algq);

    @akxu(a = {"__authorization: user", "Accept: application/x-protobuf"})
    @akxy(a = "/map/location_request/feedback")
    ajdx<sat<Object>> postRequestLocationFeedback(@akxk aljj aljj);
}
