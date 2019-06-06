package com.snap.blizzard.v1.request;

import defpackage.ajdx;
import defpackage.akws;
import defpackage.akxk;
import defpackage.akxs;
import defpackage.akxy;
import defpackage.akyh;
import java.util.List;
import java.util.Map;

public interface BlizzardRequestInterface {
    @akxy
    ajdx<akws<Void>> uploadEvents(@akyh String str, @akxs(a = "BlizzardToken") String str2, @akxs(a = "Blizzard-Config-Version") String str3, @akxk List<Map<String, Object>> list);
}
