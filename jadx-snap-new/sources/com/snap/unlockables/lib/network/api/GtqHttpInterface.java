package com.snap.unlockables.lib.network.api;

import defpackage.aebf;
import defpackage.ajdx;
import defpackage.ajyx;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxt;
import defpackage.akxu;
import defpackage.akxy;
import defpackage.akyh;
import defpackage.alrt;
import defpackage.alsa;
import java.util.Map;

public interface GtqHttpInterface {

    public static final class DefaultImpls {
        @akxu(a = {"__authorization: content", "Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
        @akxy
        public static /* synthetic */ ajdx fetchUnlockables$default(GtqHttpInterface gtqHttpInterface, String str, String str2, Map map, alrt alrt, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    map = ajyx.a;
                }
                return gtqHttpInterface.fetchUnlockables(str, str2, map, alrt);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchUnlockables");
        }
    }

    @akxu(a = {"__authorization: content", "Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy
    ajdx<akws<aebf>> fetchUnlockables(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxt Map<String, String> map, @akxk alrt alrt);

    @akxu(a = {"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy
    ajdx<akws<Void>> trackUnlockableCreation(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alsa alsa);

    @akxu(a = {"Accept: application/x-protobuf", "Content-Type: application/x-protobuf"})
    @akxy
    ajdx<akws<Void>> trackUnlockableView(@akyh String str, @akxs(a = "__xsc_local__snap_token") String str2, @akxk alsa alsa);
}
