package com.snap.ui.avatar;

import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;

final class AvatarCache$myUsername$2 extends akcs implements akbk<String> {
    final /* synthetic */ AvatarCache this$0;

    AvatarCache$myUsername$2(AvatarCache avatarCache) {
        this.this$0 = avatarCache;
        super(0);
    }

    public final String invoke() {
        String str = this.this$0.userSession.b;
        if (str == null) {
            akcr.a();
        }
        return str;
    }
}
