package com.snap.blizzard.v2.request;

import defpackage.ajdx;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxy;
import defpackage.akyh;
import java.io.File;

public interface BlizzardRequestInterface {
    @akxy
    ajdx<akws<Void>> uploadFile(@akyh String str, @akxs(a = "BlizzardToken") String str2, @akxs(a = "Blizzard-Config-Version") String str3, @akxk File file);
}
