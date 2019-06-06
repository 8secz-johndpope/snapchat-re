package com.snap.discover.playback.network;

import defpackage.agmo;
import defpackage.ajdx;
import defpackage.akws;
import defpackage.akxp;
import defpackage.akyd;
import defpackage.akyh;

public interface DiscoverPlaybackHttpInterface {
    @akxp
    ajdx<akws<agmo>> fetchAdRemoteVideoProperties(@akyh String str, @akyd(a = "videoId") String str2, @akyd(a = "platform") String str3, @akyd(a = "quality") String str4);

    @akxp
    ajdx<akws<agmo>> fetchRemoteVideoProperties(@akyh String str, @akyd(a = "edition") String str2, @akyd(a = "platform") String str3, @akyd(a = "quality") String str4);
}
