package com.snap.ads.network;

import defpackage.ajdx;
import defpackage.cys;
import defpackage.cyt;
import defpackage.igo;

public interface SnapAdsHttpInterface {
    public static final a Companion = a.a;
    public static final String PROTO_ACCEPT_HEADER = "Accept: application/x-protobuf";
    public static final String PROTO_CONTENT_TYPE_HEADER = "Content-Type: application/x-protobuf";

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }
    }

    ajdx<cyt> issueRequest(cys cys, igo igo);
}
