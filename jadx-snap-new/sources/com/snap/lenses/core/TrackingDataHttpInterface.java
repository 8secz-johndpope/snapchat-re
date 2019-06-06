package com.snap.lenses.core;

import defpackage.aedh;
import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxk;
import defpackage.akxy;
import defpackage.akyd;

public interface TrackingDataHttpInterface {

    public static final class DefaultImpls {
        @akxy(a = "/static/on_demand")
        public static /* synthetic */ ajdx trackingDataResource$default(TrackingDataHttpInterface trackingDataHttpInterface, String str, aedh aedh, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    aedh = new aedh();
                }
                return trackingDataHttpInterface.trackingDataResource(str, aedh);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackingDataResource");
        }
    }

    @akxy(a = "/static/on_demand")
    ajdx<akhw> trackingDataResource(@akyd(a = "resource") String str, @akxk aedh aedh);
}
