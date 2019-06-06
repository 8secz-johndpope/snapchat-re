package com.snap.security;

import defpackage.aedh;
import defpackage.aenu;
import defpackage.affm;
import defpackage.ahsn;
import defpackage.ahsp;
import defpackage.ahsr;
import defpackage.ajdx;
import defpackage.akwh;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxu;
import defpackage.akxy;

public interface SecurityHttpInterface {
    @akxu(a = {"__authorization: user"})
    @akxy(a = "/safe/check_url")
    akwh<ahsp> checkUrlAgainstSafeBrowsing(@akxk ahsn ahsn);

    @akxy(a = "/loq/device_id")
    ajdx<aenu> getDeviceToken(@akxk aedh aedh);

    @akxy(a = "/bq/get_upload_urls")
    ajdx<akxa<affm>> getUploadUrls(@akxk aedh aedh);

    @akxy(a = "/loq/attestation")
    ajdx<Void> safetyNetAuthorization(@akxk ahsr ahsr);
}
