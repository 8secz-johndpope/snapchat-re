package com.snap.bitmoji.net;

import defpackage.ajdx;
import defpackage.akhw;
import defpackage.akxp;
import defpackage.akyc;
import defpackage.akye;
import java.util.Map;

public interface BitmojiHttpInterface {
    @akxp(a = "/render/panel/{comicId}-{avatarId}-v1.{imageType}")
    ajdx<akhw> getSingleBitmoji(@akyc(a = "comicId") String str, @akyc(a = "avatarId") String str2, @akyc(a = "imageType") String str3, @akye Map<String, String> map);
}
