package com.snap.venues.core.network;

import com.snap.venues.api.network.VenuesHttpInterface;
import defpackage.ajdx;
import defpackage.ajsn;
import defpackage.ajvo;
import defpackage.akcr;
import defpackage.akxa;
import defpackage.alhk;
import defpackage.alhl;
import defpackage.alia;
import defpackage.alib;

public final class NoopVenuesHttpInterface implements VenuesHttpInterface {
    public final ajdx<akxa<alhl>> flagCheckinOption(String str, String str2, alhk alhk) {
        akcr.b(str, "token");
        akcr.b(str2, "url");
        akcr.b(alhk, "request");
        Object a = ajvo.a(ajsn.a);
        akcr.a(a, "Single.never()");
        return a;
    }

    public final ajdx<akxa<alib>> getCheckinOptions(String str, String str2, alia alia) {
        akcr.b(str, "token");
        akcr.b(str2, "url");
        akcr.b(alia, "request");
        Object a = ajvo.a(ajsn.a);
        akcr.a(a, "Single.never()");
        return a;
    }
}
