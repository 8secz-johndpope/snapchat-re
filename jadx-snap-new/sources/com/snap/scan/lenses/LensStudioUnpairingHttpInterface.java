package com.snap.scan.lenses;

import defpackage.aedh;
import defpackage.ajcx;
import defpackage.akxk;
import defpackage.akxy;

public interface LensStudioUnpairingHttpInterface {

    public static final class DefaultImpls {
        @akxy(a = "/studio3d/unregister")
        public static /* synthetic */ ajcx unpair$default(LensStudioUnpairingHttpInterface lensStudioUnpairingHttpInterface, aedh aedh, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    aedh = new aedh();
                }
                return lensStudioUnpairingHttpInterface.unpair(aedh);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unpair");
        }
    }

    @akxy(a = "/studio3d/unregister")
    ajcx unpair(@akxk aedh aedh);
}
