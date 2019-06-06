package com.snap.shazam.net.api;

import defpackage.ajdx;
import defpackage.akhu;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyc;
import defpackage.wyd;

public interface ShazamHttpInterface {
    @akxu(a = {"Host: api-c.shazam.com", "Content-Type: audio/vnd.shazam.sig", "Accept: */*", "Expect: 100-continue"})
    @akxy(a = "partner/snapchat/{languageLocale}/{countryLocale}/snapchat/web/recognise/{deviceId}/{sessionId}")
    ajdx<wyd> recognitionRequest(@akxs(a = "X-Shazam-Api-Key") String str, @akyc(a = "languageLocale") String str2, @akyc(a = "countryLocale") String str3, @akyc(a = "deviceId") String str4, @akyc(a = "sessionId") String str5, @akxs(a = "Content-Length") int i, @akxk akhu akhu);
}
