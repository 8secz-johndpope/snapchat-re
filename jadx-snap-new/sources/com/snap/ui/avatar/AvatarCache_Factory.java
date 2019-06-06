package com.snap.ui.avatar;

import com.snap.core.db.api.SnapDb;
import defpackage.abkq;
import defpackage.aipn;
import defpackage.aiqb;
import defpackage.aiqc;
import defpackage.ajwy;

public final class AvatarCache_Factory implements aiqc<AvatarCache> {
    private final ajwy<SnapDb> snapDbLazyProvider;
    private final ajwy<abkq> userSessionProvider;

    public AvatarCache_Factory(ajwy<abkq> ajwy, ajwy<SnapDb> ajwy2) {
        this.userSessionProvider = ajwy;
        this.snapDbLazyProvider = ajwy2;
    }

    public static AvatarCache_Factory create(ajwy<abkq> ajwy, ajwy<SnapDb> ajwy2) {
        return new AvatarCache_Factory(ajwy, ajwy2);
    }

    public static AvatarCache newAvatarCache(abkq abkq, aipn<SnapDb> aipn) {
        return new AvatarCache(abkq, aipn);
    }

    public static AvatarCache provideInstance(ajwy<abkq> ajwy, ajwy<SnapDb> ajwy2) {
        return new AvatarCache((abkq) ajwy.get(), aiqb.b(ajwy2));
    }

    public final AvatarCache get() {
        return provideInstance(this.userSessionProvider, this.snapDbLazyProvider);
    }
}
