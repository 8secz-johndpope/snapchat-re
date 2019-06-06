package com.snap.core.db.column;

import defpackage.ainu;
import defpackage.ajym;
import defpackage.ajyu;
import defpackage.akcr;
import defpackage.akgc;
import defpackage.ppy;
import java.util.List;

public final class ReplyMediaColumnAdapter implements ainu<ReplyMedia, String> {
    public final ReplyMedia decode(String str) {
        if (str != null) {
            List a = akgc.a((CharSequence) str, new String[]{ppy.b}, 0, 6);
            if (a != null) {
                return new ReplyMedia((String) a.get(0), (String) a.get(1), (String) a.get(2), (String) a.get(3));
            }
        }
        String str2 = "";
        return new ReplyMedia(str2, str2, str2, str2);
    }

    public final String encode(ReplyMedia replyMedia) {
        akcr.b(replyMedia, "value");
        return ajyu.a((Iterable) ajym.b((Object[]) new String[]{replyMedia.getId(), replyMedia.getType(), replyMedia.getCryptoKey(), replyMedia.getCryptoIv()}), (CharSequence) ppy.b, null, null, 0, null, null, 62);
    }
}
